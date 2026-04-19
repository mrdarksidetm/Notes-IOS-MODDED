package s6;

import java.security.cert.X509Certificate;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<X509Certificate> f20067i;

    public f0(String str, List<X509Certificate> list) {
        this.f20066h = str;
        this.f20067i = list;
    }

    @Override // s6.o0
    public void a(JSONObject jSONObject) throws JSONException {
        if (this.f20067i != null) {
            JSONArray jSONArray = new JSONArray();
            for (X509Certificate x509Certificate : this.f20067i) {
                if (x509Certificate != null) {
                    jSONArray.put(d(x509Certificate));
                }
            }
            jSONObject.put(this.f20066h, jSONArray);
        }
    }

    @Override // s6.p
    public /* bridge */ /* synthetic */ JSONObject d(X509Certificate x509Certificate) {
        return super.d(x509Certificate);
    }
}
