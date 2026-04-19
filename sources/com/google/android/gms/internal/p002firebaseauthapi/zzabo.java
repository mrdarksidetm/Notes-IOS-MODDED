package com.google.android.gms.internal.p002firebaseauthapi;

import ba.i0;
import ca.o1;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzabo extends zzady<Void, o1> {
    private final i0 zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzabo(i0 i0Var, String str, String str2, String str3) {
        super(2);
        this.zzu = (i0) m.k(i0Var);
        this.zzv = m.e(str);
        this.zzw = str2;
        this.zzx = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        ((o1) this.zze).a(this.zzj, zzabj.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
