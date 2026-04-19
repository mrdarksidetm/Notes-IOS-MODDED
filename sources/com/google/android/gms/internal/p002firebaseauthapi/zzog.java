package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class zzog {
    public static final zzzc zza = zzzc.zza(new byte[0]);

    public static final zzzc zza(int i10) {
        return zzzc.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final zzzc zzb(int i10) {
        return zzzc.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
