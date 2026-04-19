package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class bk extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f8797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q9.y f8798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8799e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j10) {
        super(bnVar, taskCompletionSource);
        this.f8797c = bnVar;
        this.f8798d = new q9.y("OnRequestIntegrityTokenCallback");
        this.f8799e = j10;
    }

    @Override // com.google.android.play.core.integrity.bi, q9.s
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.f8798d.d("onRequestExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.b bVarA = this.f8797c.f8808f.a(bundle);
        if (bVarA != null) {
            this.f8794a.trySetException(bVarA);
            return;
        }
        bj bjVar = new bj(this, this.f8797c.f8805c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f8794a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
