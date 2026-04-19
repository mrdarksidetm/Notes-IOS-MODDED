package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.b;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzadc extends zzady<Void, b.AbstractC0181b> {
    private final zzagz zzu;

    public zzadc(zzagz zzagzVar) {
        super(8);
        m.k(zzagzVar);
        this.zzu = zzagzVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "verifyPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
    }
}
