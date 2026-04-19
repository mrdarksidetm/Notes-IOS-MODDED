package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class u implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f8232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v6.k f8233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f8234c;

    u(b bVar, String str, v6.k kVar) {
        this.f8232a = str;
        this.f8233b = kVar;
        this.f8234c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        b0 b0VarJ0 = b.j0(this.f8234c, this.f8232a);
        this.f8233b.a(b0VarJ0.a(), b0VarJ0.b());
        return null;
    }
}
