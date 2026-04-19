package com.revenuecat.purchases.ui.revenuecatui;

import a2.g;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.e;
import b1.c;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import f1.b;
import h0.y;
import md.i0;
import q0.h0;
import t0.e2;
import t0.i;
import t0.k1;
import t0.l;
import t0.l0;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import y1.e0;
import y1.u;
import zd.a;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallDialogKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$DialogScaffold$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements q<y, l, Integer, i0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ PaywallOptions $paywallOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallOptions paywallOptions, int i10) {
            super(3);
            this.$paywallOptions = paywallOptions;
            this.$$dirty = i10;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ i0 invoke(y yVar, l lVar, Integer num) {
            invoke(yVar, lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(y yVar, l lVar, int i10) {
            int i11;
            r.f(yVar, "paddingValues");
            if ((i10 & 14) == 0) {
                i11 = (lVar.N(yVar) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && lVar.s()) {
                lVar.x();
                return;
            }
            if (o.I()) {
                o.U(-2032538722, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.DialogScaffold.<anonymous> (PaywallDialog.kt:76)");
            }
            e eVarH = m.h(p.e(e.f2662a, 0.0f, 1, null), yVar);
            PaywallOptions paywallOptions = this.$paywallOptions;
            int i12 = this.$$dirty;
            lVar.e(733328855);
            e0 e0VarG = d.g(b.f11020a.o(), false, lVar, 0);
            lVar.e(-1323940314);
            int iA = i.a(lVar, 0);
            w wVarB = lVar.B();
            g.a aVar = g.J;
            a<g> aVarA = aVar.a();
            q<q2<g>, l, Integer, i0> qVarA = u.a(eVarH);
            if (!(lVar.t() instanceof t0.e)) {
                i.b();
            }
            lVar.r();
            if (lVar.l()) {
                lVar.O(aVarA);
            } else {
                lVar.D();
            }
            l lVarA = u3.a(lVar);
            u3.b(lVarA, e0VarG, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            zd.p<g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            f fVar = f.f2502a;
            PaywallKt.Paywall(paywallOptions, lVar, i12 & 14);
            lVar.K();
            lVar.L();
            lVar.K();
            lVar.K();
            if (o.I()) {
                o.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$DialogScaffold$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements zd.p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallOptions $paywallOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallOptions paywallOptions, int i10) {
            super(2);
            this.$paywallOptions = paywallOptions;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            PaywallDialogKt.DialogScaffold(this.$paywallOptions, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$2, reason: invalid class name and case insensitive filesystem */
    static final class C06202 extends s implements a<i0> {
        final /* synthetic */ a<i0> $dismissRequest;
        final /* synthetic */ PaywallDialogOptions $paywallDialogOptions;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06202(a<i0> aVar, PaywallViewModel paywallViewModel, PaywallDialogOptions paywallDialogOptions) {
            super(0);
            this.$dismissRequest = aVar;
            this.$viewModel = paywallViewModel;
            this.$paywallDialogOptions = paywallDialogOptions;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$dismissRequest.invoke();
            this.$viewModel.closePaywall();
            a<i0> dismissRequest = this.$paywallDialogOptions.getDismissRequest();
            if (dismissRequest != null) {
                dismissRequest.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements zd.p<l, Integer, i0> {
        final /* synthetic */ PaywallOptions $paywallOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaywallOptions paywallOptions) {
            super(2);
            this.$paywallOptions = paywallOptions;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (o.I()) {
                o.U(779275646, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialog.<anonymous> (PaywallDialog.kt:64)");
            }
            PaywallDialogKt.DialogScaffold(this.$paywallOptions, lVar, 0);
            if (o.I()) {
                o.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallDialogKt$PaywallDialog$4, reason: invalid class name */
    static final class AnonymousClass4 extends s implements zd.p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallDialogOptions $paywallDialogOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PaywallDialogOptions paywallDialogOptions, int i10) {
            super(2);
            this.$paywallDialogOptions = paywallDialogOptions;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            PaywallDialogKt.PaywallDialog(this.$paywallDialogOptions, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DialogScaffold(PaywallOptions paywallOptions, l lVar, int i10) {
        int i11;
        l lVar2;
        l lVarP = lVar.p(-1433421041);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(paywallOptions) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(-1433421041, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.DialogScaffold (PaywallDialog.kt:71)");
            }
            lVar2 = lVarP;
            h0.b(p.b(p.g(e.f2662a, 0.0f, 1, null), getDialogMaxHeightPercentage(lVarP, 0)), null, null, null, null, 0, 0L, 0L, null, c.b(lVarP, -2032538722, true, new AnonymousClass1(paywallOptions, i11)), lVarP, 805306368, 510);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass2(paywallOptions, i10));
    }

    public static final void PaywallDialog(PaywallDialogOptions paywallDialogOptions, l lVar, int i10) {
        r.f(paywallDialogOptions, "paywallDialogOptions");
        l lVarP = lVar.p(1772149319);
        if (o.I()) {
            o.U(1772149319, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialog (PaywallDialog.kt:34)");
        }
        zd.l<CustomerInfo, Boolean> shouldDisplayBlock = paywallDialogOptions.getShouldDisplayBlock();
        Object[] objArr = new Object[0];
        lVarP.e(1157296644);
        boolean zN = lVarP.N(shouldDisplayBlock);
        Object objF = lVarP.f();
        if (zN || objF == l.f20813a.a()) {
            objF = new PaywallDialogKt$PaywallDialog$shouldDisplayDialog$2$1(shouldDisplayBlock);
            lVarP.E(objF);
        }
        lVarP.K();
        k1 k1Var = (k1) c1.b.b(objArr, null, null, (a) objF, lVarP, 8, 6);
        lVarP.e(162782815);
        if (shouldDisplayBlock != null) {
            lVarP.e(511388516);
            boolean zN2 = lVarP.N(k1Var) | lVarP.N(shouldDisplayBlock);
            Object objF2 = lVarP.f();
            if (zN2 || objF2 == l.f20813a.a()) {
                objF2 = new PaywallDialogKt$PaywallDialog$1$1(shouldDisplayBlock, k1Var, null);
                lVarP.E(objF2);
            }
            lVarP.K();
            l0.d(paywallDialogOptions, (zd.p) objF2, lVarP, 72);
        }
        lVarP.K();
        if (PaywallDialog$lambda$1(k1Var)) {
            lVarP.e(1157296644);
            boolean zN3 = lVarP.N(k1Var);
            Object objF3 = lVarP.f();
            if (zN3 || objF3 == l.f20813a.a()) {
                objF3 = new PaywallDialogKt$PaywallDialog$dismissRequest$1$1(k1Var);
                lVarP.E(objF3);
            }
            lVarP.K();
            a<i0> aVar = (a) objF3;
            PaywallOptions paywallOptions$revenuecatui_defaultsRelease = paywallDialogOptions.toPaywallOptions$revenuecatui_defaultsRelease(aVar);
            a3.a.a(new C06202(aVar, InternalPaywallKt.getPaywallViewModel(paywallOptions$revenuecatui_defaultsRelease, paywallDialogOptions.getShouldDisplayBlock(), lVarP, 0, 0), paywallDialogOptions), new a3.e(false, false, null, shouldUsePlatformDefaultWidth(lVarP, 0), false, 23, null), c.b(lVarP, 779275646, true, new AnonymousClass3(paywallOptions$revenuecatui_defaultsRelease)), lVarP, 384, 0);
        }
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass4(paywallDialogOptions, i10));
    }

    private static final boolean PaywallDialog$lambda$1(k1<Boolean> k1Var) {
        return k1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PaywallDialog$lambda$2(k1<Boolean> k1Var, boolean z10) {
        k1Var.setValue(Boolean.valueOf(z10));
    }

    private static final float getDialogMaxHeightPercentage(l lVar, int i10) {
        if (o.I()) {
            o.U(-1571840626, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.getDialogMaxHeightPercentage (PaywallDialog.kt:89)");
        }
        if (HelperFunctionsKt.windowAspectRatio(lVar, 0) < 1.25f) {
            return 1.0f;
        }
        float f10 = WindowHelperKt.hasCompactDimension(lVar, 0) ? 1.0f : 0.85f;
        if (o.I()) {
            o.T();
        }
        return f10;
    }

    private static final boolean shouldUsePlatformDefaultWidth(l lVar, int i10) {
        if (o.I()) {
            o.U(2082657643, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.shouldUsePlatformDefaultWidth (PaywallDialog.kt:98)");
        }
        boolean z10 = !WindowHelperKt.hasCompactDimension(lVar, 0);
        if (o.I()) {
            o.T();
        }
        return z10;
    }
}
