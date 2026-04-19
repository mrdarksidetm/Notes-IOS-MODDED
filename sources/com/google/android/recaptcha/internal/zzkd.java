package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkd {
    static final zzkd zza = new zzkd(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    zzkd() {
        this.zzd = new HashMap();
    }

    zzkd(boolean z10) {
        this.zzd = Collections.emptyMap();
    }

    public final zzkq zza(zzlx zzlxVar, int i10) {
        return (zzkq) this.zzd.get(new zzkc(zzlxVar, i10));
    }
}
