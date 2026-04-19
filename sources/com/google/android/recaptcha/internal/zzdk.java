package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import le.k;
import le.n0;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdk implements zzdg {
    private static Timer zza;
    private final Context zzb;
    private final zzdl zzc;
    private final n0 zzd;
    private final zzda zze;

    public zzdk(Context context, zzdl zzdlVar, n0 n0Var) {
        this.zzb = context;
        this.zzc = zzdlVar;
        this.zzd = n0Var;
        zzda zzdaVar = null;
        try {
            zzda zzdaVar2 = zzda.zzd;
            zzdaVar2 = zzdaVar2 == null ? new zzda(context, null) : zzdaVar2;
            zzda.zzd = zzdaVar2;
            zzdaVar = zzdaVar2;
        } catch (Exception unused) {
        }
        this.zze = zzdaVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzda zzdaVar;
        zzre zzreVarZzk;
        int iZzL;
        int i10;
        zzda zzdaVar2 = this.zze;
        if (zzdaVar2 != null) {
            for (List<zzdb> list : c0.I0(zzdaVar2.zzd(), 20, 20, true)) {
                zzor zzorVarZzi = zzos.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzdb zzdbVar : list) {
                    try {
                        zzreVarZzk = zzre.zzk(zzhz.zzg().zzj(zzdbVar.zzc()));
                        iZzL = zzreVarZzk.zzL();
                        i10 = iZzL - 1;
                    } catch (Exception unused) {
                        zzda zzdaVar3 = this.zze;
                        if (zzdaVar3 != null) {
                            zzdaVar3.zzf(zzdbVar);
                        }
                    }
                    if (iZzL == 0) {
                        throw null;
                    }
                    if (i10 == 0) {
                        zzorVarZzi.zzp(zzreVarZzk.zzf());
                    } else if (i10 == 1) {
                        zzorVarZzi.zzq(zzreVarZzk.zzg());
                    }
                    arrayList.add(zzdbVar);
                }
                if (zzorVarZzi.zzd() + zzorVarZzi.zze() != 0) {
                    if (this.zzc.zza(((zzos) zzorVarZzi.zzj()).zzd()) && (zzdaVar = this.zze) != null) {
                        zzdaVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzdh(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzdg
    public final void zza(zzre zzreVar) {
        k.d(this.zzd, null, null, new zzdj(this, zzreVar, null), 3, null);
        zzh();
    }
}
