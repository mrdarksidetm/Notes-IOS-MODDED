package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import k8.a;
import k8.b;
import u8.d;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzal implements b {
    private static final Status zza = new Status(13);

    public final d<Object> addWorkAccount(e eVar, String str) {
        return eVar.b(new zzae(this, a.f14444a, eVar, str));
    }

    public final d<h> removeWorkAccount(e eVar, Account account) {
        return eVar.b(new zzag(this, a.f14444a, eVar, account));
    }

    public final void setWorkAuthenticatorEnabled(e eVar, boolean z10) {
        setWorkAuthenticatorEnabledWithResult(eVar, z10);
    }

    public final d<h> setWorkAuthenticatorEnabledWithResult(e eVar, boolean z10) {
        return eVar.b(new zzac(this, a.f14444a, eVar, z10));
    }
}
