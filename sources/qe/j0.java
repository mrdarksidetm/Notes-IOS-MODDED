package qe;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f19066a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f19066a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
