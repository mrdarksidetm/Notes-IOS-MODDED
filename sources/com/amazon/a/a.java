package com.amazon.a;

import android.app.Application;
import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.amazon.a.a.k.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final String f7026a = "ActivityName";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f7027b = "EventName";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String f7028c = "Timestamp";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7029d = new com.amazon.a.a.o.c("AppstoreSDK");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.amazon.a.a.g.c f7030e = new com.amazon.a.a.g.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f7031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f7032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.l.b f7033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.c.f f7034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f7035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f7036k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f7037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f7038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b f7039n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.g.c f7040o;

    private a(Application application) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.amazon.a.a.o.c.f7483a) {
            f7029d.a("Starting initialization process for application: " + application.getPackageName());
        }
        b(application);
        if (com.amazon.a.a.o.c.f7483a) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            f7029d.a("AppstoreSDK.Constructor Time: " + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        }
    }

    public static com.amazon.a.a.i.e a() {
        if (d()) {
            return f7031f.f7036k;
        }
        f7029d.b("Appstore SDK is not initialized. Cannot get PromptManager returning null");
        return null;
    }

    private static String a(String str) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{com.amazon.a.a.o.b.as, str}).getInputStream()));
                try {
                    String line = bufferedReader2.readLine();
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused) {
                        f7029d.b("Unable to close BufferedReader instance");
                    }
                    return line;
                } catch (IOException e10) {
                    e = e10;
                    bufferedReader = bufferedReader2;
                    f7029d.a("Can't get system property", e);
                    if (bufferedReader == null) {
                        return "";
                    }
                    try {
                        bufferedReader.close();
                        return "";
                    } catch (Exception unused2) {
                        f7029d.b("Unable to close BufferedReader instance");
                        return "";
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused3) {
                            f7029d.b("Unable to close BufferedReader instance");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public static void a(Context context) {
        if (d()) {
            return;
        }
        synchronized (a.class) {
            if (!d()) {
                Application application = (Application) context.getApplicationContext();
                f7031f = new a(application);
                application.registerActivityLifecycleCallbacks(com.amazon.a.a.f.a.a());
            }
        }
    }

    @Deprecated
    public static void a(com.amazon.a.a.n.a.a aVar) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7029d.a("WARNING: Use of deprecated method detected.");
        }
        if (d()) {
            c(aVar);
        } else {
            f7029d.b("AppstoreSDK subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static void a(com.amazon.a.a.n.a.a aVar, Context context) {
        if (!d()) {
            if (context == null || context.getApplicationContext() == null) {
                f7029d.b("AppstoreSDK subsystem cannot be initialized because of null context. Unable to enqueue task.");
                return;
            }
            f7031f = new a((Application) context.getApplicationContext());
        }
        c(aVar);
    }

    public static boolean a(Application application) throws Throwable {
        boolean z10 = (application.getApplicationInfo().flags & 2) != 0;
        boolean zL = l();
        if (z10 && zL) {
            f7029d.a("Sandbox Mode: Debug build and debug.amazon.sandboxmode property is set on device");
            return true;
        }
        f7029d.a("Production Mode: Release build or debug.amazon.sandboxmode property is not set on device");
        return false;
    }

    public static boolean a(String str, Context context) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f7483a) {
            f7029d.a(str + ": " + context);
        }
        if (d()) {
            return true;
        }
        b(str, context);
        return false;
    }

    public static boolean a(String str, String str2) {
        if (!d()) {
            f7029d.a("AppstoreSDK was not yet initialized - cannot do the IAP call");
            return false;
        }
        try {
            return com.amazon.a.a.o.b.e.a(str, str2, f7031f.f7039n.a());
        } catch (com.amazon.a.a.o.b.a.a e10) {
            f7029d.a("Unable to validate signature: " + e10.getMessage());
            return false;
        }
    }

    public static com.amazon.a.a.a.a b() {
        if (d()) {
            return f7031f.f7032g;
        }
        f7029d.b("Appstore SDK is not initialized. Cannot get ContextManager returning null");
        return null;
    }

    private void b(Application application) {
        com.amazon.a.a.k.c cVar = new com.amazon.a.a.k.c();
        cVar.a(application);
        cVar.a(new com.amazon.a.a.n.d());
        cVar.a(new com.amazon.a.a.m.c());
        cVar.a(new com.amazon.a.a.l.c());
        cVar.a(new com.amazon.a.a.a.c());
        cVar.a(new com.amazon.a.a.i.f());
        cVar.a(new com.amazon.a.a.c.g());
        cVar.a(new com.amazon.a.a.b.b());
        cVar.a(new com.amazon.a.a.h.d());
        cVar.a(new com.amazon.a.a.n.a.d());
        cVar.a(new com.amazon.a.a.o.b.d());
        cVar.a(new com.amazon.a.a.n.a.b());
        cVar.a(a(application) ? new com.amazon.a.a.g.d() : new com.amazon.a.a.g.b());
        cVar.a();
        cVar.b(this);
    }

    private static void b(String str, Context context) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7029d.a(str + " called on context: " + context + " when AppstoreSDK is dead, ignoring...");
        }
    }

    public static com.amazon.a.a.g.c c() {
        if (d()) {
            return f7031f.f7040o;
        }
        f7029d.a("Appstore SDK is not initialized. Returning default log handler");
        return f7030e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(com.amazon.a.a.n.a.a aVar) {
        if (d()) {
            f7031f.f7035j.a(com.amazon.a.a.n.b.d.COMMAND, aVar);
        } else {
            f7029d.b("AppstoreSDK subsystem is not fully initialized.  Cannot process task.");
        }
    }

    public static boolean d() {
        return f7031f != null;
    }

    private static boolean l() throws Throwable {
        String strA;
        try {
            strA = (String) Class.forName(com.amazon.a.a.o.b.at).getMethod(com.amazon.a.a.o.b.au, String.class).invoke(null, com.amazon.a.a.o.b.aq);
        } catch (Throwable unused) {
            f7029d.b("Unable to retrieve Sandbox property through reflection, using getProp");
            strA = a(com.amazon.a.a.o.b.aq);
        }
        return com.amazon.a.a.o.b.ar.equals(strA);
    }

    private com.amazon.a.a.n.a m() {
        return new e();
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        h();
        j();
        f();
        g();
    }

    public void f() {
        this.f7034i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.1
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.PAUSE;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap map = new HashMap();
                map.put(a.f7027b, com.amazon.a.a.a.a.b.PAUSE.name());
                map.put(a.f7026a, aVar.b().getClass().getName());
                map.put(a.f7028c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(map);
                if (com.amazon.a.a.o.c.f7483a) {
                    a.f7029d.a("Adding lifecycle PAUSE command to pipeline");
                }
                a.c(bVar);
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }
        });
    }

    public void g() {
        this.f7034i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.a>() { // from class: com.amazon.a.a.2
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.b.RESUME;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.a aVar) {
                HashMap map = new HashMap();
                map.put(a.f7027b, com.amazon.a.a.a.a.b.RESUME.name());
                map.put(a.f7026a, aVar.b().getClass().getName());
                map.put(a.f7028c, Long.valueOf(System.currentTimeMillis()));
                com.amazon.a.a.f.b bVar = new com.amazon.a.a.f.b(map);
                if (com.amazon.a.a.o.c.f7483a) {
                    a.f7029d.a("Adding lifecycle RESUME command to pipeline");
                }
                a.c(bVar);
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.MIDDLE;
            }
        });
    }

    public void h() {
        this.f7034i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.a.3
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.CREATE;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                a.this.i();
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }
        });
    }

    public void i() {
        if (com.amazon.a.a.o.c.f7483a) {
            f7029d.a("Enqueuing launch workflow");
        }
        if (a(this.f7038m)) {
            return;
        }
        this.f7035j.a(com.amazon.a.a.n.b.d.COMMAND, m());
    }

    public void j() {
        this.f7034i.a(new com.amazon.a.a.c.c<com.amazon.a.a.a.a.c>() { // from class: com.amazon.a.a.4
            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.b a() {
                return com.amazon.a.a.a.a.d.DESTROY;
            }

            @Override // com.amazon.a.a.c.c
            public void a(com.amazon.a.a.a.a.c cVar) {
                if (com.amazon.a.a.o.c.f7483a) {
                    a.f7029d.a("Beginning shutdown process for application: " + a.this.f7038m.getPackageName());
                }
                a unused = a.f7031f = null;
            }

            @Override // com.amazon.a.a.c.c
            public com.amazon.a.a.c.d b() {
                return com.amazon.a.a.c.d.LAST;
            }
        });
    }
}
