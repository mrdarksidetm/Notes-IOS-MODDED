package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public class zzli {
    protected volatile zzlx zza;
    private volatile zziv zzb;

    static {
        int i10 = zzkd.zzb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzli)) {
            return false;
        }
        zzli zzliVar = (zzli) obj;
        zzlx zzlxVar = this.zza;
        zzlx zzlxVar2 = zzliVar.zza;
        if (zzlxVar == null && zzlxVar2 == null) {
            return zzb().equals(zzliVar.zzb());
        }
        if (zzlxVar != null && zzlxVar2 != null) {
            return zzlxVar.equals(zzlxVar2);
        }
        if (zzlxVar != null) {
            zzliVar.zzd(zzlxVar.zzac());
            return zzlxVar.equals(zzliVar.zza);
        }
        zzd(zzlxVar2.zzac());
        return this.zza.equals(zzlxVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zziu) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzn();
        }
        return 0;
    }

    public final zziv zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                return this.zzb;
            }
            this.zzb = this.zza == null ? zziv.zzb : this.zza.zzb();
            return this.zzb;
        }
    }

    public final zzlx zzc(zzlx zzlxVar) {
        zzlx zzlxVar2 = this.zza;
        this.zzb = null;
        this.zza = zzlxVar;
        return zzlxVar2;
    }

    protected final void zzd(zzlx zzlxVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzlxVar;
                this.zzb = zziv.zzb;
            } catch (zzlc unused) {
                this.zza = zzlxVar;
                this.zzb = zziv.zzb;
            }
        }
    }
}
