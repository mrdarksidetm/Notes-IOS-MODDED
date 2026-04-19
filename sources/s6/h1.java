package s6;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class h1 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20127b;

    public h1(String str, String str2) {
        this.f20126a = str;
        if (str2 == null) {
            this.f20127b = f1.a("59310364");
        } else {
            this.f20127b = str2;
        }
    }

    @Override // s6.o0
    public void a(JSONObject jSONObject) throws JSONException {
        jSONObject.put(this.f20126a, this.f20127b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Objects.equals(this.f20126a, h1Var.f20126a) && Objects.equals(this.f20127b, h1Var.f20127b);
    }

    public int hashCode() {
        return Objects.hash(this.f20126a, this.f20127b);
    }
}
