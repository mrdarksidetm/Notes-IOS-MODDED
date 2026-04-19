package ba;

import android.net.Uri;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final zzap<String, Integer> f5584g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f5588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5590f;

    static {
        HashMap map = new HashMap();
        map.put("recoverEmail", 2);
        map.put("resetPassword", 0);
        map.put("signIn", 4);
        map.put("verifyEmail", 1);
        map.put("verifyBeforeChangeEmail", 5);
        map.put("revertSecondFactorAddition", 6);
        f5584g = zzap.zza(map);
    }

    private f(String str) {
        String strE = e(str, "apiKey");
        String strE2 = e(str, "oobCode");
        String strE3 = e(str, "mode");
        if (strE == null || strE2 == null || strE3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f5585a = w8.m.e(strE);
        this.f5586b = w8.m.e(strE2);
        this.f5587c = w8.m.e(strE3);
        this.f5588d = e(str, "continueUrl");
        this.f5589e = e(str, "languageCode");
        this.f5590f = e(str, "tenantId");
    }

    public static f c(String str) {
        w8.m.e(str);
        try {
            return new f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String e(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(w8.m.e(uri.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String a() {
        return this.f5586b;
    }

    public int b() {
        zzap<String, Integer> zzapVar = f5584g;
        if (zzapVar.containsKey(this.f5587c)) {
            return zzapVar.get(this.f5587c).intValue();
        }
        return 3;
    }

    public final String d() {
        return this.f5590f;
    }
}
