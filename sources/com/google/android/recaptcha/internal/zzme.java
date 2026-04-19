package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzme {
    private static final zzmd zza;
    private static final zzmd zzb;

    static {
        zzmd zzmdVar;
        try {
            zzmdVar = (zzmd) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzmdVar = null;
        }
        zza = zzmdVar;
        zzb = new zzmd();
    }

    static zzmd zza() {
        return zza;
    }

    static zzmd zzb() {
        return zzb;
    }
}
