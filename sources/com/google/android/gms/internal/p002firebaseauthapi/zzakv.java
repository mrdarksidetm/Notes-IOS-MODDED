package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzakv implements zzald {
    private zzald[] zza;

    zzakv(zzald... zzaldVarArr) {
        this.zza = zzaldVarArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final zzala zza(Class<?> cls) {
        for (zzald zzaldVar : this.zza) {
            if (zzaldVar.zzb(cls)) {
                return zzaldVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final boolean zzb(Class<?> cls) {
        for (zzald zzaldVar : this.zza) {
            if (zzaldVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
