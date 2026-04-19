package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzkg {
    private static final zzke zza = new zzkf();
    private static final zzke zzb;

    static {
        zzke zzkeVar;
        try {
            zzkeVar = (zzke) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzkeVar = null;
        }
        zzb = zzkeVar;
    }

    static zzke zza() {
        zzke zzkeVar = zzb;
        if (zzkeVar != null) {
            return zzkeVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzke zzb() {
        return zza;
    }
}
