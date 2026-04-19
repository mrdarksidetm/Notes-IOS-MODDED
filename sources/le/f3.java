package le;

import qd.g;

/* JADX INFO: loaded from: classes2.dex */
final class f3 implements g.b, g.c<f3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f3 f15024a = new f3();

    private f3() {
    }

    @Override // qd.g.b, qd.g
    public <R> R fold(R r10, zd.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // qd.g.b, qd.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // qd.g.b
    public g.c<?> getKey() {
        return this;
    }

    @Override // qd.g.b, qd.g
    public qd.g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // qd.g
    public qd.g plus(qd.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
