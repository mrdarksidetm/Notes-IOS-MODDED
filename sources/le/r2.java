package le;

import md.t;

/* JADX INFO: loaded from: classes2.dex */
final class r2<T> extends h2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p<T> f15108e;

    /* JADX WARN: Multi-variable type inference failed */
    public r2(p<? super T> pVar) {
        this.f15108e = pVar;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
        r(th);
        return md.i0.f15558a;
    }

    @Override // le.e0
    public void r(Throwable th) {
        p<T> pVar;
        Object objH;
        Object objF0 = s().f0();
        if (objF0 instanceof c0) {
            pVar = this.f15108e;
            t.a aVar = md.t.f15576b;
            objH = md.u.a(((c0) objF0).f14990a);
        } else {
            pVar = this.f15108e;
            t.a aVar2 = md.t.f15576b;
            objH = j2.h(objF0);
        }
        pVar.resumeWith(md.t.b(objH));
    }
}
