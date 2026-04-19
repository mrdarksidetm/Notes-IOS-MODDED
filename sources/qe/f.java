package qe;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements le.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.g f19054a;

    public f(qd.g gVar) {
        this.f19054a = gVar;
    }

    @Override // le.n0
    public qd.g getCoroutineContext() {
        return this.f19054a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
