package s6;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20069a = f1.a("56341F41AD2641558D12545123");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20070b = f1.b(f1.c("54211D7C81225C49"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20071c = f1.b(f1.c("56281B6DBB2D4E558D025877347F081AFE11424A6F"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20072d = f1.b(f1.c("5E2A1C7CA82F4340901D525A02620920FC07"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20073e = f1.b(f1.c("56341F5EAC315C488B1A"));

    public JSONObject a(g0 g0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f1.a("56341F41AD2641558D12545123"), g0Var.e().e());
        String[] strArrA = g0Var.e().a();
        if (strArrA != null) {
            if (strArrA.length >= 1) {
                jSONObject.put(f1.b(f1.c("54211D7C81225C49")), strArrA[0]);
                if (strArrA.length > 1) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = 1; i10 < strArrA.length; i10++) {
                        jSONArray.put(strArrA[i10]);
                    }
                    jSONObject.put(f1.b(f1.c("56281B6DBB2D4E558D025877347F081AFE11424A6F")), jSONArray);
                }
            }
        }
        String strD = g0Var.e().d();
        if (strD == null) {
            strD = f1.b(f1.c(""));
        }
        jSONObject.put(f1.b(f1.c("56341F5EAC315C488B1A")), strD);
        String strG = g0Var.e().g();
        if (strG == null) {
            strG = f1.b(f1.c("56200D"));
        }
        jSONObject.put(f1.b(f1.c("5E2A1C7CA82F4340901D525A02620920FC07")), strG);
        return jSONObject;
    }
}
