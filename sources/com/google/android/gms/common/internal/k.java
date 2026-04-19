package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
abstract class k extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f8595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ b f8596f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected k(b bVar, int i10, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f8596f = bVar;
        this.f8594d = i10;
        this.f8595e = bundle;
    }

    @Override // com.google.android.gms.common.internal.n
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f8594d != 0) {
            this.f8596f.zzp(1, null);
            Bundle bundle = this.f8595e;
            f(new t8.b(this.f8594d, bundle != null ? (PendingIntent) bundle.getParcelable(b.KEY_PENDING_INTENT) : null));
        } else {
            if (g()) {
                return;
            }
            this.f8596f.zzp(1, null);
            f(new t8.b(8, null));
        }
    }

    @Override // com.google.android.gms.common.internal.n
    protected final void b() {
    }

    protected abstract void f(t8.b bVar);

    protected abstract boolean g();
}
