package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.g;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import f1.b;
import md.i0;
import t0.e2;
import t0.i;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import v1.p0;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class DisableTouchesComposableKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt$DisableTouchesComposable$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p<l, Integer, i0> $content;
        final /* synthetic */ boolean $shouldDisable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z10, p<? super l, ? super Integer, i0> pVar, int i10, int i11) {
            super(2);
            this.$shouldDisable = z10;
            this.$content = pVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            DisableTouchesComposableKt.DisableTouchesComposable(this.$shouldDisable, this.$content, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final void DisableTouchesComposable(boolean z10, p<? super l, ? super Integer, i0> pVar, l lVar, int i10, int i11) {
        int i12;
        r.f(pVar, "content");
        l lVarP = lVar.p(1296500023);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.k(pVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            if (o.I()) {
                o.U(1296500023, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposable (DisableTouchesComposable.kt:8)");
            }
            lVarP.e(733328855);
            e.a aVar = e.f2662a;
            e0 e0VarG = d.g(b.f11020a.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar2 = g.J;
            a<g> aVarA = aVar2.a();
            q<q2<g>, l, Integer, i0> qVarA = u.a(aVar);
            if (!(lVarP.t() instanceof t0.e)) {
                i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA);
            } else {
                lVarP.D();
            }
            l lVarA = u3.a(lVarP);
            u3.b(lVarA, e0VarG, aVar2.e());
            u3.b(lVarA, wVarB, aVar2.g());
            p<g, Integer, i0> pVarB = aVar2.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar = f.f2502a;
            pVar.invoke(lVarP, Integer.valueOf((i12 >> 3) & 14));
            lVarP.e(-575898326);
            if (z10) {
                d.a(p0.d(fVar.a(aVar), i0.f15558a, new DisableTouchesComposableKt$DisableTouchesComposable$1$1(null)), lVarP, 0);
            }
            lVarP.K();
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass2(z10, pVar, i10, i11));
    }
}
