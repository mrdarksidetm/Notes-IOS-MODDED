package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import q9.a0;
import q9.b0;
import q9.y;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f8857o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f8859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8860c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f8865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b0 f8866i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ServiceConnection f8870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private IInterface f8871n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f8861d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f8862e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f8863f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IBinder.DeathRecipient f8868k = new IBinder.DeathRecipient() { // from class: q9.z
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.google.android.play.integrity.internal.d.k(this.f19019a);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicInteger f8869l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference f8867j = new WeakReference(null);

    public d(Context context, y yVar, String str, Intent intent, b0 b0Var, a0 a0Var) {
        this.f8858a = context;
        this.f8859b = yVar;
        this.f8860c = str;
        this.f8865h = intent;
        this.f8866i = b0Var;
    }

    public static /* synthetic */ void k(d dVar) {
        dVar.f8859b.d("reportBinderDeath", new Object[0]);
        a0 a0Var = (a0) dVar.f8867j.get();
        if (a0Var != null) {
            dVar.f8859b.d("calling onBinderDied", new Object[0]);
            a0Var.a();
        } else {
            dVar.f8859b.d("%s : Binder has died.", dVar.f8860c);
            Iterator it = dVar.f8861d.iterator();
            while (it.hasNext()) {
                ((i) it.next()).a(dVar.w());
            }
            dVar.f8861d.clear();
        }
        synchronized (dVar.f8863f) {
            dVar.x();
        }
    }

    static /* bridge */ /* synthetic */ void o(final d dVar, final TaskCompletionSource taskCompletionSource) {
        dVar.f8862e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.j
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f8873a.u(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void q(d dVar, i iVar) {
        if (dVar.f8871n != null || dVar.f8864g) {
            if (!dVar.f8864g) {
                iVar.run();
                return;
            } else {
                dVar.f8859b.d("Waiting to bind to the service.", new Object[0]);
                dVar.f8861d.add(iVar);
                return;
            }
        }
        dVar.f8859b.d("Initiate binding to the service.", new Object[0]);
        dVar.f8861d.add(iVar);
        c cVar = new c(dVar, null);
        dVar.f8870m = cVar;
        dVar.f8864g = true;
        if (dVar.f8858a.bindService(dVar.f8865h, cVar, 1)) {
            return;
        }
        dVar.f8859b.d("Failed to bind to the service.", new Object[0]);
        dVar.f8864g = false;
        Iterator it = dVar.f8861d.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a(new q9.c());
        }
        dVar.f8861d.clear();
    }

    static /* bridge */ /* synthetic */ void r(d dVar) {
        dVar.f8859b.d("linkToDeath", new Object[0]);
        try {
            dVar.f8871n.asBinder().linkToDeath(dVar.f8868k, 0);
        } catch (RemoteException e10) {
            dVar.f8859b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(d dVar) {
        dVar.f8859b.d("unlinkToDeath", new Object[0]);
        dVar.f8871n.asBinder().unlinkToDeath(dVar.f8868k, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f8860c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Iterator it = this.f8862e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f8862e.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f8857o;
        synchronized (map) {
            if (!map.containsKey(this.f8860c)) {
                HandlerThread handlerThread = new HandlerThread(this.f8860c, 10);
                handlerThread.start();
                map.put(this.f8860c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f8860c);
        }
        return handler;
    }

    public final IInterface e() {
        return this.f8871n;
    }

    public final void t(i iVar, TaskCompletionSource taskCompletionSource) {
        c().post(new k(this, iVar.c(), taskCompletionSource, iVar));
    }

    final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f8863f) {
            this.f8862e.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f8863f) {
            this.f8862e.remove(taskCompletionSource);
        }
        c().post(new l(this));
    }
}
