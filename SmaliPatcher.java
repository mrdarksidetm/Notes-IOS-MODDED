import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SmaliPatcher {
    public static void main(String[] args) throws Exception {
        // 1. Patch Talsec Natives
        patchFile("D:/Ideas/Antigravity/Notes/standalone_source/smali/com/aheaditec/talsec_security/security/api/Natives.smali",
            new String[]{
                ".method public static constructor <clinit>()V",
                ".method public final a(Landroid/content/Context;)V"
            },
            new String[]{
                ".method public static constructor <clinit>()V\n    .locals 0\n    return-void\n",
                ".method public final a(Landroid/content/Context;)V\n    .locals 0\n    return-void\n"
            }
        );

        // 2. Patch PairIP
        patchFile("D:/Ideas/Antigravity/Notes/standalone_source/smali/com/pairip/licensecheck/LicenseClient.smali",
            new String[]{".method public initializeLicenseCheck()V"},
            new String[]{".method public initializeLicenseCheck()V\n    .locals 0\n    return-void\n"}
        );

        // 3. Patch RevenueCat Premium
        patchFile("D:/Ideas/Antigravity/Notes/standalone_source/smali_classes2/com/revenuecat/purchases/EntitlementInfo.smali",
            new String[]{".method public final isActive()Z"},
            new String[]{".method public final isActive()Z\n    .locals 1\n    const/4 v0, 0x1\n    return v0\n"}
        );

        System.out.println("Smali Patching Complete.");
    }

    private static void patchFile(String path, String[] headers, String[] replacements) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("Skip: " + path);
            return;
        }
        List<String> lines = Files.readAllLines(file.toPath());
        List<String> newLines = new ArrayList<>();
        
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            boolean matched = false;
            for (int j = 0; j < headers.length; j++) {
                if (line.trim().equals(headers[j])) {
                    newLines.add(replacements[j]);
                    matched = true;
                    // Skip until .end method
                    while (i < lines.size() && !lines.get(i).trim().equals(".end method")) {
                        i++;
                    }
                    newLines.add(".end method");
                    break;
                }
            }
            if (!matched) {
                newLines.add(line);
            }
        }
        Files.write(file.toPath(), newLines);
    }
}