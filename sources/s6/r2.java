package s6;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<o0> f20289a = new LinkedHashSet();

    public final void a(o0 o0Var) {
        ae.r.f(o0Var, f1.a("5E2A0C61AD264155"));
        this.f20289a.add(o0Var);
    }

    public final JSONObject b() {
        if (this.f20289a.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<T> it = this.f20289a.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).a(jSONObject);
        }
        return jSONObject;
    }
}
