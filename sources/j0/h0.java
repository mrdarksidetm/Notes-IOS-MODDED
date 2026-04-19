package j0;

import nd.r0;
import t0.e2;
import t0.o2;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    static final class a extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f13709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.q<c1.d, t0.l, Integer, md.i0> f13710b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g0 g0Var, zd.q<? super c1.d, ? super t0.l, ? super Integer, md.i0> qVar) {
            super(2);
            this.f13709a = g0Var;
            this.f13710b = qVar;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (t0.o.I()) {
                t0.o.U(1863926504, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
            }
            this.f13709a.i(c1.f.a(lVar, 0));
            this.f13710b.invoke(this.f13709a, lVar, 8);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    static final class b extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.q<c1.d, t0.l, Integer, md.i0> f13711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13712b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(zd.q<? super c1.d, ? super t0.l, ? super Integer, md.i0> qVar, int i10) {
            super(2);
            this.f13711a = qVar;
            this.f13712b = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            h0.a(this.f13711a, lVar, e2.a(this.f13712b | 1));
        }
    }

    static final class c extends ae.s implements zd.a<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c1.g f13713a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c1.g gVar) {
            super(0);
            this.f13713a = gVar;
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g0 invoke() {
            return new g0(this.f13713a, r0.e());
        }
    }

    public static final void a(zd.q<? super c1.d, ? super t0.l, ? super Integer, md.i0> qVar, t0.l lVar, int i10) {
        int i11;
        t0.l lVarP = lVar.p(674185128);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.k(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && lVarP.s()) {
            lVarP.x();
        } else {
            if (t0.o.I()) {
                t0.o.U(674185128, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            c1.g gVar = (c1.g) lVarP.P(c1.i.b());
            g0 g0Var = (g0) c1.b.b(new Object[]{gVar}, g0.f13692d.a(gVar), null, new c(gVar), lVarP, 72, 4);
            t0.v.a(c1.i.b().c(g0Var), b1.c.b(lVarP, 1863926504, true, new a(g0Var, qVar)), lVarP, 56);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new b(qVar, i10));
        }
    }
}
