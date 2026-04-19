package le;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> extends i2 implements qd.d<T>, n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qd.g f14978c;

    public a(qd.g gVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            i0((a2) gVar.get(a2.R));
        }
        this.f14978c = gVar.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // le.i2
    public String N() {
        return r0.a(this) + " was cancelled";
    }

    protected void O0(Object obj) {
        x(obj);
    }

    protected void P0(Throwable th, boolean z10) {
    }

    protected void Q0(T t10) {
    }

    public final <R> void R0(p0 p0Var, R r10, zd.p<? super R, ? super qd.d<? super T>, ? extends Object> pVar) {
        p0Var.b(pVar, r10, this);
    }

    @Override // qd.d
    public final qd.g getContext() {
        return this.f14978c;
    }

    @Override // le.n0
    public qd.g getCoroutineContext() {
        return this.f14978c;
    }

    @Override // le.i2
    public final void h0(Throwable th) {
        l0.a(this.f14978c, th);
    }

    @Override // le.i2, le.a2
    public boolean isActive() {
        return super.isActive();
    }

    @Override // le.i2
    public String q0() {
        String strB = i0.b(this.f14978c);
        if (strB == null) {
            return super.q0();
        }
        return '\"' + strB + "\":" + super.q0();
    }

    @Override // qd.d
    public final void resumeWith(Object obj) {
        Object objO0 = o0(g0.d(obj, null, 1, null));
        if (objO0 == j2.f15069b) {
            return;
        }
        O0(objO0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // le.i2
    protected final void x0(Object obj) {
        if (!(obj instanceof c0)) {
            Q0(obj);
        } else {
            c0 c0Var = (c0) obj;
            P0(c0Var.f14990a, c0Var.a());
        }
    }
}
