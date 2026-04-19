package com.google.android.recaptcha.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzkf extends zzke {
    zzkf() {
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final int zza(Map.Entry entry) {
        return ((zzkp) entry.getKey()).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final zzki zzb(Object obj) {
        return ((zzko) obj).zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final zzki zzc(Object obj) {
        return ((zzko) obj).zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final Object zzd(zzkd zzkdVar, zzlx zzlxVar, int i10) {
        return zzkdVar.zza(zzlxVar, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    @Override // com.google.android.recaptcha.internal.zzke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Object zze(java.lang.Object r2, com.google.android.recaptcha.internal.zzmj r3, java.lang.Object r4, com.google.android.recaptcha.internal.zzkd r5, com.google.android.recaptcha.internal.zzki r6, java.lang.Object r7, com.google.android.recaptcha.internal.zznb r8) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzkf.zze(java.lang.Object, com.google.android.recaptcha.internal.zzmj, java.lang.Object, com.google.android.recaptcha.internal.zzkd, com.google.android.recaptcha.internal.zzki, java.lang.Object, com.google.android.recaptcha.internal.zznb):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final void zzf(Object obj) {
        ((zzko) obj).zzb.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final void zzg(zzmj zzmjVar, Object obj, zzkd zzkdVar, zzki zzkiVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final void zzh(zziv zzivVar, Object obj, zzkd zzkdVar, zzki zzkiVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final void zzi(zzno zznoVar, Map.Entry entry) {
        zzkp zzkpVar = (zzkp) entry.getKey();
        zznm zznmVar = zznm.zza;
        switch (zzkpVar.zzb.ordinal()) {
            case 0:
                zznoVar.zzf(zzkpVar.zza, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                zznoVar.zzo(zzkpVar.zza, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                zznoVar.zzt(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                zznoVar.zzK(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                zznoVar.zzr(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                zznoVar.zzm(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                zznoVar.zzk(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                zznoVar.zzb(zzkpVar.zza, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                zznoVar.zzG(zzkpVar.zza, (String) entry.getValue());
                break;
            case 9:
                zznoVar.zzq(zzkpVar.zza, entry.getValue(), zzmg.zza().zzb(entry.getValue().getClass()));
                break;
            case 10:
                zznoVar.zzv(zzkpVar.zza, entry.getValue(), zzmg.zza().zzb(entry.getValue().getClass()));
                break;
            case 11:
                zznoVar.zzd(zzkpVar.zza, (zziv) entry.getValue());
                break;
            case 12:
                zznoVar.zzI(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                zznoVar.zzr(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                zznoVar.zzx(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                zznoVar.zzz(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                zznoVar.zzB(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                zznoVar.zzD(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final boolean zzj(zzlx zzlxVar) {
        return zzlxVar instanceof zzko;
    }
}
