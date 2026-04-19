package com.google.android.gms.internal.mlkit_common;

import android.os.SystemClock;
import va.b;
import w8.e;
import wa.h;
import wa.j;

/* JADX INFO: loaded from: classes.dex */
public final class zzte {
    private static final e zza = new e("RemoteModelUtils", "");

    public static zznn zza(b bVar, j jVar, zzsu zzsuVar) {
        h hVarZzb = zzsuVar.zzb();
        String strA = bVar.a();
        zznt zzntVar = new zznt();
        zzno zznoVar = new zzno();
        zznoVar.zzc(bVar.b());
        zznoVar.zzd(zznq.CLOUD);
        zznoVar.zza(zzaf.zzb(strA));
        int iOrdinal = hVarZzb.ordinal();
        zznoVar.zzb(iOrdinal != 2 ? iOrdinal != 4 ? iOrdinal != 5 ? zznp.TYPE_UNKNOWN : zznp.BASE_DIGITAL_INK : zznp.CUSTOM : zznp.BASE_TRANSLATE);
        zzntVar.zzb(zznoVar.zzg());
        zznw zznwVarZzc = zzntVar.zzc();
        zznk zznkVar = new zznk();
        zznkVar.zzd(zzsuVar.zzc());
        zznkVar.zzc(zzsuVar.zzd());
        zznkVar.zzb(Long.valueOf(zzsuVar.zza()));
        zznkVar.zzf(zznwVarZzc);
        if (zzsuVar.zzg()) {
            long jB = jVar.b(bVar);
            if (jB == 0) {
                zza.f("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                long jC = jVar.c(bVar);
                if (jC == 0) {
                    jC = SystemClock.elapsedRealtime();
                    jVar.d(bVar, jC);
                }
                zznkVar.zzg(Long.valueOf(jC - jB));
            }
        }
        if (zzsuVar.zzf()) {
            long jB2 = jVar.b(bVar);
            if (jB2 == 0) {
                zza.f("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                zznkVar.zze(Long.valueOf(SystemClock.elapsedRealtime() - jB2));
            }
        }
        return zznkVar.zzi();
    }
}
