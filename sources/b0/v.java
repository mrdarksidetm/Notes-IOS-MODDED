package b0;

import c0.a1;
import c0.j1;
import l1.j0;
import md.i0;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a1<j0> f5153a = c0.j.g(0.0f, 0.0f, null, 7, null);

    public static final p3<j0> a(long j10, c0.i<j0> iVar, String str, zd.l<? super j0, i0> lVar, t0.l lVar2, int i10, int i11) {
        lVar2.e(-451899108);
        c0.i<j0> iVar2 = (i11 & 2) != 0 ? f5153a : iVar;
        String str2 = (i11 & 4) != 0 ? "ColorAnimation" : str;
        zd.l<? super j0, i0> lVar3 = (i11 & 8) != 0 ? null : lVar;
        if (t0.o.I()) {
            t0.o.U(-451899108, i10, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        m1.c cVarZ = j0.z(j10);
        lVar2.e(1157296644);
        boolean zN = lVar2.N(cVarZ);
        Object objF = lVar2.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = (j1) i.a(j0.f14524b).invoke(j0.z(j10));
            lVar2.E(objF);
        }
        lVar2.K();
        int i12 = i10 << 6;
        p3<j0> p3VarE = c0.c.e(j0.m(j10), (j1) objF, iVar2, null, str2, lVar3, lVar2, (i10 & 14) | 576 | (57344 & i12) | (i12 & 458752), 8);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar2.K();
        return p3VarE;
    }
}
