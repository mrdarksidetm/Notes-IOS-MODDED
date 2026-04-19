package okhttp3;

/* JADX INFO: loaded from: classes2.dex */
public interface Call extends Cloneable {

    public interface Factory {
        Call b(Request request);
    }

    Response a();

    void cancel();

    void o(Callback callback);

    boolean w();
}
