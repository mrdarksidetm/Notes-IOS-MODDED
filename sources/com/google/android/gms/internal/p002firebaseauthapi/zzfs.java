package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzfs {
    private static final zznx<zzft> zza = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfr
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzfp.zza((zzft) zzchVar, zzze.zza(32), num);
        }
    };
    private static final zzor<zzfp, zzbg> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfu
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzhw.zza((zzfp) zzbpVar);
        }
    }, zzfp.class, zzbg.class);

    public static void zza(boolean z10) {
        zzhv.zza();
        zzod zzodVarZza = zzod.zza();
        HashMap map = new HashMap();
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzfh.zzg);
        zzodVarZza.zza(Collections.unmodifiableMap(map));
        zzoc.zza().zza(zzb);
        zznv.zza().zza(zza, zzft.class);
    }
}
