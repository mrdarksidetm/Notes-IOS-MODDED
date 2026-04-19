package oe;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import md.t;

/* JADX INFO: loaded from: classes2.dex */
final class i0 extends pe.d<g0<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f16515a = AtomicReferenceFieldUpdater.newUpdater(i0.class, Object.class, "_state");
    private volatile Object _state;

    @Override // pe.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(g0<?> g0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16515a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, h0.f16507a);
        return true;
    }

    public final Object e(qd.d<? super md.i0> dVar) {
        le.p pVar = new le.p(rd.c.c(dVar), 1);
        pVar.A();
        if (!b3.b.a(f16515a, this, h0.f16507a, pVar)) {
            t.a aVar = md.t.f15576b;
            pVar.resumeWith(md.t.b(md.i0.f15558a));
        }
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX == rd.d.e() ? objX : md.i0.f15558a;
    }

    @Override // pe.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public qd.d<md.i0>[] b(g0<?> g0Var) {
        f16515a.set(this, null);
        return pe.c.f18317a;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16515a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == h0.f16508b) {
                return;
            }
            if (obj == h0.f16507a) {
                if (b3.b.a(f16515a, this, obj, h0.f16508b)) {
                    return;
                }
            } else if (b3.b.a(f16515a, this, obj, h0.f16507a)) {
                t.a aVar = md.t.f15576b;
                ((le.p) obj).resumeWith(md.t.b(md.i0.f15558a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = f16515a.getAndSet(this, h0.f16507a);
        ae.r.c(andSet);
        return andSet == h0.f16508b;
    }
}
