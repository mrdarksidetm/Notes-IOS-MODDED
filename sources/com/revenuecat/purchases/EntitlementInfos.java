package com.revenuecat.purchases;

import ae.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class EntitlementInfos implements Parcelable {
    public static final Parcelable.Creator<EntitlementInfos> CREATOR = new Creator();
    private final Map<String, EntitlementInfo> active;
    private final Map<String, EntitlementInfo> all;
    private final VerificationResult verification;

    public static final class Creator implements Parcelable.Creator<EntitlementInfos> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfos createFromParcel(Parcel parcel) {
            r.f(parcel, "parcel");
            int i10 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                linkedHashMap.put(parcel.readString(), EntitlementInfo.CREATOR.createFromParcel(parcel));
            }
            return new EntitlementInfos(linkedHashMap, VerificationResult.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntitlementInfos[] newArray(int i10) {
            return new EntitlementInfos[i10];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntitlementInfos(Map<String, EntitlementInfo> map) {
        this(map, VerificationResult.NOT_REQUESTED);
        r.f(map, "all");
    }

    public EntitlementInfos(Map<String, EntitlementInfo> map, VerificationResult verificationResult) {
        r.f(map, "all");
        r.f(verificationResult, "verification");
        this.all = map;
        this.verification = verificationResult;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, EntitlementInfo> entry : map.entrySet()) {
            if (entry.getValue().isActive()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.active = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r.b(EntitlementInfos.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        r.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfos");
        EntitlementInfos entitlementInfos = (EntitlementInfos) obj;
        return r.b(this.all, entitlementInfos.all) && r.b(this.active, entitlementInfos.active) && this.verification == entitlementInfos.verification;
    }

    public final EntitlementInfo get(String str) {
        r.f(str, "s");
        return this.all.get(str);
    }

    public final Map<String, EntitlementInfo> getActive() {
        return this.active;
    }

    public final Map<String, EntitlementInfo> getAll() {
        return this.all;
    }

    public final VerificationResult getVerification() {
        return this.verification;
    }

    public int hashCode() {
        return (this.all.hashCode() * 31) + this.active.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "out");
        Map<String, EntitlementInfo> map = this.all;
        parcel.writeInt(map.size());
        for (Map.Entry<String, EntitlementInfo> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i10);
        }
        parcel.writeString(this.verification.name());
    }
}
