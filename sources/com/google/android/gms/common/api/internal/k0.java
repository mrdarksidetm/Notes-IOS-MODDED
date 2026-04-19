package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import u8.h;

/* JADX INFO: loaded from: classes.dex */
public final class k0<R extends u8.h> extends u8.l<R> implements u8.i<R> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f8499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i0 f8500h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u8.k f8493a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k0 f8494b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile u8.j f8495c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u8.d f8496d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8497e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Status f8498f = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8501i = false;

    public k0(WeakReference weakReference) {
        w8.m.l(weakReference, "GoogleApiClient reference must not be null");
        this.f8499g = weakReference;
        com.google.android.gms.common.api.e eVar = (com.google.android.gms.common.api.e) weakReference.get();
        this.f8500h = new i0(this, eVar != null ? eVar.f() : Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Status status) {
        synchronized (this.f8497e) {
            this.f8498f = status;
            m(status);
        }
    }

    private final void l() {
        if (this.f8493a == null && this.f8495c == null) {
            return;
        }
        com.google.android.gms.common.api.e eVar = (com.google.android.gms.common.api.e) this.f8499g.get();
        if (!this.f8501i && this.f8493a != null && eVar != null) {
            eVar.i(this);
            this.f8501i = true;
        }
        Status status = this.f8498f;
        if (status != null) {
            m(status);
            return;
        }
        u8.d dVar = this.f8496d;
        if (dVar != null) {
            dVar.setResultCallback(this);
        }
    }

    private final void m(Status status) {
        synchronized (this.f8497e) {
            u8.k kVar = this.f8493a;
            if (kVar != null) {
                ((k0) w8.m.k(this.f8494b)).k((Status) w8.m.l(kVar.a(status), "onFailure must not return null"));
            } else if (n()) {
                ((u8.j) w8.m.k(this.f8495c)).b(status);
            }
        }
    }

    private final boolean n() {
        return (this.f8495c == null || ((com.google.android.gms.common.api.e) this.f8499g.get()) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(u8.h hVar) {
        if (hVar instanceof u8.f) {
            try {
                ((u8.f) hVar).release();
            } catch (RuntimeException e10) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(hVar)), e10);
            }
        }
    }

    @Override // u8.i
    public final void a(u8.h hVar) {
        synchronized (this.f8497e) {
            if (!hVar.getStatus().B()) {
                k(hVar.getStatus());
                o(hVar);
            } else if (this.f8493a != null) {
                v8.c0.a().submit(new h0(this, hVar));
            } else if (n()) {
                ((u8.j) w8.m.k(this.f8495c)).c(hVar);
            }
        }
    }

    public final <S extends u8.h> u8.l<S> b(u8.k<? super R, ? extends S> kVar) {
        k0 k0Var;
        synchronized (this.f8497e) {
            boolean z10 = true;
            w8.m.o(this.f8493a == null, "Cannot call then() twice.");
            if (this.f8495c != null) {
                z10 = false;
            }
            w8.m.o(z10, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f8493a = kVar;
            k0Var = new k0(this.f8499g);
            this.f8494b = k0Var;
            l();
        }
        return k0Var;
    }

    public final void j(u8.d dVar) {
        synchronized (this.f8497e) {
            this.f8496d = dVar;
            l();
        }
    }
}
