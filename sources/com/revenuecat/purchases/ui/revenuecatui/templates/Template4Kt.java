package com.revenuecat.purchases.ui.revenuecatui.templates;

import a2.g;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.i;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import b1.c;
import b2.k0;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.InsetSpacersKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallBackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProviderKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.AnimationsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import d0.m0;
import f1.b;
import g2.x;
import h0.b;
import h0.f0;
import h0.h0;
import h0.u;
import i2.g0;
import java.util.Iterator;
import java.util.List;
import md.i0;
import q0.q0;
import q0.y;
import t0.e2;
import t0.e3;
import t0.k1;
import t0.k3;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import w2.h;
import y1.e0;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class Template4Kt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$CheckmarkBox$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z10, TemplateConfiguration.Colors colors, e eVar, int i10, int i11) {
            super(2);
            this.$isSelected = z10;
            this.$colors = colors;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template4Kt.CheckmarkBox(this.$isSelected, this.$colors, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$1, reason: invalid class name */
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$2, reason: invalid class name and case insensitive filesystem */
    static final class C07192 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07192(String str, TemplateConfiguration.Colors colors, boolean z10, int i10) {
            super(2);
            this.$text = str;
            this.$colors = colors;
            this.$selected = z10;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template4Kt.DiscountRelativeToMostExpensivePerMonth(this.$text, this.$colors, this.$selected, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Packages$1, reason: invalid class name and case insensitive filesystem */
    static final class C07201 extends s implements q<h0.e, l, Integer, i0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07201(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(3);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$dirty = i10;
        }

        @Override // zd.q
        public /* bridge */ /* synthetic */ i0 invoke(h0.e eVar, l lVar, Integer num) {
            invoke(eVar, lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(h0.e eVar, l lVar, int i10) {
            int i11;
            r.f(eVar, "$this$BoxWithConstraints");
            if ((i10 & 14) == 0) {
                i11 = (lVar.N(eVar) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && lVar.s()) {
                lVar.x();
                return;
            }
            if (o.I()) {
                o.U(-1700467196, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Packages.<anonymous> (Template4.kt:232)");
            }
            float fPackages$packageWidth = Template4Kt.Packages$packageWidth(eVar, this.$state.getTemplateConfiguration().getPackages().getAll().size());
            e eVarB = m0.b(androidx.compose.foundation.layout.p.g(i.a(e.f2662a, u.Min), 0.0f, 1, null), m0.c(0, lVar, 0, 1), false, null, false, 14, null);
            Template4UIConstants template4UIConstants = Template4UIConstants.INSTANCE;
            e eVarJ = m.j(eVarB, template4UIConstants.m276getPackagesHorizontalPaddingD9Ej5fM(), UIConstant.INSTANCE.m83getDefaultVerticalSpacingD9Ej5fM());
            b.f fVarO = b.f11594a.o(template4UIConstants.m275getPackageHorizontalSpacingD9Ej5fM());
            PaywallState.Loaded.Legacy legacy = this.$state;
            PaywallViewModel paywallViewModel = this.$viewModel;
            int i12 = this.$$dirty;
            lVar.e(693286680);
            e0 e0VarA = f0.a(fVarO, f1.b.f11020a.l(), lVar, 6);
            lVar.e(-1323940314);
            int iA = t0.i.a(lVar, 0);
            w wVarB = lVar.B();
            g.a aVar = g.J;
            a<g> aVarA = aVar.a();
            q<q2<g>, l, Integer, i0> qVarA = y1.u.a(eVarJ);
            if (!(lVar.t() instanceof t0.e)) {
                t0.i.b();
            }
            lVar.r();
            if (lVar.l()) {
                lVar.O(aVarA);
            } else {
                lVar.D();
            }
            l lVarA = u3.a(lVar);
            u3.b(lVarA, e0VarA, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            p<g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVar)), lVar, 0);
            lVar.e(2058660585);
            h0 h0Var = h0.f11663a;
            lVar.e(1441284266);
            Iterator<T> it = legacy.getTemplateConfiguration().getPackages().getAll().iterator();
            while (it.hasNext()) {
                Template4Kt.SelectPackageButton(legacy, (TemplateConfiguration.PackageInfo) it.next(), paywallViewModel, androidx.compose.foundation.layout.p.r(e.f2662a, fPackages$packageWidth), lVar, ((i12 << 3) & 896) | 72, 0);
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Packages$2, reason: invalid class name and case insensitive filesystem */
    static final class C07212 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07212(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
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
            Template4Kt.Packages(this.$state, this.$viewModel, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$SelectPackageButton$1, reason: invalid class name and case insensitive filesystem */
    static final class C07221 extends s implements zd.l<x, i0> {
        public static final C07221 INSTANCE = new C07221();

        C07221() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$SelectPackageButton$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, e eVar, int i10, int i11) {
            super(2);
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$viewModel = paywallViewModel;
            this.$modifier = eVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template4Kt.SelectPackageButton(this.$state, this.$packageInfo, this.$viewModel, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$SelectPackageButtonContent$2, reason: invalid class name and case insensitive filesystem */
    static final class C07232 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07232(TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, int i10) {
            super(2);
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
            Template4Kt.SelectPackageButtonContent(this.$packageInfo, this.$colors, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4$2, reason: invalid class name and case insensitive filesystem */
    static final class C07242 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07242(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
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
            Template4Kt.Template4(this.$state, this.$viewModel, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4MainContent$2, reason: invalid class name and case insensitive filesystem */
    static final class C07252 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07252(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
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
            Template4Kt.Template4MainContent(this.$state, this.$viewModel, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4PaywallFooterCondensedPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C07261 extends s implements a<i0> {
        public static final C07261 INSTANCE = new C07261();

        C07261() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4PaywallFooterCondensedPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C07272 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07272(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template4Kt.Template4PaywallFooterCondensedPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4PaywallFooterPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C07281 extends s implements a<i0> {
        public static final C07281 INSTANCE = new C07281();

        C07281() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4PaywallFooterPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C07292 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07292(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template4Kt.Template4PaywallFooterPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4PaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C07301 extends s implements a<i0> {
        public static final C07301 INSTANCE = new C07301();

        C07301() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$Template4PaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C07312 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07312(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template4Kt.Template4PaywallPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CheckmarkBox(boolean z10, TemplateConfiguration.Colors colors, e eVar, l lVar, int i10, int i11) {
        int i12;
        l lVarP = lVar.p(-2025803939);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.N(colors) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= lVarP.N(eVar) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = e.f2662a;
            }
            if (o.I()) {
                o.U(-2025803939, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CheckmarkBox (Template4.kt:429)");
            }
            e eVarA = i1.g.a(androidx.compose.foundation.layout.p.o(eVar, Template4UIConstants.INSTANCE.m272getCheckmarkSizeD9Ej5fM()), l0.g.f());
            lVarP.e(733328855);
            e0 e0VarG = d.g(f1.b.f11020a.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA = t0.i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = g.J;
            a<g> aVarA = aVar.a();
            q<q2<g>, l, Integer, i0> qVarA = y1.u.a(eVarA);
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
            u3.b(lVarA, e0VarG, aVar.e());
            u3.b(lVarA, wVarB, aVar.g());
            p<g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar = f.f2502a;
            UIConstant uIConstant = UIConstant.INSTANCE;
            b0.d.e(z10, null, androidx.compose.animation.f.m(uIConstant.defaultAnimation(), 0.0f, 2, null), androidx.compose.animation.f.o(uIConstant.defaultAnimation(), 0.0f, 2, null), null, c.b(lVarP, -2128395201, true, new Template4Kt$CheckmarkBox$1$1(colors)), lVarP, (i12 & 14) | 196608, 18);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            if (o.I()) {
                o.T();
            }
        }
        e eVar2 = eVar;
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass2(z10, colors, eVar2, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DiscountRelativeToMostExpensivePerMonth(java.lang.String r11, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r12, boolean r13, t0.l r14, int r15) {
        /*
            r0 = -1807074170(0xffffffff944a3c86, float:-1.021033E-26)
            t0.l r14 = r14.p(r0)
            r1 = r15 & 14
            if (r1 != 0) goto L16
            boolean r1 = r14.N(r11)
            if (r1 == 0) goto L13
            r1 = 4
            goto L14
        L13:
            r1 = 2
        L14:
            r1 = r1 | r15
            goto L17
        L16:
            r1 = r15
        L17:
            r2 = r15 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L27
            boolean r2 = r14.N(r12)
            if (r2 == 0) goto L24
            r2 = 32
            goto L26
        L24:
            r2 = 16
        L26:
            r1 = r1 | r2
        L27:
            r2 = r15 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L37
            boolean r2 = r14.c(r13)
            if (r2 == 0) goto L34
            r2 = 256(0x100, float:3.59E-43)
            goto L36
        L34:
            r2 = 128(0x80, float:1.8E-43)
        L36:
            r1 = r1 | r2
        L37:
            r1 = r1 & 731(0x2db, float:1.024E-42)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L48
            boolean r1 = r14.s()
            if (r1 != 0) goto L44
            goto L48
        L44:
            r14.x()
            goto Lb4
        L48:
            boolean r1 = t0.o.I()
            if (r1 == 0) goto L54
            r1 = -1
            java.lang.String r2 = "com.revenuecat.purchases.ui.revenuecatui.templates.DiscountRelativeToMostExpensivePerMonth (Template4.kt:365)"
            t0.o.U(r0, r15, r1, r2)
        L54:
            if (r11 == 0) goto L63
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r11.toUpperCase(r0)
            java.lang.String r1 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            ae.r.e(r0, r1)
            if (r0 != 0) goto L65
        L63:
            java.lang.String r0 = ""
        L65:
            r1 = r0
            if (r13 == 0) goto L6d
            long r2 = r12.m228getText20d7_KjU()
            goto L71
        L6d:
            long r2 = r12.m229getText30d7_KjU()
        L71:
            r3 = r2
            q0.y r0 = q0.y.f18928a
            int r2 = q0.y.f18929b
            r2 = r2 | 0
            q0.r0 r0 = r0.c(r14, r2)
            i2.g0 r5 = r0.d()
            n2.i0$a r0 = n2.i0.f15808b
            n2.i0 r6 = r0.b()
            u2.i$a r0 = u2.i.f21560b
            int r7 = r0.a()
            androidx.compose.ui.e$a r0 = androidx.compose.ui.e.f2662a
            com.revenuecat.purchases.ui.revenuecatui.UIConstant r2 = com.revenuecat.purchases.ui.revenuecatui.UIConstant.INSTANCE
            float r2 = r2.m80getDefaultHorizontalPaddingD9Ej5fM()
            com.revenuecat.purchases.ui.revenuecatui.templates.Template4UIConstants r8 = com.revenuecat.purchases.ui.revenuecatui.templates.Template4UIConstants.INSTANCE
            float r8 = r8.m273getDiscountVerticalPaddingD9Ej5fM()
            androidx.compose.ui.e r0 = androidx.compose.foundation.layout.m.j(r0, r2, r8)
            com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$1 r2 = com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt.AnonymousClass1.INSTANCE
            androidx.compose.ui.e r2 = g2.o.a(r0, r2)
            r9 = 24576(0x6000, float:3.4438E-41)
            r10 = 0
            r8 = r14
            com.revenuecat.purchases.ui.revenuecatui.composables.AutoResizedTextKt.m142AutoResizedTextW72HBGU(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            boolean r0 = t0.o.I()
            if (r0 == 0) goto Lb4
            t0.o.T()
        Lb4:
            t0.o2 r14 = r14.v()
            if (r14 != 0) goto Lbb
            goto Lc3
        Lbb:
            com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$2 r0 = new com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$2
            r0.<init>(r11, r12, r13, r15)
            r14.a(r0)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt.DiscountRelativeToMostExpensivePerMonth(java.lang.String, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, boolean, t0.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: OfferName-3IgeMak, reason: not valid java name */
    public static final void m269OfferName3IgeMak(TemplateConfiguration.PackageInfo packageInfo, long j10, e eVar, l lVar, int i10, int i11) {
        l lVarP = lVar.p(681923225);
        e eVar2 = (i11 & 4) != 0 ? e.f2662a : eVar;
        if (o.I()) {
            o.U(681923225, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.OfferName (Template4.kt:386)");
        }
        Object obj = null;
        Object title = packageInfo.getRcPackage().getProduct().getTitle();
        String offerName = packageInfo.getLocalization().getOfferName();
        if (offerName != null) {
            List listC0 = je.w.C0(offerName, new String[]{" "}, false, 2, 2, null);
            if (listC0.size() == 2) {
                obj = listC0.get(0);
                title = listC0.get(1);
            } else {
                title = offerName;
            }
        }
        b.InterfaceC0266b interfaceC0266bG = f1.b.f11020a.g();
        int i12 = ((i10 >> 6) & 14) | 384;
        lVarP.e(-483455358);
        int i13 = i12 >> 3;
        e0 e0VarA = h0.g.a(h0.b.f11594a.h(), interfaceC0266bG, lVarP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i13 & 14));
        int i14 = (i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar = g.J;
        a<g> aVarA = aVar.a();
        q<q2<g>, l, Integer, i0> qVarA = y1.u.a(eVar2);
        int i15 = ((i14 << 9) & 7168) | 6;
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
        u3.b(lVarA, e0VarA, aVar.e());
        u3.b(lVarA, wVarB, aVar.g());
        p<g, Integer, i0> pVarB = aVar.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, Integer.valueOf((i15 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        String str = (String) obj;
        lVarP.e(-4923721);
        if (str != null) {
            q0.b(str, null, j10, 0L, null, n2.i0.f15808b.b(), null, 0L, null, u2.i.h(u2.i.f21560b.a()), 0L, 0, false, 0, 0, null, y.f18928a.c(lVarP, y.f18929b | 0).n(), lVarP, ((i10 << 3) & 896) | 196608, 0, 64986);
        }
        lVarP.K();
        q0.b((String) title, null, j10, 0L, null, n2.i0.f15808b.g(), null, 0L, null, u2.i.h(u2.i.f21560b.a()), 0L, 0, false, 0, 0, null, y.f18928a.c(lVarP, y.f18929b | 0).b(), lVarP, ((i10 << 3) & 896) | 196608, 0, 64986);
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
        o2VarV.a(new Template4Kt$OfferName$3(packageInfo, j10, eVar2, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Packages(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, l lVar, int i10) {
        l lVarP = lVar.p(2132177050);
        if (o.I()) {
            o.U(2132177050, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Packages (Template4.kt:213)");
        }
        h0.d.a(null, null, false, c.b(lVarP, -1700467196, true, new C07201(legacy, paywallViewModel, i10)), lVarP, 3072, 7);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07212(legacy, paywallViewModel, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Packages$packageWidth(h0.e eVar, float f10) {
        float fPackages$packagesToDisplay = Packages$packagesToDisplay(f10);
        Template4UIConstants template4UIConstants = Template4UIConstants.INSTANCE;
        return h.m(h.m(h.m(eVar.b() - h.m(template4UIConstants.m276getPackagesHorizontalPaddingD9Ej5fM() * 2)) - h.m(template4UIConstants.m275getPackageHorizontalSpacingD9Ej5fM() * (fPackages$packagesToDisplay - 1))) / fPackages$packagesToDisplay);
    }

    private static final float Packages$packagesToDisplay(float f10) {
        return Math.min(Math.min(3.5f, f10), 3.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectPackageButton(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, e eVar, l lVar, int i10, int i11) {
        l lVarP = lVar.p(-1542474718);
        e eVar2 = (i11 & 8) != 0 ? e.f2662a : eVar;
        if (o.I()) {
            o.U(-1542474718, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton (Template4.kt:262)");
        }
        TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(lVarP, 8);
        boolean zB = r.b(packageInfo, legacy.getSelectedPackage().getValue());
        float fPackageButtonActionInProgressOpacityAnimation = AnimationsKt.packageButtonActionInProgressOpacityAnimation(paywallViewModel, lVarP, (i10 >> 6) & 14);
        long jM243packageButtonColorAnimation9z6LAg8 = AnimationsKt.m243packageButtonColorAnimation9z6LAg8(legacy, packageInfo, currentColors.m219getAccent10d7_KjU(), currentColors.m220getAccent20d7_KjU(), lVarP, 72);
        UIConstant uIConstant = UIConstant.INSTANCE;
        e eVarA = i1.g.a(eVar2, l0.g.c(uIConstant.m79getDefaultCornerRadiusD9Ej5fM()));
        String strLocalizedDiscount = VariableDataProviderKt.localizedDiscount(packageInfo, paywallViewModel.getResourceProvider());
        if (packageInfo.getLocalization().getOfferBadge() != null) {
            eVarA = androidx.compose.foundation.c.d(eVarA, jM243packageButtonColorAnimation9z6LAg8, null, 2, null);
        }
        e eVarC = g2.o.c(eVarA, true, C07221.INSTANCE);
        b.a aVar = f1.b.f11020a;
        b.InterfaceC0266b interfaceC0266bG = aVar.g();
        lVarP.e(-483455358);
        e0 e0VarA = h0.g.a(h0.b.f11594a.h(), interfaceC0266bG, lVarP, 48);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar2 = g.J;
        a<g> aVarA = aVar2.a();
        q<q2<g>, l, Integer, i0> qVarA = y1.u.a(eVarC);
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
        p<g, Integer, i0> pVarB = aVar2.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        DiscountRelativeToMostExpensivePerMonth(strLocalizedDiscount, currentColors, zB, lVarP, 0);
        e.a aVar3 = e.f2662a;
        e eVarF = d0.g.f(aVar3, uIConstant.m81getDefaultPackageBorderWidthD9Ej5fM(), jM243packageButtonColorAnimation9z6LAg8, l0.g.c(uIConstant.m79getDefaultCornerRadiusD9Ej5fM()));
        lVarP.e(733328855);
        e0 e0VarG = d.g(aVar.o(), false, lVarP, 0);
        lVarP.e(-1323940314);
        int iA2 = t0.i.a(lVarP, 0);
        w wVarB2 = lVarP.B();
        a<g> aVarA2 = aVar2.a();
        q<q2<g>, l, Integer, i0> qVarA2 = y1.u.a(eVarF);
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
        u3.b(lVarA2, e0VarG, aVar2.e());
        u3.b(lVarA2, wVarB2, aVar2.g());
        p<g, Integer, i0> pVarB2 = aVar2.b();
        if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
            lVarA2.E(Integer.valueOf(iA2));
            lVarA2.Q(Integer.valueOf(iA2), pVarB2);
        }
        qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        f fVar = f.f2502a;
        e eVarI = m.i(i1.a.a(eVar2, fPackageButtonActionInProgressOpacityAnimation), h.i(((w2.d) lVarP.P(k0.c())).l0(1)).r());
        Boolean boolValueOf = Boolean.valueOf(zB);
        lVarP.e(511388516);
        boolean zN = lVarP.N(boolValueOf) | lVarP.N(strLocalizedDiscount);
        Object objF = lVarP.f();
        if (zN || objF == l.f20813a.a()) {
            objF = new Template4Kt$SelectPackageButton$2$1$2$1(zB, strLocalizedDiscount);
            lVarP.E(objF);
        }
        lVarP.K();
        e eVar3 = eVar2;
        q0.g.a(new Template4Kt$SelectPackageButton$2$1$3(paywallViewModel, packageInfo), androidx.compose.foundation.layout.p.c(g2.o.d(eVarI, false, (zd.l) objF, 1, null), 0.0f, 1, null), false, l0.g.c(uIConstant.m79getDefaultCornerRadiusD9Ej5fM()), q0.e.f18552a.b(currentColors.m222getBackground0d7_KjU(), 0L, 0L, 0L, lVarP, (q0.e.f18566o | 0) << 12, 14), null, null, m.b(uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m83getDefaultVerticalSpacingD9Ej5fM()), null, c.b(lVarP, -1357178314, true, new Template4Kt$SelectPackageButton$2$1$4(packageInfo, currentColors)), lVarP, 805306368, 356);
        CheckmarkBox(zB, PaywallStateKt.getCurrentColors(legacy, lVarP, 8), m.i(fVar.c(aVar3, aVar.n()), Template4UIConstants.INSTANCE.m271getCheckmarkPaddingD9Ej5fM()), lVarP, 0, 0);
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
        o2VarV.a(new AnonymousClass3(legacy, packageInfo, paywallViewModel, eVar3, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectPackageButtonContent(TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, l lVar, int i10) {
        l lVarP = lVar.p(2102143927);
        if (o.I()) {
            o.U(2102143927, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButtonContent (Template4.kt:339)");
        }
        b.f fVarO = h0.b.f11594a.o(Template4UIConstants.INSTANCE.m274getPackageButtonContentVerticalSpacingD9Ej5fM());
        b.InterfaceC0266b interfaceC0266bG = f1.b.f11020a.g();
        lVarP.e(-483455358);
        e.a aVar = e.f2662a;
        e0 e0VarA = h0.g.a(fVarO, interfaceC0266bG, lVarP, 54);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar2 = g.J;
        a<g> aVarA = aVar2.a();
        q<q2<g>, l, Integer, i0> qVarA = y1.u.a(aVar);
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
        p<g, Integer, i0> pVarB = aVar2.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        m269OfferName3IgeMak(packageInfo, colors.m227getText10d7_KjU(), h0.h.b(h0.i.f11664a, androidx.compose.foundation.layout.p.x(aVar, null, false, 3, null), 1.0f, false, 2, null), lVarP, 8, 0);
        q0.b(packageInfo.getRcPackage().getProduct().getPrice().getFormatted(), null, colors.m227getText10d7_KjU(), 0L, null, n2.i0.f15808b.h(), null, 0L, null, null, 0L, 0, false, 0, 0, null, y.f18928a.c(lVarP, y.f18929b | 0).b(), lVarP, 196608, 0, 65498);
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
        o2VarV.a(new C07232(packageInfo, colors, i10));
    }

    public static final void Template4(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, l lVar, int i10) {
        r.f(legacy, "state");
        r.f(paywallViewModel, "viewModel");
        l lVarP = lVar.p(596926027);
        if (o.I()) {
            o.U(596926027, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4 (Template4.kt:99)");
        }
        if (PaywallStateKt.isInFullScreenMode(legacy)) {
            lVarP.e(1196352109);
            boolean zShouldUseLandscapeLayout = WindowHelperKt.shouldUseLandscapeLayout(legacy, lVarP, 8);
            e.a aVar = e.f2662a;
            e eVarE = androidx.compose.foundation.layout.p.e(aVar, 0.0f, 1, null);
            lVarP.e(733328855);
            b.a aVar2 = f1.b.f11020a;
            e0 e0VarG = d.g(aVar2.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA = t0.i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar3 = g.J;
            a<g> aVarA = aVar3.a();
            q<q2<g>, l, Integer, i0> qVarA = y1.u.a(eVarE);
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
            lVarP.e(-735301835);
            if (!zShouldUseLandscapeLayout) {
                PaywallBackgroundKt.PaywallBackground(fVar, legacy.getTemplateConfiguration(), lVarP, 70);
            }
            lVarP.K();
            lVarP.e(1157296644);
            boolean zN = lVarP.N(fVar);
            Object objF = lVarP.f();
            if (zN || objF == l.f20813a.a()) {
                objF = new Template4Kt$Template4$1$1$1(fVar);
                lVarP.E(objF);
            }
            lVarP.K();
            e eVarConditional = ModifierExtensionsKt.conditional(aVar, zShouldUseLandscapeLayout, (zd.l) objF);
            boolean z10 = !zShouldUseLandscapeLayout;
            lVarP.e(1157296644);
            boolean zN2 = lVarP.N(fVar);
            Object objF2 = lVarP.f();
            if (zN2 || objF2 == l.f20813a.a()) {
                objF2 = new Template4Kt$Template4$1$2$1(fVar);
                lVarP.E(objF2);
            }
            lVarP.K();
            e eVarD = androidx.compose.foundation.c.d(ModifierExtensionsKt.conditional(eVarConditional, z10, (zd.l) objF2), PaywallStateKt.getCurrentColors(legacy, lVarP, 8).m222getBackground0d7_KjU(), null, 2, null);
            lVarP.e(-483455358);
            e0 e0VarA = h0.g.a(h0.b.f11594a.h(), aVar2.k(), lVarP, 0);
            lVarP.e(-1323940314);
            int iA2 = t0.i.a(lVarP, 0);
            w wVarB2 = lVarP.B();
            a<g> aVarA2 = aVar3.a();
            q<q2<g>, l, Integer, i0> qVarA2 = y1.u.a(eVarD);
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
            u3.b(lVarA2, e0VarA, aVar3.e());
            u3.b(lVarA2, wVarB2, aVar3.g());
            p<g, Integer, i0> pVarB2 = aVar3.b();
            if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
                lVarA2.E(Integer.valueOf(iA2));
                lVarA2.Q(Integer.valueOf(iA2), pVarB2);
            }
            qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            h0.i iVar = h0.i.f11664a;
            lVarP.e(-1571072607);
            if (zShouldUseLandscapeLayout) {
                InsetSpacersKt.StatusBarSpacer(lVarP, 0);
            }
            lVarP.K();
            Template4MainContent(legacy, paywallViewModel, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
        } else {
            lVarP.e(1196353416);
            Template4MainContent(legacy, paywallViewModel, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
        }
        lVarP.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07242(legacy, paywallViewModel, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template4MainContent(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, l lVar, int i10) {
        e3 e3Var;
        int i11;
        int i12;
        l lVarP = lVar.p(-1408056045);
        if (o.I()) {
            o.U(-1408056045, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4MainContent (Template4.kt:145)");
        }
        TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(lVarP, 8);
        e.a aVar = e.f2662a;
        UIConstant uIConstant = UIConstant.INSTANCE;
        e eVarM = m.m(aVar, 0.0f, uIConstant.m83getDefaultVerticalSpacingD9Ej5fM(), 0.0f, 0.0f, 13, null);
        h0.b bVar = h0.b.f11594a;
        b.f fVarO = bVar.o(uIConstant.m83getDefaultVerticalSpacingD9Ej5fM());
        b.a aVar2 = f1.b.f11020a;
        b.InterfaceC0266b interfaceC0266bG = aVar2.g();
        lVarP.e(-483455358);
        e0 e0VarA = h0.g.a(fVarO, interfaceC0266bG, lVarP, 48);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar3 = g.J;
        a<g> aVarA = aVar3.a();
        q<q2<g>, l, Integer, i0> qVarA = y1.u.a(eVarM);
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
        p<g, Integer, i0> pVarB = aVar3.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        lVarP.e(230805248);
        if (PaywallStateKt.isInFullScreenMode(legacy)) {
            ProcessedLocalizedConfiguration selectedLocalization = PaywallStateKt.getSelectedLocalization(legacy);
            g0 g0VarG = y.f18928a.c(lVarP, y.f18929b | 0).g();
            n2.i0 i0VarA = n2.i0.f15808b.a();
            int iA2 = u2.i.f21560b.a();
            String title = selectedLocalization.getTitle();
            long jM227getText10d7_KjU = currentColors.m227getText10d7_KjU();
            e3Var = null;
            i11 = 2;
            e eVarK = m.k(aVar, uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
            i12 = -483455358;
            MarkdownKt.m163MarkdownSXj7GJg(title, eVarK, jM227getText10d7_KjU, g0VarG, 0L, i0VarA, null, null, u2.i.h(iA2), false, true, lVarP, 196608, 6, 720);
        } else {
            e3Var = null;
            i11 = 2;
            i12 = -483455358;
        }
        lVarP.K();
        lVarP.e(-492369756);
        Object objF = lVarP.f();
        l.a aVar4 = l.f20813a;
        if (objF == aVar4.a()) {
            objF = k3.e(Boolean.valueOf(legacy.getTemplateConfiguration().getMode() != PaywallMode.FOOTER_CONDENSED), e3Var, i11, e3Var);
            lVarP.E(objF);
        }
        lVarP.K();
        k1 k1Var = (k1) objF;
        b.InterfaceC0266b interfaceC0266bG2 = aVar2.g();
        lVarP.e(i12);
        e0 e0VarA2 = h0.g.a(bVar.h(), interfaceC0266bG2, lVarP, 48);
        lVarP.e(-1323940314);
        int iA3 = t0.i.a(lVarP, 0);
        w wVarB2 = lVarP.B();
        a<g> aVarA2 = aVar3.a();
        q<q2<g>, l, Integer, i0> qVarA2 = y1.u.a(aVar);
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
        p<g, Integer, i0> pVarB2 = aVar3.b();
        if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA3))) {
            lVarA2.E(Integer.valueOf(iA3));
            lVarA2.Q(Integer.valueOf(iA3), pVarB2);
        }
        qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        b0.d.d(iVar, Template4MainContent$lambda$9$lambda$5(k1Var), null, androidx.compose.animation.f.k(null, aVar2.a(), false, null, 13, null), androidx.compose.animation.f.u(null, aVar2.a(), false, null, 13, null), "SelectPackagesVisibility", c.b(lVarP, 492758735, true, new Template4Kt$Template4MainContent$1$1$1(legacy, paywallViewModel, i10)), lVarP, 1797126, 2);
        b0.d.d(iVar, Template4MainContent$lambda$9$lambda$5(k1Var), null, null, null, null, ComposableSingletons$Template4Kt.INSTANCE.m250getLambda1$revenuecatui_defaultsRelease(), lVarP, 1572870, 30);
        ConsistentPackageContentViewKt.ConsistentPackageContentView(legacy, c.b(lVarP, -1316875667, true, new Template4Kt$Template4MainContent$1$1$2(currentColors)), lVarP, 56);
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        int i13 = (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8;
        PurchaseButtonKt.m185PurchaseButtonhGBTI10(legacy, paywallViewModel, null, 0.0f, null, lVarP, i13, 28);
        TemplateConfiguration templateConfiguration = legacy.getTemplateConfiguration();
        lVarP.e(1157296644);
        boolean zN = lVarP.N(k1Var);
        Object objF2 = lVarP.f();
        if (zN || objF2 == aVar4.a()) {
            objF2 = new Template4Kt$Template4MainContent$1$2$1(k1Var);
            lVarP.E(objF2);
        }
        lVarP.K();
        FooterKt.Footer(templateConfiguration, paywallViewModel, null, null, (a) objF2, lVarP, i13, 12);
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
        o2VarV.a(new C07252(legacy, paywallViewModel, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Template4MainContent$lambda$9$lambda$5(k1<Boolean> k1Var) {
        return k1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template4MainContent$lambda$9$lambda$6(k1<Boolean> k1Var, boolean z10) {
        k1Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template4PaywallFooterCondensedPreview(l lVar, int i10) {
        l lVarP = lVar.p(-1780033640);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1780033640, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4PaywallFooterCondensedPreview (Template4.kt:484)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C07261.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate4Offering(), false, false, 12, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07272(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template4PaywallFooterPreview(l lVar, int i10) {
        l lVarP = lVar.p(-1022674125);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1022674125, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4PaywallFooterPreview (Template4.kt:473)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C07281.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate4Offering(), false, false, 12, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07292(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template4PaywallPreview(l lVar, int i10) {
        l lVarP = lVar.p(-1574269896);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1574269896, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4PaywallPreview (Template4.kt:462)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C07301.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate4Offering(), false, false, 13, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07312(i10));
    }
}
