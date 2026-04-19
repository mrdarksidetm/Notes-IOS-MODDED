package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzne extends zzch {
    private final zzpf zza;

    public zzne(zzpf zzpfVar) {
        this.zza = zzpfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzne)) {
            return false;
        }
        zzpf zzpfVar = ((zzne) obj).zza;
        return this.zza.zza().zzd().equals(zzpfVar.zza().zzd()) && this.zza.zza().zzf().equals(zzpfVar.zza().zzf()) && this.zza.zza().zze().equals(zzpfVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzc());
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zza().zzf();
        int i10 = zznh.zza[this.zza.zza().zzd().ordinal()];
        objArr[1] = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zza.zza().zzd() != zzws.RAW;
    }

    public final zzpf zzb() {
        return this.zza;
    }
}
