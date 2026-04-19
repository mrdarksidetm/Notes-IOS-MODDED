package com.revenuecat.purchases.ui.revenuecatui.components.style;

import ae.j;
import ae.r;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyle;
import h0.y;
import java.util.List;
import l1.t1;

/* JADX INFO: loaded from: classes2.dex */
public final class StackComponentStyle implements ComponentStyle {
    private final BackgroundStyle background;
    private final BorderStyle border;
    private final List<ComponentStyle> children;
    private final Dimension dimension;
    private final y margin;
    private final y padding;
    private final ShadowStyle shadow;
    private final t1 shape;
    private final Size size;
    private final float spacing;
    private final boolean visible;

    /* JADX WARN: Multi-variable type inference failed */
    private StackComponentStyle(boolean z10, List<? extends ComponentStyle> list, Dimension dimension, Size size, float f10, BackgroundStyle backgroundStyle, y yVar, y yVar2, t1 t1Var, BorderStyle borderStyle, ShadowStyle shadowStyle) {
        r.f(list, "children");
        r.f(dimension, "dimension");
        r.f(size, "size");
        r.f(yVar, "padding");
        r.f(yVar2, "margin");
        r.f(t1Var, "shape");
        this.visible = z10;
        this.children = list;
        this.dimension = dimension;
        this.size = size;
        this.spacing = f10;
        this.background = backgroundStyle;
        this.padding = yVar;
        this.margin = yVar2;
        this.shape = t1Var;
        this.border = borderStyle;
        this.shadow = shadowStyle;
    }

    public /* synthetic */ StackComponentStyle(boolean z10, List list, Dimension dimension, Size size, float f10, BackgroundStyle backgroundStyle, y yVar, y yVar2, t1 t1Var, BorderStyle borderStyle, ShadowStyle shadowStyle, j jVar) {
        this(z10, list, dimension, size, f10, backgroundStyle, yVar, yVar2, t1Var, borderStyle, shadowStyle);
    }

    public final /* synthetic */ BackgroundStyle getBackground() {
        return this.background;
    }

    public final /* synthetic */ BorderStyle getBorder() {
        return this.border;
    }

    public final /* synthetic */ List getChildren() {
        return this.children;
    }

    public final /* synthetic */ Dimension getDimension() {
        return this.dimension;
    }

    public final /* synthetic */ y getMargin() {
        return this.margin;
    }

    public final /* synthetic */ y getPadding() {
        return this.padding;
    }

    public final /* synthetic */ ShadowStyle getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ t1 getShape() {
        return this.shape;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m138getSpacingD9Ej5fM() {
        return this.spacing;
    }

    public final /* synthetic */ boolean getVisible() {
        return this.visible;
    }
}
