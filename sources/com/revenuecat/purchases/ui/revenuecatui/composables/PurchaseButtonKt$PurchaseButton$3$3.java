package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.g;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import b1.c;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import f1.b;
import g2.x;
import h0.g0;
import md.i0;
import t0.i;
import t0.k1;
import t0.l;
import t0.o;
import t0.p3;
import t0.q2;
import t0.u3;
import t0.w;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class PurchaseButtonKt$PurchaseButton$3$3 extends s implements q<g0, l, Integer, i0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ p3<Float> $labelOpacity$delegate;
    final /* synthetic */ TemplateConfiguration.PackageConfiguration $packages;
    final /* synthetic */ k1<TemplateConfiguration.PackageInfo> $selectedPackage;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt$PurchaseButton$3$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements zd.l<x, i0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(x xVar) {
            invoke2(xVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(x xVar) {
            r.f(xVar, "$this$clearAndSetSemantics");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseButtonKt$PurchaseButton$3$3(TemplateConfiguration.PackageConfiguration packageConfiguration, k1<TemplateConfiguration.PackageInfo> k1Var, TemplateConfiguration.Colors colors, p3<Float> p3Var, PaywallViewModel paywallViewModel, int i10) {
        super(3);
        this.$packages = packageConfiguration;
        this.$selectedPackage = k1Var;
        this.$colors = colors;
        this.$labelOpacity$delegate = p3Var;
        this.$viewModel = paywallViewModel;
        this.$$dirty = i10;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(g0 g0Var, l lVar, Integer num) {
        invoke(g0Var, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(g0 g0Var, l lVar, int i10) {
        r.f(g0Var, "$this$Button");
        if ((i10 & 81) == 16 && lVar.s()) {
            lVar.x();
            return;
        }
        if (o.I()) {
            o.U(1286977873, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButton.<anonymous>.<anonymous> (PurchaseButton.kt:131)");
        }
        e.a aVar = e.f2662a;
        e eVarA = g2.o.a(aVar, AnonymousClass1.INSTANCE);
        TemplateConfiguration.PackageConfiguration packageConfiguration = this.$packages;
        k1<TemplateConfiguration.PackageInfo> k1Var = this.$selectedPackage;
        TemplateConfiguration.Colors colors = this.$colors;
        p3<Float> p3Var = this.$labelOpacity$delegate;
        PaywallViewModel paywallViewModel = this.$viewModel;
        int i11 = this.$$dirty;
        lVar.e(733328855);
        b.a aVar2 = b.f11020a;
        e0 e0VarG = d.g(aVar2.o(), false, lVar, 0);
        lVar.e(-1323940314);
        int iA = i.a(lVar, 0);
        w wVarB = lVar.B();
        g.a aVar3 = g.J;
        a<g> aVarA = aVar3.a();
        q<q2<g>, l, Integer, i0> qVarA = u.a(eVarA);
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
        u3.b(lVarA, e0VarG, aVar3.e());
        u3.b(lVarA, wVarB, aVar3.g());
        p<g, Integer, i0> pVarB = aVar3.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        f fVar = f.f2502a;
        ConsistentPackageContentViewKt.ConsistentPackageContentView(packageConfiguration.getAll(), k1Var.getValue(), c.b(lVar, 98081200, true, new PurchaseButtonKt$PurchaseButton$3$3$2$1(colors, p3Var)), lVar, 456);
        e eVarA2 = fVar.a(aVar);
        lVar.e(733328855);
        e0 e0VarG2 = d.g(aVar2.o(), false, lVar, 0);
        lVar.e(-1323940314);
        int iA2 = i.a(lVar, 0);
        w wVarB2 = lVar.B();
        a<g> aVarA2 = aVar3.a();
        q<q2<g>, l, Integer, i0> qVarA2 = u.a(eVarA2);
        if (!(lVar.t() instanceof t0.e)) {
            i.b();
        }
        lVar.r();
        if (lVar.l()) {
            lVar.O(aVarA2);
        } else {
            lVar.D();
        }
        l lVarA2 = u3.a(lVar);
        u3.b(lVarA2, e0VarG2, aVar3.e());
        u3.b(lVarA2, wVarB2, aVar3.g());
        p<g, Integer, i0> pVarB2 = aVar3.b();
        if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
            lVarA2.E(Integer.valueOf(iA2));
            lVarA2.Q(Integer.valueOf(iA2), pVarB2);
        }
        qVarA2.invoke(q2.a(q2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        PurchaseButtonKt.LoadingSpinner(fVar, paywallViewModel.getActionInProgress().getValue().booleanValue(), colors, lVar, 6 | ((i11 << 6) & 896));
        lVar.K();
        lVar.L();
        lVar.K();
        lVar.K();
        lVar.K();
        lVar.L();
        lVar.K();
        lVar.K();
        if (o.I()) {
            o.T();
        }
    }
}
