package le;

import md.t;

/* JADX INFO: loaded from: classes2.dex */
final class s2 extends h2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qd.d<md.i0> f15113e;

    /* JADX WARN: Multi-variable type inference failed */
    public s2(qd.d<? super md.i0> dVar) {
        this.f15113e = dVar;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
        r(th);
        return md.i0.f15558a;
    }

    @Override // le.e0
    public void r(Throwable th) {
        qd.d<md.i0> dVar = this.f15113e;
        t.a aVar = md.t.f15576b;
        dVar.resumeWith(md.t.b(md.i0.f15558a));
    }
}
