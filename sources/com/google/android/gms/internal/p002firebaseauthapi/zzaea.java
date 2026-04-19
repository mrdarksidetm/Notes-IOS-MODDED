package com.google.android.gms.internal.p002firebaseauthapi;

import ba.h;
import ba.o0;
import ca.t;
import ca.z;
import com.google.android.gms.common.api.Status;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
final class zzaea implements zzadf {
    final /* synthetic */ zzady zza;

    zzaea(zzady zzadyVar) {
        this.zza = zzadyVar;
    }

    private final void zza(Status status, h hVar, String str, String str2) {
        zzady.zza(this.zza, status);
        zzady zzadyVar = this.zza;
        zzadyVar.zzn = hVar;
        zzadyVar.zzo = str;
        zzadyVar.zzp = str2;
        z zVar = zzadyVar.zzf;
        if (zVar != null) {
            zVar.zza(status);
        }
        this.zza.zza(status);
    }

    private final void zza(zzaeg zzaegVar) {
        this.zza.zzi.execute(new zzaed(this, zzaegVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza() {
        int i10 = this.zza.zza;
        m.o(i10 == 5, "Unexpected response type " + i10);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(o0 o0Var) {
        int i10 = this.zza.zza;
        m.o(i10 == 8, "Unexpected response type " + i10);
        this.zza.zzu = true;
        zza(new zzaec(this, o0Var));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(Status status) {
        String strZ = status.z();
        if (strZ != null) {
            if (strZ.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (strZ.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (strZ.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (strZ.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (strZ.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (strZ.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (strZ.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (strZ.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (strZ.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (strZ.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzady zzadyVar = this.zza;
        if (zzadyVar.zza == 8) {
            zzadyVar.zzu = true;
            zza(new zzaee(this, status));
        } else {
            zzady.zza(zzadyVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(Status status, o0 o0Var) {
        int i10 = this.zza.zza;
        m.o(i10 == 2, "Unexpected response type " + i10);
        zza(status, o0Var, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzafl zzaflVar) {
        int i10 = this.zza.zza;
        m.o(i10 == 3, "Unexpected response type " + i10);
        zzady zzadyVar = this.zza;
        zzadyVar.zzl = zzaflVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagh zzaghVar) {
        zzady zzadyVar = this.zza;
        zzadyVar.zzs = zzaghVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagl zzaglVar) {
        int i10 = this.zza.zza;
        m.o(i10 == 1, "Unexpected response type: " + i10);
        zzady zzadyVar = this.zza;
        zzadyVar.zzj = zzaglVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagl zzaglVar, zzage zzageVar) {
        int i10 = this.zza.zza;
        m.o(i10 == 2, "Unexpected response type: " + i10);
        zzady zzadyVar = this.zza;
        zzadyVar.zzj = zzaglVar;
        zzadyVar.zzk = zzageVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagm zzagmVar) {
        zzady zzadyVar = this.zza;
        zzadyVar.zzr = zzagmVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagv zzagvVar) {
        int i10 = this.zza.zza;
        m.o(i10 == 4, "Unexpected response type " + i10);
        zzady zzadyVar = this.zza;
        zzadyVar.zzm = zzagvVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzaha zzahaVar) {
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzahh zzahhVar) {
        zzady zzadyVar = this.zza;
        zzadyVar.zzt = zzahhVar;
        zzady.zza(zzadyVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzzi zzziVar) {
        zza(zzziVar.zza(), zzziVar.zzb(), zzziVar.zzc(), zzziVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzzl zzzlVar) {
        zzady zzadyVar = this.zza;
        zzadyVar.zzq = zzzlVar;
        zzadyVar.zza(t.a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(String str) {
        int i10 = this.zza.zza;
        m.o(i10 == 8, "Unexpected response type " + i10);
        this.zza.zzu = true;
        zza(new zzaeb(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzb() {
        int i10 = this.zza.zza;
        m.o(i10 == 6, "Unexpected response type " + i10);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzb(String str) {
        int i10 = this.zza.zza;
        m.o(i10 == 8, "Unexpected response type " + i10);
        zza(new zzadz(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzc() {
        int i10 = this.zza.zza;
        m.o(i10 == 9, "Unexpected response type " + i10);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzc(String str) {
        int i10 = this.zza.zza;
        m.o(i10 == 7, "Unexpected response type " + i10);
        zzady.zza(this.zza);
    }
}
