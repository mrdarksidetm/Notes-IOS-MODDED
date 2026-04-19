package okhttp3.internal.authenticator;

import ae.j;
import ae.r;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import je.v;
import nd.c0;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaNetAuthenticator implements Authenticator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Dns f17030d;

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17031a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f17031a = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public JavaNetAuthenticator(Dns dns) {
        r.f(dns, "defaultDns");
        this.f17030d = dns;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i10, j jVar) {
        this((i10 & 1) != 0 ? Dns.f16811b : dns);
    }

    private final InetAddress b(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.f17031a[type.ordinal()]) == 1) {
            return (InetAddress) c0.Y(dns.a(httpUrl.h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        r.e(address, "address() as InetSocketAddress).address");
        return address;
    }

    @Override // okhttp3.Authenticator
    public Request a(Route route, Response response) {
        Address addressA;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        r.f(response, "response");
        List<Challenge> listO = response.o();
        Request requestY = response.Y();
        HttpUrl httpUrlJ = requestY.j();
        boolean z10 = response.w() == 407;
        Proxy proxyB = route == null ? null : route.b();
        if (proxyB == null) {
            proxyB = Proxy.NO_PROXY;
        }
        for (Challenge challenge : listO) {
            if (v.t("Basic", challenge.c(), true)) {
                Dns dnsC = (route == null || (addressA = route.a()) == null) ? null : addressA.c();
                if (dnsC == null) {
                    dnsC = this.f17030d;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxyB.address();
                    if (socketAddressAddress == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    r.e(proxyB, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, b(proxyB, httpUrlJ, dnsC), inetSocketAddress.getPort(), httpUrlJ.p(), challenge.b(), challenge.c(), httpUrlJ.r(), Authenticator.RequestorType.PROXY);
                } else {
                    String strH = httpUrlJ.h();
                    r.e(proxyB, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(strH, b(proxyB, httpUrlJ, dnsC), httpUrlJ.l(), httpUrlJ.p(), challenge.b(), challenge.c(), httpUrlJ.r(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    r.e(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    r.e(password, "auth.password");
                    return requestY.i().f(str, Credentials.a(userName, new String(password), challenge.a())).b();
                }
            }
        }
        return null;
    }
}
