package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class o extends u0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z.b f8510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f8511f;

    o(v8.f fVar, c cVar, t8.g gVar) {
        super(fVar, gVar);
        this.f8510e = new z.b();
        this.f8511f = cVar;
        this.mLifecycleFragment.j("ConnectionlessLifecycleHelper", this);
    }

    public static void j(Activity activity, c cVar, v8.b bVar) {
        v8.f fragment = LifecycleCallback.getFragment(activity);
        o oVar = (o) fragment.r("ConnectionlessLifecycleHelper", o.class);
        if (oVar == null) {
            oVar = new o(fragment, cVar, t8.g.m());
        }
        w8.m.l(bVar, "ApiKey cannot be null");
        oVar.f8510e.add(bVar);
        cVar.b(oVar);
    }

    private final void k() {
        if (this.f8510e.isEmpty()) {
            return;
        }
        this.f8511f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.u0
    protected final void b(t8.b bVar, int i10) {
        this.f8511f.G(bVar, i10);
    }

    @Override // com.google.android.gms.common.api.internal.u0
    protected final void c() {
        this.f8511f.H();
    }

    final z.b i() {
        return this.f8510e;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.u0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.u0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        this.f8511f.c(this);
    }
}
