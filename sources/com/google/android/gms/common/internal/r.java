package com.google.android.gms.common.internal;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class r extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ b f8608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b bVar, int i10, Bundle bundle) {
        super(bVar, i10, null);
        this.f8608g = bVar;
    }

    @Override // com.google.android.gms.common.internal.k
    protected final void f(t8.b bVar) {
        if (this.f8608g.enableLocalFallback() && b.zzo(this.f8608g)) {
            b.zzk(this.f8608g, 16);
        } else {
            this.f8608g.zzc.a(bVar);
            this.f8608g.onConnectionFailed(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.k
    protected final boolean g() {
        this.f8608g.zzc.a(t8.b.f21306e);
        return true;
    }
}
