package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.i;
import b2.k0;
import b2.n0;
import b2.p0;
import md.i0;
import t0.a2;
import t0.b2;
import t0.e2;
import t0.j0;
import t0.k1;
import t0.k3;
import t0.l;
import t0.l0;
import t0.o2;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a2<Configuration> f3067a = t0.v.d(null, a.f3073a, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a2<Context> f3068b = t0.v.e(b.f3074a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a2<f2.b> f3069c = t0.v.e(c.f3075a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a2<o4.e> f3070d = t0.v.e(d.f3076a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a2<x4.f> f3071e = t0.v.e(e.f3077a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a2<View> f3072f = t0.v.e(f.f3078a);

    static final class a extends ae.s implements zd.a<Configuration> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3073a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            r.k("LocalConfiguration");
            throw new md.i();
        }
    }

    static final class b extends ae.s implements zd.a<Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3074a = new b();

        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            r.k("LocalContext");
            throw new md.i();
        }
    }

    static final class c extends ae.s implements zd.a<f2.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f3075a = new c();

        c() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f2.b invoke() {
            r.k("LocalImageVectorCache");
            throw new md.i();
        }
    }

    static final class d extends ae.s implements zd.a<o4.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f3076a = new d();

        d() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o4.e invoke() {
            r.k("LocalLifecycleOwner");
            throw new md.i();
        }
    }

    static final class e extends ae.s implements zd.a<x4.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f3077a = new e();

        e() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x4.f invoke() {
            r.k("LocalSavedStateRegistryOwner");
            throw new md.i();
        }
    }

    static final class f extends ae.s implements zd.a<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f3078a = new f();

        f() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            r.k("LocalView");
            throw new md.i();
        }
    }

    static final class g extends ae.s implements zd.l<Configuration, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k1<Configuration> f3079a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k1<Configuration> k1Var) {
            super(1);
            this.f3079a = k1Var;
        }

        public final void a(Configuration configuration) {
            r.c(this.f3079a, new Configuration(configuration));
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Configuration configuration) {
            a(configuration);
            return i0.f15558a;
        }
    }

    static final class h extends ae.s implements zd.l<j0, t0.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0 f3080a;

        public static final class a implements t0.i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n0 f3081a;

            public a(n0 n0Var) {
                this.f3081a = n0Var;
            }

            @Override // t0.i0
            public void dispose() {
                this.f3081a.e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(n0 n0Var) {
            super(1);
            this.f3080a = n0Var;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0.i0 invoke(j0 j0Var) {
            return new a(this.f3080a);
        }
    }

    static final class i extends ae.s implements zd.p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.i f3082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b2.e0 f3083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, i0> f3084c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(androidx.compose.ui.platform.i iVar, b2.e0 e0Var, zd.p<? super t0.l, ? super Integer, i0> pVar) {
            super(2);
            this.f3082a = iVar;
            this.f3083b = e0Var;
            this.f3084c = pVar;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.s()) {
                lVar.x();
                return;
            }
            if (t0.o.I()) {
                t0.o.U(1471621628, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:118)");
            }
            k0.a(this.f3082a, this.f3083b, this.f3084c, lVar, 72);
            if (t0.o.I()) {
                t0.o.T();
            }
        }
    }

    static final class j extends ae.s implements zd.p<t0.l, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.i f3085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.p<t0.l, Integer, i0> f3086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3087c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(androidx.compose.ui.platform.i iVar, zd.p<? super t0.l, ? super Integer, i0> pVar, int i10) {
            super(2);
            this.f3085a = iVar;
            this.f3086b = pVar;
            this.f3087c = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(t0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(t0.l lVar, int i10) {
            r.a(this.f3085a, this.f3086b, lVar, e2.a(this.f3087c | 1));
        }
    }

    static final class k extends ae.s implements zd.l<j0, t0.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f3088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f3089b;

        public static final class a implements t0.i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f3090a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f3091b;

            public a(Context context, l lVar) {
                this.f3090a = context;
                this.f3091b = lVar;
            }

            @Override // t0.i0
            public void dispose() {
                this.f3090a.getApplicationContext().unregisterComponentCallbacks(this.f3091b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f3088a = context;
            this.f3089b = lVar;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t0.i0 invoke(j0 j0Var) {
            this.f3088a.getApplicationContext().registerComponentCallbacks(this.f3089b);
            return new a(this.f3088a, this.f3089b);
        }
    }

    public static final class l implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Configuration f3092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f2.b f3093b;

        l(Configuration configuration, f2.b bVar) {
            this.f3092a = configuration;
            this.f3093b = bVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f3093b.c(this.f3092a.updateFrom(configuration));
            this.f3092a.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f3093b.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            this.f3093b.a();
        }
    }

    public static final void a(androidx.compose.ui.platform.i iVar, zd.p<? super t0.l, ? super Integer, i0> pVar, t0.l lVar, int i10) {
        t0.l lVarP = lVar.p(1396852028);
        if (t0.o.I()) {
            t0.o.U(1396852028, i10, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        Context context = iVar.getContext();
        lVarP.e(-492369756);
        Object objF = lVarP.f();
        l.a aVar = t0.l.f20813a;
        if (objF == aVar.a()) {
            objF = k3.e(new Configuration(context.getResources().getConfiguration()), null, 2, null);
            lVarP.E(objF);
        }
        lVarP.K();
        k1 k1Var = (k1) objF;
        lVarP.e(-230243351);
        boolean zN = lVarP.N(k1Var);
        Object objF2 = lVarP.f();
        if (zN || objF2 == aVar.a()) {
            objF2 = new g(k1Var);
            lVarP.E(objF2);
        }
        lVarP.K();
        iVar.setConfigurationChangeObserver((zd.l) objF2);
        lVarP.e(-492369756);
        Object objF3 = lVarP.f();
        if (objF3 == aVar.a()) {
            objF3 = new b2.e0(context);
            lVarP.E(objF3);
        }
        lVarP.K();
        b2.e0 e0Var = (b2.e0) objF3;
        i.c viewTreeOwners = iVar.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        lVarP.e(-492369756);
        Object objF4 = lVarP.f();
        if (objF4 == aVar.a()) {
            objF4 = p0.b(iVar, viewTreeOwners.b());
            lVarP.E(objF4);
        }
        lVarP.K();
        n0 n0Var = (n0) objF4;
        l0.b(i0.f15558a, new h(n0Var), lVarP, 6);
        t0.v.b(new b2[]{f3067a.c(b(k1Var)), f3068b.c(context), f3070d.c(viewTreeOwners.a()), f3071e.c(viewTreeOwners.b()), c1.i.b().c(n0Var), f3072f.c(iVar.getView()), f3069c.c(l(context, b(k1Var), lVarP, 72))}, b1.c.b(lVarP, 1471621628, true, new i(iVar, e0Var, pVar)), lVarP, 56);
        if (t0.o.I()) {
            t0.o.T();
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV != null) {
            o2VarV.a(new j(iVar, pVar, i10));
        }
    }

    private static final Configuration b(k1<Configuration> k1Var) {
        return k1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(k1<Configuration> k1Var, Configuration configuration) {
        k1Var.setValue(configuration);
    }

    public static final a2<Configuration> f() {
        return f3067a;
    }

    public static final a2<Context> g() {
        return f3068b;
    }

    public static final a2<f2.b> h() {
        return f3069c;
    }

    public static final a2<o4.e> i() {
        return f3070d;
    }

    public static final a2<View> j() {
        return f3072f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void k(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final f2.b l(Context context, Configuration configuration, t0.l lVar, int i10) {
        lVar.e(-485908294);
        if (t0.o.I()) {
            t0.o.U(-485908294, i10, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:131)");
        }
        lVar.e(-492369756);
        Object objF = lVar.f();
        l.a aVar = t0.l.f20813a;
        if (objF == aVar.a()) {
            objF = new f2.b();
            lVar.E(objF);
        }
        lVar.K();
        f2.b bVar = (f2.b) objF;
        lVar.e(-492369756);
        Object objF2 = lVar.f();
        Object obj = objF2;
        if (objF2 == aVar.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            lVar.E(configuration2);
            obj = configuration2;
        }
        lVar.K();
        Configuration configuration3 = (Configuration) obj;
        lVar.e(-492369756);
        Object objF3 = lVar.f();
        if (objF3 == aVar.a()) {
            objF3 = new l(configuration3, bVar);
            lVar.E(objF3);
        }
        lVar.K();
        l0.b(bVar, new k(context, (l) objF3), lVar, 8);
        if (t0.o.I()) {
            t0.o.T();
        }
        lVar.K();
        return bVar;
    }
}
