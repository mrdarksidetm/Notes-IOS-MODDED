package o6;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a6.j f16400e;

    public o(boolean z10, boolean z11, boolean z12, int i10, a6.j jVar) {
        this.f16396a = z10;
        this.f16397b = z11;
        this.f16398c = z12;
        this.f16399d = i10;
        this.f16400e = jVar;
    }

    public /* synthetic */ o(boolean z10, boolean z11, boolean z12, int i10, a6.j jVar, int i11, ae.j jVar2) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? true : z11, (i11 & 4) == 0 ? z12 : true, (i11 & 8) != 0 ? 4 : i10, (i11 & 16) != 0 ? a6.j.RESPECT_PERFORMANCE : jVar);
    }

    public final boolean a() {
        return this.f16396a;
    }

    public final a6.j b() {
        return this.f16400e;
    }

    public final int c() {
        return this.f16399d;
    }

    public final boolean d() {
        return this.f16397b;
    }

    public final boolean e() {
        return this.f16398c;
    }
}
