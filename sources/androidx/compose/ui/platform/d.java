package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static d f2888f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i2.d0 f2891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2886d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f2887e = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final u2.h f2889g = u2.h.Rtl;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final u2.h f2890h = u2.h.Ltr;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final d a() {
            if (d.f2888f == null) {
                d.f2888f = new d(null);
            }
            d dVar = d.f2888f;
            ae.r.d(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return dVar;
        }
    }

    private d() {
    }

    public /* synthetic */ d(ae.j jVar) {
        this();
    }

    private final int i(int i10, u2.h hVar) {
        i2.d0 d0Var = this.f2891c;
        i2.d0 d0Var2 = null;
        if (d0Var == null) {
            ae.r.t("layoutResult");
            d0Var = null;
        }
        int iT = d0Var.t(i10);
        i2.d0 d0Var3 = this.f2891c;
        if (d0Var3 == null) {
            ae.r.t("layoutResult");
            d0Var3 = null;
        }
        if (hVar != d0Var3.x(iT)) {
            i2.d0 d0Var4 = this.f2891c;
            if (d0Var4 == null) {
                ae.r.t("layoutResult");
            } else {
                d0Var2 = d0Var4;
            }
            return d0Var2.t(i10);
        }
        i2.d0 d0Var5 = this.f2891c;
        if (d0Var5 == null) {
            ae.r.t("layoutResult");
            d0Var5 = null;
        }
        return i2.d0.o(d0Var5, i10, false, 2, null) - 1;
    }

    @Override // b2.a
    public int[] a(int i10) {
        int iP;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i2.d0 d0Var = this.f2891c;
            if (d0Var == null) {
                ae.r.t("layoutResult");
                d0Var = null;
            }
            iP = d0Var.p(0);
        } else {
            i2.d0 d0Var2 = this.f2891c;
            if (d0Var2 == null) {
                ae.r.t("layoutResult");
                d0Var2 = null;
            }
            int iP2 = d0Var2.p(i10);
            iP = i(iP2, f2889g) == i10 ? iP2 : iP2 + 1;
        }
        i2.d0 d0Var3 = this.f2891c;
        if (d0Var3 == null) {
            ae.r.t("layoutResult");
            d0Var3 = null;
        }
        if (iP >= d0Var3.m()) {
            return null;
        }
        return c(i(iP, f2889g), i(iP, f2890h) + 1);
    }

    @Override // b2.a
    public int[] b(int i10) {
        int iP;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > d().length()) {
            i2.d0 d0Var = this.f2891c;
            if (d0Var == null) {
                ae.r.t("layoutResult");
                d0Var = null;
            }
            iP = d0Var.p(d().length());
        } else {
            i2.d0 d0Var2 = this.f2891c;
            if (d0Var2 == null) {
                ae.r.t("layoutResult");
                d0Var2 = null;
            }
            int iP2 = d0Var2.p(i10);
            iP = i(iP2, f2890h) + 1 == i10 ? iP2 : iP2 - 1;
        }
        if (iP < 0) {
            return null;
        }
        return c(i(iP, f2889g), i(iP, f2890h) + 1);
    }

    public final void j(String str, i2.d0 d0Var) {
        f(str);
        this.f2891c = d0Var;
    }
}
