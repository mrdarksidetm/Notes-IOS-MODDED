package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import m9.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        Integer numE = null;
        Double dZ = null;
        Uri uri = null;
        byte[] bArrG = null;
        ArrayList arrayListT = null;
        m9.a aVar = null;
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 2:
                    numE = x8.b.E(parcel, iB);
                    break;
                case 3:
                    dZ = x8.b.z(parcel, iB);
                    break;
                case 4:
                    uri = (Uri) x8.b.o(parcel, iB, Uri.CREATOR);
                    break;
                case 5:
                    bArrG = x8.b.g(parcel, iB);
                    break;
                case 6:
                    arrayListT = x8.b.t(parcel, iB, e.CREATOR);
                    break;
                case 7:
                    aVar = (m9.a) x8.b.o(parcel, iB, m9.a.CREATOR);
                    break;
                case 8:
                    strP = x8.b.p(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new SignRequestParams(numE, dZ, uri, bArrG, arrayListT, aVar, strP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignRequestParams[i10];
    }
}
