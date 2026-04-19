package androidx.compose.ui.draw;

import a2.q;
import androidx.compose.ui.e;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class c extends e.c implements q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l<? super n1.c, i0> f2654n;

    public c(l<? super n1.c, i0> lVar) {
        this.f2654n = lVar;
    }

    @Override // a2.q
    public void A(n1.c cVar) {
        this.f2654n.invoke(cVar);
    }

    public final void a2(l<? super n1.c, i0> lVar) {
        this.f2654n = lVar;
    }
}
