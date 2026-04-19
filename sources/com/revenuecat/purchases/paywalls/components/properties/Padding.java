package com.revenuecat.purchases.paywalls.components.properties;

import ae.j;
import af.j1;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class Padding {
    private final double bottom;
    private final double leading;
    private final double top;
    private final double trailing;
    public static final Companion Companion = new Companion(null);
    private static final Padding zero = new Padding(0.0d, 0.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final Padding f1default = new Padding(10.0d, 10.0d, 20.0d, 20.0d);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final /* synthetic */ Padding getDefault() {
            return Padding.f1default;
        }

        public final /* synthetic */ Padding getZero() {
            return Padding.zero;
        }

        public final b<Padding> serializer() {
            return Padding$$serializer.INSTANCE;
        }
    }

    public Padding(double d10, double d11, double d12, double d13) {
        this.top = d10;
        this.bottom = d11;
        this.leading = d12;
        this.trailing = d13;
    }

    public /* synthetic */ Padding(int i10, double d10, double d11, double d12, double d13, j1 j1Var) {
        if (15 != (i10 & 15)) {
            z0.a(i10, 15, Padding$$serializer.INSTANCE.getDescriptor());
        }
        this.top = d10;
        this.bottom = d11;
        this.leading = d12;
        this.trailing = d13;
    }

    public static final /* synthetic */ void write$Self(Padding padding, d dVar, f fVar) {
        dVar.x(fVar, 0, padding.top);
        dVar.x(fVar, 1, padding.bottom);
        dVar.x(fVar, 2, padding.leading);
        dVar.x(fVar, 3, padding.trailing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Padding)) {
            return false;
        }
        Padding padding = (Padding) obj;
        return Double.compare(this.top, padding.top) == 0 && Double.compare(this.bottom, padding.bottom) == 0 && Double.compare(this.leading, padding.leading) == 0 && Double.compare(this.trailing, padding.trailing) == 0;
    }

    public final /* synthetic */ double getBottom() {
        return this.bottom;
    }

    public final /* synthetic */ double getLeading() {
        return this.leading;
    }

    public final /* synthetic */ double getTop() {
        return this.top;
    }

    public final /* synthetic */ double getTrailing() {
        return this.trailing;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.top) * 31) + Double.hashCode(this.bottom)) * 31) + Double.hashCode(this.leading)) * 31) + Double.hashCode(this.trailing);
    }

    public String toString() {
        return "Padding(top=" + this.top + ", bottom=" + this.bottom + ", leading=" + this.leading + ", trailing=" + this.trailing + ')';
    }
}
