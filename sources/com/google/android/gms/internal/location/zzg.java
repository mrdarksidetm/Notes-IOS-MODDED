package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import n9.b;
import u8.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzg implements b {
    public final d<Status> removeActivityUpdates(e eVar, PendingIntent pendingIntent) {
        return eVar.b(new zze(this, eVar, pendingIntent));
    }

    public final d<Status> requestActivityUpdates(e eVar, long j10, PendingIntent pendingIntent) {
        return eVar.b(new zzd(this, eVar, j10, pendingIntent));
    }
}
