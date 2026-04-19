package n1;

import ae.r;
import l1.g1;
import l1.v1;
import l1.w1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15737f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f15738g = v1.f14620a.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f15739h = w1.f14633a.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f15740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f15741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g1 f15744e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final int a() {
            return k.f15738g;
        }
    }

    private k(float f10, float f11, int i10, int i11, g1 g1Var) {
        super(null);
        this.f15740a = f10;
        this.f15741b = f11;
        this.f15742c = i10;
        this.f15743d = i11;
        this.f15744e = g1Var;
    }

    public /* synthetic */ k(float f10, float f11, int i10, int i11, g1 g1Var, int i12, ae.j jVar) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? f15738g : i10, (i12 & 8) != 0 ? f15739h : i11, (i12 & 16) != 0 ? null : g1Var, null);
    }

    public /* synthetic */ k(float f10, float f11, int i10, int i11, g1 g1Var, ae.j jVar) {
        this(f10, f11, i10, i11, g1Var);
    }

    public final int b() {
        return this.f15742c;
    }

    public final int c() {
        return this.f15743d;
    }

    public final float d() {
        return this.f15741b;
    }

    public final g1 e() {
        return this.f15744e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f15740a == kVar.f15740a) {
            return ((this.f15741b > kVar.f15741b ? 1 : (this.f15741b == kVar.f15741b ? 0 : -1)) == 0) && v1.e(this.f15742c, kVar.f15742c) && w1.e(this.f15743d, kVar.f15743d) && r.b(this.f15744e, kVar.f15744e);
        }
        return false;
    }

    public final float f() {
        return this.f15740a;
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.f15740a) * 31) + Float.hashCode(this.f15741b)) * 31) + v1.f(this.f15742c)) * 31) + w1.f(this.f15743d)) * 31;
        g1 g1Var = this.f15744e;
        return iHashCode + (g1Var != null ? g1Var.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.f15740a + ", miter=" + this.f15741b + ", cap=" + ((Object) v1.g(this.f15742c)) + ", join=" + ((Object) w1.g(this.f15743d)) + ", pathEffect=" + this.f15744e + ')';
    }
}
