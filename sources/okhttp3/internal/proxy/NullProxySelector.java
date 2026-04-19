package okhttp3.internal.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import nd.t;

/* JADX INFO: loaded from: classes2.dex */
public final class NullProxySelector extends ProxySelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NullProxySelector f17599a = new NullProxySelector();

    private NullProxySelector() {
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return t.d(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
