package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzrg implements zzrd {
    final List zza;

    public zzrg(Context context, zzrf zzrfVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzrfVar.zzc()) {
            arrayList.add(new zzrs(context, zzrfVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzrd
    public final void zza(zzrc zzrcVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzrd) it.next()).zza(zzrcVar);
        }
    }
}
