package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
final class zzph extends ThreadLocal<SecureRandom> {
    zzph() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SecureRandom initialValue() {
        return zzpe.zza();
    }
}
