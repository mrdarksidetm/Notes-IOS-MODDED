package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzac extends zzad {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzad zzc;

    zzac(zzad zzadVar, int i10, int i11) {
        this.zzc = zzadVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzt.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzad, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzz
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzz
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzz
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzad
    /* JADX INFO: renamed from: zzf */
    public final zzad subList(int i10, int i11) {
        zzt.zze(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }
}
