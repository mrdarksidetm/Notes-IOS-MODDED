package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
class zziu extends zzit {
    protected final byte[] zza;

    zziu(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziv) || zzd() != ((zziv) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zziu)) {
            return obj.equals(this);
        }
        zziu zziuVar = (zziu) obj;
        int iZzj = zzj();
        int iZzj2 = zziuVar.zzj();
        if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zziuVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zziuVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iZzd + ", " + zziuVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zziuVar.zza;
        zziuVar.zzc();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iZzd) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.recaptcha.internal.zziv
    byte zzb(int i10) {
        return this.zza[i10];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zziv
    protected void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }

    @Override // com.google.android.recaptcha.internal.zziv
    protected final int zzf(int i10, int i11, int i12) {
        return zzla.zzb(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public final zziv zzg(int i10, int i11) {
        int iZzi = zziv.zzi(0, i11, zzd());
        return iZzi == 0 ? zziv.zzb : new zziq(this.zza, 0, iZzi);
    }

    @Override // com.google.android.recaptcha.internal.zziv
    final void zzh(zzin zzinVar) {
        ((zzjd) zzinVar).zzc(this.zza, 0, zzd());
    }
}
