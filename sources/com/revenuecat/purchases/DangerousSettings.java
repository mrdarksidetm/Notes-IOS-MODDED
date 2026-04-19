package com.revenuecat.purchases;

import ae.j;
import ae.r;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class DangerousSettings implements Parcelable {
    public static final Parcelable.Creator<DangerousSettings> CREATOR = new Creator();
    private final boolean autoSyncPurchases;
    private final boolean customEntitlementComputation;

    public static final class Creator implements Parcelable.Creator<DangerousSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DangerousSettings createFromParcel(Parcel parcel) {
            r.f(parcel, "parcel");
            return new DangerousSettings(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DangerousSettings[] newArray(int i10) {
            return new DangerousSettings[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DangerousSettings() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    public DangerousSettings(boolean z10) {
        this(z10, false);
    }

    public /* synthetic */ DangerousSettings(boolean z10, int i10, j jVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public DangerousSettings(boolean z10, boolean z11) {
        this.autoSyncPurchases = z10;
        this.customEntitlementComputation = z11;
    }

    public /* synthetic */ DangerousSettings(boolean z10, boolean z11, int i10, j jVar) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11);
    }

    public static /* synthetic */ DangerousSettings copy$default(DangerousSettings dangerousSettings, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = dangerousSettings.autoSyncPurchases;
        }
        if ((i10 & 2) != 0) {
            z11 = dangerousSettings.customEntitlementComputation;
        }
        return dangerousSettings.copy(z10, z11);
    }

    public final boolean component1() {
        return this.autoSyncPurchases;
    }

    public final boolean component2$purchases_defaultsRelease() {
        return this.customEntitlementComputation;
    }

    public final DangerousSettings copy(boolean z10, boolean z11) {
        return new DangerousSettings(z10, z11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DangerousSettings)) {
            return false;
        }
        DangerousSettings dangerousSettings = (DangerousSettings) obj;
        return this.autoSyncPurchases == dangerousSettings.autoSyncPurchases && this.customEntitlementComputation == dangerousSettings.customEntitlementComputation;
    }

    public final boolean getAutoSyncPurchases() {
        return this.autoSyncPurchases;
    }

    public final boolean getCustomEntitlementComputation$purchases_defaultsRelease() {
        return this.customEntitlementComputation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z10 = this.autoSyncPurchases;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.customEntitlementComputation;
        return i10 + (z11 ? 1 : z11);
    }

    public String toString() {
        return "DangerousSettings(autoSyncPurchases=" + this.autoSyncPurchases + ", customEntitlementComputation=" + this.customEntitlementComputation + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "out");
        parcel.writeInt(this.autoSyncPurchases ? 1 : 0);
        parcel.writeInt(this.customEntitlementComputation ? 1 : 0);
    }
}
