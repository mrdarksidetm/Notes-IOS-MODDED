import java.io.*;
import java.util.zip.*;
import java.util.*;

public class SplitFixer {
    public static void main(String[] args) throws Exception {
        File dir = new File("D:/Ideas/Antigravity/Notes/apks_extracted");
        File dest = new File("D:/Ideas/Antigravity/Notes/fixed_splits");
        dest.mkdirs();
        
        for (File f : dir.listFiles()) {
            if (!f.getName().endsWith(".apk")) continue;
            
            File output = new File(dest, f.getName());
            try (ZipInputStream zis = new ZipInputStream(new FileInputStream(f));
                 ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(output))) {
                
                ZipEntry entry;
                while ((entry = zis.getNextEntry()) != null) {
                    byte[] data = readAll(zis);
                    ZipEntry newEntry = new ZipEntry(entry.getName());
                    
                    // FORCE resources.arsc and native libs to be STORED (uncompressed)
                    if (entry.getName().equals("resources.arsc") || entry.getName().startsWith("lib/")) {
                        newEntry.setMethod(ZipEntry.STORED);
                        newEntry.setSize(data.length);
                        CRC32 crc = new CRC32();
                        crc.update(data);
                        newEntry.setCrc(crc.getValue());
                    } else {
                        newEntry.setMethod(ZipEntry.DEFLATED);
                    }
                    
                    try {
                        zos.putNextEntry(newEntry);
                        zos.write(data);
                        zos.closeEntry();
                    } catch (ZipException e) {
                        // Skip duplicates
                    }
                }
            }
            System.out.println("Fixed: " + f.getName());
        }
    }

    private static byte[] readAll(InputStream is) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int len;
        while ((len = is.read(buf)) > 0) bos.write(buf, 0, len);
        return bos.toByteArray();
    }
}