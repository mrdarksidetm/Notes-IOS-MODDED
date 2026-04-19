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
public final class CornerRadiuses {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final CornerRadiuses f0default;
    private static final CornerRadiuses zero;
    private final double bottomLeading;
    private final double bottomTrailing;
    private final double topLeading;
    private final double topTrailing;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final /* synthetic */ CornerRadiuses getDefault() {
            return CornerRadiuses.f0default;
        }

        public final /* synthetic */ CornerRadiuses getZero() {
            return CornerRadiuses.zero;
        }

        public final b<CornerRadiuses> serializer() {
            return CornerRadiuses$$serializer.INSTANCE;
        }
    }

    static {
        CornerRadiuses cornerRadiuses = new CornerRadiuses(0.0d, 0.0d, 0.0d, 0.0d);
        zero = cornerRadiuses;
        f0default = cornerRadiuses;
    }

    public CornerRadiuses(double d10, double d11, double d12, double d13) {
        this.topLeading = d10;
        this.topTrailing = d11;
        this.bottomLeading = d12;
        this.bottomTrailing = d13;
    }

    public /* synthetic */ CornerRadiuses(int i10, double d10, double d11, double d12, double d13, j1 j1Var) {
        if (15 != (i10 & 15)) {
            z0.a(i10, 15, CornerRadiuses$$serializer.INSTANCE.getDescriptor());
        }
        this.topLeading = d10;
        this.topTrailing = d11;
        this.bottomLeading = d12;
        this.bottomTrailing = d13;
    }

    public static /* synthetic */ void getBottomLeading$annotations() {
    }

    public static /* synthetic */ void getBottomTrailing$annotations() {
    }

    public static /* synthetic */ void getTopLeading$annotations() {
    }

    public static /* synthetic */ void getTopTrailing$annotations() {
    }

    public static final /* synthetic */ void write$Self(CornerRadiuses cornerRadiuses, d dVar, f fVar) {
        dVar.x(fVar, 0, cornerRadiuses.topLeading);
        dVar.x(fVar, 1, cornerRadiuses.topTrailing);
        dVar.x(fVar, 2, cornerRadiuses.bottomLeading);
        dVar.x(fVar, 3, cornerRadiuses.bottomTrailing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CornerRadiuses)) {
            return false;
        }
        CornerRadiuses cornerRadiuses = (CornerRadiuses) obj;
        return Double.compare(this.topLeading, cornerRadiuses.topLeading) == 0 && Double.compare(this.topTrailing, cornerRadiuses.topTrailing) == 0 && Double.compare(this.bottomLeading, cornerRadiuses.bottomLeading) == 0 && Double.compare(this.bottomTrailing, cornerRadiuses.bottomTrailing) == 0;
    }

    public final /* synthetic */ double getBottomLeading() {
        return this.bottomLeading;
    }

    public final /* synthetic */ double getBottomTrailing() {
        return this.bottomTrailing;
    }

    public final /* synthetic */ double getTopLeading() {
        return this.topLeading;
    }

    public final /* synthetic */ double getTopTrailing() {
        return this.topTrailing;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.topLeading) * 31) + Double.hashCode(this.topTrailing)) * 31) + Double.hashCode(this.bottomLeading)) * 31) + Double.hashCode(this.bottomTrailing);
    }

    public String toString() {
        return "CornerRadiuses(topLeading=" + this.topLeading + ", topTrailing=" + this.topTrailing + ", bottomLeading=" + this.bottomLeading + ", bottomTrailing=" + this.bottomTrailing + ')';
    }
}
