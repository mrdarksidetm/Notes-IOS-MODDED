package s6;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20402a = f1.a("44210C7DBB2A5B58");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20403b = f1.b(f1.c("552D0065AC375D488707"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20404c = f1.b(f1.c("5F332D69AA284A45AF114457396C153C"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20405d = f1.b(f1.c("5E372E6CAB06414086185850"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20406e = f1.b(f1.c("5F251C4FA62C484D8139525638611901FA105C467F1521"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20407f = f1.b(f1.c("5F251C40BC2258448D39525638611901FA105C467F1521"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f20408g = f1.b(f1.c("44210C7DBB2A5B58B415495739"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f20409h = f1.b(f1.c("55310664AD104A4D8D1A484C017F1322FA105E56"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f20410i = f1.b(f1.c("552B007C9A2643488A01456423620C37ED1653"));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f20411j = f1.b(f1.c("44210361A736576C8B1058"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f20412k = f1.b(f1.c("44210361A73657648A12524632681137F1166C46701511675EAD7E747C"));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f20413l = f1.b(f1.c("44210361A73657648A155F5834692E37F90E4F4C68"));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f20414m = f1.b(f1.c("44210361A73657648A12524632681800FA04464A7F04"));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f20415n = f1.b(f1.c("44210361A7365771961B4D5123791537EC"));

    public JSONObject a(g3 g3Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f1.a("44210C7DBB2A5B58"), g3Var.p());
        String strD = g3Var.d();
        if (strD != null) {
            jSONObject.put(f1.b(f1.c("552D0065AC375D488707")), strD);
        }
        jSONObject.put(f1.b(f1.c("5F332D69AA284A45AF114457396C153C")), g3Var.o());
        jSONObject.put(f1.b(f1.c("5E372E6CAB06414086185850")), g3Var.b());
        jSONObject.put(f1.b(f1.c("5F251C4FA62C484D8139525638611901FA105C467F1521")), g3Var.m());
        jSONObject.put(f1.b(f1.c("5F251C40BC2258448D39525638611901FA105C467F1521")), g3Var.n());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f1.b(f1.c("55310664AD104A4D8D1A484C017F1322FA105E56")), g3Var.k());
        jSONObject2.put(f1.b(f1.c("44210361A736576C8B1058")), g3Var.w());
        jSONObject2.put(f1.b(f1.c("552B007C9A2643488A01456423620C37ED1653")), g3Var.g());
        jSONObject2.put(f1.b(f1.c("44210361A73657648A12524632681137F1166C46701511675EAD7E747C")), g3Var.v());
        jSONObject2.put(f1.b(f1.c("44210361A73657648A155F5834692E37F90E4F4C68")), g3Var.t());
        jSONObject2.put(f1.b(f1.c("44210361A73657648A12524632681800FA04464A7F04")), g3Var.u());
        jSONObject.put(f1.b(f1.c("44210361A7365771961B4D5123791537EC")), jSONObject2);
        String strS = g3Var.s();
        if (strS != null) {
            jSONObject.put(f1.b(f1.c("44210C7DBB2A5B58B415495739")), strS);
        }
        return jSONObject;
    }
}
