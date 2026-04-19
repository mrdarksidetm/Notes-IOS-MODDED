package j6;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f13939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f13940b;

    b(boolean z10, boolean z11) {
        this.f13939a = z10;
        this.f13940b = z11;
    }

    public final boolean b() {
        return this.f13939a;
    }

    public final boolean c() {
        return this.f13940b;
    }
}
