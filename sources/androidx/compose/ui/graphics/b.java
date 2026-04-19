package androidx.compose.ui.graphics;

import ae.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2766a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f2767b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f2768c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f2769d = d(2);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final int a() {
            return b.f2767b;
        }

        public final int b() {
            return b.f2769d;
        }

        public final int c() {
            return b.f2768c;
        }
    }

    public static int d(int i10) {
        return i10;
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return "CompositingStrategy(value=" + i10 + ')';
    }
}
