package bf;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f5807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f5808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f5811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private r f5814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private df.c f5815n;

    public d(a aVar) {
        ae.r.f(aVar, "json");
        this.f5802a = aVar.f().e();
        this.f5803b = aVar.f().f();
        this.f5804c = aVar.f().g();
        this.f5805d = aVar.f().m();
        this.f5806e = aVar.f().b();
        this.f5807f = aVar.f().i();
        this.f5808g = aVar.f().j();
        this.f5809h = aVar.f().d();
        this.f5810i = aVar.f().l();
        this.f5811j = aVar.f().c();
        this.f5812k = aVar.f().a();
        this.f5813l = aVar.f().k();
        this.f5814m = aVar.f().h();
        this.f5815n = aVar.a();
    }

    public final f a() {
        if (this.f5810i && !ae.r.b(this.f5811j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (this.f5807f) {
            if (!ae.r.b(this.f5808g, "    ")) {
                String str = this.f5808g;
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    boolean z11 = true;
                    if (i10 >= str.length()) {
                        z10 = true;
                        break;
                    }
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        z11 = false;
                    }
                    if (!z11) {
                        break;
                    }
                    i10++;
                }
                if (!z10) {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f5808g).toString());
                }
            }
        } else if (!ae.r.b(this.f5808g, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        return new f(this.f5802a, this.f5804c, this.f5805d, this.f5806e, this.f5807f, this.f5803b, this.f5808g, this.f5809h, this.f5810i, this.f5811j, this.f5812k, this.f5813l, this.f5814m);
    }

    public final df.c b() {
        return this.f5815n;
    }

    public final void c(boolean z10) {
        this.f5804c = z10;
    }
}
