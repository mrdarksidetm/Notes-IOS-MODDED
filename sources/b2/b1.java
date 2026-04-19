package b2;

import f1.d;
import qd.g;

/* JADX INFO: loaded from: classes.dex */
final class b1 implements f1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0.h1 f5205a = t0.v1.a(1.0f);

    public void b(float f10) {
        this.f5205a.h(f10);
    }

    @Override // qd.g.b, qd.g
    public <R> R fold(R r10, zd.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) d.a.a(this, r10, pVar);
    }

    @Override // qd.g.b, qd.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) d.a.b(this, cVar);
    }

    @Override // qd.g.b, qd.g
    public qd.g minusKey(g.c<?> cVar) {
        return d.a.c(this, cVar);
    }

    @Override // qd.g
    public qd.g plus(qd.g gVar) {
        return d.a.d(this, gVar);
    }

    @Override // f1.d
    public float w() {
        return this.f5205a.b();
    }
}
