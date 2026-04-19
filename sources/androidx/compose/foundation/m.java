package androidx.compose.foundation;

import a2.n1;
import ae.s;
import androidx.compose.ui.e;
import g2.v;
import g2.x;

/* JADX INFO: loaded from: classes.dex */
final class m extends e.c implements n1, j1.m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g2.l f2581n = new g2.l();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2582o;

    static final class a extends s implements zd.a<Boolean> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(androidx.compose.ui.focus.g.a(m.this));
        }
    }

    @Override // a2.n1
    public void U(x xVar) {
        v.u(xVar, this.f2582o);
        v.m(xVar, null, new a(), 1, null);
    }

    public final void a2(boolean z10) {
        this.f2582o = z10;
    }
}
