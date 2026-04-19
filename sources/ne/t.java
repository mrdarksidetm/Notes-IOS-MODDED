package ne;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public interface t<E> {
    Object c(qd.d<? super E> dVar);

    void cancel(CancellationException cancellationException);

    Object g();

    f<E> iterator();
}
