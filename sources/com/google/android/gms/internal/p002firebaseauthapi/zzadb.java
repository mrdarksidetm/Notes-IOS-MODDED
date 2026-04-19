package com.google.android.gms.internal.p002firebaseauthapi;

import ba.c1;
import ca.o1;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzadb extends zzady<Void, o1> {
    private final c1 zzu;

    public zzadb(c1 c1Var) {
        super(2);
        this.zzu = (c1) m.l(c1Var, "request cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "updateProfile";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzd.zze(), this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        ((o1) this.zze).a(this.zzj, zzabj.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
