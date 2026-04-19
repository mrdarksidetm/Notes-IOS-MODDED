package xd;

import ae.r;
import java.io.File;
import je.w;

/* JADX INFO: loaded from: classes2.dex */
class h {
    private static final int a(String str) {
        int iX;
        int iX2 = w.X(str, File.separatorChar, 0, false, 4, null);
        if (iX2 != 0) {
            if (iX2 > 0 && str.charAt(iX2 - 1) == ':') {
                return iX2 + 1;
            }
            if (iX2 == -1 && w.O(str, ':', false, 2, null)) {
                return str.length();
            }
            return 0;
        }
        if (str.length() > 1) {
            char cCharAt = str.charAt(1);
            char c10 = File.separatorChar;
            if (cCharAt == c10 && (iX = w.X(str, c10, 2, false, 4, null)) >= 0) {
                int iX3 = w.X(str, File.separatorChar, iX + 1, false, 4, null);
                return iX3 >= 0 ? iX3 + 1 : str.length();
            }
        }
        return 1;
    }

    public static final boolean b(File file) {
        r.f(file, "<this>");
        String path = file.getPath();
        r.e(path, "getPath(...)");
        return a(path) > 0;
    }
}
