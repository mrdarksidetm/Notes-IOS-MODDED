package okhttp3.internal.platform;

import ae.j;
import ae.r;
import com.amazon.a.a.o.b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Companion f17553i = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f17554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f17555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f17556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f17557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class<?> f17558h;

    private static final class AlpnProvider implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f17559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f17560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f17561c;

        public AlpnProvider(List<String> list) {
            r.f(list, "protocols");
            this.f17559a = list;
        }

        public final String a() {
            return this.f17561c;
        }

        public final boolean b() {
            return this.f17560b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            r.f(obj, "proxy");
            r.f(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (r.b(name, "supports") && r.b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (r.b(name, "unsupported") && r.b(Void.TYPE, returnType)) {
                this.f17560b = true;
                return null;
            }
            if (r.b(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f17559a;
                }
            }
            if ((r.b(name, "selectProtocol") || r.b(name, "select")) && r.b(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            Object obj3 = list.get(i10);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj3;
                            if (this.f17559a.contains(str)) {
                                this.f17561c = str;
                                return str;
                            }
                            if (i10 == size) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    String str2 = this.f17559a.get(0);
                    this.f17561c = str2;
                    return str2;
                }
            }
            if ((!r.b(name, "protocolSelected") && !r.b(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            if (obj4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f17561c = (String) obj4;
            return null;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Platform a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                r.e(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName(r.m("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                Class<?> cls3 = Class.forName(r.m("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                Class<?> cls4 = Class.forName(r.m("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod(b.au, SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                r.e(method, "putMethod");
                r.e(method2, "getMethod");
                r.e(method3, "removeMethod");
                r.e(cls3, "clientProviderClass");
                r.e(cls4, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        r.f(method, "putMethod");
        r.f(method2, "getMethod");
        r.f(method3, "removeMethod");
        r.f(cls, "clientProviderClass");
        r.f(cls2, "serverProviderClass");
        this.f17554d = method;
        this.f17555e = method2;
        this.f17556f = method3;
        this.f17557g = cls;
        this.f17558h = cls2;
    }

    @Override // okhttp3.internal.platform.Platform
    public void b(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        try {
            this.f17556f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void e(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        r.f(sSLSocket, "sslSocket");
        r.f(list, "protocols");
        try {
            this.f17554d.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f17557g, this.f17558h}, new AlpnProvider(Platform.f17567a.b(list))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String h(SSLSocket sSLSocket) {
        r.f(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f17555e.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            if (!alpnProvider.b() && alpnProvider.a() == null) {
                Platform.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (alpnProvider.b()) {
                return null;
            }
            return alpnProvider.a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
