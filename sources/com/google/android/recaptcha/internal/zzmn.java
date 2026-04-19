package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzmn extends zzmu {
    zzmn(int i10) {
        super(i10, null);
    }

    @Override // com.google.android.recaptcha.internal.zzmu
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                ((zzkh) zzg(i10).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzkh) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
