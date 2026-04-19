package q0;

import t0.k1;
import t0.k3;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements h0.o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1 f18467b;

    public b0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public b0(h0.o0 o0Var) {
        this.f18467b = k3.e(o0Var, null, 2, null);
    }

    public /* synthetic */ b0(h0.o0 o0Var, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? h0.q0.a(0, 0, 0, 0) : o0Var);
    }

    @Override // h0.o0
    public int a(w2.d dVar, w2.r rVar) {
        return e().a(dVar, rVar);
    }

    @Override // h0.o0
    public int b(w2.d dVar) {
        return e().b(dVar);
    }

    @Override // h0.o0
    public int c(w2.d dVar, w2.r rVar) {
        return e().c(dVar, rVar);
    }

    @Override // h0.o0
    public int d(w2.d dVar) {
        return e().d(dVar);
    }

    public final h0.o0 e() {
        return (h0.o0) this.f18467b.getValue();
    }

    public final void f(h0.o0 o0Var) {
        this.f18467b.setValue(o0Var);
    }
}
