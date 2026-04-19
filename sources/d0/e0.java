package d0;

import c0.u0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import le.a2;
import qd.g;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<a> f9179a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ue.a f9180b = ue.c.b(false, 1, null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0 f9181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a2 f9182b;

        public a(c0 c0Var, a2 a2Var) {
            this.f9181a = c0Var;
            this.f9182b = a2Var;
        }

        public final boolean a(a aVar) {
            return this.f9181a.compareTo(aVar.f9181a) >= 0;
        }

        public final void b() {
            this.f9182b.cancel((CancellationException) new d0());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @sd.d(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {220, 173}, m = "invokeSuspend")
    static final class b<R> extends sd.j implements zd.p<le.n0, qd.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f9184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f9185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f9186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f9188f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c0 f9189g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ e0 f9190h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ zd.p<T, qd.d<? super R>, Object> f9191i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ T f9192j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(c0 c0Var, e0 e0Var, zd.p<? super T, ? super qd.d<? super R>, ? extends Object> pVar, T t10, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f9189g = c0Var;
            this.f9190h = e0Var;
            this.f9191i = pVar;
            this.f9192j = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            b bVar = new b(this.f9189g, this.f9190h, this.f9191i, this.f9192j, dVar);
            bVar.f9188f = obj;
            return bVar;
        }

        @Override // zd.p
        public final Object invoke(le.n0 n0Var, qd.d<? super R> dVar) {
            return ((b) create(n0Var, dVar)).invokeSuspend(md.i0.f15558a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, ue.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            ue.a aVar;
            zd.p pVar;
            Object obj2;
            a aVar2;
            e0 e0Var;
            a aVar3;
            Throwable th;
            e0 e0Var2;
            ue.a aVar4;
            Object objE = rd.d.e();
            ?? r12 = this.f9187e;
            try {
                try {
                    if (r12 == 0) {
                        md.u.b(obj);
                        le.n0 n0Var = (le.n0) this.f9188f;
                        c0 c0Var = this.f9189g;
                        g.b bVar = n0Var.getCoroutineContext().get(a2.R);
                        ae.r.c(bVar);
                        a aVar5 = new a(c0Var, (a2) bVar);
                        this.f9190h.e(aVar5);
                        aVar = this.f9190h.f9180b;
                        pVar = this.f9191i;
                        Object obj3 = this.f9192j;
                        e0 e0Var3 = this.f9190h;
                        this.f9188f = aVar5;
                        this.f9183a = aVar;
                        this.f9184b = pVar;
                        this.f9185c = obj3;
                        this.f9186d = e0Var3;
                        this.f9187e = 1;
                        if (aVar.a(null, this) == objE) {
                            return objE;
                        }
                        obj2 = obj3;
                        aVar2 = aVar5;
                        e0Var = e0Var3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e0Var2 = (e0) this.f9184b;
                            aVar4 = (ue.a) this.f9183a;
                            aVar3 = (a) this.f9188f;
                            try {
                                md.u.b(obj);
                                u0.a(e0Var2.f9179a, aVar3, null);
                                aVar4.b(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                u0.a(e0Var2.f9179a, aVar3, null);
                                throw th;
                            }
                        }
                        e0Var = (e0) this.f9186d;
                        obj2 = this.f9185c;
                        pVar = (zd.p) this.f9184b;
                        ue.a aVar6 = (ue.a) this.f9183a;
                        aVar2 = (a) this.f9188f;
                        md.u.b(obj);
                        aVar = aVar6;
                    }
                    this.f9188f = aVar2;
                    this.f9183a = aVar;
                    this.f9184b = e0Var;
                    this.f9185c = null;
                    this.f9186d = null;
                    this.f9187e = 2;
                    Object objInvoke = pVar.invoke(obj2, this);
                    if (objInvoke == objE) {
                        return objE;
                    }
                    e0Var2 = e0Var;
                    aVar4 = aVar;
                    obj = objInvoke;
                    aVar3 = aVar2;
                    u0.a(e0Var2.f9179a, aVar3, null);
                    aVar4.b(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    e0Var2 = e0Var;
                    u0.a(e0Var2.f9179a, aVar3, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.b(null);
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f9179a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!u0.a(this.f9179a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final <T, R> Object d(T t10, c0 c0Var, zd.p<? super T, ? super qd.d<? super R>, ? extends Object> pVar, qd.d<? super R> dVar) {
        return le.o0.e(new b(c0Var, this, pVar, t10, null), dVar);
    }
}
