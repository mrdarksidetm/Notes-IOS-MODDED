package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzy {
    private final String zza;
    private final zzw zzb;
    private zzw zzc;

    /* synthetic */ zzy(String str, zzx zzxVar) {
        zzw zzwVar = new zzw();
        this.zzb = zzwVar;
        this.zzc = zzwVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzw zzwVar = this.zzb.zzc;
        String str = "";
        while (zzwVar != null) {
            Object obj = zzwVar.zzb;
            sb2.append(str);
            String str2 = zzwVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzwVar = zzwVar.zzc;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzy zza(String str, Object obj) {
        zzw zzwVar = new zzw();
        this.zzc.zzc = zzwVar;
        this.zzc = zzwVar;
        zzwVar.zzb = obj;
        zzwVar.zza = str;
        return this;
    }

    public final zzy zzb(String str, boolean z10) {
        String strValueOf = String.valueOf(z10);
        zzv zzvVar = new zzv(null);
        this.zzc.zzc = zzvVar;
        this.zzc = zzvVar;
        zzvVar.zzb = strValueOf;
        zzvVar.zza = "isManifestFile";
        return this;
    }
}
