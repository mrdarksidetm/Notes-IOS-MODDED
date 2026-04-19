package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;
import e3.i;

/* JADX INFO: loaded from: classes.dex */
final class zzg extends zzq {
    zzg() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzq
    protected final int zza(Context context, zzp zzpVar, boolean z10) {
        return (zzpVar.zza.getAuthority().lastIndexOf(64) < 0 || i.b(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
