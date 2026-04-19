package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzajk {
    static final zzajk zza = new zzajk(true);
    private static volatile boolean zzb = false;
    private final Map<zzajn, zzajy.zzd<?, ?>> zzc;

    zzajk() {
        this.zzc = new HashMap();
    }

    private zzajk(boolean z10) {
        this.zzc = Collections.emptyMap();
    }

    public static zzajk zza() {
        return zza;
    }

    public final <ContainingType extends zzalc> zzajy.zzd<ContainingType, ?> zza(ContainingType containingtype, int i10) {
        return (zzajy.zzd) this.zzc.get(new zzajn(containingtype, i10));
    }
}
