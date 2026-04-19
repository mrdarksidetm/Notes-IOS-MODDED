package d1;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0.f f9357a = new t0.f(0);

    public final boolean x(int i10) {
        return (i10 & g.a(this.f9357a.get())) != 0;
    }

    public final void y(int i10) {
        int iA;
        do {
            iA = g.a(this.f9357a.get());
            if ((iA & i10) != 0) {
                return;
            }
        } while (!this.f9357a.compareAndSet(iA, g.a(iA | i10)));
    }
}
