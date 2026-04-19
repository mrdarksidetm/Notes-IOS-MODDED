package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class bg extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f8784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f8785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f8786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f8787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f8788e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f8788e = bnVar;
        this.f8784a = str;
        this.f8785b = j10;
        this.f8786c = j11;
        this.f8787d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.i
    protected final void b() {
        if (bn.k(this.f8788e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f8788e;
            ((q9.r) bnVar.f8803a.e()).U(bn.a(bnVar, this.f8784a, this.f8785b, this.f8786c, 0), new bk(this.f8788e, this.f8787d, this.f8785b));
        } catch (RemoteException e10) {
            this.f8788e.f8804b.c(e10, "requestExpressIntegrityToken(%s, %s)", this.f8784a, Long.valueOf(this.f8785b));
            this.f8787d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
