package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
final class zzaj implements h {
    private final Status zza;

    public zzaj(Status status) {
        this.zza = status;
    }

    @Override // u8.h
    public final Status getStatus() {
        return this.zza;
    }
}
