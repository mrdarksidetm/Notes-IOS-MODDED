package e0;

import e0.j;
import le.n0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends e0.b {
    private o D;
    private r E;
    private l F;
    private final a G;
    private final s H;

    public static final class a implements e0.a {
        a() {
        }

        @Override // e0.a
        public void a(long j10) {
            n.this.L2().a(m.i(j10, n.this.E));
        }
    }

    @sd.d(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {322}, m = "invokeSuspend")
    static final class b extends sd.j implements zd.p<l, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10426b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ zd.p<e0.a, qd.d<? super i0>, Object> f10428d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(zd.p<? super e0.a, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super b> dVar) {
            super(2, dVar);
            this.f10428d = pVar;
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l lVar, qd.d<? super i0> dVar) {
            return ((b) create(lVar, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            b bVar = n.this.new b(this.f10428d, dVar);
            bVar.f10426b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f10425a;
            if (i10 == 0) {
                md.u.b(obj);
                n.this.M2((l) this.f10426b);
                zd.p<e0.a, qd.d<? super i0>, Object> pVar = this.f10428d;
                a aVar = n.this.G;
                this.f10425a = 1;
                if (pVar.invoke(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                md.u.b(obj);
            }
            return i0.f15558a;
        }
    }

    public n(o oVar, zd.l<? super v1.b0, Boolean> lVar, r rVar, boolean z10, g0.m mVar, zd.a<Boolean> aVar, zd.q<? super n0, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar, zd.q<? super n0, ? super w2.w, ? super qd.d<? super i0>, ? extends Object> qVar2, boolean z11) {
        super(lVar, z10, mVar, aVar, qVar, qVar2, z11);
        this.D = oVar;
        this.E = rVar;
        this.F = m.f10401a;
        this.G = new a();
        this.H = k.g(this.E);
    }

    public final l L2() {
        return this.F;
    }

    public final void M2(l lVar) {
        this.F = lVar;
    }

    public final void N2(o oVar, zd.l<? super v1.b0, Boolean> lVar, r rVar, boolean z10, g0.m mVar, zd.a<Boolean> aVar, zd.q<? super n0, ? super k1.f, ? super qd.d<? super i0>, ? extends Object> qVar, zd.q<? super n0, ? super w2.w, ? super qd.d<? super i0>, ? extends Object> qVar2, boolean z11) {
        boolean z12;
        boolean z13 = true;
        if (ae.r.b(this.D, oVar)) {
            z12 = false;
        } else {
            this.D = oVar;
            z12 = true;
        }
        B2(lVar);
        if (this.E != rVar) {
            this.E = rVar;
            z12 = true;
        }
        if (s2() != z10) {
            C2(z10);
            if (!z10) {
                o2();
            }
            z12 = true;
        }
        if (!ae.r.b(t2(), mVar)) {
            o2();
            D2(mVar);
        }
        H2(aVar);
        E2(qVar);
        F2(qVar2);
        if (w2() != z11) {
            G2(z11);
        } else {
            z13 = z12;
        }
        if (z13) {
            v2().w1();
        }
    }

    @Override // e0.b
    public Object p2(zd.p<? super e0.a, ? super qd.d<? super i0>, ? extends Object> pVar, qd.d<? super i0> dVar) {
        Object objB = this.D.b(d0.c0.UserInput, new b(pVar, null), dVar);
        return objB == rd.d.e() ? objB : i0.f15558a;
    }

    @Override // e0.b
    public Object q2(e0.a aVar, j.b bVar, qd.d<? super i0> dVar) {
        aVar.a(bVar.a());
        return i0.f15558a;
    }

    @Override // e0.b
    public s u2() {
        return this.H;
    }
}
