package v1;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class d extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f21904a = new d();

    private d() {
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
