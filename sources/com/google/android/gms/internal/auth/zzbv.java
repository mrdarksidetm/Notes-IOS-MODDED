package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import u8.h;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzbv implements h {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        this.zza = (Status) m.k(status);
        this.zzb = "";
    }

    public zzbv(String str) {
        this.zzb = (String) m.k(str);
        this.zza = Status.f8385f;
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // u8.h
    public final Status getStatus() {
        return this.zza;
    }
}
