package okhttp3;

import ae.j;
import ae.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import nd.c0;
import okhttp3.internal.Util;
import pd.b;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionSpec {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f16768e = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final CipherSuite[] f16769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final CipherSuite[] f16770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConnectionSpec f16771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ConnectionSpec f16772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ConnectionSpec f16773j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ConnectionSpec f16774k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f16777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f16778d;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f16779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f16780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f16781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f16782d;

        public Builder(ConnectionSpec connectionSpec) {
            r.f(connectionSpec, "connectionSpec");
            this.f16779a = connectionSpec.f();
            this.f16780b = connectionSpec.f16777c;
            this.f16781c = connectionSpec.f16778d;
            this.f16782d = connectionSpec.h();
        }

        public Builder(boolean z10) {
            this.f16779a = z10;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.f16779a, this.f16782d, this.f16780b, this.f16781c);
        }

        public final Builder b(String... strArr) {
            r.f(strArr, "cipherSuites");
            if (!d()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            e((String[]) strArr.clone());
            return this;
        }

        public final Builder c(CipherSuite... cipherSuiteArr) {
            r.f(cipherSuiteArr, "cipherSuites");
            if (!d()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuiteArr.length);
            for (CipherSuite cipherSuite : cipherSuiteArr) {
                arrayList.add(cipherSuite.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final boolean d() {
            return this.f16779a;
        }

        public final void e(String[] strArr) {
            this.f16780b = strArr;
        }

        public final void f(boolean z10) {
            this.f16782d = z10;
        }

        public final void g(String[] strArr) {
            this.f16781c = strArr;
        }

        public final Builder h(boolean z10) {
            if (!d()) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            f(z10);
            return this;
        }

        public final Builder i(String... strArr) {
            r.f(strArr, "tlsVersions");
            if (!d()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            g((String[]) strArr.clone());
            return this;
        }

        public final Builder j(TlsVersion... tlsVersionArr) {
            r.f(tlsVersionArr, "tlsVersions");
            if (!d()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.b());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return i((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.f16739o1;
        CipherSuite cipherSuite2 = CipherSuite.f16742p1;
        CipherSuite cipherSuite3 = CipherSuite.f16745q1;
        CipherSuite cipherSuite4 = CipherSuite.f16697a1;
        CipherSuite cipherSuite5 = CipherSuite.f16709e1;
        CipherSuite cipherSuite6 = CipherSuite.f16700b1;
        CipherSuite cipherSuite7 = CipherSuite.f16712f1;
        CipherSuite cipherSuite8 = CipherSuite.f16730l1;
        CipherSuite cipherSuite9 = CipherSuite.f16727k1;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        f16769f = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.L0, CipherSuite.M0, CipherSuite.f16723j0, CipherSuite.f16726k0, CipherSuite.H, CipherSuite.L, CipherSuite.f16728l};
        f16770g = cipherSuiteArr2;
        Builder builderC = new Builder(true).c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f16771h = builderC.j(tlsVersion, tlsVersion2).h(true).a();
        f16772i = new Builder(true).c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).j(tlsVersion, tlsVersion2).h(true).a();
        f16773j = new Builder(true).c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).j(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).h(true).a();
        f16774k = new Builder(false).a();
    }

    public ConnectionSpec(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f16775a = z10;
        this.f16776b = z11;
        this.f16777c = strArr;
        this.f16778d = strArr2;
    }

    private final ConnectionSpec g(SSLSocket sSLSocket, boolean z10) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.f16777c != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            r.e(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = Util.D(enabledCipherSuites2, this.f16777c, CipherSuite.f16698b.c());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f16778d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            r.e(enabledProtocols2, "sslSocket.enabledProtocols");
            enabledProtocols = Util.D(enabledProtocols2, this.f16778d, b.b());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        r.e(supportedCipherSuites, "supportedCipherSuites");
        int iW = Util.w(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.f16698b.c());
        if (z10 && iW != -1) {
            r.e(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iW];
            r.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            enabledCipherSuites = Util.n(enabledCipherSuites, str);
        }
        Builder builder = new Builder(this);
        r.e(enabledCipherSuites, "cipherSuitesIntersection");
        Builder builderB = builder.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        r.e(enabledProtocols, "tlsVersionsIntersection");
        return builderB.i((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
    }

    public final void c(SSLSocket sSLSocket, boolean z10) {
        r.f(sSLSocket, "sslSocket");
        ConnectionSpec connectionSpecG = g(sSLSocket, z10);
        if (connectionSpecG.i() != null) {
            sSLSocket.setEnabledProtocols(connectionSpecG.f16778d);
        }
        if (connectionSpecG.d() != null) {
            sSLSocket.setEnabledCipherSuites(connectionSpecG.f16777c);
        }
    }

    public final List<CipherSuite> d() {
        String[] strArr = this.f16777c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.f16698b.b(str));
        }
        return c0.C0(arrayList);
    }

    public final boolean e(SSLSocket sSLSocket) {
        r.f(sSLSocket, "socket");
        if (!this.f16775a) {
            return false;
        }
        String[] strArr = this.f16778d;
        if (strArr != null && !Util.t(strArr, sSLSocket.getEnabledProtocols(), b.b())) {
            return false;
        }
        String[] strArr2 = this.f16777c;
        return strArr2 == null || Util.t(strArr2, sSLSocket.getEnabledCipherSuites(), CipherSuite.f16698b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f16775a;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z10 != connectionSpec.f16775a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f16777c, connectionSpec.f16777c) && Arrays.equals(this.f16778d, connectionSpec.f16778d) && this.f16776b == connectionSpec.f16776b);
    }

    public final boolean f() {
        return this.f16775a;
    }

    public final boolean h() {
        return this.f16776b;
    }

    public int hashCode() {
        if (!this.f16775a) {
            return 17;
        }
        String[] strArr = this.f16777c;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f16778d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f16776b ? 1 : 0);
    }

    public final List<TlsVersion> i() {
        String[] strArr = this.f16778d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.f17013b.a(str));
        }
        return c0.C0(arrayList);
    }

    public String toString() {
        if (!this.f16775a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(d(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(i(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f16776b + ')';
    }
}
