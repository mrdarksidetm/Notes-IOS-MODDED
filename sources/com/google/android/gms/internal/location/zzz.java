package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.InvocationTargetException;
import n9.e;
import n9.i;
import n9.j;
import n9.k;
import u8.d;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzz implements e {
    public final d<Status> flushLocations(com.google.android.gms.common.api.e eVar) {
        return eVar.b(new zzq(this, eVar));
    }

    public final Location getLastLocation(com.google.android.gms.common.api.e eVar) {
        String str;
        zzaz zzazVarA = k.a(eVar);
        Context contextE = eVar.e();
        if (Build.VERSION.SDK_INT < 30 || contextE == null) {
            str = null;
        } else {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(contextE, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                str = null;
            }
        }
        try {
            return zzazVarA.zzz(str);
        } catch (Exception unused2) {
            return null;
        }
    }

    public final LocationAvailability getLocationAvailability(com.google.android.gms.common.api.e eVar) {
        try {
            return k.a(eVar).zzA();
        } catch (Exception unused) {
            return null;
        }
    }

    public final d<Status> removeLocationUpdates(com.google.android.gms.common.api.e eVar, PendingIntent pendingIntent) {
        return eVar.b(new zzw(this, eVar, pendingIntent));
    }

    public final d<Status> removeLocationUpdates(com.google.android.gms.common.api.e eVar, i iVar) {
        return eVar.b(new zzn(this, eVar, iVar));
    }

    public final d<Status> removeLocationUpdates(com.google.android.gms.common.api.e eVar, j jVar) {
        return eVar.b(new zzv(this, eVar, jVar));
    }

    public final d<Status> requestLocationUpdates(com.google.android.gms.common.api.e eVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return eVar.b(new zzu(this, eVar, locationRequest, pendingIntent));
    }

    public final d<Status> requestLocationUpdates(com.google.android.gms.common.api.e eVar, LocationRequest locationRequest, i iVar, Looper looper) {
        return eVar.b(new zzt(this, eVar, locationRequest, iVar, looper));
    }

    public final d<Status> requestLocationUpdates(com.google.android.gms.common.api.e eVar, LocationRequest locationRequest, j jVar) {
        m.l(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return eVar.b(new zzr(this, eVar, locationRequest, jVar));
    }

    public final d<Status> requestLocationUpdates(com.google.android.gms.common.api.e eVar, LocationRequest locationRequest, j jVar, Looper looper) {
        return eVar.b(new zzs(this, eVar, locationRequest, jVar, looper));
    }

    public final d<Status> setMockLocation(com.google.android.gms.common.api.e eVar, Location location) {
        return eVar.b(new zzp(this, eVar, location));
    }

    public final d<Status> setMockMode(com.google.android.gms.common.api.e eVar, boolean z10) {
        return eVar.b(new zzo(this, eVar, z10));
    }
}
