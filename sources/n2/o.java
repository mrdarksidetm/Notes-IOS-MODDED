package n2;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static String a(String str) {
        if (str.length() > 0) {
            return str;
        }
        throw new IllegalArgumentException("name may not be empty".toString());
    }

    public static final boolean b(String str, String str2) {
        return ae.r.b(str, str2);
    }

    public static int c(String str) {
        return str.hashCode();
    }

    public static String d(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }
}
