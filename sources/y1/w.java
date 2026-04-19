package y1;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class w extends e.c implements a2.a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private zd.q<? super g0, ? super d0, ? super w2.b, ? extends f0> f23302n;

    public w(zd.q<? super g0, ? super d0, ? super w2.b, ? extends f0> qVar) {
        this.f23302n = qVar;
    }

    public final void a2(zd.q<? super g0, ? super d0, ? super w2.b, ? extends f0> qVar) {
        this.f23302n = qVar;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        return this.f23302n.invoke(g0Var, d0Var, w2.b.b(j10));
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f23302n + ')';
    }
}
