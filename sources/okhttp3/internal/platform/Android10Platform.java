package okhttp3.internal.platform;

import ae.j;
import ae.r;
import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import nd.u;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes2.dex */
@SuppressSignatureCheck
public final class Android10Platform extends Platform {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f17537e = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f17538f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<SocketAdapter> f17539d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Platform a() {
            if (b()) {
                return new Android10Platform();
            }
            return null;
        }

        public final boolean b() {
            return Android10Platform.f17538f;
        }
    }

    static {
        f17538f = Platform.f17567a.h() && Build.VERSION.SDK_INT >= 29;
    }

    public Android10Platform() {
        List listR = u.r(Android10SocketAdapter.f17570a.a(), new DeferredSocketAdapter(AndroidSocketAdapter.f17578f.d()), new DeferredSocketAdapter(ConscryptSocketAdapter.f17592a.a()), new DeferredSocketAdapter(BouncyCastleSocketAdapter.f17586a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listR) {
            if (((SocketAdapter) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f17539d = arrayList;
    }

    @Override // okhttp3.internal.platform.Platform
    public CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        r.f(x509TrustManager, "trustManager");
        AndroidCertificateChainCleaner androidCertificateChainCleanerA = AndroidCertificateChainCleaner.f17571d.a(x509TrustManager);
        return androidCertificateChainCleanerA == null ? super.c(x509TrustManager) : androidCertificateChainCleanerA;
    }

    @Override // okhttp3.internal.platform.Platform
    public void e(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Object next;
        r.f(sSLSocket, "sslSocket");
        r.f(list, "protocols");
        Iterator<T> it = this.f17539d.iterator();
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
    public String h(SSLSocket sSLSocket) {
        Object next;
        r.f(sSLSocket, "sslSocket");
        Iterator<T> it = this.f17539d.iterator();
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
    @SuppressLint({"NewApi"})
    public boolean j(String str) {
        r.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
