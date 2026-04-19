package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import t8.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzadn {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int iH = h.f().h(context, 12451000);
            zza = Boolean.valueOf(iH == 0 || iH == 2);
        }
        return zza.booleanValue();
    }
}
