package com.google.android.recaptcha.internal;

import je.w;
import pd.b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbp implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        return "avgExecutionTime: " + w.j0(String.valueOf(this.zzb / ((long) this.zza)), 10, (char) 0, 2, null) + " us| maxExecutionTime: " + w.j0(String.valueOf(this.zzc), 10, (char) 0, 2, null) + " us| totalTime: " + w.j0(String.valueOf(this.zzb), 10, (char) 0, 2, null) + " us| #Usages: " + w.j0(String.valueOf(this.zza), 5, (char) 0, 2, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbp zzbpVar) {
        return b.a(Long.valueOf(this.zzb), Long.valueOf(zzbpVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j10) {
        this.zzc = j10;
    }

    public final void zzf(long j10) {
        this.zzb = j10;
    }

    public final void zzg(int i10) {
        this.zza = i10;
    }
}
