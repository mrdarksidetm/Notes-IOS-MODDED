package i0;

import j0.k0;
import t0.f3;
import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    static final class b extends ae.s implements zd.a<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p3<zd.l<b0, md.i0>> f12180a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p3<? extends zd.l<? super b0, md.i0>> p3Var) {
            super(0);
            this.f12180a = p3Var;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            return new j(this.f12180a.getValue());
        }
    }

    static final class c extends ae.s implements zd.a<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p3<j> f12181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f12182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p3<j> p3Var, h0 h0Var) {
            super(0);
            this.f12181a = p3Var;
            this.f12182b = h0Var;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            j value = this.f12181a.getValue();
            return new o(this.f12182b, value, new k0(this.f12182b.q(), value));
        }
    }

    public static final zd.a<n> a(h0 h0Var, zd.l<? super b0, md.i0> lVar, t0.l lVar2, int i10) {
        lVar2.e(-1898306282);
        if (t0.o.I()) {
            t0.o.U(-1898306282, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        p3 p3VarO = f3.o(lVar, lVar2, (i10 >> 3) & 14);
        lVar2.e(1157296644);
        boolean zN = lVar2.N(h0Var);
        Object objF = lVar2.f();
        if (zN || objF == t0.l.f20813a.a()) {
            objF = new ae.z(f3.d(f3.n(), new c(f3.d(f3.n(), new b(p3VarO)), h0Var))) { // from class: i0.p.a
                @Override // he.h
                public Object get() {
                    return ((p3) this.receiver).getValue();
                }
            };
            lVar2.E(objF);
        }
        lVar2.K();
        he.h hVar = (he.h) objF;
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar2.K();
        return hVar;
    }
}
