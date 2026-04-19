package okhttp3.internal.connection;

import ae.r;
import ae.s;
import java.security.cert.Certificate;
import java.util.List;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class RealConnection$connectTls$1 extends s implements a<List<? extends Certificate>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CertificatePinner f17232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Handshake f17233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Address f17234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.f17232a = certificatePinner;
        this.f17233b = handshake;
        this.f17234c = address;
    }

    @Override // zd.a
    public final List<? extends Certificate> invoke() {
        CertificateChainCleaner certificateChainCleanerD = this.f17232a.d();
        r.c(certificateChainCleanerD);
        return certificateChainCleanerD.a(this.f17233b.d(), this.f17234c.l().h());
    }
}
