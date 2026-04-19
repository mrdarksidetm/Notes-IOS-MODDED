package d0;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class d0 extends CancellationException {
    public d0() {
        super("Mutation interrupted");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
