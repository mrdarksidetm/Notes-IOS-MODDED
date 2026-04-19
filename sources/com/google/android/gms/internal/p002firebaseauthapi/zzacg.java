package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zzacg extends zzady<Void, Void> {
    private final zzagy zzu;

    public zzacg(String str, String str2, String str3, String str4) {
        super(15);
        this.zzu = zzagy.zzg().zzd(str).zza(str2).zzc(str4).zzb(str3).zza(zzaga.ACCESS_TOKEN).zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "revokeAccessToken";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource<Void> taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(null);
    }
}
