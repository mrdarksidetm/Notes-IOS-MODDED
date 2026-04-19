package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzll {
    private static final zzlk zza;
    private static final zzlk zzb;

    static {
        zzlk zzlkVar;
        try {
            zzlkVar = (zzlk) Class.forName("com.google.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlkVar = null;
        }
        zza = zzlkVar;
        zzb = new zzlk();
    }

    static zzlk zza() {
        return zza;
    }

    static zzlk zzb() {
        return zzb;
    }
}
