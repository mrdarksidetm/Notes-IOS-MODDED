package com.google.android.gms.internal.p002firebaseauthapi;

import ba.a0;
import ba.i;
import ba.i0;
import ca.c2;
import ca.g;
import ca.o1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzabr extends zzady<i, o1> {
    private final i0 zzu;
    private final String zzv;
    private final String zzw;

    public zzabr(i0 i0Var, String str, String str2) {
        super(2);
        this.zzu = (i0) m.k(i0Var);
        this.zzv = m.e(str);
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzv, this.zzu, this.zzw, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        g gVarZza = zzabj.zza(this.zzc, this.zzk);
        a0 a0Var = this.zzd;
        if (a0Var != null && !a0Var.d().equalsIgnoreCase(gVarZza.d())) {
            zza(new Status(17024));
        } else {
            ((o1) this.zze).a(this.zzj, gVarZza);
            zzb(new c2(gVarZza));
        }
    }
}
