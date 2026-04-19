package je;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class t extends s {
    public static Double i(String str) {
        ae.r.f(str, "<this>");
        try {
            if (l.f14226b.e(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float j(String str) {
        ae.r.f(str, "<this>");
        try {
            if (l.f14226b.e(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
