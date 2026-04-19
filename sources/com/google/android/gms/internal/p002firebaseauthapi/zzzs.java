package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import ba.x1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzzs implements zzael<zzagb> {
    private final /* synthetic */ zzaem zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ x1 zze;
    private final /* synthetic */ zzade zzf;
    private final /* synthetic */ zzagl zzg;

    zzzs(zzzk zzzkVar, zzaem zzaemVar, String str, String str2, Boolean bool, x1 x1Var, zzade zzadeVar, zzagl zzaglVar) {
        this.zza = zzaemVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = x1Var;
        this.zzf = zzadeVar;
        this.zzg = zzaglVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagb zzagbVar) {
        zzagr zzagrVar;
        List<zzage> listZza = zzagbVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        boolean zBooleanValue = false;
        zzage zzageVar = listZza.get(0);
        zzagu zzaguVarZzf = zzageVar.zzf();
        List<zzagr> listZza2 = zzaguVarZzf != null ? zzaguVarZzf.zza() : null;
        if (listZza2 != null && !listZza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                zzagrVar = listZza2.get(0);
            } else {
                for (int i10 = 0; i10 < listZza2.size(); i10++) {
                    if (listZza2.get(i10).zzf().equals(this.zzb)) {
                        zzagrVar = listZza2.get(i10);
                    }
                }
            }
            zzagrVar.zza(this.zzc);
            break;
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (zzageVar.zzb() - zzageVar.zza() < 1000) {
            zBooleanValue = true;
        }
        zzageVar.zza(zBooleanValue);
        zzageVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzageVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(str);
    }
}
