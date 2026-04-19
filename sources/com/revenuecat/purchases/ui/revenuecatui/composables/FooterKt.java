package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.g;
import ae.j;
import ae.r;
import ae.s;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import b1.c;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ColorsFactory;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template2TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.UrisKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import f1.b;
import f2.f;
import h0.b;
import h0.f0;
import h0.g;
import h0.g0;
import h0.h0;
import h0.y;
import java.net.URL;
import java.util.List;
import java.util.Map;
import md.i0;
import t0.e2;
import t0.i;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import w2.h;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class FooterKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt$Footer$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ a<i0> $allPlansTapped;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration $templateConfiguration;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TemplateConfiguration templateConfiguration, PaywallViewModel paywallViewModel, e eVar, TemplateConfiguration.Colors colors, a<i0> aVar, int i10, int i11) {
            super(2);
            this.$templateConfiguration = templateConfiguration;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$colors = colors;
            this.$allPlansTapped = aVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            FooterKt.Footer(this.$templateConfiguration, this.$viewModel, this.$childModifier, this.$colors, this.$allPlansTapped, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt$Footer$4, reason: invalid class name */
    static final class AnonymousClass4 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ a<i0> $allPlansTapped;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ PaywallData.Configuration $configuration;
        final /* synthetic */ PaywallMode $mode;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PaywallMode paywallMode, PaywallData.Configuration configuration, TemplateConfiguration.Colors colors, PaywallViewModel paywallViewModel, e eVar, a<i0> aVar, int i10, int i11) {
            super(2);
            this.$mode = paywallMode;
            this.$configuration = configuration;
            this.$colors = colors;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$allPlansTapped = aVar;
            this.$$changed = i10;
            this.$$default = i11;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            FooterKt.Footer(this.$mode, this.$configuration, this.$colors, this.$viewModel, this.$childModifier, this.$allPlansTapped, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt$FooterPreview$1, reason: invalid class name */
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
            FooterKt.FooterPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt$openURL$1, reason: invalid class name and case insensitive filesystem */
    static final class C06591 extends s implements zd.l<Exception, i0> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06591(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Exception exc) {
            invoke2(exc);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Exception exc) {
            Context context;
            int i10;
            r.f(exc, "exception");
            if (exc instanceof ActivityNotFoundException) {
                context = this.$context;
                i10 = R.string.no_browser_cannot_open_link;
            } else {
                context = this.$context;
                i10 = R.string.cannot_open_link;
            }
            String string = context.getString(i10);
            r.e(string, "if (exception is Activit…nnot_open_link)\n        }");
            Toast.makeText(this.$context, string, 0).show();
            Logger.INSTANCE.w(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Button-sW7UJKQ, reason: not valid java name */
    public static final void m149ButtonsW7UJKQ(g0 g0Var, long j10, e eVar, int[] iArr, a<i0> aVar, l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(-806477784);
        int i11 = (i10 & 14) == 0 ? (lVarP.N(g0Var) ? 4 : 2) | i10 : i10;
        if ((i10 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.i(j10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= lVarP.N(eVar) ? 256 : 128;
        }
        if ((57344 & i10) == 0) {
            i11 |= lVarP.k(aVar) ? 16384 : 8192;
        }
        lVarP.q(-487513100, Integer.valueOf(iArr.length));
        for (int i12 : iArr) {
            i11 |= lVarP.h(i12) ? 2048 : 0;
        }
        lVarP.I();
        if ((i11 & 7168) == 0) {
            i11 |= 1024;
        }
        int i13 = i11;
        if ((46811 & i13) == 9362 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(-806477784, i13, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Button (Footer.kt:187)");
            }
            String strA = f.a(nd.p.K(iArr), lVarP, 0);
            e.a aVar2 = e.f2662a;
            e eVarC = g0.c(g0Var, aVar2, 1.0f, false, 2, null);
            b.a aVar3 = b.f11020a;
            e eVarB = g0Var.b(eVarC, aVar3.i());
            lVarP.e(-483455358);
            e0 e0VarA = g.a(h0.b.f11594a.h(), aVar3.k(), lVarP, 0);
            lVarP.e(-1323940314);
            int iA = i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar4 = a2.g.J;
            a<a2.g> aVarA = aVar4.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarB);
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
            u3.b(lVarA, e0VarA, aVar4.e());
            u3.b(lVarA, wVarB, aVar4.g());
            p<a2.g, Integer, i0> pVarB = aVar4.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            h0.i iVar = h0.i.f11664a;
            lVarP.e(1157296644);
            boolean zN = lVarP.N(aVar);
            Object objF = lVarP.f();
            if (zN || objF == l.f20813a.a()) {
                objF = new FooterKt$Button$1$1$1(aVar);
                lVarP.E(objF);
            }
            lVarP.K();
            he.f fVar = (he.f) objF;
            y yVarA = m.a(h.m(4));
            e eVarC2 = iVar.c(aVar2, aVar3.g());
            lVarP.e(1157296644);
            boolean zN2 = lVarP.N(strA);
            Object objF2 = lVarP.f();
            if (zN2 || objF2 == l.f20813a.a()) {
                objF2 = new FooterKt$Button$1$2$1(strA);
                lVarP.E(objF2);
            }
            lVarP.K();
            lVar2 = lVarP;
            q0.g.b((a) fVar, g2.o.c(eVarC2, true, (zd.l) objF2), false, null, null, null, null, yVarA, null, c.b(lVarP, 365963733, true, new FooterKt$Button$1$3(iArr, eVar, j10, i13)), lVar2, 817889280, 380);
            lVar2.K();
            lVar2.L();
            lVar2.K();
            lVar2.K();
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new FooterKt$Button$2(g0Var, j10, eVar, iArr, aVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Footer(PaywallMode paywallMode, PaywallData.Configuration configuration, TemplateConfiguration.Colors colors, PaywallViewModel paywallViewModel, e eVar, a<i0> aVar, l lVar, int i10, int i11) {
        int i12;
        char c10;
        int i13;
        long j10;
        e eVar2;
        a<i0> aVar2;
        long j11;
        l lVarP = lVar.p(603087565);
        e eVar3 = (i11 & 16) != 0 ? e.f2662a : eVar;
        a<i0> aVar3 = (i11 & 32) != 0 ? null : aVar;
        if (o.I()) {
            o.U(603087565, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Footer (Footer.kt:77)");
        }
        Context context = ((View) lVarP.P(androidx.compose.ui.platform.r.j())).getContext();
        boolean z10 = paywallMode == PaywallMode.FOOTER_CONDENSED && aVar3 != null;
        float fM = h.m(z10 || configuration.getDisplayRestorePurchases() || configuration.getTermsOfServiceURL() != null || configuration.getPrivacyURL() != null ? 0 : UIConstant.INSTANCE.m83getDefaultVerticalSpacingD9Ej5fM() * 2);
        e eVarA = androidx.compose.foundation.layout.i.a(androidx.compose.foundation.layout.p.g(e.f2662a, 0.0f, 1, null), h0.u.Min);
        UIConstant uIConstant = UIConstant.INSTANCE;
        e eVarM = m.m(eVarA, uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), fM, 2, null);
        b.f fVarB = h0.b.f11594a.b();
        b.c cVarI = f1.b.f11020a.i();
        lVarP.e(693286680);
        e0 e0VarA = f0.a(fVarB, cVarI, lVarP, 54);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar4 = a2.g.J;
        a<a2.g> aVarA = aVar4.a();
        q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarM);
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
        u3.b(lVarA, e0VarA, aVar4.e());
        u3.b(lVarA, wVarB, aVar4.g());
        p<a2.g, Integer, i0> pVarB = aVar4.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0 h0Var = h0.f11663a;
        long jM227getText10d7_KjU = colors.m227getText10d7_KjU();
        lVarP.e(934088272);
        if (!z10 || aVar3 == null) {
            i12 = 6;
            c10 = 0;
            i13 = 2;
            j10 = jM227getText10d7_KjU;
        } else {
            i12 = 6;
            i13 = 2;
            c10 = 0;
            m149ButtonsW7UJKQ(h0Var, jM227getText10d7_KjU, eVar3, new int[]{R.string.all_plans}, aVar3, lVarP, 4102 | ((i10 >> 6) & 896) | (57344 & (i10 >> 3)));
            if (!configuration.getDisplayRestorePurchases() && configuration.getTermsOfServiceURL() == null && configuration.getPrivacyURL() == null) {
                j10 = jM227getText10d7_KjU;
            } else {
                j10 = jM227getText10d7_KjU;
                m150SeparatorRPmYEkk(h0Var, j10, lVarP, 6);
            }
        }
        lVarP.K();
        lVarP.e(934088778);
        if (configuration.getDisplayRestorePurchases()) {
            int[] iArr = new int[i13];
            iArr[c10] = R.string.restore_purchases;
            iArr[1] = R.string.restore;
            e eVar4 = eVar3;
            eVar2 = eVar3;
            aVar2 = aVar3;
            j11 = j10;
            m149ButtonsW7UJKQ(h0Var, j10, eVar4, iArr, new FooterKt$Footer$3$1(paywallViewModel), lVarP, 4102 | ((i10 >> 6) & 896));
            if (configuration.getTermsOfServiceURL() != null || configuration.getPrivacyURL() != null) {
                m150SeparatorRPmYEkk(h0Var, j11, lVarP, i12);
            }
        } else {
            eVar2 = eVar3;
            aVar2 = aVar3;
            j11 = j10;
        }
        lVarP.K();
        URL termsOfServiceURL = configuration.getTermsOfServiceURL();
        lVarP.e(934089249);
        if (termsOfServiceURL != null) {
            int[] iArr2 = new int[i13];
            iArr2[c10] = R.string.terms_and_conditions;
            iArr2[1] = R.string.terms;
            m149ButtonsW7UJKQ(h0Var, j11, eVar2, iArr2, new FooterKt$Footer$3$2$1(context, termsOfServiceURL), lVarP, 4102 | ((i10 >> 6) & 896));
            if (configuration.getPrivacyURL() != null) {
                m150SeparatorRPmYEkk(h0Var, j11, lVarP, i12);
            }
        }
        lVarP.K();
        URL privacyURL = configuration.getPrivacyURL();
        lVarP.e(-1408868461);
        if (privacyURL != null) {
            int[] iArr3 = new int[i13];
            iArr3[c10] = R.string.privacy_policy;
            iArr3[1] = R.string.privacy;
            m149ButtonsW7UJKQ(h0Var, j11, eVar2, iArr3, new FooterKt$Footer$3$3$1(context, privacyURL), lVarP, 4102 | ((i10 >> 6) & 896));
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
        o2VarV.a(new AnonymousClass4(paywallMode, configuration, colors, paywallViewModel, eVar2, aVar2, i10, i11));
    }

    public static final void Footer(TemplateConfiguration templateConfiguration, PaywallViewModel paywallViewModel, e eVar, TemplateConfiguration.Colors colors, a<i0> aVar, l lVar, int i10, int i11) {
        TemplateConfiguration.Colors currentColors;
        int i12;
        r.f(templateConfiguration, "templateConfiguration");
        r.f(paywallViewModel, "viewModel");
        l lVarP = lVar.p(-1570484492);
        e eVar2 = (i11 & 4) != 0 ? e.f2662a : eVar;
        if ((i11 & 8) != 0) {
            i12 = i10 & (-7169);
            currentColors = templateConfiguration.getCurrentColors(lVarP, 8);
        } else {
            currentColors = colors;
            i12 = i10;
        }
        a<i0> aVar2 = (i11 & 16) != 0 ? null : aVar;
        if (o.I()) {
            o.U(-1570484492, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Footer (Footer.kt:55)");
        }
        lVarP.e(-483455358);
        e.a aVar3 = e.f2662a;
        e0 e0VarA = h0.g.a(h0.b.f11594a.h(), f1.b.f11020a.k(), lVarP, 0);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar4 = a2.g.J;
        a<a2.g> aVarA = aVar4.a();
        q<q2<a2.g>, l, Integer, i0> qVarA = u.a(aVar3);
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
        u3.b(lVarA, e0VarA, aVar4.e());
        u3.b(lVarA, wVarB, aVar4.g());
        p<a2.g, Integer, i0> pVarB = aVar4.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        int i13 = i12 << 6;
        Footer(templateConfiguration.getMode(), templateConfiguration.getConfiguration(), currentColors, paywallViewModel, eVar2, aVar2, lVarP, ((i12 >> 3) & 896) | 64 | (i13 & 7168) | (i13 & 57344) | ((i12 << 3) & 458752), 0);
        InsetSpacersKt.SystemBarsSpacer(lVarP, 0);
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
        o2VarV.a(new AnonymousClass2(templateConfiguration, paywallViewModel, eVar2, currentColors, aVar2, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FooterPreview(l lVar, int i10) {
        l lVarP = lVar.p(-1861228911);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1861228911, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.FooterPreview (Footer.kt:270)");
            }
            PaywallMode paywallMode = PaywallMode.FULL_SCREEN;
            List listM = nd.u.m();
            URL url = new URL("https://revenuecat.com/tos");
            URL url2 = new URL("https://revenuecat.com/privacy");
            PaywallData.Configuration.Images images = new PaywallData.Configuration.Images((String) null, (String) null, (String) null, 7, (j) null);
            TestData testData = TestData.INSTANCE;
            Footer(paywallMode, new PaywallData.Configuration(listM, (String) null, images, (Map) null, Template2TestDataKt.getTemplate2(testData).getConfig().getColors(), (Map) null, (List) null, false, true, url, url2, com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_textAppearanceListItemSecondary, (j) null), ColorsFactory.INSTANCE.create(Template2TestDataKt.getTemplate2(testData).getConfig().getColors().getLight()), new MockViewModel(paywallMode, testData.getTemplate2Offering(), false, false, 12, null), null, null, lVarP, 4166, 48);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Separator-RPmYEkk, reason: not valid java name */
    public static final void m150SeparatorRPmYEkk(g0 g0Var, long j10, l lVar, int i10) {
        int i11;
        l lVarP = lVar.p(1035469312);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(g0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & com.pichillilorenzo.flutter_inappwebview_android.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.i(j10) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1035469312, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Separator (Footer.kt:169)");
            }
            e.a aVar = e.f2662a;
            e eVarG = androidx.compose.foundation.layout.p.g(aVar, 0.0f, 1, null);
            b.a aVar2 = f1.b.f11020a;
            e eVarC = g0.c(g0Var, androidx.compose.foundation.layout.p.x(eVarG, aVar2.e(), false, 2, null), 0.5f, false, 2, null);
            lVarP.e(-483455358);
            e0 e0VarA = h0.g.a(h0.b.f11594a.h(), aVar2.k(), lVarP, 0);
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
            h0.i iVar = h0.i.f11664a;
            d.a(androidx.compose.foundation.c.d(i1.g.a(androidx.compose.foundation.layout.p.o(aVar, h.m(5)), l0.g.f()), j10, null, 2, null), lVarP, 0);
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
        o2VarV.a(new FooterKt$Separator$2(g0Var, j10, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openURL(Context context, URL url) {
        String string = url.toString();
        r.e(string, "url.toString()");
        UrisKt.openUriOrElse(context, string, new C06591(context));
    }
}
