package com.google.android.gms.internal.p002firebaseauthapi;

import ca.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzact extends zzady<zzahh, Void> {
    private final zzaho zzu;

    public zzact(r rVar, String str) {
        super(12);
        m.k(rVar);
        this.zzu = zzaho.zza(m.e(rVar.A()), str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(this.zzt);
    }
}
