package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import n9.o;
import v8.c;

/* JADX INFO: loaded from: classes.dex */
final class zzaw extends zzaj {
    private c<Status> zza;

    public zzaw(c<Status> cVar) {
        this.zza = cVar;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i10, String[] strArr) {
        if (this.zza == null) {
            Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times", new Exception());
            return;
        }
        this.zza.setResult(o.b(o.a(i10)));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i10, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByRequestIdsResult", new Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i10, PendingIntent pendingIntent) {
        Log.wtf("LocationClientImpl", "Unexpected call to onRemoveGeofencesByPendingIntentResult", new Exception());
    }
}
