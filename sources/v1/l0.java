package v1;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21942a;

    private /* synthetic */ l0(int i10) {
        this.f21942a = i10;
    }

    public static final /* synthetic */ l0 a(int i10) {
        return new l0(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof l0) && i10 == ((l0) obj).f();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "PointerKeyboardModifiers(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f21942a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f21942a;
    }

    public int hashCode() {
        return d(this.f21942a);
    }

    public String toString() {
        return e(this.f21942a);
    }
}
