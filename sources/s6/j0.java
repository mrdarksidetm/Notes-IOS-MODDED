package s6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class j0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f20156b;

    public j0(String str, List<String> list) {
        this.f20155a = str;
        if (list == null) {
            this.f20156b = new ArrayList();
        } else {
            this.f20156b = list;
        }
    }

    @Override // s6.o0
    public void a(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f20156b.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put(this.f20155a, jSONArray);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Objects.equals(this.f20155a, j0Var.f20155a) && Objects.equals(this.f20156b, j0Var.f20156b);
    }

    public int hashCode() {
        return Objects.hash(this.f20155a, this.f20156b);
    }
}
