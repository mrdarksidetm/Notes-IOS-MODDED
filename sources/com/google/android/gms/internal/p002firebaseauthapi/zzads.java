package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.List;
import w8.i;

/* JADX INFO: loaded from: classes.dex */
public final class zzads {
    private final int zza;

    private zzads(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> listZza = zzx.zza("[.-]").zza((CharSequence) str);
            if (listZza.size() == 1) {
                return Integer.parseInt(str);
            }
            if (listZza.size() >= 3) {
                return (Integer.parseInt(listZza.get(0)) * UtilsKt.MICROS_MULTIPLIER) + (Integer.parseInt(listZza.get(1)) * 1000) + Integer.parseInt(listZza.get(2));
            }
            return -1;
        } catch (IllegalArgumentException e10) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e10));
            return -1;
        }
    }

    public static zzads zza() throws Throwable {
        String strB = i.a().b("firebase-auth");
        if (TextUtils.isEmpty(strB) || strB.equals("UNKNOWN")) {
            strB = "-1";
        }
        return new zzads(strB);
    }

    public final String zzb() {
        return String.format("X%s", Integer.toString(this.zza));
    }
}
