package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.b;
import n9.t;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzl extends a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    final int zza;
    final zzj zzb;
    final t zzc;
    final zzai zzd;

    zzl(int i10, zzj zzjVar, IBinder iBinder, IBinder iBinder2) {
        this.zza = i10;
        this.zzb = zzjVar;
        zzai zzagVar = null;
        this.zzc = iBinder == null ? null : b.zzb(iBinder);
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder2);
        }
        this.zzd = zzagVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza);
        c.A(parcel, 2, this.zzb, i10, false);
        t tVar = this.zzc;
        c.r(parcel, 3, tVar == null ? null : tVar.asBinder(), false);
        zzai zzaiVar = this.zzd;
        c.r(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        c.b(parcel, iA);
    }
}
