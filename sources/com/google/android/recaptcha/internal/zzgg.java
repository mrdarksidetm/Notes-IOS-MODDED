package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import md.a0;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgg implements zzge {
    private final zzgf zza;

    public zzgg(zzgf zzgfVar, zzgd zzgdVar) {
        this.zza = zzgfVar;
    }

    private final zzrg zzb(String str, List list) throws zzby {
        if (str.length() == 0) {
            throw new zzby(3, 17, null);
        }
        try {
            zzgc zzgcVar = new zzgc(this.zza.zza(c0.D0(list)), 255L, zzgc.zza);
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append((char) a0.b(a0.b(str.charAt(i10)) ^ a0.b((int) zzgcVar.zza())));
            }
            return zzrg.zzg(zzhz.zzh().zzj(sb2.toString()));
        } catch (Exception e10) {
            throw new zzby(3, 18, e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzge
    public final zzrg zza(zzro zzroVar) throws zzby {
        zzgz zzgzVarZzb = zzgz.zzb();
        zzrg zzrgVarZzb = zzb(zzroVar.zzj(), zzroVar.zzk());
        zzgzVarZzb.zzf();
        long jZza = zzgzVarZzb.zza(TimeUnit.MICROSECONDS);
        int i10 = zzbq.zza;
        zzbq.zza(zzbr.zzh.zza(), jZza);
        return zzrgVarZzb;
    }
}
