package ne;

import java.util.concurrent.CancellationException;
import le.o1;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class l {
    public static final void a(t<?> tVar, Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = o1.a("Channel was consumed, consumer had failed", th);
            }
        }
        tVar.cancel(cancellationExceptionA);
    }
}
