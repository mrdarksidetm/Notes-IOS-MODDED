package i2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f12346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f12347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f12349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f12350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<k1.h> f12351f;

    private d0(c0 c0Var, h hVar, long j10) {
        this.f12346a = c0Var;
        this.f12347b = hVar;
        this.f12348c = j10;
        this.f12349d = hVar.g();
        this.f12350e = hVar.j();
        this.f12351f = hVar.w();
    }

    public /* synthetic */ d0(c0 c0Var, h hVar, long j10, ae.j jVar) {
        this(c0Var, hVar, j10);
    }

    public static /* synthetic */ d0 b(d0 d0Var, c0 c0Var, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0Var = d0Var.f12346a;
        }
        if ((i10 & 2) != 0) {
            j10 = d0Var.f12348c;
        }
        return d0Var.a(c0Var, j10);
    }

    public static /* synthetic */ int o(d0 d0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return d0Var.n(i10, z10);
    }

    public final d0 a(c0 c0Var, long j10) {
        return new d0(c0Var, this.f12347b, j10, null);
    }

    public final u2.h c(int i10) {
        return this.f12347b.c(i10);
    }

    public final k1.h d(int i10) {
        return this.f12347b.d(i10);
    }

    public final k1.h e(int i10) {
        return this.f12347b.e(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!ae.r.b(this.f12346a, d0Var.f12346a) || !ae.r.b(this.f12347b, d0Var.f12347b) || !w2.p.e(this.f12348c, d0Var.f12348c)) {
            return false;
        }
        if (this.f12349d == d0Var.f12349d) {
            return ((this.f12350e > d0Var.f12350e ? 1 : (this.f12350e == d0Var.f12350e ? 0 : -1)) == 0) && ae.r.b(this.f12351f, d0Var.f12351f);
        }
        return false;
    }

    public final boolean f() {
        return this.f12347b.f() || ((float) w2.p.f(this.f12348c)) < this.f12347b.h();
    }

    public final boolean g() {
        return ((float) w2.p.g(this.f12348c)) < this.f12347b.x();
    }

    public final float h() {
        return this.f12349d;
    }

    public int hashCode() {
        return (((((((((this.f12346a.hashCode() * 31) + this.f12347b.hashCode()) * 31) + w2.p.h(this.f12348c)) * 31) + Float.hashCode(this.f12349d)) * 31) + Float.hashCode(this.f12350e)) * 31) + this.f12351f.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j() {
        return this.f12350e;
    }

    public final c0 k() {
        return this.f12346a;
    }

    public final float l(int i10) {
        return this.f12347b.k(i10);
    }

    public final int m() {
        return this.f12347b.l();
    }

    public final int n(int i10, boolean z10) {
        return this.f12347b.m(i10, z10);
    }

    public final int p(int i10) {
        return this.f12347b.n(i10);
    }

    public final int q(float f10) {
        return this.f12347b.o(f10);
    }

    public final float r(int i10) {
        return this.f12347b.p(i10);
    }

    public final float s(int i10) {
        return this.f12347b.q(i10);
    }

    public final int t(int i10) {
        return this.f12347b.r(i10);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f12346a + ", multiParagraph=" + this.f12347b + ", size=" + ((Object) w2.p.i(this.f12348c)) + ", firstBaseline=" + this.f12349d + ", lastBaseline=" + this.f12350e + ", placeholderRects=" + this.f12351f + ')';
    }

    public final float u(int i10) {
        return this.f12347b.s(i10);
    }

    public final h v() {
        return this.f12347b;
    }

    public final int w(long j10) {
        return this.f12347b.t(j10);
    }

    public final u2.h x(int i10) {
        return this.f12347b.u(i10);
    }

    public final List<k1.h> y() {
        return this.f12351f;
    }

    public final long z() {
        return this.f12348c;
    }
}
