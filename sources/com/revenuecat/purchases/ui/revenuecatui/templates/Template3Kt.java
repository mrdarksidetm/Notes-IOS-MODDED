package com.revenuecat.purchases.ui.revenuecatui.templates;

import a2.g;
import ae.r;
import ae.s;
import android.net.Uri;
import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.IconImageKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.InsetSpacersKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import d0.m0;
import f1.b;
import g2.x;
import h0.b;
import h0.f0;
import h0.h;
import h0.h0;
import h0.j0;
import i2.g0;
import java.util.Iterator;
import java.util.List;
import md.i0;
import n2.i0;
import q0.y;
import t0.e2;
import t0.i;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import u2.i;
import y1.e0;
import y1.u;
import zd.a;
import zd.l;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class Template3Kt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Feature$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<x, i0> {
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
            r.f(xVar, "$this$semantics");
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Feature$3, reason: invalid class name */
    static final class AnonymousClass3 extends s implements p<t0.l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ PaywallData.LocalizedConfiguration.Feature $feature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, int i10) {
            super(2);
            this.$feature = feature;
            this.$colors = colors;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            Template3Kt.Feature(this.$feature, this.$colors, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Icon$1, reason: invalid class name and case insensitive filesystem */
    static final class C07091 extends s implements p<t0.l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07091(PaywallState.Loaded.Legacy legacy, int i10) {
            super(2);
            this.$state = legacy;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            Template3Kt.Icon(this.$state, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$LandscapeContent$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<t0.l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ h $this_LandscapeContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(h hVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$this_LandscapeContent = hVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            Template3Kt.LandscapeContent(this.$this_LandscapeContent, this.$state, this.$viewModel, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$PortraitContent$2, reason: invalid class name and case insensitive filesystem */
    static final class C07102 extends s implements p<t0.l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ h $this_PortraitContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07102(h hVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$this_PortraitContent = hVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            Template3Kt.PortraitContent(this.$this_PortraitContent, this.$state, this.$viewModel, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3$2, reason: invalid class name and case insensitive filesystem */
    static final class C07112 extends s implements p<t0.l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07112(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            Template3Kt.Template3(this.$state, this.$viewModel, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3CondensedFooterPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C07121 extends s implements a<i0> {
        public static final C07121 INSTANCE = new C07121();

        C07121() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3CondensedFooterPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C07132 extends s implements p<t0.l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07132(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            Template3Kt.Template3CondensedFooterPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3FooterPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C07141 extends s implements a<i0> {
        public static final C07141 INSTANCE = new C07141();

        C07141() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3FooterPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C07152 extends s implements p<t0.l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07152(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            Template3Kt.Template3FooterPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3Preview$1, reason: invalid class name and case insensitive filesystem */
    static final class C07161 extends s implements a<i0> {
        public static final C07161 INSTANCE = new C07161();

        C07161() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Template3Preview$2, reason: invalid class name and case insensitive filesystem */
    static final class C07172 extends s implements p<t0.l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07172(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            Template3Kt.Template3Preview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt$Title$1, reason: invalid class name and case insensitive filesystem */
    static final class C07181 extends s implements p<t0.l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07181(PaywallState.Loaded.Legacy legacy, int i10) {
            super(2);
            this.$state = legacy;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            Template3Kt.Title(this.$state, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Feature(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, t0.l lVar, int i10) {
        t0.l lVar2;
        t0.l lVarP = lVar.p(-840535719);
        if (o.I()) {
            o.U(-840535719, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Feature (Template3.kt:189)");
        }
        b.a aVar = b.f11020a;
        b.c cVarL = aVar.l();
        e.a aVar2 = e.f2662a;
        e eVarG = androidx.compose.foundation.layout.p.g(aVar2, 0.0f, 1, null);
        UIConstant uIConstant = UIConstant.INSTANCE;
        e eVarK = m.k(eVarG, uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
        Template3UIConstants template3UIConstants = Template3UIConstants.INSTANCE;
        e eVarC = g2.o.c(m.m(eVarK, 0.0f, w2.h.m(template3UIConstants.m267getIconPaddingD9Ej5fM() * 2), 0.0f, 0.0f, 13, null), true, AnonymousClass1.INSTANCE);
        lVarP.e(693286680);
        h0.b bVar = h0.b.f11594a;
        e0 e0VarA = f0.a(bVar.g(), cVarL, lVarP, 48);
        lVarP.e(-1323940314);
        int iA = i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar3 = g.J;
        a<g> aVarA = aVar3.a();
        q<q2<g>, t0.l, Integer, i0> qVarA = u.a(eVarC);
        if (!(lVarP.t() instanceof t0.e)) {
            i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA);
        } else {
            lVarP.D();
        }
        t0.l lVarA = u3.a(lVarP);
        u3.b(lVarA, e0VarA, aVar3.e());
        u3.b(lVarA, wVarB, aVar3.g());
        p<g, Integer, i0> pVarB = aVar3.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0 h0Var = h0.f11663a;
        String iconID = feature.getIconID();
        PaywallIconName paywallIconNameFromValue = iconID != null ? PaywallIconName.Companion.fromValue(iconID) : null;
        lVarP.e(-696457116);
        if (paywallIconNameFromValue != null) {
            e eVarD = c.d(i1.g.a(androidx.compose.foundation.layout.p.o(aVar2, template3UIConstants.m263getFeatureIconSizeD9Ej5fM()), l0.g.f()), colors.m220getAccent20d7_KjU(), null, 2, null);
            lVarP.e(733328855);
            e0 e0VarG = d.g(aVar.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA2 = i.a(lVarP, 0);
            w wVarB2 = lVarP.B();
            a<g> aVarA2 = aVar3.a();
            q<q2<g>, t0.l, Integer, i0> qVarA2 = u.a(eVarD);
            if (!(lVarP.t() instanceof t0.e)) {
                i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA2);
            } else {
                lVarP.D();
            }
            t0.l lVarA2 = u3.a(lVarP);
            u3.b(lVarA2, e0VarG, aVar3.e());
            u3.b(lVarA2, wVarB2, aVar3.g());
            p<g, Integer, i0> pVarB2 = aVar3.b();
            if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
                lVarA2.E(Integer.valueOf(iA2));
                lVarA2.Q(Integer.valueOf(iA2), pVarB2);
            }
            qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            f fVar = f.f2502a;
            PaywallIconKt.m179PaywallIconFNF3uiM(paywallIconNameFromValue, m.i(aVar2, template3UIConstants.m267getIconPaddingD9Ej5fM()), colors.m219getAccent10d7_KjU(), lVarP, 48, 0);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            i0 i0Var = i0.f15558a;
        }
        lVarP.K();
        e eVarM = m.m(aVar2, uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
        lVarP.e(-483455358);
        e0 e0VarA2 = h0.g.a(bVar.h(), aVar.k(), lVarP, 0);
        lVarP.e(-1323940314);
        int iA3 = i.a(lVarP, 0);
        w wVarB3 = lVarP.B();
        a<g> aVarA3 = aVar3.a();
        q<q2<g>, t0.l, Integer, i0> qVarA3 = u.a(eVarM);
        if (!(lVarP.t() instanceof t0.e)) {
            i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA3);
        } else {
            lVarP.D();
        }
        t0.l lVarA3 = u3.a(lVarP);
        u3.b(lVarA3, e0VarA2, aVar3.e());
        u3.b(lVarA3, wVarB3, aVar3.g());
        p<g, Integer, i0> pVarB3 = aVar3.b();
        if (lVarA3.l() || !r.b(lVarA3.f(), Integer.valueOf(iA3))) {
            lVarA3.E(Integer.valueOf(iA3));
            lVarA3.Q(Integer.valueOf(iA3), pVarB3);
        }
        qVarA3.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        y yVar = y.f18928a;
        int i11 = y.f18929b;
        g0 g0VarB = yVar.c(lVarP, i11 | 0).b();
        i0.a aVar4 = n2.i0.f15808b;
        n2.i0 i0VarB = aVar4.b();
        i.a aVar5 = u2.i.f21560b;
        MarkdownKt.m163MarkdownSXj7GJg(feature.getTitle(), null, colors.m227getText10d7_KjU(), g0VarB, 0L, i0VarB, null, null, u2.i.h(aVar5.f()), false, true, lVarP, 196608, 6, 722);
        String content = feature.getContent();
        lVarP.e(-696456182);
        if (content == null) {
            lVar2 = lVarP;
        } else {
            g0 g0VarC = yVar.c(lVarP, i11 | 0).c();
            n2.i0 i0VarG = aVar4.g();
            int iF = aVar5.f();
            long jM228getText20d7_KjU = colors.m228getText20d7_KjU();
            u2.i iVarH = u2.i.h(iF);
            lVar2 = lVarP;
            MarkdownKt.m163MarkdownSXj7GJg(content, null, jM228getText20d7_KjU, g0VarC, 0L, i0VarG, null, null, iVarH, false, true, lVarP, 196608, 6, 722);
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
        o2VarV.a(new AnonymousClass3(feature, colors, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Features-TDGSqEk, reason: not valid java name */
    public static final void m261FeaturesTDGSqEk(h hVar, PaywallState.Loaded.Legacy legacy, float f10, t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(-2122368427);
        if (o.I()) {
            o.U(-2122368427, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Features (Template3.kt:163)");
        }
        List<PaywallData.LocalizedConfiguration.Feature> features = PaywallStateKt.getSelectedLocalization(legacy).getFeatures();
        TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(lVarP, 8);
        if (features.isEmpty()) {
            if (o.I()) {
                o.T();
            }
            o2 o2VarV = lVarP.v();
            if (o2VarV == null) {
                return;
            }
            o2VarV.a(new Template3Kt$Features$1(hVar, legacy, f10, i10));
            return;
        }
        e eVarC = androidx.compose.foundation.layout.p.c(h.b(hVar, m0.f(e.f2662a, m0.c(0, lVarP, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null), 0.0f, 1, null);
        h0.b bVar = h0.b.f11594a;
        b.a aVar = b.f11020a;
        b.m mVarQ = bVar.q(f10, aVar.i());
        lVarP.e(-483455358);
        e0 e0VarA = h0.g.a(mVarQ, aVar.k(), lVarP, 0);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar2 = g.J;
        a<g> aVarA = aVar2.a();
        q<q2<g>, t0.l, Integer, md.i0> qVarA = u.a(eVarC);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA);
        } else {
            lVarP.D();
        }
        t0.l lVarA = u3.a(lVarP);
        u3.b(lVarA, e0VarA, aVar2.e());
        u3.b(lVarA, wVarB, aVar2.g());
        p<g, Integer, md.i0> pVarB = aVar2.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        lVarP.e(-146874150);
        Iterator<T> it = features.iterator();
        while (it.hasNext()) {
            Feature((PaywallData.LocalizedConfiguration.Feature) it.next(), currentColors, lVarP, 8);
        }
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
        o2VarV2.a(new Template3Kt$Features$3(hVar, legacy, f10, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Icon(PaywallState.Loaded.Legacy legacy, t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(-743688035);
        if (o.I()) {
            o.U(-743688035, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Icon (Template3.kt:137)");
        }
        Uri iconUri = legacy.getTemplateConfiguration().getImages().getIconUri();
        Template3UIConstants template3UIConstants = Template3UIConstants.INSTANCE;
        IconImageKt.m153IconImagedjqsMU(iconUri, template3UIConstants.m268getIconSizeD9Ej5fM(), template3UIConstants.m266getIconCornerRadiusD9Ej5fM(), m.m(e.f2662a, 0.0f, UIConstant.INSTANCE.m83getDefaultVerticalSpacingD9Ej5fM(), 0.0f, 0.0f, 13, null), lVarP, 440, 0);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07091(legacy, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LandscapeContent(h hVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(-1763419076);
        if (o.I()) {
            o.U(-1763419076, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.LandscapeContent (Template3.kt:106)");
        }
        b.e eVarA = b.a.f11603a.a();
        b.a aVar = f1.b.f11020a;
        b.c cVarI = aVar.i();
        e.a aVar2 = e.f2662a;
        e eVarB = h.b(hVar, aVar2, 1.0f, false, 2, null);
        UIConstant uIConstant = UIConstant.INSTANCE;
        e eVarK = m.k(m.m(eVarB, 0.0f, uIConstant.m83getDefaultVerticalSpacingD9Ej5fM(), 0.0f, 0.0f, 13, null), uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
        lVarP.e(693286680);
        e0 e0VarA = f0.a(eVarA, cVarI, lVarP, 54);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar3 = g.J;
        a<g> aVarA = aVar3.a();
        q<q2<g>, t0.l, Integer, md.i0> qVarA = u.a(eVarK);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA);
        } else {
            lVarP.D();
        }
        t0.l lVarA = u3.a(lVarP);
        u3.b(lVarA, e0VarA, aVar3.e());
        u3.b(lVarA, wVarB, aVar3.g());
        p<g, Integer, md.i0> pVarB = aVar3.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0 h0Var = h0.f11663a;
        b.InterfaceC0266b interfaceC0266bG = aVar.g();
        h0.b bVar = h0.b.f11594a;
        b.m mVarQ = bVar.q(uIConstant.m83getDefaultVerticalSpacingD9Ej5fM(), aVar.i());
        lVarP.e(-483455358);
        e0 e0VarA2 = h0.g.a(mVarQ, interfaceC0266bG, lVarP, 48);
        lVarP.e(-1323940314);
        int iA2 = t0.i.a(lVarP, 0);
        w wVarB2 = lVarP.B();
        a<g> aVarA2 = aVar3.a();
        q<q2<g>, t0.l, Integer, md.i0> qVarA2 = u.a(aVar2);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA2);
        } else {
            lVarP.D();
        }
        t0.l lVarA2 = u3.a(lVarP);
        u3.b(lVarA2, e0VarA2, aVar3.e());
        u3.b(lVarA2, wVarB2, aVar3.g());
        p<g, Integer, md.i0> pVarB2 = aVar3.b();
        if (lVarA2.l() || !r.b(lVarA2.f(), Integer.valueOf(iA2))) {
            lVarA2.E(Integer.valueOf(iA2));
            lVarA2.Q(Integer.valueOf(iA2), pVarB2);
        }
        qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        j0.a(h.b(iVar, aVar2, 0.5f, false, 2, null), lVarP, 0);
        Icon(legacy, lVarP, 8);
        Title(legacy, lVarP, 8);
        j0.a(h.b(iVar, aVar2, 0.5f, false, 2, null), lVarP, 0);
        lVarP.K();
        lVarP.L();
        lVarP.K();
        lVarP.K();
        lVarP.e(-483455358);
        e0 e0VarA3 = h0.g.a(bVar.h(), aVar.k(), lVarP, 0);
        lVarP.e(-1323940314);
        int iA3 = t0.i.a(lVarP, 0);
        w wVarB3 = lVarP.B();
        a<g> aVarA3 = aVar3.a();
        q<q2<g>, t0.l, Integer, md.i0> qVarA3 = u.a(aVar2);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA3);
        } else {
            lVarP.D();
        }
        t0.l lVarA3 = u3.a(lVarP);
        u3.b(lVarA3, e0VarA3, aVar3.e());
        u3.b(lVarA3, wVarB3, aVar3.g());
        p<g, Integer, md.i0> pVarB3 = aVar3.b();
        if (lVarA3.l() || !r.b(lVarA3.f(), Integer.valueOf(iA3))) {
            lVarA3.E(Integer.valueOf(iA3));
            lVarA3.Q(Integer.valueOf(iA3), pVarB3);
        }
        qVarA3.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        m261FeaturesTDGSqEk(iVar, legacy, Template3UIConstants.INSTANCE.m264getFeatureSpacingLandscapeD9Ej5fM(), lVarP, 454);
        OfferDetailsKt.m177OfferDetailsRPmYEkk(legacy, legacy.getTemplateConfiguration().getCurrentColors(lVarP, 8).m228getText20d7_KjU(), lVarP, 8);
        PurchaseButtonKt.m185PurchaseButtonhGBTI10(legacy, paywallViewModel, null, w2.h.m(0), null, lVarP, ((i10 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3080, 20);
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
        o2VarV.a(new AnonymousClass2(hVar, legacy, paywallViewModel, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortraitContent(h hVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(949126752);
        if (o.I()) {
            o.U(949126752, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.PortraitContent (Template3.kt:77)");
        }
        lVarP.e(-699744152);
        if (PaywallStateKt.isInFullScreenMode(legacy)) {
            e eVarG = androidx.compose.foundation.layout.p.g(h.b(hVar, e.f2662a, 1.0f, false, 2, null), 0.0f, 1, null);
            UIConstant uIConstant = UIConstant.INSTANCE;
            e eVarJ = m.j(eVarG, uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m83getDefaultVerticalSpacingD9Ej5fM());
            b.a aVar = f1.b.f11020a;
            b.InterfaceC0266b interfaceC0266bG = aVar.g();
            b.m mVarQ = h0.b.f11594a.q(uIConstant.m83getDefaultVerticalSpacingD9Ej5fM(), aVar.l());
            lVarP.e(-483455358);
            e0 e0VarA = h0.g.a(mVarQ, interfaceC0266bG, lVarP, 48);
            lVarP.e(-1323940314);
            int iA = t0.i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar2 = g.J;
            a<g> aVarA = aVar2.a();
            q<q2<g>, t0.l, Integer, md.i0> qVarA = u.a(eVarJ);
            if (!(lVarP.t() instanceof t0.e)) {
                t0.i.b();
            }
            lVarP.r();
            if (lVarP.l()) {
                lVarP.O(aVarA);
            } else {
                lVarP.D();
            }
            t0.l lVarA = u3.a(lVarP);
            u3.b(lVarA, e0VarA, aVar2.e());
            u3.b(lVarA, wVarB, aVar2.g());
            p<g, Integer, md.i0> pVarB = aVar2.b();
            if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            h0.i iVar = h0.i.f11664a;
            InsetSpacersKt.StatusBarSpacer(lVarP, 0);
            Icon(legacy, lVarP, 8);
            Title(legacy, lVarP, 8);
            m261FeaturesTDGSqEk(iVar, legacy, Template3UIConstants.INSTANCE.m265getFeatureSpacingPortraitD9Ej5fM(), lVarP, 454);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
        }
        lVarP.K();
        j0.a(androidx.compose.foundation.layout.p.h(e.f2662a, UIConstant.INSTANCE.m83getDefaultVerticalSpacingD9Ej5fM()), lVarP, 0);
        OfferDetailsKt.m177OfferDetailsRPmYEkk(legacy, legacy.getTemplateConfiguration().getCurrentColors(lVarP, 8).m228getText20d7_KjU(), lVarP, 8);
        PurchaseButtonKt.m185PurchaseButtonhGBTI10(legacy, paywallViewModel, null, 0.0f, null, lVarP, ((i10 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8, 28);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07102(hVar, legacy, paywallViewModel, i10));
    }

    public static final void Template3(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, t0.l lVar, int i10) {
        r.f(legacy, "state");
        r.f(paywallViewModel, "viewModel");
        t0.l lVarP = lVar.p(-533890389);
        if (o.I()) {
            o.U(-533890389, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template3 (Template3.kt:61)");
        }
        lVarP.e(-483455358);
        e.a aVar = e.f2662a;
        e0 e0VarA = h0.g.a(h0.b.f11594a.h(), f1.b.f11020a.k(), lVarP, 0);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar2 = g.J;
        a<g> aVarA = aVar2.a();
        q<q2<g>, t0.l, Integer, md.i0> qVarA = u.a(aVar);
        if (!(lVarP.t() instanceof t0.e)) {
            t0.i.b();
        }
        lVarP.r();
        if (lVarP.l()) {
            lVarP.O(aVarA);
        } else {
            lVarP.D();
        }
        t0.l lVarA = u3.a(lVarP);
        u3.b(lVarA, e0VarA, aVar2.e());
        u3.b(lVarA, wVarB, aVar2.g());
        p<g, Integer, md.i0> pVarB = aVar2.b();
        if (lVarA.l() || !r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        h0.i iVar = h0.i.f11664a;
        if (WindowHelperKt.shouldUseLandscapeLayout(legacy, lVarP, 8)) {
            lVarP.e(-229745419);
            LandscapeContent(iVar, legacy, paywallViewModel, lVarP, ((i10 << 3) & 896) | 70);
        } else {
            lVarP.e(-229745355);
            PortraitContent(iVar, legacy, paywallViewModel, lVarP, ((i10 << 3) & 896) | 70);
        }
        lVarP.K();
        FooterKt.Footer(legacy.getTemplateConfiguration(), paywallViewModel, null, null, null, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8, 28);
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
        o2VarV.a(new C07112(legacy, paywallViewModel, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template3CondensedFooterPreview(t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(1430130282);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1430130282, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template3CondensedFooterPreview (Template3.kt:272)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C07121.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate3Offering(), false, false, 12, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07132(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template3FooterPreview(t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(-377072487);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-377072487, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template3FooterPreview (Template3.kt:263)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C07141.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate3Offering(), false, false, 12, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07152(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template3Preview(t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(2025889118);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(2025889118, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template3Preview (Template3.kt:254)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C07161.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate3Offering(), false, false, 13, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07172(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(PaywallState.Loaded.Legacy legacy, t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(887524410);
        if (o.I()) {
            o.U(887524410, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Title (Template3.kt:149)");
        }
        MarkdownKt.m163MarkdownSXj7GJg(PaywallStateKt.getSelectedLocalization(legacy).getTitle(), null, legacy.getTemplateConfiguration().getCurrentColors(lVarP, 8).m227getText10d7_KjU(), y.f18928a.c(lVarP, y.f18929b | 0).i(), 0L, n2.i0.f15808b.h(), null, null, u2.i.h(u2.i.f21560b.a()), false, true, lVarP, 196608, 6, 722);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C07181(legacy, i10));
    }
}
