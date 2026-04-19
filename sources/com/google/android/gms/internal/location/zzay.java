package com.google.android.gms.internal.location;

import n9.m;
import v8.c;

/* JADX INFO: loaded from: classes.dex */
final class zzay extends zzan {
    private c<m> zza;

    public zzay(c<m> cVar) {
        w8.m.b(cVar != null, "listener can't be null.");
        this.zza = cVar;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(m mVar) {
        this.zza.setResult(mVar);
        this.zza = null;
    }
}
