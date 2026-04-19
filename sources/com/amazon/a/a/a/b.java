package com.amazon.a.a.a;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.a.a.c.f;
import com.amazon.a.a.k.d;
import com.amazon.a.a.o.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.o.c f7061a = new com.amazon.a.a.o.c("ContextManagerImplV2");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f7069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f7070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private f f7071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f7072l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<Activity> f7062b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Activity> f7063c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g<Service> f7064d = new g<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g<Activity> f7065e = new g<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f7066f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f7067g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f7068h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f7073m = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7061a.a("Received broadcast intent: " + intent);
        }
        if (!intent.getAction().equals(this.f7072l)) {
            if (com.amazon.a.a.o.c.f7484b) {
                f7061a.b("Received broadcast for unrequested action: " + intent.getAction());
                return;
            }
            return;
        }
        if (!this.f7067g.get()) {
            if (com.amazon.a.a.o.c.f7484b) {
                f7061a.b("Received intent to shutdown app when we are not in shutdown state: " + intent);
                return;
            }
            return;
        }
        if (!this.f7068h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f7483a) {
                f7061a.a("shutdown broadcast already received, ignoring");
                return;
            }
            return;
        }
        if (com.amazon.a.a.o.c.f7483a) {
            com.amazon.a.a.o.c cVar = f7061a;
            cVar.a("Stopping services in response to broadcast");
            cVar.a("Service to stop: " + this.f7064d.b());
        }
        Iterator<Service> it = this.f7064d.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    private void a(com.amazon.a.a.a.a.b bVar, Activity activity) {
        this.f7071k.a(new com.amazon.a.a.a.a.a(bVar, activity));
    }

    private void a(com.amazon.a.a.a.a.d dVar) {
        this.f7071k.a(new com.amazon.a.a.a.a.c(dVar, this.f7069i));
    }

    private void c(Service service) {
        if (service == null) {
            return;
        }
        if (com.amazon.a.a.o.c.f7483a) {
            f7061a.a("Stopping service: " + service);
        }
        service.stopSelf();
    }

    private boolean g(Activity activity) {
        if (activity == null) {
            return false;
        }
        return activity.isTaskRoot();
    }

    private boolean h(Activity activity) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7061a.a("Checking if application is destroyed");
        }
        if (!this.f7063c.isEmpty()) {
            return false;
        }
        f7061a.a("App is destroyed: " + activity.isTaskRoot() + ", " + activity.isFinishing());
        return activity.isTaskRoot() && activity.isFinishing();
    }

    private Activity i(Activity activity) {
        while (activity.isChild()) {
            activity = activity.getParent();
        }
        return activity;
    }

    private boolean i() {
        return !this.f7073m && this.f7063c.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (com.amazon.a.a.o.c.f7483a) {
            com.amazon.a.a.o.c cVar = f7061a;
            cVar.a("----------- EXECUTING FINISH ACTIVITIES -----------");
            cVar.a(this.f7069i.getPackageName());
            cVar.a("---------------------------------------------------");
        }
        k();
        l();
        m();
    }

    private void j(Activity activity) {
        if (activity == null) {
            return;
        }
        if (!activity.isChild()) {
            f7061a.a("Finishing Activity: " + activity);
            activity.finish();
            return;
        }
        f7061a.a("Not finishing activity: " + activity + ", it is a child of: " + activity.getParent());
    }

    private void k() {
        Activity activityA = a();
        for (Activity activity : this.f7063c) {
            if (!activity.equals(activityA)) {
                j(activity);
            }
        }
    }

    private void l() {
        Activity activityA = a();
        if (activityA == null) {
            f7061a.a("Shutdown found no root, no activities to pop off stack!");
            return;
        }
        com.amazon.a.a.o.c cVar = f7061a;
        cVar.a("Moving task to background");
        activityA.moveTaskToBack(true);
        cVar.a("Popping activity stack, root: " + activityA);
        Intent intent = new Intent(activityA, activityA.getClass());
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        activityA.startActivity(intent);
    }

    private void m() {
        this.f7070j.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.a.b.2
            @Override // com.amazon.a.a.n.a
            public void a() {
                Activity activityA = b.this.a();
                com.amazon.a.a.o.c cVar = b.f7061a;
                cVar.a("Finishing Root Task: " + activityA);
                if (activityA != null) {
                    cVar.a("Finishing Root");
                    activityA.finish();
                }
            }

            public String toString() {
                return "ContextManager: kill root task";
            }
        });
    }

    @Override // com.amazon.a.a.a.a
    public Activity a() {
        com.amazon.a.a.o.a.a.a();
        for (int size = this.f7063c.size() - 1; size >= 0; size--) {
            Activity activity = this.f7063c.get(size);
            if (g(activity)) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.amazon.a.a.a.a
    public void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f7063c.add(activity);
        if (com.amazon.a.a.o.c.f7483a) {
            f7061a.a("Activity->onCreate.  Activity: " + activity + ", Total Activities: " + this.f7063c.size());
        }
        a(com.amazon.a.a.a.a.b.CREATE, activity);
        if (i()) {
            this.f7073m = true;
            a(com.amazon.a.a.a.a.d.CREATE);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void a(Service service) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f7483a) {
            f7061a.a("Service->onCreate: " + service);
        }
        this.f7064d.a(service);
    }

    @Override // com.amazon.a.a.a.a
    public Activity b() {
        com.amazon.a.a.o.a.a.a();
        return this.f7062b.get();
    }

    @Override // com.amazon.a.a.a.a
    public void b(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        this.f7063c.remove(activity);
        if (com.amazon.a.a.o.c.f7483a) {
            f7061a.a("Activity->onDestroy.  Activity: " + activity + ", Total Activities: " + this.f7063c.size());
        }
        a(com.amazon.a.a.a.a.b.DESTROY, activity);
        if (h(activity)) {
            this.f7073m = false;
            a(com.amazon.a.a.a.a.d.DESTROY);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void b(Service service) {
        com.amazon.a.a.o.a.a.a();
        this.f7064d.b(service);
    }

    @Override // com.amazon.a.a.a.a
    public void c(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        com.amazon.a.a.o.c cVar = f7061a;
        cVar.a("Activity resumed: " + activity + ", is child: " + activity.isChild());
        Activity activityI = i(activity);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Setting visible to: ");
        sb2.append(activityI);
        cVar.a(sb2.toString());
        this.f7062b.set(activityI);
        if (com.amazon.a.a.o.c.f7483a) {
            cVar.a("Activity now visible: " + activity + ", publishing resume event");
        }
        a(com.amazon.a.a.a.a.b.RESUME, activity);
    }

    @Override // com.amazon.a.a.a.a
    public boolean c() {
        return this.f7062b.get() != null;
    }

    @Override // com.amazon.a.a.a.a
    public void d(Activity activity) {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f7483a) {
            f7061a.a("Activity paused: " + activity + ", visible activity: " + b());
        }
        if (b() == activity) {
            if (com.amazon.a.a.o.c.f7483a) {
                f7061a.a("Setting visible activity to null");
            }
            this.f7062b.set(null);
            a(com.amazon.a.a.a.a.b.PAUSE, activity);
        }
    }

    @Override // com.amazon.a.a.a.a
    public boolean d() {
        return this.f7067g.get() || this.f7066f.get();
    }

    @Override // com.amazon.a.a.k.d
    public void e() {
        this.f7072l = "com.amazon." + this.f7069i.getPackageName() + ".shutdown";
        this.f7069i.registerReceiver(new BroadcastReceiver() { // from class: com.amazon.a.a.a.b.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                b.this.a(intent);
            }
        }, new IntentFilter(this.f7072l));
    }

    @Override // com.amazon.a.a.a.a
    public void e(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        f7061a.a("Activity started: " + activity);
        this.f7065e.a(activity);
        a(com.amazon.a.a.a.a.b.START, activity);
        if (this.f7065e.b() == 1) {
            a(com.amazon.a.a.a.a.d.START);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void f() {
        if (this.f7066f.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f7483a) {
                com.amazon.a.a.o.c cVar = f7061a;
                cVar.a("---------- SCHEDULING FINISH ACTIVITIES -----------");
                cVar.a(this.f7069i.getPackageName());
                cVar.a(Thread.currentThread().toString());
                cVar.a("---------------------------------------------------");
            }
            this.f7070j.a(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.a.b.1
                @Override // com.amazon.a.a.n.a
                public void a() {
                    b.this.j();
                }

                public String toString() {
                    return "ContextManager: init app shutdown on main thread";
                }
            });
        }
    }

    @Override // com.amazon.a.a.a.a
    public void f(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        f7061a.a("Activity stopped: " + activity);
        this.f7065e.b(activity);
        a(com.amazon.a.a.a.a.b.STOP, activity);
        if (this.f7065e.a()) {
            a(com.amazon.a.a.a.a.d.STOP);
        }
    }

    @Override // com.amazon.a.a.a.a
    public void g() {
        if (!this.f7067g.compareAndSet(false, true) && com.amazon.a.a.o.c.f7483a) {
            f7061a.a("Ignoring duplicate stopServices request");
        }
        if (com.amazon.a.a.o.c.f7483a) {
            com.amazon.a.a.o.c cVar = f7061a;
            cVar.a("------------- STOPPING SERVICES -------------------");
            cVar.a(this.f7069i.getPackageName());
            cVar.a("---------------------------------------------------");
        }
        Intent intent = new Intent(this.f7072l);
        intent.setPackage(this.f7069i.getPackageName());
        if (com.amazon.a.a.o.c.f7483a) {
            f7061a.a("Sending Broadcast!!!!: " + intent + ", Thread: " + Thread.currentThread());
        }
        this.f7069i.sendBroadcast(intent);
    }

    @Override // com.amazon.a.a.a.a
    public boolean h() {
        com.amazon.a.a.o.a.a.a("Method isContextAware() is not used for Kiwi's ContextManagerImplV2");
        return false;
    }
}
