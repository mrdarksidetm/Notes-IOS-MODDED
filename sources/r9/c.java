package r9;

/* JADX INFO: loaded from: classes2.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r9.b f19238a = b();

    private static final class b implements r9.b {
        private b() {
        }
    }

    static String a(String str) {
        if (c(str)) {
            return null;
        }
        return str;
    }

    private static r9.b b() {
        return new b();
    }

    static boolean c(String str) {
        return str == null || str.isEmpty();
    }
}
