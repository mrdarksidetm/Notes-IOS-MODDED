import java.io.*;
import java.util.zip.*;

public class ZipLister {
    public static void main(String[] args) throws Exception {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("D:/Ideas/Antigravity/Notes/p_base.apk"))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                System.out.println(entry.getName() + " (" + entry.getSize() + ")");
            }
        }
    }
}