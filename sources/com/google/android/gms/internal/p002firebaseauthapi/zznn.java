package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zznn {
    private final zzng zza;
    private final List<zznp> zzb;
    private final Integer zzc;

    private zznn(zzng zzngVar, List<zznp> list, Integer num) {
        this.zza = zzngVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznn)) {
            return false;
        }
        zznn zznnVar = (zznn) obj;
        return this.zza.equals(zznnVar.zza) && this.zzb.equals(zznnVar.zzb) && Objects.equals(this.zzc, zznnVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
