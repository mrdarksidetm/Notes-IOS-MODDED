import java.io.*;
import java.util.*;
import java.util.zip.*;
import java.nio.file.*;

public class FinalBasePatcher {
    public static void main(String[] args) throws Exception {
        File baseApk = new File("D:/Ideas/Antigravity/Notes/apks_extracted/base.apk");
        File outputApk = new File("D:/Ideas/Antigravity/Notes/final_stable.apk");
        
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(baseApk));
             ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(outputApk))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                String name = entry.getName();
                if (name.equals("classes.dex") || name.equals("classes2.dex")) {
                    zis.closeEntry();
                    continue;
                }
                ZipEntry newEntry = new ZipEntry(name);
                if (entry.getMethod() == ZipEntry.STORED) {
                    newEntry.setMethod(ZipEntry.STORED);
                    newEntry.setSize(entry.getSize());
                    newEntry.setCrc(entry.getCrc());
                }
                zos.putNextEntry(newEntry);
                byte[] b = new byte[1024];
                int l;
                while ((l = zis.read(b)) > 0) zos.write(b, 0, l);
                zos.closeEntry();
                zis.closeEntry();
            }
            add(zos, "D:/Ideas/Antigravity/Notes/new_dex/classes.dex", "classes.dex");
            add(zos, "D:/Ideas/Antigravity/Notes/new_dex/classes2.dex", "classes2.dex");
        }
        System.out.println("Base Patched Successfully.");
    }
    private static void add(ZipOutputStream z, String p, String n) throws IOException {
        z.putNextEntry(new ZipEntry(n));
        z.write(Files.readAllBytes(Paths.get(p)));
        z.closeEntry();
    }
}