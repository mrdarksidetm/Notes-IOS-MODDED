package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v implements e.b, e.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.f f8536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v8.b f8537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f8538d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f8541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v8.g0 f8542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8543i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ c f8547p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f8535a = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f8539e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f8540f = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f8544j = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private t8.b f8545n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f8546o = 0;

    public v(c cVar, com.google.android.gms.common.api.d dVar) {
        this.f8547p = cVar;
        a.f fVarZab = dVar.zab(cVar.f8451n.getLooper(), this);
        this.f8536b = fVarZab;
        this.f8537c = dVar.getApiKey();
        this.f8538d = new n();
        this.f8541g = dVar.zaa();
        if (fVarZab.requiresSignIn()) {
            this.f8542h = dVar.zac(cVar.f8442e, cVar.f8451n);
        } else {
            this.f8542h = null;
        }
    }

    static /* bridge */ /* synthetic */ void C(v vVar, w wVar) {
        if (vVar.f8544j.contains(wVar) && !vVar.f8543i) {
            if (vVar.f8536b.isConnected()) {
                vVar.j();
            } else {
                vVar.F();
            }
        }
    }

    static /* bridge */ /* synthetic */ void D(v vVar, w wVar) {
        t8.d[] dVarArrG;
        if (vVar.f8544j.remove(wVar)) {
            vVar.f8547p.f8451n.removeMessages(15, wVar);
            vVar.f8547p.f8451n.removeMessages(16, wVar);
            t8.d dVar = wVar.f8549b;
            ArrayList arrayList = new ArrayList(vVar.f8535a.size());
            for (q0 q0Var : vVar.f8535a) {
                if ((q0Var instanceof v8.u) && (dVarArrG = ((v8.u) q0Var).g(vVar)) != null && e9.b.b(dVarArrG, dVar)) {
                    arrayList.add(q0Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                q0 q0Var2 = (q0) arrayList.get(i10);
                vVar.f8535a.remove(q0Var2);
                q0Var2.b(new u8.m(dVar));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final t8.d e(t8.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            t8.d[] availableFeatures = this.f8536b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new t8.d[0];
            }
            z.a aVar = new z.a(availableFeatures.length);
            for (t8.d dVar : availableFeatures) {
                aVar.put(dVar.getName(), Long.valueOf(dVar.u()));
            }
            for (t8.d dVar2 : dVarArr) {
                Long l10 = (Long) aVar.get(dVar2.getName());
                if (l10 == null || l10.longValue() < dVar2.u()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    private final void g(t8.b bVar) {
        Iterator it = this.f8539e.iterator();
        while (it.hasNext()) {
            ((v8.i0) it.next()).b(this.f8537c, bVar, w8.k.b(bVar, t8.b.f21306e) ? this.f8536b.getEndpointPackageName() : null);
        }
        this.f8539e.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Status status) {
        w8.m.d(this.f8547p.f8451n);
        i(status, null, false);
    }

    private final void i(Status status, Exception exc, boolean z10) {
        w8.m.d(this.f8547p.f8451n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f8535a.iterator();
        while (it.hasNext()) {
            q0 q0Var = (q0) it.next();
            if (!z10 || q0Var.f8519a == 2) {
                if (status != null) {
                    q0Var.a(status);
                } else {
                    q0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void j() {
        ArrayList arrayList = new ArrayList(this.f8535a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            q0 q0Var = (q0) arrayList.get(i10);
            if (!this.f8536b.isConnected()) {
                return;
            }
            if (p(q0Var)) {
                this.f8535a.remove(q0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        E();
        g(t8.b.f21306e);
        o();
        Iterator it = this.f8540f.values().iterator();
        while (it.hasNext()) {
            v8.y yVar = (v8.y) it.next();
            if (e(yVar.f22282a.c()) == null) {
                try {
                    yVar.f22282a.d(this.f8536b, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    c(3);
                    this.f8536b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
            it.remove();
        }
        j();
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(int i10) {
        E();
        this.f8543i = true;
        this.f8538d.e(i10, this.f8536b.getLastDisconnectMessage());
        v8.b bVar = this.f8537c;
        c cVar = this.f8547p;
        cVar.f8451n.sendMessageDelayed(Message.obtain(cVar.f8451n, 9, bVar), 5000L);
        v8.b bVar2 = this.f8537c;
        c cVar2 = this.f8547p;
        cVar2.f8451n.sendMessageDelayed(Message.obtain(cVar2.f8451n, 11, bVar2), 120000L);
        this.f8547p.f8444g.c();
        Iterator it = this.f8540f.values().iterator();
        while (it.hasNext()) {
            ((v8.y) it.next()).f22284c.run();
        }
    }

    private final void m() {
        this.f8547p.f8451n.removeMessages(12, this.f8537c);
        v8.b bVar = this.f8537c;
        c cVar = this.f8547p;
        cVar.f8451n.sendMessageDelayed(cVar.f8451n.obtainMessage(12, bVar), this.f8547p.f8438a);
    }

    private final void n(q0 q0Var) {
        q0Var.d(this.f8538d, a());
        try {
            q0Var.c(this);
        } catch (DeadObjectException unused) {
            c(1);
            this.f8536b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void o() {
        if (this.f8543i) {
            c cVar = this.f8547p;
            cVar.f8451n.removeMessages(11, this.f8537c);
            c cVar2 = this.f8547p;
            cVar2.f8451n.removeMessages(9, this.f8537c);
            this.f8543i = false;
        }
    }

    private final boolean p(q0 q0Var) {
        if (!(q0Var instanceof v8.u)) {
            n(q0Var);
            return true;
        }
        v8.u uVar = (v8.u) q0Var;
        t8.d dVarE = e(uVar.g(this));
        if (dVarE == null) {
            n(q0Var);
            return true;
        }
        Log.w("GoogleApiManager", this.f8536b.getClass().getName() + " could not execute call because it requires feature (" + dVarE.getName() + ", " + dVarE.u() + ").");
        if (!this.f8547p.f8452o || !uVar.f(this)) {
            uVar.b(new u8.m(dVarE));
            return true;
        }
        w wVar = new w(this.f8537c, dVarE, null);
        int iIndexOf = this.f8544j.indexOf(wVar);
        if (iIndexOf >= 0) {
            w wVar2 = (w) this.f8544j.get(iIndexOf);
            this.f8547p.f8451n.removeMessages(15, wVar2);
            c cVar = this.f8547p;
            cVar.f8451n.sendMessageDelayed(Message.obtain(cVar.f8451n, 15, wVar2), 5000L);
            return false;
        }
        this.f8544j.add(wVar);
        c cVar2 = this.f8547p;
        cVar2.f8451n.sendMessageDelayed(Message.obtain(cVar2.f8451n, 15, wVar), 5000L);
        c cVar3 = this.f8547p;
        cVar3.f8451n.sendMessageDelayed(Message.obtain(cVar3.f8451n, 16, wVar), 120000L);
        t8.b bVar = new t8.b(2, null);
        if (q(bVar)) {
            return false;
        }
        this.f8547p.f(bVar, this.f8541g);
        return false;
    }

    private final boolean q(t8.b bVar) {
        synchronized (c.f8436r) {
            c cVar = this.f8547p;
            if (cVar.f8448k == null || !cVar.f8449l.contains(this.f8537c)) {
                return false;
            }
            this.f8547p.f8448k.h(bVar, this.f8541g);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r(boolean z10) {
        w8.m.d(this.f8547p.f8451n);
        if (!this.f8536b.isConnected() || !this.f8540f.isEmpty()) {
            return false;
        }
        if (!this.f8538d.g()) {
            this.f8536b.disconnect("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        m();
        return false;
    }

    public final void E() {
        w8.m.d(this.f8547p.f8451n);
        this.f8545n = null;
    }

    public final void F() {
        t8.b bVar;
        w8.m.d(this.f8547p.f8451n);
        if (this.f8536b.isConnected() || this.f8536b.isConnecting()) {
            return;
        }
        try {
            c cVar = this.f8547p;
            int iB = cVar.f8444g.b(cVar.f8442e, this.f8536b);
            if (iB != 0) {
                t8.b bVar2 = new t8.b(iB, null);
                Log.w("GoogleApiManager", "The service for " + this.f8536b.getClass().getName() + " is not available: " + bVar2.toString());
                I(bVar2, null);
                return;
            }
            c cVar2 = this.f8547p;
            a.f fVar = this.f8536b;
            y yVar = new y(cVar2, fVar, this.f8537c);
            if (fVar.requiresSignIn()) {
                ((v8.g0) w8.m.k(this.f8542h)).X(yVar);
            }
            try {
                this.f8536b.connect(yVar);
                return;
            } catch (SecurityException e10) {
                e = e10;
                bVar = new t8.b(10);
            }
        } catch (IllegalStateException e11) {
            e = e11;
            bVar = new t8.b(10);
        }
        I(bVar, e);
    }

    public final void G(q0 q0Var) {
        w8.m.d(this.f8547p.f8451n);
        if (this.f8536b.isConnected()) {
            if (p(q0Var)) {
                m();
                return;
            } else {
                this.f8535a.add(q0Var);
                return;
            }
        }
        this.f8535a.add(q0Var);
        t8.b bVar = this.f8545n;
        if (bVar == null || !bVar.A()) {
            F();
        } else {
            I(this.f8545n, null);
        }
    }

    final void H() {
        this.f8546o++;
    }

    public final void I(t8.b bVar, Exception exc) {
        w8.m.d(this.f8547p.f8451n);
        v8.g0 g0Var = this.f8542h;
        if (g0Var != null) {
            g0Var.Y();
        }
        E();
        this.f8547p.f8444g.c();
        g(bVar);
        if ((this.f8536b instanceof y8.e) && bVar.u() != 24) {
            this.f8547p.f8439b = true;
            c cVar = this.f8547p;
            cVar.f8451n.sendMessageDelayed(cVar.f8451n.obtainMessage(19), 300000L);
        }
        if (bVar.u() == 4) {
            h(c.f8435q);
            return;
        }
        if (this.f8535a.isEmpty()) {
            this.f8545n = bVar;
            return;
        }
        if (exc != null) {
            w8.m.d(this.f8547p.f8451n);
            i(null, exc, false);
            return;
        }
        if (!this.f8547p.f8452o) {
            h(c.g(this.f8537c, bVar));
            return;
        }
        i(c.g(this.f8537c, bVar), null, true);
        if (this.f8535a.isEmpty() || q(bVar) || this.f8547p.f(bVar, this.f8541g)) {
            return;
        }
        if (bVar.u() == 18) {
            this.f8543i = true;
        }
        if (!this.f8543i) {
            h(c.g(this.f8537c, bVar));
            return;
        }
        c cVar2 = this.f8547p;
        cVar2.f8451n.sendMessageDelayed(Message.obtain(cVar2.f8451n, 9, this.f8537c), 5000L);
    }

    public final void J(t8.b bVar) {
        w8.m.d(this.f8547p.f8451n);
        a.f fVar = this.f8536b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(bVar));
        I(bVar, null);
    }

    public final void K(v8.i0 i0Var) {
        w8.m.d(this.f8547p.f8451n);
        this.f8539e.add(i0Var);
    }

    public final void L() {
        w8.m.d(this.f8547p.f8451n);
        if (this.f8543i) {
            F();
        }
    }

    public final void M() {
        w8.m.d(this.f8547p.f8451n);
        h(c.f8434p);
        this.f8538d.f();
        for (e.a aVar : (e.a[]) this.f8540f.keySet().toArray(new e.a[0])) {
            G(new p0(aVar, new TaskCompletionSource()));
        }
        g(new t8.b(4));
        if (this.f8536b.isConnected()) {
            this.f8536b.onUserSignOut(new u(this));
        }
    }

    public final void N() {
        w8.m.d(this.f8547p.f8451n);
        if (this.f8543i) {
            o();
            c cVar = this.f8547p;
            h(cVar.f8443f.g(cVar.f8442e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f8536b.disconnect("Timing out connection while resuming.");
        }
    }

    final boolean Q() {
        return this.f8536b.isConnected();
    }

    public final boolean a() {
        return this.f8536b.requiresSignIn();
    }

    @Override // v8.h
    public final void b(t8.b bVar) {
        I(bVar, null);
    }

    @Override // v8.d
    public final void c(int i10) {
        if (Looper.myLooper() == this.f8547p.f8451n.getLooper()) {
            l(i10);
        } else {
            this.f8547p.f8451n.post(new s(this, i10));
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean d() {
        return r(true);
    }

    @Override // v8.d
    public final void f(Bundle bundle) {
        if (Looper.myLooper() == this.f8547p.f8451n.getLooper()) {
            k();
        } else {
            this.f8547p.f8451n.post(new r(this));
        }
    }

    public final int s() {
        return this.f8541g;
    }

    final int t() {
        return this.f8546o;
    }

    public final t8.b u() {
        w8.m.d(this.f8547p.f8451n);
        return this.f8545n;
    }

    public final a.f w() {
        return this.f8536b;
    }

    public final Map y() {
        return this.f8540f;
    }
}
