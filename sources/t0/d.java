package t0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20638a;

    public d(int i10) {
        this.f20638a = i10;
    }

    public final int a() {
        return this.f20638a;
    }

    public final boolean b() {
        return this.f20638a != Integer.MIN_VALUE;
    }

    public final void c(int i10) {
        this.f20638a = i10;
    }

    public final int d(s2 s2Var) {
        return s2Var.d(this);
    }

    public final int e(v2 v2Var) {
        return v2Var.G(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.f20638a + " }";
    }
}
