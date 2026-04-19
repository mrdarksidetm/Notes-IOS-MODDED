package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class zzp extends zzn implements Serializable {
    private final Pattern zza;

    zzp(Pattern pattern) {
        this.zza = (Pattern) zzy.zza(pattern);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzn
    public final zzo zza(CharSequence charSequence) {
        return new zzs(this.zza.matcher(charSequence));
    }
}
