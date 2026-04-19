package androidx.compose.ui.layout;

import a2.s;
import androidx.compose.ui.e;
import md.i0;
import y1.r;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class c extends e.c implements s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l<? super r, i0> f2825n;

    public c(l<? super r, i0> lVar) {
        this.f2825n = lVar;
    }

    public final void a2(l<? super r, i0> lVar) {
        this.f2825n = lVar;
    }

    @Override // a2.s
    public void l(r rVar) {
        this.f2825n.invoke(rVar);
    }
}
