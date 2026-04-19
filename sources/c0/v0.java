package c0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import le.a2;
import qd.g;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<a> f6215a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ue.a f6216b = ue.c.b(false, 1, null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s0 f6217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a2 f6218b;

        public a(s0 s0Var, a2 a2Var) {
            this.f6217a = s0Var;
            this.f6218b = a2Var;
        }

        public final boolean a(a aVar) {
            return this.f6217a.compareTo(aVar.f6217a) >= 0;
        }

        public final void b() {
            this.f6218b.cancel((CancellationException) new t0());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @sd.d(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {184, 132}, m = "invokeSuspend")
    static final class b<R> extends sd.j implements zd.p<le.n0, qd.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f6220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f6221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f6222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f6223e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ s0 f6224f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ v0 f6225g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ zd.l<qd.d<? super R>, Object> f6226h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(s0 s0Var, v0 v0Var, zd.l<? super qd.d<? super R>, ? extends Object> lVar, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f6224f = s0Var;
            this.f6225g = v0Var;
            this.f6226h = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<md.i0> create(Object obj, qd.d<?> dVar) {
            b bVar = new b(this.f6224f, this.f6225g, this.f6226h, dVar);
            bVar.f6223e = obj;
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
            zd.l<qd.d<? super R>, Object> lVar;
            a aVar2;
            v0 v0Var;
            a aVar3;
            Throwable th;
            v0 v0Var2;
            ue.a aVar4;
            Object objE = rd.d.e();
            ?? r12 = this.f6222d;
            try {
                try {
                    if (r12 == 0) {
                        md.u.b(obj);
                        le.n0 n0Var = (le.n0) this.f6223e;
                        s0 s0Var = this.f6224f;
                        g.b bVar = n0Var.getCoroutineContext().get(a2.R);
                        ae.r.c(bVar);
                        a aVar5 = new a(s0Var, (a2) bVar);
                        this.f6225g.f(aVar5);
                        aVar = this.f6225g.f6216b;
                        zd.l<qd.d<? super R>, Object> lVar2 = this.f6226h;
                        v0 v0Var3 = this.f6225g;
                        this.f6223e = aVar5;
                        this.f6219a = aVar;
                        this.f6220b = lVar2;
                        this.f6221c = v0Var3;
                        this.f6222d = 1;
                        if (aVar.a(null, this) == objE) {
                            return objE;
                        }
                        lVar = lVar2;
                        aVar2 = aVar5;
                        v0Var = v0Var3;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v0Var2 = (v0) this.f6220b;
                            aVar4 = (ue.a) this.f6219a;
                            aVar3 = (a) this.f6223e;
                            try {
                                md.u.b(obj);
                                u0.a(v0Var2.f6215a, aVar3, null);
                                aVar4.b(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                u0.a(v0Var2.f6215a, aVar3, null);
                                throw th;
                            }
                        }
                        v0Var = (v0) this.f6221c;
                        lVar = (zd.l) this.f6220b;
                        ue.a aVar6 = (ue.a) this.f6219a;
                        aVar2 = (a) this.f6223e;
                        md.u.b(obj);
                        aVar = aVar6;
                    }
                    this.f6223e = aVar2;
                    this.f6219a = aVar;
                    this.f6220b = v0Var;
                    this.f6221c = null;
                    this.f6222d = 2;
                    Object objInvoke = lVar.invoke(this);
                    if (objInvoke == objE) {
                        return objE;
                    }
                    v0Var2 = v0Var;
                    aVar4 = aVar;
                    obj = objInvoke;
                    aVar3 = aVar2;
                    u0.a(v0Var2.f6215a, aVar3, null);
                    aVar4.b(null);
                    return obj;
                } catch (Throwable th3) {
                    aVar3 = aVar2;
                    th = th3;
                    v0Var2 = v0Var;
                    u0.a(v0Var2.f6215a, aVar3, null);
                    throw th;
                }
            } catch (Throwable th4) {
                r12.b(null);
                throw th4;
            }
        }
    }

    public static /* synthetic */ Object e(v0 v0Var, s0 s0Var, zd.l lVar, qd.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s0Var = s0.Default;
        }
        return v0Var.d(s0Var, lVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = this.f6215a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!u0.a(this.f6215a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final <R> Object d(s0 s0Var, zd.l<? super qd.d<? super R>, ? extends Object> lVar, qd.d<? super R> dVar) {
        return le.o0.e(new b(s0Var, this, lVar, null), dVar);
    }
}
