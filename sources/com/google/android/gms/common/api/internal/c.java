package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class c implements Handler.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f8434p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Status f8435q = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f8436r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static c f8437s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w8.q f8440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w8.s f8441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f8442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t8.g f8443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w8.d0 f8444g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f8451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f8452o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f8438a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8439b = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicInteger f8445h = new AtomicInteger(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicInteger f8446i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f8447j = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private o f8448k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f8449l = new z.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f8450m = new z.b();

    private c(Context context, Looper looper, t8.g gVar) {
        this.f8452o = true;
        this.f8442e = context;
        zau zauVar = new zau(looper, this);
        this.f8451n = zauVar;
        this.f8443f = gVar;
        this.f8444g = new w8.d0(gVar);
        if (e9.g.a(context)) {
            this.f8452o = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f8436r) {
            c cVar = f8437s;
            if (cVar != null) {
                cVar.f8446i.incrementAndGet();
                Handler handler = cVar.f8451n;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status g(v8.b bVar, t8.b bVar2) {
        return new Status(bVar2, "API: " + bVar.b() + " is not available on this device. Connection failed with: " + String.valueOf(bVar2));
    }

    @ResultIgnorabilityUnspecified
    private final v h(com.google.android.gms.common.api.d dVar) {
        Map map = this.f8447j;
        v8.b apiKey = dVar.getApiKey();
        v vVar = (v) map.get(apiKey);
        if (vVar == null) {
            vVar = new v(this, dVar);
            this.f8447j.put(apiKey, vVar);
        }
        if (vVar.a()) {
            this.f8450m.add(apiKey);
        }
        vVar.F();
        return vVar;
    }

    private final w8.s i() {
        if (this.f8441d == null) {
            this.f8441d = w8.r.a(this.f8442e);
        }
        return this.f8441d;
    }

    private final void j() {
        w8.q qVar = this.f8440c;
        if (qVar != null) {
            if (qVar.u() > 0 || e()) {
                i().b(qVar);
            }
            this.f8440c = null;
        }
    }

    private final void k(TaskCompletionSource taskCompletionSource, int i10, com.google.android.gms.common.api.d dVar) {
        b0 b0VarA;
        if (i10 == 0 || (b0VarA = b0.a(this, i10, dVar.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        final Handler handler = this.f8451n;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: v8.p
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, b0VarA);
    }

    @ResultIgnorabilityUnspecified
    public static c u(Context context) {
        c cVar;
        synchronized (f8436r) {
            if (f8437s == null) {
                f8437s = new c(context.getApplicationContext(), com.google.android.gms.common.internal.e.d().getLooper(), t8.g.m());
            }
            cVar = f8437s;
        }
        return cVar;
    }

    public final void D(com.google.android.gms.common.api.d dVar, int i10, b bVar) {
        this.f8451n.sendMessage(this.f8451n.obtainMessage(4, new v8.x(new m0(i10, bVar), this.f8446i.get(), dVar)));
    }

    public final void E(com.google.android.gms.common.api.d dVar, int i10, j jVar, TaskCompletionSource taskCompletionSource, v8.l lVar) {
        k(taskCompletionSource, jVar.d(), dVar);
        this.f8451n.sendMessage(this.f8451n.obtainMessage(4, new v8.x(new o0(i10, jVar, taskCompletionSource, lVar), this.f8446i.get(), dVar)));
    }

    final void F(w8.j jVar, int i10, long j10, int i11) {
        this.f8451n.sendMessage(this.f8451n.obtainMessage(18, new c0(jVar, i10, j10, i11)));
    }

    public final void G(t8.b bVar, int i10) {
        if (f(bVar, i10)) {
            return;
        }
        Handler handler = this.f8451n;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, bVar));
    }

    public final void H() {
        Handler handler = this.f8451n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void I(com.google.android.gms.common.api.d dVar) {
        Handler handler = this.f8451n;
        handler.sendMessage(handler.obtainMessage(7, dVar));
    }

    public final void b(o oVar) {
        synchronized (f8436r) {
            if (this.f8448k != oVar) {
                this.f8448k = oVar;
                this.f8449l.clear();
            }
            this.f8449l.addAll(oVar.i());
        }
    }

    final void c(o oVar) {
        synchronized (f8436r) {
            if (this.f8448k == oVar) {
                this.f8448k = null;
                this.f8449l.clear();
            }
        }
    }

    final boolean e() {
        if (this.f8439b) {
            return false;
        }
        w8.o oVarA = w8.n.b().a();
        if (oVarA != null && !oVarA.z()) {
            return false;
        }
        int iA = this.f8444g.a(this.f8442e, 203400000);
        return iA == -1 || iA == 0;
    }

    @ResultIgnorabilityUnspecified
    final boolean f(t8.b bVar, int i10) {
        return this.f8443f.w(this.f8442e, bVar, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        TaskCompletionSource taskCompletionSourceB;
        Boolean boolValueOf;
        int i10 = message.what;
        v vVar = null;
        switch (i10) {
            case 1:
                this.f8438a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f8451n.removeMessages(12);
                for (v8.b bVar : this.f8447j.keySet()) {
                    Handler handler = this.f8451n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f8438a);
                }
                return true;
            case 2:
                v8.i0 i0Var = (v8.i0) message.obj;
                Iterator it = i0Var.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        v8.b bVar2 = (v8.b) it.next();
                        v vVar2 = (v) this.f8447j.get(bVar2);
                        if (vVar2 == null) {
                            i0Var.b(bVar2, new t8.b(13), null);
                        } else if (vVar2.Q()) {
                            i0Var.b(bVar2, t8.b.f21306e, vVar2.w().getEndpointPackageName());
                        } else {
                            t8.b bVarU = vVar2.u();
                            if (bVarU != null) {
                                i0Var.b(bVar2, bVarU, null);
                            } else {
                                vVar2.K(i0Var);
                                vVar2.F();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (v vVar3 : this.f8447j.values()) {
                    vVar3.E();
                    vVar3.F();
                }
                return true;
            case 4:
            case 8:
            case 13:
                v8.x xVar = (v8.x) message.obj;
                v vVarH = (v) this.f8447j.get(xVar.f22281c.getApiKey());
                if (vVarH == null) {
                    vVarH = h(xVar.f22281c);
                }
                if (!vVarH.a() || this.f8446i.get() == xVar.f22280b) {
                    vVarH.G(xVar.f22279a);
                } else {
                    xVar.f22279a.a(f8434p);
                    vVarH.M();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                t8.b bVar3 = (t8.b) message.obj;
                Iterator it2 = this.f8447j.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        v vVar4 = (v) it2.next();
                        if (vVar4.s() == i11) {
                            vVar = vVar4;
                        }
                    }
                }
                if (vVar == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (bVar3.u() == 13) {
                    vVar.h(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f8443f.e(bVar3.u()) + ": " + bVar3.x()));
                } else {
                    vVar.h(g(vVar.f8537c, bVar3));
                }
                return true;
            case 6:
                if (this.f8442e.getApplicationContext() instanceof Application) {
                    a.c((Application) this.f8442e.getApplicationContext());
                    a.b().a(new q(this));
                    if (!a.b().e(true)) {
                        this.f8438a = 300000L;
                    }
                }
                return true;
            case 7:
                h((com.google.android.gms.common.api.d) message.obj);
                return true;
            case 9:
                if (this.f8447j.containsKey(message.obj)) {
                    ((v) this.f8447j.get(message.obj)).L();
                }
                return true;
            case 10:
                Iterator it3 = this.f8450m.iterator();
                while (it3.hasNext()) {
                    v vVar5 = (v) this.f8447j.remove((v8.b) it3.next());
                    if (vVar5 != null) {
                        vVar5.M();
                    }
                }
                this.f8450m.clear();
                return true;
            case 11:
                if (this.f8447j.containsKey(message.obj)) {
                    ((v) this.f8447j.get(message.obj)).N();
                }
                return true;
            case 12:
                if (this.f8447j.containsKey(message.obj)) {
                    ((v) this.f8447j.get(message.obj)).d();
                }
                return true;
            case 14:
                p pVar = (p) message.obj;
                v8.b bVarA = pVar.a();
                if (this.f8447j.containsKey(bVarA)) {
                    boolean zR = ((v) this.f8447j.get(bVarA)).r(false);
                    taskCompletionSourceB = pVar.b();
                    boolValueOf = Boolean.valueOf(zR);
                } else {
                    taskCompletionSourceB = pVar.b();
                    boolValueOf = Boolean.FALSE;
                }
                taskCompletionSourceB.setResult(boolValueOf);
                return true;
            case 15:
                w wVar = (w) message.obj;
                if (this.f8447j.containsKey(wVar.f8548a)) {
                    v.C((v) this.f8447j.get(wVar.f8548a), wVar);
                }
                return true;
            case 16:
                w wVar2 = (w) message.obj;
                if (this.f8447j.containsKey(wVar2.f8548a)) {
                    v.D((v) this.f8447j.get(wVar2.f8548a), wVar2);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                c0 c0Var = (c0) message.obj;
                if (c0Var.f8455c == 0) {
                    i().b(new w8.q(c0Var.f8454b, Arrays.asList(c0Var.f8453a)));
                } else {
                    w8.q qVar = this.f8440c;
                    if (qVar != null) {
                        List listX = qVar.x();
                        if (qVar.u() != c0Var.f8454b || (listX != null && listX.size() >= c0Var.f8456d)) {
                            this.f8451n.removeMessages(17);
                            j();
                        } else {
                            this.f8440c.z(c0Var.f8453a);
                        }
                    }
                    if (this.f8440c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c0Var.f8453a);
                        this.f8440c = new w8.q(c0Var.f8454b, arrayList);
                        Handler handler2 = this.f8451n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c0Var.f8455c);
                    }
                }
                return true;
            case 19:
                this.f8439b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final int l() {
        return this.f8445h.getAndIncrement();
    }

    final v t(v8.b bVar) {
        return (v) this.f8447j.get(bVar);
    }

    @ResultIgnorabilityUnspecified
    public final Task w(com.google.android.gms.common.api.d dVar) {
        p pVar = new p(dVar.getApiKey());
        this.f8451n.sendMessage(this.f8451n.obtainMessage(14, pVar));
        return pVar.b().getTask();
    }

    public final Task x(com.google.android.gms.common.api.d dVar, g gVar, k kVar, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k(taskCompletionSource, gVar.e(), dVar);
        this.f8451n.sendMessage(this.f8451n.obtainMessage(8, new v8.x(new n0(new v8.y(gVar, kVar, runnable), taskCompletionSource), this.f8446i.get(), dVar)));
        return taskCompletionSource.getTask();
    }

    public final Task y(com.google.android.gms.common.api.d dVar, e.a aVar, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k(taskCompletionSource, i10, dVar);
        this.f8451n.sendMessage(this.f8451n.obtainMessage(13, new v8.x(new p0(aVar, taskCompletionSource), this.f8446i.get(), dVar)));
        return taskCompletionSource.getTask();
    }
}
