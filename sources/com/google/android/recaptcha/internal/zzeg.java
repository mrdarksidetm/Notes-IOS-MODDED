package com.google.android.recaptcha.internal;

import java.util.List;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeg {
    private final zzhb zza;

    public zzeg() {
        this(1);
    }

    public zzeg(int i10) {
        this.zza = zzhb.zza(i10);
    }

    public final List zwk() {
        return zza();
    }

    public final List zza() {
        return c0.C0(this.zza);
    }

    public final boolean zzb(List list) {
        this.zza.add(list);
        return true;
    }
}
