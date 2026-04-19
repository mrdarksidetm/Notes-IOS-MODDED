package com.google.android.recaptcha.internal;

import ae.r;
import java.lang.reflect.Method;
import java.util.List;
import nd.o;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeh extends zzee {
    private final zzeg zza;
    private final String zzb;

    public zzeh(zzeg zzegVar, String str, Object obj) {
        super(obj);
        this.zza = zzegVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzee
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List listM;
        if (!r.b(method.getName(), this.zzb)) {
            return false;
        }
        zzeg zzegVar = this.zza;
        if (objArr == null || (listM = o.c(objArr)) == null) {
            listM = u.m();
        }
        zzegVar.zzb(listM);
        return true;
    }
}
