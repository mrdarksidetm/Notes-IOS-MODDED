package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.location.f;
import n9.j;

/* JADX INFO: loaded from: classes.dex */
final class zzau extends f {
    private final e<j> zza;

    zzau(e<j> eVar) {
        this.zza = eVar;
    }

    public final synchronized void zzc() {
        this.zza.a();
    }

    @Override // n9.w
    public final synchronized void zzd(Location location) {
        this.zza.c(new zzat(this, location));
    }
}
