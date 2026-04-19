package i2;

import l1.s1;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f12366d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g0 f12367e = new g0(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777215, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f12368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f12369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f12370c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final g0 a() {
            return g0.f12367e;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private g0(long j10, long j11, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j12, u2.a aVar, u2.n nVar, q2.e eVar, long j13, u2.j jVar, s1 s1Var, n1.g gVar, int i10, int i11, long j14, u2.o oVar, y yVar, u2.g gVar2, int i12, int i13, u2.p pVar) {
        this(new a0(j10, j11, i0Var, e0Var, f0Var, tVar, str, j12, aVar, nVar, eVar, j13, jVar, s1Var, (x) null, gVar, (ae.j) null), new s(i10, i11, j14, oVar, yVar != null ? yVar.a() : null, gVar2, i12, i13, pVar, null), yVar);
        if (yVar != null) {
            yVar.b();
        }
    }

    public /* synthetic */ g0(long j10, long j11, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j12, u2.a aVar, u2.n nVar, q2.e eVar, long j13, u2.j jVar, s1 s1Var, n1.g gVar, int i10, int i11, long j14, u2.o oVar, y yVar, u2.g gVar2, int i12, int i13, u2.p pVar, int i14, ae.j jVar2) {
        this((i14 & 1) != 0 ? l1.j0.f14524b.j() : j10, (i14 & 2) != 0 ? w2.t.f22428b.a() : j11, (i14 & 4) != 0 ? null : i0Var, (i14 & 8) != 0 ? null : e0Var, (i14 & 16) != 0 ? null : f0Var, (i14 & 32) != 0 ? null : tVar, (i14 & 64) != 0 ? null : str, (i14 & 128) != 0 ? w2.t.f22428b.a() : j12, (i14 & 256) != 0 ? null : aVar, (i14 & 512) != 0 ? null : nVar, (i14 & 1024) != 0 ? null : eVar, (i14 & 2048) != 0 ? l1.j0.f14524b.j() : j13, (i14 & 4096) != 0 ? null : jVar, (i14 & 8192) != 0 ? null : s1Var, (i14 & 16384) != 0 ? null : gVar, (i14 & 32768) != 0 ? u2.i.f21560b.g() : i10, (i14 & 65536) != 0 ? u2.k.f21574b.f() : i11, (i14 & 131072) != 0 ? w2.t.f22428b.a() : j14, (i14 & 262144) != 0 ? null : oVar, (i14 & 524288) != 0 ? null : yVar, (i14 & 1048576) != 0 ? null : gVar2, (i14 & 2097152) != 0 ? u2.e.f21523a.b() : i12, (i14 & 4194304) != 0 ? u2.d.f21519a.c() : i13, (i14 & 8388608) != 0 ? null : pVar, null);
    }

    public /* synthetic */ g0(long j10, long j11, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j12, u2.a aVar, u2.n nVar, q2.e eVar, long j13, u2.j jVar, s1 s1Var, n1.g gVar, int i10, int i11, long j14, u2.o oVar, y yVar, u2.g gVar2, int i12, int i13, u2.p pVar, ae.j jVar2) {
        this(j10, j11, i0Var, e0Var, f0Var, tVar, str, j12, aVar, nVar, eVar, j13, jVar, s1Var, gVar, i10, i11, j14, oVar, yVar, gVar2, i12, i13, pVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g0(a0 a0Var, s sVar) {
        this(a0Var, sVar, h0.b(null, sVar.g()));
        a0Var.q();
    }

    public g0(a0 a0Var, s sVar, y yVar) {
        this.f12368a = a0Var;
        this.f12369b = sVar;
        this.f12370c = yVar;
    }

    public static /* synthetic */ g0 c(g0 g0Var, l1.z zVar, float f10, long j10, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j11, u2.a aVar, u2.n nVar, q2.e eVar, long j12, u2.j jVar, s1 s1Var, n1.g gVar, int i10, int i11, long j13, u2.o oVar, y yVar, u2.g gVar2, int i12, int i13, u2.p pVar, int i14, Object obj) {
        s1 s1Var2;
        n1.g gVarH;
        n1.g gVar3;
        int iH;
        int i15;
        int i16;
        int i17;
        long jE;
        u2.o oVar2;
        y yVar2;
        y yVar3;
        u2.g gVarF;
        u2.g gVar4;
        int iD;
        int i18;
        int iC;
        float fC = (i14 & 2) != 0 ? g0Var.f12368a.c() : f10;
        long jK = (i14 & 4) != 0 ? g0Var.f12368a.k() : j10;
        n2.i0 i0VarN = (i14 & 8) != 0 ? g0Var.f12368a.n() : i0Var;
        n2.e0 e0VarL = (i14 & 16) != 0 ? g0Var.f12368a.l() : e0Var;
        n2.f0 f0VarM = (i14 & 32) != 0 ? g0Var.f12368a.m() : f0Var;
        n2.t tVarI = (i14 & 64) != 0 ? g0Var.f12368a.i() : tVar;
        String strJ = (i14 & 128) != 0 ? g0Var.f12368a.j() : str;
        long jO = (i14 & 256) != 0 ? g0Var.f12368a.o() : j11;
        u2.a aVarE = (i14 & 512) != 0 ? g0Var.f12368a.e() : aVar;
        u2.n nVarU = (i14 & 1024) != 0 ? g0Var.f12368a.u() : nVar;
        q2.e eVarP = (i14 & 2048) != 0 ? g0Var.f12368a.p() : eVar;
        long jD = (i14 & 4096) != 0 ? g0Var.f12368a.d() : j12;
        u2.j jVarS = (i14 & 8192) != 0 ? g0Var.f12368a.s() : jVar;
        s1 s1VarR = (i14 & 16384) != 0 ? g0Var.f12368a.r() : s1Var;
        if ((i14 & 32768) != 0) {
            s1Var2 = s1VarR;
            gVarH = g0Var.f12368a.h();
        } else {
            s1Var2 = s1VarR;
            gVarH = gVar;
        }
        if ((i14 & 65536) != 0) {
            gVar3 = gVarH;
            iH = g0Var.f12369b.h();
        } else {
            gVar3 = gVarH;
            iH = i10;
        }
        if ((i14 & 131072) != 0) {
            i15 = iH;
            i16 = g0Var.f12369b.i();
        } else {
            i15 = iH;
            i16 = i11;
        }
        if ((i14 & 262144) != 0) {
            i17 = i16;
            jE = g0Var.f12369b.e();
        } else {
            i17 = i16;
            jE = j13;
        }
        u2.o oVarJ = (524288 & i14) != 0 ? g0Var.f12369b.j() : oVar;
        if ((i14 & 1048576) != 0) {
            oVar2 = oVarJ;
            yVar2 = g0Var.f12370c;
        } else {
            oVar2 = oVarJ;
            yVar2 = yVar;
        }
        if ((i14 & 2097152) != 0) {
            yVar3 = yVar2;
            gVarF = g0Var.f12369b.f();
        } else {
            yVar3 = yVar2;
            gVarF = gVar2;
        }
        if ((i14 & 4194304) != 0) {
            gVar4 = gVarF;
            iD = g0Var.f12369b.d();
        } else {
            gVar4 = gVarF;
            iD = i12;
        }
        if ((i14 & 8388608) != 0) {
            i18 = iD;
            iC = g0Var.f12369b.c();
        } else {
            i18 = iD;
            iC = i13;
        }
        return g0Var.b(zVar, fC, jK, i0VarN, e0VarL, f0VarM, tVarI, strJ, jO, aVarE, nVarU, eVarP, jD, jVarS, s1Var2, gVar3, i15, i17, jE, oVar2, yVar3, gVar4, i18, iC, (i14 & 16777216) != 0 ? g0Var.f12369b.k() : pVar);
    }

    public final a0 A() {
        return this.f12368a;
    }

    public final int B() {
        return this.f12369b.h();
    }

    public final u2.j C() {
        return this.f12368a.s();
    }

    public final int D() {
        return this.f12369b.i();
    }

    public final u2.n E() {
        return this.f12368a.u();
    }

    public final u2.o F() {
        return this.f12369b.j();
    }

    public final u2.p G() {
        return this.f12369b.k();
    }

    public final boolean H(g0 g0Var) {
        return this == g0Var || this.f12368a.w(g0Var.f12368a);
    }

    public final boolean I(g0 g0Var) {
        return this == g0Var || (ae.r.b(this.f12369b, g0Var.f12369b) && this.f12368a.v(g0Var.f12368a));
    }

    public final g0 J(s sVar) {
        return new g0(O(), N().l(sVar));
    }

    public final g0 K(g0 g0Var) {
        return (g0Var == null || ae.r.b(g0Var, f12367e)) ? this : new g0(O().x(g0Var.O()), N().l(g0Var.N()));
    }

    public final g0 L(long j10, long j11, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j12, u2.a aVar, u2.n nVar, q2.e eVar, long j13, u2.j jVar, s1 s1Var, n1.g gVar, int i10, int i11, long j14, u2.o oVar, u2.g gVar2, int i12, int i13, y yVar, u2.p pVar) {
        a0 a0Var = this.f12368a;
        if (yVar != null) {
            yVar.b();
        }
        a0 a0VarB = b0.b(a0Var, j10, null, Float.NaN, j11, i0Var, e0Var, f0Var, tVar, str, j12, aVar, nVar, eVar, j13, jVar, s1Var, null, gVar);
        s sVarA = t.a(this.f12369b, i10, i11, j14, oVar, yVar != null ? yVar.a() : null, gVar2, i12, i13, pVar);
        return (this.f12368a == a0VarB && this.f12369b == sVarA) ? this : new g0(a0VarB, sVarA);
    }

    public final s N() {
        return this.f12369b;
    }

    public final a0 O() {
        return this.f12368a;
    }

    public final g0 b(l1.z zVar, float f10, long j10, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j11, u2.a aVar, u2.n nVar, q2.e eVar, long j12, u2.j jVar, s1 s1Var, n1.g gVar, int i10, int i11, long j13, u2.o oVar, y yVar, u2.g gVar2, int i12, int i13, u2.p pVar) {
        if (yVar != null) {
            yVar.b();
        }
        return new g0(new a0(zVar, f10, j10, i0Var, e0Var, f0Var, tVar, str, j11, aVar, nVar, eVar, j12, jVar, s1Var, (x) null, gVar, (ae.j) null), new s(i10, i11, j13, oVar, yVar != null ? yVar.a() : null, gVar2, i12, i13, pVar, null), yVar);
    }

    public final g0 d(long j10, long j11, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j12, u2.a aVar, u2.n nVar, q2.e eVar, long j13, u2.j jVar, s1 s1Var, n1.g gVar, int i10, int i11, long j14, u2.o oVar, y yVar, u2.g gVar2, int i12, int i13, u2.p pVar) {
        u2.m mVarT = l1.j0.w(j10, this.f12368a.g()) ? this.f12368a.t() : u2.m.f21582a.b(j10);
        if (yVar != null) {
            yVar.b();
        }
        return new g0(new a0(mVarT, j11, i0Var, e0Var, f0Var, tVar, str, j12, aVar, nVar, eVar, j13, jVar, s1Var, (x) null, gVar, (ae.j) null), new s(i10, i11, j14, oVar, yVar != null ? yVar.a() : null, gVar2, i12, i13, pVar, null), yVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return ae.r.b(this.f12368a, g0Var.f12368a) && ae.r.b(this.f12369b, g0Var.f12369b) && ae.r.b(this.f12370c, g0Var.f12370c);
    }

    public final float f() {
        return this.f12368a.c();
    }

    public final long g() {
        return this.f12368a.d();
    }

    public final u2.a h() {
        return this.f12368a.e();
    }

    public int hashCode() {
        int iHashCode = ((this.f12368a.hashCode() * 31) + this.f12369b.hashCode()) * 31;
        y yVar = this.f12370c;
        return iHashCode + (yVar != null ? yVar.hashCode() : 0);
    }

    public final l1.z i() {
        return this.f12368a.f();
    }

    public final long j() {
        return this.f12368a.g();
    }

    public final n1.g k() {
        return this.f12368a.h();
    }

    public final n2.t l() {
        return this.f12368a.i();
    }

    public final String m() {
        return this.f12368a.j();
    }

    public final long n() {
        return this.f12368a.k();
    }

    public final n2.e0 o() {
        return this.f12368a.l();
    }

    public final n2.f0 p() {
        return this.f12368a.m();
    }

    public final n2.i0 q() {
        return this.f12368a.n();
    }

    public final int r() {
        return this.f12369b.c();
    }

    public final long s() {
        return this.f12368a.o();
    }

    public final int t() {
        return this.f12369b.d();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) l1.j0.D(j())) + ", brush=" + i() + ", alpha=" + f() + ", fontSize=" + ((Object) w2.t.j(n())) + ", fontWeight=" + q() + ", fontStyle=" + o() + ", fontSynthesis=" + p() + ", fontFamily=" + l() + ", fontFeatureSettings=" + m() + ", letterSpacing=" + ((Object) w2.t.j(s())) + ", baselineShift=" + h() + ", textGeometricTransform=" + E() + ", localeList=" + w() + ", background=" + ((Object) l1.j0.D(g())) + ", textDecoration=" + C() + ", shadow=" + z() + ", drawStyle=" + k() + ", textAlign=" + ((Object) u2.i.m(B())) + ", textDirection=" + ((Object) u2.k.l(D())) + ", lineHeight=" + ((Object) w2.t.j(u())) + ", textIndent=" + F() + ", platformStyle=" + this.f12370c + ", lineHeightStyle=" + v() + ", lineBreak=" + ((Object) u2.e.i(t())) + ", hyphens=" + ((Object) u2.d.g(r())) + ", textMotion=" + G() + ')';
    }

    public final long u() {
        return this.f12369b.e();
    }

    public final u2.g v() {
        return this.f12369b.f();
    }

    public final q2.e w() {
        return this.f12368a.p();
    }

    public final s x() {
        return this.f12369b;
    }

    public final y y() {
        return this.f12370c;
    }

    public final s1 z() {
        return this.f12368a.r();
    }
}
