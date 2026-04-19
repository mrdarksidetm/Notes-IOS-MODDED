package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzls {
    zzls() {
    }

    public static final boolean zza(Object obj) {
        return !((zzlr) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzlr zzlrVarZzb = (zzlr) obj;
        zzlr zzlrVar = (zzlr) obj2;
        if (!zzlrVar.isEmpty()) {
            if (!zzlrVarZzb.zze()) {
                zzlrVarZzb = zzlrVarZzb.zzb();
            }
            zzlrVarZzb.zzd(zzlrVar);
        }
        return zzlrVarZzb;
    }
}
