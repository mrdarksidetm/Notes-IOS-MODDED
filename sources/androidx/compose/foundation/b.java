package androidx.compose.foundation;

import a2.j1;
import ae.s;
import androidx.compose.foundation.a;
import e0.t;
import md.i0;
import md.u;
import v1.k0;
import v1.p0;
import v1.q0;
import v1.r;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
abstract class b extends a2.l implements z1.h, a2.h, j1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f2222p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private g0.m f2223q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private zd.a<i0> f2224r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final a.C0044a f2225s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final zd.a<Boolean> f2226t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final q0 f2227u;

    static final class a extends s implements zd.a<Boolean> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((Boolean) b.this.p(androidx.compose.foundation.gestures.e.h())).booleanValue() || d0.m.c(b.this));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.b$b, reason: collision with other inner class name */
    @sd.d(c = "androidx.compose.foundation.AbstractClickablePointerInputNode$pointerInputNode$1", f = "Clickable.kt", l = {938}, m = "invokeSuspend")
    static final class C0045b extends sd.j implements p<k0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2230b;

        C0045b(qd.d<? super C0045b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            C0045b c0045b = b.this.new C0045b(dVar);
            c0045b.f2230b = obj;
            return c0045b;
        }

        @Override // zd.p
        public final Object invoke(k0 k0Var, qd.d<? super i0> dVar) {
            return ((C0045b) create(k0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f2229a;
            if (i10 == 0) {
                u.b(obj);
                k0 k0Var = (k0) this.f2230b;
                b bVar = b.this;
                this.f2229a = 1;
                if (bVar.j2(k0Var, this) == objE) {
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

    private b(boolean z10, g0.m mVar, zd.a<i0> aVar, a.C0044a c0044a) {
        this.f2222p = z10;
        this.f2223q = mVar;
        this.f2224r = aVar;
        this.f2225s = c0044a;
        this.f2226t = new a();
        this.f2227u = (q0) a2(p0.a(new C0045b(null)));
    }

    public /* synthetic */ b(boolean z10, g0.m mVar, zd.a aVar, a.C0044a c0044a, ae.j jVar) {
        this(z10, mVar, aVar, c0044a);
    }

    @Override // a2.j1
    public void Z(v1.p pVar, r rVar, long j10) {
        this.f2227u.Z(pVar, rVar, j10);
    }

    @Override // a2.j1
    public void c0() {
        this.f2227u.c0();
    }

    protected final boolean f2() {
        return this.f2222p;
    }

    protected final a.C0044a g2() {
        return this.f2225s;
    }

    protected final zd.a<i0> h2() {
        return this.f2224r;
    }

    protected final Object i2(t tVar, long j10, qd.d<? super i0> dVar) {
        Object objF;
        g0.m mVar = this.f2223q;
        return (mVar == null || (objF = e.f(tVar, j10, mVar, this.f2225s, this.f2226t, dVar)) != rd.d.e()) ? i0.f15558a : objF;
    }

    protected abstract Object j2(k0 k0Var, qd.d<? super i0> dVar);

    protected final void k2(boolean z10) {
        this.f2222p = z10;
    }

    protected final void l2(g0.m mVar) {
        this.f2223q = mVar;
    }

    protected final void m2(zd.a<i0> aVar) {
        this.f2224r = aVar;
    }
}
