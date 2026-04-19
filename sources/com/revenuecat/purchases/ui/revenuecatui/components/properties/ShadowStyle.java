package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import ae.j;
import ae.r;
import w2.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ShadowStyle {
    private final ColorStyle color;
    private final float radius;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f9119x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f9120y;

    private ShadowStyle(ColorStyle colorStyle, float f10, float f11, float f12) {
        r.f(colorStyle, "color");
        this.color = colorStyle;
        this.radius = f10;
        this.f9119x = f11;
        this.f9120y = f12;
    }

    public /* synthetic */ ShadowStyle(ColorStyle colorStyle, float f10, float f11, float f12, j jVar) {
        this(colorStyle, f10, f11, f12);
    }

    /* JADX INFO: renamed from: copy-qQh39rQ$default, reason: not valid java name */
    public static /* synthetic */ ShadowStyle m130copyqQh39rQ$default(ShadowStyle shadowStyle, ColorStyle colorStyle, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            colorStyle = shadowStyle.color;
        }
        if ((i10 & 2) != 0) {
            f10 = shadowStyle.radius;
        }
        if ((i10 & 4) != 0) {
            f11 = shadowStyle.f9119x;
        }
        if ((i10 & 8) != 0) {
            f12 = shadowStyle.f9120y;
        }
        return shadowStyle.m134copyqQh39rQ(colorStyle, f10, f11, f12);
    }

    public final ColorStyle component1() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m131component2D9Ej5fM() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m132component3D9Ej5fM() {
        return this.f9119x;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m133component4D9Ej5fM() {
        return this.f9120y;
    }

    /* JADX INFO: renamed from: copy-qQh39rQ, reason: not valid java name */
    public final ShadowStyle m134copyqQh39rQ(ColorStyle colorStyle, float f10, float f11, float f12) {
        r.f(colorStyle, "color");
        return new ShadowStyle(colorStyle, f10, f11, f12, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowStyle)) {
            return false;
        }
        ShadowStyle shadowStyle = (ShadowStyle) obj;
        return r.b(this.color, shadowStyle.color) && h.o(this.radius, shadowStyle.radius) && h.o(this.f9119x, shadowStyle.f9119x) && h.o(this.f9120y, shadowStyle.f9120y);
    }

    public final /* synthetic */ ColorStyle getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: getRadius-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m135getRadiusD9Ej5fM() {
        return this.radius;
    }

    /* JADX INFO: renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m136getXD9Ej5fM() {
        return this.f9119x;
    }

    /* JADX INFO: renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final /* synthetic */ float m137getYD9Ej5fM() {
        return this.f9120y;
    }

    public int hashCode() {
        return (((((this.color.hashCode() * 31) + h.p(this.radius)) * 31) + h.p(this.f9119x)) * 31) + h.p(this.f9120y);
    }

    public String toString() {
        return "ShadowStyle(color=" + this.color + ", radius=" + ((Object) h.q(this.radius)) + ", x=" + ((Object) h.q(this.f9119x)) + ", y=" + ((Object) h.q(this.f9120y)) + ')';
    }
}
