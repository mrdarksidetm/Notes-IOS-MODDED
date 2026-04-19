package com.revenuecat.purchases.ui.revenuecatui.icons;

import ae.r;
import l1.h1;
import l1.j0;
import l1.u1;
import l1.v1;
import l1.w1;
import p1.d;
import p1.f;
import p1.o;
import w2.h;

/* JADX INFO: loaded from: classes2.dex */
public final class UniversalCurrencyAltKt {
    private static d _Universal_currency_alt;

    public static final d getUniversalCurrencyAlt() {
        d dVar = _Universal_currency_alt;
        if (dVar != null) {
            r.c(dVar);
            return dVar;
        }
        float f10 = 24;
        d.a aVar = new d.a("UniversalCurrencyAlt", h.m(f10), h.m(f10), 960.0f, 960.0f, 0L, 0, false, 224, null);
        u1 u1Var = new u1(j0.f14524b.a(), null);
        int iA = v1.f14620a.a();
        int iB = w1.f14633a.b();
        int iB2 = h1.f14510a.b();
        f fVar = new f();
        fVar.f(600.0f, 640.0f);
        fVar.d(160.0f);
        fVar.k(-160.0f);
        fVar.d(-60.0f);
        fVar.k(100.0f);
        fVar.c(600.0f);
        fVar.a();
        fVar.g(-120.0f, -40.0f);
        fVar.h(50.0f, 0.0f, 85.0f, -35.0f);
        fVar.j(35.0f, -85.0f);
        fVar.j(-35.0f, -85.0f);
        fVar.j(-85.0f, -35.0f);
        fVar.j(-85.0f, 35.0f);
        fVar.j(-35.0f, 85.0f);
        fVar.j(35.0f, 85.0f);
        fVar.j(85.0f, 35.0f);
        fVar.f(200.0f, 480.0f);
        fVar.d(60.0f);
        fVar.k(-100.0f);
        fVar.d(100.0f);
        fVar.k(-60.0f);
        fVar.c(200.0f);
        fVar.a();
        fVar.f(80.0f, 760.0f);
        fVar.k(-560.0f);
        fVar.d(800.0f);
        fVar.k(560.0f);
        fVar.a();
        fVar.g(80.0f, -80.0f);
        fVar.d(640.0f);
        fVar.k(-400.0f);
        fVar.c(160.0f);
        fVar.a();
        fVar.g(0.0f, 0.0f);
        fVar.k(-400.0f);
        fVar.a();
        aVar.c(fVar.b(), (14336 & 2) != 0 ? o.b() : iB2, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : u1Var, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? o.c() : iA, (14336 & 512) != 0 ? o.d() : iB, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f);
        d dVarF = aVar.f();
        _Universal_currency_alt = dVarF;
        r.c(dVarF);
        return dVarF;
    }
}
