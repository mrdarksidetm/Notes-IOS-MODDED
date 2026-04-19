package okhttp3;

import ae.s;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import nd.u;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class Handshake$peerCertificates$2 extends s implements a<List<? extends Certificate>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a<List<Certificate>> f16829a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Handshake$peerCertificates$2(a<? extends List<? extends Certificate>> aVar) {
        super(0);
        this.f16829a = aVar;
    }

    @Override // zd.a
    public final List<? extends Certificate> invoke() {
        try {
            return this.f16829a.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return u.m();
        }
    }
}
