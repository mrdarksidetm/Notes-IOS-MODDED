package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* JADX INFO: loaded from: classes.dex */
final class s0 extends v8.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f8525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t0 f8526b;

    s0(t0 t0Var, Dialog dialog) {
        this.f8526b = t0Var;
        this.f8525a = dialog;
    }

    @Override // v8.s
    public final void a() {
        this.f8526b.f8529b.d();
        if (this.f8525a.isShowing()) {
            this.f8525a.dismiss();
        }
    }
}
