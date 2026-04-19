package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzlk {
    zzlk() {
    }

    public static final List zza(Object obj, long j10) {
        zzkz zzkzVar = (zzkz) zzni.zzf(obj, j10);
        if (zzkzVar.zzc()) {
            return zzkzVar;
        }
        int size = zzkzVar.size();
        zzkz zzkzVarZzd = zzkzVar.zzd(size == 0 ? 10 : size + size);
        zzni.zzs(obj, j10, zzkzVarZzd);
        return zzkzVarZzd;
    }
}
