package com.google.android.gms.internal.p002firebaseauthapi;

import ba.e;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzada extends zzady<Void, Void> {
    private final zzagg zzu;

    public zzada(String str, String str2, e eVar) {
        super(6);
        m.e(str);
        m.e(str2);
        m.k(eVar);
        this.zzu = zzagg.zza(eVar, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zzc(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(null);
    }
}
