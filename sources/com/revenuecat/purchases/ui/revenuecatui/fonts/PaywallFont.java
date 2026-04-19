package com.revenuecat.purchases.ui.revenuecatui.fonts;

import ae.j;
import ae.r;
import android.os.Parcel;
import android.os.Parcelable;
import n2.e0;
import n2.i0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PaywallFont implements Parcelable {
    public static final int $stable = 0;

    public static final class AssetFont extends PaywallFont {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AssetFont> CREATOR = new Creator();
        private final int fontStyle;
        private final i0 fontWeight;
        private final String path;

        public static final class Creator implements Parcelable.Creator<AssetFont> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AssetFont createFromParcel(Parcel parcel) {
                r.f(parcel, "parcel");
                return new AssetFont(parcel.readString(), FontWeightParceler.INSTANCE.create(parcel), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AssetFont[] newArray(int i10) {
                return new AssetFont[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssetFont(String str, i0 i0Var, int i10) {
            super(null);
            r.f(str, "path");
            r.f(i0Var, "fontWeight");
            this.path = str;
            this.fontWeight = i0Var;
            this.fontStyle = i10;
        }

        public /* synthetic */ AssetFont(String str, i0 i0Var, int i10, int i11, j jVar) {
            this(str, (i11 & 2) != 0 ? i0.f15808b.g() : i0Var, (i11 & 4) != 0 ? e0.f15784b.b() : i10);
        }

        public static /* synthetic */ AssetFont copy$default(AssetFont assetFont, String str, i0 i0Var, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = assetFont.path;
            }
            if ((i11 & 2) != 0) {
                i0Var = assetFont.fontWeight;
            }
            if ((i11 & 4) != 0) {
                i10 = assetFont.fontStyle;
            }
            return assetFont.copy(str, i0Var, i10);
        }

        public static /* synthetic */ void getFontWeight$annotations() {
        }

        public final String component1() {
            return this.path;
        }

        public final i0 component2() {
            return this.fontWeight;
        }

        public final int component3() {
            return this.fontStyle;
        }

        public final AssetFont copy(String str, i0 i0Var, int i10) {
            r.f(str, "path");
            r.f(i0Var, "fontWeight");
            return new AssetFont(str, i0Var, i10);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetFont)) {
                return false;
            }
            AssetFont assetFont = (AssetFont) obj;
            return r.b(this.path, assetFont.path) && r.b(this.fontWeight, assetFont.fontWeight) && this.fontStyle == assetFont.fontStyle;
        }

        public final int getFontStyle() {
            return this.fontStyle;
        }

        public final i0 getFontWeight() {
            return this.fontWeight;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return (((this.path.hashCode() * 31) + this.fontWeight.hashCode()) * 31) + Integer.hashCode(this.fontStyle);
        }

        public String toString() {
            return "AssetFont(path=" + this.path + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            r.f(parcel, "out");
            parcel.writeString(this.path);
            FontWeightParceler.INSTANCE.write(this.fontWeight, parcel, i10);
            parcel.writeInt(this.fontStyle);
        }
    }

    public static final class GoogleFont extends PaywallFont {
        public static final int $stable = 0;
        public static final Parcelable.Creator<GoogleFont> CREATOR = new Creator();
        private final String fontName;
        private final GoogleFontProvider fontProvider;
        private final int fontStyle;
        private final i0 fontWeight;

        public static final class Creator implements Parcelable.Creator<GoogleFont> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoogleFont createFromParcel(Parcel parcel) {
                r.f(parcel, "parcel");
                return new GoogleFont(parcel.readString(), GoogleFontProvider.CREATOR.createFromParcel(parcel), FontWeightParceler.INSTANCE.create(parcel), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoogleFont[] newArray(int i10) {
                return new GoogleFont[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoogleFont(String str, GoogleFontProvider googleFontProvider, i0 i0Var, int i10) {
            super(null);
            r.f(str, "fontName");
            r.f(googleFontProvider, "fontProvider");
            r.f(i0Var, "fontWeight");
            this.fontName = str;
            this.fontProvider = googleFontProvider;
            this.fontWeight = i0Var;
            this.fontStyle = i10;
        }

        public /* synthetic */ GoogleFont(String str, GoogleFontProvider googleFontProvider, i0 i0Var, int i10, int i11, j jVar) {
            this(str, googleFontProvider, (i11 & 4) != 0 ? i0.f15808b.g() : i0Var, (i11 & 8) != 0 ? e0.f15784b.b() : i10);
        }

        public static /* synthetic */ GoogleFont copy$default(GoogleFont googleFont, String str, GoogleFontProvider googleFontProvider, i0 i0Var, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = googleFont.fontName;
            }
            if ((i11 & 2) != 0) {
                googleFontProvider = googleFont.fontProvider;
            }
            if ((i11 & 4) != 0) {
                i0Var = googleFont.fontWeight;
            }
            if ((i11 & 8) != 0) {
                i10 = googleFont.fontStyle;
            }
            return googleFont.copy(str, googleFontProvider, i0Var, i10);
        }

        public static /* synthetic */ void getFontWeight$annotations() {
        }

        public final String component1() {
            return this.fontName;
        }

        public final GoogleFontProvider component2() {
            return this.fontProvider;
        }

        public final i0 component3() {
            return this.fontWeight;
        }

        public final int component4() {
            return this.fontStyle;
        }

        public final GoogleFont copy(String str, GoogleFontProvider googleFontProvider, i0 i0Var, int i10) {
            r.f(str, "fontName");
            r.f(googleFontProvider, "fontProvider");
            r.f(i0Var, "fontWeight");
            return new GoogleFont(str, googleFontProvider, i0Var, i10);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoogleFont)) {
                return false;
            }
            GoogleFont googleFont = (GoogleFont) obj;
            return r.b(this.fontName, googleFont.fontName) && r.b(this.fontProvider, googleFont.fontProvider) && r.b(this.fontWeight, googleFont.fontWeight) && this.fontStyle == googleFont.fontStyle;
        }

        public final String getFontName() {
            return this.fontName;
        }

        public final GoogleFontProvider getFontProvider() {
            return this.fontProvider;
        }

        public final int getFontStyle() {
            return this.fontStyle;
        }

        public final i0 getFontWeight() {
            return this.fontWeight;
        }

        public int hashCode() {
            return (((((this.fontName.hashCode() * 31) + this.fontProvider.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + Integer.hashCode(this.fontStyle);
        }

        public String toString() {
            return "GoogleFont(fontName=" + this.fontName + ", fontProvider=" + this.fontProvider + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            r.f(parcel, "out");
            parcel.writeString(this.fontName);
            this.fontProvider.writeToParcel(parcel, i10);
            FontWeightParceler.INSTANCE.write(this.fontWeight, parcel, i10);
            parcel.writeInt(this.fontStyle);
        }
    }

    public static final class ResourceFont extends PaywallFont {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ResourceFont> CREATOR = new Creator();
        private final int fontStyle;
        private final i0 fontWeight;
        private final int resourceId;

        public static final class Creator implements Parcelable.Creator<ResourceFont> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResourceFont createFromParcel(Parcel parcel) {
                r.f(parcel, "parcel");
                return new ResourceFont(parcel.readInt(), FontWeightParceler.INSTANCE.create(parcel), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResourceFont[] newArray(int i10) {
                return new ResourceFont[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourceFont(int i10, i0 i0Var, int i11) {
            super(null);
            r.f(i0Var, "fontWeight");
            this.resourceId = i10;
            this.fontWeight = i0Var;
            this.fontStyle = i11;
        }

        public /* synthetic */ ResourceFont(int i10, i0 i0Var, int i11, int i12, j jVar) {
            this(i10, (i12 & 2) != 0 ? i0.f15808b.g() : i0Var, (i12 & 4) != 0 ? e0.f15784b.b() : i11);
        }

        public static /* synthetic */ ResourceFont copy$default(ResourceFont resourceFont, int i10, i0 i0Var, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = resourceFont.resourceId;
            }
            if ((i12 & 2) != 0) {
                i0Var = resourceFont.fontWeight;
            }
            if ((i12 & 4) != 0) {
                i11 = resourceFont.fontStyle;
            }
            return resourceFont.copy(i10, i0Var, i11);
        }

        public static /* synthetic */ void getFontWeight$annotations() {
        }

        public final int component1() {
            return this.resourceId;
        }

        public final i0 component2() {
            return this.fontWeight;
        }

        public final int component3() {
            return this.fontStyle;
        }

        public final ResourceFont copy(int i10, i0 i0Var, int i11) {
            r.f(i0Var, "fontWeight");
            return new ResourceFont(i10, i0Var, i11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResourceFont)) {
                return false;
            }
            ResourceFont resourceFont = (ResourceFont) obj;
            return this.resourceId == resourceFont.resourceId && r.b(this.fontWeight, resourceFont.fontWeight) && this.fontStyle == resourceFont.fontStyle;
        }

        public final int getFontStyle() {
            return this.fontStyle;
        }

        public final i0 getFontWeight() {
            return this.fontWeight;
        }

        public final int getResourceId() {
            return this.resourceId;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.resourceId) * 31) + this.fontWeight.hashCode()) * 31) + Integer.hashCode(this.fontStyle);
        }

        public String toString() {
            return "ResourceFont(resourceId=" + this.resourceId + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            r.f(parcel, "out");
            parcel.writeInt(this.resourceId);
            FontWeightParceler.INSTANCE.write(this.fontWeight, parcel, i10);
            parcel.writeInt(this.fontStyle);
        }
    }

    private PaywallFont() {
    }

    public /* synthetic */ PaywallFont(j jVar) {
        this();
    }
}
