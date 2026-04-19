package le;

/* JADX INFO: loaded from: classes2.dex */
public final class e3<T> extends qe.d0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ThreadLocal<md.s<qd.g, Object>> f15015e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public e3(qd.g gVar, qd.d<? super T> dVar) {
        f3 f3Var = f3.f15024a;
        super(gVar.get(f3Var) == null ? gVar.plus(f3Var) : gVar, dVar);
        this.f15015e = new ThreadLocal<>();
        if (dVar.getContext().get(qd.e.U) instanceof j0) {
            return;
        }
        Object objC = qe.l0.c(gVar, null);
        qe.l0.a(gVar, objC);
        T0(gVar, objC);
    }

    @Override // qe.d0, le.a
    protected void O0(Object obj) {
        if (this.threadLocalIsSet) {
            md.s<qd.g, Object> sVar = this.f15015e.get();
            if (sVar != null) {
                qe.l0.a(sVar.a(), sVar.b());
            }
            this.f15015e.remove();
        }
        Object objA = g0.a(obj, this.f19049d);
        qd.d<T> dVar = this.f19049d;
        qd.g context = dVar.getContext();
        Object objC = qe.l0.c(context, null);
        e3<?> e3VarG = objC != qe.l0.f19070a ? i0.g(dVar, context, objC) : null;
        try {
            this.f19049d.resumeWith(objA);
            md.i0 i0Var = md.i0.f15558a;
        } finally {
            if (e3VarG == null || e3VarG.S0()) {
                qe.l0.a(context, objC);
            }
        }
    }

    public final boolean S0() {
        boolean z10 = this.threadLocalIsSet && this.f15015e.get() == null;
        this.f15015e.remove();
        return !z10;
    }

    public final void T0(qd.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f15015e.set(md.x.a(gVar, obj));
    }
}
