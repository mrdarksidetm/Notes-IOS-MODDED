package com.google.android.gms.internal.p002firebaseauthapi;

import ca.o1;
import ca.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzacq extends zzady<Void, o1> {
    private final String zzaa;
    private final String zzab;
    private final String zzac;
    private final boolean zzad;
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final long zzx;
    private final boolean zzy;
    private final boolean zzz;

    public zzacq(r rVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, String str5, boolean z12) {
        super(8);
        m.k(rVar);
        m.e(str);
        this.zzu = m.e(rVar.A());
        this.zzv = str;
        this.zzw = str2;
        this.zzx = j10;
        this.zzy = z10;
        this.zzz = z11;
        this.zzaa = str3;
        this.zzab = str4;
        this.zzac = str5;
        this.zzad = z12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaek
    public final void zza(TaskCompletionSource taskCompletionSource, zzadh zzadhVar) {
        this.zzg = new zzaef(this, taskCompletionSource);
        zzadhVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzady
    public final void zzb() {
    }
}
