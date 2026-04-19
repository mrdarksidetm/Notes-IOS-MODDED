package n1;

import k1.l;
import l1.b0;
import l1.d1;
import l1.e1;
import l1.f1;
import l1.g1;
import l1.j0;
import l1.k0;
import l1.s0;
import l1.v;
import l1.v0;
import l1.v1;
import l1.w1;
import l1.z;
import md.q;
import w2.r;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0358a f15721a = new C0358a(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f15722b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d1 f15723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d1 f15724d;

    /* JADX INFO: renamed from: n1.a$a, reason: collision with other inner class name */
    public static final class C0358a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w2.d f15725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private r f15726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b0 f15727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f15728d;

        private C0358a(w2.d dVar, r rVar, b0 b0Var, long j10) {
            this.f15725a = dVar;
            this.f15726b = rVar;
            this.f15727c = b0Var;
            this.f15728d = j10;
        }

        public /* synthetic */ C0358a(w2.d dVar, r rVar, b0 b0Var, long j10, int i10, ae.j jVar) {
            this((i10 & 1) != 0 ? e.a() : dVar, (i10 & 2) != 0 ? r.Ltr : rVar, (i10 & 4) != 0 ? new i() : b0Var, (i10 & 8) != 0 ? l.f14359b.b() : j10, null);
        }

        public /* synthetic */ C0358a(w2.d dVar, r rVar, b0 b0Var, long j10, ae.j jVar) {
            this(dVar, rVar, b0Var, j10);
        }

        public final w2.d a() {
            return this.f15725a;
        }

        public final r b() {
            return this.f15726b;
        }

        public final b0 c() {
            return this.f15727c;
        }

        public final long d() {
            return this.f15728d;
        }

        public final b0 e() {
            return this.f15727c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0358a)) {
                return false;
            }
            C0358a c0358a = (C0358a) obj;
            return ae.r.b(this.f15725a, c0358a.f15725a) && this.f15726b == c0358a.f15726b && ae.r.b(this.f15727c, c0358a.f15727c) && l.f(this.f15728d, c0358a.f15728d);
        }

        public final w2.d f() {
            return this.f15725a;
        }

        public final r g() {
            return this.f15726b;
        }

        public final long h() {
            return this.f15728d;
        }

        public int hashCode() {
            return (((((this.f15725a.hashCode() * 31) + this.f15726b.hashCode()) * 31) + this.f15727c.hashCode()) * 31) + l.j(this.f15728d);
        }

        public final void i(b0 b0Var) {
            this.f15727c = b0Var;
        }

        public final void j(w2.d dVar) {
            this.f15725a = dVar;
        }

        public final void k(r rVar) {
            this.f15726b = rVar;
        }

        public final void l(long j10) {
            this.f15728d = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.f15725a + ", layoutDirection=" + this.f15726b + ", canvas=" + this.f15727c + ", size=" + ((Object) l.l(this.f15728d)) + ')';
        }
    }

    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f15729a = n1.b.b(this);

        b() {
        }

        @Override // n1.d
        public h a() {
            return this.f15729a;
        }

        @Override // n1.d
        public void b(long j10) {
            a.this.r().l(j10);
        }

        @Override // n1.d
        public long c() {
            return a.this.r().h();
        }

        @Override // n1.d
        public b0 d() {
            return a.this.r().e();
        }
    }

    private final d1 A(g gVar) {
        if (ae.r.b(gVar, j.f15736a)) {
            return v();
        }
        if (!(gVar instanceof k)) {
            throw new q();
        }
        d1 d1VarX = x();
        k kVar = (k) gVar;
        if (!(d1VarX.w() == kVar.f())) {
            d1VarX.v(kVar.f());
        }
        if (!v1.e(d1VarX.p(), kVar.b())) {
            d1VarX.e(kVar.b());
        }
        if (!(d1VarX.g() == kVar.d())) {
            d1VarX.m(kVar.d());
        }
        if (!w1.e(d1VarX.d(), kVar.c())) {
            d1VarX.q(kVar.c());
        }
        if (!ae.r.b(d1VarX.u(), kVar.e())) {
            d1VarX.r(kVar.e());
        }
        return d1VarX;
    }

    private final d1 d(long j10, g gVar, float f10, k0 k0Var, int i10, int i11) {
        d1 d1VarA = A(gVar);
        long jS = s(j10, f10);
        if (!j0.w(d1VarA.c(), jS)) {
            d1VarA.t(jS);
        }
        if (d1VarA.l() != null) {
            d1VarA.k(null);
        }
        if (!ae.r.b(d1VarA.i(), k0Var)) {
            d1VarA.h(k0Var);
        }
        if (!v.E(d1VarA.x(), i10)) {
            d1VarA.f(i10);
        }
        if (!s0.d(d1VarA.o(), i11)) {
            d1VarA.n(i11);
        }
        return d1VarA;
    }

    static /* synthetic */ d1 f(a aVar, long j10, g gVar, float f10, k0 k0Var, int i10, int i11, int i12, Object obj) {
        return aVar.d(j10, gVar, f10, k0Var, i10, (i12 & 32) != 0 ? f.S.b() : i11);
    }

    private final d1 j(z zVar, g gVar, float f10, k0 k0Var, int i10, int i11) {
        d1 d1VarA = A(gVar);
        if (zVar != null) {
            zVar.mo292applyToPq9zytI(c(), d1VarA, f10);
        } else {
            if (d1VarA.l() != null) {
                d1VarA.k(null);
            }
            long jC = d1VarA.c();
            j0.a aVar = j0.f14524b;
            if (!j0.w(jC, aVar.a())) {
                d1VarA.t(aVar.a());
            }
            if (!(d1VarA.a() == f10)) {
                d1VarA.b(f10);
            }
        }
        if (!ae.r.b(d1VarA.i(), k0Var)) {
            d1VarA.h(k0Var);
        }
        if (!v.E(d1VarA.x(), i10)) {
            d1VarA.f(i10);
        }
        if (!s0.d(d1VarA.o(), i11)) {
            d1VarA.n(i11);
        }
        return d1VarA;
    }

    static /* synthetic */ d1 k(a aVar, z zVar, g gVar, float f10, k0 k0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = f.S.b();
        }
        return aVar.j(zVar, gVar, f10, k0Var, i10, i11);
    }

    private final d1 l(long j10, float f10, float f11, int i10, int i11, g1 g1Var, float f12, k0 k0Var, int i12, int i13) {
        d1 d1VarX = x();
        long jS = s(j10, f12);
        if (!j0.w(d1VarX.c(), jS)) {
            d1VarX.t(jS);
        }
        if (d1VarX.l() != null) {
            d1VarX.k(null);
        }
        if (!ae.r.b(d1VarX.i(), k0Var)) {
            d1VarX.h(k0Var);
        }
        if (!v.E(d1VarX.x(), i12)) {
            d1VarX.f(i12);
        }
        if (!(d1VarX.w() == f10)) {
            d1VarX.v(f10);
        }
        if (!(d1VarX.g() == f11)) {
            d1VarX.m(f11);
        }
        if (!v1.e(d1VarX.p(), i10)) {
            d1VarX.e(i10);
        }
        if (!w1.e(d1VarX.d(), i11)) {
            d1VarX.q(i11);
        }
        if (!ae.r.b(d1VarX.u(), g1Var)) {
            d1VarX.r(g1Var);
        }
        if (!s0.d(d1VarX.o(), i13)) {
            d1VarX.n(i13);
        }
        return d1VarX;
    }

    static /* synthetic */ d1 p(a aVar, long j10, float f10, float f11, int i10, int i11, g1 g1Var, float f12, k0 k0Var, int i12, int i13, int i14, Object obj) {
        return aVar.l(j10, f10, f11, i10, i11, g1Var, f12, k0Var, i12, (i14 & 512) != 0 ? f.S.b() : i13);
    }

    private final long s(long j10, float f10) {
        return !((f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1)) == 0) ? j0.u(j10, j0.x(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null) : j10;
    }

    private final d1 v() {
        d1 d1Var = this.f15723c;
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1VarA = l1.j.a();
        d1VarA.s(e1.f14503a.a());
        this.f15723c = d1VarA;
        return d1VarA;
    }

    private final d1 x() {
        d1 d1Var = this.f15724d;
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1VarA = l1.j.a();
        d1VarA.s(e1.f14503a.b());
        this.f15724d = d1VarA;
        return d1VarA;
    }

    @Override // n1.f
    public d M0() {
        return this.f15722b;
    }

    @Override // n1.f
    public void R(z zVar, long j10, long j11, float f10, g gVar, k0 k0Var, int i10) {
        this.f15721a.e().u(k1.f.o(j10), k1.f.p(j10), k1.f.o(j10) + l.i(j11), k1.f.p(j10) + l.g(j11), k(this, zVar, gVar, f10, k0Var, i10, 0, 32, null));
    }

    @Override // n1.f
    public void T0(long j10, long j11, long j12, long j13, g gVar, float f10, k0 k0Var, int i10) {
        this.f15721a.e().s(k1.f.o(j11), k1.f.p(j11), k1.f.o(j11) + l.i(j12), k1.f.p(j11) + l.g(j12), k1.a.d(j13), k1.a.e(j13), f(this, j10, gVar, f10, k0Var, i10, 0, 32, null));
    }

    @Override // n1.f
    public void X(f1 f1Var, long j10, float f10, g gVar, k0 k0Var, int i10) {
        this.f15721a.e().o(f1Var, f(this, j10, gVar, f10, k0Var, i10, 0, 32, null));
    }

    @Override // n1.f
    public void b0(long j10, long j11, long j12, float f10, int i10, g1 g1Var, float f11, k0 k0Var, int i11) {
        this.f15721a.e().q(j11, j12, p(this, j10, f10, 4.0f, i10, w1.f14633a.b(), g1Var, f11, k0Var, i11, 0, 512, null));
    }

    @Override // n1.f
    public void f0(v0 v0Var, long j10, long j11, long j12, long j13, float f10, g gVar, k0 k0Var, int i10, int i11) {
        this.f15721a.e().k(v0Var, j10, j11, j12, j13, j(null, gVar, f10, k0Var, i10, i11));
    }

    @Override // n1.f
    public void f1(f1 f1Var, z zVar, float f10, g gVar, k0 k0Var, int i10) {
        this.f15721a.e().o(f1Var, k(this, zVar, gVar, f10, k0Var, i10, 0, 32, null));
    }

    @Override // w2.d
    public float getDensity() {
        return this.f15721a.f().getDensity();
    }

    @Override // n1.f
    public r getLayoutDirection() {
        return this.f15721a.g();
    }

    @Override // n1.f
    public void j1(long j10, float f10, long j11, float f11, g gVar, k0 k0Var, int i10) {
        this.f15721a.e().v(j11, f10, f(this, j10, gVar, f11, k0Var, i10, 0, 32, null));
    }

    @Override // n1.f
    public void k1(long j10, long j11, long j12, float f10, g gVar, k0 k0Var, int i10) {
        this.f15721a.e().u(k1.f.o(j11), k1.f.p(j11), k1.f.o(j11) + l.i(j12), k1.f.p(j11) + l.g(j12), f(this, j10, gVar, f10, k0Var, i10, 0, 32, null));
    }

    @Override // n1.f
    public void p0(z zVar, long j10, long j11, long j12, float f10, g gVar, k0 k0Var, int i10) {
        this.f15721a.e().s(k1.f.o(j10), k1.f.p(j10), k1.f.o(j10) + l.i(j11), k1.f.p(j10) + l.g(j11), k1.a.d(j12), k1.a.e(j12), k(this, zVar, gVar, f10, k0Var, i10, 0, 32, null));
    }

    public final C0358a r() {
        return this.f15721a;
    }

    @Override // n1.f
    public void v1(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, g gVar, k0 k0Var, int i10) {
        this.f15721a.e().f(k1.f.o(j11), k1.f.p(j11), k1.f.o(j11) + l.i(j12), k1.f.p(j11) + l.g(j12), f10, f11, z10, f(this, j10, gVar, f12, k0Var, i10, 0, 32, null));
    }

    @Override // w2.l
    public float y0() {
        return this.f15721a.f().y0();
    }
}
