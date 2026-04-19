package ne;

import le.l0;
import md.i0;
import ne.u;

/* JADX INFO: loaded from: classes2.dex */
final class q<E> extends e<E> implements r<E> {
    public q(qd.g gVar, d<E> dVar) {
        super(gVar, dVar, true, true);
    }

    @Override // le.a
    protected void P0(Throwable th, boolean z10) {
        if (S0().h(th) || z10) {
            return;
        }
        l0.a(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // le.a
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public void Q0(i0 i0Var) {
        u.a.a(S0(), null, 1, null);
    }

    @Override // le.a, le.i2, le.a2
    public boolean isActive() {
        return super.isActive();
    }
}
