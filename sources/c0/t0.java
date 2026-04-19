package c0;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class t0 extends CancellationException {
    public t0() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
