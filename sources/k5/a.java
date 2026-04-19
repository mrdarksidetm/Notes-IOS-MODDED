package k5;

import ae.r;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import le.a2;
import le.k;
import le.n0;
import le.o0;
import le.r1;
import md.i0;
import oe.e;
import oe.f;
import sd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReentrantLock f14399a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<n3.a<?>, a2> f14400b = new LinkedHashMap();

    /* JADX INFO: renamed from: k5.a$a, reason: collision with other inner class name */
    @d(c = "androidx.window.java.core.CallbackToFlowAdapter$connect$1$1", f = "CallbackToFlowAdapter.kt", l = {R.styleable.AppCompatTheme_checkedTextViewStyle}, m = "invokeSuspend")
    static final class C0335a extends j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e<T> f14402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n3.a<T> f14403c;

        /* JADX INFO: renamed from: k5.a$a$a, reason: collision with other inner class name */
        static final class C0336a<T> implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n3.a<T> f14404a;

            C0336a(n3.a<T> aVar) {
                this.f14404a = aVar;
            }

            @Override // oe.f
            public final Object b(T t10, qd.d<? super i0> dVar) {
                this.f14404a.accept(t10);
                return i0.f15558a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0335a(e<? extends T> eVar, n3.a<T> aVar, qd.d<? super C0335a> dVar) {
            super(2, dVar);
            this.f14402b = eVar;
            this.f14403c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new C0335a(this.f14402b, this.f14403c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((C0335a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type qd.d to k5.a$a for r4v1 'this'  qd.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = rd.b.e()
                int r1 = r4.f14401a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                md.u.b(r5)
                goto L2c
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                md.u.b(r5)
                oe.e<T> r5 = r4.f14402b
                k5.a$a$a r1 = new k5.a$a$a
                n3.a<T> r3 = r4.f14403c
                r1.<init>(r3)
                r4.f14401a = r2
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L2c
                return r0
            L2c:
                md.i0 r5 = md.i0.f15558a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: k5.a.C0335a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final <T> void a(Executor executor, n3.a<T> aVar, e<? extends T> eVar) {
        r.f(executor, "executor");
        r.f(aVar, "consumer");
        r.f(eVar, "flow");
        ReentrantLock reentrantLock = this.f14399a;
        reentrantLock.lock();
        try {
            if (this.f14400b.get(aVar) == null) {
                this.f14400b.put(aVar, k.d(o0.a(r1.a(executor)), null, null, new C0335a(eVar, aVar, null), 3, null));
            }
            i0 i0Var = i0.f15558a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(n3.a<?> aVar) {
        r.f(aVar, "consumer");
        ReentrantLock reentrantLock = this.f14399a;
        reentrantLock.lock();
        try {
            a2 a2Var = this.f14400b.get(aVar);
            if (a2Var != null) {
                a2.a.b(a2Var, null, 1, null);
            }
            this.f14400b.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
