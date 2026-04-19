import java.io.*;
import java.util.*;
import java.util.zip.*;
import java.nio.file.*;

public class FinalSurgicalMerger {
    public static void main(String[] args) throws Exception {
        File baseApk = new File("D:/Ideas/Antigravity/Notes/apks_extracted/base.apk");
        File outputApk = new File("D:/Ideas/Antigravity/Notes/Notes_Standalone_Master.apk");
        
        ZipInputStream zin = new ZipInputStream(new FileInputStream(baseApk));
        ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(outputApk));
        
        Set<String> replaced = new HashSet<>(Arrays.asList("classes.dex", "classes2.dex", "AndroidManifest.xml"));
        
        ZipEntry entry = zin.getNextEntry();
        while (entry != null) {
            if (!replaced.contains(entry.getName())) {
                zout.putNextEntry(new ZipEntry(entry.getName()));
                byte[] buf = new byte[1024];
                int len;
                while ((len = zin.read(buf)) > 0) {
                    zout.write(buf, 0, len);
                }
                zout.closeEntry();
            }
            entry = zin.getNextEntry();
        }
        zin.close();

        addFile(zout, "D:/Ideas/Antigravity/Notes/new_dex/classes.dex", "classes.dex");
        addFile(zout, "D:/Ideas/Antigravity/Notes/new_dex/classes2.dex", "classes2.dex");
        addFile(zout, "D:/Ideas/Antigravity/Notes/AndroidManifest.bin", "AndroidManifest.xml");

        addSplitFiles(zout, "D:/Ideas/Antigravity/Notes/apks_extracted/split_config.arm64_v8a.apk", "lib/");
        addSplitFiles(zout, "D:/Ideas/Antigravity/Notes/apks_extracted/split_config.xxhdpi.apk", "res/");
        String[] langs = {"bn", "en", "gu", "hi", "kn", "mr", "ta", "te"};
        for (String lang : langs) {
            addSplitFiles(zout, "D:/Ideas/Antigravity/Notes/apks_extracted/split_config." + lang + ".apk", "res/");
        }

        zout.close();
        System.out.println("Surgical Master Merge Complete.");
    }

    private static void addFile(ZipOutputStream zout, String srcPath, String entryName) throws IOException {
        zout.putNextEntry(new ZipEntry(entryName));
        zout.write(Files.readAllBytes(Paths.get(srcPath)));
        zout.closeEntry();
    }

    private static void addSplitFiles(ZipOutputStream zout, String splitPath, String prefix) throws IOException {
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(splitPath))) {
            ZipEntry entry;
            while ((entry = zin.getNextEntry()) != null) {
                if (entry.getName().startsWith(prefix)) {
                    try {
                        zout.putNextEntry(new ZipEntry(entry.getName()));
                        byte[] buf = new byte[1024];
                        int len;
                        while ((len = zin.read(buf)) > 0) {
                            zout.write(buf, 0, len);
                        }
                        zout.closeEntry();
                    } catch (ZipException e) {
                    }
                }
                zin.closeEntry();
            }
        }
    }
}