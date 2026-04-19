package okhttp3.internal.platform.android;

import ae.r;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
public final class DeferredSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Factory f17594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SocketAdapter f17595b;

    public interface Factory {
        boolean b(SSLSocket sSLSocket);

        SocketAdapter c(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory factory) {
        r.f(factory, "socketAdapterFactory");
        this.f17594a = factory;
    }

    private final synchronized SocketAdapter e(SSLSocket sSLSocket) {
        if (this.f17595b == null && this.f17594a.b(sSLSocket)) {
            this.f17595b = this.f17594a.c(sSLSocket);
        }
        return this.f17595b;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean a() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean b(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        return this.f17594a.b(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String c(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        SocketAdapter socketAdapterE = e(sSLSocket);
        if (socketAdapterE == null) {
            return null;
        }
        return socketAdapterE.c(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        r.f(sSLSocket, "sslSocket");
        r.f(list, "protocols");
        SocketAdapter socketAdapterE = e(sSLSocket);
        if (socketAdapterE == null) {
            return;
        }
        socketAdapterE.d(sSLSocket, str, list);
    }
}
