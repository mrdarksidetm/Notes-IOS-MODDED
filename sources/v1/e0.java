package v1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f21912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f21913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f21914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f21915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f21916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<f> f21918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f21919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f21920k;

    private e0(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List<f> list, long j14, long j15) {
        this.f21910a = j10;
        this.f21911b = j11;
        this.f21912c = j12;
        this.f21913d = j13;
        this.f21914e = z10;
        this.f21915f = f10;
        this.f21916g = i10;
        this.f21917h = z11;
        this.f21918i = list;
        this.f21919j = j14;
        this.f21920k = j15;
    }

    public /* synthetic */ e0(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, ae.j jVar) {
        this(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15);
    }

    public final boolean a() {
        return this.f21914e;
    }

    public final List<f> b() {
        return this.f21918i;
    }

    public final long c() {
        return this.f21910a;
    }

    public final boolean d() {
        return this.f21917h;
    }

    public final long e() {
        return this.f21920k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return a0.d(this.f21910a, e0Var.f21910a) && this.f21911b == e0Var.f21911b && k1.f.l(this.f21912c, e0Var.f21912c) && k1.f.l(this.f21913d, e0Var.f21913d) && this.f21914e == e0Var.f21914e && Float.compare(this.f21915f, e0Var.f21915f) == 0 && m0.g(this.f21916g, e0Var.f21916g) && this.f21917h == e0Var.f21917h && ae.r.b(this.f21918i, e0Var.f21918i) && k1.f.l(this.f21919j, e0Var.f21919j) && k1.f.l(this.f21920k, e0Var.f21920k);
    }

    public final long f() {
        return this.f21913d;
    }

    public final long g() {
        return this.f21912c;
    }

    public final float h() {
        return this.f21915f;
    }

    public int hashCode() {
        return (((((((((((((((((((a0.e(this.f21910a) * 31) + Long.hashCode(this.f21911b)) * 31) + k1.f.q(this.f21912c)) * 31) + k1.f.q(this.f21913d)) * 31) + Boolean.hashCode(this.f21914e)) * 31) + Float.hashCode(this.f21915f)) * 31) + m0.h(this.f21916g)) * 31) + Boolean.hashCode(this.f21917h)) * 31) + this.f21918i.hashCode()) * 31) + k1.f.q(this.f21919j)) * 31) + k1.f.q(this.f21920k);
    }

    public final long i() {
        return this.f21919j;
    }

    public final int j() {
        return this.f21916g;
    }

    public final long k() {
        return this.f21911b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) a0.f(this.f21910a)) + ", uptime=" + this.f21911b + ", positionOnScreen=" + ((Object) k1.f.v(this.f21912c)) + ", position=" + ((Object) k1.f.v(this.f21913d)) + ", down=" + this.f21914e + ", pressure=" + this.f21915f + ", type=" + ((Object) m0.i(this.f21916g)) + ", issuesEnterExit=" + this.f21917h + ", historical=" + this.f21918i + ", scrollDelta=" + ((Object) k1.f.v(this.f21919j)) + ", originalEventPosition=" + ((Object) k1.f.v(this.f21920k)) + ')';
    }
}
