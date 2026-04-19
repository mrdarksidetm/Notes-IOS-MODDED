package b2;

import l1.b1;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    private static final boolean a(k1.j jVar) {
        return k1.a.d(jVar.h()) + k1.a.d(jVar.i()) <= jVar.j() && k1.a.d(jVar.b()) + k1.a.d(jVar.c()) <= jVar.j() && k1.a.e(jVar.h()) + k1.a.e(jVar.b()) <= jVar.d() && k1.a.e(jVar.i()) + k1.a.e(jVar.c()) <= jVar.d();
    }

    public static final boolean b(l1.b1 b1Var, float f10, float f11, l1.f1 f1Var, l1.f1 f1Var2) {
        if (b1Var instanceof b1.b) {
            return d(((b1.b) b1Var).a(), f10, f11);
        }
        if (b1Var instanceof b1.c) {
            return e((b1.c) b1Var, f10, f11, f1Var, f1Var2);
        }
        if (b1Var instanceof b1.a) {
            return c(((b1.a) b1Var).a(), f10, f11, f1Var, f1Var2);
        }
        throw new md.q();
    }

    private static final boolean c(l1.f1 f1Var, float f10, float f11, l1.f1 f1Var2, l1.f1 f1Var3) {
        k1.h hVar = new k1.h(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (f1Var2 == null) {
            f1Var2 = l1.p.a();
        }
        f1Var2.l(hVar);
        if (f1Var3 == null) {
            f1Var3 = l1.p.a();
        }
        f1Var3.e(f1Var, f1Var2, l1.j1.f14539a.b());
        boolean zIsEmpty = f1Var3.isEmpty();
        f1Var3.reset();
        f1Var2.reset();
        return !zIsEmpty;
    }

    private static final boolean d(k1.h hVar, float f10, float f11) {
        return hVar.f() <= f10 && f10 < hVar.g() && hVar.i() <= f11 && f11 < hVar.c();
    }

    private static final boolean e(b1.c cVar, float f10, float f11, l1.f1 f1Var, l1.f1 f1Var2) {
        long jC;
        float f12;
        float f13;
        k1.j jVarA = cVar.a();
        if (f10 < jVarA.e() || f10 >= jVarA.f() || f11 < jVarA.g() || f11 >= jVarA.a()) {
            return false;
        }
        if (!a(jVarA)) {
            l1.f1 f1VarA = f1Var2 == null ? l1.p.a() : f1Var2;
            f1VarA.m(jVarA);
            return c(f1VarA, f10, f11, f1Var, f1Var2);
        }
        float fD = k1.a.d(jVarA.h()) + jVarA.e();
        float fE = k1.a.e(jVarA.h()) + jVarA.g();
        float f14 = jVarA.f() - k1.a.d(jVarA.i());
        float fE2 = k1.a.e(jVarA.i()) + jVarA.g();
        float f15 = jVarA.f() - k1.a.d(jVarA.c());
        float fA = jVarA.a() - k1.a.e(jVarA.c());
        float fA2 = jVarA.a() - k1.a.e(jVarA.b());
        float fD2 = k1.a.d(jVarA.b()) + jVarA.e();
        if (f10 < fD && f11 < fE) {
            jC = jVarA.h();
            f12 = f10;
            f13 = f11;
        } else if (f10 < fD2 && f11 > fA2) {
            jC = jVarA.b();
            f12 = f10;
            f13 = f11;
            fD = fD2;
            fE = fA2;
        } else if (f10 > f14 && f11 < fE2) {
            jC = jVarA.i();
            f12 = f10;
            f13 = f11;
            fD = f14;
            fE = fE2;
        } else {
            if (f10 <= f15 || f11 <= fA) {
                return true;
            }
            jC = jVarA.c();
            f12 = f10;
            f13 = f11;
            fD = f15;
            fE = fA;
        }
        return f(f12, f13, jC, fD, fE);
    }

    private static final boolean f(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fD = k1.a.d(j10);
        float fE = k1.a.e(j10);
        return ((f14 * f14) / (fD * fD)) + ((f15 * f15) / (fE * fE)) <= 1.0f;
    }
}
