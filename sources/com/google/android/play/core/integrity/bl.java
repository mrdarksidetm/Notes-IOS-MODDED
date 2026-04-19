package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class bl extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f8800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q9.y f8801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f8800c = bnVar;
        this.f8801d = new q9.y("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, q9.s
    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f8801d.d("onWarmUpExpressIntegrityToken", new Object[0]);
        com.google.android.gms.common.api.b bVarA = this.f8800c.f8808f.a(bundle);
        if (bVarA != null) {
            this.f8794a.trySetException(bVarA);
        } else {
            this.f8794a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
