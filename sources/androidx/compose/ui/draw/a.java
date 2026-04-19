package androidx.compose.ui.draw;

import a2.a1;
import a2.w0;
import a2.z0;
import ae.r;
import ae.s;
import androidx.compose.ui.e;
import i1.f;
import i1.k;
import md.i0;
import w2.q;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class a extends e.c implements i1.e, z0, i1.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f f2649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f2650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private l<? super f, k> f2651p;

    /* JADX INFO: renamed from: androidx.compose.ui.draw.a$a, reason: collision with other inner class name */
    static final class C0054a extends s implements zd.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f2653b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0054a(f fVar) {
            super(0);
            this.f2653b = fVar;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a.this.a2().invoke(this.f2653b);
        }
    }

    public a(f fVar, l<? super f, k> lVar) {
        this.f2649n = fVar;
        this.f2651p = lVar;
        fVar.j(this);
    }

    private final k b2() {
        if (!this.f2650o) {
            f fVar = this.f2649n;
            fVar.k(null);
            a1.a(this, new C0054a(fVar));
            if (fVar.d() == null) {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
            }
            this.f2650o = true;
        }
        k kVarD = this.f2649n.d();
        r.c(kVarD);
        return kVarD;
    }

    @Override // a2.q
    public void A(n1.c cVar) {
        b2().a().invoke(cVar);
    }

    @Override // i1.e
    public void M() {
        this.f2650o = false;
        this.f2649n.k(null);
        a2.r.a(this);
    }

    @Override // a2.z0
    public void R0() {
        M();
    }

    public final l<f, k> a2() {
        return this.f2651p;
    }

    @Override // i1.d
    public long c() {
        return q.c(a2.k.h(this, w0.a(128)).a());
    }

    public final void c2(l<? super f, k> lVar) {
        this.f2651p = lVar;
        M();
    }

    @Override // a2.q
    public void g0() {
        M();
    }

    @Override // i1.d
    public w2.d getDensity() {
        return a2.k.i(this);
    }

    @Override // i1.d
    public w2.r getLayoutDirection() {
        return a2.k.j(this);
    }
}
