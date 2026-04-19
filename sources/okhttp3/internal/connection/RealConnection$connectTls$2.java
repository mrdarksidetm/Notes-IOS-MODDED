package okhttp3.internal.connection;

import ae.r;
import ae.s;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.v;
import okhttp3.Handshake;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class RealConnection$connectTls$2 extends s implements a<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RealConnection f17235a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.f17235a = realConnection;
    }

    @Override // zd.a
    public final List<? extends X509Certificate> invoke() {
        Handshake handshake = this.f17235a.f17218g;
        r.c(handshake);
        List<Certificate> listD = handshake.d();
        ArrayList arrayList = new ArrayList(v.x(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add((X509Certificate) ((Certificate) it.next()));
        }
        return arrayList;
    }
}
