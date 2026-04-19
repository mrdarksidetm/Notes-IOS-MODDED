package s6;

import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20241a = f1.a("5E371C7DAC31");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20242b = f1.b(f1.c("5E371C7DAC316E4D90114F5A30791524FA2C4B427903"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20243c = f1.b(f1.c("5E371C7DAC316645"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20244d = f1.b(f1.c("44211D61A82F"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20245e = f1.b(f1.c("44310D62AC205B"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20246f = f1.b(f1.c("44310D62AC205B60880058463F6C083BE907644E711521"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f20247g = f1.b(f1.c("44310D62AC205B6880"));

    public final String b(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (boolean z10 : zArr) {
            sb2.append(f1.a(z10 ? "06" : "07"));
        }
        return sb2.toString();
    }

    public final JSONArray c(Collection<List<?>> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection == null) {
            return jSONArray;
        }
        Iterator<List<?>> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toString());
        }
        return jSONArray;
    }

    public JSONObject d(X509Certificate x509Certificate) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f1.a("5E371C7DAC31"), x509Certificate.getIssuerDN().getName());
        jSONObject.put(f1.b(f1.c("5E371C7DAC316E4D90114F5A30791524FA2C4B427903")), e(x509Certificate));
        jSONObject.put(f1.b(f1.c("5E371C7DAC316645")), b(x509Certificate.getIssuerUniqueID()));
        jSONObject.put(f1.b(f1.c("44211D61A82F")), x509Certificate.getSerialNumber());
        jSONObject.put(f1.b(f1.c("44310D62AC205B")), x509Certificate.getSubjectDN().getName());
        jSONObject.put(f1.b(f1.c("44310D62AC205B60880058463F6C083BE907644E711521")), f(x509Certificate));
        jSONObject.put(f1.b(f1.c("44310D62AC205B6880")), b(x509Certificate.getSubjectUniqueID()));
        return jSONObject;
    }

    public final JSONArray e(X509Certificate x509Certificate) {
        try {
            return c(x509Certificate.getIssuerAlternativeNames());
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    public final JSONArray f(X509Certificate x509Certificate) {
        try {
            return c(x509Certificate.getSubjectAlternativeNames());
        } catch (Exception unused) {
            return new JSONArray();
        }
    }
}
