import java.io.*;
import java.nio.file.*;

public class HexManifest {
    public static void main(String[] args) throws Exception {
        byte[] b = Files.readAllBytes(Paths.get("D:/Ideas/Antigravity/Notes/apks_extracted/base.apk"));
        // This is not efficient, but let's find AndroidManifest.xml in the zip
        // I already extracted it to AndroidManifest.bin earlier
        byte[] m = Files.readAllBytes(Paths.get("D:/Ideas/Antigravity/Notes/AndroidManifest.bin"));
        
        // Find split attributes
        // "requiredSplitTypes" is a string in the string pool.
        // We can just corrupt the string name to something else.
        patch(m, "requiredSplitTypes", "disabledSplits___");
        patch(m, "splitTypes", "dummyTypes");
        patch(m, "isSplitRequired", "notRequiredAtAll");
        
        Files.write(Paths.get("D:/Ideas/Antigravity/Notes/AndroidManifest_Patched.bin"), m);
    }
    private static void patch(byte[] m, String target, String replacement) throws Exception {
        byte[] t = target.getBytes("UTF-16LE");
        byte[] r = replacement.getBytes("UTF-16LE");
        for (int i = 0; i < m.length - t.length; i++) {
            boolean match = true;
            for (int j = 0; j < t.length; j++) if (m[i+j] != t[j]) { match = false; break; }
            if (match) {
                System.arraycopy(r, 0, m, i, r.length);
                System.out.println("Patched string: " + target);
            }
        }
    }
}