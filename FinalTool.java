import java.io.*;
import java.util.*;
import java.util.zip.*;
import java.nio.file.*;

public class FinalTool {
    public static void main(String[] args) throws Exception {
        String base = "D:/Ideas/Antigravity/Notes/apks_extracted/base.apk";
        String out = "D:/Ideas/Antigravity/Notes/final_ready.apk";
        String d1 = "D:/Ideas/Antigravity/Notes/new_dex/classes.dex";
        String d2 = "D:/Ideas/Antigravity/Notes/new_dex/classes2.dex";
        
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(base));
             ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(out))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                if (entry.getName().equals("classes.dex") || entry.getName().equals("classes2.dex")) {
                    zis.closeEntry();
                    continue;
                }
                zos.putNextEntry(new ZipEntry(entry.getName()));
                byte[] b = new byte[1024];
                int l;
                while ((l = zis.read(b)) > 0) zos.write(b, 0, l);
                zos.closeEntry();
                zis.closeEntry();
            }
            // Add new
            add(zos, d1, "classes.dex");
            add(zos, d2, "classes2.dex");
        }
    }
    private static void add(ZipOutputStream z, String p, String n) throws IOException {
        z.putNextEntry(new ZipEntry(n));
        z.write(Files.readAllBytes(Paths.get(p)));
        z.closeEntry();
    }
}