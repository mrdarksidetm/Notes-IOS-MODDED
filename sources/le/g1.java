package le;

/* JADX INFO: loaded from: classes2.dex */
final class g1 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1 f15027a;

    public g1(f1 f1Var) {
        this.f15027a = f1Var;
    }

    @Override // le.n
    public void e(Throwable th) {
        this.f15027a.dispose();
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
        e(th);
        return md.i0.f15558a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f15027a + ']';
    }
}
