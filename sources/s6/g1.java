package s6;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class g1 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f20083b;

    public g1(String str, JSONObject jSONObject) {
        this.f20082a = str;
        if (jSONObject == null) {
            this.f20083b = new JSONObject();
        } else {
            this.f20083b = jSONObject;
        }
    }

    @Override // s6.o0
    public void a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.f20082a, this.f20083b);
    }
}
