package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import androidx.compose.ui.e;
import h0.j0;
import h0.o0;
import h0.s0;
import h0.t0;
import md.i0;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class InsetSpacersKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.InsetSpacersKt$StatusBarSpacer$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InsetSpacersKt.StatusBarSpacer(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.InsetSpacersKt$SystemBarsSpacer$1, reason: invalid class name and case insensitive filesystem */
    static final class C06611 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06611(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            InsetSpacersKt.SystemBarsSpacer(lVar, e2.a(this.$$changed | 1));
        }
    }

    public static final void StatusBarSpacer(l lVar, int i10) {
        l lVarP = lVar.p(-585549758);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-585549758, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.StatusBarSpacer (InsetSpacers.kt:12)");
            }
            j0.a(s0.b(e.f2662a, t0.b(o0.f11702a, lVarP, 8)), lVarP, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(i10));
    }

    public static final void SystemBarsSpacer(l lVar, int i10) {
        l lVarP = lVar.p(1253623468);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1253623468, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.SystemBarsSpacer (InsetSpacers.kt:21)");
            }
            j0.a(s0.a(e.f2662a, t0.c(o0.f11702a, lVarP, 8)), lVarP, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06611(i10));
    }
}
