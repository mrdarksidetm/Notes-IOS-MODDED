package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzajj implements zzanf {
    private final zzajg zza;

    private zzajj(zzajg zzajgVar) {
        zzajg zzajgVar2 = (zzajg) zzakb.zza(zzajgVar, "output");
        this.zza = zzajgVar2;
        zzajgVar2.zze = this;
    }

    public static zzajj zza(zzajg zzajgVar) {
        zzajj zzajjVar = zzajgVar.zze;
        return zzajjVar != null ? zzajjVar : new zzajj(zzajgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    @Deprecated
    public final void zza(int i10) {
        this.zza.zzk(i10, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i10, double d10) {
        this.zza.zzb(i10, d10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i10, float f10) {
        this.zza.zzb(i10, f10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i10, int i11) {
        this.zza.zzi(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i10, zzaip zzaipVar) {
        this.zza.zzc(i10, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final <K, V> void zza(int i10, zzakx<K, V> zzakxVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzk(i10, 2);
            this.zza.zzn(zzaku.zza(zzakxVar, entry.getKey(), entry.getValue()));
            zzaku.zza(this.zza, zzakxVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i10, Object obj) {
        if (obj instanceof zzaip) {
            this.zza.zzd(i10, (zzaip) obj);
        } else {
            this.zza.zzb(i10, (zzalc) obj);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i10, Object obj, zzalv zzalvVar) {
        zzajg zzajgVar = this.zza;
        zzajgVar.zzk(i10, 3);
        zzalvVar.zza((zzalc) obj, zzajgVar.zze);
        zzajgVar.zzk(i10, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i10, String str) {
        this.zza.zzb(i10, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i10, List<zzaip> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zzc(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i10, List<?> list, zzalv zzalvVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zza(i10, list.get(i11), zzalvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzain)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzb(i10, list.get(i11).booleanValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZza = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZza += zzajg.zza(list.get(i12).booleanValue());
            }
            this.zza.zzn(iZza);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        zzain zzainVar = (zzain) list;
        if (!z10) {
            while (i11 < zzainVar.size()) {
                this.zza.zzb(i10, zzainVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZza2 = 0;
        for (int i13 = 0; i13 < zzainVar.size(); i13++) {
            iZza2 += zzajg.zza(zzainVar.zzb(i13));
        }
        this.zza.zzn(iZza2);
        while (i11 < zzainVar.size()) {
            this.zza.zzb(zzainVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i10, boolean z10) {
        this.zza.zzb(i10, z10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    @Deprecated
    public final void zzb(int i10) {
        this.zza.zzk(i10, 3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i10, Object obj, zzalv zzalvVar) {
        this.zza.zzc(i10, (zzalc) obj, zzalvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof zzakn)) {
            while (i11 < list.size()) {
                this.zza.zzb(i10, list.get(i11));
                i11++;
            }
            return;
        }
        zzakn zzaknVar = (zzakn) list;
        while (i11 < list.size()) {
            Object objZza = zzaknVar.zza(i11);
            if (objZza instanceof String) {
                this.zza.zzb(i10, (String) objZza);
            } else {
                this.zza.zzc(i10, (zzaip) objZza);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i10, List<?> list, zzalv zzalvVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzb(i10, list.get(i11), zzalvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzaji)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzb(i10, list.get(i11).doubleValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZza = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZza += zzajg.zza(list.get(i12).doubleValue());
            }
            this.zza.zzn(iZza);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        zzaji zzajiVar = (zzaji) list;
        if (!z10) {
            while (i11 < zzajiVar.size()) {
                this.zza.zzb(i10, zzajiVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZza2 = 0;
        for (int i13 = 0; i13 < zzajiVar.size(); i13++) {
            iZza2 += zzajg.zza(zzajiVar.zzb(i13));
        }
        this.zza.zzn(iZza2);
        while (i11 < zzajiVar.size()) {
            this.zza.zzb(zzajiVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzc(int i10, int i11) {
        this.zza.zzi(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzc(int i10, long j10) {
        this.zza.zzf(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzc(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzajz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzi(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzc = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzc += zzajg.zzc(list.get(i12).intValue());
            }
            this.zza.zzn(iZzc);
            while (i11 < list.size()) {
                this.zza.zzl(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z10) {
            while (i11 < zzajzVar.size()) {
                this.zza.zzi(i10, zzajzVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzc2 = 0;
        for (int i13 = 0; i13 < zzajzVar.size(); i13++) {
            iZzc2 += zzajg.zzc(zzajzVar.zzb(i13));
        }
        this.zza.zzn(iZzc2);
        while (i11 < zzajzVar.size()) {
            this.zza.zzl(zzajzVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzd(int i10, int i11) {
        this.zza.zzh(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzd(int i10, long j10) {
        this.zza.zzg(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzd(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzajz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzd = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzd += zzajg.zzd(list.get(i12).intValue());
            }
            this.zza.zzn(iZzd);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z10) {
            while (i11 < zzajzVar.size()) {
                this.zza.zzh(i10, zzajzVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzd2 = 0;
        for (int i13 = 0; i13 < zzajzVar.size(); i13++) {
            iZzd2 += zzajg.zzd(zzajzVar.zzb(i13));
        }
        this.zza.zzn(iZzd2);
        while (i11 < zzajzVar.size()) {
            this.zza.zzk(zzajzVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zze(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zze(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zze(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzakr)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzc = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzc += zzajg.zzc(list.get(i12).longValue());
            }
            this.zza.zzn(iZzc);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z10) {
            while (i11 < zzakrVar.size()) {
                this.zza.zzf(i10, zzakrVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzc2 = 0;
        for (int i13 = 0; i13 < zzakrVar.size(); i13++) {
            iZzc2 += zzajg.zzc(zzakrVar.zzb(i13));
        }
        this.zza.zzn(iZzc2);
        while (i11 < zzakrVar.size()) {
            this.zza.zzh(zzakrVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzf(int i10, int i11) {
        this.zza.zzl(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzf(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzajx)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzb(i10, list.get(i11).floatValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZza = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZza += zzajg.zza(list.get(i12).floatValue());
            }
            this.zza.zzn(iZza);
            while (i11 < list.size()) {
                this.zza.zzb(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        zzajx zzajxVar = (zzajx) list;
        if (!z10) {
            while (i11 < zzajxVar.size()) {
                this.zza.zzb(i10, zzajxVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZza2 = 0;
        for (int i13 = 0; i13 < zzajxVar.size(); i13++) {
            iZza2 += zzajg.zza(zzajxVar.zzb(i13));
        }
        this.zza.zzn(iZza2);
        while (i11 < zzajxVar.size()) {
            this.zza.zzb(zzajxVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzg(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzajz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzi(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZze = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZze += zzajg.zze(list.get(i12).intValue());
            }
            this.zza.zzn(iZze);
            while (i11 < list.size()) {
                this.zza.zzl(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z10) {
            while (i11 < zzajzVar.size()) {
                this.zza.zzi(i10, zzajzVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZze2 = 0;
        for (int i13 = 0; i13 < zzajzVar.size(); i13++) {
            iZze2 += zzajg.zze(zzajzVar.zzb(i13));
        }
        this.zza.zzn(iZze2);
        while (i11 < zzajzVar.size()) {
            this.zza.zzl(zzajzVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzh(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzakr)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzd = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzd += zzajg.zzd(list.get(i12).longValue());
            }
            this.zza.zzn(iZzd);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z10) {
            while (i11 < zzakrVar.size()) {
                this.zza.zzh(i10, zzakrVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzd2 = 0;
        for (int i13 = 0; i13 < zzakrVar.size(); i13++) {
            iZzd2 += zzajg.zzd(zzakrVar.zzb(i13));
        }
        this.zza.zzn(iZzd2);
        while (i11 < zzakrVar.size()) {
            this.zza.zzj(zzakrVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzi(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzajz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzg = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzg += zzajg.zzg(list.get(i12).intValue());
            }
            this.zza.zzn(iZzg);
            while (i11 < list.size()) {
                this.zza.zzk(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z10) {
            while (i11 < zzajzVar.size()) {
                this.zza.zzh(i10, zzajzVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzg2 = 0;
        for (int i13 = 0; i13 < zzajzVar.size(); i13++) {
            iZzg2 += zzajg.zzg(zzajzVar.zzb(i13));
        }
        this.zza.zzn(iZzg2);
        while (i11 < zzajzVar.size()) {
            this.zza.zzk(zzajzVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzj(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzakr)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZze = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZze += zzajg.zze(list.get(i12).longValue());
            }
            this.zza.zzn(iZze);
            while (i11 < list.size()) {
                this.zza.zzh(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z10) {
            while (i11 < zzakrVar.size()) {
                this.zza.zzf(i10, zzakrVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZze2 = 0;
        for (int i13 = 0; i13 < zzakrVar.size(); i13++) {
            iZze2 += zzajg.zze(zzakrVar.zzb(i13));
        }
        this.zza.zzn(iZze2);
        while (i11 < zzakrVar.size()) {
            this.zza.zzh(zzakrVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzk(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzajz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzh = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzh += zzajg.zzh(list.get(i12).intValue());
            }
            this.zza.zzn(iZzh);
            while (i11 < list.size()) {
                this.zza.zzm(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z10) {
            while (i11 < zzajzVar.size()) {
                this.zza.zzj(i10, zzajzVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzh2 = 0;
        for (int i13 = 0; i13 < zzajzVar.size(); i13++) {
            iZzh2 += zzajg.zzh(zzajzVar.zzb(i13));
        }
        this.zza.zzn(iZzh2);
        while (i11 < zzajzVar.size()) {
            this.zza.zzm(zzajzVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzl(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzakr)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzg(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzf = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzf += zzajg.zzf(list.get(i12).longValue());
            }
            this.zza.zzn(iZzf);
            while (i11 < list.size()) {
                this.zza.zzi(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z10) {
            while (i11 < zzakrVar.size()) {
                this.zza.zzg(i10, zzakrVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzf2 = 0;
        for (int i13 = 0; i13 < zzakrVar.size(); i13++) {
            iZzf2 += zzajg.zzf(zzakrVar.zzb(i13));
        }
        this.zza.zzn(iZzf2);
        while (i11 < zzakrVar.size()) {
            this.zza.zzi(zzakrVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzm(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzajz)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzl(i10, list.get(i11).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzj = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzj += zzajg.zzj(list.get(i12).intValue());
            }
            this.zza.zzn(iZzj);
            while (i11 < list.size()) {
                this.zza.zzn(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z10) {
            while (i11 < zzajzVar.size()) {
                this.zza.zzl(i10, zzajzVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzj2 = 0;
        for (int i13 = 0; i13 < zzajzVar.size(); i13++) {
            iZzj2 += zzajg.zzj(zzajzVar.zzb(i13));
        }
        this.zza.zzn(iZzj2);
        while (i11 < zzajzVar.size()) {
            this.zza.zzn(zzajzVar.zzb(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzn(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzakr)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, list.get(i11).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzk(i10, 2);
            int iZzg = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzg += zzajg.zzg(list.get(i12).longValue());
            }
            this.zza.zzn(iZzg);
            while (i11 < list.size()) {
                this.zza.zzj(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z10) {
            while (i11 < zzakrVar.size()) {
                this.zza.zzh(i10, zzakrVar.zzb(i11));
                i11++;
            }
            return;
        }
        this.zza.zzk(i10, 2);
        int iZzg2 = 0;
        for (int i13 = 0; i13 < zzakrVar.size(); i13++) {
            iZzg2 += zzajg.zzg(zzakrVar.zzb(i13));
        }
        this.zza.zzn(iZzg2);
        while (i11 < zzakrVar.size()) {
            this.zza.zzj(zzakrVar.zzb(i11));
            i11++;
        }
    }
}
