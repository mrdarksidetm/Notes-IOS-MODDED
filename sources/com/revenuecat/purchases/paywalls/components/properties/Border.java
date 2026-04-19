package com.revenuecat.purchases.paywalls.components.properties;

import ae.j;
import ae.r;
import af.j1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class Border {
    public static final Companion Companion = new Companion(null);
    private final ColorScheme color;
    private final double width;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<Border> serializer() {
            return Border$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Border(int i10, ColorScheme colorScheme, double d10, j1 j1Var) {
        if (3 != (i10 & 3)) {
            z0.a(i10, 3, Border$$serializer.INSTANCE.getDescriptor());
        }
        this.color = colorScheme;
        this.width = d10;
    }

    public Border(ColorScheme colorScheme, double d10) {
        r.f(colorScheme, "color");
        this.color = colorScheme;
        this.width = d10;
    }

    public static final /* synthetic */ void write$Self(Border border, d dVar, f fVar) {
        dVar.E(fVar, 0, ColorScheme$$serializer.INSTANCE, border.color);
        dVar.x(fVar, 1, border.width);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Border)) {
            return false;
        }
        Border border = (Border) obj;
        return r.b(this.color, border.color) && Double.compare(this.width, border.width) == 0;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.color.hashCode() * 31) + Double.hashCode(this.width);
    }

    public String toString() {
        return "Border(color=" + this.color + ", width=" + this.width + ')';
    }
}
