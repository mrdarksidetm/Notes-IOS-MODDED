package com.revenuecat.purchases.ui.revenuecatui.extensions;

import ae.j;
import ae.r;
import ae.s;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockResourceProvider;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l1.l0;
import md.i0;
import md.x;
import nd.q0;
import nd.r0;
import nd.u;
import nd.v;
import q0.h;
import q0.y;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import zd.a;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallDataExtensionsKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt$DefaultPaywallFooterCondensedPreview$1, reason: invalid class name */
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt$DefaultPaywallFooterCondensedPreview$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            PaywallDataExtensionsKt.DefaultPaywallFooterCondensedPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt$DefaultPaywallFooterPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C06831 extends s implements a<i0> {
        public static final C06831 INSTANCE = new C06831();

        C06831() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt$DefaultPaywallFooterPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C06842 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06842(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            PaywallDataExtensionsKt.DefaultPaywallFooterPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt$DefaultPaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C06851 extends s implements a<i0> {
        public static final C06851 INSTANCE = new C06851();

        C06851() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt$DefaultPaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C06862 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06862(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            PaywallDataExtensionsKt.DefaultPaywallPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    public static final void DefaultPaywallFooterCondensedPreview(l lVar, int i10) {
        l lVarP = lVar.p(-1110154474);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1110154474, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.DefaultPaywallFooterCondensedPreview (PaywallDataExtensions.kt:168)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(AnonymousClass1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, getDefaultPreviewOffering(lVarP, 0), false, false, 12, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass2(i10));
    }

    public static final void DefaultPaywallFooterPreview(l lVar, int i10) {
        l lVarP = lVar.p(1073266441);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1073266441, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.DefaultPaywallFooterPreview (PaywallDataExtensions.kt:159)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C06831.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, getDefaultPreviewOffering(lVarP, 0), false, false, 12, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06842(i10));
    }

    public static final void DefaultPaywallPreview(l lVar, int i10) {
        l lVarP = lVar.p(1231396708);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1231396708, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.DefaultPaywallPreview (PaywallDataExtensions.kt:150)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C06851.INSTANCE).build(), new MockViewModel(null, getDefaultPreviewOffering(lVarP, 0), false, false, 13, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06862(i10));
    }

    /* JADX INFO: renamed from: asPaywallColor-8_81llA, reason: not valid java name */
    private static final PaywallColor m245asPaywallColor8_81llA(long j10) {
        return new PaywallColor(l0.i(j10));
    }

    public static final PaywallData createDefault(PaywallData.Companion companion, List<Package> list, h hVar, ResourceProvider resourceProvider) {
        r.f(companion, "<this>");
        r.f(list, "packages");
        r.f(hVar, "currentColorScheme");
        r.f(resourceProvider, "resourceProvider");
        PaywallData.Companion companion2 = PaywallData.Companion;
        ArrayList arrayList = new ArrayList(v.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Package) it.next()).getIdentifier());
        }
        return createDefaultForIdentifiers(companion2, arrayList, hVar, resourceProvider);
    }

    public static final PaywallData createDefaultForIdentifiers(PaywallData.Companion companion, List<String> list, h hVar, ResourceProvider resourceProvider) {
        r.f(companion, "<this>");
        r.f(list, "packageIdentifiers");
        r.f(hVar, "currentColors");
        r.f(resourceProvider, "resourceProvider");
        PaywallData.Companion companion2 = PaywallData.Companion;
        return new PaywallData(getDefaultTemplate(companion2).getId(), new PaywallData.Configuration((List) list, (String) null, new PaywallData.Configuration.Images((String) null, getDefaultBackgroundPlaceholder(companion2), getDefaultAppIconPlaceholder(companion2), 1, (j) null), (Map) null, defaultColors(companion2, hVar), (Map) null, (List) null, true, true, (URL) null, (URL) null, 1642, (j) null), getDefaultTemplateBaseURL(companion2), getRevisionID(companion2), q0.c(x.a(resourceProvider.getLocale().toString(), defaultLocalization(companion2, resourceProvider))), (Map) null, getZeroDecimalPlaceCountries(companion2), (String) null, 160, (j) null);
    }

    private static final PaywallData.Configuration.ColorInformation defaultColors(PaywallData.Companion companion, h hVar) {
        PaywallData.Configuration.Colors themeColors = getThemeColors(hVar);
        return new PaywallData.Configuration.ColorInformation(themeColors, themeColors);
    }

    private static final PaywallData.LocalizedConfiguration defaultLocalization(PaywallData.Companion companion, ResourceProvider resourceProvider) {
        return new PaywallData.LocalizedConfiguration("{{ app_name }}", (String) null, resourceProvider.getString(R.string.continue_cta, new Object[0]), (String) null, (String) null, "{{ total_price_and_per_month }}", resourceProvider.getString(R.string.default_offer_details_with_intro_offer, new Object[0]), (String) null, "{{ sub_period }}", (List) null, (String) null, (Map) null, 3738, (j) null);
    }

    public static final String getDefaultAppIconPlaceholder(PaywallData.Companion companion) {
        r.f(companion, "<this>");
        return "revenuecatui_default_paywall_app_icon";
    }

    public static final String getDefaultBackgroundPlaceholder(PaywallData.Companion companion) {
        r.f(companion, "<this>");
        return "revenuecatui_default_paywall_background";
    }

    private static final Offering getDefaultPreviewOffering(l lVar, int i10) {
        lVar.e(-363130030);
        if (o.I()) {
            o.U(-363130030, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.getDefaultPreviewOffering (PaywallDataExtensions.kt:127)");
        }
        TestData.Packages packages = TestData.Packages.INSTANCE;
        List listP = u.p(packages.getWeekly(), packages.getMonthly(), packages.getAnnual());
        Offering offering = new Offering("Template2", "", r0.e(), listP, createDefault(PaywallData.Companion, listP, y.f18928a.a(lVar, y.f18929b | 0), new MockResourceProvider()));
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return offering;
    }

    public static final PaywallTemplate getDefaultTemplate(PaywallData.Companion companion) {
        r.f(companion, "<this>");
        return PaywallTemplate.TEMPLATE_2;
    }

    private static final URL getDefaultTemplateBaseURL(PaywallData.Companion companion) {
        return new URL("https://");
    }

    private static final int getRevisionID(PaywallData.Companion companion) {
        return -1;
    }

    private static final PaywallData.Configuration.Colors getThemeColors(h hVar) {
        return new PaywallData.Configuration.Colors(m245asPaywallColor8_81llA(hVar.a()), m245asPaywallColor8_81llA(hVar.i()), (PaywallColor) null, (PaywallColor) null, m245asPaywallColor8_81llA(hVar.z()), m245asPaywallColor8_81llA(hVar.a()), (PaywallColor) null, m245asPaywallColor8_81llA(hVar.w()), m245asPaywallColor8_81llA(hVar.h()), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 32332, (j) null);
    }

    private static final List<String> getZeroDecimalPlaceCountries(PaywallData.Companion companion) {
        return u.m();
    }
}
