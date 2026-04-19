package com.google.android.gms.internal.mlkit_vision_document_scanner;

import ia.d;
import java.io.UnsupportedEncodingException;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzrn implements zzrc {
    private final zzmm zza;
    private zzqc zzb = new zzqc();

    private zzrn(zzmm zzmmVar, int i10) {
        this.zza = zzmmVar;
        zzrw.zza();
    }

    public static zzrc zze(zzmm zzmmVar) {
        return new zzrn(zzmmVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzrc
    public final zzrc zza(zzml zzmlVar) {
        this.zza.zzb(zzmlVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzrc
    public final zzrc zzb(zzqc zzqcVar) {
        this.zzb = zzqcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzrc
    public final String zzc() {
        String strZzk;
        zzqe zzqeVarZze = this.zza.zzg().zze();
        return (zzqeVarZze == null || (strZzk = zzqeVarZze.zzk()) == null || strZzk.isEmpty()) ? "NA" : (String) m.k(zzqeVarZze.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzrc
    public final byte[] zzd(int i10, boolean z10) {
        this.zzb.zzf(Boolean.valueOf(1 == (i10 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzf(this.zzb.zzm());
        try {
            zzrw.zza();
            if (i10 == 0) {
                return new d().i(zzkk.zza).j(true).h().b(this.zza.zzg()).getBytes("utf-8");
            }
            zzmo zzmoVarZzg = this.zza.zzg();
            zzaz zzazVar = new zzaz();
            zzkk.zza.configure(zzazVar);
            return zzazVar.zza().zza(zzmoVarZzg);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
