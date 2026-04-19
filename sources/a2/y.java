package a2;

/* JADX INFO: loaded from: classes.dex */
final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f353g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f347a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f348b = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f354h = 8.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f355i = androidx.compose.ui.graphics.g.f2806b.a();

    public final void a(y yVar) {
        this.f347a = yVar.f347a;
        this.f348b = yVar.f348b;
        this.f349c = yVar.f349c;
        this.f350d = yVar.f350d;
        this.f351e = yVar.f351e;
        this.f352f = yVar.f352f;
        this.f353g = yVar.f353g;
        this.f354h = yVar.f354h;
        this.f355i = yVar.f355i;
    }

    public final void b(androidx.compose.ui.graphics.d dVar) {
        this.f347a = dVar.F();
        this.f348b = dVar.r1();
        this.f349c = dVar.S0();
        this.f350d = dVar.D0();
        this.f351e = dVar.X0();
        this.f352f = dVar.a0();
        this.f353g = dVar.j0();
        this.f354h = dVar.Q0();
        this.f355i = dVar.V0();
    }

    public final boolean c(y yVar) {
        if (this.f347a == yVar.f347a) {
            if (this.f348b == yVar.f348b) {
                if (this.f349c == yVar.f349c) {
                    if (this.f350d == yVar.f350d) {
                        if (this.f351e == yVar.f351e) {
                            if (this.f352f == yVar.f352f) {
                                if (this.f353g == yVar.f353g) {
                                    if ((this.f354h == yVar.f354h) && androidx.compose.ui.graphics.g.e(this.f355i, yVar.f355i)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
