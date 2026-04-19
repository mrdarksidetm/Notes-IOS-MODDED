package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
abstract class bm extends com.google.android.play.integrity.internal.i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f8802f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f8802f = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.i
    public final void a(Exception exc) {
        if (exc instanceof q9.c) {
            super.a(bn.k(this.f8802f) ? new StandardIntegrityException(-2, exc) : new StandardIntegrityException(-9, exc));
        } else {
            super.a(exc);
        }
    }
}
