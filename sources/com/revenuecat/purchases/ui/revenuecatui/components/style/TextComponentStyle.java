package com.revenuecat.purchases.ui.revenuecatui.components.style;

import ae.j;
import ae.r;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.FontSize;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.AlignmentKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.FontKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import f1.b;
import h0.y;
import n2.i0;
import n2.o;
import n2.q;
import n2.s;
import n2.t;
import n2.u;
import t0.l;
import u2.i;

/* JADX INFO: loaded from: classes2.dex */
public final class TextComponentStyle implements ComponentStyle {
    public static final Companion Companion = new Companion(null);
    private final ColorScheme backgroundColor;
    private final ColorScheme color;
    private final t fontFamily;
    private final long fontSize;
    private final i0 fontWeight;
    private final b.InterfaceC0266b horizontalAlignment;
    private final y margin;
    private final y padding;
    private final Size size;
    private final String text;
    private final i textAlign;
    private final boolean visible;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final t SystemFontFamily(String str, i0 i0Var) {
            s[] sVarArr = new s[1];
            String strA = o.a(str);
            if (i0Var == null) {
                i0Var = i0.f15808b.g();
            }
            sVarArr[0] = q.b(strA, i0Var, 0, null, 12, null);
            return u.c(sVarArr);
        }

        public final /* synthetic */ TextComponentStyle invoke(boolean z10, String str, ColorScheme colorScheme, FontSize fontSize, FontWeight fontWeight, String str2, HorizontalAlignment horizontalAlignment, HorizontalAlignment horizontalAlignment2, ColorScheme colorScheme2, Size size, Padding padding, Padding padding2, l lVar, int i10, int i11) {
            r.f(str, "text");
            r.f(colorScheme, "color");
            r.f(fontSize, "fontSize");
            r.f(horizontalAlignment, "textAlign");
            r.f(horizontalAlignment2, "horizontalAlignment");
            r.f(size, "size");
            r.f(padding, "padding");
            r.f(padding2, "margin");
            lVar.e(1996814093);
            if (t0.o.I()) {
                t0.o.U(1996814093, i10, i11, "com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle.Companion.invoke (TextComponentStyle.kt:58)");
            }
            i0 fontWeight2 = fontWeight != null ? FontKt.toFontWeight(fontWeight) : null;
            TextComponentStyle textComponentStyle = new TextComponentStyle(z10, str, colorScheme, FontKt.toTextUnit(fontSize, lVar, (i10 >> 9) & 14), fontWeight2, str2 != null ? TextComponentStyle.Companion.SystemFontFamily(str2, fontWeight2) : null, i.h(AlignmentKt.toTextAlign(horizontalAlignment)), AlignmentKt.toAlignment(horizontalAlignment2), colorScheme2, size, PaddingKt.toPaddingValues(padding), PaddingKt.toPaddingValues(padding2), null);
            if (t0.o.I()) {
                t0.o.T();
            }
            lVar.K();
            return textComponentStyle;
        }
    }

    private TextComponentStyle(boolean z10, String str, ColorScheme colorScheme, long j10, i0 i0Var, t tVar, i iVar, b.InterfaceC0266b interfaceC0266b, ColorScheme colorScheme2, Size size, y yVar, y yVar2) {
        this.visible = z10;
        this.text = str;
        this.color = colorScheme;
        this.fontSize = j10;
        this.fontWeight = i0Var;
        this.fontFamily = tVar;
        this.textAlign = iVar;
        this.horizontalAlignment = interfaceC0266b;
        this.backgroundColor = colorScheme2;
        this.size = size;
        this.padding = yVar;
        this.margin = yVar2;
    }

    public /* synthetic */ TextComponentStyle(boolean z10, String str, ColorScheme colorScheme, long j10, i0 i0Var, t tVar, i iVar, b.InterfaceC0266b interfaceC0266b, ColorScheme colorScheme2, Size size, y yVar, y yVar2, j jVar) {
        this(z10, str, colorScheme, j10, i0Var, tVar, iVar, interfaceC0266b, colorScheme2, size, yVar, yVar2);
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ t getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final /* synthetic */ long m139getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    public final /* synthetic */ i0 getFontWeight() {
        return this.fontWeight;
    }

    public final /* synthetic */ b.InterfaceC0266b getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final /* synthetic */ y getMargin() {
        return this.margin;
    }

    public final /* synthetic */ y getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final /* synthetic */ i m140getTextAlignbuA522U() {
        return this.textAlign;
    }

    public final /* synthetic */ boolean getVisible() {
        return this.visible;
    }
}
