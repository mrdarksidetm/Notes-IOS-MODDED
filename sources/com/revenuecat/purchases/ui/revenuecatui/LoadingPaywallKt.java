package com.revenuecat.purchases.ui.revenuecatui;

import a2.g;
import ae.r;
import ae.s;
import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import b1.c;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.composables.CloseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallResourceProviderKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import f1.b;
import md.i0;
import nd.r0;
import nd.y0;
import q0.y;
import t0.e2;
import t0.i;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class LoadingPaywallKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.LoadingPaywallKt$LoadingPaywall$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallMode $mode;
        final /* synthetic */ a<i0> $onDismiss;
        final /* synthetic */ boolean $shouldDisplayDismissButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallMode paywallMode, boolean z10, a<i0> aVar, int i10) {
            super(2);
            this.$mode = paywallMode;
            this.$shouldDisplayDismissButton = z10;
            this.$onDismiss = aVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            LoadingPaywallKt.LoadingPaywall(this.$mode, this.$shouldDisplayDismissButton, this.$onDismiss, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.LoadingPaywallKt$LoadingPaywall$4, reason: invalid class name */
    static final class AnonymousClass4 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ a<i0> $onDismiss;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, a<i0> aVar, int i10) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$onDismiss = aVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            LoadingPaywallKt.LoadingPaywall(this.$state, this.$viewModel, this.$onDismiss, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.LoadingPaywallKt$LoadingPaywallPreview$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements a<i0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.LoadingPaywallKt$LoadingPaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C06192 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06192(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            LoadingPaywallKt.LoadingPaywallPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    public static final void LoadingPaywall(PaywallMode paywallMode, boolean z10, a<i0> aVar, l lVar, int i10) {
        int i11;
        r.f(paywallMode, "mode");
        r.f(aVar, "onDismiss");
        l lVarP = lVar.p(-1867064258);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(paywallMode) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.c(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= lVarP.k(aVar) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 731) == 146 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1867064258, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadingPaywall (LoadingPaywall.kt:43)");
            }
            ResourceProvider resourceProvider = PaywallResourceProviderKt.toResourceProvider((Context) lVarP.P(androidx.compose.ui.platform.r.g()));
            PaywallData.Companion companion = PaywallData.Companion;
            LoadingPaywallConstants loadingPaywallConstants = LoadingPaywallConstants.INSTANCE;
            PaywallData paywallDataCreateDefault = PaywallDataExtensionsKt.createDefault(companion, loadingPaywallConstants.getPackages(), y.f18928a.a(lVarP, y.f18929b | 0), resourceProvider);
            PaywallState paywallState = OfferingToStateMapperKt.toPaywallState(new Offering(LoadingPaywallConstants.offeringIdentifier, "Loading paywall", r0.e(), loadingPaywallConstants.getPackages(), paywallDataCreateDefault), new VariableDataProvider(resourceProvider, HelperFunctionsKt.isInPreviewMode(lVarP, 0)), y0.b(), y0.b(), paywallMode, paywallDataCreateDefault, loadingPaywallConstants.getTemplate(), z10, null);
            if (paywallState instanceof PaywallState.Error ? true : paywallState instanceof PaywallState.Loading ? true : paywallState instanceof PaywallState.Loaded.Components) {
                lVarP.e(1011499546);
                lVarP.e(733328855);
                e.a aVar2 = e.f2662a;
                e0 e0VarG = d.g(b.f11020a.o(), false, lVarP, 0);
                lVarP.e(-1323940314);
                int iA = i.a(lVarP, 0);
                w wVarB = lVarP.B();
                g.a aVar3 = g.J;
                a<g> aVarA = aVar3.a();
                q<q2<g>, l, Integer, i0> qVarA = u.a(aVar2);
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
                p<g, Integer, i0> pVarB = aVar3.b();
                if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                    lVarA.E(Integer.valueOf(iA));
                    lVarA.Q(Integer.valueOf(iA), pVarB);
                }
                qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
                lVarP.e(2058660585);
                f fVar = f.f2502a;
                lVarP.K();
                lVarP.L();
                lVarP.K();
                lVarP.K();
            } else if (paywallState instanceof PaywallState.Loaded.Legacy) {
                lVarP.e(1011499595);
                LoadingPaywall((PaywallState.Loaded.Legacy) paywallState, new LoadingViewModel(paywallState, resourceProvider), aVar, lVarP, (i12 & 896) | 72);
            } else {
                lVarP.e(1011499676);
            }
            lVarP.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass2(paywallMode, z10, aVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingPaywall(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, a<i0> aVar, l lVar, int i10) {
        l lVarP = lVar.p(1534111610);
        if (o.I()) {
            o.U(1534111610, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadingPaywall (LoadingPaywall.kt:91)");
        }
        lVarP.e(733328855);
        e.a aVar2 = e.f2662a;
        e0 e0VarG = d.g(b.f11020a.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar3 = g.J;
        a<g> aVarA = aVar3.a();
        q<q2<g>, l, Integer, i0> qVarA = u.a(aVar2);
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
        p<g, Integer, i0> pVarB = aVar3.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        DisableTouchesComposableKt.DisableTouchesComposable(false, c.b(lVarP, -1190756256, true, new LoadingPaywallKt$LoadingPaywall$3$1(legacy, paywallViewModel, i10)), lVarP, 48, 1);
        CloseButtonKt.m144CloseButtondrOMvmE(fVar, legacy.getShouldDisplayDismissButton(), null, paywallViewModel.getActionInProgress().getValue().booleanValue(), aVar, lVarP, 390 | (57344 & (i10 << 6)));
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
        o2VarV.a(new AnonymousClass4(legacy, paywallViewModel, aVar, i10));
    }

    public static final void LoadingPaywallPreview(l lVar, int i10) {
        l lVarP = lVar.p(234924211);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(234924211, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadingPaywallPreview (LoadingPaywall.kt:211)");
            }
            LoadingPaywall(PaywallMode.FULL_SCREEN, false, (a<i0>) AnonymousClass1.INSTANCE, lVarP, 438);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06192(i10));
    }
}
