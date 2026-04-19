import java.io.*;
import java.util.zip.*;
import java.nio.file.*;

public class ApksExtractor {
    public static void main(String[] args) throws Exception {
        String apksPath = "D:/Ideas/Antigravity/Notes/Notes_com,inotesapp,inotes_1,1,0.apks";
        String destDir = "D:/Ideas/Antigravity/Notes/apks_extracted";
        new File(destDir).mkdirs();
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(apksPath))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                File file = new File(destDir, entry.getName());
                try (FileOutputStream fos = new FileOutputStream(file)) {
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = zis.read(buf)) > 0) {
                        fos.write(buf, 0, len);
                    }
                }
                zis.closeEntry();
            }
        }
        System.out.println("Extraction Complete.");
    }
}