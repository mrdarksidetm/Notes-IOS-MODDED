package com.google.android.recaptcha.internal;

import ae.s;
import ge.o;
import java.util.LinkedHashMap;
import java.util.Map;
import md.x;
import nd.q0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class zzaz extends s implements a {
    final /* synthetic */ zzbc[] zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaz(zzbc[] zzbcVarArr) {
        super(0);
        this.zza = zzbcVarArr;
    }

    @Override // zd.a
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Map invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(o.d(q0.b(3), 16));
        for (int i10 = 0; i10 < 3; i10++) {
            zzbc zzbcVar = this.zza[i10];
            md.s sVarA = x.a(Integer.valueOf(zzbcVar.zza()), zzbcVar.zzb());
            linkedHashMap.put(sVarA.c(), sVarA.d());
        }
        return linkedHashMap;
    }
}
