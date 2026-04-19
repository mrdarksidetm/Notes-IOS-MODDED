package pe;

import qd.g;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements qd.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f18351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ qd.g f18352b;

    public k(Throwable th, qd.g gVar) {
        this.f18351a = th;
        this.f18352b = gVar;
    }

    @Override // qd.g
    public <R> R fold(R r10, zd.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) this.f18352b.fold(r10, pVar);
    }

    @Override // qd.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) this.f18352b.get(cVar);
    }

    @Override // qd.g
    public qd.g minusKey(g.c<?> cVar) {
        return this.f18352b.minusKey(cVar);
    }

    @Override // qd.g
    public qd.g plus(qd.g gVar) {
        return this.f18352b.plus(gVar);
    }
}
