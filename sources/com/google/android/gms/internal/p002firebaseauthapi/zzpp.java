package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzpp extends RuntimeException {
    public zzpp(String str) {
        super(str);
    }

    public zzpp(String str, Throwable th) {
        super(str, th);
    }

    private zzpp(Throwable th) {
        super(th);
    }

    public static <T> T zza(zzpo<T> zzpoVar) {
        try {
            return zzpoVar.zza();
        } catch (Exception e10) {
            throw new zzpp(e10);
        }
    }
}
