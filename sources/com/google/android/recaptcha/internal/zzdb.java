package com.google.android.recaptcha.internal;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdb {
    private final String zza;
    private final long zzb;
    private final int zzc;

    public zzdb(String str, long j10, int i10) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdb)) {
            return false;
        }
        zzdb zzdbVar = (zzdb) obj;
        return r.b(zzdbVar.zza, this.zza) && zzdbVar.zzb == this.zzb && zzdbVar.zzc == this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
