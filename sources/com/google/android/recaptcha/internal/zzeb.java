package com.google.android.recaptcha.internal;

import ae.r;
import com.amazon.a.a.o.c.a.b;
import java.util.Iterator;
import java.util.Set;
import je.w;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeb {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        Iterator it = w.B0(str, new char[]{b.f7490a}, false, 0, 6, null).iterator();
        String strConcat = "";
        while (it.hasNext()) {
            String strConcat2 = strConcat.concat(String.valueOf((String) it.next()));
            if (set.contains(strConcat2)) {
                return true;
            }
            strConcat = strConcat2.concat(".");
        }
        return false;
    }

    public final void zza(zzpj zzpjVar) {
        this.zza = c0.H0(zzpjVar.zzf().zzi());
        this.zzb = c0.H0(zzpjVar.zzg().zzi());
    }

    public final boolean zzb(String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        }
        r.d(set, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = this.zzb;
        r.d(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}
