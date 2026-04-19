package g2;

import a2.n1;
import androidx.compose.ui.e;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e.c implements n1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f11306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f11307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private zd.l<? super x, i0> f11308p;

    public d(boolean z10, boolean z11, zd.l<? super x, i0> lVar) {
        this.f11306n = z10;
        this.f11307o = z11;
        this.f11308p = lVar;
    }

    @Override // a2.n1
    public void U(x xVar) {
        this.f11308p.invoke(xVar);
    }

    public final void a2(boolean z10) {
        this.f11306n = z10;
    }

    public final void b2(zd.l<? super x, i0> lVar) {
        this.f11308p = lVar;
    }

    @Override // a2.n1
    public boolean d0() {
        return this.f11307o;
    }

    @Override // a2.n1
    public boolean q1() {
        return this.f11306n;
    }
}
