package com.google.android.gms.internal.p002firebaseauthapi;

import com.amazon.a.a.o.c.a.b;
import e9.c;
import java.io.UnsupportedEncodingException;
import java.util.List;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzagn {
    public static long zza(String str) {
        zzagq zzagqVarZzb = zzb(str);
        return zzagqVarZzb.zza().longValue() - zzagqVarZzb.zzb().longValue();
    }

    private static zzagq zzb(String str) {
        m.e(str);
        List<String> listZza = zzx.zza(b.f7490a).zza((CharSequence) str);
        if (listZza.size() >= 2) {
            try {
                return zzagq.zza(new String(c.b(listZza.get(1)), "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("Unable to decode token", e10);
            }
        }
        throw new RuntimeException("Invalid idToken " + str);
    }
}
