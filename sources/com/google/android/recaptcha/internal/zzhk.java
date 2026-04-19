package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhk implements zzho {
    zzhk() {
    }

    @Override // com.google.android.recaptcha.internal.zzho
    public final zzhn zza(CharSequence charSequence, Charset charset) {
        zzhp zzhpVarZzb = zzb();
        byte[] bytes = charSequence.toString().getBytes(charset);
        bytes.getClass();
        ((zzhj) zzhpVarZzb).zza(bytes, 0, bytes.length);
        return zzhpVarZzb.zzb();
    }
}
