package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class y implements b.c, v8.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.f f8553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v8.b f8554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.common.internal.f f8555c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f8556d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8557e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f8558f;

    public y(c cVar, a.f fVar, v8.b bVar) {
        this.f8558f = cVar;
        this.f8553a = fVar;
        this.f8554b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        com.google.android.gms.common.internal.f fVar;
        if (!this.f8557e || (fVar = this.f8555c) == null) {
            return;
        }
        this.f8553a.getRemoteService(fVar, this.f8556d);
    }

    @Override // com.google.android.gms.common.internal.b.c
    public final void a(t8.b bVar) {
        this.f8558f.f8451n.post(new x(this, bVar));
    }

    @Override // v8.f0
    public final void b(t8.b bVar) {
        v vVar = (v) this.f8558f.f8447j.get(this.f8554b);
        if (vVar != null) {
            vVar.J(bVar);
        }
    }

    @Override // v8.f0
    public final void c(com.google.android.gms.common.internal.f fVar, Set set) {
        if (fVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new t8.b(4));
        } else {
            this.f8555c = fVar;
            this.f8556d = set;
            i();
        }
    }

    @Override // v8.f0
    public final void d(int i10) {
        v vVar = (v) this.f8558f.f8447j.get(this.f8554b);
        if (vVar != null) {
            if (vVar.f8543i) {
                vVar.J(new t8.b(17));
            } else {
                vVar.c(i10);
            }
        }
    }
}
