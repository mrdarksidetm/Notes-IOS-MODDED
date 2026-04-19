package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzadx {
    public static String zza() {
        Locale locale = Locale.getDefault();
        StringBuilder sb2 = new StringBuilder();
        zza(sb2, locale);
        Locale locale2 = Locale.US;
        if (!locale.equals(locale2)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            zza(sb2, locale2);
        }
        return sb2.toString();
    }

    private static void zza(StringBuilder sb2, Locale locale) {
        String language = locale.getLanguage();
        if (language != null) {
            sb2.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb2.append("-");
                sb2.append(country);
            }
        }
    }
}
