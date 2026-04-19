package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import java.util.List;
import n9.f;
import n9.g;
import n9.g0;
import n9.h;
import u8.d;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf implements g {
    @Deprecated
    public final d<Status> addGeofences(e eVar, List<f> list, PendingIntent pendingIntent) {
        h.a aVar = new h.a();
        aVar.b(list);
        aVar.d(5);
        return eVar.b(new zzac(this, eVar, aVar.c(), pendingIntent));
    }

    public final d<Status> addGeofences(e eVar, h hVar, PendingIntent pendingIntent) {
        return eVar.b(new zzac(this, eVar, hVar, pendingIntent));
    }

    public final d<Status> removeGeofences(e eVar, PendingIntent pendingIntent) {
        return zza(eVar, g0.x(pendingIntent));
    }

    public final d<Status> removeGeofences(e eVar, List<String> list) {
        return zza(eVar, g0.u(list));
    }

    public final d<Status> zza(e eVar, g0 g0Var) {
        return eVar.b(new zzad(this, eVar, g0Var));
    }
}
