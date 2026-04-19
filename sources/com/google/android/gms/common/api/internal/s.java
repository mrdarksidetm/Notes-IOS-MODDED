package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f8523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f8524b;

    s(v vVar, int i10) {
        this.f8524b = vVar;
        this.f8523a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8524b.l(this.f8523a);
    }
}
