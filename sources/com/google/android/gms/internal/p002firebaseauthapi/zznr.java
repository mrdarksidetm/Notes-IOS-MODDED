package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zznr {
    public static final zznk zza = new zznt();

    public static <P> zznn zza(zzoz<P> zzozVar) {
        zzbr zzbrVar;
        zznm zznmVar = new zznm();
        zznmVar.zza(zzozVar.zza());
        Iterator<List<zzpb<P>>> it = zzozVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzpb<P> zzpbVar : it.next()) {
                int i10 = zznq.zza[zzpbVar.zzb().ordinal()];
                if (i10 == 1) {
                    zzbrVar = zzbr.zza;
                } else if (i10 == 2) {
                    zzbrVar = zzbr.zzb;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzbrVar = zzbr.zzc;
                }
                int iZza = zzpbVar.zza();
                String strZze = zzpbVar.zze();
                if (strZze.startsWith("type.googleapis.com/google.crypto.")) {
                    strZze = strZze.substring(34);
                }
                zznmVar.zza(zzbrVar, iZza, strZze, zzpbVar.zzc().name());
            }
        }
        if (zzozVar.zzb() != null) {
            zznmVar.zza(zzozVar.zzb().zza());
        }
        try {
            return zznmVar.zza();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
