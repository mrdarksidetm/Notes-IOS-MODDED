package pe;

/* JADX INFO: loaded from: classes2.dex */
final class u<T> implements qd.d<T>, sd.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.d<T> f18369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qd.g f18370b;

    /* JADX WARN: Multi-variable type inference failed */
    public u(qd.d<? super T> dVar, qd.g gVar) {
        this.f18369a = dVar;
        this.f18370b = gVar;
    }

    @Override // sd.c
    public sd.c getCallerFrame() {
        qd.d<T> dVar = this.f18369a;
        if (dVar instanceof sd.c) {
            return (sd.c) dVar;
        }
        return null;
    }

    @Override // qd.d
    public qd.g getContext() {
        return this.f18370b;
    }

    @Override // qd.d
    public void resumeWith(Object obj) {
        this.f18369a.resumeWith(obj);
    }
}
