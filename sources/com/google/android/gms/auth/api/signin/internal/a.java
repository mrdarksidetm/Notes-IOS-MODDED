package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.a;
import com.google.android.gms.common.api.e;
import r8.g;
import r8.z;
import s4.b;

/* JADX INFO: loaded from: classes.dex */
final class a implements a.InterfaceC0106a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f8375a;

    /* synthetic */ a(SignInHubActivity signInHubActivity, z zVar) {
        this.f8375a = signInHubActivity;
    }

    @Override // androidx.loader.app.a.InterfaceC0106a
    public final /* bridge */ /* synthetic */ void a(b bVar, Object obj) {
        SignInHubActivity signInHubActivity = this.f8375a;
        signInHubActivity.setResult(signInHubActivity.f8373d, signInHubActivity.f8374e);
        this.f8375a.finish();
    }

    @Override // androidx.loader.app.a.InterfaceC0106a
    public final b b(int i10, Bundle bundle) {
        return new g(this.f8375a, e.c());
    }

    @Override // androidx.loader.app.a.InterfaceC0106a
    public final void c(b bVar) {
    }
}
