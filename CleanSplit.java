import java.io.*;
import java.util.zip.*;
import java.util.*;

public class CleanSplit {
    public static void main(String[] args) throws Exception {
        File src = new File("D:/Ideas/Antigravity/Notes/apks_extracted/split_config.arm64_v8a.apk");
        File dest = new File("D:/Ideas/Antigravity/Notes/no_talsec_split/split_config.arm64_v8a.apk");
        dest.getParentFile().mkdirs();
        
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
             ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                String name = entry.getName();
                // KILL TALSEC NATIVE LIBS
                if (name.contains("libtmlib.so") || name.contains("libsecurity.so")) {
                    zis.closeEntry();
                    continue;
                }
                
                byte[] data = readAll(zis);
                ZipEntry newEntry = new ZipEntry(name);
                if (entry.getMethod() == ZipEntry.STORED) {
                    newEntry.setMethod(ZipEntry.STORED);
                    newEntry.setSize(data.length);
                    CRC32 crc = new CRC32();
                    crc.update(data);
                    newEntry.setCrc(crc.getValue());
                }
                zos.putNextEntry(newEntry);
                zos.write(data);
                zos.closeEntry();
            }
        }
        System.out.println("Talsec Native Libs Nuked.");
    }
    private static byte[] readAll(InputStream is) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int len;
        while ((len = is.read(buf)) > 0) bos.write(buf, 0, len);
        return bos.toByteArray();
    }
}