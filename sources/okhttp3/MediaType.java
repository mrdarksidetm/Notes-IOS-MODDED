package okhttp3;

import ae.j;
import ae.r;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.v;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaType {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f16856e = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f16857f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f16858g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f16862d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final MediaType a(String str) {
            r.f(str, "<this>");
            Matcher matcher = MediaType.f16857f.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            r.e(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            r.e(locale, "US");
            String lowerCase = strGroup.toLowerCase(locale);
            r.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            r.e(strGroup2, "typeSubtype.group(2)");
            r.e(locale, "US");
            String lowerCase2 = strGroup2.toLowerCase(locale);
            r.e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.f16858g.matcher(str);
            for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    r.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 != null) {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (v.G(strGroup4, "'", false, 2, null) && v.s(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        r.e(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new MediaType(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final MediaType b(String str) {
            r.f(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.f16859a = str;
        this.f16860b = str2;
        this.f16861c = str3;
        this.f16862d = strArr;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, j jVar) {
        this(str, str2, str3, strArr);
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && r.b(((MediaType) obj).f16859a, this.f16859a);
    }

    public int hashCode() {
        return this.f16859a.hashCode();
    }

    public String toString() {
        return this.f16859a;
    }
}
