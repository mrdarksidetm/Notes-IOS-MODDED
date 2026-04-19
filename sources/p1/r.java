package p1;

import l1.j0;
import l1.k0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final q a(q qVar, long j10, long j11, String str, k0 k0Var, boolean z10) {
        qVar.x(j10);
        qVar.t(z10);
        qVar.u(k0Var);
        qVar.y(j11);
        qVar.w(str);
        return qVar;
    }

    private static final k0 b(long j10, int i10) {
        if (j10 != j0.f14524b.j()) {
            return k0.f14548b.a(j10, i10);
        }
        return null;
    }

    public static final c c(c cVar, n nVar) {
        l lVar;
        int iU = nVar.u();
        for (int i10 = 0; i10 < iU; i10++) {
            p pVarD = nVar.d(i10);
            if (pVarD instanceof s) {
                g gVar = new g();
                s sVar = (s) pVarD;
                gVar.k(sVar.l());
                gVar.l(sVar.n());
                gVar.j(sVar.f());
                gVar.h(sVar.a());
                gVar.i(sVar.d());
                gVar.m(sVar.o());
                gVar.n(sVar.r());
                gVar.r(sVar.v());
                gVar.o(sVar.s());
                gVar.p(sVar.t());
                gVar.q(sVar.u());
                gVar.u(sVar.y());
                gVar.s(sVar.w());
                gVar.t(sVar.x());
                lVar = gVar;
            } else if (pVarD instanceof n) {
                c cVar2 = new c();
                n nVar2 = (n) pVarD;
                cVar2.p(nVar2.l());
                cVar2.s(nVar2.r());
                cVar2.t(nVar2.s());
                cVar2.u(nVar2.t());
                cVar2.v(nVar2.v());
                cVar2.w(nVar2.w());
                cVar2.q(nVar2.n());
                cVar2.r(nVar2.o());
                cVar2.o(nVar2.f());
                c(cVar2, nVar2);
                lVar = cVar2;
            }
            cVar.i(i10, lVar);
        }
        return cVar;
    }

    public static final q d(w2.d dVar, d dVar2, c cVar) {
        long jE = e(dVar, dVar2.e(), dVar2.d());
        return a(new q(cVar), jE, f(jE, dVar2.l(), dVar2.k()), dVar2.g(), b(dVar2.j(), dVar2.i()), dVar2.c());
    }

    private static final long e(w2.d dVar, float f10, float f11) {
        return k1.m.a(dVar.G0(f10), dVar.G0(f11));
    }

    private static final long f(long j10, float f10, float f11) {
        if (Float.isNaN(f10)) {
            f10 = k1.l.i(j10);
        }
        if (Float.isNaN(f11)) {
            f11 = k1.l.g(j10);
        }
        return k1.m.a(f10, f11);
    }

    public static final q g(d dVar, t0.l lVar, int i10) {
        lVar.e(1413834416);
        if (t0.o.I()) {
            t0.o.U(1413834416, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:168)");
        }
        w2.d dVar2 = (w2.d) lVar.P(b2.k0.c());
        Object objValueOf = Integer.valueOf(dVar.f());
        lVar.e(511388516);
        boolean zN = lVar.N(objValueOf) | lVar.N(dVar2);
        Object objF = lVar.f();
        if (zN || objF == t0.l.f20813a.a()) {
            c cVar = new c();
            c(cVar, dVar.h());
            i0 i0Var = i0.f15558a;
            objF = d(dVar2, dVar, cVar);
            lVar.E(objF);
        }
        lVar.K();
        q qVar = (q) objF;
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return qVar;
    }
}
