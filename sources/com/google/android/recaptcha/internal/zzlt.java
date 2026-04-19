package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzlt {
    private static final zzls zza;
    private static final zzls zzb;

    static {
        zzls zzlsVar;
        try {
            zzlsVar = (zzls) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlsVar = null;
        }
        zza = zzlsVar;
        zzb = new zzls();
    }

    static zzls zza() {
        return zza;
    }

    static zzls zzb() {
        return zzb;
    }
}
