package q0;

import l1.j0;
import l1.t1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f18552a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f18553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f18554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h0.y f18555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f18556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h0.y f18557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f18558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final h0.y f18559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f18560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h0.y f18561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f18562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f18563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f18564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f18565n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f18566o = 0;

    static {
        float fM = w2.h.m(24);
        f18553b = fM;
        float f10 = 8;
        float fM2 = w2.h.m(f10);
        f18554c = fM2;
        h0.y yVarD = androidx.compose.foundation.layout.m.d(fM, fM2, fM, fM2);
        f18555d = yVarD;
        float f11 = 16;
        float fM3 = w2.h.m(f11);
        f18556e = fM3;
        f18557f = androidx.compose.foundation.layout.m.d(fM3, fM2, fM, fM2);
        float fM4 = w2.h.m(12);
        f18558g = fM4;
        f18559h = androidx.compose.foundation.layout.m.d(fM4, yVarD.c(), fM4, yVarD.a());
        float fM5 = w2.h.m(f11);
        f18560i = fM5;
        f18561j = androidx.compose.foundation.layout.m.d(fM4, yVarD.c(), fM5, yVarD.a());
        f18562k = w2.h.m(58);
        f18563l = w2.h.m(40);
        f18564m = s0.g.f19686a.i();
        f18565n = w2.h.m(f10);
    }

    private e() {
    }

    public final d a(t0.l lVar, int i10) {
        lVar.e(1449248637);
        if (t0.o.I()) {
            t0.o.U(1449248637, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:546)");
        }
        d dVarE = e(y.f18928a.a(lVar, 6));
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return dVarE;
    }

    public final d b(long j10, long j11, long j12, long j13, t0.l lVar, int i10, int i11) {
        lVar.e(-339300779);
        long j14 = (i11 & 1) != 0 ? l1.j0.f14524b.j() : j10;
        long j15 = (i11 & 2) != 0 ? l1.j0.f14524b.j() : j11;
        long j16 = (i11 & 4) != 0 ? l1.j0.f14524b.j() : j12;
        long j17 = (i11 & 8) != 0 ? l1.j0.f14524b.j() : j13;
        if (t0.o.I()) {
            t0.o.U(-339300779, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:563)");
        }
        d dVarC = e(y.f18928a.a(lVar, 6)).c(j14, j15, j16, j17);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return dVarC;
    }

    public final f c(float f10, float f11, float f12, float f13, float f14, t0.l lVar, int i10, int i11) {
        lVar.e(1827791191);
        float fB = (i11 & 1) != 0 ? s0.g.f19686a.b() : f10;
        float fK = (i11 & 2) != 0 ? s0.g.f19686a.k() : f11;
        float fG = (i11 & 4) != 0 ? s0.g.f19686a.g() : f12;
        float fH = (i11 & 8) != 0 ? s0.g.f19686a.h() : f13;
        float fE = (i11 & 16) != 0 ? s0.g.f19686a.e() : f14;
        if (t0.o.I()) {
            t0.o.U(1827791191, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:772)");
        }
        f fVar = new f(fB, fK, fG, fH, fE, null);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return fVar;
    }

    public final h0.y d() {
        return f18555d;
    }

    public final d e(h hVar) {
        d dVarB = hVar.b();
        if (dVarB != null) {
            return dVarB;
        }
        s0.g gVar = s0.g.f19686a;
        d dVar = new d(i.d(hVar, gVar.a()), i.d(hVar, gVar.j()), l1.j0.u(i.d(hVar, gVar.d()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), l1.j0.u(i.d(hVar, gVar.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        hVar.N(dVar);
        return dVar;
    }

    public final d f(h hVar) {
        d dVarD = hVar.d();
        if (dVarD != null) {
            return dVarD;
        }
        j0.a aVar = l1.j0.f14524b;
        long jI = aVar.i();
        s0.m mVar = s0.m.f19808a;
        d dVar = new d(jI, i.d(hVar, mVar.c()), aVar.i(), l1.j0.u(i.d(hVar, mVar.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        hVar.P(dVar);
        return dVar;
    }

    public final float g() {
        return f18563l;
    }

    public final float h() {
        return f18562k;
    }

    public final t1 i(t0.l lVar, int i10) {
        lVar.e(-1234923021);
        if (t0.o.I()) {
            t0.o.U(-1234923021, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:527)");
        }
        t1 t1VarD = l0.d(s0.g.f19686a.c(), lVar, 6);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return t1VarD;
    }

    public final h0.y j() {
        return f18559h;
    }

    public final t1 k(t0.l lVar, int i10) {
        lVar.e(-349121587);
        if (t0.o.I()) {
            t0.o.U(-349121587, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:539)");
        }
        t1 t1VarD = l0.d(s0.m.f19808a.a(), lVar, 6);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return t1VarD;
    }

    public final d l(t0.l lVar, int i10) {
        lVar.e(1880341584);
        if (t0.o.I()) {
            t0.o.U(1880341584, i10, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:717)");
        }
        d dVarF = f(y.f18928a.a(lVar, 6));
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return dVarF;
    }
}
