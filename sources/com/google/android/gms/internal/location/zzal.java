package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import n9.d;
import n9.g0;
import n9.h;
import n9.l;
import n9.q;

/* JADX INFO: loaded from: classes.dex */
public final class zzal extends zza implements zzam {
    zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzd(h hVar, PendingIntent pendingIntent, zzak zzakVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, hVar);
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, zzakVar);
        zzx(57, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zze(PendingIntent pendingIntent, zzak zzakVar, String str) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, zzakVar);
        parcelZza.writeString(str);
        zzx(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzf(String[] strArr, zzak zzakVar, String str) {
        Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        zzc.zzd(parcelZza, zzakVar);
        parcelZza.writeString(str);
        zzx(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzg(g0 g0Var, zzak zzakVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, g0Var);
        zzc.zzd(parcelZza, zzakVar);
        zzx(74, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzh(long j10, boolean z10, PendingIntent pendingIntent) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzc.zza(parcelZza, true);
        zzc.zzc(parcelZza, pendingIntent);
        zzx(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzi(d dVar, PendingIntent pendingIntent, com.google.android.gms.common.api.internal.d dVar2) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, dVar);
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, dVar2);
        zzx(72, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzj(PendingIntent pendingIntent, com.google.android.gms.common.api.internal.d dVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, dVar);
        zzx(73, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzk(PendingIntent pendingIntent) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzx(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzl(PendingIntent pendingIntent, com.google.android.gms.common.api.internal.d dVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzd(parcelZza, dVar);
        zzx(69, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final Location zzm() {
        Parcel parcelZzw = zzw(7, zza());
        Location location = (Location) zzc.zzb(parcelZzw, Location.CREATOR);
        parcelZzw.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final Location zzn(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzw = zzw(80, parcelZza);
        Location location = (Location) zzc.zzb(parcelZzw, Location.CREATOR);
        parcelZzw.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzo(zzbc zzbcVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzbcVar);
        zzx(59, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzp(boolean z10) {
        Parcel parcelZza = zza();
        zzc.zza(parcelZza, z10);
        zzx(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzq(Location location) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, location);
        zzx(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzr(zzai zzaiVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzaiVar);
        zzx(67, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final LocationAvailability zzs(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzw = zzw(34, parcelZza);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.zzb(parcelZzw, LocationAvailability.CREATOR);
        parcelZzw.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzt(l lVar, zzao zzaoVar, String str) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, lVar);
        zzc.zzd(parcelZza, zzaoVar);
        parcelZza.writeString(null);
        zzx(63, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzu(zzl zzlVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzlVar);
        zzx(75, parcelZza);
    }

    @Override // com.google.android.gms.internal.location.zzam
    public final void zzv(PendingIntent pendingIntent, q qVar, com.google.android.gms.common.api.internal.d dVar) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, pendingIntent);
        zzc.zzc(parcelZza, qVar);
        zzc.zzd(parcelZza, dVar);
        zzx(79, parcelZza);
    }
}
