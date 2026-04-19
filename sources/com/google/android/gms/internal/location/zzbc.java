package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.d;
import com.google.android.gms.location.f;
import n9.v;
import n9.w;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbc extends a {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbd();
    final int zza;
    final zzba zzb;
    final w zzc;
    final PendingIntent zzd;
    final v zze;
    final zzai zzf;

    zzbc(int i10, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.zza = i10;
        this.zzb = zzbaVar;
        zzai zzagVar = null;
        this.zzc = iBinder == null ? null : f.zzb(iBinder);
        this.zzd = pendingIntent;
        this.zze = iBinder2 == null ? null : d.zzb(iBinder2);
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzagVar = iInterfaceQueryLocalInterface instanceof zzai ? (zzai) iInterfaceQueryLocalInterface : new zzag(iBinder3);
        }
        this.zzf = zzagVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, n9.w] */
    public static zzbc zza(w wVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, wVar, null, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzbc zzb(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        return new zzbc(1, zzbaVar, null, pendingIntent, null, zzaiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, n9.v] */
    public static zzbc zzc(v vVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, null, null, vVar, zzaiVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza);
        c.A(parcel, 2, this.zzb, i10, false);
        w wVar = this.zzc;
        c.r(parcel, 3, wVar == null ? null : wVar.asBinder(), false);
        c.A(parcel, 4, this.zzd, i10, false);
        v vVar = this.zze;
        c.r(parcel, 5, vVar == null ? null : vVar.asBinder(), false);
        zzai zzaiVar = this.zzf;
        c.r(parcel, 6, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        c.b(parcel, iA);
    }
}
