package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.e;
import p8.a;
import p8.b;
import u8.d;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzbt implements a {
    public final d<Object> getSpatulaHeader(e eVar) {
        m.k(eVar);
        return eVar.b(new zzbs(this, eVar));
    }

    public final d<Object> performProxyRequest(e eVar, b bVar) {
        m.k(eVar);
        m.k(bVar);
        return eVar.b(new zzbq(this, eVar, bVar));
    }
}
