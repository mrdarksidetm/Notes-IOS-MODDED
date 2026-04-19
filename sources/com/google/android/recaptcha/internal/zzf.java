package com.google.android.recaptcha.internal;

import le.a3;

/* JADX INFO: loaded from: classes2.dex */
public final class zzf {
    public static final zzbj zza(Exception exc, zzbj zzbjVar) {
        return exc instanceof a3 ? new zzbj(zzbh.zzb, zzbg.zzb, null) : exc instanceof zzbj ? (zzbj) exc : zzbjVar;
    }
}
