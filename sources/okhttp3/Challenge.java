package okhttp3;

import ae.r;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Challenge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f16695b;

    public Challenge(String str, Map<String, String> map) {
        String lowerCase;
        r.f(str, "scheme");
        r.f(map, "authParams");
        this.f16694a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                lowerCase = null;
            } else {
                Locale locale = Locale.US;
                r.e(locale, "US");
                lowerCase = key.toLowerCase(locale);
                r.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        r.e(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f16695b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = this.f16695b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                r.e(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        r.e(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return this.f16695b.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM);
    }

    public final String c() {
        return this.f16694a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (r.b(challenge.f16694a, this.f16694a) && r.b(challenge.f16695b, this.f16695b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f16694a.hashCode()) * 31) + this.f16695b.hashCode();
    }

    public String toString() {
        return this.f16694a + " authParams=" + this.f16695b;
    }
}
