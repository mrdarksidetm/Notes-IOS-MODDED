package d0;

import android.content.Context;
import android.os.Build;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.compose.ui.e f9166a;

    static final class a extends ae.s implements zd.q<y1.g0, y1.d0, w2.b, y1.f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9167a = new a();

        /* JADX INFO: renamed from: d0.b$a$a, reason: collision with other inner class name */
        static final class C0218a extends ae.s implements zd.l<t0.a, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t0 f9168a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f9169b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0218a(t0 t0Var, int i10) {
                super(1);
                this.f9168a = t0Var;
                this.f9169b = i10;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
                invoke2(aVar);
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(t0.a aVar) {
                t0 t0Var = this.f9168a;
                t0.a.r(aVar, t0Var, ((-this.f9169b) / 2) - ((t0Var.q0() - this.f9168a.k0()) / 2), ((-this.f9169b) / 2) - ((this.f9168a.d0() - this.f9168a.g0()) / 2), 0.0f, null, 12, null);
            }
        }

        a() {
            super(3);
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ y1.f0 invoke(y1.g0 g0Var, y1.d0 d0Var, w2.b bVar) {
            return m289invoke3p2s80s(g0Var, d0Var, bVar.t());
        }

        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
        public final y1.f0 m289invoke3p2s80s(y1.g0 g0Var, y1.d0 d0Var, long j10) {
            t0 t0VarI = d0Var.I(j10);
            int iA1 = g0Var.a1(w2.h.m(n.b() * 2));
            return y1.g0.z0(g0Var, ge.o.d(t0VarI.k0() - iA1, 0), ge.o.d(t0VarI.g0() - iA1, 0), null, new C0218a(t0VarI, iA1), 4, null);
        }
    }

    /* JADX INFO: renamed from: d0.b$b, reason: collision with other inner class name */
    static final class C0219b extends ae.s implements zd.q<y1.g0, y1.d0, w2.b, y1.f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0219b f9170a = new C0219b();

        /* JADX INFO: renamed from: d0.b$b$a */
        static final class a extends ae.s implements zd.l<t0.a, md.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t0 f9171a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f9172b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t0 t0Var, int i10) {
                super(1);
                this.f9171a = t0Var;
                this.f9172b = i10;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ md.i0 invoke(t0.a aVar) {
                invoke2(aVar);
                return md.i0.f15558a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(t0.a aVar) {
                t0 t0Var = this.f9171a;
                int i10 = this.f9172b;
                t0.a.f(aVar, t0Var, i10 / 2, i10 / 2, 0.0f, 4, null);
            }
        }

        C0219b() {
            super(3);
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ y1.f0 invoke(y1.g0 g0Var, y1.d0 d0Var, w2.b bVar) {
            return m290invoke3p2s80s(g0Var, d0Var, bVar.t());
        }

        /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
        public final y1.f0 m290invoke3p2s80s(y1.g0 g0Var, y1.d0 d0Var, long j10) {
            t0 t0VarI = d0Var.I(j10);
            int iA1 = g0Var.a1(w2.h.m(n.b() * 2));
            return y1.g0.z0(g0Var, t0VarI.q0() + iA1, t0VarI.d0() + iA1, null, new a(t0VarI, iA1), 4, null);
        }
    }

    static {
        f9166a = Build.VERSION.SDK_INT >= 31 ? androidx.compose.ui.layout.a.a(androidx.compose.ui.layout.a.a(androidx.compose.ui.e.f2662a, a.f9167a), C0219b.f9170a) : androidx.compose.ui.e.f2662a;
    }

    public static final j0 b(t0.l lVar, int i10) {
        j0 j0Var;
        lVar.e(-1476348564);
        if (t0.o.I()) {
            t0.o.U(-1476348564, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:64)");
        }
        Context context = (Context) lVar.P(androidx.compose.ui.platform.r.g());
        h0 h0Var = (h0) lVar.P(i0.a());
        if (h0Var != null) {
            lVar.e(511388516);
            boolean zN = lVar.N(context) | lVar.N(h0Var);
            Object objF = lVar.f();
            if (zN || objF == t0.l.f20813a.a()) {
                objF = new d0.a(context, h0Var);
                lVar.E(objF);
            }
            lVar.K();
            j0Var = (j0) objF;
        } else {
            j0Var = g0.f9204a;
        }
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return j0Var;
    }
}
