package com.revenuecat.purchases.ui.revenuecatui.components.button;

import ae.j;
import ae.r;
import ae.s;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.FontSize;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import l0.g;
import l1.j0;
import l1.l0;
import md.i0;
import nd.t;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import w2.h;
import zd.a;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ButtonComponentViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ ButtonComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ButtonComponentStyle buttonComponentStyle, e eVar, int i10, int i11) {
            super(2);
            this.$style = buttonComponentStyle;
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
            ButtonComponentViewKt.ButtonComponentView(this.$style, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView_Preview_Default$1, reason: invalid class name */
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
            ButtonComponentViewKt.ButtonComponentView_Preview_Default(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$previewButtonComponentStyle$1, reason: invalid class name and case insensitive filesystem */
    static final class C06231 extends s implements zd.l<PaywallAction, i0> {
        public static final C06231 INSTANCE = new C06231();

        C06231() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PaywallAction paywallAction) {
            invoke2(paywallAction);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PaywallAction paywallAction) {
            r.f(paywallAction, "it");
        }
    }

    public static final void ButtonComponentView(ButtonComponentStyle buttonComponentStyle, e eVar, l lVar, int i10, int i11) {
        int i12;
        r.f(buttonComponentStyle, "style");
        l lVarP = lVar.p(1550236388);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (lVarP.N(buttonComponentStyle) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= lVarP.N(eVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarP.s()) {
            lVarP.x();
        } else {
            if (i13 != 0) {
                eVar = e.f2662a;
            }
            if (o.I()) {
                o.U(1550236388, i12, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentView (ButtonComponentView.kt:34)");
            }
            StackComponentStyle stackComponentStyle = buttonComponentStyle.getStackComponentStyle();
            lVarP.e(1157296644);
            boolean zN = lVarP.N(buttonComponentStyle);
            Object objF = lVarP.f();
            if (zN || objF == l.f20813a.a()) {
                objF = new ButtonComponentViewKt$ButtonComponentView$1$1(buttonComponentStyle);
                lVarP.E(objF);
            }
            lVarP.K();
            StackComponentViewKt.StackComponentView(stackComponentStyle, androidx.compose.foundation.e.e(eVar, false, null, null, (a) objF, 7, null), lVarP, 0, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass2(buttonComponentStyle, eVar, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ButtonComponentView_Preview_Default(l lVar, int i10) {
        l lVarP = lVar.p(-291258808);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(-291258808, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentView_Preview_Default (ButtonComponentView.kt:46)");
            }
            ButtonComponentView(previewButtonComponentStyle(null, null, null, lVarP, 0, 7), null, lVarP, 0, 2);
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

    private static final ButtonComponentStyle previewButtonComponentStyle(StackComponentStyle stackComponentStyle, PaywallAction paywallAction, zd.l<? super PaywallAction, i0> lVar, l lVar2, int i10, int i11) {
        StackComponentStyle stackComponentStyle2;
        lVar2.e(1249920904);
        if ((i11 & 1) != 0) {
            TextComponentStyle.Companion companion = TextComponentStyle.Companion;
            j0.a aVar = j0.f14524b;
            ColorScheme colorScheme = new ColorScheme(new ColorInfo.Hex(l0.i(aVar.a())), (ColorInfo) null, 2, (j) null);
            FontSize fontSize = FontSize.BODY_M;
            FontWeight fontWeight = FontWeight.REGULAR;
            HorizontalAlignment horizontalAlignment = HorizontalAlignment.CENTER;
            ColorScheme colorScheme2 = new ColorScheme(new ColorInfo.Hex(l0.i(aVar.l())), (ColorInfo) null, 2, (j) null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            float f10 = 16;
            stackComponentStyle2 = new StackComponentStyle(true, t.d(companion.invoke(true, "Restore purchases", colorScheme, fontSize, fontWeight, null, horizontalAlignment, horizontalAlignment, colorScheme2, new Size(fit, fit), new Padding(8.0d, 8.0d, 8.0d, 8.0d), new Padding(0.0d, 24.0d, 0.0d, 24.0d), lVar2, 1222340150, 456)), new Dimension.Vertical(horizontalAlignment, FlexDistribution.START), new Size(fit, fit), h.m(f10), BackgroundStyle.Color.m92boximpl(BackgroundStyle.Color.m93constructorimpl(ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar.h())))), m.a(h.m(f10)), m.a(h.m(f10)), g.c(h.m(20)), new BorderStyle(h.m(2), ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar.b())), null), new ShadowStyle(ColorStyle.Solid.m117boximpl(ColorStyle.Solid.m118constructorimpl(aVar.a())), h.m(10), h.m(0), h.m(3), null), null);
        } else {
            stackComponentStyle2 = stackComponentStyle;
        }
        PaywallAction paywallAction2 = (i11 & 2) != 0 ? PaywallAction.RestorePurchases.INSTANCE : paywallAction;
        zd.l<? super PaywallAction, i0> lVar3 = (i11 & 4) != 0 ? C06231.INSTANCE : lVar;
        if (o.I()) {
            o.U(1249920904, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.previewButtonComponentStyle (ButtonComponentView.kt:51)");
        }
        ButtonComponentStyle buttonComponentStyleInvoke = ButtonComponentStyle.Companion.invoke(stackComponentStyle2, paywallAction2, lVar3, lVar2, (i10 & 14) | 3072 | (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i10 & 896));
        if (o.I()) {
            o.T();
        }
        lVar2.K();
        return buttonComponentStyleInvoke;
    }
}
