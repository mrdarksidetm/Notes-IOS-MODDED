package com.google.android.recaptcha.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzba {
    public static final zzbb zza() {
        zzbb zzbbVar = zzbb.zzb;
        if (zzbbVar != null) {
            return zzbbVar;
        }
        zzbb zzbbVar2 = new zzbb((Map) zzbb.zzc.invoke(), null);
        zzbb.zzb = zzbbVar2;
        return zzbbVar2;
    }

    public static final void zzb(zzbc... zzbcVarArr) {
        zzbb.zzc = new zzaz(zzbcVarArr);
    }
}
