package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzkl implements zzlv {
    private static final zzkl zza = new zzkl();

    private zzkl() {
    }

    public static zzkl zza() {
        return zza;
    }

    @Override // com.google.android.recaptcha.internal.zzlv
    public final zzlu zzb(Class cls) {
        if (!zzks.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzlu) zzks.zzs(cls.asSubclass(zzks.class)).zzh(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzlv
    public final boolean zzc(Class cls) {
        return zzks.class.isAssignableFrom(cls);
    }
}
