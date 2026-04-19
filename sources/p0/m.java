package p0;

import d0.z;
import le.n0;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f17844a;

    public m(boolean z10, p3<f> p3Var) {
        this.f17844a = new q(z10, p3Var);
    }

    public abstract void e(g0.p pVar, n0 n0Var);

    public final void f(n1.f fVar, float f10, long j10) {
        this.f17844a.b(fVar, f10, j10);
    }

    public abstract void g(g0.p pVar);

    public final void h(g0.j jVar, n0 n0Var) {
        this.f17844a.c(jVar, n0Var);
    }
}
