package r9;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T b(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
