package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import e9.b;
import java.util.List;
import n9.d;
import n9.g0;
import n9.h;
import n9.i;
import n9.j;
import n9.l;
import n9.m;
import n9.q0;
import w8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends zzi {
    private final zzav zzf;

    public zzaz(Context context, Looper looper, e.b bVar, e.c cVar, String str, c cVar2) {
        super(context, looper, bVar, cVar, str, cVar2);
        this.zzf = new zzav(context, this.zze);
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        synchronized (this.zzf) {
            if (isConnected()) {
                try {
                    this.zzf.zzn();
                    this.zzf.zzo();
                } catch (Exception e10) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e10);
                }
                super.disconnect();
            } else {
                super.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final LocationAvailability zzA() {
        return this.zzf.zzc();
    }

    public final void zzB(zzba zzbaVar, com.google.android.gms.common.api.internal.e<i> eVar, zzai zzaiVar) {
        synchronized (this.zzf) {
            this.zzf.zze(zzbaVar, eVar, zzaiVar);
        }
    }

    public final void zzC(LocationRequest locationRequest, com.google.android.gms.common.api.internal.e<j> eVar, zzai zzaiVar) {
        synchronized (this.zzf) {
            this.zzf.zzd(locationRequest, eVar, zzaiVar);
        }
    }

    public final void zzD(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzf(zzbaVar, pendingIntent, zzaiVar);
    }

    public final void zzE(LocationRequest locationRequest, PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzg(locationRequest, pendingIntent, zzaiVar);
    }

    public final void zzF(e.a<j> aVar, zzai zzaiVar) {
        this.zzf.zzh(aVar, zzaiVar);
    }

    public final void zzG(PendingIntent pendingIntent, zzai zzaiVar) {
        this.zzf.zzj(pendingIntent, zzaiVar);
    }

    public final void zzH(e.a<i> aVar, zzai zzaiVar) {
        this.zzf.zzi(aVar, zzaiVar);
    }

    public final void zzI(boolean z10) {
        this.zzf.zzk(z10);
    }

    public final void zzJ(Location location) {
        this.zzf.zzl(location);
    }

    public final void zzK(zzai zzaiVar) {
        this.zzf.zzm(zzaiVar);
    }

    public final void zzL(l lVar, v8.c<m> cVar, String str) {
        checkConnected();
        w8.m.b(lVar != null, "locationSettingsRequest can't be null nor empty.");
        w8.m.b(cVar != null, "listener can't be null.");
        ((zzam) getService()).zzt(lVar, new zzay(cVar), null);
    }

    public final void zzq(long j10, PendingIntent pendingIntent) {
        checkConnected();
        w8.m.k(pendingIntent);
        w8.m.b(j10 >= 0, "detectionIntervalMillis must be >= 0");
        ((zzam) getService()).zzh(j10, true, pendingIntent);
    }

    public final void zzr(d dVar, PendingIntent pendingIntent, v8.c<Status> cVar) {
        checkConnected();
        w8.m.l(dVar, "activityTransitionRequest must be specified.");
        w8.m.l(pendingIntent, "PendingIntent must be specified.");
        w8.m.l(cVar, "ResultHolder not provided.");
        ((zzam) getService()).zzi(dVar, pendingIntent, new com.google.android.gms.common.api.internal.i(cVar));
    }

    public final void zzs(PendingIntent pendingIntent, v8.c<Status> cVar) {
        checkConnected();
        w8.m.l(cVar, "ResultHolder not provided.");
        ((zzam) getService()).zzj(pendingIntent, new com.google.android.gms.common.api.internal.i(cVar));
    }

    public final void zzt(PendingIntent pendingIntent) {
        checkConnected();
        w8.m.k(pendingIntent);
        ((zzam) getService()).zzk(pendingIntent);
    }

    public final void zzu(PendingIntent pendingIntent, v8.c<Status> cVar) {
        checkConnected();
        w8.m.l(pendingIntent, "PendingIntent must be specified.");
        w8.m.l(cVar, "ResultHolder not provided.");
        ((zzam) getService()).zzl(pendingIntent, new com.google.android.gms.common.api.internal.i(cVar));
    }

    public final void zzv(h hVar, PendingIntent pendingIntent, v8.c<Status> cVar) {
        checkConnected();
        w8.m.l(hVar, "geofencingRequest can't be null.");
        w8.m.l(pendingIntent, "PendingIntent must be specified.");
        w8.m.l(cVar, "ResultHolder not provided.");
        ((zzam) getService()).zzd(hVar, pendingIntent, new zzaw(cVar));
    }

    public final void zzw(g0 g0Var, v8.c<Status> cVar) {
        checkConnected();
        w8.m.l(g0Var, "removeGeofencingRequest can't be null.");
        w8.m.l(cVar, "ResultHolder not provided.");
        ((zzam) getService()).zzg(g0Var, new zzax(cVar));
    }

    public final void zzx(PendingIntent pendingIntent, v8.c<Status> cVar) {
        checkConnected();
        w8.m.l(pendingIntent, "PendingIntent must be specified.");
        w8.m.l(cVar, "ResultHolder not provided.");
        ((zzam) getService()).zze(pendingIntent, new zzax(cVar), getContext().getPackageName());
    }

    public final void zzy(List<String> list, v8.c<Status> cVar) {
        checkConnected();
        w8.m.b(list != null && list.size() > 0, "geofenceRequestIds can't be null nor empty.");
        w8.m.l(cVar, "ResultHolder not provided.");
        ((zzam) getService()).zzf((String[]) list.toArray(new String[0]), new zzax(cVar), getContext().getPackageName());
    }

    public final Location zzz(String str) {
        return b.b(getAvailableFeatures(), q0.f16073c) ? this.zzf.zza(str) : this.zzf.zzb();
    }
}
