package io.flutter.embedding.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import fc.a;
import gd.h;
import hc.d;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rc.g;
import rc.i;
import rc.j;
import rc.k;
import rc.n;
import rc.o;
import rc.p;
import rc.q;
import rc.r;
import rc.s;

/* JADX INFO: loaded from: classes2.dex */
public class a implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f12845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FlutterRenderer f12846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fc.a f12847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.flutter.embedding.engine.b f12848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final uc.b f12849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final rc.a f12850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final rc.c f12851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g f12852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final rc.h f12853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i f12854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j f12855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final rc.b f12856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final o f12857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f12858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final n f12859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p f12860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final q f12861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final r f12862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final s f12863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final e f12864t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Set<b> f12865u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final b f12866v;

    /* JADX INFO: renamed from: io.flutter.embedding.engine.a$a, reason: collision with other inner class name */
    class C0309a implements b {
        C0309a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            cc.b.f("FlutterEngine", "onPreEngineRestart()");
            Iterator it = a.this.f12865u.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b();
            }
            a.this.f12864t.m0();
            a.this.f12857m.g();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, e eVar, String[] strArr, boolean z10, boolean z11) {
        this(context, dVar, flutterJNI, eVar, strArr, z10, z11, null);
    }

    public a(Context context, d dVar, FlutterJNI flutterJNI, e eVar, String[] strArr, boolean z10, boolean z11, c cVar) {
        AssetManager assets;
        this.f12865u = new HashSet();
        this.f12866v = new C0309a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        cc.a aVarE = cc.a.e();
        flutterJNI = flutterJNI == null ? aVarE.d().a() : flutterJNI;
        this.f12845a = flutterJNI;
        fc.a aVar = new fc.a(flutterJNI, assets);
        this.f12847c = aVar;
        aVar.m();
        gc.a aVarA = cc.a.e().a();
        this.f12850f = new rc.a(aVar, flutterJNI);
        rc.c cVar2 = new rc.c(aVar);
        this.f12851g = cVar2;
        this.f12852h = new g(aVar);
        rc.h hVar = new rc.h(aVar);
        this.f12853i = hVar;
        this.f12854j = new i(aVar);
        this.f12855k = new j(aVar);
        this.f12856l = new rc.b(aVar);
        this.f12858n = new k(aVar);
        this.f12859o = new n(aVar, context.getPackageManager());
        this.f12857m = new o(aVar, z11);
        this.f12860p = new p(aVar);
        this.f12861q = new q(aVar);
        this.f12862r = new r(aVar);
        this.f12863s = new s(aVar);
        if (aVarA != null) {
            aVarA.e(cVar2);
        }
        uc.b bVar = new uc.b(context, hVar);
        this.f12849e = bVar;
        dVar = dVar == null ? aVarE.c() : dVar;
        if (!flutterJNI.isAttached()) {
            dVar.m(context.getApplicationContext());
            dVar.f(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f12866v);
        flutterJNI.setPlatformViewsController(eVar);
        flutterJNI.setLocalizationPlugin(bVar);
        flutterJNI.setDeferredComponentManager(aVarE.a());
        if (!flutterJNI.isAttached()) {
            f();
        }
        this.f12846b = new FlutterRenderer(flutterJNI);
        this.f12864t = eVar;
        eVar.g0();
        io.flutter.embedding.engine.b bVar2 = new io.flutter.embedding.engine.b(context.getApplicationContext(), this, dVar, cVar);
        this.f12848d = bVar2;
        bVar.d(context.getResources().getConfiguration());
        if (z10 && dVar.e()) {
            pc.a.a(this);
        }
        h.c(context, this);
        bVar2.i(new xc.a(r()));
    }

    private void f() {
        cc.b.f("FlutterEngine", "Attaching to JNI.");
        this.f12845a.attachToNative();
        if (!y()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    private boolean y() {
        return this.f12845a.isAttached();
    }

    @Override // gd.h.a
    public void a(float f10, float f11, float f12) {
        this.f12845a.updateDisplayMetrics(0, f10, f11, f12);
    }

    public void e(b bVar) {
        this.f12865u.add(bVar);
    }

    public void g() {
        cc.b.f("FlutterEngine", "Destroying.");
        Iterator<b> it = this.f12865u.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f12848d.k();
        this.f12864t.i0();
        this.f12847c.n();
        this.f12845a.removeEngineLifecycleListener(this.f12866v);
        this.f12845a.setDeferredComponentManager(null);
        this.f12845a.detachFromNativeAndReleaseResources();
        if (cc.a.e().a() != null) {
            cc.a.e().a().destroy();
            this.f12851g.c(null);
        }
    }

    public rc.a h() {
        return this.f12850f;
    }

    public kc.b i() {
        return this.f12848d;
    }

    public fc.a j() {
        return this.f12847c;
    }

    public g k() {
        return this.f12852h;
    }

    public uc.b l() {
        return this.f12849e;
    }

    public i m() {
        return this.f12854j;
    }

    public j n() {
        return this.f12855k;
    }

    public k o() {
        return this.f12858n;
    }

    public e p() {
        return this.f12864t;
    }

    public jc.b q() {
        return this.f12848d;
    }

    public n r() {
        return this.f12859o;
    }

    public FlutterRenderer s() {
        return this.f12846b;
    }

    public o t() {
        return this.f12857m;
    }

    public p u() {
        return this.f12860p;
    }

    public q v() {
        return this.f12861q;
    }

    public r w() {
        return this.f12862r;
    }

    public s x() {
        return this.f12863s;
    }

    a z(Context context, a.b bVar, String str, List<String> list, e eVar, boolean z10, boolean z11) {
        if (y()) {
            return new a(context, null, this.f12845a.spawn(bVar.f11180c, bVar.f11179b, str, list), eVar, null, z10, z11);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }
}
