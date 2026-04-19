package com.google.android.gms.internal.p002firebaseauthapi;

import ba.o0;
import com.google.firebase.auth.b;

/* JADX INFO: loaded from: classes.dex */
final class zzaec implements zzaeg {
    private final /* synthetic */ o0 zza;

    zzaec(zzaea zzaeaVar, o0 o0Var) {
        this.zza = o0Var;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(b.AbstractC0181b abstractC0181b, Object... objArr) {
        abstractC0181b.onVerificationCompleted(this.zza);
    }
}
