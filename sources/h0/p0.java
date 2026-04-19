package h0;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.o;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    private static boolean A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f11705x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f11706y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final WeakHashMap<View, p0> f11707z = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0.a f11708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0.a f11709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0.a f11710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0.a f11711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h0.a f11712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h0.a f11713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h0.a f11714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final h0.a f11715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h0.a f11716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m0 f11717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o0 f11718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final o0 f11719l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final o0 f11720m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m0 f11721n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m0 f11722o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final m0 f11723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final m0 f11724q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final m0 f11725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final m0 f11726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final m0 f11727t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f11728u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f11729v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final q f11730w;

    public static final class a {

        /* JADX INFO: renamed from: h0.p0$a$a, reason: collision with other inner class name */
        static final class C0282a extends ae.s implements zd.l<t0.j0, t0.i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p0 f11731a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f11732b;

            /* JADX INFO: renamed from: h0.p0$a$a$a, reason: collision with other inner class name */
            public static final class C0283a implements t0.i0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ p0 f11733a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f11734b;

                public C0283a(p0 p0Var, View view) {
                    this.f11733a = p0Var;
                    this.f11734b = view;
                }

                @Override // t0.i0
                public void dispose() {
                    this.f11733a.b(this.f11734b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0282a(p0 p0Var, View view) {
                super(1);
                this.f11731a = p0Var;
                this.f11732b = view;
            }

            @Override // zd.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final t0.i0 invoke(t0.j0 j0Var) {
                this.f11731a.f(this.f11732b);
                return new C0283a(this.f11731a, this.f11732b);
            }
        }

        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        private final p0 d(View view) {
            p0 p0Var;
            synchronized (p0.f11707z) {
                WeakHashMap weakHashMap = p0.f11707z;
                Object obj = weakHashMap.get(view);
                Object obj2 = obj;
                if (obj == null) {
                    p0 p0Var2 = new p0(null, view, false ? 1 : 0);
                    weakHashMap.put(view, p0Var2);
                    obj2 = p0Var2;
                }
                p0Var = (p0) obj2;
            }
            return p0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h0.a e(androidx.core.view.o oVar, int i10, String str) {
            h0.a aVar = new h0.a(i10, str);
            if (oVar != null) {
                aVar.h(oVar, i10);
            }
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final m0 f(androidx.core.view.o oVar, int i10, String str) {
            androidx.core.graphics.a aVarG;
            if (oVar == null || (aVarG = oVar.g(i10)) == null) {
                aVarG = androidx.core.graphics.a.f3307e;
            }
            return t0.a(aVarG, str);
        }

        public final p0 c(t0.l lVar, int i10) {
            lVar.e(-1366542614);
            if (t0.o.I()) {
                t0.o.U(-1366542614, i10, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            View view = (View) lVar.P(androidx.compose.ui.platform.r.j());
            p0 p0VarD = d(view);
            t0.l0.b(p0VarD, new C0282a(p0VarD, view), lVar, 8);
            if (t0.o.I()) {
                t0.o.T();
            }
            lVar.K();
            return p0VarD;
        }
    }

    private p0(androidx.core.view.o oVar, View view) {
        androidx.core.view.b bVarE;
        androidx.core.graphics.a aVarE;
        a aVar = f11705x;
        this.f11708a = aVar.e(oVar, o.m.a(), "captionBar");
        h0.a aVarE2 = aVar.e(oVar, o.m.b(), "displayCutout");
        this.f11709b = aVarE2;
        h0.a aVarE3 = aVar.e(oVar, o.m.c(), "ime");
        this.f11710c = aVarE3;
        h0.a aVarE4 = aVar.e(oVar, o.m.e(), "mandatorySystemGestures");
        this.f11711d = aVarE4;
        this.f11712e = aVar.e(oVar, o.m.f(), "navigationBars");
        this.f11713f = aVar.e(oVar, o.m.g(), "statusBars");
        h0.a aVarE5 = aVar.e(oVar, o.m.h(), "systemBars");
        this.f11714g = aVarE5;
        h0.a aVarE6 = aVar.e(oVar, o.m.i(), "systemGestures");
        this.f11715h = aVarE6;
        h0.a aVarE7 = aVar.e(oVar, o.m.j(), "tappableElement");
        this.f11716i = aVarE7;
        m0 m0VarA = t0.a((oVar == null || (bVarE = oVar.e()) == null || (aVarE = bVarE.e()) == null) ? androidx.core.graphics.a.f3307e : aVarE, "waterfall");
        this.f11717j = m0VarA;
        o0 o0VarD = q0.d(q0.d(aVarE5, aVarE3), aVarE2);
        this.f11718k = o0VarD;
        o0 o0VarD2 = q0.d(q0.d(q0.d(aVarE7, aVarE4), aVarE6), m0VarA);
        this.f11719l = o0VarD2;
        this.f11720m = q0.d(o0VarD, o0VarD2);
        this.f11721n = aVar.f(oVar, o.m.a(), "captionBarIgnoringVisibility");
        this.f11722o = aVar.f(oVar, o.m.f(), "navigationBarsIgnoringVisibility");
        this.f11723p = aVar.f(oVar, o.m.g(), "statusBarsIgnoringVisibility");
        this.f11724q = aVar.f(oVar, o.m.h(), "systemBarsIgnoringVisibility");
        this.f11725r = aVar.f(oVar, o.m.j(), "tappableElementIgnoringVisibility");
        this.f11726s = aVar.f(oVar, o.m.c(), "imeAnimationTarget");
        this.f11727t = aVar.f(oVar, o.m.c(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(f1.e.I) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f11728u = bool != null ? bool.booleanValue() : true;
        this.f11730w = new q(this);
    }

    public /* synthetic */ p0(androidx.core.view.o oVar, View view, ae.j jVar) {
        this(oVar, view);
    }

    public static /* synthetic */ void h(p0 p0Var, androidx.core.view.o oVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        p0Var.g(oVar, i10);
    }

    public final void b(View view) {
        int i10 = this.f11729v - 1;
        this.f11729v = i10;
        if (i10 == 0) {
            androidx.core.view.h.i0(view, null);
            androidx.core.view.h.n0(view, null);
            view.removeOnAttachStateChangeListener(this.f11730w);
        }
    }

    public final boolean c() {
        return this.f11728u;
    }

    public final h0.a d() {
        return this.f11713f;
    }

    public final h0.a e() {
        return this.f11714g;
    }

    public final void f(View view) {
        if (this.f11729v == 0) {
            androidx.core.view.h.i0(view, this.f11730w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.f11730w);
            androidx.core.view.h.n0(view, this.f11730w);
        }
        this.f11729v++;
    }

    public final void g(androidx.core.view.o oVar, int i10) {
        if (A) {
            WindowInsets windowInsetsV = oVar.v();
            ae.r.c(windowInsetsV);
            oVar = androidx.core.view.o.w(windowInsetsV);
        }
        this.f11708a.h(oVar, i10);
        this.f11710c.h(oVar, i10);
        this.f11709b.h(oVar, i10);
        this.f11712e.h(oVar, i10);
        this.f11713f.h(oVar, i10);
        this.f11714g.h(oVar, i10);
        this.f11715h.h(oVar, i10);
        this.f11716i.h(oVar, i10);
        this.f11711d.h(oVar, i10);
        if (i10 == 0) {
            this.f11721n.f(t0.d(oVar.g(o.m.a())));
            this.f11722o.f(t0.d(oVar.g(o.m.f())));
            this.f11723p.f(t0.d(oVar.g(o.m.g())));
            this.f11724q.f(t0.d(oVar.g(o.m.h())));
            this.f11725r.f(t0.d(oVar.g(o.m.j())));
            androidx.core.view.b bVarE = oVar.e();
            if (bVarE != null) {
                this.f11717j.f(t0.d(bVarE.e()));
            }
        }
        d1.k.f9368e.k();
    }

    public final void i(androidx.core.view.o oVar) {
        this.f11727t.f(t0.d(oVar.f(o.m.c())));
    }

    public final void j(androidx.core.view.o oVar) {
        this.f11726s.f(t0.d(oVar.f(o.m.c())));
    }
}
