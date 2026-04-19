package pe;

import le.e2;
import md.i0;
import qd.g;

/* JADX INFO: loaded from: classes2.dex */
public final class q<T> extends kotlin.coroutines.jvm.internal.b implements oe.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe.f<T> f18359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd.g f18360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private qd.g f18362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private qd.d<? super i0> f18363e;

    static final class a extends ae.s implements zd.p<Integer, g.b, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18364a = new a();

        a() {
            super(2);
        }

        public final Integer a(int i10, g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(oe.f<? super T> fVar, qd.g gVar) {
        super(n.f18353a, qd.h.f19040a);
        this.f18359a = fVar;
        this.f18360b = gVar;
        this.f18361c = ((Number) gVar.fold(0, a.f18364a)).intValue();
    }

    private final void a(qd.g gVar, qd.g gVar2, T t10) {
        if (gVar2 instanceof k) {
            m((k) gVar2, t10);
        }
        s.a(this, gVar);
    }

    private final Object c(qd.d<? super i0> dVar, T t10) {
        qd.g context = dVar.getContext();
        e2.m(context);
        qd.g gVar = this.f18362d;
        if (gVar != context) {
            a(context, gVar, t10);
            this.f18362d = context;
        }
        this.f18363e = dVar;
        zd.q qVar = r.f18365a;
        oe.f<T> fVar = this.f18359a;
        ae.r.d(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        ae.r.d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = qVar.invoke(fVar, t10, this);
        if (!ae.r.b(objInvoke, rd.d.e())) {
            this.f18363e = null;
        }
        return objInvoke;
    }

    private final void m(k kVar, Object obj) {
        throw new IllegalStateException(je.o.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + kVar.f18351a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // oe.f
    public Object b(T t10, qd.d<? super i0> dVar) {
        try {
            Object objC = c(dVar, t10);
            if (objC == rd.d.e()) {
                sd.f.c(dVar);
            }
            return objC == rd.d.e() ? objC : i0.f15558a;
        } catch (Throwable th) {
            this.f18362d = new k(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, sd.c
    public sd.c getCallerFrame() {
        qd.d<? super i0> dVar = this.f18363e;
        if (dVar instanceof sd.c) {
            return (sd.c) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.b, qd.d
    public qd.g getContext() {
        qd.g gVar = this.f18362d;
        return gVar == null ? qd.h.f19040a : gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Throwable thE = md.t.e(obj);
        if (thE != null) {
            this.f18362d = new k(thE, getContext());
        }
        qd.d<? super i0> dVar = this.f18363e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return rd.d.e();
    }

    @Override // kotlin.coroutines.jvm.internal.b, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
