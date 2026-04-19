package pe;

import md.i0;
import qd.e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g<S, T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final oe.e<S> f18328d;

    @sd.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<oe.f<? super T>, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f18330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g<S, T> f18331c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g<S, T> gVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f18331c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            a aVar = new a(this.f18331c, dVar);
            aVar.f18330b = obj;
            return aVar;
        }

        @Override // zd.p
        public final Object invoke(oe.f<? super T> fVar, qd.d<? super i0> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f18329a;
            if (i10 == 0) {
                md.u.b(obj);
                oe.f<? super T> fVar = (oe.f) this.f18330b;
                g<S, T> gVar = this.f18331c;
                this.f18329a = 1;
                if (gVar.s(fVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return i0.f15558a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(oe.e<? extends S> eVar, qd.g gVar, int i10, ne.a aVar) {
        super(gVar, i10, aVar);
        this.f18328d = eVar;
    }

    static /* synthetic */ <S, T> Object p(g<S, T> gVar, oe.f<? super T> fVar, qd.d<? super i0> dVar) {
        if (gVar.f18319b == -3) {
            qd.g context = dVar.getContext();
            qd.g gVarE = le.i0.e(context, gVar.f18318a);
            if (ae.r.b(gVarE, context)) {
                Object objS = gVar.s(fVar, dVar);
                return objS == rd.d.e() ? objS : i0.f15558a;
            }
            e.b bVar = qd.e.U;
            if (ae.r.b(gVarE.get(bVar), context.get(bVar))) {
                Object objR = gVar.r(fVar, gVarE, dVar);
                return objR == rd.d.e() ? objR : i0.f15558a;
            }
        }
        Object objA = super.a(fVar, dVar);
        return objA == rd.d.e() ? objA : i0.f15558a;
    }

    static /* synthetic */ <S, T> Object q(g<S, T> gVar, ne.r<? super T> rVar, qd.d<? super i0> dVar) {
        Object objS = gVar.s(new t(rVar), dVar);
        return objS == rd.d.e() ? objS : i0.f15558a;
    }

    private final Object r(oe.f<? super T> fVar, qd.g gVar, qd.d<? super i0> dVar) {
        Object objC = f.c(gVar, f.d(fVar, dVar.getContext()), null, new a(this, null), dVar, 4, null);
        return objC == rd.d.e() ? objC : i0.f15558a;
    }

    @Override // pe.e, oe.e
    public Object a(oe.f<? super T> fVar, qd.d<? super i0> dVar) {
        return p(this, fVar, dVar);
    }

    @Override // pe.e
    protected Object g(ne.r<? super T> rVar, qd.d<? super i0> dVar) {
        return q(this, rVar, dVar);
    }

    protected abstract Object s(oe.f<? super T> fVar, qd.d<? super i0> dVar);

    @Override // pe.e
    public String toString() {
        return this.f18328d + " -> " + super.toString();
    }
}
