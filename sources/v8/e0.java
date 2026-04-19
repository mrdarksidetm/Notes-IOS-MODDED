package v8;

/* JADX INFO: loaded from: classes.dex */
final class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ p9.l f22229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g0 f22230b;

    e0(g0 g0Var, p9.l lVar) {
        this.f22230b = g0Var;
        this.f22229a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g0.W(this.f22230b, this.f22229a);
    }
}
