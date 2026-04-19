package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import n8.i;

/* JADX INFO: loaded from: classes.dex */
public final class zbn extends zba {
    zbn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbt zbtVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbtVar);
        zbc.zbc(parcelZba, saveAccountLinkingTokenRequest);
        zbb(1, parcelZba);
    }

    public final void zbd(zbv zbvVar, i iVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbvVar);
        zbc.zbc(parcelZba, iVar);
        zbb(2, parcelZba);
    }
}
