package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;

/* JADX INFO: loaded from: classes.dex */
final class as extends com.google.android.play.integrity.internal.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f8758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.play.integrity.internal.d f8759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.y f8760c = new q9.y("RequestDialogCallbackImpl");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f8762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Activity f8763f;

    as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.d dVar) {
        this.f8761d = context.getPackageName();
        this.f8762e = kVar;
        this.f8758a = taskCompletionSource;
        this.f8763f = activity;
        this.f8759b = dVar;
    }

    @Override // q9.x
    public final void b(Bundle bundle) {
        this.f8759b.v(this.f8758a);
        this.f8760c.d("onRequestDialog(%s)", this.f8761d);
        com.google.android.gms.common.api.b bVarA = this.f8762e.a(bundle);
        if (bVarA != null) {
            this.f8758a.trySetException(bVarA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f8760c.b("onRequestDialog(%s): got null dialog intent", this.f8761d);
            this.f8758a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f8763f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, new ar(this, this.f8759b.c()));
        this.f8760c.a("Starting dialog intent...", new Object[0]);
        this.f8763f.startActivityForResult(intent, 0);
    }
}
