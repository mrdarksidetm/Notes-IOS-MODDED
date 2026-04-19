package i2;

import u2.d;
import u2.e;
import u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f12412a = w2.t.f22428b.a();

    public static final s a(s sVar, int i10, int i11, long j10, u2.o oVar, w wVar, u2.g gVar, int i12, int i13, u2.p pVar) {
        long j11;
        int iH = i10;
        u2.o oVarJ = oVar;
        i.a aVar = u2.i.f21560b;
        boolean z10 = true;
        if (u2.i.k(iH, aVar.g()) || u2.i.k(iH, sVar.h())) {
            if (!w2.u.f(j10)) {
                j11 = j10;
                if (w2.t.e(j11, sVar.e())) {
                }
            } else {
                j11 = j10;
            }
            if ((oVarJ == null || ae.r.b(oVarJ, sVar.j())) && ((u2.k.j(i11, u2.k.f21574b.f()) || u2.k.j(i11, sVar.i())) && ((wVar == null || ae.r.b(wVar, sVar.g())) && ((gVar == null || ae.r.b(gVar, sVar.f())) && ((u2.e.d(i12, u2.e.f21523a.b()) || u2.e.d(i12, sVar.d())) && ((u2.d.e(i13, u2.d.f21519a.c()) || u2.d.e(i13, sVar.c())) && (pVar == null || ae.r.b(pVar, sVar.k())))))))) {
                z10 = false;
            }
        } else {
            j11 = j10;
        }
        if (!z10) {
            return sVar;
        }
        long jE = w2.u.f(j10) ? sVar.e() : j11;
        if (oVarJ == null) {
            oVarJ = sVar.j();
        }
        u2.o oVar2 = oVarJ;
        if (u2.i.k(iH, aVar.g())) {
            iH = sVar.h();
        }
        return new s(iH, !u2.k.j(i11, u2.k.f21574b.f()) ? i11 : sVar.i(), jE, oVar2, b(sVar, wVar), gVar == null ? sVar.f() : gVar, !u2.e.d(i12, u2.e.f21523a.b()) ? i12 : sVar.d(), !u2.d.e(i13, u2.d.f21519a.c()) ? i13 : sVar.c(), pVar == null ? sVar.k() : pVar, null);
    }

    private static final w b(s sVar, w wVar) {
        if (sVar.g() == null) {
            return wVar;
        }
        w wVarG = sVar.g();
        return wVar == null ? wVarG : wVarG.c(wVar);
    }

    public static final s c(s sVar, w2.r rVar) {
        int iH = sVar.h();
        i.a aVar = u2.i.f21560b;
        int iF = u2.i.k(iH, aVar.g()) ? aVar.f() : sVar.h();
        int iD = h0.d(rVar, sVar.i());
        long jE = w2.u.f(sVar.e()) ? f12412a : sVar.e();
        u2.o oVarJ = sVar.j();
        if (oVarJ == null) {
            oVarJ = u2.o.f21591c.a();
        }
        u2.o oVar = oVarJ;
        w wVarG = sVar.g();
        u2.g gVarF = sVar.f();
        int iD2 = sVar.d();
        e.a aVar2 = u2.e.f21523a;
        int iA = u2.e.d(iD2, aVar2.b()) ? aVar2.a() : sVar.d();
        int iC = sVar.c();
        d.a aVar3 = u2.d.f21519a;
        int iB = u2.d.e(iC, aVar3.c()) ? aVar3.b() : sVar.c();
        u2.p pVarK = sVar.k();
        if (pVarK == null) {
            pVarK = u2.p.f21595c.a();
        }
        return new s(iF, iD, jE, oVar, wVarG, gVarF, iA, iB, pVarK, null);
    }
}
