package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import e9.a;
import e9.h;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzaen {
    private final String zza;
    private final String zzb;

    public zzaen(Context context) {
        this(context, context.getPackageName());
    }

    private zzaen(Context context, String str) {
        m.k(context);
        String strE = m.e(str);
        this.zza = strE;
        try {
            byte[] bArrA = a.a(context, strE);
            if (bArrA != null) {
                this.zzb = h.b(bArrA, false);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + str);
            this.zzb = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
