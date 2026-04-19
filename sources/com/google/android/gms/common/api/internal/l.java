package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import u8.d;

/* JADX INFO: loaded from: classes.dex */
final class l implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f8502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f8503b;

    l(n nVar, BasePendingResult basePendingResult) {
        this.f8503b = nVar;
        this.f8502a = basePendingResult;
    }

    @Override // u8.d.a
    public final void a(Status status) {
        this.f8503b.f8507a.remove(this.f8502a);
    }
}
