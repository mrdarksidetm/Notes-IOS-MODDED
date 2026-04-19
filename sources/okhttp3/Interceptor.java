package okhttp3;

/* JADX INFO: loaded from: classes2.dex */
public interface Interceptor {

    public interface Chain {
        Response a(Request request);

        Request b();

        Call call();
    }

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16854a = new Companion();

        private Companion() {
        }
    }

    Response a(Chain chain);
}
