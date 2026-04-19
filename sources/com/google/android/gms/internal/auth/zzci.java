package com.google.android.gms.internal.auth;

import android.net.Uri;
import z.c0;

/* JADX INFO: loaded from: classes.dex */
public final class zzci {
    private final c0 zza;

    zzci(c0 c0Var) {
        this.zza = c0Var;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        c0 c0Var;
        if (uri != null) {
            c0Var = (c0) this.zza.get(uri.toString());
        } else {
            c0Var = null;
        }
        if (c0Var == null) {
            return null;
        }
        return (String) c0Var.get("".concat(str3));
    }
}
