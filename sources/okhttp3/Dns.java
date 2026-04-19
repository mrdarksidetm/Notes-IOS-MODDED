package okhttp3;

import ae.r;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import nd.p;

/* JADX INFO: loaded from: classes2.dex */
public interface Dns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f16810a = Companion.f16812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Dns f16811b = new Companion.DnsSystem();

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f16812a = new Companion();

        private static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public List<InetAddress> a(String str) throws UnknownHostException {
                r.f(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    r.e(allByName, "getAllByName(hostname)");
                    return p.E0(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException(r.m("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }
    }

    List<InetAddress> a(String str);
}
