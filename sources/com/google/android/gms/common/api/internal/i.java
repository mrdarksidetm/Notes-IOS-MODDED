package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d;

/* JADX INFO: loaded from: classes.dex */
public class i extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v8.c<Status> f8482a;

    public i(v8.c<Status> cVar) {
        this.f8482a = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public void onResult(Status status) {
        this.f8482a.setResult(status);
    }
}
