package okhttp3;

import ae.s;
import java.security.cert.Certificate;
import java.util.List;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class Handshake$Companion$get$1 extends s implements a<List<? extends Certificate>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ List<Certificate> f16827a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Handshake$Companion$get$1(List<? extends Certificate> list) {
        super(0);
        this.f16827a = list;
    }

    @Override // zd.a
    public final List<? extends Certificate> invoke() {
        return this.f16827a;
    }
}
