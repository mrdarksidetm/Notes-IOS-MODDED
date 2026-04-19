package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import p8.c;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
final class zzbu implements h {
    private final Status zza;
    private c zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public zzbu(c cVar) {
        this.zzb = cVar;
        this.zza = Status.f8385f;
    }

    public final c getResponse() {
        return this.zzb;
    }

    @Override // u8.h
    public final Status getStatus() {
        return this.zza;
    }
}
