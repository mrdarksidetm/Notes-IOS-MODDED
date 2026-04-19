package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        c9.b bVar = null;
        int iD = 0;
        int iD2 = 0;
        boolean zW = false;
        int iD3 = 0;
        boolean zW2 = false;
        int iD4 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    iD = x8.b.D(parcel, iB);
                    break;
                case 2:
                    iD2 = x8.b.D(parcel, iB);
                    break;
                case 3:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 4:
                    iD3 = x8.b.D(parcel, iB);
                    break;
                case 5:
                    zW2 = x8.b.w(parcel, iB);
                    break;
                case 6:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 7:
                    iD4 = x8.b.D(parcel, iB);
                    break;
                case 8:
                    strP2 = x8.b.p(parcel, iB);
                    break;
                case 9:
                    bVar = (c9.b) x8.b.o(parcel, iB, c9.b.CREATOR);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new a.C0179a(iD, iD2, zW, iD3, zW2, strP, iD4, strP2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a.C0179a[i10];
    }
}
