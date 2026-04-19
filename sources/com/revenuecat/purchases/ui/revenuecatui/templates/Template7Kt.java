package com.revenuecat.purchases.ui.revenuecatui.templates;

import a2.g;
import ae.r;
import ae.s;
import android.net.Uri;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.k;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import b0.b;
import b1.c;
import c0.j;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.TierSwitcherKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.AnimationsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import d0.m0;
import d0.n0;
import f1.b;
import g2.x;
import h0.b;
import h0.f0;
import h0.g;
import h0.g0;
import h0.h0;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import je.v;
import l1.j0;
import md.i0;
import n2.i0;
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
public final class Template7Kt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$AnimatedPackages$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ List<TemplateConfiguration.PackageInfo> $packages;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, List<TemplateConfiguration.PackageInfo> list, TemplateConfiguration.Colors colors, int i10, int i11) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z10;
            this.$packages = list;
            this.$colors = colors;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.AnimatedPackages(this.$state, this.$viewModel, this.$packageSelectionVisible, this.$packages, this.$colors, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$CheckmarkBox$2, reason: invalid class name and case insensitive filesystem */
    static final class C07492 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07492(boolean z10, TemplateConfiguration.Colors colors, int i10) {
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
            Template7Kt.CheckmarkBox(this.$isSelected, this.$colors, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$DiscountBanner$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ g0 $this_DiscountBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(g0 g0Var, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$this_DiscountBanner = g0Var;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, this.$colors, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$DiscountBanner$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ g0 $this_DiscountBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(g0 g0Var, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$this_DiscountBanner = g0Var;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, this.$colors, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Feature$1, reason: invalid class name and case insensitive filesystem */
    static final class C07501 extends s implements zd.l<x, i0> {
        public static final C07501 INSTANCE = new C07501();

        C07501() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(x xVar) {
            invoke2(xVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(x xVar) {
            r.f(xVar, "$this$semantics");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Feature$3, reason: invalid class name and case insensitive filesystem */
    static final class C07513 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ PaywallData.LocalizedConfiguration.Feature $feature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07513(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$feature = feature;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.Feature(this.$feature, this.$colors, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Features$1, reason: invalid class name and case insensitive filesystem */
    static final class C07521 extends s implements zd.r<b, ProcessedLocalizedConfiguration, l, Integer, i0> {
        final /* synthetic */ TemplateConfiguration.Colors $colorForTier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07521(TemplateConfiguration.Colors colors) {
            super(4);
            this.$colorForTier = colors;
        }

        @Override // zd.r
        public /* bridge */ /* synthetic */ i0 invoke(b bVar, ProcessedLocalizedConfiguration processedLocalizedConfiguration, l lVar, Integer num) {
            invoke(bVar, processedLocalizedConfiguration, lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(b bVar, ProcessedLocalizedConfiguration processedLocalizedConfiguration, l lVar, int i10) {
            r.f(bVar, "$this$AnimatedContent");
            r.f(processedLocalizedConfiguration, "it");
            if (o.I()) {
                o.U(-1011395967, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Features.<anonymous> (Template7.kt:371)");
            }
            b.a aVar = f1.b.f11020a;
            b.InterfaceC0266b interfaceC0266bG = aVar.g();
            b.m mVarQ = h0.b.f11594a.q(UIConstant.INSTANCE.m83getDefaultVerticalSpacingD9Ej5fM(), aVar.i());
            TemplateConfiguration.Colors colors = this.$colorForTier;
            lVar.e(-483455358);
            e.a aVar2 = e.f2662a;
            e0 e0VarA = g.a(mVarQ, interfaceC0266bG, lVar, 48);
            lVar.e(-1323940314);
            int iA = i.a(lVar, 0);
            w wVarB = lVar.B();
            g.a aVar3 = a2.g.J;
            a<a2.g> aVarA = aVar3.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(aVar2);
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
            lVar.e(-1026809313);
            Iterator<T> it = processedLocalizedConfiguration.getFeatures().iterator();
            while (it.hasNext()) {
                Template7Kt.Feature((PaywallData.LocalizedConfiguration.Feature) it.next(), colors, lVar, 8);
            }
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Features$2, reason: invalid class name and case insensitive filesystem */
    static final class C07532 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07532(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, int i10) {
            super(2);
            this.$state = legacy;
            this.$selectedTier = tierInfo;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.Features(this.$state, this.$selectedTier, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$HeaderImage$2, reason: invalid class name and case insensitive filesystem */
    static final class C07542 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07542(Uri uri, int i10) {
            super(2);
            this.$uri = uri;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.HeaderImage(this.$uri, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$SelectPackageButton$2, reason: invalid class name and case insensitive filesystem */
    static final class C07552 extends s implements a<i0> {
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07552(PaywallViewModel paywallViewModel, TemplateConfiguration.PackageInfo packageInfo) {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$SelectPackageButton$3, reason: invalid class name and case insensitive filesystem */
    static final class C07563 extends s implements q<g0, l, Integer, i0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ long $textColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07563(TemplateConfiguration.PackageInfo packageInfo, long j10, boolean z10, TemplateConfiguration.Colors colors, int i10, PaywallState.Loaded.Legacy legacy) {
            super(3);
            this.$packageInfo = packageInfo;
            this.$textColor = j10;
            this.$isSelected = z10;
            this.$colors = colors;
            this.$$dirty = i10;
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
                o.U(-731847976, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton.<anonymous> (Template7.kt:523)");
            }
            e.a aVar = e.f2662a;
            e eVarG = androidx.compose.foundation.layout.p.g(aVar, 0.0f, 1, null);
            h0.b bVar = h0.b.f11594a;
            b.f fVarO = bVar.o(h.m(4));
            b.a aVar2 = f1.b.f11020a;
            b.InterfaceC0266b interfaceC0266bK = aVar2.k();
            TemplateConfiguration.PackageInfo packageInfo = this.$packageInfo;
            long j10 = this.$textColor;
            boolean z10 = this.$isSelected;
            TemplateConfiguration.Colors colors = this.$colors;
            int i11 = this.$$dirty;
            PaywallState.Loaded.Legacy legacy = this.$state;
            lVar.e(-483455358);
            e0 e0VarA = h0.g.a(fVarO, interfaceC0266bK, lVar, 54);
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
            Template7Kt.CheckmarkBox(z10, colors, lVar, (i11 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            String offerName = packageInfo.getLocalization().getOfferName();
            if (offerName == null) {
                offerName = packageInfo.getRcPackage().getProduct().getTitle();
            }
            y yVar = y.f18928a;
            int i12 = y.f18929b;
            q0.b(offerName, h0Var.a(aVar, 1.0f, true), j10, 0L, null, n2.i0.f15808b.h(), null, 0L, null, null, 0L, 0, false, 0, 0, null, yVar.c(lVar, i12 | 0).b(), lVar, 196608, 0, 65496);
            Template7Kt.DiscountBanner(h0Var, legacy, packageInfo, colors, lVar, 582 | ((i11 >> 3) & 7168));
            lVar.K();
            lVar.L();
            lVar.K();
            lVar.K();
            IntroEligibilityStateViewKt.m154IntroEligibilityStateViewQETHhvg(packageInfo.getLocalization().getOfferDetails(), packageInfo.getLocalization().getOfferDetailsWithIntroOffer(), packageInfo.getLocalization().getOfferDetailsWithMultipleIntroOffers(), PackageExtensionsKt.getIntroEligibility(packageInfo), j10, yVar.c(lVar, i12 | 0).c(), null, null, false, null, lVar, 100663296, 704);
            lVar.K();
            lVar.L();
            lVar.K();
            lVar.K();
            if (o.I()) {
                o.T();
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$SelectPackageButton$4, reason: invalid class name */
    static final class AnonymousClass4 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ h0.h $this_SelectPackageButton;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(h0.h hVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$this_SelectPackageButton = hVar;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$viewModel = paywallViewModel;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.SelectPackageButton(this.$this_SelectPackageButton, this.$state, this.$packageInfo, this.$viewModel, this.$colors, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7$3, reason: invalid class name and case insensitive filesystem */
    static final class C07573 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07573(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.Template7(this.$state, this.$viewModel, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7LandscapeContent$2, reason: invalid class name and case insensitive filesystem */
    static final class C07582 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ zd.l<TemplateConfiguration.TierInfo, i0> $onSelectTierChange;
        final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ h0.h $this_Template7LandscapeContent;
        final /* synthetic */ List<TemplateConfiguration.TierInfo> $tiers;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C07582(h0.h hVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, List<TemplateConfiguration.TierInfo> list, TemplateConfiguration.TierInfo tierInfo, zd.l<? super TemplateConfiguration.TierInfo, i0> lVar, int i10) {
            super(2);
            this.$this_Template7LandscapeContent = hVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$tiers = list;
            this.$selectedTier = tierInfo;
            this.$onSelectTierChange = lVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.Template7LandscapeContent(this.$this_Template7LandscapeContent, this.$state, this.$viewModel, this.$tiers, this.$selectedTier, this.$onSelectTierChange, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PaywallFooterCondensedPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C07591 extends s implements a<i0> {
        public static final C07591 INSTANCE = new C07591();

        C07591() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PaywallFooterCondensedPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C07602 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07602(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.Template7PaywallFooterCondensedPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PaywallFooterPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C07611 extends s implements a<i0> {
        public static final C07611 INSTANCE = new C07611();

        C07611() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PaywallFooterPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C07622 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07622(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.Template7PaywallFooterPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C07631 extends s implements a<i0> {
        public static final C07631 INSTANCE = new C07631();

        C07631() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C07642 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07642(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.Template7PaywallPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Template7PortraitContent$3, reason: invalid class name and case insensitive filesystem */
    static final class C07653 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ zd.l<TemplateConfiguration.TierInfo, i0> $onSelectTierChange;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ h0.h $this_Template7PortraitContent;
        final /* synthetic */ List<TemplateConfiguration.TierInfo> $tiers;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C07653(h0.h hVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, List<TemplateConfiguration.TierInfo> list, TemplateConfiguration.TierInfo tierInfo, zd.l<? super TemplateConfiguration.TierInfo, i0> lVar, int i10) {
            super(2);
            this.$this_Template7PortraitContent = hVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z10;
            this.$tiers = list;
            this.$selectedTier = tierInfo;
            this.$onSelectTierChange = lVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.Template7PortraitContent(this.$this_Template7PortraitContent, this.$state, this.$viewModel, this.$packageSelectionVisible, this.$tiers, this.$selectedTier, this.$onSelectTierChange, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt$Title$1, reason: invalid class name and case insensitive filesystem */
    static final class C07661 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ h0.h $this_Title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07661(h0.h hVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, int i10) {
            super(2);
            this.$this_Title = hVar;
            this.$state = legacy;
            this.$selectedTier = tierInfo;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template7Kt.Title(this.$this_Title, this.$state, this.$selectedTier, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnimatedPackages(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z10, List<TemplateConfiguration.PackageInfo> list, TemplateConfiguration.Colors colors, l lVar, int i10, int i11) {
        l lVarP = lVar.p(1691421480);
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        if (o.I()) {
            o.U(1691421480, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.AnimatedPackages (Template7.kt:441)");
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
        b0.d.e(!z11, null, androidx.compose.animation.f.m(j.i(0, 200, null, 5, null), 0.0f, 2, null), androidx.compose.animation.f.o(j.i(0, 200, null, 5, null), 0.0f, 2, null), "OfferDetailsVisibility", c.b(lVarP, -136603126, true, new Template7Kt$AnimatedPackages$1$1(legacy, colors, i10)), lVarP, 224640, 2);
        b.a aVar3 = f1.b.f11020a;
        b0.d.e(z11, null, androidx.compose.animation.f.k(null, aVar3.a(), false, null, 13, null), androidx.compose.animation.f.u(null, aVar3.a(), false, null, 13, null), "SelectPackagesVisibility", c.b(lVarP, 469640179, true, new Template7Kt$AnimatedPackages$1$2(list, legacy, paywallViewModel, colors, i10)), lVarP, ((i10 >> 6) & 14) | 224640, 2);
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
        o2VarV.a(new AnonymousClass2(legacy, paywallViewModel, z11, list, colors, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CheckmarkBox(boolean z10, TemplateConfiguration.Colors colors, l lVar, int i10) {
        int i11;
        l lVarP = lVar.p(1250968455);
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
                o.U(1250968455, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CheckmarkBox (Template7.kt:561)");
            }
            e eVarD = androidx.compose.foundation.c.d(i1.g.a(androidx.compose.foundation.layout.p.o(e.f2662a, Template7UIConstants.INSTANCE.m280getCheckmarkSizeD9Ej5fM()), l0.g.f()), z10 ? colors.m222getBackground0d7_KjU() : getUnselectedOutline(colors), null, 2, null);
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
            lVarP.e(-745260612);
            if (z10) {
                PaywallIconKt.m179PaywallIconFNF3uiM(PaywallIconName.CHECK_CIRCLE, null, getSelectedOutline(colors), lVarP, 6, 2);
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
        o2VarV.a(new C07492(z10, colors, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DiscountBanner(g0 g0Var, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, l lVar, int i10) {
        l lVarP = lVar.p(148348005);
        if (o.I()) {
            o.U(148348005, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.DiscountBanner (Template7.kt:578)");
        }
        String offerBadge = packageInfo.getLocalization().getOfferBadge();
        if (offerBadge != null) {
            String upperCase = offerBadge.toUpperCase(Locale.ROOT);
            r.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (upperCase != null) {
                if (v.v(upperCase)) {
                    if (o.I()) {
                        o.T();
                    }
                    o2 o2VarV = lVarP.v();
                    if (o2VarV == null) {
                        return;
                    }
                    o2VarV.a(new AnonymousClass1(g0Var, legacy, packageInfo, colors, i10));
                    return;
                }
                long jM243packageButtonColorAnimation9z6LAg8 = AnimationsKt.m243packageButtonColorAnimation9z6LAg8(legacy, packageInfo, getSelectedOutline(colors), getUnselectedOutline(colors), lVarP, 72);
                long jM243packageButtonColorAnimation9z6LAg82 = AnimationsKt.m243packageButtonColorAnimation9z6LAg8(legacy, packageInfo, getSelectedDiscountText(colors), getUnselectedDiscountText(colors), lVarP, 72);
                e.a aVar = e.f2662a;
                b.a aVar2 = f1.b.f11020a;
                e eVarB = g0Var.b(aVar, aVar2.l());
                UIConstant uIConstant = UIConstant.INSTANCE;
                float fM80getDefaultHorizontalPaddingD9Ej5fM = uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM();
                Template7UIConstants template7UIConstants = Template7UIConstants.INSTANCE;
                e eVarA = k.a(eVarB, h.m(fM80getDefaultHorizontalPaddingD9Ej5fM - template7UIConstants.m281getDiscountPaddingD9Ej5fM()), h.m(h.m(-uIConstant.m83getDefaultVerticalSpacingD9Ej5fM()) + template7UIConstants.m281getDiscountPaddingD9Ej5fM()));
                lVarP.e(733328855);
                e0 e0VarG = d.g(aVar2.o(), false, lVarP, 0);
                lVarP.e(-1323940314);
                int iA = i.a(lVarP, 0);
                w wVarB = lVarP.B();
                g.a aVar3 = a2.g.J;
                a<a2.g> aVarA = aVar3.a();
                q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarA);
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
                f fVar = f.f2502a;
                e eVarK = m.k(m.k(androidx.compose.foundation.c.c(aVar, jM243packageButtonColorAnimation9z6LAg8, q0.e.f18552a.i(lVarP, q0.e.f18566o | 0)), 0.0f, h.m(4), 1, null), h.m(8), 0.0f, 2, null);
                lVarP.e(733328855);
                e0 e0VarG2 = d.g(aVar2.o(), false, lVarP, 0);
                lVarP.e(-1323940314);
                int iA2 = i.a(lVarP, 0);
                w wVarB2 = lVarP.B();
                a<a2.g> aVarA2 = aVar3.a();
                q<q2<a2.g>, l, Integer, i0> qVarA2 = u.a(eVarK);
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
                u3.b(lVarA2, e0VarG2, aVar3.e());
                u3.b(lVarA2, wVarB2, aVar3.g());
                p<a2.g, Integer, i0> pVarB2 = aVar3.b();
                if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
                    lVarA2.E(Integer.valueOf(iA2));
                    lVarA2.Q(Integer.valueOf(iA2), pVarB2);
                }
                qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
                lVarP.e(2058660585);
                q0.b(upperCase, null, jM243packageButtonColorAnimation9z6LAg82, 0L, null, n2.i0.f15808b.g(), null, 0L, null, null, 0L, 0, false, 0, 0, null, y.f18928a.c(lVarP, y.f18929b | 0).m(), lVarP, 196608, 0, 65498);
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
                o2 o2VarV2 = lVarP.v();
                if (o2VarV2 == null) {
                    return;
                }
                o2VarV2.a(new AnonymousClass3(g0Var, legacy, packageInfo, colors, i10));
                return;
            }
        }
        if (o.I()) {
            o.T();
        }
        o2 o2VarV3 = lVarP.v();
        if (o2VarV3 == null) {
            return;
        }
        o2VarV3.a(new Template7Kt$DiscountBanner$text$1(g0Var, legacy, packageInfo, colors, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Feature(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(-840416555);
        if (o.I()) {
            o.U(-840416555, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Feature (Template7.kt:390)");
        }
        b.a aVar = f1.b.f11020a;
        b.c cVarI = aVar.i();
        e.a aVar2 = e.f2662a;
        e eVarC = g2.o.c(androidx.compose.foundation.layout.p.g(aVar2, 0.0f, 1, null), true, C07501.INSTANCE);
        lVarP.e(693286680);
        h0.b bVar = h0.b.f11594a;
        e0 e0VarA = f0.a(bVar.g(), cVarI, lVarP, 48);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar3 = a2.g.J;
        a<a2.g> aVarA = aVar3.a();
        q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarC);
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
        e eVarO = androidx.compose.foundation.layout.p.o(aVar2, Template7UIConstants.INSTANCE.m282getFeatureIconSizeD9Ej5fM());
        lVarP.e(733328855);
        e0 e0VarG = d.g(aVar.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA2 = i.a(lVarP, 0);
        w wVarB2 = lVarP.B();
        a<a2.g> aVarA2 = aVar3.a();
        q<q2<a2.g>, l, Integer, i0> qVarA2 = u.a(eVarO);
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
        u3.b(lVarA2, e0VarG, aVar3.e());
        u3.b(lVarA2, wVarB2, aVar3.g());
        p<a2.g, Integer, i0> pVarB2 = aVar3.b();
        if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
            lVarA2.E(Integer.valueOf(iA2));
            lVarA2.Q(Integer.valueOf(iA2), pVarB2);
        }
        qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        String iconID = feature.getIconID();
        PaywallIconName paywallIconNameFromValue = iconID != null ? PaywallIconName.Companion.fromValue(iconID) : null;
        lVarP.e(-696449203);
        if (paywallIconNameFromValue != null) {
            PaywallIconKt.m179PaywallIconFNF3uiM(paywallIconNameFromValue, null, getFeatureIcon(colors), lVarP, 0, 2);
            i0 i0Var = i0.f15558a;
        }
        lVarP.K();
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        e eVarM = m.m(aVar2, UIConstant.INSTANCE.m80getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
        lVarP.e(-483455358);
        e0 e0VarA2 = h0.g.a(bVar.h(), aVar.k(), lVarP, 0);
        lVarP.e(-1323940314);
        int iA3 = i.a(lVarP, 0);
        w wVarB3 = lVarP.B();
        a<a2.g> aVarA3 = aVar3.a();
        q<q2<a2.g>, l, Integer, i0> qVarA3 = u.a(eVarM);
        if (!(lVarP.t() instanceof t0.e)) {
            i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA3);
        } else {
            lVarP.D();
        }
        l lVarA3 = u3.a(lVarP);
        u3.b(lVarA3, e0VarA2, aVar3.e());
        u3.b(lVarA3, wVarB3, aVar3.g());
        p<a2.g, Integer, i0> pVarB3 = aVar3.b();
        if (lVarA3.l() || !r.b(lVarA3.f(), Integer.valueOf(iA3))) {
            lVarA3.E(Integer.valueOf(iA3));
            lVarA3.Q(Integer.valueOf(iA3), pVarB3);
        }
        qVarA3.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        y yVar = y.f18928a;
        int i11 = y.f18929b;
        i2.g0 g0VarB = yVar.c(lVarP, i11 | 0).b();
        i0.a aVar4 = n2.i0.f15808b;
        n2.i0 i0VarG = aVar4.g();
        i.a aVar5 = u2.i.f21560b;
        MarkdownKt.m163MarkdownSXj7GJg(feature.getTitle(), null, colors.m227getText10d7_KjU(), g0VarB, 0L, i0VarG, null, null, u2.i.h(aVar5.f()), false, true, lVarP, 196608, 6, 722);
        String content = feature.getContent();
        lVarP.e(-696448546);
        if (content == null) {
            lVar2 = lVarP;
        } else {
            i2.g0 g0VarC = yVar.c(lVarP, i11 | 0).c();
            n2.i0 i0VarG2 = aVar4.g();
            int iF = aVar5.f();
            long jM228getText20d7_KjU = colors.m228getText20d7_KjU();
            u2.i iVarH = u2.i.h(iF);
            lVar2 = lVarP;
            MarkdownKt.m163MarkdownSXj7GJg(content, null, jM228getText20d7_KjU, g0VarC, 0L, i0VarG2, null, null, iVarH, false, true, lVarP, 196608, 6, 722);
            md.i0 i0Var2 = md.i0.f15558a;
        }
        lVar2.K();
        lVar2.K();
        lVar2.L();
        lVar2.K();
        lVar2.K();
        lVar2.K();
        lVar2.L();
        lVar2.K();
        lVar2.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07513(feature, colors, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Features(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, l lVar, int i10) {
        l lVarP = lVar.p(571837189);
        if (o.I()) {
            o.U(571837189, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Features (Template7.kt:360)");
        }
        androidx.compose.animation.a.b(selectedLocalizationForTier(tierInfo), null, null, null, "features portrait", null, c.b(lVarP, -1011395967, true, new C07521(legacy.getTemplateConfiguration().getCurrentColorsForTier(tierInfo, lVarP, 72))), lVarP, 1597448, 46);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07532(legacy, tierInfo, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HeaderImage(Uri uri, l lVar, int i10) {
        l lVarP = lVar.p(108999699);
        if (o.I()) {
            o.U(108999699, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.HeaderImage (Template7.kt:324)");
        }
        if (uri != null) {
            String string = uri.toString();
            r.e(string, "uri.toString()");
            RemoteImageKt.RemoteImage(string, androidx.compose.foundation.layout.a.b(e.f2662a, 2.0f, false, 2, null), null, y1.f.f23237a.a(), null, null, 0.0f, lVarP, 3120, R.styleable.AppCompatTheme_viewInflaterClass);
        }
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07542(uri, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectPackageButton(h0.h hVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, TemplateConfiguration.Colors colors, l lVar, int i10) {
        l lVarP = lVar.p(-235261752);
        if (o.I()) {
            o.U(-235261752, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton (Template7.kt:488)");
        }
        boolean zB = r.b(packageInfo, legacy.getSelectedPackage().getValue());
        float fPackageButtonActionInProgressOpacityAnimation = AnimationsKt.packageButtonActionInProgressOpacityAnimation(paywallViewModel, lVarP, (i10 >> 9) & 14);
        long jM227getText10d7_KjU = colors.m227getText10d7_KjU();
        long jM243packageButtonColorAnimation9z6LAg8 = AnimationsKt.m243packageButtonColorAnimation9z6LAg8(legacy, packageInfo, getSelectedOutline(colors), getUnselectedOutline(colors), lVarP, 72);
        e eVarC = hVar.c(i1.a.a(androidx.compose.foundation.layout.p.g(e.f2662a, 0.0f, 1, null), fPackageButtonActionInProgressOpacityAnimation), f1.b.f11020a.k());
        Boolean boolValueOf = Boolean.valueOf(zB);
        lVarP.e(1157296644);
        boolean zN = lVarP.N(boolValueOf);
        Object objF = lVarP.f();
        if (zN || objF == l.f20813a.a()) {
            objF = new Template7Kt$SelectPackageButton$1$1(zB);
            lVarP.E(objF);
        }
        lVarP.K();
        e eVarD = g2.o.d(eVarC, false, (zd.l) objF, 1, null);
        q0.d dVarB = q0.e.f18552a.b(j0.f14524b.i(), jM227getText10d7_KjU, 0L, 0L, lVarP, ((q0.e.f18566o | 0) << 12) | 6, 12);
        UIConstant uIConstant = UIConstant.INSTANCE;
        l0.f fVarC = l0.g.c(uIConstant.m82getDefaultPackageCornerRadiusD9Ej5fM());
        h0.y yVarB = m.b(uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m83getDefaultVerticalSpacingD9Ej5fM());
        q0.g.a(new C07552(paywallViewModel, packageInfo), eVarD, false, fVarC, dVarB, null, d0.j.a(uIConstant.m81getDefaultPackageBorderWidthD9Ej5fM(), jM243packageButtonColorAnimation9z6LAg8), yVarB, null, c.b(lVarP, -731847976, true, new C07563(packageInfo, jM227getText10d7_KjU, zB, colors, i10, legacy)), lVarP, 805306368, 292);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass4(hVar, legacy, packageInfo, paywallViewModel, colors, i10));
    }

    public static final void Template7(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, l lVar, int i10) {
        r.f(legacy, "state");
        r.f(paywallViewModel, "viewModel");
        l lVarP = lVar.p(-305592021);
        if (o.I()) {
            o.U(-305592021, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7 (Template7.kt:92)");
        }
        TemplateConfiguration.PackageConfiguration packages = legacy.getTemplateConfiguration().getPackages();
        if (!(packages instanceof TemplateConfiguration.PackageConfiguration.MultiTier)) {
            throw new IllegalArgumentException("The configuration is not MultiTier".toString());
        }
        TemplateConfiguration.PackageConfiguration.MultiTier multiTier = (TemplateConfiguration.PackageConfiguration.MultiTier) packages;
        TemplateConfiguration.TierInfo defaultTier = multiTier.getDefaultTier();
        List<TemplateConfiguration.TierInfo> allTiers = multiTier.getAllTiers();
        lVarP.e(-492369756);
        Object objF = lVarP.f();
        l.a aVar = l.f20813a;
        if (objF == aVar.a()) {
            objF = k3.e(Boolean.valueOf(legacy.getTemplateConfiguration().getMode() != PaywallMode.FOOTER_CONDENSED), null, 2, null);
            lVarP.E(objF);
        }
        lVarP.K();
        k1 k1Var = (k1) objF;
        lVarP.e(-492369756);
        Object objF2 = lVarP.f();
        if (objF2 == aVar.a()) {
            objF2 = k3.e(defaultTier, null, 2, null);
            lVarP.E(objF2);
        }
        lVarP.K();
        k1 k1Var2 = (k1) objF2;
        TemplateConfiguration.Colors currentColorsForTier = legacy.getTemplateConfiguration().getCurrentColorsForTier(Template7$lambda$5(k1Var2), lVarP, 72);
        e eVarD = androidx.compose.foundation.c.d(e.f2662a, currentColorsForTier.m222getBackground0d7_KjU(), null, 2, null);
        lVarP.e(-483455358);
        e0 e0VarA = h0.g.a(h0.b.f11594a.h(), f1.b.f11020a.k(), lVarP, 0);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar2 = a2.g.J;
        a<a2.g> aVarA = aVar2.a();
        q<q2<a2.g>, l, Integer, md.i0> qVarA = u.a(eVarD);
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
        u3.b(lVarA, e0VarA, aVar2.e());
        u3.b(lVarA, wVarB, aVar2.g());
        p<a2.g, Integer, md.i0> pVarB = aVar2.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        if (WindowHelperKt.shouldUseLandscapeLayout(legacy, lVarP, 8)) {
            lVarP.e(2042989795);
            Template7LandscapeContent(iVar, legacy, paywallViewModel, allTiers, Template7$lambda$5(k1Var2), new Template7Kt$Template7$2$1(legacy, k1Var2), lVarP, 36934 | ((i10 << 3) & 896));
            lVarP.K();
        } else {
            lVarP.e(2042990086);
            Template7PortraitContent(iVar, legacy, paywallViewModel, Template7$lambda$2(k1Var), allTiers, Template7$lambda$5(k1Var2), new Template7Kt$Template7$2$2(legacy, k1Var2), lVarP, 294982 | ((i10 << 3) & 896));
            lVarP.K();
        }
        int i11 = (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8;
        PurchaseButtonKt.m185PurchaseButtonhGBTI10(legacy, paywallViewModel, null, 0.0f, currentColorsForTier, lVarP, i11, 12);
        TemplateConfiguration templateConfiguration = legacy.getTemplateConfiguration();
        lVarP.e(1157296644);
        boolean zN = lVarP.N(k1Var);
        Object objF3 = lVarP.f();
        if (zN || objF3 == aVar.a()) {
            objF3 = new Template7Kt$Template7$2$3$1(k1Var);
            lVarP.E(objF3);
        }
        lVarP.K();
        FooterKt.Footer(templateConfiguration, paywallViewModel, null, currentColorsForTier, (a) objF3, lVarP, i11, 4);
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
        o2VarV.a(new C07573(legacy, paywallViewModel, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Template7$lambda$2(k1<Boolean> k1Var) {
        return k1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template7$lambda$3(k1<Boolean> k1Var, boolean z10) {
        k1Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TemplateConfiguration.TierInfo Template7$lambda$5(k1<TemplateConfiguration.TierInfo> k1Var) {
        return k1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template7LandscapeContent(h0.h hVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, List<TemplateConfiguration.TierInfo> list, TemplateConfiguration.TierInfo tierInfo, zd.l<? super TemplateConfiguration.TierInfo, md.i0> lVar, l lVar2, int i10) {
        h0.i iVar;
        int i11;
        l lVarP = lVar2.p(2027062712);
        if (o.I()) {
            o.U(2027062712, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7LandscapeContent (Template7.kt:242)");
        }
        n0 n0VarC = m0.c(0, lVarP, 0, 1);
        n0 n0VarC2 = m0.c(0, lVarP, 0, 1);
        TemplateConfiguration.Colors currentColorsForTier = legacy.getTemplateConfiguration().getCurrentColorsForTier(tierInfo, lVarP, 72);
        b.e eVarA = b.a.f11603a.a();
        b.a aVar = f1.b.f11020a;
        b.c cVarI = aVar.i();
        e.a aVar2 = e.f2662a;
        e eVarB = h0.h.b(hVar, aVar2, 1.0f, false, 2, null);
        UIConstant uIConstant = UIConstant.INSTANCE;
        e eVarK = m.k(m.m(eVarB, 0.0f, uIConstant.m83getDefaultVerticalSpacingD9Ej5fM(), 0.0f, 0.0f, 13, null), uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
        lVarP.e(693286680);
        e0 e0VarA = f0.a(eVarA, cVarI, lVarP, 54);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar3 = a2.g.J;
        a<a2.g> aVarA = aVar3.a();
        q<q2<a2.g>, l, Integer, md.i0> qVarA = u.a(eVarK);
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
        p<a2.g, Integer, md.i0> pVarB = aVar3.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0 h0Var = h0.f11663a;
        e eVarJ = m.j(g0.c(h0Var, m0.f(aVar2, n0VarC, false, null, false, 14, null), 1.0f, false, 2, null), uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m83getDefaultVerticalSpacingD9Ej5fM());
        b.InterfaceC0266b interfaceC0266bG = aVar.g();
        h0.b bVar = h0.b.f11594a;
        b.m mVarQ = bVar.q(uIConstant.m83getDefaultVerticalSpacingD9Ej5fM(), aVar.i());
        lVarP.e(-483455358);
        e0 e0VarA2 = h0.g.a(mVarQ, interfaceC0266bG, lVarP, 48);
        lVarP.e(-1323940314);
        int iA2 = t0.i.a(lVarP, 0);
        w wVarB2 = lVarP.B();
        a<a2.g> aVarA2 = aVar3.a();
        q<q2<a2.g>, l, Integer, md.i0> qVarA2 = u.a(eVarJ);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
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
        p<a2.g, Integer, md.i0> pVarB2 = aVar3.b();
        if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
            lVarA2.E(Integer.valueOf(iA2));
            lVarA2.Q(Integer.valueOf(iA2), pVarB2);
        }
        qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar2 = h0.i.f11664a;
        h0.j0.a(h0.h.b(iVar2, aVar2, 0.5f, false, 2, null), lVarP, 0);
        Title(iVar2, legacy, tierInfo, lVarP, 582);
        h0.j0.a(h0.h.b(iVar2, aVar2, 0.5f, false, 2, null), lVarP, 0);
        Features(legacy, tierInfo, lVarP, 72);
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        e eVarJ2 = m.j(g0.c(h0Var, m0.f(aVar2, n0VarC2, false, null, false, 14, null), 1.0f, false, 2, null), uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m83getDefaultVerticalSpacingD9Ej5fM());
        b.InterfaceC0266b interfaceC0266bG2 = aVar.g();
        b.m mVarQ2 = bVar.q(uIConstant.m83getDefaultVerticalSpacingD9Ej5fM(), aVar.i());
        lVarP.e(-483455358);
        e0 e0VarA3 = h0.g.a(mVarQ2, interfaceC0266bG2, lVarP, 48);
        lVarP.e(-1323940314);
        int iA3 = t0.i.a(lVarP, 0);
        w wVarB3 = lVarP.B();
        a<a2.g> aVarA3 = aVar3.a();
        q<q2<a2.g>, l, Integer, md.i0> qVarA3 = u.a(eVarJ2);
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
        p<a2.g, Integer, md.i0> pVarB3 = aVar3.b();
        if (lVarA3.l() || !r.b(lVarA3.f(), Integer.valueOf(iA3))) {
            lVarA3.E(Integer.valueOf(iA3));
            lVarA3.Q(Integer.valueOf(iA3), pVarB3);
        }
        qVarA3.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.j0.a(h0.h.b(iVar2, aVar2, 0.5f, false, 2, null), lVarP, 0);
        lVarP.e(-264420531);
        if (list.size() > 1) {
            lVarP.e(1157296644);
            boolean zN = lVarP.N(lVar);
            Object objF = lVarP.f();
            if (zN || objF == l.f20813a.a()) {
                objF = new Template7Kt$Template7LandscapeContent$1$2$1$1(lVar);
                lVarP.E(objF);
            }
            lVarP.K();
            iVar = iVar2;
            TierSwitcherKt.m189TierSwitcherUFBoNtE(list, tierInfo, (zd.l) objF, getTierSwitcherBackground(currentColorsForTier), getTierSwitcherBackgroundSelected(currentColorsForTier), getTierSwitcherForeground(currentColorsForTier), getTierSwitcherForegroundSelected(currentColorsForTier), lVarP, 72);
            i11 = 0;
            h0.j0.a(h0.h.b(iVar, aVar2, 0.5f, false, 2, null), lVarP, 0);
        } else {
            iVar = iVar2;
            i11 = 0;
        }
        lVarP.K();
        AnimatedPackages(legacy, paywallViewModel, false, tierInfo.getPackages(), currentColorsForTier, lVarP, ((i10 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 4104, 4);
        h0.j0.a(h0.h.b(iVar, aVar2, 0.5f, false, 2, null), lVarP, i11);
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
        o2VarV.a(new C07582(hVar, legacy, paywallViewModel, list, tierInfo, lVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template7PaywallFooterCondensedPreview(l lVar, int i10) {
        l lVarP = lVar.p(957146168);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(957146168, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7PaywallFooterCondensedPreview (Template7.kt:684)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C07591.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate7Offering(), false, false, 12, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07602(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template7PaywallFooterPreview(l lVar, int i10) {
        l lVarP = lVar.p(-323823251);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-323823251, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7PaywallFooterPreview (Template7.kt:673)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C07611.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate7Offering(), false, false, 12, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07622(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template7PaywallPreview(l lVar, int i10) {
        l lVarP = lVar.p(292324402);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(292324402, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7PaywallPreview (Template7.kt:662)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C07631.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate7Offering(), false, false, 13, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07642(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Template7PortraitContent(h0.h r29, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r30, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r31, boolean r32, java.util.List<com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.TierInfo> r33, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.TierInfo r34, zd.l<? super com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.TierInfo, md.i0> r35, t0.l r36, int r37) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt.Template7PortraitContent(h0.h, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, boolean, java.util.List, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$TierInfo, zd.l, t0.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(h0.h hVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, l lVar, int i10) {
        l lVarP = lVar.p(-1395216940);
        if (o.I()) {
            o.U(-1395216940, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Title (Template7.kt:336)");
        }
        TemplateConfiguration.Colors currentColorsForTier = legacy.getTemplateConfiguration().getCurrentColorsForTier(tierInfo, lVarP, 72);
        ProcessedLocalizedConfiguration processedLocalizedConfigurationSelectedLocalizationForTier = selectedLocalizationForTier(tierInfo);
        i2.g0 g0VarI = y.f18928a.c(lVarP, y.f18929b | 0).i();
        n2.i0 i0VarB = n2.i0.f15808b.b();
        int iA = u2.i.f21560b.a();
        MarkdownKt.m163MarkdownSXj7GJg(processedLocalizedConfigurationSelectedLocalizationForTier.getTitle(), androidx.compose.foundation.layout.p.g(e.f2662a, 0.0f, 1, null), currentColorsForTier.m227getText10d7_KjU(), g0VarI, 0L, i0VarB, null, null, u2.i.h(iA), false, true, lVarP, 196656, 6, 720);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07661(hVar, legacy, tierInfo, i10));
    }

    private static final long getFeatureIcon(TemplateConfiguration.Colors colors) {
        return colors.m219getAccent10d7_KjU();
    }

    private static final long getSelectedDiscountText(TemplateConfiguration.Colors colors) {
        return colors.m228getText20d7_KjU();
    }

    private static final long getSelectedOutline(TemplateConfiguration.Colors colors) {
        return colors.m220getAccent20d7_KjU();
    }

    private static final long getTierSwitcherBackground(TemplateConfiguration.Colors colors) {
        j0 j0VarM230getTierControlBackgroundQN2ZGVo = colors.m230getTierControlBackgroundQN2ZGVo();
        return j0VarM230getTierControlBackgroundQN2ZGVo != null ? j0VarM230getTierControlBackgroundQN2ZGVo.E() : colors.m219getAccent10d7_KjU();
    }

    private static final long getTierSwitcherBackgroundSelected(TemplateConfiguration.Colors colors) {
        j0 j0VarM232getTierControlSelectedBackgroundQN2ZGVo = colors.m232getTierControlSelectedBackgroundQN2ZGVo();
        return j0VarM232getTierControlSelectedBackgroundQN2ZGVo != null ? j0VarM232getTierControlSelectedBackgroundQN2ZGVo.E() : getUnselectedDiscountText(colors);
    }

    private static final long getTierSwitcherForeground(TemplateConfiguration.Colors colors) {
        j0 j0VarM231getTierControlForegroundQN2ZGVo = colors.m231getTierControlForegroundQN2ZGVo();
        return j0VarM231getTierControlForegroundQN2ZGVo != null ? j0VarM231getTierControlForegroundQN2ZGVo.E() : colors.m227getText10d7_KjU();
    }

    private static final long getTierSwitcherForegroundSelected(TemplateConfiguration.Colors colors) {
        j0 j0VarM233getTierControlSelectedForegroundQN2ZGVo = colors.m233getTierControlSelectedForegroundQN2ZGVo();
        return j0VarM233getTierControlSelectedForegroundQN2ZGVo != null ? j0VarM233getTierControlSelectedForegroundQN2ZGVo.E() : colors.m227getText10d7_KjU();
    }

    private static final long getUnselectedDiscountText(TemplateConfiguration.Colors colors) {
        return colors.m229getText30d7_KjU();
    }

    private static final long getUnselectedOutline(TemplateConfiguration.Colors colors) {
        return colors.m221getAccent30d7_KjU();
    }

    private static final ProcessedLocalizedConfiguration selectedLocalizationForTier(TemplateConfiguration.TierInfo tierInfo) {
        return tierInfo.getDefaultPackage().getLocalization();
    }
}
