package io.flutter.embedding.engine;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.g;
import gd.e;
import hc.d;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jc.a;
import kc.c;
import sc.l;
import sc.m;
import sc.n;
import sc.o;

/* JADX INFO: loaded from: classes2.dex */
class b implements jc.b, kc.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.a f12869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.b f12870c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private dc.b<Activity> f12872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f12873f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Service f12876i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private BroadcastReceiver f12878k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContentProvider f12880m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends jc.a>, jc.a> f12868a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<? extends jc.a>, kc.a> f12871d = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12874g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<Class<? extends jc.a>, oc.a> f12875h = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<Class<? extends jc.a>, lc.a> f12877j = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<Class<? extends jc.a>, mc.a> f12879l = new HashMap();

    /* JADX INFO: renamed from: io.flutter.embedding.engine.b$b, reason: collision with other inner class name */
    private static class C0310b implements a.InterfaceC0330a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f12881a;

        private C0310b(d dVar) {
            this.f12881a = dVar;
        }

        @Override // jc.a.InterfaceC0330a
        public String a(String str) {
            return this.f12881a.i(str);
        }
    }

    private static class c implements kc.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f12882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HiddenLifecycleReference f12883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<n> f12884c = new HashSet();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set<l> f12885d = new HashSet();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Set<m> f12886e = new HashSet();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Set<o> f12887f = new HashSet();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set<Object> f12888g = new HashSet();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Set<c.a> f12889h = new HashSet();

        public c(Activity activity, g gVar) {
            this.f12882a = activity;
            this.f12883b = new HiddenLifecycleReference(gVar);
        }

        @Override // kc.c
        public void a(n nVar) {
            this.f12884c.add(nVar);
        }

        @Override // kc.c
        public void b(l lVar) {
            this.f12885d.add(lVar);
        }

        @Override // kc.c
        public void c(n nVar) {
            this.f12884c.remove(nVar);
        }

        @Override // kc.c
        public void d(l lVar) {
            this.f12885d.remove(lVar);
        }

        boolean e(int i10, int i11, Intent intent) {
            Iterator it = new HashSet(this.f12885d).iterator();
            while (true) {
                boolean z10 = false;
                while (it.hasNext()) {
                    if (((l) it.next()).onActivityResult(i10, i11, intent) || z10) {
                        z10 = true;
                    }
                }
                return z10;
            }
        }

        void f(Intent intent) {
            Iterator<m> it = this.f12886e.iterator();
            while (it.hasNext()) {
                it.next().e(intent);
            }
        }

        boolean g(int i10, String[] strArr, int[] iArr) {
            Iterator<n> it = this.f12884c.iterator();
            while (true) {
                boolean z10 = false;
                while (it.hasNext()) {
                    if (it.next().d(i10, strArr, iArr) || z10) {
                        z10 = true;
                    }
                }
                return z10;
            }
        }

        @Override // kc.c
        public Activity getActivity() {
            return this.f12882a;
        }

        @Override // kc.c
        public Object getLifecycle() {
            return this.f12883b;
        }

        void h(Bundle bundle) {
            Iterator<c.a> it = this.f12889h.iterator();
            while (it.hasNext()) {
                it.next().a(bundle);
            }
        }

        void i(Bundle bundle) {
            Iterator<c.a> it = this.f12889h.iterator();
            while (it.hasNext()) {
                it.next().b(bundle);
            }
        }

        void j() {
            Iterator<o> it = this.f12887f.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    b(Context context, io.flutter.embedding.engine.a aVar, d dVar, io.flutter.embedding.engine.c cVar) {
        this.f12869b = aVar;
        this.f12870c = new a.b(context, aVar, aVar.j(), aVar.s(), aVar.p().W(), new C0310b(dVar), cVar);
    }

    private void j(Activity activity, g gVar) {
        this.f12873f = new c(activity, gVar);
        this.f12869b.p().u0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f12869b.p().C(activity, this.f12869b.s(), this.f12869b.j());
        for (kc.a aVar : this.f12871d.values()) {
            if (this.f12874g) {
                aVar.onReattachedToActivityForConfigChanges(this.f12873f);
            } else {
                aVar.onAttachedToActivity(this.f12873f);
            }
        }
        this.f12874g = false;
    }

    private void l() {
        this.f12869b.p().O();
        this.f12872e = null;
        this.f12873f = null;
    }

    private void m() {
        if (r()) {
            f();
            return;
        }
        if (u()) {
            p();
        } else if (s()) {
            n();
        } else if (t()) {
            o();
        }
    }

    private boolean r() {
        return this.f12872e != null;
    }

    private boolean s() {
        return this.f12878k != null;
    }

    private boolean t() {
        return this.f12880m != null;
    }

    private boolean u() {
        return this.f12876i != null;
    }

    @Override // kc.b
    public void a(Bundle bundle) {
        if (!r()) {
            cc.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        e eVarY = e.y("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f12873f.h(bundle);
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // kc.b
    public void b(Bundle bundle) {
        if (!r()) {
            cc.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        e eVarY = e.y("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f12873f.i(bundle);
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // kc.b
    public void c() {
        if (!r()) {
            cc.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        e eVarY = e.y("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f12873f.j();
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // kc.b
    public boolean d(int i10, String[] strArr, int[] iArr) {
        if (!r()) {
            cc.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        e eVarY = e.y("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            boolean zG = this.f12873f.g(i10, strArr, iArr);
            if (eVarY != null) {
                eVarY.close();
            }
            return zG;
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // kc.b
    public void e(Intent intent) {
        if (!r()) {
            cc.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        e eVarY = e.y("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f12873f.f(intent);
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // kc.b
    public void f() {
        if (!r()) {
            cc.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        e eVarY = e.y("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator<kc.a> it = this.f12871d.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivity();
            }
            l();
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // kc.b
    public void g(dc.b<Activity> bVar, g gVar) {
        e eVarY = e.y("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            dc.b<Activity> bVar2 = this.f12872e;
            if (bVar2 != null) {
                bVar2.c();
            }
            m();
            this.f12872e = bVar;
            j(bVar.d(), gVar);
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // kc.b
    public void h() {
        if (!r()) {
            cc.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        e eVarY = e.y("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f12874g = true;
            Iterator<kc.a> it = this.f12871d.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivityForConfigChanges();
            }
            l();
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jc.b
    public void i(jc.a aVar) {
        e eVarY = e.y("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (q(aVar.getClass())) {
                cc.b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f12869b + ").");
                if (eVarY != null) {
                    eVarY.close();
                    return;
                }
                return;
            }
            cc.b.f("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f12868a.put((Class<? extends jc.a>) aVar.getClass(), aVar);
            aVar.onAttachedToEngine(this.f12870c);
            if (aVar instanceof kc.a) {
                kc.a aVar2 = (kc.a) aVar;
                this.f12871d.put((Class<? extends jc.a>) aVar.getClass(), aVar2);
                if (r()) {
                    aVar2.onAttachedToActivity(this.f12873f);
                }
            }
            if (aVar instanceof oc.a) {
                oc.a aVar3 = (oc.a) aVar;
                this.f12875h.put((Class<? extends jc.a>) aVar.getClass(), aVar3);
                if (u()) {
                    aVar3.a(null);
                }
            }
            if (aVar instanceof lc.a) {
                lc.a aVar4 = (lc.a) aVar;
                this.f12877j.put((Class<? extends jc.a>) aVar.getClass(), aVar4);
                if (s()) {
                    aVar4.a(null);
                }
            }
            if (aVar instanceof mc.a) {
                mc.a aVar5 = (mc.a) aVar;
                this.f12879l.put((Class<? extends jc.a>) aVar.getClass(), aVar5);
                if (t()) {
                    aVar5.b(null);
                }
            }
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void k() {
        cc.b.f("FlutterEngineCxnRegstry", "Destroying.");
        m();
        x();
    }

    public void n() {
        if (!s()) {
            cc.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        e eVarY = e.y("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator<lc.a> it = this.f12877j.values().iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void o() {
        if (!t()) {
            cc.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        e eVarY = e.y("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator<mc.a> it = this.f12879l.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // kc.b
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (!r()) {
            cc.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        e eVarY = e.y("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            boolean zE = this.f12873f.e(i10, i11, intent);
            if (eVarY != null) {
                eVarY.close();
            }
            return zE;
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void p() {
        if (!u()) {
            cc.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        e eVarY = e.y("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator<oc.a> it = this.f12875h.values().iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f12876i = null;
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean q(Class<? extends jc.a> cls) {
        return this.f12868a.containsKey(cls);
    }

    public void v(Class<? extends jc.a> cls) {
        jc.a aVar = this.f12868a.get(cls);
        if (aVar == null) {
            return;
        }
        e eVarY = e.y("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (aVar instanceof kc.a) {
                if (r()) {
                    ((kc.a) aVar).onDetachedFromActivity();
                }
                this.f12871d.remove(cls);
            }
            if (aVar instanceof oc.a) {
                if (u()) {
                    ((oc.a) aVar).b();
                }
                this.f12875h.remove(cls);
            }
            if (aVar instanceof lc.a) {
                if (s()) {
                    ((lc.a) aVar).b();
                }
                this.f12877j.remove(cls);
            }
            if (aVar instanceof mc.a) {
                if (t()) {
                    ((mc.a) aVar).a();
                }
                this.f12879l.remove(cls);
            }
            aVar.onDetachedFromEngine(this.f12870c);
            this.f12868a.remove(cls);
            if (eVarY != null) {
                eVarY.close();
            }
        } catch (Throwable th) {
            if (eVarY != null) {
                try {
                    eVarY.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void w(Set<Class<? extends jc.a>> set) {
        Iterator<Class<? extends jc.a>> it = set.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public void x() {
        w(new HashSet(this.f12868a.keySet()));
        this.f12868a.clear();
    }
}
