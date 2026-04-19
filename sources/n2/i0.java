package n2;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Comparable<i0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15808b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i0 f15809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i0 f15810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final i0 f15811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i0 f15812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final i0 f15813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final i0 f15814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final i0 f15815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final i0 f15816j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final i0 f15817k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final i0 f15818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final i0 f15819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final i0 f15820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final i0 f15821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final i0 f15822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final i0 f15823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final i0 f15824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final i0 f15825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final i0 f15826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final List<i0> f15827u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15828a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final i0 a() {
            return i0.f15826t;
        }

        public final i0 b() {
            return i0.f15824r;
        }

        public final i0 c() {
            return i0.f15825s;
        }

        public final i0 d() {
            return i0.f15819m;
        }

        public final i0 e() {
            return i0.f15820n;
        }

        public final i0 f() {
            return i0.f15822p;
        }

        public final i0 g() {
            return i0.f15821o;
        }

        public final i0 h() {
            return i0.f15823q;
        }

        public final i0 i() {
            return i0.f15818l;
        }

        public final i0 j() {
            return i0.f15812f;
        }

        public final i0 k() {
            return i0.f15813g;
        }

        public final i0 l() {
            return i0.f15814h;
        }
    }

    static {
        i0 i0Var = new i0(100);
        f15809c = i0Var;
        i0 i0Var2 = new i0(200);
        f15810d = i0Var2;
        i0 i0Var3 = new i0(RCHTTPStatusCodes.UNSUCCESSFUL);
        f15811e = i0Var3;
        i0 i0Var4 = new i0(RCHTTPStatusCodes.BAD_REQUEST);
        f15812f = i0Var4;
        i0 i0Var5 = new i0(500);
        f15813g = i0Var5;
        i0 i0Var6 = new i0(600);
        f15814h = i0Var6;
        i0 i0Var7 = new i0(700);
        f15815i = i0Var7;
        i0 i0Var8 = new i0(800);
        f15816j = i0Var8;
        i0 i0Var9 = new i0(900);
        f15817k = i0Var9;
        f15818l = i0Var;
        f15819m = i0Var2;
        f15820n = i0Var3;
        f15821o = i0Var4;
        f15822p = i0Var5;
        f15823q = i0Var6;
        f15824r = i0Var7;
        f15825s = i0Var8;
        f15826t = i0Var9;
        f15827u = nd.u.p(i0Var, i0Var2, i0Var3, i0Var4, i0Var5, i0Var6, i0Var7, i0Var8, i0Var9);
    }

    public i0(int i10) {
        this.f15828a = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i10).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f15828a == ((i0) obj).f15828a;
    }

    public int hashCode() {
        return this.f15828a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int compareTo(i0 i0Var) {
        return ae.r.g(this.f15828a, i0Var.f15828a);
    }

    public final int t() {
        return this.f15828a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f15828a + ')';
    }
}
