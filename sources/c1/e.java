package c1;

import ae.s;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nd.r0;
import t0.e2;
import t0.i0;
import t0.j0;
import t0.l0;
import t0.o;
import t0.o2;
import t0.v;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
final class e implements c1.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f6273d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j<e, ?> f6274e = k.a(a.f6278a, b.f6279a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Object, Map<String, List<Object>>> f6275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Object, d> f6276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f6277c;

    static final class a extends s implements p<l, e, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6278a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<Object, Map<String, List<Object>>> invoke(l lVar, e eVar) {
            return eVar.h();
        }
    }

    static final class b extends s implements zd.l<Map<Object, Map<String, ? extends List<? extends Object>>>, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6279a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke(Map<Object, Map<String, List<Object>>> map) {
            return new e(map);
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(ae.j jVar) {
            this();
        }

        public final j<e, ?> a() {
            return e.f6274e;
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f6280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f6281b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f6282c;

        static final class a extends s implements zd.l<Object, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f6284a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f6284a = eVar;
            }

            @Override // zd.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                g gVarG = this.f6284a.g();
                return Boolean.valueOf(gVarG != null ? gVarG.a(obj) : true);
            }
        }

        public d(Object obj) {
            this.f6280a = obj;
            this.f6282c = i.a((Map) e.this.f6275a.get(obj), new a(e.this));
        }

        public final g a() {
            return this.f6282c;
        }

        public final void b(Map<Object, Map<String, List<Object>>> map) {
            if (this.f6281b) {
                Map<String, List<Object>> mapB = this.f6282c.b();
                if (mapB.isEmpty()) {
                    map.remove(this.f6280a);
                } else {
                    map.put(this.f6280a, mapB);
                }
            }
        }

        public final void c(boolean z10) {
            this.f6281b = z10;
        }
    }

    /* JADX INFO: renamed from: c1.e$e, reason: collision with other inner class name */
    static final class C0149e extends s implements zd.l<j0, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f6286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f6287c;

        /* JADX INFO: renamed from: c1.e$e$a */
        public static final class a implements i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f6288a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f6289b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f6290c;

            public a(d dVar, e eVar, Object obj) {
                this.f6288a = dVar;
                this.f6289b = eVar;
                this.f6290c = obj;
            }

            @Override // t0.i0
            public void dispose() {
                this.f6288a.b(this.f6289b.f6275a);
                this.f6289b.f6276b.remove(this.f6290c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0149e(Object obj, d dVar) {
            super(1);
            this.f6286b = obj;
            this.f6287c = dVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0 invoke(j0 j0Var) {
            boolean z10 = !e.this.f6276b.containsKey(this.f6286b);
            Object obj = this.f6286b;
            if (z10) {
                e.this.f6275a.remove(this.f6286b);
                e.this.f6276b.put(this.f6286b, this.f6287c);
                return new a(this.f6287c, e.this, this.f6286b);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    static final class f extends s implements p<t0.l, Integer, md.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f6292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<t0.l, Integer, md.i0> f6293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6294d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Object obj, p<? super t0.l, ? super Integer, md.i0> pVar, int i10) {
            super(2);
            this.f6292b = obj;
            this.f6293c = pVar;
            this.f6294d = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ md.i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return md.i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            e.this.f(this.f6292b, this.f6293c, lVar, e2.a(this.f6294d | 1));
        }
    }

    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public e(Map<Object, Map<String, List<Object>>> map) {
        this.f6275a = map;
        this.f6276b = new LinkedHashMap();
    }

    public /* synthetic */ e(Map map, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> h() {
        Map<Object, Map<String, List<Object>>> mapV = r0.v(this.f6275a);
        Iterator<T> it = this.f6276b.values().iterator();
        while (it.hasNext()) {
            ((d) it.next()).b(mapV);
        }
        if (mapV.isEmpty()) {
            return null;
        }
        return mapV;
    }

    @Override // c1.d
    public void e(Object obj) {
        d dVar = this.f6276b.get(obj);
        if (dVar != null) {
            dVar.c(false);
        } else {
            this.f6275a.remove(obj);
        }
    }

    @Override // c1.d
    public void f(Object obj, p<? super t0.l, ? super Integer, md.i0> pVar, t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(-1198538093);
        if (o.I()) {
            o.U(-1198538093, i10, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        lVarP.e(444418301);
        lVarP.u(207, obj);
        lVarP.e(-492369756);
        Object objF = lVarP.f();
        if (objF == t0.l.f20813a.a()) {
            g gVarG = g();
            if (!(gVarG != null ? gVarG.a(obj) : true)) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            objF = new d(obj);
            lVarP.E(objF);
        }
        lVarP.K();
        d dVar = (d) objF;
        v.a(i.b().c(dVar.a()), pVar, lVarP, i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
        l0.b(md.i0.f15558a, new C0149e(obj, dVar), lVarP, 6);
        lVarP.d();
        lVarP.K();
        if (o.I()) {
            o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new f(obj, pVar, i10));
        }
    }

    public final g g() {
        return this.f6277c;
    }

    public final void i(g gVar) {
        this.f6277c = gVar;
    }
}
