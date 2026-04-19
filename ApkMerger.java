import java.io.*;
import java.util.zip.*;
import java.nio.file.*;

public class ApkMerger {
    public static void main(String[] args) throws Exception {
        String baseDir = "D:/Ideas/Antigravity/Notes/standalone_source";
        String splitsDir = "D:/Ideas/Antigravity/Notes/apks_extracted";
        
        // Merge arm64 libs
        extractDir(new File(splitsDir, "split_config.arm64_v8a.apk"), "lib/arm64-v8a", baseDir);
        
        // Merge xxhdpi resources
        extractDir(new File(splitsDir, "split_config.xxhdpi.apk"), "res", baseDir);
        
        // Merge language resources
        String[] langs = {"bn", "en", "gu", "hi", "kn", "mr", "ta", "te"};
        for (String lang : langs) {
            extractDir(new File(splitsDir, "split_config." + lang + ".apk"), "res", baseDir);
        }
        
        System.out.println("Merge Complete.");
    }

    private static void extractDir(File zipFile, String subDir, String destDir) throws IOException {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                if (entry.getName().startsWith(subDir)) {
                    File target = new File(destDir, entry.getName());
                    if (entry.isDirectory()) {
                        target.mkdirs();
                    } else {
                        target.getParentFile().mkdirs();
                        try (FileOutputStream fos = new FileOutputStream(target)) {
                            byte[] buf = new byte[1024];
                            int len;
                            while ((len = zis.read(buf)) > 0) {
                                fos.write(buf, 0, len);
                            }
                        }
                    }
                }
                zis.closeEntry();
            }
        }
    }
}