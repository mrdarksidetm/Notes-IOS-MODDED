package okhttp3;

import ae.s;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.v;
import okhttp3.internal.tls.CertificateChainCleaner;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class CertificatePinner$check$1 extends s implements a<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CertificatePinner f16691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<Certificate> f16692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16693c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CertificatePinner$check$1(CertificatePinner certificatePinner, List<? extends Certificate> list, String str) {
        super(0);
        this.f16691a = certificatePinner;
        this.f16692b = list;
        this.f16693c = str;
    }

    @Override // zd.a
    public final List<? extends X509Certificate> invoke() {
        CertificateChainCleaner certificateChainCleanerD = this.f16691a.d();
        List<Certificate> listA = certificateChainCleanerD == null ? null : certificateChainCleanerD.a(this.f16692b, this.f16693c);
        if (listA == null) {
            listA = this.f16692b;
        }
        ArrayList arrayList = new ArrayList(v.x(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
