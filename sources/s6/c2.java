package s6;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20022d = f1.a("562A0B7AA62A4B6880");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20023e = f1.b(f1.c("5A210B61A8075D4C"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20024f = f1.b(f1.c("512D016FAC315F538D1A496262"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20027c;

    public c2(f2 f2Var) {
        this.f20025a = f2Var.a();
        this.f20026b = f2Var.b();
        this.f20027c = f2Var.c();
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.f20025a != null) {
            jSONObject.put(f1.a("562A0B7AA62A4B6880"), this.f20025a);
        }
        if (this.f20026b != null) {
            jSONObject.put(f1.a("5A210B61A8075D4C"), this.f20026b);
        }
        if (this.f20027c != null) {
            jSONObject.put(f1.a("512D016FAC315F538D1A496262"), this.f20027c);
        }
        return jSONObject;
    }
}
