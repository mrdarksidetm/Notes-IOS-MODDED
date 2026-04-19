package bf;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f5816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f5819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f5821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f5822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f5823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f5824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f5825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f5826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f5827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final r f5828m;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, r rVar) {
        ae.r.f(str, "prettyPrintIndent");
        ae.r.f(str2, "classDiscriminator");
        this.f5816a = z10;
        this.f5817b = z11;
        this.f5818c = z12;
        this.f5819d = z13;
        this.f5820e = z14;
        this.f5821f = z15;
        this.f5822g = str;
        this.f5823h = z16;
        this.f5824i = z17;
        this.f5825j = str2;
        this.f5826k = z18;
        this.f5827l = z19;
        this.f5828m = rVar;
    }

    public /* synthetic */ f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, r rVar, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & 256) != 0 ? false : z17, (i10 & 512) != 0 ? "type" : str2, (i10 & 1024) == 0 ? z18 : false, (i10 & 2048) == 0 ? z19 : true, (i10 & 4096) != 0 ? null : rVar);
    }

    public final boolean a() {
        return this.f5826k;
    }

    public final boolean b() {
        return this.f5819d;
    }

    public final String c() {
        return this.f5825j;
    }

    public final boolean d() {
        return this.f5823h;
    }

    public final boolean e() {
        return this.f5816a;
    }

    public final boolean f() {
        return this.f5821f;
    }

    public final boolean g() {
        return this.f5817b;
    }

    public final r h() {
        return this.f5828m;
    }

    public final boolean i() {
        return this.f5820e;
    }

    public final String j() {
        return this.f5822g;
    }

    public final boolean k() {
        return this.f5827l;
    }

    public final boolean l() {
        return this.f5824i;
    }

    public final boolean m() {
        return this.f5818c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f5816a + ", ignoreUnknownKeys=" + this.f5817b + ", isLenient=" + this.f5818c + ", allowStructuredMapKeys=" + this.f5819d + ", prettyPrint=" + this.f5820e + ", explicitNulls=" + this.f5821f + ", prettyPrintIndent='" + this.f5822g + "', coerceInputValues=" + this.f5823h + ", useArrayPolymorphism=" + this.f5824i + ", classDiscriminator='" + this.f5825j + "', allowSpecialFloatingPointValues=" + this.f5826k + ", useAlternativeNames=" + this.f5827l + ", namingStrategy=" + this.f5828m + ')';
    }
}
