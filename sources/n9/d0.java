package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Parcelable.Creator<n> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ n createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        boolean zW = false;
        boolean zW2 = false;
        boolean zW3 = false;
        boolean zW4 = false;
        boolean zW5 = false;
        boolean zW6 = false;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 2:
                    zW2 = x8.b.w(parcel, iB);
                    break;
                case 3:
                    zW3 = x8.b.w(parcel, iB);
                    break;
                case 4:
                    zW4 = x8.b.w(parcel, iB);
                    break;
                case 5:
                    zW5 = x8.b.w(parcel, iB);
                    break;
                case 6:
                    zW6 = x8.b.w(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new n(zW, zW2, zW3, zW4, zW5, zW6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ n[] newArray(int i10) {
        return new n[i10];
    }
}
