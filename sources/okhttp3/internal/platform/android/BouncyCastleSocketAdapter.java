package okhttp3.internal.platform.android;

import ae.j;
import ae.r;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.platform.BouncyCastlePlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes2.dex */
public final class BouncyCastleSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f17586a = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final DeferredSocketAdapter.Factory f17587b = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1
        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public boolean b(SSLSocket sSLSocket) {
            r.f(sSLSocket, "sslSocket");
            return BouncyCastlePlatform.f17546e.b() && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public SocketAdapter c(SSLSocket sSLSocket) {
            r.f(sSLSocket, "sslSocket");
            return new BouncyCastleSocketAdapter();
        }
    };

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final DeferredSocketAdapter.Factory a() {
            return BouncyCastleSocketAdapter.f17587b;
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean a() {
        return BouncyCastlePlatform.f17546e.b();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean b(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String c(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : r.b(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        r.f(sSLSocket, "sslSocket");
        r.f(list, "protocols");
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = Platform.f17567a.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
