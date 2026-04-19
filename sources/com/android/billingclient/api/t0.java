package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v6.m f8225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v6.a0 f8226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v6.p f8227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f8228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s0 f8229f = new s0(this, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final s0 f8230g = new s0(this, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8231h;

    t0(Context context, v6.m mVar, v6.g0 g0Var, v6.a0 a0Var, v6.p pVar, d0 d0Var) {
        this.f8224a = context;
        this.f8225b = mVar;
        this.f8226c = a0Var;
        this.f8227d = pVar;
        this.f8228e = d0Var;
    }

    final v6.m d() {
        return this.f8225b;
    }

    final void f() {
        this.f8229f.c(this.f8224a);
        this.f8230g.c(this.f8224a);
    }

    final void g(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f8231h = z10;
        this.f8230g.a(this.f8224a, intentFilter2);
        if (this.f8231h) {
            this.f8229f.b(this.f8224a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f8229f.a(this.f8224a, intentFilter);
        }
    }
}
