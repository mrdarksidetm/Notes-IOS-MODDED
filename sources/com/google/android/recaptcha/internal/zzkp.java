package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzkp implements zzkh {
    final int zza;
    final zznm zzb;

    zzkp(zzkv zzkvVar, int i10, zznm zznmVar, boolean z10, boolean z11) {
        this.zza = i10;
        this.zzb = zznmVar;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzkp) obj).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final zzlw zzb(zzlw zzlwVar, zzlx zzlxVar) {
        ((zzkm) zzlwVar).zzg((zzks) zzlxVar);
        return zzlwVar;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final zzmc zzc(zzmc zzmcVar, zzmc zzmcVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final zznm zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final zznn zze() {
        return this.zzb.zza();
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final boolean zzg() {
        return false;
    }
}
