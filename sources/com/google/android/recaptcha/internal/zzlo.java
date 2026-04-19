package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzlo implements zzlv {
    private final zzlv[] zza;

    zzlo(zzlv... zzlvVarArr) {
        this.zza = zzlvVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzlv
    public final zzlu zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzlv zzlvVar = this.zza[i10];
            if (zzlvVar.zzc(cls)) {
                return zzlvVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.recaptcha.internal.zzlv
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
