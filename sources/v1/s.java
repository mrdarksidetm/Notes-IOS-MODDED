package v1;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class s extends CancellationException {
    public s(long j10) {
        super("Timed out waiting for " + j10 + " ms");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
