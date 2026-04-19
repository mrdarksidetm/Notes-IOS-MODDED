package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1763a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1764b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1765c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1766d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1767e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1768f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1769g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1770h = false;

    k0() {
    }

    public int a() {
        return this.f1769g ? this.f1763a : this.f1764b;
    }

    public int b() {
        return this.f1763a;
    }

    public int c() {
        return this.f1764b;
    }

    public int d() {
        return this.f1769g ? this.f1764b : this.f1763a;
    }

    public void e(int i10, int i11) {
        this.f1770h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1767e = i10;
            this.f1763a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1768f = i11;
            this.f1764b = i11;
        }
    }

    public void f(boolean z10) {
        int i10;
        if (z10 == this.f1769g) {
            return;
        }
        this.f1769g = z10;
        if (this.f1770h) {
            if (z10) {
                int i11 = this.f1766d;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = this.f1767e;
                }
                this.f1763a = i11;
                i10 = this.f1765c;
                if (i10 == Integer.MIN_VALUE) {
                }
            } else {
                int i12 = this.f1765c;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = this.f1767e;
                }
                this.f1763a = i12;
                i10 = this.f1766d;
                if (i10 == Integer.MIN_VALUE) {
                }
            }
            this.f1764b = i10;
        }
        this.f1763a = this.f1767e;
        i10 = this.f1768f;
        this.f1764b = i10;
    }

    public void g(int i10, int i11) {
        this.f1765c = i10;
        this.f1766d = i11;
        this.f1770h = true;
        if (this.f1769g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1763a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1764b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1763a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1764b = i11;
        }
    }
}
