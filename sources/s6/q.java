package s6;

import java.security.cert.X509Certificate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class q extends p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final X509Certificate f20261i;

    public q(String str, X509Certificate x509Certificate) {
        this.f20260h = str;
        this.f20261i = x509Certificate;
    }

    @Override // s6.o0
    public void a(JSONObject jSONObject) throws JSONException {
        X509Certificate x509Certificate = this.f20261i;
        if (x509Certificate != null) {
            jSONObject.put(this.f20260h, d(x509Certificate));
        }
    }

    @Override // s6.p
    public /* bridge */ /* synthetic */ JSONObject d(X509Certificate x509Certificate) {
        return super.d(x509Certificate);
    }
}
