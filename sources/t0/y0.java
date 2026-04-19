package t0;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.p<le.n0, qd.d<? super md.i0>, Object> f21043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final le.n0 f21044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private le.a2 f21045c;

    /* JADX WARN: Multi-variable type inference failed */
    public y0(qd.g gVar, zd.p<? super le.n0, ? super qd.d<? super md.i0>, ? extends Object> pVar) {
        this.f21043a = pVar;
        this.f21044b = le.o0.a(gVar);
    }

    @Override // t0.k2
    public void b() {
        le.a2 a2Var = this.f21045c;
        if (a2Var != null) {
            a2Var.cancel((CancellationException) new a1());
        }
        this.f21045c = null;
    }

    @Override // t0.k2
    public void c() {
        le.a2 a2Var = this.f21045c;
        if (a2Var != null) {
            a2Var.cancel((CancellationException) new a1());
        }
        this.f21045c = null;
    }

    @Override // t0.k2
    public void d() {
        le.a2 a2Var = this.f21045c;
        if (a2Var != null) {
            le.g2.e(a2Var, "Old job was still running!", null, 2, null);
        }
        this.f21045c = le.k.d(this.f21044b, null, null, this.f21043a, 3, null);
    }
}
