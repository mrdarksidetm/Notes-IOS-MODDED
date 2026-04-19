import java.io.*;
import java.nio.file.*;
import java.util.*;

public class MasterBypassPatcher {
    public static void main(String[] args) throws Exception {
        String base = "D:/Ideas/Antigravity/Notes/standalone_source";
        
        String[] securityClasses = {
            "/smali/com/aheaditec/talsec_security/security/api/Natives.smali",
            "/smali/com/aheaditec/talsec_security/security/Natives.smali",
            "/smali/com/pairip/licensecheck/LicenseClient.smali",
            "/smali/com/pairip/licensecheck/ResponseValidator.smali",
            "/smali/com/google/android/play/core/integrity/IntegrityManagerFactory.smali",
            "/smali/s6/t3.smali",
            "/smali/s6/o3.smali",
            "/smali/t8/h.smali"
        };

        for (String cls : securityClasses) {
            neutralizeClass(base + cls);
        }
        
        patchRevenueCat(base + "/smali_classes2/com/revenuecat/purchases/EntitlementInfo.smali");

        System.out.println("Surgical Master Bypass Applied.");
    }

    private static void neutralizeClass(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("Cls not found: " + path);
            return;
        }
        List<String> lines = Files.readAllLines(file.toPath());
        List<String> newLines = new ArrayList<>();
        boolean inMethod = false;
        for (String line : lines) {
            String trimmed = line.trim();
            if (trimmed.startsWith(".method ") && !trimmed.contains("abstract") && !trimmed.contains("native")) {
                newLines.add(line);
                // DO NOT touch constructors or initializers!
                if (trimmed.contains("<init>") || trimmed.contains("<clinit>")) {
                    inMethod = false; // We want to keep the original body
                } else {
                    String returnType = getReturnType(trimmed);
                    newLines.add("    .locals 1");
                    if (returnType.equals("Z")) newLines.add("    const/4 v0, 0x1\n    return v0");
                    else if (returnType.equals("V")) newLines.add("    return-void");
                    else if (returnType.startsWith("L") || returnType.startsWith("[")) newLines.add("    const/4 v0, 0x0\n    return-object v0");
                    else newLines.add("    const/4 v0, 0x0\n    return v0");
                    inMethod = true;
                }
            } else if (inMethod && trimmed.equals(".end method")) {
                newLines.add(line);
                inMethod = false;
            } else if (!inMethod) {
                newLines.add(line);
            }
        }
        Files.write(file.toPath(), newLines);
        System.out.println("Neutralized: " + path);
    }

    private static void patchRevenueCat(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) return;
        List<String> lines = Files.readAllLines(file.toPath());
        List<String> newLines = new ArrayList<>();
        boolean inIsActive = false;
        for (String line : lines) {
            if (line.trim().equals(".method public final isActive()Z")) {
                newLines.add(line);
                newLines.add("    .locals 1\n    const/4 v0, 0x1\n    return v0");
                inIsActive = true;
            } else if (inIsActive && line.trim().equals(".end method")) {
                newLines.add(line);
                inIsActive = false;
            } else if (!inIsActive) {
                newLines.add(line);
            }
        }
        Files.write(file.toPath(), newLines);
        System.out.println("Patched RevenueCat.");
    }

    private static String getReturnType(String methodHeader) {
        int idx = methodHeader.lastIndexOf(")");
        if (idx != -1) return methodHeader.substring(idx + 1).trim();
        return "V";
    }
}