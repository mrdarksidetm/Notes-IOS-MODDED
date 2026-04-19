package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class be extends com.google.android.play.integrity.internal.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f8779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f8780b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f8780b = bnVar;
        this.f8779a = context;
    }

    @Override // com.google.android.play.integrity.internal.i
    protected final void b() {
        this.f8780b.f8806d.trySetResult(Integer.valueOf(q9.f.a(this.f8779a)));
    }
}
