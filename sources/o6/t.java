package o6;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import i6.e;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class t implements ComponentCallbacks2, e.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f16406f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<x5.h> f16408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i6.e f16409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f16410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f16411e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public t(x5.h hVar, Context context, boolean z10) {
        this.f16407a = context;
        this.f16408b = new WeakReference<>(hVar);
        i6.e eVarA = z10 ? i6.f.a(context, this, hVar.h()) : new i6.c();
        this.f16409c = eVarA;
        this.f16410d = eVarA.a();
        this.f16411e = new AtomicBoolean(false);
    }

    @Override // i6.e.a
    public void a(boolean z10) {
        x5.h hVar = this.f16408b.get();
        i0 i0Var = null;
        if (hVar != null) {
            r rVarH = hVar.h();
            if (rVarH != null && rVarH.a() <= 4) {
                rVarH.b("NetworkObserver", 4, z10 ? "ONLINE" : "OFFLINE", null);
            }
            this.f16410d = z10;
            i0Var = i0.f15558a;
        }
        if (i0Var == null) {
            d();
        }
    }

    public final boolean b() {
        return this.f16410d;
    }

    public final void c() {
        this.f16407a.registerComponentCallbacks(this);
    }

    public final void d() {
        if (this.f16411e.getAndSet(true)) {
            return;
        }
        this.f16407a.unregisterComponentCallbacks(this);
        this.f16409c.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f16408b.get() == null) {
            d();
            i0 i0Var = i0.f15558a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        x5.h hVar = this.f16408b.get();
        i0 i0Var = null;
        if (hVar != null) {
            r rVarH = hVar.h();
            if (rVarH != null && rVarH.a() <= 2) {
                rVarH.b("NetworkObserver", 2, "trimMemory, level=" + i10, null);
            }
            hVar.l(i10);
            i0Var = i0.f15558a;
        }
        if (i0Var == null) {
            d();
        }
    }
}
