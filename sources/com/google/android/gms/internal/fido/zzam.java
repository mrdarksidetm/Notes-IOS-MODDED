package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzam {
    private final String zza;
    private final zzak zzb;
    private zzak zzc;

    /* synthetic */ zzam(String str, zzal zzalVar) {
        zzak zzakVar = new zzak(null);
        this.zzb = zzakVar;
        this.zzc = zzakVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzak zzakVar = this.zzb.zzc;
        String str = "";
        while (zzakVar != null) {
            Object obj = zzakVar.zzb;
            sb2.append(str);
            String str2 = zzakVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzakVar = zzakVar.zzc;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzam zza(String str, int i10) {
        String strValueOf = String.valueOf(i10);
        zzai zzaiVar = new zzai(null);
        this.zzc.zzc = zzaiVar;
        this.zzc = zzaiVar;
        zzaiVar.zzb = strValueOf;
        zzaiVar.zza = "errorCode";
        return this;
    }

    public final zzam zzb(String str, Object obj) {
        zzak zzakVar = new zzak(null);
        this.zzc.zzc = zzakVar;
        this.zzc = zzakVar;
        zzakVar.zzb = obj;
        zzakVar.zza = str;
        return this;
    }
}
