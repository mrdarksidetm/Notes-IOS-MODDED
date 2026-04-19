package androidx.compose.foundation;

import ae.r;
import androidx.compose.ui.e;
import le.n0;
import md.i0;
import md.u;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
final class j extends e.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g0.m f2409n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private g0.d f2410o;

    @sd.d(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", l = {311}, m = "invokeSuspend")
    static final class a extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0.m f2412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0.j f2413c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g0.m mVar, g0.j jVar, qd.d<? super a> dVar) {
            super(2, dVar);
            this.f2412b = mVar;
            this.f2413c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new a(this.f2412b, this.f2413c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((a) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f2411a;
            if (i10 == 0) {
                u.b(obj);
                g0.m mVar = this.f2412b;
                g0.j jVar = this.f2413c;
                this.f2411a = 1;
                if (mVar.c(jVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    public j(g0.m mVar) {
        this.f2409n = mVar;
    }

    private final void a2() {
        g0.d dVar;
        g0.m mVar = this.f2409n;
        if (mVar != null && (dVar = this.f2410o) != null) {
            mVar.a(new g0.e(dVar));
        }
        this.f2410o = null;
    }

    private final void b2(g0.m mVar, g0.j jVar) {
        if (H1()) {
            le.k.d(A1(), null, null, new a(mVar, jVar, null), 3, null);
        } else {
            mVar.a(jVar);
        }
    }

    public final void c2(boolean z10) {
        g0.m mVar = this.f2409n;
        if (mVar != null) {
            if (!z10) {
                g0.d dVar = this.f2410o;
                if (dVar != null) {
                    b2(mVar, new g0.e(dVar));
                    this.f2410o = null;
                    return;
                }
                return;
            }
            g0.d dVar2 = this.f2410o;
            if (dVar2 != null) {
                b2(mVar, new g0.e(dVar2));
                this.f2410o = null;
            }
            g0.d dVar3 = new g0.d();
            b2(mVar, dVar3);
            this.f2410o = dVar3;
        }
    }

    public final void d2(g0.m mVar) {
        if (r.b(this.f2409n, mVar)) {
            return;
        }
        a2();
        this.f2409n = mVar;
    }
}
