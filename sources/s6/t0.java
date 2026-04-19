package s6;

import org.json.JSONException;
import org.json.JSONObject;
import u6.f;

/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20313a = f1.a("55210E7C8C3B4A429100545B3F5E0833EB07");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20314b = f1.b(f1.c("542B017CBB2C43649C115E412564133CCC164B5B79"));

    public JSONObject a(u6.f fVar) throws JSONException {
        f.b bVarB;
        JSONObject jSONObject = new JSONObject();
        if (fVar != null && (bVarB = fVar.b()) != null) {
            jSONObject.put(f1.a("55210E7C8C3B4A429100545B3F5E0833EB07"), bVarB.a());
            jSONObject.put(f1.b(f1.c("542B017CBB2C43649C115E412564133CCC164B5B79")), bVarB.b());
        }
        return jSONObject;
    }
}
