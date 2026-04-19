package com.google.android.recaptcha.internal;

import ae.s;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdd extends s implements a {
    public static final zzdd zza = new zzdd();

    public zzdd() {
        super(0);
    }

    @Override // zd.a
    public final Object invoke() {
        int i10 = zzbb.zza;
        Object objZzb = zzba.zza().zzb(zzbf.class.getName().hashCode());
        if (objZzb != null) {
            return (zzbf) objZzb;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.abuse.recaptcha.common.Experiments");
    }
}
