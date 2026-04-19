package le;

/* JADX INFO: loaded from: classes2.dex */
final class x1 extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.l<Throwable, md.i0> f15125a;

    /* JADX WARN: Multi-variable type inference failed */
    public x1(zd.l<? super Throwable, md.i0> lVar) {
        this.f15125a = lVar;
    }

    @Override // le.n
    public void e(Throwable th) {
        this.f15125a.invoke(th);
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ md.i0 invoke(Throwable th) {
        e(th);
        return md.i0.f15558a;
    }

    public String toString() {
        return "InvokeOnCancel[" + r0.a(this.f15125a) + '@' + r0.b(this) + ']';
    }
}
