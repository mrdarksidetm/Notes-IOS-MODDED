package com.google.android.gms.internal.mlkit_common;

import wa.h;

/* JADX INFO: loaded from: classes.dex */
final class zzsg extends zzst {
    private zznf zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private h zze;
    private zznl zzf;
    private int zzg;
    private byte zzh;

    zzsg() {
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzst zza(zznl zznlVar) {
        if (zznlVar == null) {
            throw new NullPointerException("Null downloadStatus");
        }
        this.zzf = zznlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzst zzb(zznf zznfVar) {
        if (zznfVar == null) {
            throw new NullPointerException("Null errorCode");
        }
        this.zza = zznfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzst zzc(int i10) {
        this.zzg = i10;
        this.zzh = (byte) (this.zzh | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzst zzd(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("Null modelType");
        }
        this.zze = hVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzst zze(boolean z10) {
        this.zzd = z10;
        this.zzh = (byte) (this.zzh | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzst zzf(boolean z10) {
        this.zzc = z10;
        this.zzh = (byte) (this.zzh | 1);
        return this;
    }

    public final zzst zzg(String str) {
        this.zzb = "NA";
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzst
    public final zzsu zzh() {
        zznf zznfVar;
        String str;
        h hVar;
        zznl zznlVar;
        if (this.zzh == 7 && (zznfVar = this.zza) != null && (str = this.zzb) != null && (hVar = this.zze) != null && (zznlVar = this.zzf) != null) {
            return new zzsi(zznfVar, str, this.zzc, this.zzd, hVar, zznlVar, this.zzg, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" errorCode");
        }
        if (this.zzb == null) {
            sb2.append(" tfliteSchemaVersion");
        }
        if ((this.zzh & 1) == 0) {
            sb2.append(" shouldLogRoughDownloadTime");
        }
        if ((this.zzh & 2) == 0) {
            sb2.append(" shouldLogExactDownloadTime");
        }
        if (this.zze == null) {
            sb2.append(" modelType");
        }
        if (this.zzf == null) {
            sb2.append(" downloadStatus");
        }
        if ((this.zzh & 4) == 0) {
            sb2.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
