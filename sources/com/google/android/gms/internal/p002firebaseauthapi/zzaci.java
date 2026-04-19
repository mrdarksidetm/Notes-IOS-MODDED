package com.google.android.gms.internal.p002firebaseauthapi;

import ba.e;
import ca.o1;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzaci extends zzady<Void, o1> {
    private final zzagg zzu;
    private final String zzv;

    public zzaci(String str, e eVar, String str2, String str3, String str4) {
        super(4);
        m.f(str, "email cannot be null or empty");
        zzagg zzaggVar = new zzagg(eVar.E());
        this.zzu = zzaggVar;
        zzaggVar.zzb(str);
        zzaggVar.zza(eVar);
        zzaggVar.zzc(str2);
        zzaggVar.zza(str3);
        this.zzv = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zzb(this.zzu, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
        zzb(null);
    }
}
