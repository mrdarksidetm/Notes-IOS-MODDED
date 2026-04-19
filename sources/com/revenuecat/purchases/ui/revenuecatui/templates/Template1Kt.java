package com.revenuecat.purchases.ui.revenuecatui.templates;

import a2.g;
import ae.s;
import android.graphics.Matrix;
import android.net.Uri;
import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import d0.m0;
import f1.b;
import h0.b;
import h0.h;
import i1.g;
import i2.g0;
import k1.f;
import k1.i;
import l1.b1;
import l1.f1;
import l1.j0;
import l1.k;
import l1.t1;
import md.i0;
import n2.i0;
import q0.y;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import t0.q2;
import t0.u3;
import t0.w;
import u2.i;
import w2.d;
import w2.r;
import y1.e0;
import y1.u;
import zd.a;
import zd.p;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
public final class Template1Kt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$CircleMask$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p<l, Integer, i0> $content;
        final /* synthetic */ boolean $landscapeLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z10, p<? super l, ? super Integer, i0> pVar, int i10) {
            super(2);
            this.$landscapeLayout = z10;
            this.$content = pVar;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template1Kt.CircleMask(this.$landscapeLayout, this.$content, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$CircleMaskPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C06872 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06872(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template1Kt.CircleMaskPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$HeaderImage$2, reason: invalid class name and case insensitive filesystem */
    static final class C06882 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $landscapeLayout;
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06882(Uri uri, boolean z10, int i10) {
            super(2);
            this.$uri = uri;
            this.$landscapeLayout = z10;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template1Kt.HeaderImage(this.$uri, this.$landscapeLayout, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1$2, reason: invalid class name and case insensitive filesystem */
    static final class C06892 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06892(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i10) {
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
            Template1Kt.Template1(this.$state, this.$viewModel, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1CondensedFooterPaywallPreview$1, reason: invalid class name */
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1CondensedFooterPaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C06902 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06902(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template1Kt.Template1CondensedFooterPaywallPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1FooterPaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C06911 extends s implements a<i0> {
        public static final C06911 INSTANCE = new C06911();

        C06911() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1FooterPaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C06922 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06922(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template1Kt.Template1FooterPaywallPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1MainContent$2, reason: invalid class name and case insensitive filesystem */
    static final class C06932 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ h $this_Template1MainContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06932(h hVar, PaywallState.Loaded.Legacy legacy, int i10) {
            super(2);
            this.$this_Template1MainContent = hVar;
            this.$state = legacy;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template1Kt.Template1MainContent(this.$this_Template1MainContent, this.$state, lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1NoFooterPaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C06941 extends s implements a<i0> {
        public static final C06941 INSTANCE = new C06941();

        C06941() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1NoFooterPaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C06952 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06952(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template1Kt.Template1NoFooterPaywallPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1PaywallPreview$1, reason: invalid class name and case insensitive filesystem */
    static final class C06961 extends s implements a<i0> {
        public static final C06961 INSTANCE = new C06961();

        C06961() {
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$Template1PaywallPreview$2, reason: invalid class name and case insensitive filesystem */
    static final class C06972 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06972(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            Template1Kt.Template1PaywallPreview(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CircleMask(boolean z10, p<? super l, ? super Integer, i0> pVar, l lVar, int i10) {
        int i11;
        l lVarP = lVar.p(-1244949301);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= lVarP.k(pVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-1244949301, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CircleMask (Template1.kt:157)");
            }
            final float f10 = z10 ? 8.0f : 3.0f;
            e eVarA = g.a(e.f2662a, new t1() { // from class: com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt$CircleMask$clipShape$1
                @Override // l1.t1
                /* JADX INFO: renamed from: createOutline-Pq9zytI, reason: not valid java name */
                public b1 mo253createOutlinePq9zytI(long j10, r rVar, d dVar) {
                    ae.r.f(rVar, "layoutDirection");
                    ae.r.f(dVar, "density");
                    Matrix matrix = new Matrix();
                    float f11 = f10;
                    matrix.preScale(f11, f11);
                    matrix.postTranslate(Template1Kt.CircleMask$circleOffsetX(f10, j10), Template1Kt.CircleMask$circleOffsetY(f10, j10));
                    f1 f1VarA = l1.p.a();
                    f1VarA.j(i.a(f.f14338b.c(), j10));
                    if (!(f1VarA instanceof k)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((k) f1VarA).s().transform(matrix);
                    return new b1.a(f1VarA);
                }
            });
            lVarP.e(733328855);
            e0 e0VarG = androidx.compose.foundation.layout.d.g(b.f11020a.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA = t0.i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar = a2.g.J;
            a<a2.g> aVarA = aVar.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarA);
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
            p<a2.g, Integer, i0> pVarB = aVar.b();
            if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f2502a;
            pVar.invoke(lVarP, Integer.valueOf((i11 >> 3) & 14));
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
        o2VarV.a(new AnonymousClass2(z10, pVar, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircleMask$circleOffsetX(float f10, long j10) {
        return (((k1.l.i(j10) * f10) - k1.l.i(j10)) / 2.0f) * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircleMask$circleOffsetY(float f10, long j10) {
        return ((k1.l.g(j10) * f10) - k1.l.g(j10)) * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CircleMaskPreview(l lVar, int i10) {
        l lVarP = lVar.p(-414705569);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-414705569, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CircleMaskPreview (Template1.kt:248)");
            }
            lVarP.e(733328855);
            e.a aVar = e.f2662a;
            e0 e0VarG = androidx.compose.foundation.layout.d.g(b.f11020a.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA = t0.i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar2 = a2.g.J;
            a<a2.g> aVarA = aVar2.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(aVar);
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
            u3.b(lVarA, e0VarG, aVar2.e());
            u3.b(lVarA, wVarB, aVar2.g());
            p<a2.g, Integer, i0> pVarB = aVar2.b();
            if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f2502a;
            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.layout.p.e(c.d(aVar, j0.f14524b.h(), null, 2, null), 0.0f, 1, null), lVarP, 6);
            CircleMask(false, ComposableSingletons$Template1Kt.INSTANCE.m248getLambda1$revenuecatui_defaultsRelease(), lVarP, 54);
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
        o2VarV.a(new C06872(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HeaderImage(Uri uri, boolean z10, l lVar, int i10) {
        l lVarP = lVar.p(2030386997);
        if (o.I()) {
            o.U(2030386997, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.HeaderImage (Template1.kt:137)");
        }
        if (uri != null) {
            CircleMask(z10, b1.c.b(lVarP, 1134746342, true, new Template1Kt$HeaderImage$1$1(uri, z10)), lVarP, ((i10 >> 3) & 14) | 48);
        }
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06882(uri, z10, i10));
    }

    public static final void Template1(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, l lVar, int i10) {
        ae.r.f(legacy, "state");
        ae.r.f(paywallViewModel, "viewModel");
        l lVarP = lVar.p(1499444075);
        if (o.I()) {
            o.U(1499444075, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1 (Template1.kt:60)");
        }
        e eVarG = androidx.compose.foundation.layout.p.g(e.f2662a, 0.0f, 1, null);
        b.InterfaceC0266b interfaceC0266bG = b.f11020a.g();
        lVarP.e(-483455358);
        e0 e0VarA = h0.g.a(h0.b.f11594a.h(), interfaceC0266bG, lVarP, 48);
        lVarP.e(-1323940314);
        int iA = t0.i.a(lVarP, 0);
        w wVarB = lVarP.B();
        g.a aVar = a2.g.J;
        a<a2.g> aVarA = aVar.a();
        q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarG);
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
        p<a2.g, Integer, i0> pVarB = aVar.b();
        if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
            lVarA.E(Integer.valueOf(iA));
            lVarA.Q(Integer.valueOf(iA), pVarB);
        }
        qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
        lVarP.e(2058660585);
        Template1MainContent(h0.i.f11664a, legacy, lVarP, 70);
        int i11 = (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8;
        PurchaseButtonKt.m185PurchaseButtonhGBTI10(legacy, paywallViewModel, null, 0.0f, null, lVarP, i11, 28);
        FooterKt.Footer(legacy.getTemplateConfiguration(), paywallViewModel, null, null, null, lVarP, i11, 28);
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
        o2VarV.a(new C06892(legacy, paywallViewModel, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template1CondensedFooterPaywallPreview(l lVar, int i10) {
        l lVarP = lVar.p(-527429650);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-527429650, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1CondensedFooterPaywallPreview (Template1.kt:239)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(AnonymousClass1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate1Offering(), false, false, 12, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06902(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template1FooterPaywallPreview(l lVar, int i10) {
        l lVarP = lVar.p(1625504547);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1625504547, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1FooterPaywallPreview (Template1.kt:230)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C06911.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate1Offering(), false, false, 12, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06922(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template1MainContent(h hVar, PaywallState.Loaded.Legacy legacy, l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(-1400671009);
        if (o.I()) {
            o.U(-1400671009, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1MainContent (Template1.kt:74)");
        }
        ProcessedLocalizedConfiguration selectedLocalization = PaywallStateKt.getSelectedLocalization(legacy);
        TemplateConfiguration.Colors currentColors = PaywallStateKt.getCurrentColors(legacy, lVarP, 8);
        if (PaywallStateKt.isInFullScreenMode(legacy)) {
            lVarP.e(-1867209151);
            boolean zShouldUseLandscapeLayout = WindowHelperKt.shouldUseLandscapeLayout(legacy, lVarP, 8);
            e.a aVar = e.f2662a;
            e eVarB = h.b(hVar, androidx.compose.foundation.layout.p.c(m0.f(androidx.compose.foundation.layout.p.g(aVar, 0.0f, 1, null), m0.c(0, lVarP, 0, 1), false, null, false, 14, null), 0.0f, 1, null), 1.0f, false, 2, null);
            b.a aVar2 = b.f11020a;
            b.InterfaceC0266b interfaceC0266bG = aVar2.g();
            b.f fVarB = h0.b.f11594a.b();
            lVarP.e(-483455358);
            e0 e0VarA = h0.g.a(fVarB, interfaceC0266bG, lVarP, 54);
            lVarP.e(-1323940314);
            int iA = t0.i.a(lVarP, 0);
            w wVarB = lVarP.B();
            g.a aVar3 = a2.g.J;
            a<a2.g> aVarA = aVar3.a();
            q<q2<a2.g>, l, Integer, i0> qVarA = u.a(eVarB);
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
            if (lVarA.l() || !ae.r.b(lVarA.f(), Integer.valueOf(iA))) {
                lVarA.E(Integer.valueOf(iA));
                lVarA.Q(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            h0.i iVar = h0.i.f11664a;
            HeaderImage(legacy.getTemplateConfiguration().getImages().getHeaderUri(), zShouldUseLandscapeLayout, lVarP, 8);
            h0.j0.a(h.b(iVar, aVar, 1.0f, false, 2, null), lVarP, 0);
            String title = selectedLocalization.getTitle();
            y yVar = y.f18928a;
            int i11 = y.f18929b;
            g0 g0VarG = yVar.c(lVarP, i11 | 0).g();
            i0.a aVar4 = n2.i0.f15808b;
            n2.i0 i0VarA = aVar4.a();
            i.a aVar5 = u2.i.f21560b;
            int iA2 = aVar5.a();
            long jM227getText10d7_KjU = currentColors.m227getText10d7_KjU();
            UIConstant uIConstant = UIConstant.INSTANCE;
            MarkdownKt.m163MarkdownSXj7GJg(title, m.j(aVar, uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m83getDefaultVerticalSpacingD9Ej5fM()), jM227getText10d7_KjU, g0VarG, 0L, i0VarA, null, null, u2.i.h(iA2), false, true, lVarP, 196608, 6, 720);
            e eVarK = m.k(aVar, uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
            lVarP.e(733328855);
            e0 e0VarG = androidx.compose.foundation.layout.d.g(aVar2.o(), false, lVarP, 0);
            lVarP.e(-1323940314);
            int iA3 = t0.i.a(lVarP, 0);
            w wVarB2 = lVarP.B();
            a<a2.g> aVarA2 = aVar3.a();
            q<q2<a2.g>, l, Integer, md.i0> qVarA2 = u.a(eVarK);
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
            u3.b(lVarA2, e0VarG, aVar3.e());
            u3.b(lVarA2, wVarB2, aVar3.g());
            p<a2.g, Integer, md.i0> pVarB2 = aVar3.b();
            if (lVarA2.l() || !ae.r.b(lVarA2.f(), Integer.valueOf(iA3))) {
                lVarA2.E(Integer.valueOf(iA3));
                lVarA2.Q(Integer.valueOf(iA3), pVarB2);
            }
            qVarA2.invoke(q2.a(q2.b(lVarP)), lVarP, 0);
            lVarP.e(2058660585);
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f2502a;
            String subtitle = selectedLocalization.getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            MarkdownKt.m163MarkdownSXj7GJg(subtitle, m.j(aVar, uIConstant.m80getDefaultHorizontalPaddingD9Ej5fM(), uIConstant.m83getDefaultVerticalSpacingD9Ej5fM()), currentColors.m227getText10d7_KjU(), yVar.c(lVarP, i11 | 0).b(), 0L, aVar4.g(), null, null, u2.i.h(aVar5.a()), false, true, lVarP, 196608, 6, 720);
            lVarP.K();
            lVarP.L();
            lVarP.K();
            lVarP.K();
            lVar2 = lVarP;
            h0.j0.a(h.b(iVar, aVar, 2.0f, false, 2, null), lVar2, 0);
            lVar2.K();
            lVar2.L();
            lVar2.K();
            lVar2.K();
        } else {
            lVar2 = lVarP;
            lVar2.e(-1867207204);
            h0.j0.a(androidx.compose.foundation.layout.p.h(e.f2662a, UIConstant.INSTANCE.m83getDefaultVerticalSpacingD9Ej5fM()), lVar2, 0);
        }
        lVar2.K();
        OfferDetailsKt.OfferDetails(legacy, null, lVar2, 8, 2);
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06932(hVar, legacy, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template1NoFooterPaywallPreview(l lVar, int i10) {
        l lVarP = lVar.p(363342818);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(363342818, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1NoFooterPaywallPreview (Template1.kt:221)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C06941.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate1OfferingNoFooter(), false, false, 13, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06952(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Template1PaywallPreview(l lVar, int i10) {
        l lVarP = lVar.p(854103102);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(854103102, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1PaywallPreview (Template1.kt:212)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(C06961.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate1Offering(), false, false, 13, null), lVarP, 64, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06972(i10));
    }
}
