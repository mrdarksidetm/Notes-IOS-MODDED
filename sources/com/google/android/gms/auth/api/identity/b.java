package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        PendingIntent pendingIntent = null;
        String strP = null;
        String strP2 = null;
        ArrayList<String> arrayListR = null;
        String strP3 = null;
        int iD = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    pendingIntent = (PendingIntent) x8.b.o(parcel, iB, PendingIntent.CREATOR);
                    break;
                case 2:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 3:
                    strP2 = x8.b.p(parcel, iB);
                    break;
                case 4:
                    arrayListR = x8.b.r(parcel, iB);
                    break;
                case 5:
                    strP3 = x8.b.p(parcel, iB);
                    break;
                case 6:
                    iD = x8.b.D(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new SaveAccountLinkingTokenRequest(pendingIntent, strP, strP2, arrayListR, strP3, iD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SaveAccountLinkingTokenRequest[i10];
    }
}
