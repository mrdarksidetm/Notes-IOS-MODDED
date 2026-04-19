package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import ae.j;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.e;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ThemeImageUrlsKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import l1.j0;
import l1.l0;
import l1.t1;
import md.i0;
import md.q;
import nd.u;
import o1.c;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import w2.h;
import y1.f;
import z5.i;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundStyleKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt$Background_Preview_ColorGradientLinear$1, reason: invalid class name */
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
            BackgroundStyleKt.Background_Preview_ColorGradientLinear(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt$Background_Preview_ColorGradientRadial$1, reason: invalid class name and case insensitive filesystem */
    static final class C06441 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06441(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            BackgroundStyleKt.Background_Preview_ColorGradientRadial(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt$Background_Preview_ColorHex$1, reason: invalid class name and case insensitive filesystem */
    static final class C06451 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06451(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            BackgroundStyleKt.Background_Preview_ColorHex(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Background_Preview_ColorGradientLinear(l lVar, int i10) {
        l lVarP = lVar.p(1587277957);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1587277957, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.Background_Preview_ColorGradientLinear (BackgroundStyle.kt:77)");
            }
            e eVarL = androidx.compose.foundation.layout.p.l(e.f2662a, h.m(100));
            j0.a aVar = j0.f14524b;
            d.a(BackgroundKt.background$default(eVarL, toBackgroundStyle(new Background.Color(new ColorScheme(new ColorInfo.Gradient.Linear(0.0f, u.p(new ColorInfo.Gradient.Point(l0.i(aVar.h()), 0.0f), new ColorInfo.Gradient.Point(l0.i(aVar.f()), 0.5f), new ColorInfo.Gradient.Point(l0.i(aVar.b()), 1.0f))), (ColorInfo) null, 2, (j) null)), lVarP, 8), (t1) null, 2, (Object) null), lVarP, 0);
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
    public static final void Background_Preview_ColorGradientRadial(l lVar, int i10) {
        l lVarP = lVar.p(1823976651);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(1823976651, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.Background_Preview_ColorGradientRadial (BackgroundStyle.kt:109)");
            }
            e eVarL = androidx.compose.foundation.layout.p.l(e.f2662a, h.m(100));
            j0.a aVar = j0.f14524b;
            d.a(BackgroundKt.background$default(eVarL, toBackgroundStyle(new Background.Color(new ColorScheme(new ColorInfo.Gradient.Radial(u.p(new ColorInfo.Gradient.Point(l0.i(aVar.h()), 0.0f), new ColorInfo.Gradient.Point(l0.i(aVar.f()), 0.5f), new ColorInfo.Gradient.Point(l0.i(aVar.b()), 1.0f))), (ColorInfo) null, 2, (j) null)), lVarP, 8), (t1) null, 2, (Object) null), lVarP, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06441(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Background_Preview_ColorHex(l lVar, int i10) {
        l lVarP = lVar.p(529543697);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(529543697, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.Background_Preview_ColorHex (BackgroundStyle.kt:61)");
            }
            d.a(BackgroundKt.background$default(androidx.compose.foundation.layout.p.l(e.f2662a, h.m(100)), toBackgroundStyle(new Background.Color(new ColorScheme(new ColorInfo.Hex(l0.i(j0.f14524b.h())), (ColorInfo) null, 2, (j) null)), lVarP, 8), (t1) null, 2, (Object) null), lVarP, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06451(i10));
    }

    public static final /* synthetic */ BackgroundStyle toBackgroundStyle(Background background, l lVar, int i10) {
        BackgroundStyle backgroundStyleM99boximpl;
        r.f(background, "<this>");
        lVar.e(655417884);
        if (o.I()) {
            o.U(655417884, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.toBackgroundStyle (BackgroundStyle.kt:32)");
        }
        if (background instanceof Background.Color) {
            lVar.e(-1494138305);
            ColorStyle colorStyleM93constructorimpl = BackgroundStyle.Color.m93constructorimpl(ColorStyleKt.toColorStyle(((Background.Color) background).getValue(), lVar, 8));
            lVar.K();
            backgroundStyleM99boximpl = BackgroundStyle.Color.m92boximpl(colorStyleM93constructorimpl);
        } else {
            if (!(background instanceof Background.Image)) {
                lVar.e(-1494139709);
                lVar.K();
                throw new q();
            }
            lVar.e(-1494138238);
            ImageUrls urlsForCurrentTheme = ThemeImageUrlsKt.getUrlsForCurrentTheme(((Background.Image) background).getValue(), lVar, 8);
            String string = urlsForCurrentTheme.getWebp().toString();
            String string2 = urlsForCurrentTheme.getWebpLowRes().toString();
            f.a aVar = f.f23237a;
            c cVarM100constructorimpl = BackgroundStyle.Image.m100constructorimpl(i.a(string, i.a(string2, null, null, null, null, null, null, aVar.a(), 0, lVar, 12586368, 370), null, null, null, null, null, aVar.a(), 0, lVar, 12586368, 368));
            lVar.K();
            backgroundStyleM99boximpl = BackgroundStyle.Image.m99boximpl(cVarM100constructorimpl);
        }
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return backgroundStyleM99boximpl;
    }

    public static final /* synthetic */ BackgroundStyle toBackgroundStyle(ColorScheme colorScheme, l lVar, int i10) {
        r.f(colorScheme, "<this>");
        lVar.e(1479586490);
        if (o.I()) {
            o.U(1479586490, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.toBackgroundStyle (BackgroundStyle.kt:56)");
        }
        ColorStyle colorStyleM93constructorimpl = BackgroundStyle.Color.m93constructorimpl(ColorStyleKt.toColorStyle(colorScheme, lVar, 8));
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return BackgroundStyle.Color.m92boximpl(colorStyleM93constructorimpl);
    }
}
