package qe;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient qd.g f19060a;

    public i(qd.g gVar) {
        this.f19060a = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f19060a.toString();
    }
}
