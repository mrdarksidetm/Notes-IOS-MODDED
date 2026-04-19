package io.objectbox.exception;

/* JADX INFO: loaded from: classes2.dex */
public interface DbExceptionListener {
    static void cancelCurrentException() {
        DbExceptionListenerJni.nativeCancelCurrentException();
    }

    void onDbException(Exception exc);
}
