package ca;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends ba.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6680c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6681d = false;

    @Override // ba.w
    public final void a(boolean z10) {
        this.f6681d = z10;
    }

    @Override // ba.w
    public final void b(boolean z10) {
        this.f6680c = z10;
    }

    @Override // ba.w
    public final void c(String str, String str2) {
        this.f6678a = str;
        this.f6679b = str2;
    }

    public final String d() {
        return this.f6678a;
    }

    public final String e() {
        return this.f6679b;
    }

    public final boolean f() {
        return this.f6681d;
    }

    public final boolean g() {
        return (this.f6678a == null || this.f6679b == null) ? false : true;
    }

    public final boolean h() {
        return this.f6680c;
    }
}
