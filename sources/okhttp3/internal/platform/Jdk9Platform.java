package okhttp3.internal.platform;

import ae.j;
import ae.r;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import je.u;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;

/* JADX INFO: loaded from: classes2.dex */
public class Jdk9Platform extends Platform {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f17562d = new Companion(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final boolean f17563e;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Jdk9Platform a() {
            if (b()) {
                return new Jdk9Platform();
            }
            return null;
        }

        public final boolean b() {
            return Jdk9Platform.f17563e;
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numL = property != null ? u.l(property) : null;
        boolean z10 = true;
        if (numL == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
                z10 = false;
            }
        } else if (numL.intValue() < 9) {
            z10 = false;
        }
        f17563e = z10;
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    public void e(SSLSocket sSLSocket, String str, List<Protocol> list) {
        r.f(sSLSocket, "sslSocket");
        r.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = Platform.f17567a.b(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    @SuppressSignatureCheck
    public String h(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : r.b(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
