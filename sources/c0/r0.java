package c0;

import t0.k3;

/* JADX INFO: loaded from: classes.dex */
public final class r0<S> extends h1<S> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f6183d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.k1 f6184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0.k1 f6185c;

    public r0(S s10) {
        super(null);
        this.f6184b = k3.e(s10, null, 2, null);
        this.f6185c = k3.e(s10, null, 2, null);
    }

    @Override // c0.h1
    public S a() {
        return (S) this.f6184b.getValue();
    }

    @Override // c0.h1
    public S b() {
        return (S) this.f6185c.getValue();
    }

    @Override // c0.h1
    public void d(f1<S> f1Var) {
    }

    public void e(S s10) {
        this.f6184b.setValue(s10);
    }

    public void f(S s10) {
        this.f6185c.setValue(s10);
    }
}
