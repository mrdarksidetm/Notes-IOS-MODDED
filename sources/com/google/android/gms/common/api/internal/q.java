package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.a;

/* JADX INFO: loaded from: classes.dex */
final class q implements a.InterfaceC0177a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f8518a;

    q(c cVar) {
        this.f8518a = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.a.InterfaceC0177a
    public final void a(boolean z10) {
        c cVar = this.f8518a;
        cVar.f8451n.sendMessage(cVar.f8451n.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
