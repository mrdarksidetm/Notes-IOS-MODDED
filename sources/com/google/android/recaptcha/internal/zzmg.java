package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzmg {
    public static final /* synthetic */ int zza = 0;
    private static final zzmg zzb = new zzmg();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzml zzc = new zzlp();

    private zzmg() {
    }

    public static zzmg zza() {
        return zzb;
    }

    public final zzmk zzb(Class cls) {
        zzla.zzc(cls, "messageType");
        zzmk zzmkVarZza = (zzmk) this.zzd.get(cls);
        if (zzmkVarZza == null) {
            zzmkVarZza = this.zzc.zza(cls);
            zzla.zzc(cls, "messageType");
            zzmk zzmkVar = (zzmk) this.zzd.putIfAbsent(cls, zzmkVarZza);
            if (zzmkVar != null) {
                return zzmkVar;
            }
        }
        return zzmkVarZza;
    }
}
