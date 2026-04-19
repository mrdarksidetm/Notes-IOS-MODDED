package pe;

import md.i0;
import qe.l0;

/* JADX INFO: loaded from: classes2.dex */
final class w<T> implements oe.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.g f18371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f18372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zd.p<T, qd.d<? super i0>, Object> f18373c;

    @sd.d(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    static final class a extends sd.j implements zd.p<T, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f18375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ oe.f<T> f18376c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(oe.f<? super T> fVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f18376c = fVar;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, qd.d<? super i0> dVar) {
            return ((a) create(t10, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            a aVar = new a(this.f18376c, dVar);
            aVar.f18375b = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type qd.d to pe.w$a for r3v1 'this'  qd.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r3.f18374a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                md.u.b(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                md.u.b(r4)
                java.lang.Object r4 = r3.f18375b
                oe.f<T> r1 = r3.f18376c
                r3.f18374a = r2
                java.lang.Object r4 = r1.b(r4, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                md.i0 r4 = md.i0.f15558a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.w.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public w(oe.f<? super T> fVar, qd.g gVar) {
        this.f18371a = gVar;
        this.f18372b = l0.b(gVar);
        this.f18373c = new a(fVar, null);
    }

    @Override // oe.f
    public Object b(T t10, qd.d<? super i0> dVar) {
        Object objB = f.b(this.f18371a, t10, this.f18372b, this.f18373c, dVar);
        return objB == rd.d.e() ? objB : i0.f15558a;
    }
}
