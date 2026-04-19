package se;

import le.p1;

/* JADX INFO: loaded from: classes2.dex */
public class f extends p1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f20563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f20564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f20565h = k0();

    public f(int i10, int i11, long j10, String str) {
        this.f20561d = i10;
        this.f20562e = i11;
        this.f20563f = j10;
        this.f20564g = str;
    }

    private final a k0() {
        return new a(this.f20561d, this.f20562e, this.f20563f, this.f20564g);
    }

    @Override // le.j0
    public void g0(qd.g gVar, Runnable runnable) {
        a.C(this.f20565h, runnable, null, false, 6, null);
    }

    @Override // le.j0
    public void h0(qd.g gVar, Runnable runnable) {
        a.C(this.f20565h, runnable, null, true, 2, null);
    }

    public final void l0(Runnable runnable, i iVar, boolean z10) {
        this.f20565h.A(runnable, iVar, z10);
    }
}
