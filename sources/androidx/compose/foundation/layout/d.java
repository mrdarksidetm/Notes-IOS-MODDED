package androidx.compose.foundation.layout;

import a2.g;
import java.util.List;
import md.i0;
import t0.e2;
import t0.o2;
import t0.u3;
import t0.w;
import y1.d0;
import y1.e0;
import y1.f0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f2480a = new e(f1.b.f11020a.o(), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e0 f2481b = c.f2485a;

    public static final class a extends ae.s implements zd.a<a2.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a f2482a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zd.a aVar) {
            super(0);
            this.f2482a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [a2.g, java.lang.Object] */
        @Override // zd.a
        public final a2.g invoke() {
            return this.f2482a.invoke();
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f2483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2484b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, int i10) {
            super(2);
            this.f2483a = eVar;
            this.f2484b = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            d.a(this.f2483a, lVar, e2.a(this.f2484b | 1));
        }
    }

    static final class c implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f2485a = new c();

        static final class a extends ae.s implements zd.l<t0.a, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f2486a = new a();

            a() {
                super(1);
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
                invoke2(aVar);
                return i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(t0.a aVar) {
            }
        }

        c() {
        }

        @Override // y1.e0
        public final f0 a(g0 g0Var, List<? extends d0> list, long j10) {
            return g0.z0(g0Var, w2.b.p(j10), w2.b.o(j10), null, a.f2486a, 4, null);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, t0.l lVar, int i10) {
        int i11;
        t0.l lVarP = lVar.p(-211209833);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && lVarP.s()) {
            lVarP.x();
        } else {
            if (t0.o.I()) {
                t0.o.U(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:207)");
            }
            e0 e0Var = f2481b;
            lVarP.e(544976794);
            int iA = t0.i.a(lVarP, 0);
            androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(lVarP, eVar);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            zd.a<a2.g> aVarA = aVar.a();
            lVarP.e(1405779621);
            if (!(lVarP.t() instanceof t0.e)) {
                t0.i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(new a(aVarA));
            } else {
                lVarP.D();
            }
            t0.l lVarA = u3.a(lVarP);
            u3.b(lVarA, e0Var, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            u3.b(lVarA, eVarC, aVar.f());
            zd.p<a2.g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            lVarP.L();
            lVarP.K();
            lVarP.K();
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new b(eVar, i10));
        }
    }

    private static final androidx.compose.foundation.layout.c d(d0 d0Var) {
        Object objF = d0Var.f();
        if (objF instanceof androidx.compose.foundation.layout.c) {
            return (androidx.compose.foundation.layout.c) objF;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(d0 d0Var) {
        androidx.compose.foundation.layout.c cVarD = d(d0Var);
        if (cVarD != null) {
            return cVarD.b2();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(t0.a aVar, t0 t0Var, d0 d0Var, w2.r rVar, int i10, int i11, f1.b bVar) {
        f1.b bVarA2;
        androidx.compose.foundation.layout.c cVarD = d(d0Var);
        t0.a.h(aVar, t0Var, ((cVarD == null || (bVarA2 = cVarD.a2()) == null) ? bVar : bVarA2).a(w2.q.a(t0Var.q0(), t0Var.d0()), w2.q.a(i10, i11), rVar), 0.0f, 2, null);
    }

    public static final e0 g(f1.b bVar, boolean z10, t0.l lVar, int i10) {
        e0 e0Var;
        lVar.e(56522820);
        if (t0.o.I()) {
            t0.o.U(56522820, i10, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:84)");
        }
        if (!ae.r.b(bVar, f1.b.f11020a.o()) || z10) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            lVar.e(511388516);
            boolean zN = lVar.N(boolValueOf) | lVar.N(bVar);
            Object objF = lVar.f();
            if (zN || objF == t0.l.f20813a.a()) {
                objF = new e(bVar, z10);
                lVar.E(objF);
            }
            lVar.K();
            e0Var = (e0) objF;
        } else {
            e0Var = f2480a;
        }
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return e0Var;
    }
}
