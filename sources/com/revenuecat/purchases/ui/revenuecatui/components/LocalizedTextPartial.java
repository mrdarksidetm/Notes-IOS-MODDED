package com.revenuecat.purchases.ui.revenuecatui.components;

import ae.j;
import ae.r;
import com.revenuecat.purchases.paywalls.components.PartialTextComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.FontSize;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.Map;
import md.q;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalizedTextPartial implements PresentedPartial<LocalizedTextPartial> {
    public static final Companion Companion = new Companion(null);
    private final PartialTextComponent partial;
    private final String text;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final /* synthetic */ Result invoke(PartialTextComponent partialTextComponent, Map map) {
            r.f(partialTextComponent, "from");
            r.f(map, "using");
            String strM31getTextsa7TU9Q = partialTextComponent.m31getTextsa7TU9Q();
            j jVar = null;
            Result resultOrSuccessfullyNull = ResultKt.orSuccessfullyNull(strM31getTextsa7TU9Q != null ? LocalizationKt.m89string7v81vok(map, strM31getTextsa7TU9Q) : null);
            if (resultOrSuccessfullyNull instanceof Result.Success) {
                return new Result.Success(new LocalizedTextPartial((String) ((Result.Success) resultOrSuccessfullyNull).getValue(), partialTextComponent, jVar));
            }
            if (resultOrSuccessfullyNull instanceof Result.Error) {
                return resultOrSuccessfullyNull;
            }
            throw new q();
        }
    }

    private LocalizedTextPartial(String str, PartialTextComponent partialTextComponent) {
        this.text = str;
        this.partial = partialTextComponent;
    }

    public /* synthetic */ LocalizedTextPartial(String str, PartialTextComponent partialTextComponent, j jVar) {
        this(str, partialTextComponent);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartial
    public /* synthetic */ LocalizedTextPartial combine(LocalizedTextPartial localizedTextPartial) {
        String str;
        Boolean visible;
        String strM31getTextsa7TU9Q;
        ColorScheme color;
        ColorScheme backgroundColor;
        String fontName;
        FontWeight fontWeight;
        FontSize fontSize;
        HorizontalAlignment horizontalAlignment;
        Size size;
        Padding padding;
        Padding margin;
        PartialTextComponent partialTextComponent = localizedTextPartial != null ? localizedTextPartial.partial : null;
        if (localizedTextPartial == null || (str = localizedTextPartial.text) == null) {
            str = this.text;
        }
        if (partialTextComponent == null || (visible = partialTextComponent.getVisible()) == null) {
            visible = this.partial.getVisible();
        }
        Boolean bool = visible;
        if (partialTextComponent == null || (strM31getTextsa7TU9Q = partialTextComponent.m31getTextsa7TU9Q()) == null) {
            strM31getTextsa7TU9Q = this.partial.m31getTextsa7TU9Q();
        }
        String str2 = strM31getTextsa7TU9Q;
        if (partialTextComponent == null || (color = partialTextComponent.getColor()) == null) {
            color = this.partial.getColor();
        }
        ColorScheme colorScheme = color;
        if (partialTextComponent == null || (backgroundColor = partialTextComponent.getBackgroundColor()) == null) {
            backgroundColor = this.partial.getBackgroundColor();
        }
        ColorScheme colorScheme2 = backgroundColor;
        if (partialTextComponent == null || (fontName = partialTextComponent.getFontName()) == null) {
            fontName = this.partial.getFontName();
        }
        String str3 = fontName;
        if (partialTextComponent == null || (fontWeight = partialTextComponent.getFontWeight()) == null) {
            fontWeight = this.partial.getFontWeight();
        }
        FontWeight fontWeight2 = fontWeight;
        if (partialTextComponent == null || (fontSize = partialTextComponent.getFontSize()) == null) {
            fontSize = this.partial.getFontSize();
        }
        FontSize fontSize2 = fontSize;
        if (partialTextComponent == null || (horizontalAlignment = partialTextComponent.getHorizontalAlignment()) == null) {
            horizontalAlignment = this.partial.getHorizontalAlignment();
        }
        HorizontalAlignment horizontalAlignment2 = horizontalAlignment;
        if (partialTextComponent == null || (size = partialTextComponent.getSize()) == null) {
            size = this.partial.getSize();
        }
        Size size2 = size;
        if (partialTextComponent == null || (padding = partialTextComponent.getPadding()) == null) {
            padding = this.partial.getPadding();
        }
        Padding padding2 = padding;
        if (partialTextComponent == null || (margin = partialTextComponent.getMargin()) == null) {
            margin = this.partial.getMargin();
        }
        return new LocalizedTextPartial(str, new PartialTextComponent(bool, str2, colorScheme, colorScheme2, str3, fontWeight2, fontSize2, horizontalAlignment2, size2, padding2, margin, null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalizedTextPartial)) {
            return false;
        }
        LocalizedTextPartial localizedTextPartial = (LocalizedTextPartial) obj;
        return r.b(this.text, localizedTextPartial.text) && r.b(this.partial, localizedTextPartial.partial);
    }

    public final /* synthetic */ PartialTextComponent getPartial() {
        return this.partial;
    }

    public final /* synthetic */ String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.partial.hashCode();
    }

    public String toString() {
        return "LocalizedTextPartial(text=" + this.text + ", partial=" + this.partial + ')';
    }
}
