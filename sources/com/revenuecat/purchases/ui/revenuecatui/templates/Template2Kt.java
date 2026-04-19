package com.revenuecat.purchases.ui.revenuecatui.templates;

import a2.g;
import ae.r;
import ae.s;
import android.net.Uri;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import b1.c;
import b2.q1;
import c0.j;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.IconImageKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.InsetSpacersKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallBackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.AnimationsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.TestTag;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import d0.m0;
import d0.n0;
import f1.b;
import h0.b;
import h0.f0;
import h0.g;
import h0.g0;
import h0.h0;
import l1.j0;
import md.i0;
import q0.q0;
import q0.y;
import t0.e2;
import t0.i;
import t0.k1;
import t0.k3;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import u2.i;
import w2.h;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class Template2Kt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$AnimatedPackages$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ boolean $landscapeLayout;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallState.Loaded.Legacy legacy, boolean z10, boolean z11, PaywallViewModel paywallViewModel, e eVar, int i10) {
            super(2);
            this.$state = legacy;
            this.$packageSelectionVisible = z10;
            this.$landscapeLayout = z11;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template2Kt.AnimatedPackages(this.$state, this.$packageSelectionVisible, this.$landscapeLayout, this.$viewModel, this.$childModifier, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$CheckmarkBox$2, reason: invalid class name and case insensitive filesystem */
    static final class C06982 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06982(boolean z10, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$isSelected = z10;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template2Kt.CheckmarkBox(this.$isSelected, this.$colors, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$IconImage$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallState.Loaded.Legacy legacy, e eVar, int i10) {
            super(2);
            this.$state = legacy;
            this.$childModifier = eVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template2Kt.IconImage(this.$state, this.$childModifier, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$SelectPackageButton$2, reason: invalid class name and case insensitive filesystem */
    static final class C06992 extends s implements a<i0> {
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06992(PaywallViewModel paywallViewModel, TemplateConfiguration.PackageInfo packageInfo) {
            super(0);
            this.$viewModel = paywallViewModel;
            this.$packageInfo = packageInfo;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.selectPackage(this.$packageInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$SelectPackageButton$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements q<g0, l, Integer, i0> {
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ long $textColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(TemplateConfiguration.PackageInfo packageInfo, long j10, boolean z10, PaywallState.Loaded.Legacy legacy) {
            super(3);
            this.$packageInfo = packageInfo;
            this.$textColor = j10;
            this.$isSelected = z10;
            this.$state = legacy;
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
                o.U(760289252, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton.<anonymous> (Template2.kt:387)");
            }
            e.a aVar = e.f2662a;
            e eVarG = androidx.compose.foundation.layout.p.g(aVar, 0.0f, 1, null);
            b bVar = b.f11594a;
            b.f fVarO = bVar.o(h.m(4));
            b.a aVar2 = f1.b.f11020a;
            b.InterfaceC0266b interfaceC0266bK = aVar2.k();
            TemplateConfiguration.PackageInfo packageInfo = this.$packageInfo;
            long j10 = this.$textColor;
            boolean z10 = this.$isSelected;
            PaywallState.Loaded.Legacy legacy = this.$state;
            lVar.e(-483455358);
            e0 e0VarA = g.a(fVarO, interfaceC0266bK, lVar, 54);
            lVar.e(-1323940314);
            int iA = i.a(lVar, 0);
            w wVarB = lVar.B();
            g.a aVar3 = a2.g.J;
            a<a2.g> aVarA = aVar3.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarG);
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
            u3.b(lVarA, e0VarA, aVar3.e());
            u3.b(lVarA, wVarB, aVar3.g());
            p<a2.g, Integer, i0> pVarB = aVar3.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            h0.i iVar = h0.i.f11664a;
            b.f fVarO2 = bVar.o(h.m(6));
            b.c cVarI = aVar2.i();
            lVar.e(693286680);
            e0 e0VarA2 = f0.a(fVarO2, cVarI, lVar, 54);
            lVar.e(-1323940314);
            int iA2 = i.a(lVar, 0);
            w wVarB2 = lVar.B();
            a<a2.g> aVarA2 = aVar3.a();
            q<q2<a2.g>, l, Integer, i0> qVarA2 = u.a(aVar);
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
            u3.b(lVarA2, e0VarA2, aVar3.e());
            u3.b(lVarA2, wVarB2, aVar3.g());
            p<a2.g, Integer, i0> pVarB2 = aVar3.b();
            if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
                lVarA2.E(Integer.valueOf(iA2));
                lVarA2.Q(Integer.valueOf(iA2), pVarB2);
            }
            qVarA2.invoke(q2.a(q2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            h0 h0Var = h0.f11663a;
            Template2Kt.CheckmarkBox(z10, PaywallStateKt.getCurrentColors(legacy, lVar, 8), lVar, 0);
            String offerName = packageInfo.getLocalization().getOfferName();
            if (offerName == null) {
                offerName = packageInfo.getRcPackage().getProduct().getTitle();
            }
            y yVar = y.f18928a;
            int i11 = y.f18929b;
            q0.b(offerName, null, j10, 0L, null, n2.i0.f15808b.h(), null, 0L, null, null, 0L, 0, false, 0, 0, null, yVar.c(lVar, i11 | 0).b(), lVar, 196608, 0, 65498);
            lVar.K();
            lVar.L();
            lVar.K();
            lVar.K();
            IntroEligibilityStateViewKt.m154IntroEligibilityStateViewQETHhvg(packageInfo.getLocalization().getOfferDetails(), packageInfo.getLocalization().getOfferDetailsWithIntroOffer(), packageInfo.getLocalization().getOfferDetailsWithMultipleIntroOffers(), PackageExtensionsKt.getIntroEligibility(packageInfo), j10, yVar.c(lVar, i11 | 0).c(), null, null, false, null, lVar, 100663296, 704);
            lVar.K();
            lVar.L();
            lVar.K();
            lVar.K();
            if (o.I()) {
                o.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$SelectPackageButton$4, reason: invalid class name */
    static final class AnonymousClass4 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ h0.h $this_SelectPackageButton;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(h0.h hVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, e eVar, int i10) {
            super(2);
            this.$this_SelectPackageButton = hVar;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template2Kt.SelectPackageButton(this.$this_SelectPackageButton, this.$state, this.$packageInfo, this.$viewModel, this.$childModifier, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2$2, reason: invalid class name and case insensitive filesystem */
    static final class C07002 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07002(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, e eVar, int i10, int i11) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template2Kt.Template2(this.$state, this.$viewModel, this.$childModifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2LandscapeContent$2, reason: invalid class name and case insensitive filesystem */
    static final class C07012 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ h0.h $this_Template2LandscapeContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07012(h0.h hVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, e eVar, int i10) {
            super(2);
            this.$this_Template2LandscapeContent = hVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z10;
            this.$childModifier = eVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template2Kt.Template2LandscapeContent(this.$this_Template2LandscapeContent, this.$state, this.$viewModel, this.$packageSelectionVisible, this.$childModifier, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PaywallFooterCondensedPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C07021 extends s implements a<i0> {
        public static final C07021 INSTANCE = new C07021();

        C07021() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PaywallFooterCondensedPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C07032 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07032(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template2Kt.Template2PaywallFooterCondensedPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PaywallFooterPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C07041 extends s implements a<i0> {
        public static final C07041 INSTANCE = new C07041();

        C07041() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PaywallFooterPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C07052 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07052(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template2Kt.Template2PaywallFooterPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C07061 extends s implements a<i0> {
        public static final C07061 INSTANCE = new C07061();

        C07061() {
            super(0);
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C07072 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07072(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template2Kt.Template2PaywallPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt$Template2PortraitContent$3, reason: invalid class name and case insensitive filesystem */
    static final class C07083 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ h0.h $this_Template2PortraitContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07083(h0.h hVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, e eVar, int i10) {
            super(2);
            this.$this_Template2PortraitContent = hVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z10;
            this.$childModifier = eVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template2Kt.Template2PortraitContent(this.$this_Template2PortraitContent, this.$state, this.$viewModel, this.$packageSelectionVisible, this.$childModifier, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnimatedPackages(PaywallState.Loaded.Legacy legacy, boolean z10, boolean z11, PaywallViewModel paywallViewModel, e eVar, l lVar, int i10) {
        l lVarP = lVar.p(1799464452);
        if (o.I()) {
            o.U(1799464452, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.AnimatedPackages (Template2.kt:293)");
        }
        f1.b bVarO = PaywallStateKt.isInFullScreenMode(legacy) ? f1.b.f11020a.o() : f1.b.f11020a.b();
        lVarP.e(733328855);
        e.a aVar = e.f2662a;
        e0 e0VarG = d.g(bVarO, false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar2 = a2.g.J;
        a<a2.g> aVarA = aVar2.a();
        q<q2<a2.g>, l, Integer, i0> qVarA = u.a(aVar);
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
        p<a2.g, Integer, i0> pVarB = aVar2.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        b0.d.e(!z10, null, androidx.compose.animation.f.m(j.i(0, 200, null, 5, null), 0.0f, 2, null), androidx.compose.animation.f.o(j.i(0, 200, null, 5, null), 0.0f, 2, null), "OfferDetailsVisibility", c.b(lVarP, 4658274, true, new Template2Kt$AnimatedPackages$1$1(legacy)), lVarP, 224640, 2);
        b.a aVar3 = f1.b.f11020a;
        b0.d.e(z10, null, androidx.compose.animation.f.k(null, aVar3.a(), false, null, 13, null), androidx.compose.animation.f.u(null, aVar3.a(), false, null, 13, null), "SelectPackagesVisibility", c.b(lVarP, 1995133977, true, new Template2Kt$AnimatedPackages$1$2(z11, legacy, paywallViewModel, eVar, i10)), lVarP, ((i10 >> 3) & 14) | 224640, 2);
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass2(legacy, z10, z11, paywallViewModel, eVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CheckmarkBox(boolean z10, TemplateConfiguration.Colors colors, l lVar, int i10) {
        int i11;
        l lVarP = lVar.p(1250819500);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.N(colors) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1250819500, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CheckmarkBox (Template2.kt:417)");
            }
            e eVarD = androidx.compose.foundation.c.d(i1.g.a(androidx.compose.foundation.layout.p.o(e.f2662a, Template2UIConstants.INSTANCE.m258getCheckmarkSizeD9Ej5fM()), l0.g.f()), j0.u(colors.m220getAccent20d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            lVarP.e(733328855);
            e0 e0VarG = d.g(f1.b.f11020a.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            a<a2.g> aVarA = aVar.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarD);
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
            u3.b(lVarA, e0VarG, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            p<a2.g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar = f.f2502a;
            lVarP.e(-745265793);
            if (z10) {
                PaywallIconKt.m179PaywallIconFNF3uiM(PaywallIconName.CHECK_CIRCLE, null, colors.m219getAccent10d7_KjU(), lVarP, 6, 2);
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
        o2VarV.a(new C06982(z10, colors, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconImage(PaywallState.Loaded.Legacy legacy, e eVar, l lVar, int i10) {
        l lVarP = lVar.p(-951232294);
        if (o.I()) {
            o.U(-951232294, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.IconImage (Template2.kt:246)");
        }
        Uri iconUri = legacy.getTemplateConfiguration().getImages().getIconUri();
        Template2UIConstants template2UIConstants = Template2UIConstants.INSTANCE;
        IconImageKt.m153IconImagedjqsMU(iconUri, template2UIConstants.m260getMaxIconWidthD9Ej5fM(), template2UIConstants.m259getIconCornerRadiusD9Ej5fM(), eVar, lVarP, ((i10 << 6) & 7168) | 440, 0);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(legacy, eVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectPackageButton(h0.h hVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, e eVar, l lVar, int i10) {
        l lVarP = lVar.p(1238280660);
        if (o.I()) {
            o.U(1238280660, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton (Template2.kt:341)");
        }
        TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(lVarP, 8);
        boolean zB = r.b(packageInfo, legacy.getSelectedPackage().getValue());
        float fPackageButtonActionInProgressOpacityAnimation = AnimationsKt.packageButtonActionInProgressOpacityAnimation(paywallViewModel, lVarP, (i10 >> 9) & 14);
        long jM243packageButtonColorAnimation9z6LAg8 = AnimationsKt.m243packageButtonColorAnimation9z6LAg8(legacy, packageInfo, currentColors.m220getAccent20d7_KjU(), currentColors.m222getBackground0d7_KjU(), lVarP, 72);
        long jM243packageButtonColorAnimation9z6LAg82 = AnimationsKt.m243packageButtonColorAnimation9z6LAg8(legacy, packageInfo, currentColors.m219getAccent10d7_KjU(), currentColors.m227getText10d7_KjU(), lVarP, 72);
        d0.i iVarA = zB ? null : d0.j.a(UIConstant.INSTANCE.m81getDefaultPackageBorderWidthD9Ej5fM(), j0.u(currentColors.m227getText10d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null));
        e eVarC = hVar.c(i1.a.a(androidx.compose.foundation.layout.p.g(eVar, 0.0f, 1, null), fPackageButtonActionInProgressOpacityAnimation), f1.b.f11020a.k());
        Boolean boolValueOf = Boolean.valueOf(zB);
        lVarP.e(1157296644);
        boolean zN = lVarP.N(boolValueOf);
        Object objF = lVarP.f();
        if (zN || objF == l.f20813a.a()) {
            objF = new Template2Kt$SelectPackageButton$1$1(zB);
            lVarP.E(objF);
        }
        lVarP.K();
        e eVarA = q1.a(g2.o.d(eVarC, false, (zd.l) objF, 1, null), TestTag.INSTANCE.selectButtonTestTag(packageInfo.getRcPackage().getIdentifier()));
        q0.d dVarB = q0.e.f18552a.b(jM243packageButtonColorAnimation9z6LAg8, jM243packageButtonColorAnimation9z6LAg82, 0L, 0L, lVarP, (0 | q0.e.f18566o) << 12, 12);
        UIConstant uIConstant = UIConstant.INSTANCE;
        q0.g.a(new C06992(paywallViewModel, packageInfo), eVarA, false, l0.g.c(uIConstant.m82getDefaultPackageCornerRadiusD9Ej5fM()), dVarB, null, iVarA, m.b(uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m83getDefaultVerticalSpacingD9Ej5fM()), null, c.b(lVarP, 760289252, true, new AnonymousClass3(packageInfo, jM243packageButtonColorAnimation9z6LAg82, zB, legacy)), lVarP, 805306368, 292);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass4(hVar, legacy, packageInfo, paywallViewModel, eVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Subtitle-8iNrtrE, reason: not valid java name */
    public static final void m254Subtitle8iNrtrE(PaywallState.Loaded.Legacy legacy, e eVar, int i10, l lVar, int i11, int i12) {
        int iA;
        int i13;
        l lVarP = lVar.p(993910968);
        if ((i12 & 4) != 0) {
            i13 = i11 & (-897);
            iA = u2.i.f21560b.a();
        } else {
            iA = i10;
            i13 = i11;
        }
        if (o.I()) {
            o.U(993910968, i13, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Subtitle (Template2.kt:276)");
        }
        i2.g0 g0VarN = y.f18928a.c(lVarP, y.f18929b | 0).n();
        n2.i0 i0VarG = n2.i0.f15808b.g();
        String subtitle = PaywallStateKt.getSelectedLocalization(legacy).getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        MarkdownKt.m163MarkdownSXj7GJg(subtitle, eVar, legacy.getTemplateConfiguration().getCurrentColors(lVarP, 8).m227getText10d7_KjU(), g0VarN, 0L, i0VarG, null, null, u2.i.h(iA), false, true, lVarP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 196608 | ((i13 << 18) & 234881024), 6, 720);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new Template2Kt$Subtitle$1(legacy, eVar, iA, i11, i12));
    }

    public static final void Template2(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, e eVar, l lVar, int i10, int i11) {
        r.f(legacy, "state");
        r.f(paywallViewModel, "viewModel");
        l lVarP = lVar.p(-1075558368);
        e eVar2 = (i11 & 4) != 0 ? e.f2662a : eVar;
        if (o.I()) {
            o.U(-1075558368, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2 (Template2.kt:88)");
        }
        lVarP.e(733328855);
        e.a aVar = e.f2662a;
        b.a aVar2 = f1.b.f11020a;
        e0 e0VarG = d.g(aVar2.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar3 = a2.g.J;
        a<a2.g> aVarA = aVar3.a();
        q<q2<a2.g>, l, Integer, i0> qVarA = u.a(aVar);
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
        u3.b(lVarA, e0VarG, aVar3.e());
        u3.b(lVarA, wVarB, aVar3.g());
        p<a2.g, Integer, i0> pVarB = aVar3.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        PaywallBackgroundKt.PaywallBackground(f.f2502a, legacy.getTemplateConfiguration(), lVarP, 70);
        b.m mVarD = PaywallStateKt.isInFullScreenMode(legacy) ? h0.b.f11594a.d() : h0.b.f11594a.h();
        lVarP.e(-483455358);
        e0 e0VarA = h0.g.a(mVarD, aVar2.k(), lVarP, 0);
        lVarP.e(-1323940314);
        int iA2 = i.a(lVarP, 0);
        w wVarB2 = lVarP.B();
        a<a2.g> aVarA2 = aVar3.a();
        q<q2<a2.g>, l, Integer, i0> qVarA2 = u.a(aVar);
        if (!(lVarP.t() instanceof t0.e)) {
            i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA2);
        } else {
            lVarP.D();
        }
        l lVarA2 = u3.a(lVarP);
        u3.b(lVarA2, e0VarA, aVar3.e());
        u3.b(lVarA2, wVarB2, aVar3.g());
        p<a2.g, Integer, i0> pVarB2 = aVar3.b();
        if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
            lVarA2.E(Integer.valueOf(iA2));
            lVarA2.Q(Integer.valueOf(iA2), pVarB2);
        }
        qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        InsetSpacersKt.StatusBarSpacer(lVarP, 0);
        lVarP.e(-492369756);
        Object objF = lVarP.f();
        l.a aVar4 = l.f20813a;
        if (objF == aVar4.a()) {
            objF = k3.e(Boolean.valueOf(legacy.getTemplateConfiguration().getMode() != PaywallMode.FOOTER_CONDENSED), null, 2, null);
            lVarP.E(objF);
        }
        lVarP.K();
        k1 k1Var = (k1) objF;
        if (WindowHelperKt.shouldUseLandscapeLayout(legacy, lVarP, 8)) {
            lVarP.e(-1633113560);
            Template2LandscapeContent(iVar, legacy, paywallViewModel, Template2$lambda$5$lambda$4$lambda$1(k1Var), eVar2, lVarP, ((i10 << 3) & 896) | 70 | (57344 & (i10 << 6)));
        } else {
            lVarP.e(-1633113440);
            Template2PortraitContent(iVar, legacy, paywallViewModel, Template2$lambda$5$lambda$4$lambda$1(k1Var), eVar2, lVarP, ((i10 << 3) & 896) | 70 | (57344 & (i10 << 6)));
            boolean zTemplate2$lambda$5$lambda$4$lambda$1 = Template2$lambda$5$lambda$4$lambda$1(k1Var);
            UIConstant uIConstant = UIConstant.INSTANCE;
            b0.d.d(iVar, zTemplate2$lambda$5$lambda$4$lambda$1, null, androidx.compose.animation.f.m(uIConstant.defaultAnimation(), 0.0f, 2, null), androidx.compose.animation.f.o(uIConstant.defaultAnimation(), 0.0f, 2, null), "Template2.packageSpacing", ComposableSingletons$Template2Kt.INSTANCE.m249getLambda1$revenuecatui_defaultsRelease(), lVarP, 1769478, 2);
            PurchaseButtonKt.m185PurchaseButtonhGBTI10(legacy, paywallViewModel, eVar2, 0.0f, null, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 896), 24);
        }
        lVarP.K();
        TemplateConfiguration templateConfiguration = legacy.getTemplateConfiguration();
        lVarP.e(1157296644);
        boolean zN = lVarP.N(k1Var);
        Object objF2 = lVarP.f();
        if (zN || objF2 == aVar4.a()) {
            objF2 = new Template2Kt$Template2$1$1$1$1(k1Var);
            lVarP.E(objF2);
        }
        lVarP.K();
        FooterKt.Footer(templateConfiguration, paywallViewModel, eVar2, null, (a) objF2, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8 | (i10 & 896), 8);
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07002(legacy, paywallViewModel, eVar2, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Template2$lambda$5$lambda$4$lambda$1(k1<Boolean> k1Var) {
        return k1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template2$lambda$5$lambda$4$lambda$2(k1<Boolean> k1Var, boolean z10) {
        k1Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template2LandscapeContent(h0.h hVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, e eVar, l lVar, int i10) {
        l lVarP = lVar.p(1667751062);
        if (o.I()) {
            o.U(1667751062, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2LandscapeContent (Template2.kt:183)");
        }
        n0 n0VarC = m0.c(0, lVarP, 0, 1);
        n0 n0VarC2 = m0.c(0, lVarP, 0, 1);
        b.e eVarA = b.a.f11603a.a();
        b.a aVar = f1.b.f11020a;
        b.c cVarI = aVar.i();
        e.a aVar2 = e.f2662a;
        e eVarB = h0.h.b(hVar, aVar2, 1.0f, false, 2, null);
        UIConstant uIConstant = UIConstant.INSTANCE;
        e eVarJ = m.j(eVarB, uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m83getDefaultVerticalSpacingD9Ej5fM());
        lVarP.e(693286680);
        e0 e0VarA = f0.a(eVarA, cVarI, lVarP, 54);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar3 = a2.g.J;
        a<a2.g> aVarA = aVar3.a();
        q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarJ);
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
        u3.b(lVarA, e0VarA, aVar3.e());
        u3.b(lVarA, wVarB, aVar3.g());
        p<a2.g, Integer, i0> pVarB = aVar3.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0 h0Var = h0.f11663a;
        e eVarC = g0.c(h0Var, m0.f(aVar2, n0VarC, false, null, false, 14, null), 0.5f, false, 2, null);
        b.InterfaceC0266b interfaceC0266bG = aVar.g();
        h0.b bVar = h0.b.f11594a;
        b.m mVarQ = bVar.q(uIConstant.m83getDefaultVerticalSpacingD9Ej5fM(), aVar.i());
        lVarP.e(-483455358);
        e0 e0VarA2 = h0.g.a(mVarQ, interfaceC0266bG, lVarP, 48);
        lVarP.e(-1323940314);
        int iA2 = i.a(lVarP, 0);
        w wVarB2 = lVarP.B();
        a<a2.g> aVarA2 = aVar3.a();
        q<q2<a2.g>, l, Integer, i0> qVarA2 = u.a(eVarC);
        if (!(lVarP.t() instanceof t0.e)) {
            i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA2);
        } else {
            lVarP.D();
        }
        l lVarA2 = u3.a(lVarP);
        u3.b(lVarA2, e0VarA2, aVar3.e());
        u3.b(lVarA2, wVarB2, aVar3.g());
        p<a2.g, Integer, i0> pVarB2 = aVar3.b();
        if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
            lVarA2.E(Integer.valueOf(iA2));
            lVarA2.Q(Integer.valueOf(iA2), pVarB2);
        }
        qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        h0.j0.a(h0.h.b(iVar, aVar2, 0.5f, false, 2, null), lVarP, 0);
        int i11 = ((i10 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8;
        IconImage(legacy, eVar, lVarP, i11);
        i.a aVar4 = u2.i.f21560b;
        m255Title8iNrtrE(legacy, eVar, aVar4.f(), lVarP, i11, 0);
        h0.j0.a(h0.h.b(iVar, aVar2, 0.5f, false, 2, null), lVarP, 0);
        m254Subtitle8iNrtrE(legacy, eVar, aVar4.f(), lVarP, i11, 0);
        h0.j0.a(h0.h.b(iVar, aVar2, 0.5f, false, 2, null), lVarP, 0);
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        e eVarC2 = g0.c(h0Var, m0.f(aVar2, n0VarC2, false, null, false, 14, null), 0.5f, false, 2, null);
        b.InterfaceC0266b interfaceC0266bG2 = aVar.g();
        b.m mVarQ2 = bVar.q(uIConstant.m83getDefaultVerticalSpacingD9Ej5fM(), aVar.i());
        lVarP.e(-483455358);
        e0 e0VarA3 = h0.g.a(mVarQ2, interfaceC0266bG2, lVarP, 48);
        lVarP.e(-1323940314);
        int iA3 = t0.i.a(lVarP, 0);
        w wVarB3 = lVarP.B();
        a<a2.g> aVarA3 = aVar3.a();
        q<q2<a2.g>, l, Integer, i0> qVarA3 = u.a(eVarC2);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA3);
        } else {
            lVarP.D();
        }
        l lVarA3 = u3.a(lVarP);
        u3.b(lVarA3, e0VarA3, aVar3.e());
        u3.b(lVarA3, wVarB3, aVar3.g());
        p<a2.g, Integer, i0> pVarB3 = aVar3.b();
        if (lVarA3.l() || !r.b(lVarA3.f(), Integer.valueOf(iA3))) {
            lVarA3.E(Integer.valueOf(iA3));
            lVarA3.Q(Integer.valueOf(iA3), pVarB3);
        }
        qVarA3.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.j0.a(h0.h.b(iVar, aVar2, 0.5f, false, 2, null), lVarP, 0);
        int i12 = i10 >> 6;
        AnimatedPackages(legacy, z10, true, paywallViewModel, eVar, lVarP, (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392 | ((i10 << 3) & 7168) | (57344 & i10));
        h0.j0.a(h0.h.b(iVar, aVar2, 0.5f, false, 2, null), lVarP, 0);
        PurchaseButtonKt.m185PurchaseButtonhGBTI10(legacy, paywallViewModel, eVar, h.m(0), null, lVarP, ((i10 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3080 | (i12 & 896), 16);
        h0.j0.a(h0.h.b(iVar, aVar2, 0.5f, false, 2, null), lVarP, 0);
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07012(hVar, legacy, paywallViewModel, z10, eVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template2PaywallFooterCondensedPreview(l lVar, int i10) {
        l lVarP = lVar.p(-741508648);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-741508648, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2PaywallFooterCondensedPreview (Template2.kt:463)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C07021.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate2Offering(), false, false, 12, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07032(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template2PaywallFooterPreview(l lVar, int i10) {
        l lVarP = lVar.p(1374736823);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1374736823, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2PaywallFooterPreview (Template2.kt:453)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C07041.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate2Offering(), false, false, 12, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07052(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template2PaywallPreview(l lVar, int i10) {
        l lVarP = lVar.p(44645436);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(44645436, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2PaywallPreview (Template2.kt:443)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C07061.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate2Offering(), false, false, 13, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07072(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template2PortraitContent(h0.h hVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, e eVar, l lVar, int i10) {
        l lVarP = lVar.p(75198122);
        if (o.I()) {
            o.U(75198122, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2PortraitContent (Template2.kt:133)");
        }
        e.a aVar = e.f2662a;
        UIConstant uIConstant = UIConstant.INSTANCE;
        h0.j0.a(androidx.compose.foundation.layout.p.h(aVar, uIConstant.m83getDefaultVerticalSpacingD9Ej5fM()), lVarP, 0);
        n0 n0VarC = m0.c(0, lVarP, 0, 1);
        boolean zIsInFullScreenMode = PaywallStateKt.isInFullScreenMode(legacy);
        lVarP.e(511388516);
        boolean zN = lVarP.N(hVar) | lVarP.N(n0VarC);
        Object objF = lVarP.f();
        if (zN || objF == l.f20813a.a()) {
            objF = new Template2Kt$Template2PortraitContent$1$1(hVar, n0VarC);
            lVarP.E(objF);
        }
        lVarP.K();
        e eVarJ = m.j(ModifierExtensionsKt.conditional(aVar, zIsInFullScreenMode, (zd.l) objF), uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m83getDefaultVerticalSpacingD9Ej5fM());
        b.a aVar2 = f1.b.f11020a;
        b.InterfaceC0266b interfaceC0266bG = aVar2.g();
        b.m mVarQ = h0.b.f11594a.q(uIConstant.m83getDefaultVerticalSpacingD9Ej5fM(), aVar2.i());
        lVarP.e(-483455358);
        e0 e0VarA = h0.g.a(mVarQ, interfaceC0266bG, lVarP, 48);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar3 = a2.g.J;
        a<a2.g> aVarA = aVar3.a();
        q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarJ);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA);
        } else {
            lVarP.D();
        }
        l lVarA = u3.a(lVarP);
        u3.b(lVarA, e0VarA, aVar3.e());
        u3.b(lVarA, wVarB, aVar3.g());
        p<a2.g, Integer, i0> pVarB = aVar3.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        lVarP.e(-1436960657);
        if (PaywallStateKt.isInFullScreenMode(legacy)) {
            h0.j0.a(h0.h.b(iVar, aVar, 1.0f, false, 2, null), lVarP, 0);
            int i11 = ((i10 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8;
            IconImage(legacy, eVar, lVarP, i11);
            m255Title8iNrtrE(legacy, eVar, 0, lVarP, i11, 4);
            h0.j0.a(h0.h.b(iVar, aVar, 1.0f, false, 2, null), lVarP, 0);
            m254Subtitle8iNrtrE(legacy, eVar, 0, lVarP, i11, 4);
            h0.j0.a(h0.h.b(iVar, aVar, 1.0f, false, 2, null), lVarP, 0);
        }
        lVarP.K();
        AnimatedPackages(legacy, z10, false, paywallViewModel, eVar, lVarP, ((i10 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 392 | ((i10 << 3) & 7168) | (57344 & i10));
        lVarP.e(-1124236751);
        if (PaywallStateKt.isInFullScreenMode(legacy)) {
            h0.j0.a(h0.h.b(iVar, aVar, 1.0f, false, 2, null), lVarP, 0);
        }
        lVarP.K();
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07083(hVar, legacy, paywallViewModel, z10, eVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Title-8iNrtrE, reason: not valid java name */
    public static final void m255Title8iNrtrE(PaywallState.Loaded.Legacy legacy, e eVar, int i10, l lVar, int i11, int i12) {
        int iA;
        int i13;
        l lVarP = lVar.p(1979998300);
        if ((i12 & 4) != 0) {
            iA = u2.i.f21560b.a();
            i13 = i11 & (-897);
        } else {
            iA = i10;
            i13 = i11;
        }
        if (o.I()) {
            o.U(1979998300, i13, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Title (Template2.kt:259)");
        }
        i2.g0 g0VarG = y.f18928a.c(lVarP, y.f18929b | 0).g();
        n2.i0 i0VarA = n2.i0.f15808b.a();
        MarkdownKt.m163MarkdownSXj7GJg(PaywallStateKt.getSelectedLocalization(legacy).getTitle(), eVar, legacy.getTemplateConfiguration().getCurrentColors(lVarP, 8).m227getText10d7_KjU(), g0VarG, 0L, i0VarA, null, null, u2.i.h(iA), false, true, lVarP, ((i13 << 18) & 234881024) | (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 196608, 6, 720);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new Template2Kt$Title$1(legacy, eVar, iA, i11, i12));
    }
}
