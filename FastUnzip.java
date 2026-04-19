import java.io.*;
import java.util.zip.*;

public class FastUnzip {
    public static void main(String[] args) throws Exception {
        String input = args.length > 0 ? args[0] : "temp_build.apk";
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("D:/Ideas/Antigravity/Notes/" + input))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                File file = new File("D:/Ideas/Antigravity/Notes/new_dex", entry.getName());
                if (entry.isDirectory()) { file.mkdirs(); }
                else {
                    file.getParentFile().mkdirs();
                    try (FileOutputStream fos = new FileOutputStream(file)) {
                        byte[] buf = new byte[1024];
                        int len;
                        while ((len = zis.read(buf)) > 0) { fos.write(buf, 0, len); }
                    }
                }
                zis.closeEntry();
            }
        }
    }
}