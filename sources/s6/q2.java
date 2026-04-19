package s6;

import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20280a = f1.a("5837396DBB30464E8A");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20281b = f1.b(f1.c("5A25017DAF224C5591065846"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20282c = f1.b(f1.c("5A2B0B6DA5"));

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f1.a("5837396DBB30464E8A"), Build.VERSION.RELEASE);
        jSONObject.put(f1.b(f1.c("5A25017DAF224C5591065846")), Build.MANUFACTURER);
        jSONObject.put(f1.b(f1.c("5A2B0B6DA5")), Build.MODEL);
        return jSONObject;
    }
}
