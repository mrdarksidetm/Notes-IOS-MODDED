package h0;

import a2.g;
import t0.u3;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    public static final class a extends ae.s implements zd.a<a2.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.a f11670a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zd.a aVar) {
            super(0);
            this.f11670a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [a2.g, java.lang.Object] */
        @Override // zd.a
        public final a2.g invoke() {
            return this.f11670a.invoke();
        }
    }

    public static final void a(androidx.compose.ui.e eVar, t0.l lVar, int i10) {
        lVar.e(-72882467);
        if (t0.o.I()) {
            t0.o.U(-72882467, i10, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        k0 k0Var = k0.f11680a;
        lVar.e(544976794);
        int iA = t0.i.a(lVar, 0);
        androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(lVar, eVar);
        t0.w wVarB = lVar.B();
        g.a aVar = a2.g.J;
        zd.a<a2.g> aVarA = aVar.a();
        lVar.e(1405779621);
        if (!(lVar.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVar.r();
        if (lVar.l()) {
            lVar.O(new a(aVarA));
        } else {
            lVar.D();
        }
        t0.l lVarA = u3.a(lVar);
        u3.b(lVarA, k0Var, aVar.e());
        u3.b(lVarA, wVarB, aVar.g());
        u3.b(lVarA, eVarC, aVar.f());
        zd.p<a2.g, Integer, md.i0> pVarB = aVar.b();
        if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        lVar.L();
        lVar.K();
        lVar.K();
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
    }
}
