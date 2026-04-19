package le;

/* JADX INFO: loaded from: classes2.dex */
public interface u0<T> extends a2 {
    Object await(qd.d<? super T> dVar);

    T getCompleted();

    Throwable getCompletionExceptionOrNull();

    te.c<T> getOnAwait();
}
