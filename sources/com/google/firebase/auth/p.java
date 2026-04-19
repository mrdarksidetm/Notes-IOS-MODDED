package com.google.firebase.auth;

import ba.a0;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
final class p implements ca.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a0 f8979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8980b;

    p(FirebaseAuth firebaseAuth, a0 a0Var) {
        this.f8979a = a0Var;
        this.f8980b = firebaseAuth;
    }

    @Override // ca.w
    public final void zza() {
        if (this.f8980b.f8888f == null || !this.f8980b.f8888f.d().equalsIgnoreCase(this.f8979a.d())) {
            return;
        }
        this.f8980b.G0();
    }

    @Override // ca.z
    public final void zza(Status status) {
        if (status.x() == 17011 || status.x() == 17021 || status.x() == 17005) {
            this.f8980b.D();
        }
    }
}
