package okhttp3.internal.platform.android;

import ae.j;
import ae.r;
import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
@SuppressSignatureCheck
@SuppressLint({"NewApi"})
public final class Android10SocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f17570a = new Companion(null);

    @SuppressSignatureCheck
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final SocketAdapter a() {
            if (b()) {
                return new Android10SocketAdapter();
            }
            return null;
        }

        public final boolean b() {
            return Platform.f17567a.h() && Build.VERSION.SDK_INT >= 29;
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean a() {
        return f17570a.b();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean b(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @SuppressLint({"NewApi"})
    public String c(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : r.b(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    @SuppressLint({"NewApi"})
    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) throws IOException {
        r.f(sSLSocket, "sslSocket");
        r.f(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Object[] array = Platform.f17567a.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
