package w8;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: loaded from: classes.dex */
public class b extends x8.a {
    public static final Parcelable.Creator<b> CREATOR = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22596b;

    public b(int i10, String str) {
        this.f22595a = i10;
        this.f22596b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f22595a == this.f22595a && k.b(bVar.f22596b, this.f22596b);
    }

    public final int hashCode() {
        return this.f22595a;
    }

    public final String toString() {
        return this.f22595a + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + this.f22596b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f22595a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.C(parcel, 2, this.f22596b, false);
        x8.c.b(parcel, iA);
    }
}
