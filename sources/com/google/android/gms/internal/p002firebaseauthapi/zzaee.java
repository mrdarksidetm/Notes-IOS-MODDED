package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.b;

/* JADX INFO: loaded from: classes.dex */
final class zzaee implements zzaeg {
    private final /* synthetic */ Status zza;

    zzaee(zzaea zzaeaVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeg
    public final void zza(b.AbstractC0181b abstractC0181b, Object... objArr) {
        abstractC0181b.onVerificationFailed(zzadg.zza(this.zza));
    }
}
