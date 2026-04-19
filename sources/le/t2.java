package le;

/* JADX INFO: loaded from: classes2.dex */
final class t2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f15118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o<md.i0> f15119b;

    /* JADX WARN: Multi-variable type inference failed */
    public t2(j0 j0Var, o<? super md.i0> oVar) {
        this.f15118a = j0Var;
        this.f15119b = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f15119b.j(this.f15118a, md.i0.f15558a);
    }
}
