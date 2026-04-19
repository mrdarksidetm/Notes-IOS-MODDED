package t0;

import java.util.ArrayList;
import java.util.List;
import md.t;

/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21034a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<qd.d<md.i0>> f21035b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<qd.d<md.i0>> f21036c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21037d = true;

    static final class a extends ae.s implements zd.l<Throwable, md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ le.o<md.i0> f21039b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(le.o<? super md.i0> oVar) {
            super(1);
            this.f21039b = oVar;
        }

        public final void a(Throwable th) {
            Object obj = x0.this.f21034a;
            x0 x0Var = x0.this;
            le.o<md.i0> oVar = this.f21039b;
            synchronized (obj) {
                x0Var.f21035b.remove(oVar);
                md.i0 i0Var = md.i0.f15558a;
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            a(th);
            return md.i0.f15558a;
        }
    }

    public final Object c(qd.d<? super md.i0> dVar) {
        if (e()) {
            return md.i0.f15558a;
        }
        le.p pVar = new le.p(rd.c.c(dVar), 1);
        pVar.A();
        synchronized (this.f21034a) {
            this.f21035b.add(pVar);
        }
        pVar.p(new a(pVar));
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX == rd.d.e() ? objX : md.i0.f15558a;
    }

    public final void d() {
        synchronized (this.f21034a) {
            this.f21037d = false;
            md.i0 i0Var = md.i0.f15558a;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f21034a) {
            z10 = this.f21037d;
        }
        return z10;
    }

    public final void f() {
        synchronized (this.f21034a) {
            if (e()) {
                return;
            }
            List<qd.d<md.i0>> list = this.f21035b;
            this.f21035b = this.f21036c;
            this.f21036c = list;
            this.f21037d = true;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                qd.d<md.i0> dVar = list.get(i10);
                t.a aVar = md.t.f15576b;
                dVar.resumeWith(md.t.b(md.i0.f15558a));
            }
            list.clear();
            md.i0 i0Var = md.i0.f15558a;
        }
    }
}
