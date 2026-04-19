package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import ae.j;
import ae.r;
import w2.h;

/* JADX INFO: loaded from: classes2.dex */
public final class BorderStyle {
    private final ColorStyle color;
    private final float width;

    private BorderStyle(float f10, ColorStyle colorStyle) {
        r.f(colorStyle, "color");
        this.width = f10;
        this.color = colorStyle;
    }

    public /* synthetic */ BorderStyle(float f10, ColorStyle colorStyle, j jVar) {
        this(f10, colorStyle);
    }

    /* JADX INFO: renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStyle m106copyD5KLDUw$default(BorderStyle borderStyle, float f10, ColorStyle colorStyle, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = borderStyle.width;
        }
        if ((i10 & 2) != 0) {
            colorStyle = borderStyle.color;
        }
        return borderStyle.m108copyD5KLDUw(f10, colorStyle);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m107component1D9Ej5fM() {
        return this.width;
    }

    public final ColorStyle component2() {
        return this.color;
    }

    /* JADX INFO: renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStyle m108copyD5KLDUw(float f10, ColorStyle colorStyle) {
        r.f(colorStyle, "color");
        return new BorderStyle(f10, colorStyle, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStyle)) {
            return false;
        }
        BorderStyle borderStyle = (BorderStyle) obj;
        return h.o(this.width, borderStyle.width) && r.b(this.color, borderStyle.color);
    }

    public final /* synthetic */ ColorStyle getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m109getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (h.p(this.width) * 31) + this.color.hashCode();
    }

    public String toString() {
        return "BorderStyle(width=" + ((Object) h.q(this.width)) + ", color=" + this.color + ')';
    }
}
