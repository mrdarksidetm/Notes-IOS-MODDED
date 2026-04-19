package da;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0<?> f9911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9913c;

    private q(d0<?> d0Var, int i10, int i11) {
        this.f9911a = (d0) c0.c(d0Var, "Null dependency anInterface.");
        this.f9912b = i10;
        this.f9913c = i11;
    }

    private q(Class<?> cls, int i10, int i11) {
        this((d0<?>) d0.b(cls), i10, i11);
    }

    private static String a(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    public static q g(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q h(d0<?> d0Var) {
        return new q(d0Var, 1, 0);
    }

    public static q i(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q k(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public d0<?> b() {
        return this.f9911a;
    }

    public boolean c() {
        return this.f9913c == 2;
    }

    public boolean d() {
        return this.f9913c == 0;
    }

    public boolean e() {
        return this.f9912b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f9911a.equals(qVar.f9911a) && this.f9912b == qVar.f9912b && this.f9913c == qVar.f9913c;
    }

    public boolean f() {
        return this.f9912b == 2;
    }

    public int hashCode() {
        return ((((this.f9911a.hashCode() ^ 1000003) * 1000003) ^ this.f9912b) * 1000003) ^ this.f9913c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f9911a);
        sb2.append(", type=");
        int i10 = this.f9912b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(a(this.f9913c));
        sb2.append("}");
        return sb2.toString();
    }
}
