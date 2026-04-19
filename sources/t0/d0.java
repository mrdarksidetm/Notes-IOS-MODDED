package t0;

import android.view.Choreographer;
import md.t;
import qd.g;
import t0.c1;

/* JADX INFO: loaded from: classes.dex */
final class d0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f20639a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Choreographer f20640b = (Choreographer) le.i.e(le.d1.c().m0(), new a(null));

    @sd.d(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<le.n0, qd.d<? super Choreographer>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20641a;

        a(qd.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            return new a(dVar);
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super Choreographer> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f20641a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            md.u.b(obj);
            return Choreographer.getInstance();
        }
    }

    static final class b extends ae.s implements zd.l<Throwable, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f20642a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f20642a = frameCallback;
        }

        public final void a(Throwable th) {
            d0.f20640b.removeFrameCallback(this.f20642a);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
            a(th);
            return md.i0.f15558a;
        }
    }

    static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ le.o<R> f20643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<Long, R> f20644b;

        /* JADX WARN: Multi-variable type inference failed */
        c(le.o<? super R> oVar, zd.l<? super Long, ? extends R> lVar) {
            this.f20643a = oVar;
            this.f20644b = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objB;
            qd.d dVar = this.f20643a;
            d0 d0Var = d0.f20639a;
            zd.l<Long, R> lVar = this.f20644b;
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

    private d0() {
    }

    @Override // t0.c1
    public <R> Object M(zd.l<? super Long, ? extends R> lVar, qd.d<? super R> dVar) {
        le.p pVar = new le.p(rd.c.c(dVar), 1);
        pVar.A();
        c cVar = new c(pVar, lVar);
        f20640b.postFrameCallback(cVar);
        pVar.p(new b(cVar));
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

    @Override // qd.g.b, qd.g
    public qd.g minusKey(g.c<?> cVar) {
        return c1.a.c(this, cVar);
    }

    @Override // qd.g
    public qd.g plus(qd.g gVar) {
        return c1.a.d(this, gVar);
    }
}
