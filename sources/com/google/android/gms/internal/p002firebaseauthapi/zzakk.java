package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public class zzakk {
    private volatile zzalc zza;
    private volatile zzaip zzb;

    private final zzalc zzb(zzalc zzalcVar) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza == null) {
                    try {
                        this.zza = zzalcVar;
                        this.zzb = zzaip.zza;
                    } catch (zzakf unused) {
                        this.zza = zzalcVar;
                        this.zzb = zzaip.zza;
                    }
                }
            }
        }
        return this.zza;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzakk)) {
            return false;
        }
        zzakk zzakkVar = (zzakk) obj;
        zzalc zzalcVar = this.zza;
        zzalc zzalcVar2 = zzakkVar.zza;
        return (zzalcVar == null && zzalcVar2 == null) ? zzb().equals(zzakkVar.zzb()) : (zzalcVar == null || zzalcVar2 == null) ? zzalcVar != null ? zzalcVar.equals(zzakkVar.zzb(zzalcVar.zzg())) : zzb(zzalcVar2.zzg()).equals(zzalcVar2) : zzalcVar.equals(zzalcVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return this.zzb.zzb();
        }
        if (this.zza != null) {
            return this.zza.zzl();
        }
        return 0;
    }

    public final zzalc zza(zzalc zzalcVar) {
        zzalc zzalcVar2 = this.zza;
        this.zzb = null;
        this.zza = zzalcVar;
        return zzalcVar2;
    }

    public final zzaip zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            this.zzb = this.zza == null ? zzaip.zza : this.zza.a_();
            return this.zzb;
        }
    }
}
