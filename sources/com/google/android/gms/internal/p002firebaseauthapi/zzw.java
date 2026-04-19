package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class zzw implements zzu {
    private zzw() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzu
    public final zzn zza(String str) {
        return new zzp(Pattern.compile(str));
    }
}
