import java.io.*;
import java.util.zip.*;
import java.nio.file.*;

public class BinaryManifestPatcher {
    public static void main(String[] args) throws Exception {
        byte[] manifest = null;
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("D:/Ideas/Antigravity/Notes/apks_extracted/base.apk"))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                if (entry.getName().equals("AndroidManifest.xml")) {
                    ByteArrayOutputStream bos = new byteOutputStream();
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = zis.read(buf)) > 0) bos.write(buf, 0, len);
                    manifest = bos.toByteArray();
                    break;
                }
            }
        }
        
        if (manifest == null) return;
        
        String[] targets = {"base__abi,base__density", "com.inotesapp.inotes"};
        // We won't rename package here, just remove splits
        String target = "base__abi,base__density";
        byte[] targetBytes = target.getBytes("UTF-16LE"); // Binary XML uses UTF-16LE for strings
        
        int count = 0;
        for (int i = 0; i < manifest.length - targetBytes.length; i++) {
            boolean match = true;
            for (int j = 0; j < targetBytes.length; j++) {
                if (manifest[i+j] != targetBytes[j]) { match = false; break; }
            }
            if (match) {
                for (int j = 0; j < targetBytes.length; j++) manifest[i+j] = 0;
                count++;
            }
        }
        System.out.println("Patched " + count + " occurrences of splits requirement.");
        Files.write(Paths.get("D:/Ideas/Antigravity/Notes/AndroidManifest.bin"), manifest);
    }
    
    static class byteOutputStream extends ByteArrayOutputStream {}
}