package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzer;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public class zzes extends zzcu {
    private final zzer zza;
    private final zzzc zzb;
    private final Integer zzc;

    private zzes(zzer zzerVar, zzzc zzzcVar, Integer num) {
        this.zza = zzerVar;
        this.zzb = zzzcVar;
        this.zzc = num;
    }

    public static zzes zza(zzer zzerVar, Integer num) throws GeneralSecurityException {
        zzzc zzzcVarZza;
        if (zzerVar.zzb() == zzer.zza.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzzcVarZza = zzzc.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzerVar.zzb() != zzer.zza.zzb) {
                throw new GeneralSecurityException("Unknown Variant: " + String.valueOf(zzerVar.zzb()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzzcVarZza = zzzc.zza(new byte[0]);
        }
        return new zzes(zzerVar, zzzcVarZza, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zzc;
    }

    public final zzer zzb() {
        return this.zza;
    }

    public final zzzc zzc() {
        return this.zzb;
    }
}
