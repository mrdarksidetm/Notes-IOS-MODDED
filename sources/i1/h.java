package i1;

import a2.q;
import androidx.compose.ui.e;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e.c implements q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private zd.l<? super n1.f, i0> f12282n;

    public h(zd.l<? super n1.f, i0> lVar) {
        this.f12282n = lVar;
    }

    @Override // a2.q
    public void A(n1.c cVar) {
        this.f12282n.invoke(cVar);
        cVar.u1();
    }

    public final void a2(zd.l<? super n1.f, i0> lVar) {
        this.f12282n = lVar;
    }
}
