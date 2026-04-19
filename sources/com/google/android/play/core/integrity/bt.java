package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes.dex */
final class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f8819a;

    bt(bn bnVar) {
        this.f8819a = bnVar;
    }

    final /* synthetic */ Task a(long j10, long j11, int i10, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f8819a.d(standardIntegrityTokenRequest.a(), j10, j11, 0);
    }
}
