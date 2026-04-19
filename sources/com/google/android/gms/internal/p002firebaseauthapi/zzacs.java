package com.google.android.gms.internal.p002firebaseauthapi;

import ba.r0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.b;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzacs extends zzady<Void, b.AbstractC0181b> {
    private final zzzj zzu;

    public zzacs(r0 r0Var, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, String str5, boolean z12) {
        super(8);
        m.k(r0Var);
        m.e(str);
        this.zzu = new zzzj(r0Var, str, str2, j10, z10, z11, str3, str4, str5, z12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
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
