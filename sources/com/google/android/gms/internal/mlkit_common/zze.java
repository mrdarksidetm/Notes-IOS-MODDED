package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import e3.i;

/* JADX INFO: loaded from: classes.dex */
final class zze extends zzs {
    zze() {
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzs
    protected final int zza(Context context, zzr zzrVar, boolean z10) {
        return (zzrVar.zza.getAuthority().lastIndexOf(64) < 0 || i.b(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
