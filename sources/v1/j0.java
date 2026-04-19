package v1;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class j0 extends CancellationException {
    public j0() {
        super("Pointer input was reset");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
