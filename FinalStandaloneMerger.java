import java.io.*;
import java.util.*;
import java.util.zip.*;
import java.nio.file.*;

public class FinalStandaloneMerger {
    public static void main(String[] args) throws Exception {
        File baseApk = new File("D:/Ideas/Antigravity/Notes/apks_extracted/base.apk");
        File outputApk = new File("D:/Ideas/Antigravity/Notes/MASTER_MASTER_FINAL.apk");
        
        ZipInputStream zin = new ZipInputStream(new FileInputStream(baseApk));
        ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(outputApk));
        
        // We will keep the ORIGINAL manifest and original resources.arsc
        // But we will MERGE all other resources and libs
        Set<String> replaced = new HashSet<>(Arrays.asList("classes.dex", "classes2.dex"));
        
        ZipEntry entry = zin.getNextEntry();
        while (entry != null) {
            if (!replaced.contains(entry.getName())) {
                ZipEntry newEntry = new ZipEntry(entry.getName());
                if (entry.getMethod() == ZipEntry.STORED) {
                    newEntry.setMethod(ZipEntry.STORED);
                    newEntry.setSize(entry.getSize());
                    newEntry.setCrc(entry.getCrc());
                }
                zout.putNextEntry(newEntry);
                byte[] buf = new byte[1024];
                int len;
                while ((len = zin.read(buf)) > 0) zout.write(buf, 0, len);
                zout.closeEntry();
            }
            entry = zin.getNextEntry();
        }
        zin.close();

        // 1. Patched DEX (Nuclear bypassed)
        addFile(zout, "D:/Ideas/Antigravity/Notes/new_dex/classes.dex", "classes.dex", false);
        addFile(zout, "D:/Ideas/Antigravity/Notes/new_dex/classes2.dex", "classes2.dex", false);
        
        // 2. Add Architecture Libs
        injectSplit(zout, "D:/Ideas/Antigravity/Notes/apks_extracted/split_config.arm64_v8a.apk", "lib/", true);
        
        // 3. Add Resources
        injectSplit(zout, "D:/Ideas/Antigravity/Notes/apks_extracted/split_config.xxhdpi.apk", "res/", false);

        zout.close();
        System.out.println("Merge Complete.");
    }

    private static void addFile(ZipOutputStream zout, String srcPath, String entryName, boolean store) throws IOException {
        byte[] buf = Files.readAllBytes(Paths.get(srcPath));
        ZipEntry entry = new ZipEntry(entryName);
        if (store) {
            entry.setMethod(ZipEntry.STORED);
            entry.setSize(buf.length);
            CRC32 crc = new CRC32();
            crc.update(buf);
            entry.setCrc(crc.getValue());
        }
        zout.putNextEntry(entry);
        zout.write(buf);
        zout.closeEntry();
    }

    private static void injectSplit(ZipOutputStream zout, String splitPath, String prefix, boolean store) throws IOException {
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(splitPath))) {
            ZipEntry entry;
            while ((entry = zin.getNextEntry()) != null) {
                if (entry.getName().startsWith(prefix)) {
                    byte[] buf = readAll(zin);
                    ZipEntry newEntry = new ZipEntry(entry.getName());
                    if (store) {
                        newEntry.setMethod(ZipEntry.STORED);
                        newEntry.setSize(buf.length);
                        CRC32 crc = new CRC32();
                        crc.update(buf);
                        newEntry.setCrc(crc.getValue());
                    }
                    try {
                        zout.putNextEntry(newEntry);
                        zout.write(buf);
                        zout.closeEntry();
                    } catch (ZipException e) {}
                }
                zin.closeEntry();
            }
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