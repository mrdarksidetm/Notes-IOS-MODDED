package o1;

import ae.j;
import ae.r;
import k1.l;
import l1.k0;
import l1.s0;
import l1.v0;
import n1.f;
import w2.n;
import w2.p;
import w2.q;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v0 f16258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f16259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f16260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f16261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f16262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f16263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private k0 f16264m;

    private a(v0 v0Var, long j10, long j11) {
        this.f16258g = v0Var;
        this.f16259h = j10;
        this.f16260i = j11;
        this.f16261j = s0.f14565a.a();
        this.f16262k = o(j10, j11);
        this.f16263l = 1.0f;
    }

    public /* synthetic */ a(v0 v0Var, long j10, long j11, int i10, j jVar) {
        this(v0Var, (i10 & 2) != 0 ? n.f22418b.a() : j10, (i10 & 4) != 0 ? q.a(v0Var.getWidth(), v0Var.getHeight()) : j11, null);
    }

    public /* synthetic */ a(v0 v0Var, long j10, long j11, j jVar) {
        this(v0Var, j10, j11);
    }

    private final long o(long j10, long j11) {
        if (n.j(j10) >= 0 && n.k(j10) >= 0 && p.g(j11) >= 0 && p.f(j11) >= 0 && p.g(j11) <= this.f16258g.getWidth() && p.f(j11) <= this.f16258g.getHeight()) {
            return j11;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // o1.c
    protected boolean a(float f10) {
        this.f16263l = f10;
        return true;
    }

    @Override // o1.c
    protected boolean e(k0 k0Var) {
        this.f16264m = k0Var;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r.b(this.f16258g, aVar.f16258g) && n.i(this.f16259h, aVar.f16259h) && p.e(this.f16260i, aVar.f16260i) && s0.d(this.f16261j, aVar.f16261j);
    }

    public int hashCode() {
        return (((((this.f16258g.hashCode() * 31) + n.l(this.f16259h)) * 31) + p.h(this.f16260i)) * 31) + s0.e(this.f16261j);
    }

    @Override // o1.c
    public long k() {
        return q.c(this.f16262k);
    }

    @Override // o1.c
    protected void m(f fVar) {
        f.Y0(fVar, this.f16258g, this.f16259h, this.f16260i, 0L, q.a(ce.c.d(l.i(fVar.c())), ce.c.d(l.g(fVar.c()))), this.f16263l, null, this.f16264m, 0, this.f16261j, 328, null);
    }

    public final void n(int i10) {
        this.f16261j = i10;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.f16258g + ", srcOffset=" + ((Object) n.m(this.f16259h)) + ", srcSize=" + ((Object) p.i(this.f16260i)) + ", filterQuality=" + ((Object) s0.f(this.f16261j)) + ')';
    }
}
