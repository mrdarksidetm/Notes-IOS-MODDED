package t0;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class a1 extends CancellationException {
    public a1() {
        super("The coroutine scope left the composition");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
