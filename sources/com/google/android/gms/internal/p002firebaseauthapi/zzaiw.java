package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
class zzaiw extends zzaix {
    protected final byte[] zzb;

    zzaiw(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaip) || zzb() != ((zzaip) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzaiw)) {
            return obj.equals(this);
        }
        zzaiw zzaiwVar = (zzaiw) obj;
        int iZza = zza();
        int iZza2 = zzaiwVar.zza();
        if (iZza == 0 || iZza2 == 0 || iZza == iZza2) {
            return zza(zzaiwVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final zzaip zza(int i10, int i11) {
        int iZza = zzaip.zza(0, i11, zzb());
        return iZza == 0 ? zzaip.zza : new zzait(this.zzb, zze(), iZza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    final void zza(zzaim zzaimVar) {
        zzaimVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    protected void zza(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
    final boolean zza(zzaip zzaipVar, int i10, int i11) {
        if (i11 > zzaipVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i11 + zzb());
        }
        if (i11 > zzaipVar.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i11 + ", " + zzaipVar.zzb());
        }
        if (!(zzaipVar instanceof zzaiw)) {
            return zzaipVar.zza(0, i11).equals(zza(0, i11));
        }
        zzaiw zzaiwVar = (zzaiw) zzaipVar;
        byte[] bArr = this.zzb;
        byte[] bArr2 = zzaiwVar.zzb;
        int iZze = zze() + i11;
        int iZze2 = zze();
        int iZze3 = zzaiwVar.zze();
        while (iZze2 < iZze) {
            if (bArr[iZze2] != bArr2[iZze3]) {
                return false;
            }
            iZze2++;
            iZze3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    byte zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    protected final int zzb(int i10, int i11, int i12) {
        return zzakb.zza(i10, this.zzb, zze(), i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final zzajb zzc() {
        return zzajb.zza(this.zzb, zze(), zzb(), true);
    }

    protected int zze() {
        return 0;
    }
}
