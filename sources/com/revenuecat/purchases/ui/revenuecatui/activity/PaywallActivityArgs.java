package com.revenuecat.purchases.ui.revenuecatui.activity;

import ae.j;
import ae.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ui.revenuecatui.fonts.ParcelizableFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;
import com.revenuecat.purchases.ui.revenuecatui.fonts.TypographyType;
import ge.o;
import java.util.LinkedHashMap;
import java.util.Map;
import nd.q0;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallActivityArgs implements Parcelable {
    public static final Parcelable.Creator<PaywallActivityArgs> CREATOR = new Creator();
    private final Map<TypographyType, PaywallFontFamily> fonts;
    private final String offeringId;
    private final String requiredEntitlementIdentifier;
    private final boolean shouldDisplayDismissButton;

    public static final class Creator implements Parcelable.Creator<PaywallActivityArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaywallActivityArgs createFromParcel(Parcel parcel) {
            r.f(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() != 0) {
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashMap2.put(TypographyType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PaywallFontFamily.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new PaywallActivityArgs(string, string2, linkedHashMap, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaywallActivityArgs[] newArray(int i10) {
            return new PaywallActivityArgs[i10];
        }
    }

    public PaywallActivityArgs() {
        this((String) null, (String) null, (Map) null, false, 15, (j) null);
    }

    public PaywallActivityArgs(String str, String str2, ParcelizableFontProvider parcelizableFontProvider, boolean z10) {
        LinkedHashMap linkedHashMap;
        if (parcelizableFontProvider != null) {
            TypographyType[] typographyTypeArrValues = TypographyType.values();
            linkedHashMap = new LinkedHashMap(o.d(q0.b(typographyTypeArrValues.length), 16));
            for (TypographyType typographyType : typographyTypeArrValues) {
                linkedHashMap.put(typographyType, parcelizableFontProvider.getFont(typographyType));
            }
        } else {
            linkedHashMap = null;
        }
        this(str, str2, linkedHashMap, z10);
    }

    public /* synthetic */ PaywallActivityArgs(String str, String str2, ParcelizableFontProvider parcelizableFontProvider, boolean z10, int i10, j jVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, parcelizableFontProvider, (i10 & 8) != 0 ? true : z10);
    }

    public PaywallActivityArgs(String str, String str2, Map<TypographyType, PaywallFontFamily> map, boolean z10) {
        this.requiredEntitlementIdentifier = str;
        this.offeringId = str2;
        this.fonts = map;
        this.shouldDisplayDismissButton = z10;
    }

    public /* synthetic */ PaywallActivityArgs(String str, String str2, Map map, boolean z10, int i10, j jVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (Map<TypographyType, PaywallFontFamily>) ((i10 & 4) != 0 ? null : map), (i10 & 8) != 0 ? true : z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallActivityArgs copy$default(PaywallActivityArgs paywallActivityArgs, String str, String str2, Map map, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paywallActivityArgs.requiredEntitlementIdentifier;
        }
        if ((i10 & 2) != 0) {
            str2 = paywallActivityArgs.offeringId;
        }
        if ((i10 & 4) != 0) {
            map = paywallActivityArgs.fonts;
        }
        if ((i10 & 8) != 0) {
            z10 = paywallActivityArgs.shouldDisplayDismissButton;
        }
        return paywallActivityArgs.copy(str, str2, map, z10);
    }

    public final String component1() {
        return this.requiredEntitlementIdentifier;
    }

    public final String component2() {
        return this.offeringId;
    }

    public final Map<TypographyType, PaywallFontFamily> component3() {
        return this.fonts;
    }

    public final boolean component4() {
        return this.shouldDisplayDismissButton;
    }

    public final PaywallActivityArgs copy(String str, String str2, Map<TypographyType, PaywallFontFamily> map, boolean z10) {
        return new PaywallActivityArgs(str, str2, map, z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallActivityArgs)) {
            return false;
        }
        PaywallActivityArgs paywallActivityArgs = (PaywallActivityArgs) obj;
        return r.b(this.requiredEntitlementIdentifier, paywallActivityArgs.requiredEntitlementIdentifier) && r.b(this.offeringId, paywallActivityArgs.offeringId) && r.b(this.fonts, paywallActivityArgs.fonts) && this.shouldDisplayDismissButton == paywallActivityArgs.shouldDisplayDismissButton;
    }

    public final Map<TypographyType, PaywallFontFamily> getFonts() {
        return this.fonts;
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final String getRequiredEntitlementIdentifier() {
        return this.requiredEntitlementIdentifier;
    }

    public final boolean getShouldDisplayDismissButton() {
        return this.shouldDisplayDismissButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.requiredEntitlementIdentifier;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.offeringId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<TypographyType, PaywallFontFamily> map = this.fonts;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        boolean z10 = this.shouldDisplayDismissButton;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode3 + r12;
    }

    public String toString() {
        return "PaywallActivityArgs(requiredEntitlementIdentifier=" + this.requiredEntitlementIdentifier + ", offeringId=" + this.offeringId + ", fonts=" + this.fonts + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "out");
        parcel.writeString(this.requiredEntitlementIdentifier);
        parcel.writeString(this.offeringId);
        Map<TypographyType, PaywallFontFamily> map = this.fonts;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<TypographyType, PaywallFontFamily> entry : map.entrySet()) {
                parcel.writeString(entry.getKey().name());
                PaywallFontFamily value = entry.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    value.writeToParcel(parcel, i10);
                }
            }
        }
        parcel.writeInt(this.shouldDisplayDismissButton ? 1 : 0);
    }
}
