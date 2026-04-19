package cf;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s0 s0Var, boolean z10) {
        super(s0Var);
        ae.r.f(s0Var, "writer");
        this.f6993c = z10;
    }

    @Override // cf.m
    public void d(byte b10) {
        boolean z10 = this.f6993c;
        String strJ = md.y.j(md.y.b(b10));
        if (z10) {
            m(strJ);
        } else {
            j(strJ);
        }
    }

    @Override // cf.m
    public void h(int i10) {
        boolean z10 = this.f6993c;
        int iB = md.a0.b(i10);
        if (z10) {
            m(Long.toString(((long) iB) & 4294967295L, 10));
        } else {
            j(Long.toString(((long) iB) & 4294967295L, 10));
        }
    }

    @Override // cf.m
    public void i(long j10) {
        boolean z10 = this.f6993c;
        long jB = md.c0.b(j10);
        if (z10) {
            m(t.a(jB, 10));
        } else {
            j(s.a(jB, 10));
        }
    }

    @Override // cf.m
    public void k(short s10) {
        boolean z10 = this.f6993c;
        String strJ = md.f0.j(md.f0.b(s10));
        if (z10) {
            m(strJ);
        } else {
            j(strJ);
        }
    }
}
