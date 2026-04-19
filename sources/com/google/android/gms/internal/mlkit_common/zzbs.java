package com.google.android.gms.internal.mlkit_common;

import ga.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbs {
    private final Map zza;
    private final Map zzb;
    private final d zzc;

    zzbs(Map map, Map map2, d dVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = dVar;
    }

    public final byte[] zza(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzbp(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
