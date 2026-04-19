import java.io.*;
import java.util.*;
import java.util.zip.*;
import java.nio.file.*;

public class ApkPatcher {
    public static void main(String[] args) throws Exception {
        File apkFile = new File("D:/Ideas/Antigravity/Notes/temp_patch.apk");
        File tempFile = new File("D:/Ideas/Antigravity/Notes/rebuilt_mrdarkside_base_temp.apk");
        
        ZipInputStream zin = new ZipInputStream(new FileInputStream(apkFile));
        ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(tempFile));
        
        ZipEntry entry = zin.getNextEntry();
        while (entry != null) {
            String name = entry.getName();
            if (!name.startsWith("classes") && !name.startsWith("lib/")) {
                ZipEntry newEntry = new ZipEntry(name);
                // If it was stored (uncompressed), we must keep it stored
                if (entry.getMethod() == ZipEntry.STORED) {
                    newEntry.setMethod(ZipEntry.STORED);
                    newEntry.setSize(entry.getSize());
                    newEntry.setCrc(entry.getCrc());
                }
                zout.putNextEntry(newEntry);
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

        // Add patched files (classes are usually deflated, libs can be stored but we'll deflate for size unless required)
        addFile(zout, "D:/Ideas/Antigravity/Notes_Replica/prebuilt/dex/classes.dex", "classes.dex", false);
        addFile(zout, "D:/Ideas/Antigravity/Notes_Replica/prebuilt/dex/classes2.dex", "classes2.dex", false);
        
        String libBase = "D:/Ideas/Antigravity/Notes_Replica/prebuilt/lib/arm64-v8a/";
        String[] libs = {"libapp.so", "libclib.so", "libflutter.so", "libobjectbox-jni.so", "libpbkdf2_native.so", "libpolarssl.so", "libsecurity.so", "libtmlib.so"};
        for (String lib : libs) {
            // Native libs in Flutter should ideally be STORED for faster loading on Android 6+, 
            // but let's stick to default DEFLATED first as it's safer for compatibility 
            // unless we encounter more errors.
            addFile(zout, libBase + lib, "lib/arm64-v8a/" + lib, false);
        }

        zout.close();
        
        if (apkFile.exists()) apkFile.delete();
        tempFile.renameTo(apkFile);
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
        zout.write(buf, 0, buf.length);
        zout.closeEntry();
    }
}
