package i2;

import l1.j0;
import l1.s1;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f12313a = w2.u.e(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f12314b = w2.u.e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f12315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f12316d;

    static final class a extends ae.s implements zd.a<u2.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12317a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u2.m invoke() {
            return u2.m.f21582a.b(b0.f12316d);
        }
    }

    static {
        j0.a aVar = l1.j0.f14524b;
        f12315c = aVar.i();
        f12316d = aVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final i2.a0 b(i2.a0 r21, long r22, l1.z r24, float r25, long r26, n2.i0 r28, n2.e0 r29, n2.f0 r30, n2.t r31, java.lang.String r32, long r33, u2.a r35, u2.n r36, q2.e r37, long r38, u2.j r40, l1.s1 r41, i2.x r42, n1.g r43) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.b0.b(i2.a0, long, l1.z, float, long, n2.i0, n2.e0, n2.f0, n2.t, java.lang.String, long, u2.a, u2.n, q2.e, long, u2.j, l1.s1, i2.x, n1.g):i2.a0");
    }

    private static final x c(a0 a0Var, x xVar) {
        a0Var.q();
        return xVar;
    }

    public static final a0 d(a0 a0Var) {
        u2.m mVarB = a0Var.t().b(a.f12317a);
        long jK = w2.u.f(a0Var.k()) ? f12313a : a0Var.k();
        n2.i0 i0VarN = a0Var.n();
        if (i0VarN == null) {
            i0VarN = n2.i0.f15808b.g();
        }
        n2.i0 i0Var = i0VarN;
        n2.e0 e0VarL = a0Var.l();
        n2.e0 e0VarC = n2.e0.c(e0VarL != null ? e0VarL.i() : n2.e0.f15784b.b());
        n2.f0 f0VarM = a0Var.m();
        n2.f0 f0VarB = n2.f0.b(f0VarM != null ? f0VarM.j() : n2.f0.f15789b.a());
        n2.t tVarI = a0Var.i();
        if (tVarI == null) {
            tVarI = n2.t.f15881b.b();
        }
        n2.t tVar = tVarI;
        String strJ = a0Var.j();
        if (strJ == null) {
            strJ = "";
        }
        String str = strJ;
        long jO = w2.u.f(a0Var.o()) ? f12314b : a0Var.o();
        u2.a aVarE = a0Var.e();
        u2.a aVarB = u2.a.b(aVarE != null ? aVarE.h() : u2.a.f21511b.a());
        u2.n nVarU = a0Var.u();
        if (nVarU == null) {
            nVarU = u2.n.f21587c.a();
        }
        u2.n nVar = nVarU;
        q2.e eVarP = a0Var.p();
        if (eVarP == null) {
            eVarP = q2.e.f18974c.a();
        }
        q2.e eVar = eVarP;
        long jD = a0Var.d();
        if (!(jD != l1.j0.f14524b.j())) {
            jD = f12315c;
        }
        long j10 = jD;
        u2.j jVarS = a0Var.s();
        if (jVarS == null) {
            jVarS = u2.j.f21569b.b();
        }
        u2.j jVar = jVarS;
        s1 s1VarR = a0Var.r();
        if (s1VarR == null) {
            s1VarR = s1.f14570d.a();
        }
        s1 s1Var = s1VarR;
        a0Var.q();
        x xVar = null;
        n1.g gVarH = a0Var.h();
        if (gVarH == null) {
            gVarH = n1.j.f15736a;
        }
        return new a0(mVarB, jK, i0Var, e0VarC, f0VarB, tVar, str, jO, aVarB, nVar, eVar, j10, jVar, s1Var, xVar, gVarH, (ae.j) null);
    }
}
