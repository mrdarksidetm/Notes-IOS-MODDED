package okhttp3.internal.http;

import hf.g0;
import hf.i0;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes2.dex */
public interface ExchangeCodec {

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f17265a = new Companion();

        private Companion() {
        }
    }

    void a();

    void b(Request request);

    i0 c(Response response);

    void cancel();

    Response.Builder d(boolean z10);

    RealConnection e();

    void f();

    long g(Response response);

    g0 h(Request request, long j10);
}
