package xd;

import ae.r;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(File file, File file2, String str) {
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": " + str);
        }
        String string = sb2.toString();
        r.e(string, "toString(...)");
        return string;
    }
}
