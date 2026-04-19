package com.revenuecat.purchases.utils;

import ae.r;
import androidx.core.os.c;
import com.revenuecat.purchases.common.LogUtilsKt;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import je.v;
import nd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class LocaleExtensionsKt {
    public static final Locale convertToCorrectlyFormattedLocale(Locale locale) {
        r.f(locale, "<this>");
        String string = locale.toString();
        r.e(string, "toString()");
        return toLocale(string);
    }

    public static final List<Locale> getDefaultLocales() {
        c cVarD = c.d();
        r.e(cVarD, "getDefault()");
        return toList(cVarD);
    }

    private static final String inferScript(Locale locale) {
        String country;
        String script = locale.getScript();
        if (!(script == null || script.length() == 0)) {
            String script2 = locale.getScript();
            r.e(script2, "script");
            return script2;
        }
        if (!r.b(locale.getLanguage(), "zh") || (country = locale.getCountry()) == null) {
            return "";
        }
        int iHashCode = country.hashCode();
        if (iHashCode != 2155) {
            if (iHashCode != 2307) {
                if (iHashCode != 2466) {
                    if (iHashCode != 2644) {
                        if (iHashCode != 2691 || !country.equals("TW")) {
                            return "";
                        }
                    } else if (!country.equals("SG")) {
                        return "";
                    }
                } else if (!country.equals("MO")) {
                    return "";
                }
            } else if (!country.equals("HK")) {
                return "";
            }
            return "Hant";
        }
        if (!country.equals("CN")) {
            return "";
        }
        return "Hans";
    }

    public static final boolean sharedLanguageCodeWith(Locale locale, Locale locale2) {
        r.f(locale, "<this>");
        r.f(locale2, "locale");
        try {
            return r.b(locale.getISO3Language(), locale2.getISO3Language()) && r.b(inferScript(locale), inferScript(locale2));
        } catch (MissingResourceException e10) {
            LogUtilsKt.errorLog$default("Locale " + locale + " or " + locale2 + " can't obtain ISO3 language code (" + e10 + "). Falling back to language.", null, 2, null);
            return r.b(locale.getLanguage(), locale2.getLanguage());
        }
    }

    private static final List<Locale> toList(c cVar) {
        int iG = cVar.g();
        Locale[] localeArr = new Locale[iG];
        for (int i10 = 0; i10 < iG; i10++) {
            localeArr[i10] = cVar.c(i10);
        }
        return p.I(localeArr);
    }

    public static final Locale toLocale(String str) {
        r.f(str, "<this>");
        Locale localeForLanguageTag = Locale.forLanguageTag(v.C(str, "_", "-", false, 4, null));
        r.e(localeForLanguageTag, "forLanguageTag(replace(\"_\", \"-\"))");
        return localeForLanguageTag;
    }
}
