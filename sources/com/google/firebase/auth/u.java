package com.google.firebase.auth;

import ba.a0;
import ca.o1;
import ca.z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;

/* JADX INFO: loaded from: classes2.dex */
final class u implements z, o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f8986a;

    u(FirebaseAuth firebaseAuth) {
        this.f8986a = firebaseAuth;
    }

    @Override // ca.o1
    public final void a(zzagl zzaglVar, a0 a0Var) {
        this.f8986a.e0(a0Var, zzaglVar, true, true);
    }

    @Override // ca.z
    public final void zza(Status status) {
        int iX = status.x();
        if (iX == 17011 || iX == 17021 || iX == 17005) {
            this.f8986a.D();
        }
    }
}
