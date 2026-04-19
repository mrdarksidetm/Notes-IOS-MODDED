package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.server.response.a;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends a implements x8.d {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        a aVar = (a) obj;
        for (a.C0179a<?, ?> c0179a : getFieldMappings().values()) {
            if (isFieldSet(c0179a)) {
                if (!aVar.isFieldSet(c0179a) || !w8.k.b(getFieldValue(c0179a), aVar.getFieldValue(c0179a))) {
                    return false;
                }
            } else if (aVar.isFieldSet(c0179a)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.a
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (a.C0179a<?, ?> c0179a : getFieldMappings().values()) {
            if (isFieldSet(c0179a)) {
                iHashCode = (iHashCode * 31) + m.k(getFieldValue(c0179a)).hashCode();
            }
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.common.server.response.a
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }

    public byte[] toByteArray() {
        Parcel parcelObtain = Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
