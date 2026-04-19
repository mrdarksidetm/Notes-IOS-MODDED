package y1;

import a2.g;
import t0.q2;
import t0.u3;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    static final class a extends ae.s implements zd.q<q2<a2.g>, t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f23298a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar) {
            super(3);
            this.f23298a = eVar;
        }

        public final void a(t0.l lVar, t0.l lVar2, int i10) {
            if (t0.o.I()) {
                t0.o.U(-1586257396, i10, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:203)");
            }
            int iA = t0.i.a(lVar2, 0);
            androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(lVar2, this.f23298a);
            lVar.e(509942095);
            t0.l lVarA = u3.a(lVar);
            g.a aVar = a2.g.J;
            u3.b(lVarA, eVarC, aVar.f());
            zd.p<a2.g, Integer, md.i0> pVarB = aVar.b();
            if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            lVar.K();
            if (t0.o.I()) {
                t0.o.T();
            }
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ md.i0 invoke(q2<a2.g> q2Var, t0.l lVar, Integer num) {
            a(q2Var.f(), lVar, num.intValue());
            return md.i0.f15558a;
        }
    }

    public static final zd.q<q2<a2.g>, t0.l, Integer, md.i0> a(androidx.compose.ui.e eVar) {
        return b1.c.c(-1586257396, true, new a(eVar));
    }
}
