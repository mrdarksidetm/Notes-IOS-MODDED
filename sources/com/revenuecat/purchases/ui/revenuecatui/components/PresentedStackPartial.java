package com.revenuecat.purchases.ui.revenuecatui.components;

import ae.r;
import com.revenuecat.purchases.paywalls.components.PartialStackComponent;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class PresentedStackPartial implements PresentedPartial<PresentedStackPartial> {
    private final PartialStackComponent partial;

    public PresentedStackPartial(PartialStackComponent partialStackComponent) {
        r.f(partialStackComponent, "partial");
        this.partial = partialStackComponent;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartial
    public PresentedStackPartial combine(PresentedStackPartial presentedStackPartial) {
        Boolean visible;
        Dimension dimension;
        Size size;
        Float spacing;
        ColorScheme backgroundColor;
        Padding padding;
        Padding margin;
        Shape shape;
        Border border;
        Shadow shadow;
        PartialStackComponent partialStackComponent = presentedStackPartial != null ? presentedStackPartial.partial : null;
        if (partialStackComponent == null || (visible = partialStackComponent.getVisible()) == null) {
            visible = this.partial.getVisible();
        }
        Boolean bool = visible;
        if (partialStackComponent == null || (dimension = partialStackComponent.getDimension()) == null) {
            dimension = this.partial.getDimension();
        }
        Dimension dimension2 = dimension;
        if (partialStackComponent == null || (size = partialStackComponent.getSize()) == null) {
            size = this.partial.getSize();
        }
        Size size2 = size;
        if (partialStackComponent == null || (spacing = partialStackComponent.getSpacing()) == null) {
            spacing = this.partial.getSpacing();
        }
        Float f10 = spacing;
        if (partialStackComponent == null || (backgroundColor = partialStackComponent.getBackgroundColor()) == null) {
            backgroundColor = this.partial.getBackgroundColor();
        }
        ColorScheme colorScheme = backgroundColor;
        if (partialStackComponent == null || (padding = partialStackComponent.getPadding()) == null) {
            padding = this.partial.getPadding();
        }
        Padding padding2 = padding;
        if (partialStackComponent == null || (margin = partialStackComponent.getMargin()) == null) {
            margin = this.partial.getMargin();
        }
        Padding padding3 = margin;
        if (partialStackComponent == null || (shape = partialStackComponent.getShape()) == null) {
            shape = this.partial.getShape();
        }
        Shape shape2 = shape;
        if (partialStackComponent == null || (border = partialStackComponent.getBorder()) == null) {
            border = this.partial.getBorder();
        }
        Border border2 = border;
        if (partialStackComponent == null || (shadow = partialStackComponent.getShadow()) == null) {
            shadow = this.partial.getShadow();
        }
        return new PresentedStackPartial(new PartialStackComponent(bool, dimension2, size2, f10, colorScheme, padding2, padding3, shape2, border2, shadow));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PresentedStackPartial) && r.b(this.partial, ((PresentedStackPartial) obj).partial);
    }

    public final /* synthetic */ PartialStackComponent getPartial() {
        return this.partial;
    }

    public int hashCode() {
        return this.partial.hashCode();
    }

    public String toString() {
        return "PresentedStackPartial(partial=" + this.partial + ')';
    }
}
