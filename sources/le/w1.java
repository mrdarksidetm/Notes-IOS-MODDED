package le;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @sd.d(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
    static final class a<T> extends sd.j implements zd.p<n0, qd.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.a<T> f15124c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zd.a<? extends T> aVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f15124c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            a aVar = new a(this.f15124c, dVar);
            aVar.f15123b = obj;
            return aVar;
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super T> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            rd.d.e();
            if (this.f15122a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            md.u.b(obj);
            return w1.d(((n0) this.f15123b).getCoroutineContext(), this.f15124c);
        }
    }

    public static final <T> Object b(qd.g gVar, zd.a<? extends T> aVar, qd.d<? super T> dVar) {
        return i.g(gVar, new a(aVar, null), dVar);
    }

    public static /* synthetic */ Object c(qd.g gVar, zd.a aVar, qd.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = qd.h.f19040a;
        }
        return b(gVar, aVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(qd.g gVar, zd.a<? extends T> aVar) throws Throwable {
        try {
            z2 z2Var = new z2(e2.n(gVar));
            z2Var.d();
            try {
                return aVar.invoke();
            } finally {
                z2Var.a();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
