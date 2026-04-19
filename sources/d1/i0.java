package d1;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9359a = p.H().f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i0 f9360b;

    public abstract void c(i0 i0Var);

    public abstract i0 d();

    public final i0 e() {
        return this.f9360b;
    }

    public final int f() {
        return this.f9359a;
    }

    public final void g(i0 i0Var) {
        this.f9360b = i0Var;
    }

    public final void h(int i10) {
        this.f9359a = i10;
    }
}
