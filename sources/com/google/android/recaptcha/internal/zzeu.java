package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.p;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeu implements zzfe {
    public static final zzeu zza = new zzeu();

    private zzeu() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(v.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzrr) it.next()).zzP()));
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (!zzb(p.E0(zzrrVarArr))) {
            throw new zzby(4, 5, null);
        }
        for (zzrr zzrrVar : zzrrVarArr) {
            zzekVar.zzc().zzb(zzrrVar.zzi());
        }
    }
}
