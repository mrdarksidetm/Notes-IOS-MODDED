package v1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f21888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f21890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f21891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f21892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f21895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<f> f21896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f21897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e f21898m;

    private b0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f21886a = j10;
        this.f21887b = j11;
        this.f21888c = j12;
        this.f21889d = z10;
        this.f21890e = f10;
        this.f21891f = j13;
        this.f21892g = j14;
        this.f21893h = z11;
        this.f21894i = i10;
        this.f21895j = j15;
        this.f21897l = k1.f.f14338b.c();
        this.f21898m = new e(z12, z12);
    }

    public /* synthetic */ b0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, ae.j jVar) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, (i11 & 512) != 0 ? m0.f21952a.d() : i10, (i11 & 1024) != 0 ? k1.f.f14338b.c() : j15, null);
    }

    public /* synthetic */ b0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, ae.j jVar) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    private b0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List<f> list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, null);
        this.f21896k = list;
        this.f21897l = j16;
    }

    public /* synthetic */ b0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16, ae.j jVar) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, (List<f>) list, j15, j16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b0 c(b0 b0Var, long j10, long j11, long j12, long j13, boolean z10, float f10, long j14, long j15, boolean z11, int i10, List list, long j16, int i11, Object obj) {
        return b0Var.b((i11 & 1) != 0 ? b0Var.f21886a : j10, (i11 & 2) != 0 ? b0Var.f21887b : j11, (i11 & 4) != 0 ? b0Var.f21888c : j12, (i11 & 8) != 0 ? b0Var.f21897l : j13, (i11 & 16) != 0 ? b0Var.f21889d : z10, (i11 & 32) != 0 ? b0Var.f21890e : f10, (i11 & 64) != 0 ? b0Var.f21891f : j14, (i11 & 128) != 0 ? b0Var.f21892g : j15, (i11 & 256) != 0 ? b0Var.f21893h : z11, (i11 & 512) != 0 ? b0Var.f21894i : i10, (i11 & 1024) != 0 ? b0Var.f() : list, (i11 & 2048) != 0 ? b0Var.f21895j : j16);
    }

    public final void a() {
        this.f21898m.c(true);
        this.f21898m.d(true);
    }

    public final b0 b(long j10, long j11, long j12, long j13, boolean z10, float f10, long j14, long j15, boolean z11, int i10, List<f> list, long j16) {
        b0 b0Var = new b0(j10, j11, j12, z10, f10, j14, j15, z11, false, i10, list, j16, j13, null);
        b0Var.f21898m = this.f21898m;
        return b0Var;
    }

    public final b0 d(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List<f> list, long j15) {
        return c(this, j10, j11, j12, 0L, z10, this.f21890e, j13, j14, z11, i10, list, j15, 8, null);
    }

    public final List<f> f() {
        List<f> list = this.f21896k;
        return list == null ? nd.u.m() : list;
    }

    public final long g() {
        return this.f21886a;
    }

    public final long h() {
        return this.f21897l;
    }

    public final long i() {
        return this.f21888c;
    }

    public final boolean j() {
        return this.f21889d;
    }

    public final float k() {
        return this.f21890e;
    }

    public final long l() {
        return this.f21892g;
    }

    public final boolean m() {
        return this.f21893h;
    }

    public final long n() {
        return this.f21895j;
    }

    public final int o() {
        return this.f21894i;
    }

    public final long p() {
        return this.f21887b;
    }

    public final boolean q() {
        return this.f21898m.a() || this.f21898m.b();
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) a0.f(this.f21886a)) + ", uptimeMillis=" + this.f21887b + ", position=" + ((Object) k1.f.v(this.f21888c)) + ", pressed=" + this.f21889d + ", pressure=" + this.f21890e + ", previousUptimeMillis=" + this.f21891f + ", previousPosition=" + ((Object) k1.f.v(this.f21892g)) + ", previousPressed=" + this.f21893h + ", isConsumed=" + q() + ", type=" + ((Object) m0.i(this.f21894i)) + ", historical=" + f() + ",scrollDelta=" + ((Object) k1.f.v(this.f21895j)) + ')';
    }
}
