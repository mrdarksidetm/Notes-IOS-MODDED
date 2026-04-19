package t0;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e1.c f21041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21042b;

    public y(e1.c cVar, boolean z10) {
        this.f21041a = cVar;
        this.f21042b = z10;
    }

    public /* synthetic */ y(e1.c cVar, boolean z10, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? null : cVar, (i10 & 2) != 0 ? false : z10);
    }

    public final e1.c a() {
        return this.f21041a;
    }

    public final boolean b() {
        return this.f21042b;
    }

    public final void c(e1.c cVar) {
        this.f21041a = cVar;
    }
}
