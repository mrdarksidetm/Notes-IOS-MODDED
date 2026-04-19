package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class ag extends com.google.android.play.integrity.internal.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f8731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f8732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f8733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f8734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f8735e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(taskCompletionSource);
        this.f8735e = ajVar;
        this.f8731a = bundle;
        this.f8732b = activity;
        this.f8733c = taskCompletionSource2;
        this.f8734d = i10;
    }

    @Override // com.google.android.play.integrity.internal.i
    protected final void b() {
        try {
            q9.v vVar = (q9.v) this.f8735e.f8740a.e();
            Bundle bundle = this.f8731a;
            aj ajVar = this.f8735e;
            vVar.a(bundle, ajVar.f8743d.a(this.f8732b, this.f8733c, ajVar.f8740a));
        } catch (RemoteException e10) {
            this.f8735e.f8741b.c(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f8734d));
            this.f8733c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
