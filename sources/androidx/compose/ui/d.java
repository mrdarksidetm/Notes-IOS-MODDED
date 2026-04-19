package androidx.compose.ui;

import a2.k;
import androidx.compose.ui.e;
import t0.w;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private w f2639n;

    public d(w wVar) {
        this.f2639n = wVar;
    }

    @Override // androidx.compose.ui.e.c
    public void K1() {
        k.k(this).e(this.f2639n);
    }

    public final void a2(w wVar) {
        this.f2639n = wVar;
        k.k(this).e(wVar);
    }
}
