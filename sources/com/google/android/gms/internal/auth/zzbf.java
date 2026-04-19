package com.google.android.gms.internal.auth;

import android.os.Parcel;
import p8.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            c cVar = (c) zzc.zza(parcel, c.CREATOR);
            zzc.zzb(parcel);
            zzb(cVar);
        } else {
            if (i10 != 2) {
                return false;
            }
            String string = parcel.readString();
            zzc.zzb(parcel);
            zzc(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
