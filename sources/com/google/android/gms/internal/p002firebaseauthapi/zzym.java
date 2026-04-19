package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class zzym implements zzyl<KeyFactory> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyl
    public final /* synthetic */ KeyFactory zza(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
