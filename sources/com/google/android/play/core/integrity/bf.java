package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class bf extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f8781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f8782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f8783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, long j10, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f8783c = bnVar;
        this.f8781a = j10;
        this.f8782b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.i
    protected final void b() {
        if (bn.k(this.f8783c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f8783c;
            ((q9.r) bnVar.f8803a.e()).C(bn.b(bnVar, this.f8781a, 0), new bl(this.f8783c, this.f8782b));
        } catch (RemoteException e10) {
            this.f8783c.f8804b.c(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f8781a));
            this.f8782b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
