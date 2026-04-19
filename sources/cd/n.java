package cd;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import cd.l;
import cd.q;
import java.util.List;
import jc.a;

/* JADX INFO: loaded from: classes2.dex */
public class n implements jc.a, kc.a, q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.b f6851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    b f6852b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f6854b;

        static {
            int[] iArr = new int[q.m.values().length];
            f6854b = iArr;
            try {
                iArr[q.m.GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6854b[q.m.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[q.k.values().length];
            f6853a = iArr2;
            try {
                iArr2[q.k.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6853a[q.k.REAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Application f6855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f6856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l f6857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f6858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private kc.c f6859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private sc.b f6860f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.lifecycle.g f6861g;

        b(Application application, Activity activity, sc.b bVar, q.f fVar, kc.c cVar) {
            this.f6855a = application;
            this.f6856b = activity;
            this.f6859e = cVar;
            this.f6860f = bVar;
            this.f6857c = n.this.p(activity);
            q.f.d(bVar, fVar);
            this.f6858d = n.this.new c(activity);
            cVar.b(this.f6857c);
            cVar.a(this.f6857c);
            androidx.lifecycle.g gVarA = nc.a.a(cVar);
            this.f6861g = gVarA;
            gVarA.a(this.f6858d);
        }

        Activity a() {
            return this.f6856b;
        }

        l b() {
            return this.f6857c;
        }

        void c() {
            kc.c cVar = this.f6859e;
            if (cVar != null) {
                cVar.d(this.f6857c);
                this.f6859e.c(this.f6857c);
                this.f6859e = null;
            }
            androidx.lifecycle.g gVar = this.f6861g;
            if (gVar != null) {
                gVar.c(this.f6858d);
                this.f6861g = null;
            }
            q.f.d(this.f6860f, null);
            Application application = this.f6855a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.f6858d);
                this.f6855a = null;
            }
            this.f6856b = null;
            this.f6858d = null;
            this.f6857c = null;
        }
    }

    private class c implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f6863a;

        c(Activity activity) {
            this.f6863a = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f6863a != activity || activity.getApplicationContext() == null) {
                return;
            }
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (this.f6863a == activity) {
                n.this.f6852b.b().V();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(o4.e eVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(o4.e eVar) {
            onActivityDestroyed(this.f6863a);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(o4.e eVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(o4.e eVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(o4.e eVar) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(o4.e eVar) {
            onActivityStopped(this.f6863a);
        }
    }

    private l q() {
        b bVar = this.f6852b;
        if (bVar == null || bVar.a() == null) {
            return null;
        }
        return this.f6852b.b();
    }

    private void r(l lVar, q.l lVar2) {
        q.k kVarB = lVar2.b();
        if (kVarB != null) {
            lVar.W(a.f6853a[kVarB.ordinal()] != 1 ? l.c.REAR : l.c.FRONT);
        }
    }

    private void s(sc.b bVar, Application application, Activity activity, kc.c cVar) {
        this.f6852b = new b(application, activity, bVar, this, cVar);
    }

    private void t() {
        b bVar = this.f6852b;
        if (bVar != null) {
            bVar.c();
            this.f6852b = null;
        }
    }

    @Override // cd.q.f
    public void c(q.l lVar, q.g gVar, q.e eVar, q.j<List<String>> jVar) {
        l lVarQ = q();
        if (lVarQ == null) {
            jVar.a(new q.d("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        r(lVarQ, lVar);
        if (eVar.b().booleanValue()) {
            lVarQ.l(gVar, eVar.d().booleanValue(), o.a(eVar), jVar);
            return;
        }
        int i10 = a.f6854b[lVar.c().ordinal()];
        if (i10 == 1) {
            lVarQ.j(gVar, eVar.d().booleanValue(), jVar);
        } else {
            if (i10 != 2) {
                return;
            }
            lVarQ.Y(gVar, jVar);
        }
    }

    @Override // cd.q.f
    public void f(q.h hVar, q.e eVar, q.j<List<String>> jVar) {
        l lVarQ = q();
        if (lVarQ == null) {
            jVar.a(new q.d("no_activity", "image_picker plugin requires a foreground activity.", null));
        } else {
            lVarQ.k(hVar, eVar, jVar);
        }
    }

    @Override // cd.q.f
    public q.b i() {
        l lVarQ = q();
        if (lVarQ != null) {
            return lVarQ.U();
        }
        throw new q.d("no_activity", "image_picker plugin requires a foreground activity.", null);
    }

    @Override // cd.q.f
    public void o(q.l lVar, q.n nVar, q.e eVar, q.j<List<String>> jVar) {
        l lVarQ = q();
        if (lVarQ == null) {
            jVar.a(new q.d("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        r(lVarQ, lVar);
        if (eVar.b().booleanValue()) {
            jVar.a(new RuntimeException("Multi-video selection is not implemented"));
            return;
        }
        int i10 = a.f6854b[lVar.c().ordinal()];
        if (i10 == 1) {
            lVarQ.m(nVar, eVar.d().booleanValue(), jVar);
        } else {
            if (i10 != 2) {
                return;
            }
            lVarQ.Z(nVar, jVar);
        }
    }

    @Override // kc.a
    public void onAttachedToActivity(kc.c cVar) {
        s(this.f6851a.b(), (Application) this.f6851a.a(), cVar.getActivity(), cVar);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        this.f6851a = bVar;
    }

    @Override // kc.a
    public void onDetachedFromActivity() {
        t();
    }

    @Override // kc.a
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f6851a = null;
    }

    @Override // kc.a
    public void onReattachedToActivityForConfigChanges(kc.c cVar) {
        onAttachedToActivity(cVar);
    }

    final l p(Activity activity) {
        return new l(activity, new p(activity, new cd.a()), new cd.c(activity));
    }
}
