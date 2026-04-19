package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzsn implements zzsk {
    final List zza;

    public zzsn(Context context, zzsm zzsmVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzsmVar.zzc()) {
            arrayList.add(new zzta(context, zzsmVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsk
    public final void zza(zzsj zzsjVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzsk) it.next()).zza(zzsjVar);
        }
    }
}
