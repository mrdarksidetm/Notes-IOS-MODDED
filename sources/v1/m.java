package v1;

import a2.j1;
import a2.w0;
import androidx.compose.ui.e;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e.c f21943c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private y1.r f21946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p f21947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21948h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.b f21944d = new w1.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z.m<b0> f21945e = new z.m<>(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21949i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21950j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final v0.d<Long> f21951k = new v0.d<>(new Long[16], 0);

    public m(e.c cVar) {
        this.f21943c = cVar;
    }

    private final void i() {
        this.f21945e.b();
        this.f21946f = null;
    }

    private final boolean l(p pVar, p pVar2) {
        if (pVar == null || pVar.c().size() != pVar2.c().size()) {
            return true;
        }
        int size = pVar2.c().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!k1.f.l(pVar.c().get(i10).i(), pVar2.c().get(i10).i())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0215  */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // v1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(z.m<v1.b0> r36, y1.r r37, v1.h r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.m.a(z.m, y1.r, v1.h, boolean):boolean");
    }

    @Override // v1.n
    public void b(h hVar) {
        super.b(hVar);
        p pVar = this.f21947g;
        if (pVar == null) {
            return;
        }
        this.f21948h = this.f21949i;
        List<b0> listC = pVar.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0 b0Var = listC.get(i10);
            if ((b0Var.j() || (hVar.d(b0Var.g()) && this.f21949i)) ? false : true) {
                this.f21944d.i(b0Var.g());
            }
        }
        this.f21949i = false;
        this.f21950j = t.i(pVar.e(), t.f21997a.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // v1.n
    public void d() {
        v0.d<m> dVarG = g();
        int iO = dVarG.o();
        if (iO > 0) {
            m[] mVarArrN = dVarG.n();
            int i10 = 0;
            do {
                mVarArrN[i10].d();
                i10++;
            } while (i10 < iO);
        }
        e.c cVarG = this.f21943c;
        int iA = w0.a(16);
        v0.d dVar = null;
        while (cVarG != 0) {
            if (cVarG instanceof j1) {
                ((j1) cVarG).c0();
            } else {
                if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                    e.c cVarB2 = ((a2.l) cVarG).b2();
                    int i11 = 0;
                    cVarG = cVarG;
                    while (cVarB2 != null) {
                        if ((cVarB2.C1() & iA) != 0) {
                            i11++;
                            if (i11 == 1) {
                                cVarG = cVarB2;
                            } else {
                                if (dVar == null) {
                                    dVar = new v0.d(new e.c[16], 0);
                                }
                                if (cVarG != 0) {
                                    dVar.b(cVarG);
                                    cVarG = 0;
                                }
                                dVar.b(cVarB2);
                            }
                        }
                        cVarB2 = cVarB2.y1();
                        cVarG = cVarG;
                    }
                    if (i11 == 1) {
                    }
                }
            }
            cVarG = a2.k.g(dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // v1.n
    public boolean e(h hVar) {
        v0.d<m> dVarG;
        int iO;
        boolean z10 = true;
        int i10 = 0;
        if (!this.f21945e.g() && this.f21943c.H1()) {
            p pVar = this.f21947g;
            ae.r.c(pVar);
            y1.r rVar = this.f21946f;
            ae.r.c(rVar);
            long jA = rVar.a();
            e.c cVarG = this.f21943c;
            int iA = w0.a(16);
            v0.d dVar = null;
            while (cVarG != 0) {
                if (cVarG instanceof j1) {
                    ((j1) cVarG).Z(pVar, r.Final, jA);
                } else {
                    if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                        e.c cVarB2 = ((a2.l) cVarG).b2();
                        int i11 = 0;
                        cVarG = cVarG;
                        while (cVarB2 != null) {
                            if ((cVarB2.C1() & iA) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    cVarG = cVarB2;
                                } else {
                                    if (dVar == null) {
                                        dVar = new v0.d(new e.c[16], 0);
                                    }
                                    if (cVarG != 0) {
                                        dVar.b(cVarG);
                                        cVarG = 0;
                                    }
                                    dVar.b(cVarB2);
                                }
                            }
                            cVarB2 = cVarB2.y1();
                            cVarG = cVarG;
                        }
                        if (i11 == 1) {
                        }
                    }
                }
                cVarG = a2.k.g(dVar);
            }
            if (this.f21943c.H1() && (iO = (dVarG = g()).o()) > 0) {
                m[] mVarArrN = dVarG.n();
                do {
                    mVarArrN[i10].e(hVar);
                    i10++;
                } while (i10 < iO);
            }
        } else {
            z10 = false;
        }
        b(hVar);
        i();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v18 */
    @Override // v1.n
    public boolean f(z.m<b0> mVar, y1.r rVar, h hVar, boolean z10) {
        v0.d<m> dVarG;
        int iO;
        if (this.f21945e.g() || !this.f21943c.H1()) {
            return false;
        }
        p pVar = this.f21947g;
        ae.r.c(pVar);
        y1.r rVar2 = this.f21946f;
        ae.r.c(rVar2);
        long jA = rVar2.a();
        e.c cVarG = this.f21943c;
        int iA = w0.a(16);
        v0.d dVar = null;
        while (cVarG != 0) {
            if (cVarG instanceof j1) {
                ((j1) cVarG).Z(pVar, r.Initial, jA);
            } else {
                if (((cVarG.C1() & iA) != 0) && (cVarG instanceof a2.l)) {
                    e.c cVarB2 = ((a2.l) cVarG).b2();
                    int i10 = 0;
                    cVarG = cVarG;
                    while (cVarB2 != null) {
                        if ((cVarB2.C1() & iA) != 0) {
                            i10++;
                            if (i10 == 1) {
                                cVarG = cVarB2;
                            } else {
                                if (dVar == null) {
                                    dVar = new v0.d(new e.c[16], 0);
                                }
                                if (cVarG != 0) {
                                    dVar.b(cVarG);
                                    cVarG = 0;
                                }
                                dVar.b(cVarB2);
                            }
                        }
                        cVarB2 = cVarB2.y1();
                        cVarG = cVarG;
                    }
                    if (i10 == 1) {
                    }
                }
            }
            cVarG = a2.k.g(dVar);
        }
        if (this.f21943c.H1() && (iO = (dVarG = g()).o()) > 0) {
            m[] mVarArrN = dVarG.n();
            int i11 = 0;
            do {
                m mVar2 = mVarArrN[i11];
                z.m<b0> mVar3 = this.f21945e;
                y1.r rVar3 = this.f21946f;
                ae.r.c(rVar3);
                mVar2.f(mVar3, rVar3, hVar, z10);
                i11++;
            } while (i11 < iO);
        }
        if (this.f21943c.H1()) {
            e.c cVarG2 = this.f21943c;
            int iA2 = w0.a(16);
            v0.d dVar2 = null;
            while (cVarG2 != 0) {
                if (cVarG2 instanceof j1) {
                    ((j1) cVarG2).Z(pVar, r.Main, jA);
                } else {
                    if (((cVarG2.C1() & iA2) != 0) && (cVarG2 instanceof a2.l)) {
                        e.c cVarB22 = ((a2.l) cVarG2).b2();
                        int i12 = 0;
                        cVarG2 = cVarG2;
                        while (cVarB22 != null) {
                            if ((cVarB22.C1() & iA2) != 0) {
                                i12++;
                                if (i12 == 1) {
                                    cVarG2 = cVarB22;
                                } else {
                                    if (dVar2 == null) {
                                        dVar2 = new v0.d(new e.c[16], 0);
                                    }
                                    if (cVarG2 != 0) {
                                        dVar2.b(cVarG2);
                                        cVarG2 = 0;
                                    }
                                    dVar2.b(cVarB22);
                                }
                            }
                            cVarB22 = cVarB22.y1();
                            cVarG2 = cVarG2;
                        }
                        if (i12 == 1) {
                        }
                    }
                }
                cVarG2 = a2.k.g(dVar2);
            }
        }
        return true;
    }

    public final e.c j() {
        return this.f21943c;
    }

    public final w1.b k() {
        return this.f21944d;
    }

    public final void m() {
        this.f21949i = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.f21943c + ", children=" + g() + ", pointerIds=" + this.f21944d + ')';
    }
}
