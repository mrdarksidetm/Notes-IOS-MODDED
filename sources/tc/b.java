package tc;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f21362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f21363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21369h;

    public b(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        this.f21366e = i10;
        this.f21367f = i11;
        this.f21368g = i12;
        this.f21369h = i13;
        a(charSequence, "", -1, -1);
    }

    public b(CharSequence charSequence, int i10, int i11, CharSequence charSequence2, int i12, int i13, int i14, int i15) {
        this.f21366e = i12;
        this.f21367f = i13;
        this.f21368g = i14;
        this.f21369h = i15;
        a(charSequence, charSequence2.toString(), i10, i11);
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int i10, int i11) {
        this.f21362a = charSequence;
        this.f21363b = charSequence2;
        this.f21364c = i10;
        this.f21365d = i11;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f21362a.toString());
            jSONObject.put("deltaText", this.f21363b.toString());
            jSONObject.put("deltaStart", this.f21364c);
            jSONObject.put("deltaEnd", this.f21365d);
            jSONObject.put("selectionBase", this.f21366e);
            jSONObject.put("selectionExtent", this.f21367f);
            jSONObject.put("composingBase", this.f21368g);
            jSONObject.put("composingExtent", this.f21369h);
        } catch (JSONException e10) {
            cc.b.b("TextEditingDelta", "unable to create JSONObject: " + e10);
        }
        return jSONObject;
    }
}
