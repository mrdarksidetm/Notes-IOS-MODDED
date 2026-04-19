package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfa;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public class zzey extends zzcu {
    private final zzfa zza;
    private final zzzc zzb;
    private final Integer zzc;

    private zzey(zzfa zzfaVar, zzzc zzzcVar, Integer num) {
        this.zza = zzfaVar;
        this.zzb = zzzcVar;
        this.zzc = num;
    }

    public static zzey zza(zzfa zzfaVar, Integer num) throws GeneralSecurityException {
        zzzc zzzcVarZzb;
        if (zzfaVar.zzc() == zzfa.zzb.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzzcVarZzb = zzog.zza;
        } else {
            if (zzfaVar.zzc() != zzfa.zzb.zza) {
                throw new GeneralSecurityException("Unknown Variant: " + String.valueOf(zzfaVar.zzc()));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzzcVarZzb = zzog.zzb(num.intValue());
        }
        return new zzey(zzfaVar, zzzcVarZzb, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zzc;
    }

    public final zzfa zzb() {
        return this.zza;
    }

    public final zzzc zzc() {
        return this.zzb;
    }
}
