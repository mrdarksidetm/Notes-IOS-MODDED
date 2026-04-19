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
public final class Shadow {
    public static final Companion Companion = new Companion(null);
    private final ColorScheme color;
    private final double radius;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final double f9113x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final double f9114y;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<Shadow> serializer() {
            return Shadow$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Shadow(int i10, ColorScheme colorScheme, double d10, double d11, double d12, j1 j1Var) {
        if (15 != (i10 & 15)) {
            z0.a(i10, 15, Shadow$$serializer.INSTANCE.getDescriptor());
        }
        this.color = colorScheme;
        this.radius = d10;
        this.f9113x = d11;
        this.f9114y = d12;
    }

    public Shadow(ColorScheme colorScheme, double d10, double d11, double d12) {
        r.f(colorScheme, "color");
        this.color = colorScheme;
        this.radius = d10;
        this.f9113x = d11;
        this.f9114y = d12;
    }

    public static final /* synthetic */ void write$Self(Shadow shadow, d dVar, f fVar) {
        dVar.E(fVar, 0, ColorScheme$$serializer.INSTANCE, shadow.color);
        dVar.x(fVar, 1, shadow.radius);
        dVar.x(fVar, 2, shadow.f9113x);
        dVar.x(fVar, 3, shadow.f9114y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return r.b(this.color, shadow.color) && Double.compare(this.radius, shadow.radius) == 0 && Double.compare(this.f9113x, shadow.f9113x) == 0 && Double.compare(this.f9114y, shadow.f9114y) == 0;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ double getRadius() {
        return this.radius;
    }

    public final /* synthetic */ double getX() {
        return this.f9113x;
    }

    public final /* synthetic */ double getY() {
        return this.f9114y;
    }

    public int hashCode() {
        return (((((this.color.hashCode() * 31) + Double.hashCode(this.radius)) * 31) + Double.hashCode(this.f9113x)) * 31) + Double.hashCode(this.f9114y);
    }

    public String toString() {
        return "Shadow(color=" + this.color + ", radius=" + this.radius + ", x=" + this.f9113x + ", y=" + this.f9114y + ')';
    }
}
