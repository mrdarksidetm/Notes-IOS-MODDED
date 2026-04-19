package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import nd.c0;
import nd.p;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgf {
    private List zza = u.m();

    public final long zza(long[] jArr) {
        Iterator it = c0.n0(this.zza, p.D0(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = p.D0(jArr);
    }
}
