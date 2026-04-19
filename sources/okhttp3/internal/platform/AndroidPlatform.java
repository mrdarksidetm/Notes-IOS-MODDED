package okhttp3.internal.platform;

import ae.j;
import ae.r;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import nd.u;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: loaded from: classes2.dex */
@SuppressSignatureCheck
public final class AndroidPlatform extends Platform {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Companion f17540f = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f17541g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<SocketAdapter> f17542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CloseGuard f17543e;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Platform a() {
            if (b()) {
                return new AndroidPlatform();
            }
            return null;
        }

        public final boolean b() {
            return AndroidPlatform.f17541g;
        }
    }

    public static final class CustomTrustRootIndex implements TrustRootIndex {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509TrustManager f17544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f17545b;

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            r.f(x509TrustManager, "trustManager");
            r.f(method, "findByIssuerAndSignatureMethod");
            this.f17544a = x509TrustManager;
            this.f17545b = method;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public X509Certificate a(X509Certificate x509Certificate) {
            r.f(x509Certificate, "cert");
            try {
                Object objInvoke = this.f17545b.invoke(this.f17544a, x509Certificate);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return r.b(this.f17544a, customTrustRootIndex.f17544a) && r.b(this.f17545b, customTrustRootIndex.f17545b);
        }

        public int hashCode() {
            return (this.f17544a.hashCode() * 31) + this.f17545b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f17544a + ", findByIssuerAndSignatureMethod=" + this.f17545b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (Platform.f17567a.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f17541g = z10;
    }

    public AndroidPlatform() {
        List listR = u.r(StandardAndroidSocketAdapter.Companion.b(StandardAndroidSocketAdapter.f17596j, null, 1, null), new DeferredSocketAdapter(AndroidSocketAdapter.f17578f.d()), new DeferredSocketAdapter(ConscryptSocketAdapter.f17592a.a()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.f17586a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR) {
            if (((SocketAdapter) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f17542d = arrayList;
        this.f17543e = CloseGuard.f17588d.a();
    }

    @Override // okhttp3.internal.platform.Platform
    public CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        r.f(x509TrustManager, "trustManager");
        AndroidCertificateChainCleaner androidCertificateChainCleanerA = AndroidCertificateChainCleaner.f17571d.a(x509TrustManager);
        return androidCertificateChainCleanerA == null ? super.c(x509TrustManager) : androidCertificateChainCleanerA;
    }

    @Override // okhttp3.internal.platform.Platform
    public TrustRootIndex d(X509TrustManager x509TrustManager) {
        r.f(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            r.e(declaredMethod, "method");
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void e(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Object next;
        r.f(sSLSocket, "sslSocket");
        r.f(list, "protocols");
        Iterator<T> it = this.f17542d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((SocketAdapter) next).b(sSLSocket)) {
                    break;
                }
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter == null) {
            return;
        }
        socketAdapter.d(sSLSocket, str, list);
    }

    @Override // okhttp3.internal.platform.Platform
    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        r.f(socket, "socket");
        r.f(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String h(SSLSocket sSLSocket) {
        Object next;
        r.f(sSLSocket, "sslSocket");
        Iterator<T> it = this.f17542d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SocketAdapter) next).b(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter == null) {
            return null;
        }
        return socketAdapter.c(sSLSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    public Object i(String str) {
        r.f(str, "closer");
        return this.f17543e.a(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean j(String str) {
        r.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public void m(String str, Object obj) {
        r.f(str, "message");
        if (this.f17543e.b(obj)) {
            return;
        }
        Platform.l(this, str, 5, null, 4, null);
    }
}
