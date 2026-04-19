package b2;

import android.view.Choreographer;
import md.t;
import qd.g;
import t0.c1;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements t0.c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Choreographer f5211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f5212b;

    static final class a extends ae.s implements zd.l<Throwable, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0 f5213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f5214b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b0 b0Var, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f5213a = b0Var;
            this.f5214b = frameCallback;
        }

        public final void a(Throwable th) {
            this.f5213a.y0(this.f5214b);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            a(th);
            return md.i0.f15558a;
        }
    }

    static final class b extends ae.s implements zd.l<Throwable, md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f5216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f5216b = frameCallback;
        }

        public final void a(Throwable th) {
            d0.this.b().removeFrameCallback(this.f5216b);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            a(th);
            return md.i0.f15558a;
        }
    }

    static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ le.o<R> f5217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f5218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.l<Long, R> f5219c;

        /* JADX WARN: Multi-variable type inference failed */
        c(le.o<? super R> oVar, d0 d0Var, zd.l<? super Long, ? extends R> lVar) {
            this.f5217a = oVar;
            this.f5218b = d0Var;
            this.f5219c = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objB;
            qd.d dVar = this.f5217a;
            zd.l<Long, R> lVar = this.f5219c;
            try {
                t.a aVar = md.t.f15576b;
                objB = md.t.b(lVar.invoke(Long.valueOf(j10)));
            } catch (Throwable th) {
                t.a aVar2 = md.t.f15576b;
                objB = md.t.b(md.u.a(th));
            }
            dVar.resumeWith(objB);
        }
    }

    public d0(Choreographer choreographer, b0 b0Var) {
        this.f5211a = choreographer;
        this.f5212b = b0Var;
    }

    @Override // t0.c1
    public <R> Object M(zd.l<? super Long, ? extends R> lVar, qd.d<? super R> dVar) {
        zd.l<? super Throwable, md.i0> bVar;
        b0 b0Var = this.f5212b;
        if (b0Var == null) {
            g.b bVar2 = dVar.getContext().get(qd.e.U);
            b0Var = bVar2 instanceof b0 ? (b0) bVar2 : null;
        }
        le.p pVar = new le.p(rd.c.c(dVar), 1);
        pVar.A();
        c cVar = new c(pVar, this, lVar);
        if (b0Var == null || !ae.r.b(b0Var.s0(), b())) {
            b().postFrameCallback(cVar);
            bVar = new b(cVar);
        } else {
            b0Var.x0(cVar);
            bVar = new a(b0Var, cVar);
        }
        pVar.p(bVar);
        Object objX = pVar.x();
        if (objX == rd.d.e()) {
            sd.f.c(dVar);
        }
        return objX;
    }

    public final Choreographer b() {
        return this.f5211a;
    }

    @Override // qd.g.b, qd.g
    public <R> R fold(R r10, zd.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) c1.a.a(this, r10, pVar);
    }

    @Override // qd.g.b, qd.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) c1.a.b(this, cVar);
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
