package com.google.android.recaptcha.internal;

import com.amazon.a.a.o.b.f;
import java.util.Collection;
import je.d;
import nd.c0;
import nd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzew implements zzfe {
    public static final zzew zza = new zzew();

    private zzew() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i10, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        String strH0;
        String str;
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzby(4, 5, null);
        }
        if (objZza instanceof int[]) {
            strH0 = p.o0((int[]) objZza, f.f7478a, "[", "]", 0, null, null, 56, null);
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, d.f14191b);
            } else if (objZza instanceof long[]) {
                strH0 = p.p0((long[]) objZza, f.f7478a, "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof short[]) {
                strH0 = p.r0((short[]) objZza, f.f7478a, "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof float[]) {
                strH0 = p.n0((float[]) objZza, f.f7478a, "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof double[]) {
                strH0 = p.m0((double[]) objZza, f.f7478a, "[", "]", 0, null, null, 56, null);
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strH0 = p.q0((Object[]) objZza, f.f7478a, "[", "]", 0, null, null, 56, null);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzby(4, 5, null);
                }
                strH0 = c0.h0((Iterable) objZza, f.f7478a, "[", "]", 0, null, null, 56, null);
            }
            strH0 = str;
        }
        zzekVar.zzc().zze(i10, strH0);
    }
}
