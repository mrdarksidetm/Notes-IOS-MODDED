package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.Map;
import md.x;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgw {
    public static final Map zza() {
        Map mapJ = r0.j(x.a(-4, zzbg.zzo), x.a(-12, zzbg.zzp), x.a(-6, zzbg.zzk), x.a(-11, zzbg.zzm), x.a(-13, zzbg.zzq), x.a(-14, zzbg.zzr), x.a(-2, zzbg.zzl), x.a(-7, zzbg.zzs), x.a(-5, zzbg.zzt), x.a(-9, zzbg.zzu), x.a(-8, zzbg.zzE), x.a(-15, zzbg.zzn), x.a(-1, zzbg.zzv), x.a(-3, zzbg.zzx), x.a(-10, zzbg.zzy));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            mapJ.put(-16, zzbg.zzw);
        }
        if (i10 >= 27) {
            mapJ.put(1, zzbg.zzA);
            mapJ.put(2, zzbg.zzB);
            mapJ.put(0, zzbg.zzC);
            mapJ.put(3, zzbg.zzD);
        }
        if (i10 >= 29) {
            mapJ.put(4, zzbg.zzz);
        }
        return mapJ;
    }
}
