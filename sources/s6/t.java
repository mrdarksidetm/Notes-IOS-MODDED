package s6;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class t extends q1 {
    public static final String C = f1.a("5E2A0C61AD264155B6114D5B2379");
    public static final String D = f1.b(f1.c("433D1F6D"));
    public static final String E = f1.b(f1.c("5E2A0967"));
    public static final String F = f1.b(f1.c("51210E7CBC314A758107495D3F6A3535F10D584A78"));
    public final List<o0> A;
    public final List<o0> B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f20312z;

    public t(g0 g0Var, u6.f fVar, String str, List<o0> list, List<o0> list2, a0 a0Var, String str2, boolean z10) {
        super(g0Var, fVar, a0Var, str2, z10);
        this.f20312z = str;
        this.A = list;
        this.B = list2;
    }

    @Override // s6.q1, s6.b
    public JSONObject c() throws JSONException {
        List<o0> list;
        List<o0> list2;
        JSONObject jSONObjectC = super.c();
        if (this.f20312z == null || (((list = this.A) == null || list.isEmpty()) && ((list2 = this.B) == null || list2.isEmpty()))) {
            throw new JSONException(f1.a("75250B28A83148548911534071641272D5114541"));
        }
        jSONObjectC.put(f1.a("5E2A0C61AD264155B6114D5B2379"), d());
        return jSONObjectC;
    }

    public final JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        List<o0> list = this.A;
        if (list != null && !list.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (o0 o0Var : this.A) {
                if (o0Var != null) {
                    o0Var.a(jSONObject2);
                }
            }
            jSONObject.put(f1.a("5E2A0967"), jSONObject2);
        }
        List<o0> list2 = this.B;
        if (list2 != null && !list2.isEmpty()) {
            JSONObject jSONObject3 = new JSONObject();
            for (o0 o0Var2 : this.B) {
                if (o0Var2 != null) {
                    o0Var2.a(jSONObject3);
                }
            }
            jSONObject.put(f1.a("51210E7CBC314A758107495D3F6A3535F10D584A78"), jSONObject3);
        }
        jSONObject.put(f1.a("433D1F6D"), this.f20312z);
        return jSONObject;
    }
}
