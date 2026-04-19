package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzjh implements zzno {
    private final zzjg zza;

    private zzjh(zzjg zzjgVar) {
        byte[] bArr = zzla.zzb;
        this.zza = zzjgVar;
        zzjgVar.zza = this;
    }

    public static zzjh zza(zzjg zzjgVar) {
        zzjh zzjhVar = zzjgVar.zza;
        return zzjhVar != null ? zzjhVar : new zzjh(zzjgVar);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzA(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzlm)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z10) {
            while (i11 < zzlmVar.size()) {
                this.zza.zzh(i10, zzlmVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzlmVar.size(); i15++) {
            zzlmVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzq(i14);
        while (i11 < zzlmVar.size()) {
            this.zza.zzi(zzlmVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzB(int i10, int i11) {
        this.zza.zzp(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzC(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkt)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzjg zzjgVar = this.zza;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    zzjgVar.zzp(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int iZzx = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iZzx += zzjg.zzx((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzq(iZzx);
            while (i11 < list.size()) {
                zzjg zzjgVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                zzjgVar2.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z10) {
            while (i11 < zzktVar.size()) {
                zzjg zzjgVar3 = this.zza;
                int iZze = zzktVar.zze(i11);
                zzjgVar3.zzp(i10, (iZze >> 31) ^ (iZze + iZze));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzx2 = 0;
        for (int i13 = 0; i13 < zzktVar.size(); i13++) {
            int iZze2 = zzktVar.zze(i13);
            iZzx2 += zzjg.zzx((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        this.zza.zzq(iZzx2);
        while (i11 < zzktVar.size()) {
            zzjg zzjgVar4 = this.zza;
            int iZze3 = zzktVar.zze(i11);
            zzjgVar4.zzq((iZze3 >> 31) ^ (iZze3 + iZze3));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzD(int i10, long j10) {
        this.zza.zzr(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzE(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzlm)) {
            if (!z10) {
                while (i11 < list.size()) {
                    zzjg zzjgVar = this.zza;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    zzjgVar.zzr(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int iZzy = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iZzy += zzjg.zzy((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzq(iZzy);
            while (i11 < list.size()) {
                zzjg zzjgVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                zzjgVar2.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z10) {
            while (i11 < zzlmVar.size()) {
                zzjg zzjgVar3 = this.zza;
                long jZze = zzlmVar.zze(i11);
                zzjgVar3.zzr(i10, (jZze >> 63) ^ (jZze + jZze));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzy2 = 0;
        for (int i13 = 0; i13 < zzlmVar.size(); i13++) {
            long jZze2 = zzlmVar.zze(i13);
            iZzy2 += zzjg.zzy((jZze2 >> 63) ^ (jZze2 + jZze2));
        }
        this.zza.zzq(iZzy2);
        while (i11 < zzlmVar.size()) {
            zzjg zzjgVar4 = this.zza;
            long jZze3 = zzlmVar.zze(i11);
            zzjgVar4.zzs((jZze3 >> 63) ^ (jZze3 + jZze3));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    @Deprecated
    public final void zzF(int i10) {
        this.zza.zzo(i10, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzG(int i10, String str) {
        this.zza.zzm(i10, str);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzH(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof zzlj)) {
            while (i11 < list.size()) {
                this.zza.zzm(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        zzlj zzljVar = (zzlj) list;
        while (i11 < list.size()) {
            Object objZzc = zzljVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzm(i10, (String) objZzc);
            } else {
                this.zza.zze(i10, (zziv) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzI(int i10, int i11) {
        this.zza.zzp(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzJ(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkt)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzp(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int iZzx = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzx += zzjg.zzx(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzq(iZzx);
            while (i11 < list.size()) {
                this.zza.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z10) {
            while (i11 < zzktVar.size()) {
                this.zza.zzp(i10, zzktVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzx2 = 0;
        for (int i13 = 0; i13 < zzktVar.size(); i13++) {
            iZzx2 += zzjg.zzx(zzktVar.zze(i13));
        }
        this.zza.zzq(iZzx2);
        while (i11 < zzktVar.size()) {
            this.zza.zzq(zzktVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzK(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzL(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzlm)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int iZzy = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzy += zzjg.zzy(((Long) list.get(i12)).longValue());
            }
            this.zza.zzq(iZzy);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z10) {
            while (i11 < zzlmVar.size()) {
                this.zza.zzr(i10, zzlmVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzy2 = 0;
        for (int i13 = 0; i13 < zzlmVar.size(); i13++) {
            iZzy2 += zzjg.zzy(zzlmVar.zze(i13));
        }
        this.zza.zzq(iZzy2);
        while (i11 < zzlmVar.size()) {
            this.zza.zzs(zzlmVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzb(int i10, boolean z10) {
        this.zza.zzd(i10, z10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzc(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzim)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        zzim zzimVar = (zzim) list;
        if (!z10) {
            while (i11 < zzimVar.size()) {
                this.zza.zzd(i10, zzimVar.zzf(i11));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzimVar.size(); i15++) {
            zzimVar.zzf(i15);
            i14++;
        }
        this.zza.zzq(i14);
        while (i11 < zzimVar.size()) {
            this.zza.zzb(zzimVar.zzf(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzd(int i10, zziv zzivVar) {
        this.zza.zze(i10, zzivVar);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zziv) list.get(i11));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzf(int i10, double d10) {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzg(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzjx)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        zzjx zzjxVar = (zzjx) list;
        if (!z10) {
            while (i11 < zzjxVar.size()) {
                this.zza.zzh(i10, Double.doubleToRawLongBits(zzjxVar.zze(i11)));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzjxVar.size(); i15++) {
            zzjxVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzq(i14);
        while (i11 < zzjxVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzjxVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    @Deprecated
    public final void zzh(int i10) {
        this.zza.zzo(i10, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzi(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzj(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkt)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int iZzy = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzy += zzjg.zzy(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzq(iZzy);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z10) {
            while (i11 < zzktVar.size()) {
                this.zza.zzj(i10, zzktVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzy2 = 0;
        for (int i13 = 0; i13 < zzktVar.size(); i13++) {
            iZzy2 += zzjg.zzy(zzktVar.zze(i13));
        }
        this.zza.zzq(iZzy2);
        while (i11 < zzktVar.size()) {
            this.zza.zzk(zzktVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzk(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzl(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkt)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z10) {
            while (i11 < zzktVar.size()) {
                this.zza.zzf(i10, zzktVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzktVar.size(); i15++) {
            zzktVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzq(i14);
        while (i11 < zzktVar.size()) {
            this.zza.zzg(zzktVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzm(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzn(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzlm)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z10) {
            while (i11 < zzlmVar.size()) {
                this.zza.zzh(i10, zzlmVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzlmVar.size(); i15++) {
            zzlmVar.zze(i15);
            i14 += 8;
        }
        this.zza.zzq(i14);
        while (i11 < zzlmVar.size()) {
            this.zza.zzi(zzlmVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzo(int i10, float f10) {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzp(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkk)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        zzkk zzkkVar = (zzkk) list;
        if (!z10) {
            while (i11 < zzkkVar.size()) {
                this.zza.zzf(i10, Float.floatToRawIntBits(zzkkVar.zze(i11)));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzkkVar.size(); i15++) {
            zzkkVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzq(i14);
        while (i11 < zzkkVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzkkVar.zze(i11)));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzq(int i10, Object obj, zzmk zzmkVar) {
        zzjg zzjgVar = this.zza;
        zzjgVar.zzo(i10, 3);
        zzmkVar.zzj((zzlx) obj, zzjgVar.zza);
        zzjgVar.zzo(i10, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzr(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzs(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkt)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int iZzy = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzy += zzjg.zzy(((Integer) list.get(i12)).intValue());
            }
            this.zza.zzq(iZzy);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z10) {
            while (i11 < zzktVar.size()) {
                this.zza.zzj(i10, zzktVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzy2 = 0;
        for (int i13 = 0; i13 < zzktVar.size(); i13++) {
            iZzy2 += zzjg.zzy(zzktVar.zze(i13));
        }
        this.zza.zzq(iZzy2);
        while (i11 < zzktVar.size()) {
            this.zza.zzk(zzktVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzt(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzu(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzlm)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int iZzy = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iZzy += zzjg.zzy(((Long) list.get(i12)).longValue());
            }
            this.zza.zzq(iZzy);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z10) {
            while (i11 < zzlmVar.size()) {
                this.zza.zzr(i10, zzlmVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int iZzy2 = 0;
        for (int i13 = 0; i13 < zzlmVar.size(); i13++) {
            iZzy2 += zzjg.zzy(zzlmVar.zze(i13));
        }
        this.zza.zzq(iZzy2);
        while (i11 < zzlmVar.size()) {
            this.zza.zzs(zzlmVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzv(int i10, Object obj, zzmk zzmkVar) throws zzje {
        zzlx zzlxVar = (zzlx) obj;
        zzjd zzjdVar = (zzjd) this.zza;
        zzjdVar.zzq((i10 << 3) | 2);
        zzjdVar.zzq(((zzig) zzlxVar).zza(zzmkVar));
        zzmkVar.zzj(zzlxVar, zzjdVar.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzw(int i10, Object obj) throws zzje {
        if (obj instanceof zziv) {
            zzjd zzjdVar = (zzjd) this.zza;
            zzjdVar.zzq(11);
            zzjdVar.zzp(2, i10);
            zzjdVar.zze(3, (zziv) obj);
            zzjdVar.zzq(12);
            return;
        }
        zzjg zzjgVar = this.zza;
        zzlx zzlxVar = (zzlx) obj;
        zzjd zzjdVar2 = (zzjd) zzjgVar;
        zzjdVar2.zzq(11);
        zzjdVar2.zzp(2, i10);
        zzjdVar2.zzq(26);
        zzjdVar2.zzq(zzlxVar.zzn());
        zzlxVar.zze(zzjgVar);
        zzjdVar2.zzq(12);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzx(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzy(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!(list instanceof zzkt)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z10) {
            while (i11 < zzktVar.size()) {
                this.zza.zzf(i10, zzktVar.zze(i11));
                i11++;
            }
            return;
        }
        this.zza.zzo(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < zzktVar.size(); i15++) {
            zzktVar.zze(i15);
            i14 += 4;
        }
        this.zza.zzq(i14);
        while (i11 < zzktVar.size()) {
            this.zza.zzg(zzktVar.zze(i11));
            i11++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzz(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }
}
