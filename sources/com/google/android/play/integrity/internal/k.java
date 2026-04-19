package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class k extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f8875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ i f8876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ d f8877i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(d dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, i iVar) {
        super(taskCompletionSource);
        this.f8877i = dVar;
        this.f8875g = taskCompletionSource2;
        this.f8876h = iVar;
    }

    @Override // com.google.android.play.integrity.internal.i
    public final void b() {
        synchronized (this.f8877i.f8863f) {
            d.o(this.f8877i, this.f8875g);
            if (this.f8877i.f8869l.getAndIncrement() > 0) {
                this.f8877i.f8859b.d("Already connected to the service.", new Object[0]);
            }
            d.q(this.f8877i, this.f8876h);
        }
    }
}
