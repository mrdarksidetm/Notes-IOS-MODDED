package com.revenuecat.purchases.paywalls.components;

import ae.j;
import ae.r;
import af.j1;
import af.n1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverrides;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FontSize;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class TextComponent implements PaywallComponent {
    private final ColorScheme backgroundColor;
    private final ColorScheme color;
    private final String fontName;
    private final FontSize fontSize;
    private final FontWeight fontWeight;
    private final HorizontalAlignment horizontalAlignment;
    private final Padding margin;
    private final ComponentOverrides<PartialTextComponent> overrides;
    private final Padding padding;
    private final Size size;
    private final String text;
    public static final Companion Companion = new Companion(null);
    private static final b<Object>[] $childSerializers = {null, null, null, null, FontWeight.Companion.serializer(), FontSize.Companion.serializer(), HorizontalAlignment.Companion.serializer(), null, null, null, ComponentOverrides.Companion.serializer(PartialTextComponent$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<TextComponent> serializer() {
            return TextComponent$$serializer.INSTANCE;
        }
    }

    private TextComponent(int i10, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, FontSize fontSize, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, ComponentOverrides<PartialTextComponent> componentOverrides, j1 j1Var) {
        if (3 != (i10 & 3)) {
            z0.a(i10, 3, TextComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.color = colorScheme;
        if ((i10 & 4) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme2;
        }
        if ((i10 & 8) == 0) {
            this.fontName = null;
        } else {
            this.fontName = str2;
        }
        if ((i10 & 16) == 0) {
            this.fontWeight = FontWeight.REGULAR;
        } else {
            this.fontWeight = fontWeight;
        }
        if ((i10 & 32) == 0) {
            this.fontSize = FontSize.BODY_M;
        } else {
            this.fontSize = fontSize;
        }
        if ((i10 & 64) == 0) {
            this.horizontalAlignment = HorizontalAlignment.CENTER;
        } else {
            this.horizontalAlignment = horizontalAlignment;
        }
        if ((i10 & 128) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i10 & 256) == 0) {
            this.padding = Padding.Companion.getZero();
        } else {
            this.padding = padding;
        }
        if ((i10 & 512) == 0) {
            this.margin = Padding.Companion.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i10 & 1024) == 0) {
            this.overrides = null;
        } else {
            this.overrides = componentOverrides;
        }
    }

    public /* synthetic */ TextComponent(int i10, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, FontSize fontSize, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, ComponentOverrides componentOverrides, j1 j1Var, j jVar) {
        this(i10, str, colorScheme, colorScheme2, str2, fontWeight, fontSize, horizontalAlignment, size, padding, padding2, (ComponentOverrides<PartialTextComponent>) componentOverrides, j1Var);
    }

    private TextComponent(String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, FontSize fontSize, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, ComponentOverrides<PartialTextComponent> componentOverrides) {
        r.f(str, "text");
        r.f(colorScheme, "color");
        r.f(fontWeight, "fontWeight");
        r.f(fontSize, "fontSize");
        r.f(horizontalAlignment, "horizontalAlignment");
        r.f(size, "size");
        r.f(padding, "padding");
        r.f(padding2, "margin");
        this.text = str;
        this.color = colorScheme;
        this.backgroundColor = colorScheme2;
        this.fontName = str2;
        this.fontWeight = fontWeight;
        this.fontSize = fontSize;
        this.horizontalAlignment = horizontalAlignment;
        this.size = size;
        this.padding = padding;
        this.margin = padding2;
        this.overrides = componentOverrides;
    }

    public /* synthetic */ TextComponent(String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, FontSize fontSize, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, ComponentOverrides componentOverrides, int i10, j jVar) {
        this(str, colorScheme, (i10 & 4) != 0 ? null : colorScheme2, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? FontWeight.REGULAR : fontWeight, (i10 & 32) != 0 ? FontSize.BODY_M : fontSize, (i10 & 64) != 0 ? HorizontalAlignment.CENTER : horizontalAlignment, (i10 & 128) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i10 & 256) != 0 ? Padding.Companion.getZero() : padding, (i10 & 512) != 0 ? Padding.Companion.getZero() : padding2, (i10 & 1024) != 0 ? null : componentOverrides, null);
    }

    public /* synthetic */ TextComponent(String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, FontSize fontSize, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, ComponentOverrides componentOverrides, j jVar) {
        this(str, colorScheme, colorScheme2, str2, fontWeight, fontSize, horizontalAlignment, size, padding, padding2, componentOverrides);
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getFontName$annotations() {
    }

    public static /* synthetic */ void getFontSize$annotations() {
    }

    public static /* synthetic */ void getFontWeight$annotations() {
    }

    public static /* synthetic */ void getHorizontalAlignment$annotations() {
    }

    /* JADX INFO: renamed from: getText-z7Tp-4o$annotations, reason: not valid java name */
    public static /* synthetic */ void m32getTextz7Tp4o$annotations() {
    }

    public static final /* synthetic */ void write$Self(TextComponent textComponent, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        dVar.E(fVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m61boximpl(textComponent.text));
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        dVar.E(fVar, 1, colorScheme$$serializer, textComponent.color);
        if (dVar.r(fVar, 2) || textComponent.backgroundColor != null) {
            dVar.k(fVar, 2, colorScheme$$serializer, textComponent.backgroundColor);
        }
        if (dVar.r(fVar, 3) || textComponent.fontName != null) {
            dVar.k(fVar, 3, n1.f790a, textComponent.fontName);
        }
        if (dVar.r(fVar, 4) || textComponent.fontWeight != FontWeight.REGULAR) {
            dVar.E(fVar, 4, bVarArr[4], textComponent.fontWeight);
        }
        if (dVar.r(fVar, 5) || textComponent.fontSize != FontSize.BODY_M) {
            dVar.E(fVar, 5, bVarArr[5], textComponent.fontSize);
        }
        if (dVar.r(fVar, 6) || textComponent.horizontalAlignment != HorizontalAlignment.CENTER) {
            dVar.E(fVar, 6, bVarArr[6], textComponent.horizontalAlignment);
        }
        if (dVar.r(fVar, 7) || !r.b(textComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.E(fVar, 7, Size$$serializer.INSTANCE, textComponent.size);
        }
        if (dVar.r(fVar, 8) || !r.b(textComponent.padding, Padding.Companion.getZero())) {
            dVar.E(fVar, 8, Padding$$serializer.INSTANCE, textComponent.padding);
        }
        if (dVar.r(fVar, 9) || !r.b(textComponent.margin, Padding.Companion.getZero())) {
            dVar.E(fVar, 9, Padding$$serializer.INSTANCE, textComponent.margin);
        }
        if (dVar.r(fVar, 10) || textComponent.overrides != null) {
            dVar.k(fVar, 10, bVarArr[10], textComponent.overrides);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextComponent)) {
            return false;
        }
        TextComponent textComponent = (TextComponent) obj;
        return LocalizationKey.m64equalsimpl0(this.text, textComponent.text) && r.b(this.color, textComponent.color) && r.b(this.backgroundColor, textComponent.backgroundColor) && r.b(this.fontName, textComponent.fontName) && this.fontWeight == textComponent.fontWeight && this.fontSize == textComponent.fontSize && this.horizontalAlignment == textComponent.horizontalAlignment && r.b(this.size, textComponent.size) && r.b(this.padding, textComponent.padding) && r.b(this.margin, textComponent.margin) && r.b(this.overrides, textComponent.overrides);
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ String getFontName() {
        return this.fontName;
    }

    public final /* synthetic */ FontSize getFontSize() {
        return this.fontSize;
    }

    public final /* synthetic */ FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final /* synthetic */ HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ ComponentOverrides getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getText-z7Tp-4o, reason: not valid java name */
    public final /* synthetic */ String m33getTextz7Tp4o() {
        return this.text;
    }

    public int hashCode() {
        int iM65hashCodeimpl = ((LocalizationKey.m65hashCodeimpl(this.text) * 31) + this.color.hashCode()) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int iHashCode = (iM65hashCodeimpl + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        String str = this.fontName;
        int iHashCode2 = (((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.fontWeight.hashCode()) * 31) + this.fontSize.hashCode()) * 31) + this.horizontalAlignment.hashCode()) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        ComponentOverrides<PartialTextComponent> componentOverrides = this.overrides;
        return iHashCode2 + (componentOverrides != null ? componentOverrides.hashCode() : 0);
    }

    public String toString() {
        return "TextComponent(text=" + ((Object) LocalizationKey.m66toStringimpl(this.text)) + ", color=" + this.color + ", backgroundColor=" + this.backgroundColor + ", fontName=" + this.fontName + ", fontWeight=" + this.fontWeight + ", fontSize=" + this.fontSize + ", horizontalAlignment=" + this.horizontalAlignment + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", overrides=" + this.overrides + ')';
    }
}
