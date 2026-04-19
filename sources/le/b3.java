package le;

/* JADX INFO: loaded from: classes2.dex */
final class b3<U, T extends U> extends qe.d0<T> implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14988e;

    public b3(long j10, qd.d<? super U> dVar) {
        super(dVar.getContext(), dVar);
        this.f14988e = j10;
    }

    @Override // le.a, le.i2
    public String q0() {
        return super.q0() + "(timeMillis=" + this.f14988e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        D(c3.a(this.f14988e, x0.b(getContext()), this));
    }
}
