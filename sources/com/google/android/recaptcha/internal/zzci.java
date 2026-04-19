package com.google.android.recaptcha.internal;

import ae.s;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzci extends s implements a {
    public static final zzci zza = new zzci();

    public zzci() {
        super(0);
    }

    @Override // zd.a
    public final Object invoke() {
        int i10 = zzbb.zza;
        Object objZzb = zzba.zza().zzb(zzeb.class.getName().hashCode());
        if (objZzb != null) {
            return (zzeb) objZzb;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.abuse.recaptcha.vm.allowlist.AllowlistHandler");
    }
}
