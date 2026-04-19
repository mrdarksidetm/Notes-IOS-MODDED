package com.amazon.a.a.n.a;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import com.amazon.d.a.d;
import com.amazon.d.a.e;
import com.amazon.d.a.i;
import com.amazon.d.a.j;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7315a = new com.amazon.a.a.o.c("CommandServiceClient");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7316b = "com.amazon.venezia.service.command.CommandServiceImpl";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7317c = "com.amazon.venezia.CommandService";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.amazon.d.a.d f7318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f7319e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f7322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private b f7323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f7324j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue<c> f7320f = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final BlockingQueue<com.amazon.d.a.d> f7321g = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ServiceConnection f7325k = new ServiceConnection() { // from class: com.amazon.a.a.n.a.d.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.f7315a.a("onServiceConnected");
            d.this.f7321g.add(d.a.a(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d.f7315a.a("onServiceDisconnected!!!");
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.amazon.d.a.i f7326l = new i.a() { // from class: com.amazon.a.a.n.a.d.2
        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.f fVar) {
            d.this.f7320f.add(new c(fVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.g gVar) {
            d.this.f7320f.add(new c(gVar));
        }

        @Override // com.amazon.d.a.i
        public void a(com.amazon.d.a.h hVar) {
            d.this.f7320f.add(new c(hVar));
        }

        @Override // com.amazon.d.a.i
        public void a(j jVar) {
            d.this.f7320f.add(new c(jVar));
        }
    };

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f7332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f7333c;

        a() {
        }
    }

    private Intent a(Intent intent) throws com.amazon.a.a.n.a.a.c {
        if (this.f7319e != null) {
            f7315a.a("Using previously determined package " + this.f7319e);
            return a(this.f7319e);
        }
        com.amazon.a.a.o.c cVar = f7315a;
        cVar.a("No previously determined package found, checking for suitable package.");
        Intent intentA = a(this.f7322h.getPackageManager().queryIntentServices(intent, 64));
        if (intentA != null) {
            return intentA;
        }
        cVar.a("No app with valid signature was providing our service.");
        throw new com.amazon.a.a.n.a.a.c();
    }

    private Intent a(String str) {
        Intent intent = new Intent();
        intent.setAction(f7317c);
        intent.setClassName(str, f7316b);
        return intent;
    }

    private Intent a(List<ResolveInfo> list) {
        int i10 = 0;
        String str = null;
        while (true) {
            try {
                if (i10 >= list.size()) {
                    i10 = -1;
                    break;
                }
                ResolveInfo resolveInfo = list.get(i10);
                String str2 = resolveInfo.serviceInfo.applicationInfo.packageName;
                com.amazon.a.a.o.c cVar = f7315a;
                cVar.a("Examining package " + str2);
                cVar.a("Priority is " + resolveInfo.filter.getPriority());
                cVar.a("Checking signature of package " + str2);
                if (b(str2)) {
                    cVar.a("Signature of package " + str2 + " is okay");
                    str = str2;
                    break;
                }
                cVar.a("Signature of package " + str2 + " is bad");
                i10++;
                str = str2;
            } catch (Exception e10) {
                f7315a.a("Caught exception " + e10);
            }
        }
        if (i10 > -1) {
            return a(str);
        }
        return null;
    }

    static void a(com.amazon.a.a.d.b bVar, a aVar) {
        com.amazon.a.a.o.c cVar = f7315a;
        cVar.b("CommandServiceException happened, retriesLeft=" + aVar.f7331a, bVar);
        int i10 = aVar.f7331a;
        if (i10 == 0) {
            aVar.f7332b = false;
            return;
        }
        aVar.f7331a = i10 - 1;
        aVar.f7332b = true;
        try {
            cVar.a("Sleeping for " + aVar.f7333c + " ms");
            Thread.sleep(aVar.f7333c);
        } catch (InterruptedException unused) {
            aVar.f7332b = false;
        }
        aVar.f7333c *= 2;
    }

    private boolean a(Context context, Intent intent) {
        return context.getPackageManager().resolveService(intent, 64) != null;
    }

    private c b(com.amazon.d.a.c cVar) {
        this.f7324j.a(com.amazon.a.a.m.c.f7280g, cVar.b());
        this.f7318d.a(cVar, this.f7326l);
        return g();
    }

    private boolean b(String str) {
        f7315a.a("isPackageSignatureTrusted " + str);
        return this.f7323i.a(str, i.f7382a);
    }

    private boolean d() {
        return this.f7318d != null;
    }

    private void e() throws com.amazon.a.a.n.a.a.c, com.amazon.a.a.n.a.a.b {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.amazon.a.a.o.c cVar = f7315a;
        cVar.a("Binding Service!!!");
        Intent intentF = f();
        if (!a(this.f7322h, intentF)) {
            throw new com.amazon.a.a.n.a.a.c();
        }
        cVar.a("Found service on one or more packages");
        Intent intentA = a(intentF);
        String packageName = intentA.getComponent().getPackageName();
        cVar.a("Attempting to bind to service on " + packageName);
        if (!this.f7322h.bindService(intentA, this.f7325k, 1)) {
            throw new com.amazon.a.a.n.a.a.b();
        }
        try {
            cVar.a("Blocking while service is being bound!!");
            this.f7318d = this.f7321g.take();
            cVar.a("service bound, returning!!");
            if (com.amazon.a.a.o.c.f7483a) {
                cVar.a("Kiwi.BindService Time: " + (System.currentTimeMillis() - jCurrentTimeMillis));
            }
            this.f7324j.a(com.amazon.a.a.m.c.f7279f, packageName);
            this.f7319e = packageName;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new com.amazon.a.a.n.a.a.b();
        }
    }

    private Intent f() {
        Intent intent = new Intent();
        intent.setAction(f7317c);
        f7315a.a("Created intent with  action  com.amazon.venezia.CommandService");
        return intent;
    }

    private c g() {
        try {
            com.amazon.a.a.o.c cVar = f7315a;
            cVar.a("Blocking for result from service");
            c cVarTake = this.f7320f.take();
            cVar.a("Received result from service");
            return cVarTake;
        } catch (InterruptedException unused) {
            f7315a.a("TaskThread interrupted, returning null result");
            return null;
        }
    }

    public c a(com.amazon.d.a.a aVar) {
        aVar.a(null);
        return g();
    }

    public c a(com.amazon.d.a.c cVar) throws com.amazon.a.a.n.a.a.c, com.amazon.a.a.n.a.a.b {
        a aVar = new a();
        aVar.f7331a = 6;
        aVar.f7333c = 100L;
        while (true) {
            try {
                if (!d()) {
                    e();
                }
                return b(cVar);
            } catch (com.amazon.a.a.n.a.a.b e10) {
                a(e10, aVar);
                if (!aVar.f7332b) {
                    throw e10;
                }
            } catch (com.amazon.a.a.n.a.a.c e11) {
                a(e11, aVar);
                if (!aVar.f7332b) {
                    throw e11;
                }
            }
        }
    }

    public c a(com.amazon.d.a.f fVar, final e eVar) {
        fVar.a(new e.a() { // from class: com.amazon.a.a.n.a.d.3
            @Override // com.amazon.d.a.e
            public String a() {
                return eVar.name();
            }

            @Override // com.amazon.d.a.e
            public Map b() {
                return null;
            }
        });
        return g();
    }

    public String a() {
        return this.f7319e;
    }

    public void b() {
        com.amazon.a.a.o.c cVar = f7315a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Finishing CommandServiceClient, unbinding service: ");
        sb2.append(this.f7318d != null);
        cVar.a(sb2.toString());
        if (this.f7318d != null) {
            this.f7322h.unbindService(this.f7325k);
            this.f7318d = null;
        }
    }
}
