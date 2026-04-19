package okhttp3.internal.platform.android;

import ae.j;
import ae.r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import je.d;
import je.v;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Companion f17578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final DeferredSocketAdapter.Factory f17579g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<? super SSLSocket> f17580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f17581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f17582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f17583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f17584e;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidSocketAdapter b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> superclass = cls;
            while (superclass != null && !r.b(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError(r.m("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            r.c(superclass);
            return new AndroidSocketAdapter(superclass);
        }

        public final DeferredSocketAdapter.Factory c(final String str) {
            r.f(str, "packageName");
            return new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public boolean b(SSLSocket sSLSocket) {
                    r.f(sSLSocket, "sslSocket");
                    String name = sSLSocket.getClass().getName();
                    r.e(name, "sslSocket.javaClass.name");
                    return v.G(name, r.m(str, "."), false, 2, null);
                }

                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public SocketAdapter c(SSLSocket sSLSocket) {
                    r.f(sSLSocket, "sslSocket");
                    return AndroidSocketAdapter.f17578f.b(sSLSocket.getClass());
                }
            };
        }

        public final DeferredSocketAdapter.Factory d() {
            return AndroidSocketAdapter.f17579g;
        }
    }

    static {
        Companion companion = new Companion(null);
        f17578f = companion;
        f17579g = companion.c("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(Class<? super SSLSocket> cls) throws NoSuchMethodException {
        r.f(cls, "sslSocketClass");
        this.f17580a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        r.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f17581b = declaredMethod;
        this.f17582c = cls.getMethod("setHostname", String.class);
        this.f17583d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f17584e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean a() {
        return AndroidPlatform.f17540f.b();
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean b(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        return this.f17580a.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String c(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        if (!b(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f17583d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, d.f14191b);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && r.b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        r.f(sSLSocket, "sslSocket");
        r.f(list, "protocols");
        if (b(sSLSocket)) {
            try {
                this.f17581b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f17582c.invoke(sSLSocket, str);
                }
                this.f17584e.invoke(sSLSocket, Platform.f17567a.c(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
