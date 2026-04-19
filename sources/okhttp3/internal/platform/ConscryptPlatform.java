package okhttp3.internal.platform;

import ae.j;
import ae.r;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* JADX INFO: loaded from: classes2.dex */
public final class ConscryptPlatform extends Platform {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f17549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f17550f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f17551d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final boolean a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        public final ConscryptPlatform b() {
            j jVar = null;
            if (c()) {
                return new ConscryptPlatform(jVar);
            }
            return null;
        }

        public final boolean c() {
            return ConscryptPlatform.f17550f;
        }
    }

    public static final class DisabledHostnameVerifier implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DisabledHostnameVerifier f17552a = new DisabledHostnameVerifier();

        private DisabledHostnameVerifier() {
        }
    }

    static {
        Companion companion = new Companion(null);
        f17549e = companion;
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (companion.a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f17550f = z10;
    }

    private ConscryptPlatform() {
        Provider providerNewProvider = Conscrypt.newProvider();
        r.e(providerNewProvider, "newProvider()");
        this.f17551d = providerNewProvider;
    }

    public /* synthetic */ ConscryptPlatform(j jVar) {
        this();
    }

    @Override // okhttp3.internal.platform.Platform
    public void e(SSLSocket sSLSocket, String str, List<Protocol> list) {
        r.f(sSLSocket, "sslSocket");
        r.f(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.e(sSLSocket, str, list);
            return;
        }
        Conscrypt.setUseSessionTickets(sSLSocket, true);
        Object[] array = Platform.f17567a.b(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
    }

    @Override // okhttp3.internal.platform.Platform
    public String h(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.h(sSLSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f17551d);
        r.e(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // okhttp3.internal.platform.Platform
    public SSLSocketFactory o(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        r.f(x509TrustManager, "trustManager");
        SSLContext sSLContextN = n();
        sSLContextN.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
        r.e(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        r.c(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            String string = Arrays.toString(trustManagers);
            r.e(string, "toString(this)");
            throw new IllegalStateException(r.m("Unexpected default trust managers: ", string).toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, DisabledHostnameVerifier.f17552a);
        return x509TrustManager;
    }
}
