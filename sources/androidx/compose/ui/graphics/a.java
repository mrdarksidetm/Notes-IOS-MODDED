package androidx.compose.ui.graphics;

import a2.a0;
import a2.k;
import a2.u0;
import a2.w0;
import ae.s;
import androidx.compose.ui.e;
import md.i0;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class a extends e.c implements a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l<? super d, i0> f2763n;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.a$a, reason: collision with other inner class name */
    static final class C0055a extends s implements l<t0.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t0 f2764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f2765b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0055a(t0 t0Var, a aVar) {
            super(1);
            this.f2764a = t0Var;
            this.f2765b = aVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            t0.a.r(aVar, this.f2764a, 0, 0, 0.0f, this.f2765b.a2(), 4, null);
        }
    }

    public a(l<? super d, i0> lVar) {
        this.f2763n = lVar;
    }

    @Override // androidx.compose.ui.e.c
    public boolean F1() {
        return false;
    }

    public final l<d, i0> a2() {
        return this.f2763n;
    }

    public final void b2() {
        u0 u0VarE2 = k.h(this, w0.a(2)).e2();
        if (u0VarE2 != null) {
            u0VarE2.N2(this.f2763n, true);
        }
    }

    public final void c2(l<? super d, i0> lVar) {
        this.f2763n = lVar;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        t0 t0VarI = d0Var.I(j10);
        return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new C0055a(t0VarI, this), 4, null);
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f2763n + ')';
    }
}
