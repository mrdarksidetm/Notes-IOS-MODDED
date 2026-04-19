package com.revenuecat.purchases.ui.revenuecatui.fonts;

import ae.j;
import ae.r;
import android.os.Parcel;
import android.os.Parcelable;
import o2.c;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleFontProvider implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<GoogleFontProvider> CREATOR = new Creator();
    private final int certificates;
    private final String providerAuthority;
    private final String providerPackage;

    public static final class Creator implements Parcelable.Creator<GoogleFontProvider> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoogleFontProvider createFromParcel(Parcel parcel) {
            r.f(parcel, "parcel");
            return new GoogleFontProvider(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoogleFontProvider[] newArray(int i10) {
            return new GoogleFontProvider[i10];
        }
    }

    public GoogleFontProvider(int i10, String str, String str2) {
        r.f(str, "providerAuthority");
        r.f(str2, "providerPackage");
        this.certificates = i10;
        this.providerAuthority = str;
        this.providerPackage = str2;
    }

    public /* synthetic */ GoogleFontProvider(int i10, String str, String str2, int i11, j jVar) {
        this(i10, (i11 & 2) != 0 ? "com.google.android.gms.fonts" : str, (i11 & 4) != 0 ? "com.google.android.gms" : str2);
    }

    public static /* synthetic */ GoogleFontProvider copy$default(GoogleFontProvider googleFontProvider, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = googleFontProvider.certificates;
        }
        if ((i11 & 2) != 0) {
            str = googleFontProvider.providerAuthority;
        }
        if ((i11 & 4) != 0) {
            str2 = googleFontProvider.providerPackage;
        }
        return googleFontProvider.copy(i10, str, str2);
    }

    public final int component1() {
        return this.certificates;
    }

    public final String component2() {
        return this.providerAuthority;
    }

    public final String component3() {
        return this.providerPackage;
    }

    public final GoogleFontProvider copy(int i10, String str, String str2) {
        r.f(str, "providerAuthority");
        r.f(str2, "providerPackage");
        return new GoogleFontProvider(i10, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleFontProvider)) {
            return false;
        }
        GoogleFontProvider googleFontProvider = (GoogleFontProvider) obj;
        return this.certificates == googleFontProvider.certificates && r.b(this.providerAuthority, googleFontProvider.providerAuthority) && r.b(this.providerPackage, googleFontProvider.providerPackage);
    }

    public final int getCertificates() {
        return this.certificates;
    }

    public final String getProviderAuthority() {
        return this.providerAuthority;
    }

    public final String getProviderPackage() {
        return this.providerPackage;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.certificates) * 31) + this.providerAuthority.hashCode()) * 31) + this.providerPackage.hashCode();
    }

    public final c.a toGoogleProvider() {
        return new c.a(this.providerAuthority, this.providerPackage, this.certificates);
    }

    public String toString() {
        return "GoogleFontProvider(certificates=" + this.certificates + ", providerAuthority=" + this.providerAuthority + ", providerPackage=" + this.providerPackage + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "out");
        parcel.writeInt(this.certificates);
        parcel.writeString(this.providerAuthority);
        parcel.writeString(this.providerPackage);
    }
}
