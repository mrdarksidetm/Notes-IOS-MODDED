package s6;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20331c = f1.a("44300E7CBC30");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20332d = f1.b(f1.c("432D026D8430"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f20333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f20334b;

    public enum a {
        f20335a,
        f20336b
    }

    public v(a aVar, Long l10) {
        this.f20333a = aVar;
        this.f20334b = l10;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f1.a("44300E7CBC30"), this.f20333a.toString());
        if (this.f20334b != null) {
            jSONObject.put(f1.b(f1.c("432D026D8430")), this.f20334b);
        }
        return jSONObject;
    }

    public void b(a aVar) {
        this.f20333a = aVar;
    }

    public void c(a aVar, long j10) {
        this.f20333a = aVar;
        this.f20334b = Long.valueOf(j10);
    }
}
