package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzli implements zzbn {
    private zzli(zzzc zzzcVar, zzlk zzlkVar, zzll zzllVar, zzlh zzlhVar, zzzc zzzcVar2) {
        zzzcVar.zzb();
        zzzcVar2.zzb();
    }

    public static zzbn zza(zzke zzkeVar) {
        zzju zzjuVarZzb = zzkeVar.zzb();
        return new zzli(zzkeVar.zzd(), zza(zzjuVarZzb.zze()), zza(zzjuVarZzb.zzd()), zza(zzjuVarZzb.zzb()), zzkeVar.zzc());
    }

    static zzlh zza(zzju.zzb zzbVar) throws GeneralSecurityException {
        if (zzbVar.equals(zzju.zzb.zza)) {
            return new zzkq(16);
        }
        if (zzbVar.equals(zzju.zzb.zzb)) {
            return new zzkq(32);
        }
        if (zzbVar.equals(zzju.zzb.zzc)) {
            return new zzkt();
        }
        throw new GeneralSecurityException("Unrecognized HPKE AEAD identifier");
    }

    static zzlk zza(zzju.zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar.equals(zzju.zzf.zzd)) {
            return new zzly(new zzle("HmacSha256"));
        }
        if (zzfVar.equals(zzju.zzf.zza)) {
            return zzlx.zza(zzya.NIST_P256);
        }
        if (zzfVar.equals(zzju.zzf.zzb)) {
            return zzlx.zza(zzya.NIST_P384);
        }
        if (zzfVar.equals(zzju.zzf.zzc)) {
            return zzlx.zza(zzya.NIST_P521);
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    static zzll zza(zzju.zzc zzcVar) throws GeneralSecurityException {
        if (zzcVar.equals(zzju.zzc.zza)) {
            return new zzle("HmacSha256");
        }
        if (zzcVar.equals(zzju.zzc.zzb)) {
            return new zzle("HmacSha384");
        }
        if (zzcVar.equals(zzju.zzc.zzc)) {
            return new zzle("HmacSha512");
        }
        throw new GeneralSecurityException("Unrecognized HPKE KDF identifier");
    }
}
