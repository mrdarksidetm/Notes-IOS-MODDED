package cf;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6969c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s0 s0Var, boolean z10) {
        super(s0Var);
        ae.r.f(s0Var, "writer");
        this.f6969c = z10;
    }

    @Override // cf.m
    public void m(String str) {
        ae.r.f(str, "value");
        if (this.f6969c) {
            super.m(str);
        } else {
            super.j(str);
        }
    }
}
