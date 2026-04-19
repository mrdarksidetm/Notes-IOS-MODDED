package okhttp3.internal.connection;

import ae.r;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionSpecSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ConnectionSpec> f17158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17161d;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        r.f(list, "connectionSpecs");
        this.f17158a = list;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int i10 = this.f17159b;
        int size = this.f17158a.size();
        while (i10 < size) {
            int i11 = i10 + 1;
            if (this.f17158a.get(i10).e(sSLSocket)) {
                return true;
            }
            i10 = i11;
        }
        return false;
    }

    public final ConnectionSpec a(SSLSocket sSLSocket) throws UnknownServiceException {
        ConnectionSpec connectionSpec;
        r.f(sSLSocket, "sslSocket");
        int i10 = this.f17159b;
        int size = this.f17158a.size();
        while (true) {
            if (i10 >= size) {
                connectionSpec = null;
                break;
            }
            int i11 = i10 + 1;
            connectionSpec = this.f17158a.get(i10);
            if (connectionSpec.e(sSLSocket)) {
                this.f17159b = i11;
                break;
            }
            i10 = i11;
        }
        if (connectionSpec != null) {
            this.f17160c = c(sSLSocket);
            connectionSpec.c(sSLSocket, this.f17161d);
            return connectionSpec;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f17161d);
        sb2.append(", modes=");
        sb2.append(this.f17158a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        r.c(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        r.e(string, "toString(this)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException iOException) {
        r.f(iOException, "e");
        this.f17161d = true;
        return (!this.f17160c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
