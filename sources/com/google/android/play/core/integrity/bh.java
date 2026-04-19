package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class bh extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f8789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f8790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f8791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f8792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f8793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(bnVar, taskCompletionSource);
        this.f8793e = bnVar;
        this.f8789a = bundle;
        this.f8790b = activity;
        this.f8791c = taskCompletionSource2;
        this.f8792d = i10;
    }

    @Override // com.google.android.play.integrity.internal.i
    protected final void b() {
        if (bn.k(this.f8793e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f8793e;
            com.google.android.play.integrity.internal.d dVar = bnVar.f8803a;
            ((q9.r) dVar.e()).a(this.f8789a, bnVar.f8807e.a(this.f8790b, this.f8791c, dVar));
        } catch (RemoteException e10) {
            this.f8793e.f8804b.c(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f8792d));
            this.f8791c.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
