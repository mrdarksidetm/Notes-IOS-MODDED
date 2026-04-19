package com.google.android.gms.common.api.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t8.b f8551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f8552b;

    x(y yVar, t8.b bVar) {
        this.f8552b = yVar;
        this.f8551a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f8552b;
        v vVar = (v) yVar.f8558f.f8447j.get(yVar.f8554b);
        if (vVar == null) {
            return;
        }
        if (!this.f8551a.B()) {
            vVar.I(this.f8551a, null);
            return;
        }
        this.f8552b.f8557e = true;
        if (this.f8552b.f8553a.requiresSignIn()) {
            this.f8552b.i();
            return;
        }
        try {
            y yVar2 = this.f8552b;
            yVar2.f8553a.getRemoteService(null, yVar2.f8553a.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.f8552b.f8553a.disconnect("Failed to get service from broker.");
            vVar.I(new t8.b(10), null);
        }
    }
}
