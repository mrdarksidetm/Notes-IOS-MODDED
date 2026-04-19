package androidx.compose.foundation.layout;

import a2.a0;
import androidx.compose.ui.e;
import md.i0;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
final class l extends e.c implements a0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2513n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f2514o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f2515p;

    static final class a extends ae.s implements zd.l<t0.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0 f2517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f2518c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t0 t0Var, g0 g0Var) {
            super(1);
            this.f2517b = t0Var;
            this.f2518c = g0Var;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            if (l.this.a2()) {
                t0.a.j(aVar, this.f2517b, this.f2518c.a1(l.this.b2()), this.f2518c.a1(l.this.c2()), 0.0f, 4, null);
            } else {
                t0.a.f(aVar, this.f2517b, this.f2518c.a1(l.this.b2()), this.f2518c.a1(l.this.c2()), 0.0f, 4, null);
            }
        }
    }

    private l(float f10, float f11, boolean z10) {
        this.f2513n = f10;
        this.f2514o = f11;
        this.f2515p = z10;
    }

    public /* synthetic */ l(float f10, float f11, boolean z10, ae.j jVar) {
        this(f10, f11, z10);
    }

    public final boolean a2() {
        return this.f2515p;
    }

    public final float b2() {
        return this.f2513n;
    }

    public final float c2() {
        return this.f2514o;
    }

    @Override // a2.a0
    public f0 d(g0 g0Var, d0 d0Var, long j10) {
        t0 t0VarI = d0Var.I(j10);
        return g0.z0(g0Var, t0VarI.q0(), t0VarI.d0(), null, new a(t0VarI, g0Var), 4, null);
    }

    public final void d2(boolean z10) {
        this.f2515p = z10;
    }

    public final void e2(float f10) {
        this.f2513n = f10;
    }

    public final void f2(float f10) {
        this.f2514o = f10;
    }
}
