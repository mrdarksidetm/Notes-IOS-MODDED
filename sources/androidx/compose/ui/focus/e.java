package androidx.compose.ui.focus;

import ae.s;
import androidx.compose.ui.focus.f;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2710a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f2711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f2712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f2713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f2714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f2715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f2716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f f2717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private f f2718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private zd.l<? super androidx.compose.ui.focus.b, f> f2719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private zd.l<? super androidx.compose.ui.focus.b, f> f2720k;

    static final class a extends s implements zd.l<androidx.compose.ui.focus.b, f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2721a = new a();

        a() {
            super(1);
        }

        public final f a(int i10) {
            return f.f2723b.b();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ f invoke(androidx.compose.ui.focus.b bVar) {
            return a(bVar.o());
        }
    }

    static final class b extends s implements zd.l<androidx.compose.ui.focus.b, f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2722a = new b();

        b() {
            super(1);
        }

        public final f a(int i10) {
            return f.f2723b.b();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ f invoke(androidx.compose.ui.focus.b bVar) {
            return a(bVar.o());
        }
    }

    public e() {
        f.a aVar = f.f2723b;
        this.f2711b = aVar.b();
        this.f2712c = aVar.b();
        this.f2713d = aVar.b();
        this.f2714e = aVar.b();
        this.f2715f = aVar.b();
        this.f2716g = aVar.b();
        this.f2717h = aVar.b();
        this.f2718i = aVar.b();
        this.f2719j = a.f2721a;
        this.f2720k = b.f2722a;
    }

    @Override // androidx.compose.ui.focus.d
    public f c() {
        return this.f2715f;
    }

    @Override // androidx.compose.ui.focus.d
    public f d() {
        return this.f2717h;
    }

    @Override // androidx.compose.ui.focus.d
    public f f() {
        return this.f2716g;
    }

    @Override // androidx.compose.ui.focus.d
    public boolean g() {
        return this.f2710a;
    }

    @Override // androidx.compose.ui.focus.d
    public f h() {
        return this.f2712c;
    }

    @Override // androidx.compose.ui.focus.d
    public f i() {
        return this.f2713d;
    }

    @Override // androidx.compose.ui.focus.d
    public f j() {
        return this.f2711b;
    }

    @Override // androidx.compose.ui.focus.d
    public zd.l<androidx.compose.ui.focus.b, f> k() {
        return this.f2720k;
    }

    @Override // androidx.compose.ui.focus.d
    public f l() {
        return this.f2718i;
    }

    @Override // androidx.compose.ui.focus.d
    public f m() {
        return this.f2714e;
    }

    @Override // androidx.compose.ui.focus.d
    public void n(boolean z10) {
        this.f2710a = z10;
    }

    @Override // androidx.compose.ui.focus.d
    public zd.l<androidx.compose.ui.focus.b, f> o() {
        return this.f2719j;
    }
}
