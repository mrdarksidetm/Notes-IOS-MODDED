package com.revenuecat.purchases.ui.revenuecatui.components.text;

import ae.j;
import ae.r;
import ae.s;
import androidx.compose.ui.e;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.FontSize;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import l1.j0;
import l1.l0;
import l1.t1;
import md.a0;
import md.i0;
import nd.u;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import w2.h;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class TextComponentViewKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<e, ColorStyle, e> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // zd.p
        public final e invoke(e eVar, ColorStyle colorStyle) {
            r.f(eVar, "$this$applyIfNotNull");
            r.f(colorStyle, "it");
            return BackgroundKt.background$default(eVar, colorStyle, (t1) null, 2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ TextComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TextComponentStyle textComponentStyle, e eVar, int i10, int i11) {
            super(2);
            this.$style = textComponentStyle;
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
            TextComponentViewKt.TextComponentView(this.$style, this.$modifier, lVar, e2.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_CursiveFont$1, reason: invalid class name and case insensitive filesystem */
    static final class C06491 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06491(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            TextComponentViewKt.TextComponentView_Preview_CursiveFont(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_Customizations$1, reason: invalid class name and case insensitive filesystem */
    static final class C06501 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06501(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            TextComponentViewKt.TextComponentView_Preview_Customizations(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_Default$1, reason: invalid class name and case insensitive filesystem */
    static final class C06511 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06511(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            TextComponentViewKt.TextComponentView_Preview_Default(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_HorizontalAlignment$1, reason: invalid class name and case insensitive filesystem */
    static final class C06521 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06521(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            TextComponentViewKt.TextComponentView_Preview_HorizontalAlignment(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_LinearGradient$1, reason: invalid class name and case insensitive filesystem */
    static final class C06531 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06531(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            TextComponentViewKt.TextComponentView_Preview_LinearGradient(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_Markdown$1, reason: invalid class name and case insensitive filesystem */
    static final class C06541 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06541(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            TextComponentViewKt.TextComponentView_Preview_Markdown(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_MonospaceFont$1, reason: invalid class name and case insensitive filesystem */
    static final class C06551 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06551(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            TextComponentViewKt.TextComponentView_Preview_MonospaceFont(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_RadialGradient$1, reason: invalid class name and case insensitive filesystem */
    static final class C06561 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06561(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            TextComponentViewKt.TextComponentView_Preview_RadialGradient(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_SansSerifFont$1, reason: invalid class name and case insensitive filesystem */
    static final class C06571 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06571(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            TextComponentViewKt.TextComponentView_Preview_SansSerifFont(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt$TextComponentView_Preview_SerifFont$1, reason: invalid class name and case insensitive filesystem */
    static final class C06581 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06581(int i10) {
            super(2);
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            TextComponentViewKt.TextComponentView_Preview_SerifFont(lVar, e2.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TextComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle r54, androidx.compose.ui.e r55, t0.l r56, int r57, int r58) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt.TextComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle, androidx.compose.ui.e, t0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextComponentView_Preview_CursiveFont(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(-1722251866);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(-1722251866, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_CursiveFont (TextComponentView.kt:125)");
            }
            ColorScheme colorScheme = new ColorScheme(new ColorInfo.Hex(l0.i(j0.f14524b.a())), (ColorInfo) null, 2, (j) null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            lVar2 = lVarP;
            TextComponentView(previewTextComponentStyle("Hello, world", colorScheme, false, null, null, "cursive", null, null, null, new Size(fit, fit), null, null, lVarP, 1073938502, 0, 3548), null, lVar2, 0, 2);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06491(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextComponentView_Preview_Customizations(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(1310256028);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(1310256028, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_Customizations (TextComponentView.kt:153)");
            }
            ColorScheme colorScheme = new ColorScheme(new ColorInfo.Hex(l0.i(l0.e(255, 0, 0, 0, 8, null))), (ColorInfo) null, 2, (j) null);
            FontSize fontSize = FontSize.BODY_S;
            FontWeight fontWeight = FontWeight.BLACK;
            HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEADING;
            lVar2 = lVarP;
            TextComponentView(previewTextComponentStyle("Hello, world", colorScheme, false, fontSize, fontWeight, null, horizontalAlignment, horizontalAlignment, new ColorScheme(new ColorInfo.Hex(l0.i(l0.e(222, 222, 222, 0, 8, null))), (ColorInfo) null, 2, (j) null), null, new Padding(10.0d, 10.0d, 20.0d, 20.0d), new Padding(20.0d, 20.0d, 10.0d, 10.0d), lVarP, 148401222, 72, 548), null, lVar2, 0, 2);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06501(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextComponentView_Preview_Default(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(1838187961);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(1838187961, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_Default (TextComponentView.kt:75)");
            }
            lVar2 = lVarP;
            TextComponentView(previewTextComponentStyle("Hello, world", new ColorScheme(new ColorInfo.Hex(l0.i(j0.f14524b.a())), (ColorInfo) null, 2, (j) null), false, null, null, null, null, null, null, null, null, null, lVarP, 70, 0, 4092), null, lVar2, 0, 2);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06511(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextComponentView_Preview_HorizontalAlignment(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(-43764709);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(-43764709, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_HorizontalAlignment (TextComponentView.kt:138)");
            }
            ColorScheme colorScheme = new ColorScheme(new ColorInfo.Hex(l0.i(j0.f14524b.a())), (ColorInfo) null, 2, (j) null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            lVar2 = lVarP;
            TextComponentView(previewTextComponentStyle("Hello, world", colorScheme, false, null, null, null, null, HorizontalAlignment.TRAILING, null, new Size(fit, fit), null, null, lVarP, 1086324806, 0, 3452), androidx.compose.foundation.layout.p.t(e.f2662a, h.m(RCHTTPStatusCodes.BAD_REQUEST), 0.0f, 2, null), lVar2, 48, 0);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06521(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextComponentView_Preview_LinearGradient(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(702292295);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(702292295, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_LinearGradient (TextComponentView.kt:183)");
            }
            j0.a aVar = j0.f14524b;
            lVar2 = lVarP;
            TextComponentView(previewTextComponentStyle("Do not allow people to dim your shine because they are blinded. Tell them to put some sunglasses on.", new ColorScheme(new ColorInfo.Gradient.Linear(-45.0f, u.p(new ColorInfo.Gradient.Point(l0.i(aVar.c()), 0.1f), new ColorInfo.Gradient.Point(l0.i(l0.e(0, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 255, 0, 8, null)), 0.3f), new ColorInfo.Gradient.Point(l0.i(l0.e(160, 0, 160, 0, 8, null)), 0.8f))), (ColorInfo) null, 2, (j) null), false, FontSize.BODY_M, FontWeight.MEDIUM, null, HorizontalAlignment.LEADING, null, new ColorScheme(new ColorInfo.Hex(l0.i(aVar.a())), (ColorInfo) null, 2, (j) null), new Size(new SizeConstraint.Fixed(a0.b(200), null), SizeConstraint.Fit.INSTANCE), new Padding(10.0d, 10.0d, 20.0d, 20.0d), new Padding(20.0d, 20.0d, 10.0d, 10.0d), lVarP, 1209560134, 72, 164), null, lVar2, 0, 2);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06531(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextComponentView_Preview_Markdown(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(1145662669);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(1145662669, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_Markdown (TextComponentView.kt:171)");
            }
            lVar2 = lVarP;
            TextComponentView(previewTextComponentStyle("Hello, **bold**, *italic* or _italic2_ with ~strikethrough~ and `monospace`. Click [here](https://revenuecat.com)", new ColorScheme(new ColorInfo.Hex(l0.i(j0.f14524b.a())), (ColorInfo) null, 2, (j) null), false, null, null, null, null, null, null, null, null, null, lVarP, 70, 0, 4092), null, lVar2, 0, 2);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06541(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextComponentView_Preview_MonospaceFont(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(-744412312);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(-744412312, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_MonospaceFont (TextComponentView.kt:112)");
            }
            ColorScheme colorScheme = new ColorScheme(new ColorInfo.Hex(l0.i(j0.f14524b.a())), (ColorInfo) null, 2, (j) null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            lVar2 = lVarP;
            TextComponentView(previewTextComponentStyle("Hello, world", colorScheme, false, null, null, "monospace", null, null, null, new Size(fit, fit), null, null, lVarP, 1073938502, 0, 3548), null, lVar2, 0, 2);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06551(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextComponentView_Preview_RadialGradient(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(261376653);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(261376653, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_RadialGradient (TextComponentView.kt:221)");
            }
            j0.a aVar = j0.f14524b;
            lVar2 = lVarP;
            TextComponentView(previewTextComponentStyle("Do not allow people to dim your shine because they are blinded. Tell them to put some sunglasses on.", new ColorScheme(new ColorInfo.Gradient.Radial(u.p(new ColorInfo.Gradient.Point(l0.i(aVar.c()), 0.1f), new ColorInfo.Gradient.Point(l0.i(l0.e(0, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 255, 0, 8, null)), 0.8f), new ColorInfo.Gradient.Point(l0.i(l0.e(160, 0, 160, 0, 8, null)), 1.0f))), (ColorInfo) null, 2, (j) null), false, FontSize.BODY_M, FontWeight.MEDIUM, null, HorizontalAlignment.LEADING, null, new ColorScheme(new ColorInfo.Hex(l0.i(aVar.a())), (ColorInfo) null, 2, (j) null), new Size(new SizeConstraint.Fixed(a0.b(200), null), SizeConstraint.Fit.INSTANCE), new Padding(10.0d, 10.0d, 20.0d, 20.0d), new Padding(20.0d, 20.0d, 10.0d, 10.0d), lVarP, 1209560134, 72, 164), null, lVar2, 0, 2);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06561(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextComponentView_Preview_SansSerifFont(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(570489761);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(570489761, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_SansSerifFont (TextComponentView.kt:99)");
            }
            ColorScheme colorScheme = new ColorScheme(new ColorInfo.Hex(l0.i(j0.f14524b.a())), (ColorInfo) null, 2, (j) null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            lVar2 = lVarP;
            TextComponentView(previewTextComponentStyle("Hello, world", colorScheme, false, null, null, "sans-serif", null, null, null, new Size(fit, fit), null, null, lVarP, 1073938502, 0, 3548), null, lVar2, 0, 2);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06571(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextComponentView_Preview_SerifFont(l lVar, int i10) {
        l lVar2;
        l lVarP = lVar.p(2065783982);
        if (i10 == 0 && lVarP.s()) {
            lVarP.x();
            lVar2 = lVarP;
        } else {
            if (o.I()) {
                o.U(2065783982, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_SerifFont (TextComponentView.kt:86)");
            }
            ColorScheme colorScheme = new ColorScheme(new ColorInfo.Hex(l0.i(j0.f14524b.a())), (ColorInfo) null, 2, (j) null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            lVar2 = lVarP;
            TextComponentView(previewTextComponentStyle("Hello, world", colorScheme, false, null, null, "serif", null, null, null, new Size(fit, fit), null, null, lVarP, 1073938502, 0, 3548), null, lVar2, 0, 2);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVar2.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new C06581(i10));
    }

    private static final TextComponentStyle previewTextComponentStyle(String str, ColorScheme colorScheme, boolean z10, FontSize fontSize, FontWeight fontWeight, String str2, HorizontalAlignment horizontalAlignment, HorizontalAlignment horizontalAlignment2, ColorScheme colorScheme2, Size size, Padding padding, Padding padding2, l lVar, int i10, int i11, int i12) {
        lVar.e(-19064245);
        boolean z11 = (i12 & 4) != 0 ? true : z10;
        FontSize fontSize2 = (i12 & 8) != 0 ? FontSize.BODY_M : fontSize;
        FontWeight fontWeight2 = (i12 & 16) != 0 ? FontWeight.REGULAR : fontWeight;
        String str3 = (i12 & 32) != 0 ? null : str2;
        HorizontalAlignment horizontalAlignment3 = (i12 & 64) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment;
        HorizontalAlignment horizontalAlignment4 = (i12 & 128) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment2;
        ColorScheme colorScheme3 = (i12 & 256) != 0 ? null : colorScheme2;
        Size size2 = (i12 & 512) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size;
        Padding zero = (i12 & 1024) != 0 ? Padding.Companion.getZero() : padding;
        Padding zero2 = (i12 & 2048) != 0 ? Padding.Companion.getZero() : padding2;
        if (o.I()) {
            o.U(-19064245, i10, i11, "com.revenuecat.purchases.ui.revenuecatui.components.text.previewTextComponentStyle (TextComponentView.kt:258)");
        }
        TextComponentStyle textComponentStyleInvoke = TextComponentStyle.Companion.invoke(z11, str, colorScheme, fontSize2, fontWeight2, str3, horizontalAlignment3, horizontalAlignment4, colorScheme3, size2, zero, zero2, lVar, 1207960064 | ((i10 >> 6) & 14) | ((i10 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (i10 & 29360128), 456);
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return textComponentStyleInvoke;
    }
}
