package s6;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class q1 extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f20266p = f1.a("53211961AA267C55850058");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f20267q = f1.b(f1.c("4420045BBD225B44"));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f20268r = f1.b(f1.c("56341F41A72540"));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f20269s = f1.b(f1.c("542C0A6BA230"));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f20270t = f1.b(f1.c("40251B6BA1265D6C851D51"));

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f20271u = f1.b(f1.c("44211C7BA02C416880"));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f20272v = f1.b(f1.c("44200458A5225B478B0650"));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f20273w = f1.b(f1.c("44200441AD2641558D12545123"));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f20274x = f1.b(f1.c("542B016EA02479449607545B3F"));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f20275y = f1.b(f1.c("533D0169A42A4C628B1A5B5D365B1920EC0B4541"));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g0 f20276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u6.f f20277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0 f20278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f20279o;

    public q1(g0 g0Var, u6.f fVar, a0 a0Var, String str, boolean z10) {
        super(g0Var, z10);
        this.f20276l = g0Var;
        this.f20277m = fVar;
        this.f20278n = a0Var;
        this.f20279o = str;
    }

    @Override // s6.b
    public JSONObject c() throws JSONException {
        JSONObject jSONObjectC = super.c();
        jSONObjectC.put(f1.a("56341F41A72540"), new f3().a(this.f20276l));
        jSONObjectC.put(f1.b(f1.c("53211961AA267C55850058")), new y2().a(this.f20277m.a()));
        jSONObjectC.put(f1.b(f1.c("4420045BBD225B44")), new t0().a(this.f20277m));
        jSONObjectC.put(f1.b(f1.c("542C0A6BA230")), this.f20278n.a());
        jSONObjectC.put(f1.b(f1.c("44211C7BA02C416880")), this.f20276l.b());
        jSONObjectC.put(f1.b(f1.c("44200458A5225B478B0650")), f1.b(f1.c("71281A7CBD265D")));
        if (this.f20276l.e().f() != null) {
            jSONObjectC.put(f1.b(f1.c("44200441AD2641558D12545123")), this.f20276l.e().f());
        }
        if (this.f20276l.f() != null) {
            jSONObjectC.put(f1.b(f1.c("40251B6BA1265D6C851D51")), this.f20276l.f());
        }
        if (e.a("51310364", f1.b(f1.c("55251C61AA"))) && f1.b(f1.c("59310364")) != null) {
            jSONObjectC.put(f1.b(f1.c("542B016EA02479449607545B3F")), f1.b(f1.c("59310364")));
        }
        if (e.a("51310364", f1.b(f1.c("55251C61AA"))) && this.f20279o != null) {
            jSONObjectC.put(f1.b(f1.c("533D0169A42A4C628B1A5B5D365B1920EC0B4541")), this.f20279o);
        }
        return jSONObjectC;
    }
}
