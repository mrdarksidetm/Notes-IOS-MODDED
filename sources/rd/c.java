package rd;

import ae.n0;
import ae.r;
import md.i0;
import md.u;
import qd.g;
import sd.f;
import sd.h;
import zd.p;
import zd.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f19465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f19466c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qd.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f19465b = pVar;
            this.f19466c = obj;
            r.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.f19464a;
            if (i10 == 0) {
                this.f19464a = 1;
                u.b(obj);
                r.d(this.f19465b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) n0.e(this.f19465b, 2)).invoke(this.f19466c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f19464a = 2;
            u.b(obj);
            return obj;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f19468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f19469c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qd.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f19468b = pVar;
            this.f19469c = obj;
            r.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            int i10 = this.f19467a;
            if (i10 == 0) {
                this.f19467a = 1;
                u.b(obj);
                r.d(this.f19468b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) n0.e(this.f19468b, 2)).invoke(this.f19469c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f19467a = 2;
            u.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: rd.c$c, reason: collision with other inner class name */
    public static final class C0408c extends h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0408c(qd.d<? super T> dVar) {
            super(dVar);
            r.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            u.b(obj);
            return obj;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(qd.d<? super T> dVar, g gVar) {
            super(dVar, gVar);
            r.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) throws Throwable {
            u.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> qd.d<i0> a(p<? super R, ? super qd.d<? super T>, ? extends Object> pVar, R r10, qd.d<? super T> dVar) {
        r.f(pVar, "<this>");
        r.f(dVar, "completion");
        qd.d<?> dVarA = f.a(dVar);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r10, dVarA);
        }
        g context = dVarA.getContext();
        return context == qd.h.f19040a ? new a(dVarA, pVar, r10) : new b(dVarA, context, pVar, r10);
    }

    private static final <T> qd.d<T> b(qd.d<? super T> dVar) {
        g context = dVar.getContext();
        return context == qd.h.f19040a ? new C0408c(dVar) : new d(dVar, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> qd.d<T> c(qd.d<? super T> dVar) {
        qd.d<T> dVar2;
        r.f(dVar, "<this>");
        kotlin.coroutines.jvm.internal.b bVar = dVar instanceof kotlin.coroutines.jvm.internal.b ? (kotlin.coroutines.jvm.internal.b) dVar : null;
        return (bVar == null || (dVar2 = (qd.d<T>) bVar.intercepted()) == null) ? dVar : dVar2;
    }

    public static <R, P, T> Object d(q<? super R, ? super P, ? super qd.d<? super T>, ? extends Object> qVar, R r10, P p10, qd.d<? super T> dVar) {
        r.f(qVar, "<this>");
        r.f(dVar, "completion");
        return ((q) n0.e(qVar, 3)).invoke(r10, p10, b(f.a(dVar)));
    }
}
