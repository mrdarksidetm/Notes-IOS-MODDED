package sc;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f20502a = new f();

    private f() {
    }

    @Override // sc.k
    public ByteBuffer a(i iVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", iVar.f20503a);
            jSONObject.put("args", g.a(iVar.f20504b));
            return e.f20501a.a(jSONObject);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    @Override // sc.k
    public i b(ByteBuffer byteBuffer) {
        try {
            Object objB = e.f20501a.b(byteBuffer);
            if (objB instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objB;
                Object obj = jSONObject.get("method");
                Object objG = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new i((String) obj, objG);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + objB);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    @Override // sc.k
    public ByteBuffer c(Object obj) {
        return e.f20501a.a(new JSONArray().put(g.a(obj)));
    }

    @Override // sc.k
    public ByteBuffer d(String str, String str2, Object obj, String str3) {
        return e.f20501a.a(new JSONArray().put(str).put(g.a(str2)).put(g.a(obj)).put(g.a(str3)));
    }

    @Override // sc.k
    public ByteBuffer e(String str, String str2, Object obj) {
        return e.f20501a.a(new JSONArray().put(str).put(g.a(str2)).put(g.a(obj)));
    }

    @Override // sc.k
    public Object f(ByteBuffer byteBuffer) {
        try {
            Object objB = e.f20501a.b(byteBuffer);
            if (objB instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objB;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object objG = g(jSONArray.opt(1));
                    Object objG2 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (objG == null || (objG instanceof String))) {
                        throw new d((String) obj, (String) objG, objG2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + objB);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
