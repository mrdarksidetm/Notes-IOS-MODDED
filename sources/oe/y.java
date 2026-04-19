package oe;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends pe.d<w<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16602a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qd.d<? super md.i0> f16603b;

    @Override // pe.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(w<?> wVar) {
        if (this.f16602a >= 0) {
            return false;
        }
        this.f16602a = wVar.Z();
        return true;
    }

    @Override // pe.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public qd.d<md.i0>[] b(w<?> wVar) {
        long j10 = this.f16602a;
        this.f16602a = -1L;
        this.f16603b = null;
        return wVar.Y(j10);
    }
}
