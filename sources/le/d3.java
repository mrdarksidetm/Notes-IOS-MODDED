package le;

/* JADX INFO: loaded from: classes2.dex */
public final class d3 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d3 f15005c = new d3();

    private d3() {
    }

    @Override // le.j0
    public void g0(qd.g gVar, Runnable runnable) {
        h3 h3Var = (h3) gVar.get(h3.f15031c);
        if (h3Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        h3Var.f15032b = true;
    }

    @Override // le.j0
    public boolean i0(qd.g gVar) {
        return false;
    }

    @Override // le.j0
    public j0 j0(int i10) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // le.j0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
