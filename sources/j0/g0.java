package j0;

import c1.g;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t0.e2;
import t0.k1;
import t0.k3;
import t0.o2;

/* JADX INFO: loaded from: classes.dex */
final class g0 implements c1.g, c1.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f13692d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c1.g f13693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k1 f13694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Object> f13695c;

    static final class a extends ae.s implements zd.l<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c1.g f13696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c1.g gVar) {
            super(1);
            this.f13696a = gVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            c1.g gVar = this.f13696a;
            return Boolean.valueOf(gVar != null ? gVar.a(obj) : true);
        }
    }

    public static final class b {

        static final class a extends ae.s implements zd.p<c1.l, g0, Map<String, ? extends List<? extends Object>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f13697a = new a();

            a() {
                super(2);
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<String, List<Object>> invoke(c1.l lVar, g0 g0Var) {
                Map<String, List<Object>> mapB = g0Var.b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            }
        }

        /* JADX INFO: renamed from: j0.g0$b$b, reason: collision with other inner class name */
        static final class C0320b extends ae.s implements zd.l<Map<String, ? extends List<? extends Object>>, g0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c1.g f13698a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0320b(c1.g gVar) {
                super(1);
                this.f13698a = gVar;
            }

            @Override // zd.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g0 invoke(Map<String, ? extends List<? extends Object>> map) {
                return new g0(this.f13698a, map);
            }
        }

        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }

        public final c1.j<g0, Map<String, List<Object>>> a(c1.g gVar) {
            return c1.k.a(a.f13697a, new C0320b(gVar));
        }
    }

    static final class c extends ae.s implements zd.l<t0.j0, t0.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f13700b;

        public static final class a implements t0.i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g0 f13701a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f13702b;

            public a(g0 g0Var, Object obj) {
                this.f13701a = g0Var;
                this.f13702b = obj;
            }

            @Override // t0.i0
            public void dispose() {
                this.f13701a.f13695c.add(this.f13702b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(1);
            this.f13700b = obj;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0.i0 invoke(t0.j0 j0Var) {
            g0.this.f13695c.remove(this.f13700b);
            return new a(g0.this, this.f13700b);
        }
    }

    static final class d extends ae.s implements zd.p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f13704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, md.i0> f13705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13706d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Object obj, zd.p<? super t0.l, ? super Integer, md.i0> pVar, int i10) {
            super(2);
            this.f13704b = obj;
            this.f13705c = pVar;
            this.f13706d = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            g0.this.f(this.f13704b, this.f13705c, lVar, e2.a(this.f13706d | 1));
        }
    }

    public g0(c1.g gVar) {
        this.f13693a = gVar;
        this.f13694b = k3.e(null, null, 2, null);
        this.f13695c = new LinkedHashSet();
    }

    public g0(c1.g gVar, Map<String, ? extends List<? extends Object>> map) {
        this(c1.i.a(map, new a(gVar)));
    }

    @Override // c1.g
    public boolean a(Object obj) {
        return this.f13693a.a(obj);
    }

    @Override // c1.g
    public Map<String, List<Object>> b() {
        c1.d dVarH = h();
        if (dVarH != null) {
            Iterator<T> it = this.f13695c.iterator();
            while (it.hasNext()) {
                dVarH.e(it.next());
            }
        }
        return this.f13693a.b();
    }

    @Override // c1.g
    public Object c(String str) {
        return this.f13693a.c(str);
    }

    @Override // c1.g
    public g.a d(String str, zd.a<? extends Object> aVar) {
        return this.f13693a.d(str, aVar);
    }

    @Override // c1.d
    public void e(Object obj) {
        c1.d dVarH = h();
        if (dVarH == null) {
            throw new IllegalArgumentException("null wrappedHolder".toString());
        }
        dVarH.e(obj);
    }

    @Override // c1.d
    public void f(Object obj, zd.p<? super t0.l, ? super Integer, md.i0> pVar, t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(-697180401);
        if (t0.o.I()) {
            t0.o.U(-697180401, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        c1.d dVarH = h();
        if (dVarH == null) {
            throw new IllegalArgumentException("null wrappedHolder".toString());
        }
        dVarH.f(obj, pVar, lVarP, (i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 520);
        t0.l0.b(obj, new c(obj), lVarP, 8);
        if (t0.o.I()) {
            t0.o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new d(obj, pVar, i10));
        }
    }

    public final c1.d h() {
        return (c1.d) this.f13694b.getValue();
    }

    public final void i(c1.d dVar) {
        this.f13694b.setValue(dVar);
    }
}
