package g2;

import i2.e0;
import java.util.List;
import md.i0;
import nd.c0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f11377a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final w<List<String>> f11378b = v.b("ContentDescription", a.f11403a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final w<String> f11379c = v.a("StateDescription");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final w<g2.h> f11380d = v.a("ProgressBarRangeInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final w<String> f11381e = v.b("PaneTitle", e.f11407a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final w<i0> f11382f = v.a("SelectableGroup");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final w<g2.b> f11383g = v.a("CollectionInfo");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final w<g2.c> f11384h = v.a("CollectionItemInfo");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final w<i0> f11385i = v.a("Heading");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final w<i0> f11386j = v.a("Disabled");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final w<g2.g> f11387k = v.a("LiveRegion");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final w<Boolean> f11388l = v.a("Focused");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final w<Boolean> f11389m = v.a("IsTraversalGroup");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final w<i0> f11390n = new w<>("InvisibleToUser", b.f11404a);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final w<Float> f11391o = v.b("TraversalIndex", i.f11411a);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final w<j> f11392p = v.a("HorizontalScrollAxisRange");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final w<j> f11393q = v.a("VerticalScrollAxisRange");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final w<i0> f11394r = v.b("IsPopup", d.f11406a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final w<i0> f11395s = v.b("IsDialog", c.f11405a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final w<g2.i> f11396t = v.b("Role", f.f11408a);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final w<String> f11397u = new w<>("TestTag", false, g.f11409a);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final w<List<i2.d>> f11398v = v.b("Text", h.f11410a);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final w<i2.d> f11399w = new w<>("TextSubstitution", null, 2, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final w<Boolean> f11400x = new w<>("IsShowingTextSubstitution", null, 2, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final w<i2.d> f11401y = v.a("EditableText");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final w<e0> f11402z = v.a("TextSelectionRange");
    private static final w<p2.j> A = v.a("ImeAction");
    private static final w<Boolean> B = v.a("Selected");
    private static final w<h2.a> C = v.a("ToggleableState");
    private static final w<i0> D = v.a("Password");
    private static final w<String> E = v.a("Error");
    private static final w<zd.l<Object, Integer>> F = new w<>("IndexForKey", null, 2, null);
    public static final int G = 8;

    static final class a extends ae.s implements zd.p<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11403a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(List<String> list, List<String> list2) {
            List<String> listF0;
            if (list == null || (listF0 = c0.F0(list)) == null) {
                return list2;
            }
            listF0.addAll(list2);
            return listF0;
        }
    }

    static final class b extends ae.s implements zd.p<i0, i0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f11404a = new b();

        b() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke(i0 i0Var, i0 i0Var2) {
            return i0Var;
        }
    }

    static final class c extends ae.s implements zd.p<i0, i0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f11405a = new c();

        c() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke(i0 i0Var, i0 i0Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    static final class d extends ae.s implements zd.p<i0, i0, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f11406a = new d();

        d() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke(i0 i0Var, i0 i0Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    static final class e extends ae.s implements zd.p<String, String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f11407a = new e();

        e() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    static final class f extends ae.s implements zd.p<g2.i, g2.i, g2.i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f11408a = new f();

        f() {
            super(2);
        }

        public final g2.i a(g2.i iVar, int i10) {
            return iVar;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ g2.i invoke(g2.i iVar, g2.i iVar2) {
            return a(iVar, iVar2.n());
        }
    }

    static final class g extends ae.s implements zd.p<String, String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f11409a = new g();

        g() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    static final class h extends ae.s implements zd.p<List<? extends i2.d>, List<? extends i2.d>, List<? extends i2.d>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f11410a = new h();

        h() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<i2.d> invoke(List<i2.d> list, List<i2.d> list2) {
            List<i2.d> listF0;
            if (list == null || (listF0 = c0.F0(list)) == null) {
                return list2;
            }
            listF0.addAll(list2);
            return listF0;
        }
    }

    static final class i extends ae.s implements zd.p<Float, Float, Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f11411a = new i();

        i() {
            super(2);
        }

        public final Float a(Float f10, float f11) {
            return f10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
            return a(f10, f11.floatValue());
        }
    }

    private s() {
    }

    public final w<i2.d> A() {
        return f11399w;
    }

    public final w<h2.a> B() {
        return C;
    }

    public final w<Float> C() {
        return f11391o;
    }

    public final w<j> D() {
        return f11393q;
    }

    public final w<g2.b> a() {
        return f11383g;
    }

    public final w<g2.c> b() {
        return f11384h;
    }

    public final w<List<String>> c() {
        return f11378b;
    }

    public final w<i0> d() {
        return f11386j;
    }

    public final w<i2.d> e() {
        return f11401y;
    }

    public final w<String> f() {
        return E;
    }

    public final w<Boolean> g() {
        return f11388l;
    }

    public final w<i0> h() {
        return f11385i;
    }

    public final w<j> i() {
        return f11392p;
    }

    public final w<p2.j> j() {
        return A;
    }

    public final w<zd.l<Object, Integer>> k() {
        return F;
    }

    public final w<i0> l() {
        return f11390n;
    }

    public final w<i0> m() {
        return f11395s;
    }

    public final w<Boolean> n() {
        return f11400x;
    }

    public final w<Boolean> o() {
        return f11389m;
    }

    public final w<g2.g> p() {
        return f11387k;
    }

    public final w<String> q() {
        return f11381e;
    }

    public final w<i0> r() {
        return D;
    }

    public final w<g2.h> s() {
        return f11380d;
    }

    public final w<g2.i> t() {
        return f11396t;
    }

    public final w<i0> u() {
        return f11382f;
    }

    public final w<Boolean> v() {
        return B;
    }

    public final w<String> w() {
        return f11379c;
    }

    public final w<String> x() {
        return f11397u;
    }

    public final w<List<i2.d>> y() {
        return f11398v;
    }

    public final w<e0> z() {
        return f11402z;
    }
}
