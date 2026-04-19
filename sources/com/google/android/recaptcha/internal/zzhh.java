package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzhh extends zzhc {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    zzhh(Iterable iterable, int i10) {
        this.zza = iterable;
        this.zzb = i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i10 = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        zzgx.zzb(i10 >= 0, "numberToAdvance must be nonnegative");
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            it.next();
        }
        return new zzhg(this, it);
    }
}
