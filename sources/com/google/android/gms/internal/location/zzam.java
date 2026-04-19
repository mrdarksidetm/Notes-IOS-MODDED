package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.location.LocationAvailability;
import n9.d;
import n9.g0;
import n9.h;
import n9.l;
import n9.q;

/* JADX INFO: loaded from: classes.dex */
public interface zzam extends IInterface {
    void zzd(h hVar, PendingIntent pendingIntent, zzak zzakVar);

    void zze(PendingIntent pendingIntent, zzak zzakVar, String str);

    void zzf(String[] strArr, zzak zzakVar, String str);

    void zzg(g0 g0Var, zzak zzakVar);

    void zzh(long j10, boolean z10, PendingIntent pendingIntent);

    void zzi(d dVar, PendingIntent pendingIntent, com.google.android.gms.common.api.internal.d dVar2);

    void zzj(PendingIntent pendingIntent, com.google.android.gms.common.api.internal.d dVar);

    void zzk(PendingIntent pendingIntent);

    void zzl(PendingIntent pendingIntent, com.google.android.gms.common.api.internal.d dVar);

    @Deprecated
    Location zzm();

    Location zzn(String str);

    void zzo(zzbc zzbcVar);

    void zzp(boolean z10);

    void zzq(Location location);

    void zzr(zzai zzaiVar);

    LocationAvailability zzs(String str);

    void zzt(l lVar, zzao zzaoVar, String str);

    void zzu(zzl zzlVar);

    void zzv(PendingIntent pendingIntent, q qVar, com.google.android.gms.common.api.internal.d dVar);
}
