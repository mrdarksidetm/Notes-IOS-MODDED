package s1;

import ae.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0409a f19913b = new C0409a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f19914c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f19915d = d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19916a;

    /* JADX INFO: renamed from: s1.a$a, reason: collision with other inner class name */
    public static final class C0409a {
        private C0409a() {
        }

        public /* synthetic */ C0409a(j jVar) {
            this();
        }

        public final int a() {
            return a.f19915d;
        }

        public final int b() {
            return a.f19914c;
        }
    }

    private /* synthetic */ a(int i10) {
        this.f19916a = i10;
    }

    public static final /* synthetic */ a c(int i10) {
        return new a(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof a) && i10 == ((a) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f19914c) ? "Touch" : f(i10, f19915d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f19916a, obj);
    }

    public int hashCode() {
        return g(this.f19916a);
    }

    public final /* synthetic */ int i() {
        return this.f19916a;
    }

    public String toString() {
        return h(this.f19916a);
    }
}
