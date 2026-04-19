package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q9.k f8764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.k f8765b;

    at(q9.k kVar, q9.k kVar2) {
        this.f8764a = kVar;
        this.f8765b = kVar2;
    }

    final as a(Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.d dVar) {
        Object objA = this.f8764a.a();
        objA.getClass();
        k kVar = (k) this.f8765b.a();
        kVar.getClass();
        activity.getClass();
        dVar.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, dVar);
    }
}
