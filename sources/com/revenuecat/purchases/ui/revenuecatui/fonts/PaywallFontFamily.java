package com.revenuecat.purchases.ui.revenuecatui.fonts;

import ae.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallFontFamily implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaywallFontFamily> CREATOR = new Creator();
    private final List<PaywallFont> fonts;

    public static final class Creator implements Parcelable.Creator<PaywallFontFamily> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaywallFontFamily createFromParcel(Parcel parcel) {
            r.f(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(PaywallFontFamily.class.getClassLoader()));
            }
            return new PaywallFontFamily(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaywallFontFamily[] newArray(int i10) {
            return new PaywallFontFamily[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallFontFamily(List<? extends PaywallFont> list) {
        r.f(list, "fonts");
        this.fonts = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallFontFamily copy$default(PaywallFontFamily paywallFontFamily, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = paywallFontFamily.fonts;
        }
        return paywallFontFamily.copy(list);
    }

    public final List<PaywallFont> component1() {
        return this.fonts;
    }

    public final PaywallFontFamily copy(List<? extends PaywallFont> list) {
        r.f(list, "fonts");
        return new PaywallFontFamily(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaywallFontFamily) && r.b(this.fonts, ((PaywallFontFamily) obj).fonts);
    }

    public final List<PaywallFont> getFonts() {
        return this.fonts;
    }

    public int hashCode() {
        return this.fonts.hashCode();
    }

    public String toString() {
        return "PaywallFontFamily(fonts=" + this.fonts + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "out");
        List<PaywallFont> list = this.fonts;
        parcel.writeInt(list.size());
        Iterator<PaywallFont> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i10);
        }
    }
}
