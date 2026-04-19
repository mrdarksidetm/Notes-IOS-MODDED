package androidx.compose.animation;

import b0.s;
import b0.w;
import c0.e0;
import c0.f1;
import c0.g1;
import c0.l1;
import c0.n;
import java.util.LinkedHashMap;
import java.util.Map;
import md.i0;
import t0.f3;
import t0.k1;
import t0.k3;
import t0.o;
import t0.p3;
import w2.p;
import w2.q;
import w2.r;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.q0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class e<S> implements d<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1<S> f2103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f1.b f2104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f2105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k1 f2106d = k3.e(p.b(p.f22421b.a()), null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<S, p3<p>> f2107e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p3<p> f2108f;

    public static final class a implements q0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2109b;

        public a(boolean z10) {
            this.f2109b = z10;
        }

        public final boolean a() {
            return this.f2109b;
        }

        public final void c(boolean z10) {
            this.f2109b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f2109b == ((a) obj).f2109b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f2109b);
        }

        @Override // y1.q0
        public Object r(w2.d dVar, Object obj) {
            return this;
        }

        public String toString() {
            return "ChildData(isTarget=" + this.f2109b + ')';
        }
    }

    private final class b extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f1<S>.a<p, n> f2110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p3<w> f2111c;

        static final class a extends ae.s implements zd.l<t0.a, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t0 f2113a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f2114b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t0 t0Var, long j10) {
                super(1);
                this.f2113a = t0Var;
                this.f2114b = j10;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
                invoke2(aVar);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(t0.a aVar) {
                t0.a.h(aVar, this.f2113a, this.f2114b, 0.0f, 2, null);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.animation.e$b$b, reason: collision with other inner class name */
        static final class C0041b extends ae.s implements zd.l<f1.b<S>, e0<p>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e<S> f2115a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e<S>.b f2116b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0041b(e<S> eVar, e<S>.b bVar) {
                super(1);
                this.f2115a = eVar;
                this.f2116b = bVar;
            }

            @Override // zd.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e0<p> invoke(f1.b<S> bVar) {
                e0<p> e0VarB;
                p3<p> p3Var = this.f2115a.h().get(bVar.a());
                long j10 = p3Var != null ? p3Var.getValue().j() : p.f22421b.a();
                p3<p> p3Var2 = this.f2115a.h().get(bVar.c());
                long j11 = p3Var2 != null ? p3Var2.getValue().j() : p.f22421b.a();
                w value = this.f2116b.a().getValue();
                return (value == null || (e0VarB = value.b(j10, j11)) == null) ? c0.j.g(0.0f, 0.0f, null, 7, null) : e0VarB;
            }
        }

        static final class c extends ae.s implements zd.l<S, p> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e<S> f2117a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e<S> eVar) {
                super(1);
                this.f2117a = eVar;
            }

            public final long a(S s10) {
                p3<p> p3Var = this.f2117a.h().get(s10);
                return p3Var != null ? p3Var.getValue().j() : p.f22421b.a();
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ p invoke(Object obj) {
                return p.b(a(obj));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(f1<S>.a<p, n> aVar, p3<? extends w> p3Var) {
            this.f2110b = aVar;
            this.f2111c = p3Var;
        }

        public final p3<w> a() {
            return this.f2111c;
        }

        @Override // y1.v
        public f0 d(g0 g0Var, d0 d0Var, long j10) {
            t0 t0VarI = d0Var.I(j10);
            p3<p> p3VarA = this.f2110b.a(new C0041b(e.this, this), new c(e.this));
            e.this.i(p3VarA);
            return g0.z0(g0Var, p.g(p3VarA.getValue().j()), p.f(p3VarA.getValue().j()), null, new a(t0VarI, e.this.g().a(q.a(t0VarI.q0(), t0VarI.d0()), p3VarA.getValue().j(), r.Ltr)), 4, null);
        }
    }

    public e(f1<S> f1Var, f1.b bVar, r rVar) {
        this.f2103a = f1Var;
        this.f2104b = bVar;
        this.f2105c = rVar;
    }

    private static final boolean e(k1<Boolean> k1Var) {
        return k1Var.getValue().booleanValue();
    }

    private static final void f(k1<Boolean> k1Var, boolean z10) {
        k1Var.setValue(Boolean.valueOf(z10));
    }

    @Override // c0.f1.b
    public S a() {
        return this.f2103a.l().a();
    }

    @Override // c0.f1.b
    public S c() {
        return this.f2103a.l().c();
    }

    public final androidx.compose.ui.e d(b0.j jVar, t0.l lVar, int i10) {
        androidx.compose.ui.e eVar;
        lVar.e(93755870);
        if (o.I()) {
            o.U(93755870, i10, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:538)");
        }
        lVar.e(1157296644);
        boolean zN = lVar.N(this);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = k3.e(Boolean.FALSE, null, 2, null);
            lVar.E(objF);
        }
        lVar.K();
        k1 k1Var = (k1) objF;
        boolean z10 = false;
        p3 p3VarO = f3.o(jVar.b(), lVar, 0);
        if (ae.r.b(this.f2103a.h(), this.f2103a.n())) {
            f(k1Var, false);
        } else if (p3VarO.getValue() != null) {
            f(k1Var, true);
        }
        if (e(k1Var)) {
            f1.a aVarB = g1.b(this.f2103a, l1.j(p.f22421b), null, lVar, 64, 2);
            lVar.e(1157296644);
            boolean zN2 = lVar.N(aVarB);
            Object objF2 = lVar.f();
            if (zN2 || objF2 == t0.l.f20813a.a()) {
                w wVar = (w) p3VarO.getValue();
                if (wVar != null && !wVar.a()) {
                    z10 = true;
                }
                androidx.compose.ui.e eVarB = androidx.compose.ui.e.f2662a;
                if (!z10) {
                    eVarB = i1.g.b(eVarB);
                }
                objF2 = eVarB.h(new b(aVarB, p3VarO));
                lVar.E(objF2);
            }
            lVar.K();
            eVar = (androidx.compose.ui.e) objF2;
        } else {
            this.f2108f = null;
            eVar = androidx.compose.ui.e.f2662a;
        }
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return eVar;
    }

    public f1.b g() {
        return this.f2104b;
    }

    public final Map<S, p3<p>> h() {
        return this.f2107e;
    }

    public final void i(p3<p> p3Var) {
        this.f2108f = p3Var;
    }

    public void j(f1.b bVar) {
        this.f2104b = bVar;
    }

    public final void k(r rVar) {
        this.f2105c = rVar;
    }

    public final void l(long j10) {
        this.f2106d.setValue(p.b(j10));
    }
}
