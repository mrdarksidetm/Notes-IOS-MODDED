package com.google.android.gms.internal.p002firebaseauthapi;

import ba.i;
import ba.j;
import ca.c2;
import ca.g;
import ca.o1;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzabv extends zzady<i, o1> {
    private final j zzu;
    private final String zzv;

    public zzabv(j jVar, String str) {
        super(2);
        this.zzu = (j) m.l(jVar, "credential cannot be null");
        m.f(jVar.zzc(), "email cannot be null");
        m.f(jVar.zzd(), "password cannot be null");
        this.zzv = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu.zzc(), m.e(this.zzu.zzd()), this.zzd.zze(), this.zzd.C(), this.zzv, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        g gVarZza = zzabj.zza(this.zzc, this.zzk);
        ((o1) this.zze).a(this.zzj, gVarZza);
        zzb(new c2(gVarZza));
    }
}
