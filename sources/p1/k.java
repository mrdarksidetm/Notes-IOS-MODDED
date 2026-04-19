package p1;

import java.util.List;
import l1.f1;
import p1.h;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f18018a = new float[0];

    private static final void a(f1 f1Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = d12;
        double d20 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d18 * d20) / 3.141592653589793d));
        double dCos = Math.cos(d16);
        double dSin = Math.sin(d16);
        double dCos2 = Math.cos(d17);
        double dSin2 = Math.sin(d17);
        double d21 = -d19;
        double d22 = d21 * dCos;
        double d23 = d13 * dSin;
        double d24 = (d22 * dSin2) - (d23 * dCos2);
        double d25 = d21 * dSin;
        double d26 = d13 * dCos;
        double d27 = (dSin2 * d25) + (dCos2 * d26);
        double d28 = d18 / ((double) iCeil);
        double d29 = d14;
        double d30 = d27;
        double d31 = d24;
        int i10 = 0;
        double d32 = d15;
        double d33 = d17;
        while (i10 < iCeil) {
            double d34 = d33 + d28;
            double dSin3 = Math.sin(d34);
            double dCos3 = Math.cos(d34);
            int i11 = iCeil;
            double d35 = (d10 + ((d19 * dCos) * dCos3)) - (d23 * dSin3);
            double d36 = d11 + (d19 * dSin * dCos3) + (d26 * dSin3);
            double d37 = (d22 * dSin3) - (d23 * dCos3);
            double d38 = (dSin3 * d25) + (dCos3 * d26);
            double d39 = d34 - d33;
            double dTan = Math.tan(d39 / ((double) 2));
            double dSin4 = (Math.sin(d39) * (Math.sqrt(d20 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            f1Var.n((float) (d29 + (d31 * dSin4)), (float) (d32 + (d30 * dSin4)), (float) (d35 - (dSin4 * d37)), (float) (d36 - (dSin4 * d38)), (float) d35, (float) d36);
            i10++;
            d28 = d28;
            dSin = dSin;
            d29 = d35;
            d25 = d25;
            d33 = d34;
            d30 = d38;
            d20 = d20;
            d31 = d37;
            dCos = dCos;
            iCeil = i11;
            d32 = d36;
            d19 = d12;
        }
    }

    private static final void b(f1 f1Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = (d16 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d19);
        double dSin = Math.sin(d19);
        double d20 = ((d10 * dCos) + (d11 * dSin)) / d14;
        double d21 = (((-d10) * dSin) + (d11 * dCos)) / d15;
        double d22 = ((d12 * dCos) + (d13 * dSin)) / d14;
        double d23 = (((-d12) * dSin) + (d13 * dCos)) / d15;
        double d24 = d20 - d22;
        double d25 = d21 - d23;
        double d26 = 2;
        double d27 = (d20 + d22) / d26;
        double d28 = (d21 + d23) / d26;
        double d29 = (d24 * d24) + (d25 * d25);
        if (d29 == 0.0d) {
            return;
        }
        double d30 = (1.0d / d29) - 0.25d;
        if (d30 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d29) / 1.99999d);
            b(f1Var, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d30);
        double d31 = d24 * dSqrt2;
        double d32 = dSqrt2 * d25;
        if (z10 == z11) {
            d17 = d27 - d32;
            d18 = d28 + d31;
        } else {
            d17 = d27 + d32;
            d18 = d28 - d31;
        }
        double dAtan2 = Math.atan2(d21 - d18, d20 - d17);
        double dAtan22 = Math.atan2(d23 - d18, d22 - d17) - dAtan2;
        if (z11 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d33 = d17 * d14;
        double d34 = d18 * d15;
        a(f1Var, (d33 * dCos) - (d34 * dSin), (d33 * dSin) + (d34 * dCos), d14, d15, d10, d11, d19, dAtan2, dAtan22);
    }

    public static final f1 c(List<? extends h> list, f1 f1Var) {
        h hVar;
        float f10;
        int i10;
        int i11;
        h hVar2;
        float f11;
        float f12;
        float fC;
        float fE;
        float fD;
        float fE2;
        float fD2;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float fC2;
        List<? extends h> list2 = list;
        f1 f1Var2 = f1Var;
        int i12 = f1Var.i();
        f1Var.o();
        f1Var2.g(i12);
        h hVar3 = list.isEmpty() ? h.b.f17964c : list2.get(0);
        int size = list.size();
        float f18 = 0.0f;
        int i13 = 0;
        float f19 = 0.0f;
        float fD3 = 0.0f;
        float fC3 = 0.0f;
        float fD4 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (i13 < size) {
            h hVar4 = list2.get(i13);
            if (hVar4 instanceof h.b) {
                f1Var.close();
                f1Var2.k(f20, f21);
                hVar2 = hVar4;
                f19 = f20;
                fC3 = f19;
                fD3 = f21;
                fD4 = fD3;
            } else if (hVar4 instanceof h.n) {
                h.n nVar = (h.n) hVar4;
                fC3 += nVar.c();
                fD4 += nVar.d();
                f1Var2.b(nVar.c(), nVar.d());
                hVar2 = hVar4;
                f20 = fC3;
                f21 = fD4;
            } else {
                if (hVar4 instanceof h.f) {
                    h.f fVar = (h.f) hVar4;
                    float fC4 = fVar.c();
                    float fD5 = fVar.d();
                    f1Var2.k(fVar.c(), fVar.d());
                    fC3 = fC4;
                    f20 = fC3;
                    fD4 = fD5;
                    f21 = fD4;
                } else {
                    if (hVar4 instanceof h.m) {
                        h.m mVar = (h.m) hVar4;
                        f1Var2.p(mVar.c(), mVar.d());
                        fC3 += mVar.c();
                        fC2 = mVar.d();
                    } else if (hVar4 instanceof h.e) {
                        h.e eVar = (h.e) hVar4;
                        f1Var2.q(eVar.c(), eVar.d());
                        float fC5 = eVar.c();
                        fD4 = eVar.d();
                        fC3 = fC5;
                    } else if (hVar4 instanceof h.l) {
                        h.l lVar = (h.l) hVar4;
                        f1Var2.p(lVar.c(), f18);
                        fC3 += lVar.c();
                    } else if (hVar4 instanceof h.d) {
                        h.d dVar = (h.d) hVar4;
                        f1Var2.q(dVar.c(), fD4);
                        fC3 = dVar.c();
                    } else if (hVar4 instanceof h.r) {
                        h.r rVar = (h.r) hVar4;
                        f1Var2.p(f18, rVar.c());
                        fC2 = rVar.c();
                    } else if (hVar4 instanceof h.s) {
                        h.s sVar = (h.s) hVar4;
                        f1Var2.q(fC3, sVar.c());
                        fD4 = sVar.c();
                    } else {
                        if (hVar4 instanceof h.k) {
                            h.k kVar = (h.k) hVar4;
                            hVar = hVar4;
                            f1Var.c(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
                            fC = kVar.d() + fC3;
                            fE = kVar.g() + fD4;
                            fC3 += kVar.e();
                            fD = kVar.h();
                        } else {
                            hVar = hVar4;
                            if (hVar instanceof h.c) {
                                h.c cVar = (h.c) hVar;
                                f1Var.n(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
                                fC = cVar.d();
                                fE2 = cVar.g();
                                fD2 = cVar.e();
                                f13 = cVar.h();
                            } else if (hVar instanceof h.p) {
                                if (hVar3.a()) {
                                    f17 = fD4 - fD3;
                                    f16 = fC3 - f19;
                                } else {
                                    f16 = f18;
                                    f17 = f16;
                                }
                                h.p pVar = (h.p) hVar;
                                f1Var.c(f16, f17, pVar.c(), pVar.e(), pVar.d(), pVar.f());
                                fC = pVar.c() + fC3;
                                fE = pVar.e() + fD4;
                                fC3 += pVar.d();
                                fD = pVar.f();
                            } else if (hVar instanceof h.C0381h) {
                                if (hVar3.a()) {
                                    float f22 = 2;
                                    f15 = (f22 * fD4) - fD3;
                                    f14 = (fC3 * f22) - f19;
                                } else {
                                    f14 = fC3;
                                    f15 = fD4;
                                }
                                h.C0381h c0381h = (h.C0381h) hVar;
                                f1Var.n(f14, f15, c0381h.c(), c0381h.e(), c0381h.d(), c0381h.f());
                                fC = c0381h.c();
                                fE2 = c0381h.e();
                                fD2 = c0381h.d();
                                f13 = c0381h.f();
                            } else if (hVar instanceof h.o) {
                                h.o oVar = (h.o) hVar;
                                f1Var2.f(oVar.c(), oVar.e(), oVar.d(), oVar.f());
                                fC = oVar.c() + fC3;
                                fE = oVar.e() + fD4;
                                fC3 += oVar.d();
                                fD = oVar.f();
                            } else if (hVar instanceof h.g) {
                                h.g gVar = (h.g) hVar;
                                f1Var2.d(gVar.c(), gVar.e(), gVar.d(), gVar.f());
                                fC = gVar.c();
                                fE2 = gVar.e();
                                fD2 = gVar.d();
                                f13 = gVar.f();
                            } else if (hVar instanceof h.q) {
                                if (hVar3.b()) {
                                    f11 = fC3 - f19;
                                    f12 = fD4 - fD3;
                                } else {
                                    f11 = f18;
                                    f12 = f11;
                                }
                                h.q qVar = (h.q) hVar;
                                f1Var2.f(f11, f12, qVar.c(), qVar.d());
                                fC = f11 + fC3;
                                fE = f12 + fD4;
                                fC3 += qVar.c();
                                fD = qVar.d();
                            } else {
                                if (hVar instanceof h.i) {
                                    if (hVar3.b()) {
                                        float f23 = 2;
                                        fC3 = (fC3 * f23) - f19;
                                        fD4 = (f23 * fD4) - fD3;
                                    }
                                    h.i iVar = (h.i) hVar;
                                    f1Var2.d(fC3, fD4, iVar.c(), iVar.d());
                                    float fC6 = iVar.c();
                                    hVar2 = hVar;
                                    fD3 = fD4;
                                    f10 = f18;
                                    i10 = i13;
                                    i11 = size;
                                    fD4 = iVar.d();
                                    f19 = fC3;
                                    fC3 = fC6;
                                } else if (hVar instanceof h.j) {
                                    h.j jVar = (h.j) hVar;
                                    float fC7 = jVar.c() + fC3;
                                    float fD6 = jVar.d() + fD4;
                                    hVar2 = hVar;
                                    i10 = i13;
                                    f10 = 0.0f;
                                    i11 = size;
                                    b(f1Var, fC3, fD4, fC7, fD6, jVar.e(), jVar.g(), jVar.f(), jVar.h(), jVar.i());
                                    f19 = fC7;
                                    fC3 = f19;
                                    f20 = f20;
                                    f21 = f21;
                                    fD3 = fD6;
                                    fD4 = fD3;
                                } else {
                                    float f24 = f20;
                                    float f25 = f21;
                                    f10 = f18;
                                    i10 = i13;
                                    i11 = size;
                                    if (hVar instanceof h.a) {
                                        h.a aVar = (h.a) hVar;
                                        hVar2 = hVar;
                                        b(f1Var, fC3, fD4, aVar.c(), aVar.d(), aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.i());
                                        fC3 = aVar.c();
                                        fD3 = aVar.d();
                                        fD4 = fD3;
                                        f20 = f24;
                                        f21 = f25;
                                        f19 = fC3;
                                    } else {
                                        hVar2 = hVar;
                                        f20 = f24;
                                        f21 = f25;
                                    }
                                }
                                i13 = i10 + 1;
                                f1Var2 = f1Var;
                                size = i11;
                                hVar3 = hVar2;
                                f18 = f10;
                                list2 = list;
                            }
                            hVar2 = hVar;
                            fC3 = fD2;
                            fD4 = f13;
                            f10 = f18;
                            i10 = i13;
                            i11 = size;
                            fD3 = fE2;
                            f19 = fC;
                            i13 = i10 + 1;
                            f1Var2 = f1Var;
                            size = i11;
                            hVar3 = hVar2;
                            f18 = f10;
                            list2 = list;
                        }
                        fD4 += fD;
                        hVar2 = hVar;
                        fD3 = fE;
                        f10 = f18;
                        i10 = i13;
                        i11 = size;
                        f19 = fC;
                        i13 = i10 + 1;
                        f1Var2 = f1Var;
                        size = i11;
                        hVar3 = hVar2;
                        f18 = f10;
                        list2 = list;
                    }
                    fD4 += fC2;
                }
                hVar2 = hVar4;
            }
            f10 = f18;
            i10 = i13;
            i11 = size;
            i13 = i10 + 1;
            f1Var2 = f1Var;
            size = i11;
            hVar3 = hVar2;
            f18 = f10;
            list2 = list;
        }
        return f1Var;
    }
}
