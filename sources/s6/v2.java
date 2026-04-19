package s6;

import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v2 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<r2> f20355a;

    public v2(Set<r2> set) {
        this.f20355a = set;
    }

    @Override // s6.o0
    public void a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB;
        ae.r.f(jSONObject, f1.a("5D370066"));
        JSONArray jSONArray = new JSONArray();
        Set<r2> set = this.f20355a;
        if (set != null) {
            for (r2 r2Var : set) {
                if (r2Var != null && (jSONObjectB = r2Var.b()) != null) {
                    jSONArray.put(jSONObjectB);
                }
            }
        }
        jSONObject.put(f1.b(f1.c("5A25037FA8314A718517565536680F")), jSONArray);
    }
}
