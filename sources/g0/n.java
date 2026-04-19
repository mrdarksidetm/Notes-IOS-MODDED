package g0;

import md.i0;
import oe.x;

/* JADX INFO: loaded from: classes.dex */
final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oe.r<j> f11250a = x.b(0, 16, ne.a.DROP_OLDEST, 1, null);

    @Override // g0.m
    public boolean a(j jVar) {
        return b().i(jVar);
    }

    @Override // g0.m
    public Object c(j jVar, qd.d<? super i0> dVar) {
        Object objB = b().b(jVar, dVar);
        return objB == rd.d.e() ? objB : i0.f15558a;
    }

    @Override // g0.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public oe.r<j> b() {
        return this.f11250a;
    }
}
