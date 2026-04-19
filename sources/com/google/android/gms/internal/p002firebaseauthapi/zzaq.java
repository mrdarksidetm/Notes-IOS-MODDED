package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzaq extends zzal {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzal zzc;

    zzaq(zzal zzalVar, int i10, int i11) {
        this.zzc = zzalVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzy.zza(i10, this.zzb);
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.List
    public final /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    /* JADX INFO: renamed from: zza */
    public final zzal subList(int i10, int i11) {
        zzy.zza(i10, i11, this.zzb);
        zzal zzalVar = this.zzc;
        int i12 = this.zza;
        return (zzal) zzalVar.subList(i10 + i12, i11 + i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final Object[] zzf() {
        return this.zzc.zzf();
    }
}
