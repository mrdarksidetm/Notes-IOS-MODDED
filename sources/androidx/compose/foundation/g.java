package androidx.compose.foundation;

import ae.s;
import androidx.compose.foundation.a;
import e0.b0;
import e0.t;
import md.i0;
import md.u;
import v1.k0;
import zd.q;

/* JADX INFO: loaded from: classes.dex */
final class g extends androidx.compose.foundation.b {

    @sd.d(c = "androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2", f = "Clickable.kt", l = {984}, m = "invokeSuspend")
    static final class a extends sd.j implements q<t, k1.f, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ long f2277c;

        a(qd.d<? super a> dVar) {
            super(3, dVar);
        }

        public final Object a(t tVar, long j10, qd.d<? super i0> dVar) {
            a aVar = g.this.new a(dVar);
            aVar.f2276b = tVar;
            aVar.f2277c = j10;
            return aVar.invokeSuspend(i0.f15558a);
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ Object invoke(t tVar, k1.f fVar, qd.d<? super i0> dVar) {
            return a(tVar, fVar.x(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f2275a;
            if (i10 == 0) {
                u.b(obj);
                t tVar = (t) this.f2276b;
                long j10 = this.f2277c;
                if (g.this.f2()) {
                    g gVar = g.this;
                    this.f2275a = 1;
                    if (gVar.i2(tVar, j10, this) == objE) {
                        return objE;
                    }
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

    static final class b extends s implements zd.l<k1.f, i0> {
        b() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(k1.f fVar) {
            m1invokek4lQ0M(fVar.x());
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m1invokek4lQ0M(long j10) {
            if (g.this.f2()) {
                g.this.h2().invoke();
            }
        }
    }

    public g(boolean z10, g0.m mVar, zd.a<i0> aVar, a.C0044a c0044a) {
        super(z10, mVar, aVar, c0044a, null);
    }

    @Override // androidx.compose.foundation.b
    protected Object j2(k0 k0Var, qd.d<? super i0> dVar) {
        a.C0044a c0044aG2 = g2();
        long jB = w2.q.b(k0Var.a());
        c0044aG2.d(k1.g.a(w2.n.j(jB), w2.n.k(jB)));
        Object objH = b0.h(k0Var, new a(null), new b(), dVar);
        return objH == rd.d.e() ? objH : i0.f15558a;
    }

    public final void n2(boolean z10, g0.m mVar, zd.a<i0> aVar) {
        k2(z10);
        m2(aVar);
        l2(mVar);
    }
}
