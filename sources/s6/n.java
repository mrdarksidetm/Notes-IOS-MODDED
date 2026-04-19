package s6;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class n implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f20225a;

    public n(int[] iArr) {
        ae.r.f(iArr, f1.a("51210E7CBC314A758107495D3F6A353CFC0B4E4A720421"));
        this.f20225a = iArr;
    }

    @Override // s6.o0
    public void a(JSONObject jSONObject) throws JSONException {
        ae.r.f(jSONObject, f1.a("5D370066"));
        JSONArray jSONArray = new JSONArray();
        for (int i10 : this.f20225a) {
            jSONArray.put(i10);
        }
        jSONObject.put(f1.b(f1.c("5F251C4EAC225B54961169512279153CF8264B5B7D")), jSONArray);
    }
}
