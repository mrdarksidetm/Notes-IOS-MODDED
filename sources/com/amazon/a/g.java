package com.amazon.a;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g implements com.amazon.a.a.k.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final String f7576a = "ActivityName";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f7577b = "EventName";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String f7578c = "Timestamp";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7579d = new com.amazon.a.a.o.c("Kiwi");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static g f7580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f7581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f7582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.l.b f7583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.c.f f7584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f7585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f7586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f7587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f7588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b f7589n;

    private g(Application application, boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f7581f = z10;
        if (com.amazon.a.a.o.c.f7483a) {
            com.amazon.a.a.o.c cVar = f7579d;
            cVar.a("Starting initialization process for application: " + application.getPackageName());
            cVar.a("DRM enabled: " + z10);
        }
        a(application);
        if (com.amazon.a.a.o.c.f7483a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f7579d.a("Kiwi.Constructor Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    public static Dialog a(Activity activity, int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onCreateDialog", activity)) {
            return f7580e.f7586k.a(activity, i10);
        }
        if (!com.amazon.a.a.o.c.f7483a) {
            return null;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        f7579d.a("Kiwi.ActivityOnCreateDialog Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        return null;
    }

    public static com.amazon.a.a.i.e a() {
        return f7580e.f7586k;
    }

    public static void a(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onResume", activity)) {
            f7580e.f7582g.c(activity);
        }
        if (com.amazon.a.a.o.c.f7483a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f7579d.a("Kiwi.ActivityOnResume Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    public static void a(Activity activity, boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!c()) {
            f7580e = new g(activity.getApplication(), z10);
        }
        if (a("onCreate", activity)) {
            f7580e.f7582g.a(activity);
        }
        if (com.amazon.a.a.o.c.f7483a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f7579d.a("Kiwi.ActivityOnCreate Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    private void a(Application application) {
        com.amazon.a.a.k.c cVar = new com.amazon.a.a.k.c();
        cVar.a(application);
        cVar.a(new com.amazon.a.a.n.d());
        cVar.a(new com.amazon.a.a.m.c());
        cVar.a(new com.amazon.a.a.l.c());
        cVar.a(new com.amazon.a.a.a.b());
        cVar.a(new com.amazon.a.a.i.f());
        cVar.a(new com.amazon.a.a.c.g());
        cVar.a(new com.amazon.a.a.b.b());
        cVar.a(new com.amazon.a.a.h.d());
        cVar.a(new com.amazon.a.a.n.a.d());
        cVar.a(new com.amazon.a.a.o.b.c());
        cVar.a(new com.amazon.a.a.n.a.b());
        cVar.a();
        cVar.b(this);
    }

    public static void a(Service service) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onDestroy", service)) {
            f7580e.f7582g.b(service);
        }
        if (com.amazon.a.a.o.c.f7483a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f7579d.a("Kiwi.ServiceOnDestroy Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    public static void a(Service service, boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onCreate", service)) {
            f7580e.f7582g.a(service);
        }
        if (com.amazon.a.a.o.c.f7483a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f7579d.a("Kiwi.ServiceOnCreate Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    @Deprecated
    public static void a(com.amazon.a.a.n.a.a aVar) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7579d.a("WARNING: Use of deprecated method detected.");
        }
        if (c()) {
            c(aVar);
        } else {
            f7579d.b("Kiwi subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static void a(com.amazon.a.a.n.a.a aVar, Context context) {
        if (!c()) {
            if (context == null || context.getApplicationContext() == null) {
                f7579d.b("Kiwi subsystem cannot be initialized because of null context. Unable to enqueue task.");
                return;
            }
            f7580e = new g((Application) context.getApplicationContext(), false);
        }
        c(aVar);
    }

    public static boolean a(Activity activity, int i10, int i11, Intent intent) {
        if (!a("onActivityResult", activity)) {
            return false;
        }
        return f7580e.f7583h.a(new com.amazon.a.a.l.a(activity, i10, i11, intent));
    }

    private static boolean a(String str, Context context) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f7483a) {
            f7579d.a(str + ": " + context);
        }
        if (c()) {
            return true;
        }
        b(str, context);
        return false;
    }

    public static boolean a(String str, String str2) {
        if (!c()) {
            f7579d.a("Kiwi was not yet initialized - cannot do the IAP call");
            return false;
        }
        try {
            return com.amazon.a.a.o.b.e.a(str, str2, f7580e.f7589n.a());
        } catch (com.amazon.a.a.o.b.a.a e10) {
            f7579d.a("Unable to validate signature: " + e10.getMessage());
            return false;
        }
    }

    public static void b(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onPause", activity)) {
            f7580e.f7582g.d(activity);
        }
        if (com.amazon.a.a.o.c.f7483a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f7579d.a("Kiwi.ActivityOnPause Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    public static void b(Activity activity, boolean z10) {
        if (a("onWindowFocusChanged", activity)) {
            f7580e.f7586k.a(activity, z10);
        }
    }

    private static void b(String str, Context context) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7579d.a(str + " called on context: " + context + " when Kiwi is dead, ignoring...");
        }
    }

    public static void c(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onDestroy", activity)) {
            try {
                f7580e.f7582g.b(activity);
            } catch (Exception e10) {
                f7579d.b("Kiwi.ActivityOnDestroy Error: ", e10);
            }
        }
        if (com.amazon.a.a.o.c.f7483a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f7579d.a("Kiwi.ActivityOnDestroy Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(com.amazon.a.a.n.a.a aVar) {
        f7580e.f7585j.a(com.amazon.a.a.n.b.d.COMMAND, aVar);
    }

    private static boolean c() {
        return f7580e != null;
    }

    private void d() {
        this.f7584i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.g.1
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.PAUSE;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap map = new HashMap();
                map.put(g.f7577b, com.amazon.a.a.a.a.b.PAUSE.name());
                map.put(g.f7576a, aVar.b().getClass().getName());
                map.put(g.f7578c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(map);
                if (com.amazon.a.a.o.c.f7483a) {
                    g.f7579d.a("Adding lifecycle PAUSE command to pipeline");
                }
                g.c(bVar);
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }
        });
    }

    public static void d(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onStart", activity)) {
            f7580e.f7582g.e(activity);
        }
        if (com.amazon.a.a.o.c.f7483a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f7579d.a("Kiwi.ActivityOnStart Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    public static void e(Activity activity) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a("onStop", activity)) {
            f7580e.f7582g.f(activity);
        }
        if (com.amazon.a.a.o.c.f7483a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f7579d.a("Kiwi.ActivityOnStop Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    private void f() {
        this.f7584i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.g.2
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap map = new HashMap();
                map.put(g.f7577b, com.amazon.a.a.a.a.b.RESUME.name());
                map.put(g.f7576a, aVar.b().getClass().getName());
                map.put(g.f7578c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(map);
                if (com.amazon.a.a.o.c.f7483a) {
                    g.f7579d.a("Adding lifecycle RESUME command to pipeline");
                }
                g.c(bVar);
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }
        });
    }

    private void g() {
        this.f7584i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.g.3
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.CREATE;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                g.this.h();
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (com.amazon.a.a.o.c.f7483a) {
            f7579d.a("Enqueuing launch workflow");
        }
        this.f7585j.a(com.amazon.a.a.n.b.d.COMMAND, i());
    }

    private com.amazon.a.a.n.a i() {
        return this.f7581f ? new f() : new e();
    }

    private void j() {
        this.f7584i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.g.4
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                if (com.amazon.a.a.o.c.f7483a) {
                    g.f7579d.a("Beginning shutdown process for application: " + g.this.f7588m.getPackageName());
                }
                g unused = g.f7580e = null;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }
        });
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        g();
        j();
        d();
        f();
    }
}
