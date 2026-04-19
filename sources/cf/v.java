package cf;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bf.a f6996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s0 s0Var, bf.a aVar) {
        super(s0Var);
        ae.r.f(s0Var, "writer");
        ae.r.f(aVar, "json");
        this.f6996c = aVar;
    }

    @Override // cf.m
    public void b() {
        n(true);
        this.f6997d++;
    }

    @Override // cf.m
    public void c() {
        n(false);
        j("\n");
        int i10 = this.f6997d;
        for (int i11 = 0; i11 < i10; i11++) {
            j(this.f6996c.f().j());
        }
    }

    @Override // cf.m
    public void o() {
        e(' ');
    }

    @Override // cf.m
    public void p() {
        this.f6997d--;
    }
}
