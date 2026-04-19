package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.p;

/* JADX INFO: loaded from: classes.dex */
public final class n implements o4.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f4358i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final n f4359j = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4361b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f4364e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4362c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4363d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f4365f = new j(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f4366g = new Runnable() { // from class: o4.j
        @Override // java.lang.Runnable
        public final void run() {
            androidx.lifecycle.n.i(this.f16347a);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p.a f4367h = new d();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4368a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            ae.r.f(activity, "activity");
            ae.r.f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }

        public final o4.e a() {
            return n.f4359j;
        }

        public final void b(Context context) {
            ae.r.f(context, "context");
            n.f4359j.h(context);
        }
    }

    public static final class c extends o4.c {

        public static final class a extends o4.c {
            final /* synthetic */ n this$0;

            a(n nVar) {
                this.this$0 = nVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                ae.r.f(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                ae.r.f(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // o4.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ae.r.f(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                p.f4372b.b(activity).e(n.this.f4367h);
            }
        }

        @Override // o4.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ae.r.f(activity, "activity");
            n.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            ae.r.f(activity, "activity");
            a.a(activity, new a(n.this));
        }

        @Override // o4.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ae.r.f(activity, "activity");
            n.this.g();
        }
    }

    public static final class d implements p.a {
        d() {
        }

        @Override // androidx.lifecycle.p.a
        public void a() {
            n.this.f();
        }

        @Override // androidx.lifecycle.p.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.p.a
        public void onResume() {
            n.this.e();
        }
    }

    private n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(n nVar) {
        ae.r.f(nVar, "this$0");
        nVar.j();
        nVar.k();
    }

    public static final o4.e l() {
        return f4358i.a();
    }

    public final void d() {
        int i10 = this.f4361b - 1;
        this.f4361b = i10;
        if (i10 == 0) {
            Handler handler = this.f4364e;
            ae.r.c(handler);
            handler.postDelayed(this.f4366g, 700L);
        }
    }

    public final void e() {
        int i10 = this.f4361b + 1;
        this.f4361b = i10;
        if (i10 == 1) {
            if (this.f4362c) {
                this.f4365f.h(g.a.ON_RESUME);
                this.f4362c = false;
            } else {
                Handler handler = this.f4364e;
                ae.r.c(handler);
                handler.removeCallbacks(this.f4366g);
            }
        }
    }

    public final void f() {
        int i10 = this.f4360a + 1;
        this.f4360a = i10;
        if (i10 == 1 && this.f4363d) {
            this.f4365f.h(g.a.ON_START);
            this.f4363d = false;
        }
    }

    public final void g() {
        this.f4360a--;
        k();
    }

    @Override // o4.e
    public g getLifecycle() {
        return this.f4365f;
    }

    public final void h(Context context) {
        ae.r.f(context, "context");
        this.f4364e = new Handler();
        this.f4365f.h(g.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        ae.r.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f4361b == 0) {
            this.f4362c = true;
            this.f4365f.h(g.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f4360a == 0 && this.f4362c) {
            this.f4365f.h(g.a.ON_STOP);
            this.f4363d = true;
        }
    }
}
