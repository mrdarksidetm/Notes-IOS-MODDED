package okhttp3.internal.platform.android;

import ae.j;
import ae.r;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Companion f17596j = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class<? super SSLSocketFactory> f17597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class<?> f17598i;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ SocketAdapter b(Companion companion, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return companion.a(str);
        }

        public final SocketAdapter a(String str) {
            r.f(str, "packageName");
            try {
                Class<?> cls = Class.forName(r.m(str, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(r.m(str, ".OpenSSLSocketFactoryImpl"));
                Class<?> cls3 = Class.forName(r.m(str, ".SSLParametersImpl"));
                r.e(cls3, "paramsClass");
                return new StandardAndroidSocketAdapter(cls, cls2, cls3);
            } catch (Exception e10) {
                Platform.f17567a.g().k("unable to load android socket classes", 5, e10);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(Class<? super SSLSocket> cls, Class<? super SSLSocketFactory> cls2, Class<?> cls3) {
        super(cls);
        r.f(cls, "sslSocketClass");
        r.f(cls2, "sslSocketFactoryClass");
        r.f(cls3, "paramClass");
        this.f17597h = cls2;
        this.f17598i = cls3;
    }
}
