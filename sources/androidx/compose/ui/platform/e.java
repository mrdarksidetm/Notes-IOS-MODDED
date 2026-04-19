package androidx.compose.ui.platform;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static e f2895h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i2.d0 f2898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g2.p f2899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f2900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f2893f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f2894g = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final u2.h f2896i = u2.h.Rtl;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final u2.h f2897j = u2.h.Ltr;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final e a() {
            if (e.f2895h == null) {
                e.f2895h = new e(null);
            }
            e eVar = e.f2895h;
            ae.r.d(eVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return eVar;
        }
    }

    private e() {
        this.f2900e = new Rect();
    }

    public /* synthetic */ e(ae.j jVar) {
        this();
    }

    private final int i(int i10, u2.h hVar) {
        i2.d0 d0Var = this.f2898c;
        i2.d0 d0Var2 = null;
        if (d0Var == null) {
            ae.r.t("layoutResult");
            d0Var = null;
        }
        int iT = d0Var.t(i10);
        i2.d0 d0Var3 = this.f2898c;
        if (d0Var3 == null) {
            ae.r.t("layoutResult");
            d0Var3 = null;
        }
        if (hVar != d0Var3.x(iT)) {
            i2.d0 d0Var4 = this.f2898c;
            if (d0Var4 == null) {
                ae.r.t("layoutResult");
            } else {
                d0Var2 = d0Var4;
            }
            return d0Var2.t(i10);
        }
        i2.d0 d0Var5 = this.f2898c;
        if (d0Var5 == null) {
            ae.r.t("layoutResult");
            d0Var5 = null;
        }
        return i2.d0.o(d0Var5, i10, false, 2, null) - 1;
    }

    @Override // b2.a
    public int[] a(int i10) {
        int iM;
        i2.d0 d0Var = null;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        try {
            g2.p pVar = this.f2899d;
            if (pVar == null) {
                ae.r.t("node");
                pVar = null;
            }
            int iD = ce.c.d(pVar.i().e());
            int iD2 = ge.o.d(0, i10);
            i2.d0 d0Var2 = this.f2898c;
            if (d0Var2 == null) {
                ae.r.t("layoutResult");
                d0Var2 = null;
            }
            int iP = d0Var2.p(iD2);
            i2.d0 d0Var3 = this.f2898c;
            if (d0Var3 == null) {
                ae.r.t("layoutResult");
                d0Var3 = null;
            }
            float fU = d0Var3.u(iP) + iD;
            i2.d0 d0Var4 = this.f2898c;
            if (d0Var4 == null) {
                ae.r.t("layoutResult");
                d0Var4 = null;
            }
            i2.d0 d0Var5 = this.f2898c;
            if (d0Var5 == null) {
                ae.r.t("layoutResult");
                d0Var5 = null;
            }
            if (fU < d0Var4.u(d0Var5.m() - 1)) {
                i2.d0 d0Var6 = this.f2898c;
                if (d0Var6 == null) {
                    ae.r.t("layoutResult");
                } else {
                    d0Var = d0Var6;
                }
                iM = d0Var.q(fU);
            } else {
                i2.d0 d0Var7 = this.f2898c;
                if (d0Var7 == null) {
                    ae.r.t("layoutResult");
                } else {
                    d0Var = d0Var7;
                }
                iM = d0Var.m();
            }
            return c(iD2, i(iM - 1, f2897j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // b2.a
    public int[] b(int i10) {
        int iQ;
        i2.d0 d0Var = null;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            g2.p pVar = this.f2899d;
            if (pVar == null) {
                ae.r.t("node");
                pVar = null;
            }
            int iD = ce.c.d(pVar.i().e());
            int iH = ge.o.h(d().length(), i10);
            i2.d0 d0Var2 = this.f2898c;
            if (d0Var2 == null) {
                ae.r.t("layoutResult");
                d0Var2 = null;
            }
            int iP = d0Var2.p(iH);
            i2.d0 d0Var3 = this.f2898c;
            if (d0Var3 == null) {
                ae.r.t("layoutResult");
                d0Var3 = null;
            }
            float fU = d0Var3.u(iP) - iD;
            if (fU > 0.0f) {
                i2.d0 d0Var4 = this.f2898c;
                if (d0Var4 == null) {
                    ae.r.t("layoutResult");
                } else {
                    d0Var = d0Var4;
                }
                iQ = d0Var.q(fU);
            } else {
                iQ = 0;
            }
            if (iH == d().length() && iQ < iP) {
                iQ++;
            }
            return c(i(iQ, f2896i), iH);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String str, i2.d0 d0Var, g2.p pVar) {
        f(str);
        this.f2898c = d0Var;
        this.f2899d = pVar;
    }
}
