package t0;

import java.util.ArrayList;
import java.util.List;
import md.t;
import qd.g;
import t0.c1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.a<md.i0> f20679a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Throwable f20681c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20680b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<a<?>> f20682d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<a<?>> f20683e = new ArrayList();

    private static final class a<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zd.l<Long, R> f20684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qd.d<R> f20685b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(zd.l<? super Long, ? extends R> lVar, qd.d<? super R> dVar) {
            this.f20684a = lVar;
            this.f20685b = dVar;
        }

        public final qd.d<R> a() {
            return this.f20685b;
        }

        public final void b(long j10) {
            Object objB;
            qd.d<R> dVar = this.f20685b;
            try {
                t.a aVar = md.t.f15576b;
                objB = md.t.b(this.f20684a.invoke(Long.valueOf(j10)));
            } catch (Throwable th) {
                t.a aVar2 = md.t.f15576b;
                objB = md.t.b(md.u.a(th));
            }
            dVar.resumeWith(objB);
        }
    }

    static final class b extends ae.s implements zd.l<Throwable, md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ae.h0<a<R>> f20687b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ae.h0<a<R>> h0Var) {
            super(1);
            this.f20687b = h0Var;
        }

        public final void a(Throwable th) {
            a aVar;
            Object obj = g.this.f20680b;
            g gVar = g.this;
            ae.h0<a<R>> h0Var = this.f20687b;
            synchronized (obj) {
                List list = gVar.f20682d;
                Object obj2 = h0Var.f712a;
                if (obj2 == null) {
                    ae.r.t("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) obj2;
                }
                list.remove(aVar);
                md.i0 i0Var = md.i0.f15558a;
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            a(th);
            return md.i0.f15558a;
        }
    }

    public g(zd.a<md.i0> aVar) {
        this.f20679a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Throwable th) {
        synchronized (this.f20680b) {
            if (this.f20681c != null) {
                return;
            }
            this.f20681c = th;
            List<a<?>> list = this.f20682d;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                qd.d<?> dVarA = list.get(i10).a();
                t.a aVar = md.t.f15576b;
                dVarA.resumeWith(md.t.b(md.u.a(th)));
            }
            this.f20682d.clear();
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, t0.g$a] */
    @Override // t0.c1
    public <R> Object M(zd.l<? super Long, ? extends R> lVar, qd.d<? super R> dVar) {
        a aVar;
        le.p pVar = new le.p(rd.c.c(dVar), 1);
        pVar.A();
        ae.h0 h0Var = new ae.h0();
        synchronized (this.f20680b) {
            Throwable th = this.f20681c;
            if (th != null) {
                t.a aVar2 = md.t.f15576b;
                pVar.resumeWith(md.t.b(md.u.a(th)));
            } else {
                h0Var.f712a = new a(lVar, pVar);
                boolean z10 = !this.f20682d.isEmpty();
                List list = this.f20682d;
                T t10 = h0Var.f712a;
                if (t10 == 0) {
                    ae.r.t("awaiter");
                    aVar = null;
                } else {
                    aVar = (a) t10;
                }
                list.add(aVar);
                boolean z11 = !z10;
                pVar.p(new b(h0Var));
                if (z11 && this.f20679a != null) {
                    try {
                        this.f20679a.invoke();
                    } catch (Throwable th2) {
                        g(th2);
                    }
                }
            }
        }
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX;
    }

    @Override // qd.g.b, qd.g
    public <R> R fold(R r10, zd.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) c1.a.a(this, r10, pVar);
    }

    @Override // qd.g.b, qd.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) c1.a.b(this, cVar);
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f20680b) {
            z10 = !this.f20682d.isEmpty();
        }
        return z10;
    }

    public final void i(long j10) {
        synchronized (this.f20680b) {
            List<a<?>> list = this.f20682d;
            this.f20682d = this.f20683e;
            this.f20683e = list;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).b(j10);
            }
            list.clear();
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    @Override // qd.g.b, qd.g
    public qd.g minusKey(g.c<?> cVar) {
        return c1.a.c(this, cVar);
    }

    @Override // qd.g
    public qd.g plus(qd.g gVar) {
        return c1.a.d(this, gVar);
    }
}
