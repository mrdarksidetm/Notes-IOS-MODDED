package okhttp3.internal.platform.android;

import ae.j;
import ae.r;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes2.dex */
public final class ConscryptSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f17592a = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final DeferredSocketAdapter.Factory f17593b = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1
        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public boolean b(SSLSocket sSLSocket) {
            r.f(sSLSocket, "sslSocket");
            return ConscryptPlatform.f17549e.c() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public SocketAdapter c(SSLSocket sSLSocket) {
            r.f(sSLSocket, "sslSocket");
            return new ConscryptSocketAdapter();
        }
    };

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final DeferredSocketAdapter.Factory a() {
            return ConscryptSocketAdapter.f17593b;
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean a() {
        return ConscryptPlatform.f17549e.c();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean b(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String c(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        r.f(sSLSocket, "sslSocket");
        r.f(list, "protocols");
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = Platform.f17567a.b(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
