package p1;

import java.util.ArrayList;
import p1.h;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final void a(char c10, ArrayList<h> arrayList, float[] fArr, int i10) {
        int i11 = 0;
        if (c10 == 'z' || c10 == 'Z') {
            arrayList.add(h.b.f17964c);
            return;
        }
        if (c10 == 'm') {
            int i12 = i10 - 2;
            while (i11 <= i12) {
                int i13 = i11 + 1;
                h nVar = new h.n(fArr[i11], fArr[i13]);
                if ((nVar instanceof h.f) && i11 > 0) {
                    nVar = new h.e(fArr[i11], fArr[i13]);
                } else if (i11 > 0) {
                    nVar = new h.m(fArr[i11], fArr[i13]);
                }
                arrayList.add(nVar);
                i11 += 2;
            }
            return;
        }
        if (c10 == 'M') {
            int i14 = i10 - 2;
            while (i11 <= i14) {
                int i15 = i11 + 1;
                h fVar = new h.f(fArr[i11], fArr[i15]);
                if (i11 > 0) {
                    fVar = new h.e(fArr[i11], fArr[i15]);
                } else if ((fVar instanceof h.n) && i11 > 0) {
                    fVar = new h.m(fArr[i11], fArr[i15]);
                }
                arrayList.add(fVar);
                i11 += 2;
            }
            return;
        }
        if (c10 == 'l') {
            int i16 = i10 - 2;
            while (i11 <= i16) {
                int i17 = i11 + 1;
                h mVar = new h.m(fArr[i11], fArr[i17]);
                if ((mVar instanceof h.f) && i11 > 0) {
                    mVar = new h.e(fArr[i11], fArr[i17]);
                } else if ((mVar instanceof h.n) && i11 > 0) {
                    mVar = new h.m(fArr[i11], fArr[i17]);
                }
                arrayList.add(mVar);
                i11 += 2;
            }
            return;
        }
        if (c10 == 'L') {
            int i18 = i10 - 2;
            while (i11 <= i18) {
                int i19 = i11 + 1;
                h eVar = new h.e(fArr[i11], fArr[i19]);
                if ((eVar instanceof h.f) && i11 > 0) {
                    eVar = new h.e(fArr[i11], fArr[i19]);
                } else if ((eVar instanceof h.n) && i11 > 0) {
                    eVar = new h.m(fArr[i11], fArr[i19]);
                }
                arrayList.add(eVar);
                i11 += 2;
            }
            return;
        }
        if (c10 == 'h') {
            int i20 = i10 - 1;
            while (i11 <= i20) {
                h lVar = new h.l(fArr[i11]);
                if ((lVar instanceof h.f) && i11 > 0) {
                    lVar = new h.e(fArr[i11], fArr[i11 + 1]);
                } else if ((lVar instanceof h.n) && i11 > 0) {
                    lVar = new h.m(fArr[i11], fArr[i11 + 1]);
                }
                arrayList.add(lVar);
                i11++;
            }
            return;
        }
        if (c10 == 'H') {
            int i21 = i10 - 1;
            while (i11 <= i21) {
                h dVar = new h.d(fArr[i11]);
                if ((dVar instanceof h.f) && i11 > 0) {
                    dVar = new h.e(fArr[i11], fArr[i11 + 1]);
                } else if ((dVar instanceof h.n) && i11 > 0) {
                    dVar = new h.m(fArr[i11], fArr[i11 + 1]);
                }
                arrayList.add(dVar);
                i11++;
            }
            return;
        }
        if (c10 == 'v') {
            int i22 = i10 - 1;
            while (i11 <= i22) {
                h rVar = new h.r(fArr[i11]);
                if ((rVar instanceof h.f) && i11 > 0) {
                    rVar = new h.e(fArr[i11], fArr[i11 + 1]);
                } else if ((rVar instanceof h.n) && i11 > 0) {
                    rVar = new h.m(fArr[i11], fArr[i11 + 1]);
                }
                arrayList.add(rVar);
                i11++;
            }
            return;
        }
        if (c10 == 'V') {
            int i23 = i10 - 1;
            while (i11 <= i23) {
                h sVar = new h.s(fArr[i11]);
                if ((sVar instanceof h.f) && i11 > 0) {
                    sVar = new h.e(fArr[i11], fArr[i11 + 1]);
                } else if ((sVar instanceof h.n) && i11 > 0) {
                    sVar = new h.m(fArr[i11], fArr[i11 + 1]);
                }
                arrayList.add(sVar);
                i11++;
            }
            return;
        }
        if (c10 == 'c') {
            int i24 = i10 - 6;
            while (i11 <= i24) {
                int i25 = i11 + 1;
                h kVar = new h.k(fArr[i11], fArr[i25], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]);
                if ((kVar instanceof h.f) && i11 > 0) {
                    kVar = new h.e(fArr[i11], fArr[i25]);
                } else if ((kVar instanceof h.n) && i11 > 0) {
                    kVar = new h.m(fArr[i11], fArr[i25]);
                }
                arrayList.add(kVar);
                i11 += 6;
            }
            return;
        }
        if (c10 == 'C') {
            int i26 = i10 - 6;
            while (i11 <= i26) {
                int i27 = i11 + 1;
                h cVar = new h.c(fArr[i11], fArr[i27], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]);
                if ((cVar instanceof h.f) && i11 > 0) {
                    cVar = new h.e(fArr[i11], fArr[i27]);
                } else if ((cVar instanceof h.n) && i11 > 0) {
                    cVar = new h.m(fArr[i11], fArr[i27]);
                }
                arrayList.add(cVar);
                i11 += 6;
            }
            return;
        }
        if (c10 == 's') {
            int i28 = i10 - 4;
            while (i11 <= i28) {
                int i29 = i11 + 1;
                h pVar = new h.p(fArr[i11], fArr[i29], fArr[i11 + 2], fArr[i11 + 3]);
                if ((pVar instanceof h.f) && i11 > 0) {
                    pVar = new h.e(fArr[i11], fArr[i29]);
                } else if ((pVar instanceof h.n) && i11 > 0) {
                    pVar = new h.m(fArr[i11], fArr[i29]);
                }
                arrayList.add(pVar);
                i11 += 4;
            }
            return;
        }
        if (c10 == 'S') {
            int i30 = i10 - 4;
            while (i11 <= i30) {
                int i31 = i11 + 1;
                h c0381h = new h.C0381h(fArr[i11], fArr[i31], fArr[i11 + 2], fArr[i11 + 3]);
                if ((c0381h instanceof h.f) && i11 > 0) {
                    c0381h = new h.e(fArr[i11], fArr[i31]);
                } else if ((c0381h instanceof h.n) && i11 > 0) {
                    c0381h = new h.m(fArr[i11], fArr[i31]);
                }
                arrayList.add(c0381h);
                i11 += 4;
            }
            return;
        }
        if (c10 == 'q') {
            int i32 = i10 - 4;
            while (i11 <= i32) {
                int i33 = i11 + 1;
                h oVar = new h.o(fArr[i11], fArr[i33], fArr[i11 + 2], fArr[i11 + 3]);
                if ((oVar instanceof h.f) && i11 > 0) {
                    oVar = new h.e(fArr[i11], fArr[i33]);
                } else if ((oVar instanceof h.n) && i11 > 0) {
                    oVar = new h.m(fArr[i11], fArr[i33]);
                }
                arrayList.add(oVar);
                i11 += 4;
            }
            return;
        }
        if (c10 == 'Q') {
            int i34 = i10 - 4;
            while (i11 <= i34) {
                int i35 = i11 + 1;
                h gVar = new h.g(fArr[i11], fArr[i35], fArr[i11 + 2], fArr[i11 + 3]);
                if ((gVar instanceof h.f) && i11 > 0) {
                    gVar = new h.e(fArr[i11], fArr[i35]);
                } else if ((gVar instanceof h.n) && i11 > 0) {
                    gVar = new h.m(fArr[i11], fArr[i35]);
                }
                arrayList.add(gVar);
                i11 += 4;
            }
            return;
        }
        if (c10 == 't') {
            int i36 = i10 - 2;
            while (i11 <= i36) {
                int i37 = i11 + 1;
                h qVar = new h.q(fArr[i11], fArr[i37]);
                if ((qVar instanceof h.f) && i11 > 0) {
                    qVar = new h.e(fArr[i11], fArr[i37]);
                } else if ((qVar instanceof h.n) && i11 > 0) {
                    qVar = new h.m(fArr[i11], fArr[i37]);
                }
                arrayList.add(qVar);
                i11 += 2;
            }
            return;
        }
        if (c10 == 'T') {
            int i38 = i10 - 2;
            while (i11 <= i38) {
                int i39 = i11 + 1;
                h iVar = new h.i(fArr[i11], fArr[i39]);
                if ((iVar instanceof h.f) && i11 > 0) {
                    iVar = new h.e(fArr[i11], fArr[i39]);
                } else if ((iVar instanceof h.n) && i11 > 0) {
                    iVar = new h.m(fArr[i11], fArr[i39]);
                }
                arrayList.add(iVar);
                i11 += 2;
            }
            return;
        }
        if (c10 == 'a') {
            int i40 = i10 - 7;
            for (int i41 = 0; i41 <= i40; i41 += 7) {
                int i42 = i41 + 1;
                h jVar = new h.j(fArr[i41], fArr[i42], fArr[i41 + 2], Float.compare(fArr[i41 + 3], 0.0f) != 0, Float.compare(fArr[i41 + 4], 0.0f) != 0, fArr[i41 + 5], fArr[i41 + 6]);
                if ((jVar instanceof h.f) && i41 > 0) {
                    jVar = new h.e(fArr[i41], fArr[i42]);
                } else if ((jVar instanceof h.n) && i41 > 0) {
                    jVar = new h.m(fArr[i41], fArr[i42]);
                }
                arrayList.add(jVar);
            }
            return;
        }
        if (c10 != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c10);
        }
        int i43 = i10 - 7;
        for (int i44 = 0; i44 <= i43; i44 += 7) {
            int i45 = i44 + 1;
            h aVar = new h.a(fArr[i44], fArr[i45], fArr[i44 + 2], Float.compare(fArr[i44 + 3], 0.0f) != 0, Float.compare(fArr[i44 + 4], 0.0f) != 0, fArr[i44 + 5], fArr[i44 + 6]);
            if ((aVar instanceof h.f) && i44 > 0) {
                aVar = new h.e(fArr[i44], fArr[i45]);
            } else if ((aVar instanceof h.n) && i44 > 0) {
                aVar = new h.m(fArr[i44], fArr[i45]);
            }
            arrayList.add(aVar);
        }
    }
}
