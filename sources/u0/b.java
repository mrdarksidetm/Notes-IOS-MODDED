package u0;

import ae.j;
import java.util.List;
import md.i;
import md.i0;
import t0.c0;
import t0.f1;
import t0.g1;
import t0.k2;
import t0.m;
import t0.o;
import t0.o3;
import t0.q;
import t0.r0;
import t0.r2;
import t0.s2;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f21415m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f21416n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f21417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u0.a f21418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21419c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21423g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21428l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r0 f21420d = new r0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21421e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o3<Object> f21424h = new o3<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21425i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21426j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21427k = -1;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    public b(m mVar, u0.a aVar) {
        this.f21417a = mVar;
        this.f21418b = aVar;
    }

    private final void A() {
        int i10 = this.f21423g;
        if (i10 > 0) {
            this.f21418b.E(i10);
            this.f21423g = 0;
        }
        if (this.f21424h.d()) {
            this.f21418b.j(this.f21424h.i());
            this.f21424h.a();
        }
    }

    private final void B() {
        H(this, false, 1, null);
        J();
    }

    private final void C(boolean z10) {
        G(z10);
    }

    static /* synthetic */ void D(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.C(z10);
    }

    private final void E(int i10, int i11, int i12) {
        z();
        this.f21418b.t(i10, i11, i12);
    }

    private final void F() {
        int i10 = this.f21428l;
        if (i10 > 0) {
            int i11 = this.f21425i;
            if (i11 >= 0) {
                I(i11, i10);
                this.f21425i = -1;
            } else {
                E(this.f21427k, this.f21426j, i10);
                this.f21426j = -1;
                this.f21427k = -1;
            }
            this.f21428l = 0;
        }
    }

    private final void G(boolean z10) {
        int iS = z10 ? p().s() : p().k();
        int i10 = iS - this.f21422f;
        if (!(i10 >= 0)) {
            o.u("Tried to seek backward".toString());
            throw new i();
        }
        if (i10 > 0) {
            this.f21418b.e(i10);
            this.f21422f = iS;
        }
    }

    static /* synthetic */ void H(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.G(z10);
    }

    private final void I(int i10, int i11) {
        z();
        this.f21418b.x(i10, i11);
    }

    private final void k(t0.d dVar) {
        D(this, false, 1, null);
        this.f21418b.n(dVar);
        this.f21419c = true;
    }

    private final void l() {
        if (this.f21419c || !this.f21421e) {
            return;
        }
        D(this, false, 1, null);
        this.f21418b.o();
        this.f21419c = true;
    }

    private final r2 p() {
        return this.f21417a.C0();
    }

    private final void z() {
        A();
    }

    public final void J() {
        r2 r2VarP;
        int iS;
        if (p().u() <= 0 || this.f21420d.g(-2) == (iS = (r2VarP = p()).s())) {
            return;
        }
        l();
        if (iS > 0) {
            t0.d dVarA = r2VarP.a(iS);
            this.f21420d.i(iS);
            k(dVarA);
        }
    }

    public final void K() {
        A();
        if (this.f21419c) {
            U();
            j();
        }
    }

    public final void L(c0 c0Var, q qVar, g1 g1Var) {
        this.f21418b.u(c0Var, qVar, g1Var);
    }

    public final void M(k2 k2Var) {
        this.f21418b.v(k2Var);
    }

    public final void N() {
        B();
        this.f21418b.w();
        this.f21422f += p().p();
    }

    public final void O(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                o.u(("Invalid remove index " + i10).toString());
                throw new i();
            }
            if (this.f21425i == i10) {
                this.f21428l += i11;
                return;
            }
            F();
            this.f21425i = i10;
            this.f21428l = i11;
        }
    }

    public final void P() {
        this.f21418b.y();
    }

    public final void Q() {
        this.f21419c = false;
        this.f21420d.a();
        this.f21422f = 0;
    }

    public final void R(u0.a aVar) {
        this.f21418b = aVar;
    }

    public final void S(boolean z10) {
        this.f21421e = z10;
    }

    public final void T(zd.a<i0> aVar) {
        this.f21418b.z(aVar);
    }

    public final void U() {
        this.f21418b.A();
    }

    public final void V(Object obj) {
        D(this, false, 1, null);
        this.f21418b.B(obj);
    }

    public final <T, V> void W(V v10, p<? super T, ? super V, i0> pVar) {
        z();
        this.f21418b.C(v10, pVar);
    }

    public final void X(Object obj, int i10) {
        C(true);
        this.f21418b.D(obj, i10);
    }

    public final void Y(Object obj) {
        z();
        this.f21418b.F(obj);
    }

    public final void a(List<? extends Object> list, b1.d dVar) {
        this.f21418b.f(list, dVar);
    }

    public final void b(f1 f1Var, q qVar, g1 g1Var, g1 g1Var2) {
        this.f21418b.g(f1Var, qVar, g1Var, g1Var2);
    }

    public final void c() {
        D(this, false, 1, null);
        this.f21418b.h();
    }

    public final void d(b1.d dVar, t0.d dVar2) {
        A();
        this.f21418b.i(dVar, dVar2);
    }

    public final void e(l<? super t0.p, i0> lVar, t0.p pVar) {
        this.f21418b.k(lVar, pVar);
    }

    public final void f() {
        int iS = p().s();
        if (!(this.f21420d.g(-1) <= iS)) {
            o.u("Missed recording an endGroup".toString());
            throw new i();
        }
        if (this.f21420d.g(-1) == iS) {
            D(this, false, 1, null);
            this.f21420d.h();
            this.f21418b.l();
        }
    }

    public final void g() {
        this.f21418b.m();
        this.f21422f = 0;
    }

    public final void h() {
        F();
    }

    public final void i(int i10, int i11) {
        h();
        A();
        int iK = p().G(i11) ? 1 : p().K(i11);
        if (iK > 0) {
            O(i10, iK);
        }
    }

    public final void j() {
        if (this.f21419c) {
            D(this, false, 1, null);
            D(this, false, 1, null);
            this.f21418b.l();
            this.f21419c = false;
        }
    }

    public final void m() {
        A();
        if (this.f21420d.d()) {
            return;
        }
        o.u("Missed recording an endGroup()".toString());
        throw new i();
    }

    public final u0.a n() {
        return this.f21418b;
    }

    public final boolean o() {
        return this.f21421e;
    }

    public final void q(u0.a aVar, b1.d dVar) {
        this.f21418b.p(aVar, dVar);
    }

    public final void r(t0.d dVar, s2 s2Var) {
        A();
        B();
        this.f21418b.q(dVar, s2Var);
    }

    public final void s(t0.d dVar, s2 s2Var, c cVar) {
        A();
        B();
        this.f21418b.r(dVar, s2Var, cVar);
    }

    public final void t(int i10) {
        B();
        this.f21418b.s(i10);
    }

    public final void u(Object obj) {
        this.f21424h.h(obj);
    }

    public final void v(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.f21428l;
            if (i13 > 0 && this.f21426j == i10 - i13 && this.f21427k == i11 - i13) {
                this.f21428l = i13 + i12;
                return;
            }
            F();
            this.f21426j = i10;
            this.f21427k = i11;
            this.f21428l = i12;
        }
    }

    public final void w(int i10) {
        this.f21422f += i10 - p().k();
    }

    public final void x(int i10) {
        this.f21422f = i10;
    }

    public final void y() {
        if (this.f21424h.d()) {
            this.f21424h.g();
        } else {
            this.f21423g++;
        }
    }
}
