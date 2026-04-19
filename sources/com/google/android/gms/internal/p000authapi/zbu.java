package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import n8.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class zbu extends zbb implements zbv {
    public zbu() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        j jVar = (j) zbc.zba(parcel, j.CREATOR);
        zbc.zbb(parcel);
        zbb(status, jVar);
        return true;
    }
}
