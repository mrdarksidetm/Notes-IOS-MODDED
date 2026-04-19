package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
final class zzs extends zzo {
    private final Matcher zza;

    zzs(Matcher matcher) {
        this.zza = (Matcher) zzy.zza(matcher);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzo
    public final int zza() {
        return this.zza.end();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzo
    public final boolean zza(int i10) {
        return this.zza.find(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzo
    public final int zzb() {
        return this.zza.start();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzo
    public final boolean zzc() {
        return this.zza.matches();
    }
}
