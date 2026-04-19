package s6;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import s6.v;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, v> f19989a = new HashMap(10);

    public synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry<String, v> entry : this.f19989a.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue().a());
        }
        return jSONObject;
    }

    public synchronized void b(String str, v.a aVar, Long l10) {
        v vVar = this.f19989a.get(str);
        if (vVar != null) {
            c(vVar, aVar, l10);
        } else {
            this.f19989a.put(str, new v(aVar, l10));
        }
    }

    public final void c(v vVar, v.a aVar, Long l10) {
        if (l10 != null) {
            vVar.c(aVar, l10.longValue());
        } else {
            vVar.b(aVar);
        }
    }
}
