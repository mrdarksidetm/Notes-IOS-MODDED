package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzkg implements zzpd<zzbo, zzbo> {
    private static final zzkg zza = new zzkg();
    private static final zzor<zznc, zzbo> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkj
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzlt.zza((zznc) zzbpVar);
        }
    }, zznc.class, zzbo.class);

    zzkg() {
    }

    public static void zzc() {
        zzoc.zza().zza(zza);
        zzoc.zza().zza(zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final Class<zzbo> zza() {
        return zzbo.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final /* synthetic */ zzbo zza(zzoz<zzbo> zzozVar) {
        return new zzki(zzozVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final Class<zzbo> zzb() {
        return zzbo.class;
    }
}
