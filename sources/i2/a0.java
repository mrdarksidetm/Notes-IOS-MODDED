package i2;

import l1.s1;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u2.m f12298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n2.i0 f12300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n2.e0 f12301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n2.f0 f12302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n2.t f12303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f12304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f12305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u2.a f12306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u2.n f12307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final q2.e f12308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f12309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final u2.j f12310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final s1 f12311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n1.g f12312o;

    private a0(long j10, long j11, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j12, u2.a aVar, u2.n nVar, q2.e eVar, long j13, u2.j jVar, s1 s1Var, x xVar, n1.g gVar) {
        this(u2.m.f21582a.b(j10), j11, i0Var, e0Var, f0Var, tVar, str, j12, aVar, nVar, eVar, j13, jVar, s1Var, xVar, gVar, (ae.j) null);
    }

    public /* synthetic */ a0(long j10, long j11, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j12, u2.a aVar, u2.n nVar, q2.e eVar, long j13, u2.j jVar, s1 s1Var, x xVar, n1.g gVar, int i10, ae.j jVar2) {
        this((i10 & 1) != 0 ? l1.j0.f14524b.j() : j10, (i10 & 2) != 0 ? w2.t.f22428b.a() : j11, (i10 & 4) != 0 ? null : i0Var, (i10 & 8) != 0 ? null : e0Var, (i10 & 16) != 0 ? null : f0Var, (i10 & 32) != 0 ? null : tVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? w2.t.f22428b.a() : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : nVar, (i10 & 1024) != 0 ? null : eVar, (i10 & 2048) != 0 ? l1.j0.f14524b.j() : j13, (i10 & 4096) != 0 ? null : jVar, (i10 & 8192) != 0 ? null : s1Var, (i10 & 16384) != 0 ? null : xVar, (i10 & 32768) != 0 ? null : gVar, (ae.j) null);
    }

    public /* synthetic */ a0(long j10, long j11, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j12, u2.a aVar, u2.n nVar, q2.e eVar, long j13, u2.j jVar, s1 s1Var, x xVar, n1.g gVar, ae.j jVar2) {
        this(j10, j11, i0Var, e0Var, f0Var, tVar, str, j12, aVar, nVar, eVar, j13, jVar, s1Var, xVar, gVar);
    }

    private a0(l1.z zVar, float f10, long j10, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j11, u2.a aVar, u2.n nVar, q2.e eVar, long j12, u2.j jVar, s1 s1Var, x xVar, n1.g gVar) {
        this(u2.m.f21582a.a(zVar, f10), j10, i0Var, e0Var, f0Var, tVar, str, j11, aVar, nVar, eVar, j12, jVar, s1Var, xVar, gVar, (ae.j) null);
    }

    public /* synthetic */ a0(l1.z zVar, float f10, long j10, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j11, u2.a aVar, u2.n nVar, q2.e eVar, long j12, u2.j jVar, s1 s1Var, x xVar, n1.g gVar, ae.j jVar2) {
        this(zVar, f10, j10, i0Var, e0Var, f0Var, tVar, str, j11, aVar, nVar, eVar, j12, jVar, s1Var, xVar, gVar);
    }

    private a0(u2.m mVar, long j10, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j11, u2.a aVar, u2.n nVar, q2.e eVar, long j12, u2.j jVar, s1 s1Var, x xVar, n1.g gVar) {
        this.f12298a = mVar;
        this.f12299b = j10;
        this.f12300c = i0Var;
        this.f12301d = e0Var;
        this.f12302e = f0Var;
        this.f12303f = tVar;
        this.f12304g = str;
        this.f12305h = j11;
        this.f12306i = aVar;
        this.f12307j = nVar;
        this.f12308k = eVar;
        this.f12309l = j12;
        this.f12310m = jVar;
        this.f12311n = s1Var;
        this.f12312o = gVar;
    }

    public /* synthetic */ a0(u2.m mVar, long j10, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j11, u2.a aVar, u2.n nVar, q2.e eVar, long j12, u2.j jVar, s1 s1Var, x xVar, n1.g gVar, ae.j jVar2) {
        this(mVar, j10, i0Var, e0Var, f0Var, tVar, str, j11, aVar, nVar, eVar, j12, jVar, s1Var, xVar, gVar);
    }

    public static /* synthetic */ a0 b(a0 a0Var, long j10, long j11, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j12, u2.a aVar, u2.n nVar, q2.e eVar, long j13, u2.j jVar, s1 s1Var, x xVar, n1.g gVar, int i10, Object obj) {
        x xVar2;
        long jG = (i10 & 1) != 0 ? a0Var.g() : j10;
        long j14 = (i10 & 2) != 0 ? a0Var.f12299b : j11;
        n2.i0 i0Var2 = (i10 & 4) != 0 ? a0Var.f12300c : i0Var;
        n2.e0 e0Var2 = (i10 & 8) != 0 ? a0Var.f12301d : e0Var;
        n2.f0 f0Var2 = (i10 & 16) != 0 ? a0Var.f12302e : f0Var;
        n2.t tVar2 = (i10 & 32) != 0 ? a0Var.f12303f : tVar;
        String str2 = (i10 & 64) != 0 ? a0Var.f12304g : str;
        long j15 = (i10 & 128) != 0 ? a0Var.f12305h : j12;
        u2.a aVar2 = (i10 & 256) != 0 ? a0Var.f12306i : aVar;
        u2.n nVar2 = (i10 & 512) != 0 ? a0Var.f12307j : nVar;
        q2.e eVar2 = (i10 & 1024) != 0 ? a0Var.f12308k : eVar;
        u2.n nVar3 = nVar2;
        long j16 = (i10 & 2048) != 0 ? a0Var.f12309l : j13;
        u2.j jVar2 = (i10 & 4096) != 0 ? a0Var.f12310m : jVar;
        s1 s1Var2 = (i10 & 8192) != 0 ? a0Var.f12311n : s1Var;
        if ((i10 & 16384) != 0) {
            a0Var.getClass();
            xVar2 = null;
        } else {
            xVar2 = xVar;
        }
        return a0Var.a(jG, j14, i0Var2, e0Var2, f0Var2, tVar2, str2, j15, aVar2, nVar3, eVar2, j16, jVar2, s1Var2, xVar2, (i10 & 32768) != 0 ? a0Var.f12312o : gVar);
    }

    public final a0 a(long j10, long j11, n2.i0 i0Var, n2.e0 e0Var, n2.f0 f0Var, n2.t tVar, String str, long j12, u2.a aVar, u2.n nVar, q2.e eVar, long j13, u2.j jVar, s1 s1Var, x xVar, n1.g gVar) {
        return new a0(l1.j0.w(j10, g()) ? this.f12298a : u2.m.f21582a.b(j10), j11, i0Var, e0Var, f0Var, tVar, str, j12, aVar, nVar, eVar, j13, jVar, s1Var, xVar, gVar, (ae.j) null);
    }

    public final float c() {
        return this.f12298a.a();
    }

    public final long d() {
        return this.f12309l;
    }

    public final u2.a e() {
        return this.f12306i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return v(a0Var) && w(a0Var);
    }

    public final l1.z f() {
        return this.f12298a.e();
    }

    public final long g() {
        return this.f12298a.c();
    }

    public final n1.g h() {
        return this.f12312o;
    }

    public int hashCode() {
        int iC = l1.j0.C(g()) * 31;
        l1.z zVarF = f();
        int iHashCode = (((((iC + (zVarF != null ? zVarF.hashCode() : 0)) * 31) + Float.hashCode(c())) * 31) + w2.t.i(this.f12299b)) * 31;
        n2.i0 i0Var = this.f12300c;
        int iHashCode2 = (iHashCode + (i0Var != null ? i0Var.hashCode() : 0)) * 31;
        n2.e0 e0Var = this.f12301d;
        int iG = (iHashCode2 + (e0Var != null ? n2.e0.g(e0Var.i()) : 0)) * 31;
        n2.f0 f0Var = this.f12302e;
        int iF = (iG + (f0Var != null ? n2.f0.f(f0Var.j()) : 0)) * 31;
        n2.t tVar = this.f12303f;
        int iHashCode3 = (iF + (tVar != null ? tVar.hashCode() : 0)) * 31;
        String str = this.f12304g;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + w2.t.i(this.f12305h)) * 31;
        u2.a aVar = this.f12306i;
        int iF2 = (iHashCode4 + (aVar != null ? u2.a.f(aVar.h()) : 0)) * 31;
        u2.n nVar = this.f12307j;
        int iHashCode5 = (iF2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        q2.e eVar = this.f12308k;
        int iHashCode6 = (((iHashCode5 + (eVar != null ? eVar.hashCode() : 0)) * 31) + l1.j0.C(this.f12309l)) * 31;
        u2.j jVar = this.f12310m;
        int iHashCode7 = (iHashCode6 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        s1 s1Var = this.f12311n;
        int iHashCode8 = (((iHashCode7 + (s1Var != null ? s1Var.hashCode() : 0)) * 31) + 0) * 31;
        n1.g gVar = this.f12312o;
        return iHashCode8 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final n2.t i() {
        return this.f12303f;
    }

    public final String j() {
        return this.f12304g;
    }

    public final long k() {
        return this.f12299b;
    }

    public final n2.e0 l() {
        return this.f12301d;
    }

    public final n2.f0 m() {
        return this.f12302e;
    }

    public final n2.i0 n() {
        return this.f12300c;
    }

    public final long o() {
        return this.f12305h;
    }

    public final q2.e p() {
        return this.f12308k;
    }

    public final x q() {
        return null;
    }

    public final s1 r() {
        return this.f12311n;
    }

    public final u2.j s() {
        return this.f12310m;
    }

    public final u2.m t() {
        return this.f12298a;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) l1.j0.D(g())) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + ((Object) w2.t.j(this.f12299b)) + ", fontWeight=" + this.f12300c + ", fontStyle=" + this.f12301d + ", fontSynthesis=" + this.f12302e + ", fontFamily=" + this.f12303f + ", fontFeatureSettings=" + this.f12304g + ", letterSpacing=" + ((Object) w2.t.j(this.f12305h)) + ", baselineShift=" + this.f12306i + ", textGeometricTransform=" + this.f12307j + ", localeList=" + this.f12308k + ", background=" + ((Object) l1.j0.D(this.f12309l)) + ", textDecoration=" + this.f12310m + ", shadow=" + this.f12311n + ", platformStyle=" + ((Object) null) + ", drawStyle=" + this.f12312o + ')';
    }

    public final u2.n u() {
        return this.f12307j;
    }

    public final boolean v(a0 a0Var) {
        if (this == a0Var) {
            return true;
        }
        return w2.t.e(this.f12299b, a0Var.f12299b) && ae.r.b(this.f12300c, a0Var.f12300c) && ae.r.b(this.f12301d, a0Var.f12301d) && ae.r.b(this.f12302e, a0Var.f12302e) && ae.r.b(this.f12303f, a0Var.f12303f) && ae.r.b(this.f12304g, a0Var.f12304g) && w2.t.e(this.f12305h, a0Var.f12305h) && ae.r.b(this.f12306i, a0Var.f12306i) && ae.r.b(this.f12307j, a0Var.f12307j) && ae.r.b(this.f12308k, a0Var.f12308k) && l1.j0.w(this.f12309l, a0Var.f12309l) && ae.r.b(null, null);
    }

    public final boolean w(a0 a0Var) {
        return ae.r.b(this.f12298a, a0Var.f12298a) && ae.r.b(this.f12310m, a0Var.f12310m) && ae.r.b(this.f12311n, a0Var.f12311n) && ae.r.b(this.f12312o, a0Var.f12312o);
    }

    public final a0 x(a0 a0Var) {
        return a0Var == null ? this : b0.b(this, a0Var.f12298a.c(), a0Var.f12298a.e(), a0Var.f12298a.a(), a0Var.f12299b, a0Var.f12300c, a0Var.f12301d, a0Var.f12302e, a0Var.f12303f, a0Var.f12304g, a0Var.f12305h, a0Var.f12306i, a0Var.f12307j, a0Var.f12308k, a0Var.f12309l, a0Var.f12310m, a0Var.f12311n, null, a0Var.f12312o);
    }

    public final a0 y(a0 a0Var) {
        return x(a0Var);
    }
}
