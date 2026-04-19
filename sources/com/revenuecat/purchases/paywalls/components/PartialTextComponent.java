package com.revenuecat.purchases.paywalls.components;

import ae.j;
import ae.r;
import af.h;
import af.j1;
import af.n1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
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
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class PartialTextComponent implements PartialComponent {
    private final ColorScheme backgroundColor;
    private final ColorScheme color;
    private final String fontName;
    private final FontSize fontSize;
    private final FontWeight fontWeight;
    private final HorizontalAlignment horizontalAlignment;
    private final Padding margin;
    private final Padding padding;
    private final Size size;
    private final String text;
    private final Boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final b<Object>[] $childSerializers = {null, null, null, null, null, FontWeight.Companion.serializer(), FontSize.Companion.serializer(), HorizontalAlignment.Companion.serializer(), null, null, null};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PartialTextComponent> serializer() {
            return PartialTextComponent$$serializer.INSTANCE;
        }
    }

    private PartialTextComponent(int i10, Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, FontSize fontSize, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, j1 j1Var) {
        if ((i10 & 0) != 0) {
            z0.a(i10, 0, PartialTextComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.visible = (i10 & 1) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 2) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i10 & 4) == 0) {
            this.color = null;
        } else {
            this.color = colorScheme;
        }
        if ((i10 & 8) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme2;
        }
        if ((i10 & 16) == 0) {
            this.fontName = null;
        } else {
            this.fontName = str2;
        }
        if ((i10 & 32) == 0) {
            this.fontWeight = null;
        } else {
            this.fontWeight = fontWeight;
        }
        if ((i10 & 64) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = fontSize;
        }
        if ((i10 & 128) == 0) {
            this.horizontalAlignment = null;
        } else {
            this.horizontalAlignment = horizontalAlignment;
        }
        if ((i10 & 256) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i10 & 512) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i10 & 1024) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
    }

    public /* synthetic */ PartialTextComponent(int i10, Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, FontSize fontSize, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, j1 j1Var, j jVar) {
        this(i10, bool, str, colorScheme, colorScheme2, str2, fontWeight, fontSize, horizontalAlignment, size, padding, padding2, j1Var);
    }

    private PartialTextComponent(Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, FontSize fontSize, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2) {
        this.visible = bool;
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
    }

    public /* synthetic */ PartialTextComponent(Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, FontSize fontSize, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, int i10, j jVar) {
        this((i10 & 1) != 0 ? Boolean.TRUE : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : colorScheme, (i10 & 8) != 0 ? null : colorScheme2, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : fontWeight, (i10 & 64) != 0 ? null : fontSize, (i10 & 128) != 0 ? null : horizontalAlignment, (i10 & 256) != 0 ? null : size, (i10 & 512) != 0 ? null : padding, (i10 & 1024) == 0 ? padding2 : null, null);
    }

    public /* synthetic */ PartialTextComponent(Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight, FontSize fontSize, HorizontalAlignment horizontalAlignment, Size size, Padding padding, Padding padding2, j jVar) {
        this(bool, str, colorScheme, colorScheme2, str2, fontWeight, fontSize, horizontalAlignment, size, padding, padding2);
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

    /* JADX INFO: renamed from: getText-sa7TU9Q$annotations, reason: not valid java name */
    public static /* synthetic */ void m30getTextsa7TU9Q$annotations() {
    }

    public static final /* synthetic */ void write$Self(PartialTextComponent partialTextComponent, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        if (dVar.r(fVar, 0) || !r.b(partialTextComponent.visible, Boolean.TRUE)) {
            dVar.k(fVar, 0, h.f763a, partialTextComponent.visible);
        }
        if (dVar.r(fVar, 1) || partialTextComponent.text != null) {
            LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
            String str = partialTextComponent.text;
            dVar.k(fVar, 1, localizationKey$$serializer, str != null ? LocalizationKey.m61boximpl(str) : null);
        }
        if (dVar.r(fVar, 2) || partialTextComponent.color != null) {
            dVar.k(fVar, 2, ColorScheme$$serializer.INSTANCE, partialTextComponent.color);
        }
        if (dVar.r(fVar, 3) || partialTextComponent.backgroundColor != null) {
            dVar.k(fVar, 3, ColorScheme$$serializer.INSTANCE, partialTextComponent.backgroundColor);
        }
        if (dVar.r(fVar, 4) || partialTextComponent.fontName != null) {
            dVar.k(fVar, 4, n1.f790a, partialTextComponent.fontName);
        }
        if (dVar.r(fVar, 5) || partialTextComponent.fontWeight != null) {
            dVar.k(fVar, 5, bVarArr[5], partialTextComponent.fontWeight);
        }
        if (dVar.r(fVar, 6) || partialTextComponent.fontSize != null) {
            dVar.k(fVar, 6, bVarArr[6], partialTextComponent.fontSize);
        }
        if (dVar.r(fVar, 7) || partialTextComponent.horizontalAlignment != null) {
            dVar.k(fVar, 7, bVarArr[7], partialTextComponent.horizontalAlignment);
        }
        if (dVar.r(fVar, 8) || partialTextComponent.size != null) {
            dVar.k(fVar, 8, Size$$serializer.INSTANCE, partialTextComponent.size);
        }
        if (dVar.r(fVar, 9) || partialTextComponent.padding != null) {
            dVar.k(fVar, 9, Padding$$serializer.INSTANCE, partialTextComponent.padding);
        }
        if (dVar.r(fVar, 10) || partialTextComponent.margin != null) {
            dVar.k(fVar, 10, Padding$$serializer.INSTANCE, partialTextComponent.margin);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.PartialTextComponent
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revenuecat.purchases.paywalls.components.PartialTextComponent r5 = (com.revenuecat.purchases.paywalls.components.PartialTextComponent) r5
            java.lang.Boolean r1 = r4.visible
            java.lang.Boolean r3 = r5.visible
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.text
            java.lang.String r3 = r5.text
            if (r1 != 0) goto L21
            if (r3 != 0) goto L23
            r1 = r0
            goto L29
        L21:
            if (r3 != 0) goto L25
        L23:
            r1 = r2
            goto L29
        L25:
            boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m64equalsimpl0(r1, r3)
        L29:
            if (r1 != 0) goto L2c
            return r2
        L2c:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.color
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.color
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L37
            return r2
        L37:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.backgroundColor
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.backgroundColor
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L42
            return r2
        L42:
            java.lang.String r1 = r4.fontName
            java.lang.String r3 = r5.fontName
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L4d
            return r2
        L4d:
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r1 = r4.fontWeight
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r3 = r5.fontWeight
            if (r1 == r3) goto L54
            return r2
        L54:
            com.revenuecat.purchases.paywalls.components.properties.FontSize r1 = r4.fontSize
            com.revenuecat.purchases.paywalls.components.properties.FontSize r3 = r5.fontSize
            if (r1 == r3) goto L5b
            return r2
        L5b:
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r1 = r4.horizontalAlignment
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r3 = r5.horizontalAlignment
            if (r1 == r3) goto L62
            return r2
        L62:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L6d
            return r2
        L6d:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.padding
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.padding
            boolean r1 = ae.r.b(r1, r3)
            if (r1 != 0) goto L78
            return r2
        L78:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.margin
            com.revenuecat.purchases.paywalls.components.properties.Padding r5 = r5.margin
            boolean r5 = ae.r.b(r1, r5)
            if (r5 != 0) goto L83
            return r2
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialTextComponent.equals(java.lang.Object):boolean");
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

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getText-sa7TU9Q, reason: not valid java name */
    public final /* synthetic */ String m31getTextsa7TU9Q() {
        return this.text;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.text;
        int iM65hashCodeimpl = (iHashCode + (str == null ? 0 : LocalizationKey.m65hashCodeimpl(str))) * 31;
        ColorScheme colorScheme = this.color;
        int iHashCode2 = (iM65hashCodeimpl + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        ColorScheme colorScheme2 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (colorScheme2 == null ? 0 : colorScheme2.hashCode())) * 31;
        String str2 = this.fontName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FontWeight fontWeight = this.fontWeight;
        int iHashCode5 = (iHashCode4 + (fontWeight == null ? 0 : fontWeight.hashCode())) * 31;
        FontSize fontSize = this.fontSize;
        int iHashCode6 = (iHashCode5 + (fontSize == null ? 0 : fontSize.hashCode())) * 31;
        HorizontalAlignment horizontalAlignment = this.horizontalAlignment;
        int iHashCode7 = (iHashCode6 + (horizontalAlignment == null ? 0 : horizontalAlignment.hashCode())) * 31;
        Size size = this.size;
        int iHashCode8 = (iHashCode7 + (size == null ? 0 : size.hashCode())) * 31;
        Padding padding = this.padding;
        int iHashCode9 = (iHashCode8 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        return iHashCode9 + (padding2 != null ? padding2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PartialTextComponent(visible=");
        sb2.append(this.visible);
        sb2.append(", text=");
        String str = this.text;
        sb2.append((Object) (str == null ? "null" : LocalizationKey.m66toStringimpl(str)));
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", fontName=");
        sb2.append(this.fontName);
        sb2.append(", fontWeight=");
        sb2.append(this.fontWeight);
        sb2.append(", fontSize=");
        sb2.append(this.fontSize);
        sb2.append(", horizontalAlignment=");
        sb2.append(this.horizontalAlignment);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(')');
        return sb2.toString();
    }
}
