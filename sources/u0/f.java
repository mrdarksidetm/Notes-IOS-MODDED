package u0;

import java.util.List;
import md.i0;
import md.s;
import md.x;
import t0.c0;
import t0.d2;
import t0.f1;
import t0.f2;
import t0.g1;
import t0.o;
import t0.q;
import t0.s2;
import t0.u0;
import t0.v2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    public static final class a implements f2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f21463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g1 f21464b;

        a(c0 c0Var, g1 g1Var) {
            this.f21463a = c0Var;
            this.f21464b = g1Var;
        }

        @Override // t0.f2
        public void a(Object obj) {
        }

        @Override // t0.f2
        public void f(d2 d2Var) {
        }

        @Override // t0.f2
        public u0 o(d2 d2Var, Object obj) {
            u0 u0VarO;
            c0 c0Var = this.f21463a;
            v0.b bVar = null;
            f2 f2Var = c0Var instanceof f2 ? (f2) c0Var : null;
            if (f2Var == null || (u0VarO = f2Var.o(d2Var, obj)) == null) {
                u0VarO = u0.IGNORED;
            }
            if (u0VarO != u0.IGNORED) {
                return u0VarO;
            }
            g1 g1Var = this.f21464b;
            List<s<d2, v0.b<Object>>> listD = g1Var.d();
            if (obj != null) {
                bVar = new v0.b();
                bVar.add(bVar);
            }
            g1Var.h(nd.c0.o0(listD, x.a(d2Var, bVar)));
            return u0.SCHEDULED;
        }
    }

    private static final int d(v2 v2Var) {
        int iA0 = v2Var.a0();
        int iC0 = v2Var.c0();
        while (iC0 >= 0 && !v2Var.r0(iC0)) {
            iC0 = v2Var.F0(iC0);
        }
        int iJ0 = iC0 + 1;
        int iD0 = 0;
        while (iJ0 < iA0) {
            if (v2Var.m0(iA0, iJ0)) {
                if (v2Var.r0(iJ0)) {
                    iD0 = 0;
                }
                iJ0++;
            } else {
                iD0 += v2Var.r0(iJ0) ? 1 : v2Var.D0(iJ0);
                iJ0 += v2Var.j0(iJ0);
            }
        }
        return iD0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(v2 v2Var, t0.d dVar, t0.e<Object> eVar) {
        int iG = v2Var.G(dVar);
        o.S(v2Var.a0() < iG);
        f(v2Var, eVar, iG);
        int iD = d(v2Var);
        while (v2Var.a0() < iG) {
            if (v2Var.l0(iG)) {
                if (v2Var.q0()) {
                    eVar.d(v2Var.B0(v2Var.a0()));
                    iD = 0;
                }
                v2Var.c1();
            } else {
                iD += v2Var.V0();
            }
        }
        o.S(v2Var.a0() == iG);
        return iD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(v2 v2Var, t0.e<Object> eVar, int i10) {
        while (!v2Var.n0(i10)) {
            v2Var.W0();
            if (v2Var.r0(v2Var.c0())) {
                eVar.g();
            }
            v2Var.T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(c0 c0Var, q qVar, g1 g1Var, v2 v2Var) {
        s2 s2Var = new s2();
        v2 v2VarA = s2Var.A();
        try {
            v2VarA.I();
            v2VarA.d1(126665345, g1Var.c());
            v2.t0(v2VarA, 0, 1, null);
            v2VarA.h1(g1Var.f());
            List<t0.d> listA0 = v2Var.A0(g1Var.a(), 1, v2VarA);
            v2VarA.V0();
            v2VarA.T();
            v2VarA.U();
            v2VarA.L();
            f1 f1Var = new f1(s2Var);
            d2.a aVar = d2.f20645i;
            if (aVar.b(s2Var, listA0)) {
                try {
                    aVar.a(s2Var.A(), listA0, new a(c0Var, g1Var));
                    i0 i0Var = i0.f15558a;
                } finally {
                }
            }
            qVar.l(g1Var, f1Var);
        } finally {
        }
    }
}
