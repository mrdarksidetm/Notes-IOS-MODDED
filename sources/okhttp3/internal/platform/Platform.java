package okhttp3.internal.platform;

import ae.j;
import ae.r;
import hf.c;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import nd.v;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: loaded from: classes2.dex */
public class Platform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f17567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Platform f17568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f17569c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final Platform d() {
            AndroidLog.f17574a.b();
            Platform platformA = Android10Platform.f17537e.a();
            if (platformA != null) {
                return platformA;
            }
            Platform platformA2 = AndroidPlatform.f17540f.a();
            r.c(platformA2);
            return platformA2;
        }

        private final Platform e() {
            OpenJSSEPlatform openJSSEPlatformA;
            BouncyCastlePlatform bouncyCastlePlatformA;
            ConscryptPlatform conscryptPlatformB;
            if (j() && (conscryptPlatformB = ConscryptPlatform.f17549e.b()) != null) {
                return conscryptPlatformB;
            }
            if (i() && (bouncyCastlePlatformA = BouncyCastlePlatform.f17546e.a()) != null) {
                return bouncyCastlePlatformA;
            }
            if (k() && (openJSSEPlatformA = OpenJSSEPlatform.f17564e.a()) != null) {
                return openJSSEPlatformA;
            }
            Jdk9Platform jdk9PlatformA = Jdk9Platform.f17562d.a();
            if (jdk9PlatformA != null) {
                return jdk9PlatformA;
            }
            Platform platformA = Jdk8WithJettyBootPlatform.f17553i.a();
            return platformA != null ? platformA : new Platform();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Platform f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return r.b("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return r.b("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return r.b("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List<String> b(List<? extends Protocol> list) {
            r.f(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(v.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends Protocol> list) {
            r.f(list, "protocols");
            c cVar = new c();
            for (String str : b(list)) {
                cVar.writeByte(str.length());
                cVar.z(str);
            }
            return cVar.j0();
        }

        public final Platform g() {
            return Platform.f17568b;
        }

        public final boolean h() {
            return r.b("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        Companion companion = new Companion(null);
        f17567a = companion;
        f17568b = companion.f();
        f17569c = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static /* synthetic */ void l(Platform platform, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th = null;
        }
        platform.k(str, i10, th);
    }

    public void b(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
    }

    public CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        r.f(x509TrustManager, "trustManager");
        return new BasicCertificateChainCleaner(d(x509TrustManager));
    }

    public TrustRootIndex d(X509TrustManager x509TrustManager) {
        r.f(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        r.e(acceptedIssuers, "trustManager.acceptedIssuers");
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List<Protocol> list) {
        r.f(sSLSocket, "sslSocket");
        r.f(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        r.f(socket, "socket");
        r.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        return null;
    }

    public Object i(String str) {
        r.f(str, "closer");
        if (f17569c.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean j(String str) {
        r.f(str, "hostname");
        return true;
    }

    public void k(String str, int i10, Throwable th) {
        r.f(str, "message");
        f17569c.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void m(String str, Object obj) {
        r.f(str, "message");
        if (obj == null) {
            str = r.m(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(str, 5, (Throwable) obj);
    }

    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        r.e(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        r.f(x509TrustManager, "trustManager");
        try {
            SSLContext sSLContextN = n();
            sSLContextN.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
            r.e(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(r.m("No System TLS: ", e10), e10);
        }
    }

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
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        r.e(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
