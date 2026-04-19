package je;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {
    public static final String a(char c10) {
        String strValueOf = String.valueOf(c10);
        ae.r.d(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        ae.r.e(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        ae.r.d(upperCase, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = upperCase.substring(1);
        ae.r.e(strSubstring, "substring(...)");
        ae.r.d(strSubstring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strSubstring.toLowerCase(locale);
        ae.r.e(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }
}
