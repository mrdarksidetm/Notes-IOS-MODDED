package ca;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.revenuecat.purchases.common.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f6662a;

    static {
        HashMap map = new HashMap();
        f6662a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(Intent intent) {
        w8.m.k(intent);
        w8.m.a(d(intent));
        return (Status) x8.e.b(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    public static Status b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map<String, String> map = f6662a;
                if (map.containsKey(string)) {
                    return t.a(map.get(string) + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + string2);
                }
            }
            return t.a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e10) {
            return t.a("WEB_INTERNAL_ERROR:" + str + "[ " + e10.getLocalizedMessage() + " ]");
        }
    }

    public static void c(Intent intent, Status status) {
        x8.e.e(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean d(Intent intent) {
        w8.m.k(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}
