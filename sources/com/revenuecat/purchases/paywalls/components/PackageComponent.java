package com.revenuecat.purchases.paywalls.components;

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
public final class PackageComponent implements PaywallComponent {
    public static final Companion Companion = new Companion(null);
    private final boolean isSelectedByDefault;
    private final String packageId;
    private final StackComponent stack;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PackageComponent> serializer() {
            return PackageComponent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PackageComponent(int i10, String str, boolean z10, StackComponent stackComponent, j1 j1Var) {
        if (7 != (i10 & 7)) {
            z0.a(i10, 7, PackageComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.packageId = str;
        this.isSelectedByDefault = z10;
        this.stack = stackComponent;
    }

    public PackageComponent(String str, boolean z10, StackComponent stackComponent) {
        r.f(str, "packageId");
        r.f(stackComponent, "stack");
        this.packageId = str;
        this.isSelectedByDefault = z10;
        this.stack = stackComponent;
    }

    public static /* synthetic */ void getPackageId$annotations() {
    }

    public static /* synthetic */ void isSelectedByDefault$annotations() {
    }

    public static final /* synthetic */ void write$Self(PackageComponent packageComponent, d dVar, f fVar) {
        dVar.w(fVar, 0, packageComponent.packageId);
        dVar.j(fVar, 1, packageComponent.isSelectedByDefault);
        dVar.E(fVar, 2, StackComponent$$serializer.INSTANCE, packageComponent.stack);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageComponent)) {
            return false;
        }
        PackageComponent packageComponent = (PackageComponent) obj;
        return r.b(this.packageId, packageComponent.packageId) && this.isSelectedByDefault == packageComponent.isSelectedByDefault && r.b(this.stack, packageComponent.stack);
    }

    public final /* synthetic */ String getPackageId() {
        return this.packageId;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        return (((this.packageId.hashCode() * 31) + Boolean.hashCode(this.isSelectedByDefault)) * 31) + this.stack.hashCode();
    }

    public final /* synthetic */ boolean isSelectedByDefault() {
        return this.isSelectedByDefault;
    }

    public String toString() {
        return "PackageComponent(packageId=" + this.packageId + ", isSelectedByDefault=" + this.isSelectedByDefault + ", stack=" + this.stack + ')';
    }
}
