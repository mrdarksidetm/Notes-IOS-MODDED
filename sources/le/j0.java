package le;

import qd.e;
import qd.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j0 extends qd.a implements qd.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15063b = new a(null);

    public static final class a extends qd.b<qd.e, j0> {

        /* JADX INFO: renamed from: le.j0$a$a, reason: collision with other inner class name */
        static final class C0342a extends ae.s implements zd.l<g.b, j0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0342a f15064a = new C0342a();

            C0342a() {
                super(1);
            }

            @Override // zd.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j0 invoke(g.b bVar) {
                if (bVar instanceof j0) {
                    return (j0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(qd.e.U, C0342a.f15064a);
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public j0() {
        super(qd.e.U);
    }

    @Override // qd.e
    public final void E(qd.d<?> dVar) {
        ae.r.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((qe.j) dVar).t();
    }

    public abstract void g0(qd.g gVar, Runnable runnable);

    @Override // qd.a, qd.g.b, qd.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    public void h0(qd.g gVar, Runnable runnable) {
        g0(gVar, runnable);
    }

    public boolean i0(qd.g gVar) {
        return true;
    }

    public j0 j0(int i10) {
        qe.p.a(i10);
        return new qe.o(this, i10);
    }

    @Override // qd.a, qd.g.b, qd.g
    public qd.g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return r0.a(this) + '@' + r0.b(this);
    }

    @Override // qd.e
    public final <T> qd.d<T> y(qd.d<? super T> dVar) {
        return new qe.j(this, dVar);
    }
}
