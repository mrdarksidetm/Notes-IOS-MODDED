package c0;

import t0.k3;

/* JADX INFO: loaded from: classes.dex */
public abstract class h1<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0.k1 f6074a;

    private h1() {
        this.f6074a = k3.e(Boolean.FALSE, null, 2, null);
    }

    public /* synthetic */ h1(ae.j jVar) {
        this();
    }

    public abstract S a();

    public abstract S b();

    public final void c(boolean z10) {
        this.f6074a.setValue(Boolean.valueOf(z10));
    }

    public abstract void d(f1<S> f1Var);
}
