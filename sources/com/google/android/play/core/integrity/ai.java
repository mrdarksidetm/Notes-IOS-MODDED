package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class ai extends com.google.android.play.integrity.internal.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f8737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.y f8738b = new q9.y("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f8739c;

    ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f8737a = ajVar;
        this.f8739c = taskCompletionSource;
    }

    @Override // q9.w
    public final void b(Bundle bundle) {
        this.f8737a.f8740a.v(this.f8739c);
        this.f8738b.d("onRequestIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.b bVarA = this.f8737a.f8744e.a(bundle);
        if (bVarA != null) {
            this.f8739c.trySetException(bVarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f8739c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f8737a.f8742c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f8739c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
