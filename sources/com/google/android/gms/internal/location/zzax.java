package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import n9.o;
import v8.c;

/* JADX INFO: loaded from: classes.dex */
final class zzax extends zzaj {
    private c<Status> zza;

    public zzax(c<Status> cVar) {
        this.zza = cVar;
    }

    private final void zze(int i10) {
        if (this.zza == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        this.zza.setResult(o.b(o.a(i10)));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i10, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i10, String[] strArr) {
        zze(i10);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i10, PendingIntent pendingIntent) {
        zze(i10);
    }
}
