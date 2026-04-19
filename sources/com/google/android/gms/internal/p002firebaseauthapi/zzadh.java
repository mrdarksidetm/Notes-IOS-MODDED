package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import ba.c1;
import ba.i0;
import ba.o0;
import ba.p0;
import ba.v0;
import ba.y0;
import java.util.concurrent.ScheduledExecutorService;
import w8.m;
import x9.f;
import z8.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzadh {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzzk zzb;
    private final zzaew zzc;

    zzadh(f fVar, ScheduledExecutorService scheduledExecutorService) {
        m.k(fVar);
        Context contextL = fVar.l();
        m.k(contextL);
        this.zzb = new zzzk(new zzadv(fVar, zzads.zza()));
        this.zzc = new zzaew(contextL, scheduledExecutorService);
    }

    private static boolean zza(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void zza(i0 i0Var, String str, String str2, String str3, zzadf zzadfVar) {
        zzafp zzafpVarZza;
        m.k(i0Var);
        m.f(str, "cachedTokenState should not be empty.");
        m.k(zzadfVar);
        if (i0Var instanceof p0) {
            o0 o0VarA = ((p0) i0Var).a();
            zzafpVarZza = zzaft.zza(str, (String) m.k(o0VarA.zzc()), (String) m.k(o0VarA.A()), str2, str3);
        } else {
            if (!(i0Var instanceof v0)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            v0 v0Var = (v0) i0Var;
            zzafpVarZza = zzafv.zza(str, m.e(str2), m.e(((y0) m.k(v0Var.a())).c()), m.e(v0Var.c()), str3);
        }
        this.zzb.zza(zzafpVarZza, str, new zzade(zzadfVar, zza));
    }

    public final void zza(zzafn zzafnVar, zzadf zzadfVar) {
        m.k(zzadfVar);
        m.k(zzafnVar.zzb());
        this.zzb.zza(zzafnVar.zzb(), zzafnVar.zzc(), new zzade(zzadfVar, zza));
    }

    public final void zza(zzagg zzaggVar, zzadf zzadfVar) {
        m.k(zzaggVar);
        m.e(zzaggVar.zzd());
        m.k(zzadfVar);
        this.zzb.zza(zzaggVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagi zzagiVar, zzadf zzadfVar) {
        m.k(zzagiVar);
        this.zzb.zza(zzagiVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagj zzagjVar, zzadf zzadfVar) {
        m.k(zzagjVar);
        this.zzb.zza(zzagjVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagp zzagpVar, zzadf zzadfVar) {
        m.k(zzadfVar);
        m.k(zzagpVar);
        this.zzb.zza(m.e(zzagpVar.zzb()), zzagpVar.zza(), new zzade(zzadfVar, zza));
    }

    public final void zza(zzagw zzagwVar, zzadf zzadfVar) {
        m.k(zzagwVar);
        m.e(zzagwVar.zzb());
        m.k(zzadfVar);
        this.zzb.zza(zzagwVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagy zzagyVar, zzadf zzadfVar) {
        m.k(zzagyVar);
        this.zzb.zza(zzagyVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzagz zzagzVar, zzadf zzadfVar) {
        m.k(zzadfVar);
        m.k(zzagzVar);
        String strZzd = zzagzVar.zzd();
        zzade zzadeVar = new zzade(zzadfVar, zza);
        if (this.zzc.zzd(strZzd)) {
            if (!zzagzVar.zze()) {
                this.zzc.zzb(zzadeVar, strZzd);
                return;
            }
            this.zzc.zzc(strZzd);
        }
        long jZzb = zzagzVar.zzb();
        boolean zZzf = zzagzVar.zzf();
        if (zza(jZzb, zZzf)) {
            zzagzVar.zza(new zzafg(this.zzc.zzb()));
        }
        this.zzc.zza(strZzd, zzadeVar, jZzb, zZzf);
        this.zzb.zza(zzagzVar, this.zzc.zza(zzadeVar, strZzd));
    }

    public final void zza(zzahd zzahdVar, zzadf zzadfVar) {
        m.k(zzahdVar);
        m.k(zzadfVar);
        this.zzb.zzd(zzahdVar.zza(), new zzade(zzadfVar, zza));
    }

    public final void zza(zzaho zzahoVar, zzadf zzadfVar) {
        this.zzb.zza(zzahoVar, new zzade((zzadf) m.k(zzadfVar), zza));
    }

    public final void zza(zzahr zzahrVar, zzadf zzadfVar) {
        m.k(zzahrVar);
        m.k(zzadfVar);
        this.zzb.zza(zzahrVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzahw zzahwVar, zzadf zzadfVar) {
        m.k(zzahwVar);
        m.k(zzadfVar);
        this.zzb.zza(zzahwVar, new zzade(zzadfVar, zza));
    }

    public final void zza(zzzg zzzgVar, zzadf zzadfVar) {
        m.k(zzadfVar);
        m.k(zzzgVar);
        this.zzb.zza(zzaeq.zza((o0) m.k(zzzgVar.zza())), new zzade(zzadfVar, zza));
    }

    public final void zza(zzzj zzzjVar, zzadf zzadfVar) {
        m.k(zzzjVar);
        m.k(zzadfVar);
        String strG = zzzjVar.zzb().g();
        zzade zzadeVar = new zzade(zzadfVar, zza);
        if (this.zzc.zzd(strG)) {
            if (!zzzjVar.zzh()) {
                this.zzc.zzb(zzadeVar, strG);
                return;
            }
            this.zzc.zzc(strG);
        }
        long jZza = zzzjVar.zza();
        boolean zZzi = zzzjVar.zzi();
        zzahk zzahkVarZza = zzahk.zza(zzzjVar.zze(), zzzjVar.zzb().d(), zzzjVar.zzb().g(), zzzjVar.zzd(), zzzjVar.zzg(), zzzjVar.zzf(), zzzjVar.zzc());
        if (zza(jZza, zZzi)) {
            zzahkVarZza.zza(new zzafg(this.zzc.zzb()));
        }
        this.zzc.zza(strG, zzadeVar, jZza, zZzi);
        this.zzb.zza(zzahkVarZza, this.zzc.zza(zzadeVar, strG));
    }

    public final void zza(String str, c1 c1Var, zzadf zzadfVar) {
        m.e(str);
        m.k(c1Var);
        m.k(zzadfVar);
        this.zzb.zza(str, c1Var, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, i0 i0Var, String str2, zzadf zzadfVar) {
        zzzk zzzkVar;
        zzafr zzafrVarZza;
        zzade zzadeVar;
        m.e(str);
        m.k(i0Var);
        m.k(zzadfVar);
        if (i0Var instanceof p0) {
            o0 o0VarA = ((p0) i0Var).a();
            zzzkVar = this.zzb;
            zzafrVarZza = zzafw.zza(str, (String) m.k(o0VarA.zzc()), (String) m.k(o0VarA.A()), str2);
            zzadeVar = new zzade(zzadfVar, zza);
        } else {
            if (!(i0Var instanceof v0)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            v0 v0Var = (v0) i0Var;
            zzzkVar = this.zzb;
            zzafrVarZza = zzafy.zza(str, m.e(v0Var.c()), str2, m.e(v0Var.b()));
            zzadeVar = new zzade(zzadfVar, zza);
        }
        zzzkVar.zza(zzafrVarZza, zzadeVar);
    }

    public final void zza(String str, zzadf zzadfVar) {
        m.e(str);
        m.k(zzadfVar);
        this.zzb.zza(str, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, zzahr zzahrVar, zzadf zzadfVar) {
        m.e(str);
        m.k(zzahrVar);
        m.k(zzadfVar);
        this.zzb.zza(str, zzahrVar, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, String str2, zzadf zzadfVar) {
        m.e(str);
        m.k(zzadfVar);
        this.zzb.zza(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, String str6, boolean z12, zzadf zzadfVar) {
        m.f(str, "idToken should not be empty.");
        m.k(zzadfVar);
        zzade zzadeVar = new zzade(zzadfVar, zza);
        if (this.zzc.zzd(str2)) {
            zzaew zzaewVar = this.zzc;
            if (!z10) {
                zzaewVar.zzb(zzadeVar, str2);
                return;
            }
            zzaewVar.zzc(str2);
        }
        zzahm zzahmVarZza = zzahm.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j10, z12)) {
            zzahmVarZza.zza(new zzafg(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzadeVar, j10, z12);
        this.zzb.zza(zzahmVarZza, this.zzc.zza(zzadeVar, str2));
    }

    public final void zza(String str, String str2, String str3, zzadf zzadfVar) {
        m.f(str, "cachedTokenState should not be empty.");
        m.f(str2, "uid should not be empty.");
        m.k(zzadfVar);
        this.zzb.zza(str, str2, str3, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzadf zzadfVar) {
        m.e(str);
        m.e(str2);
        m.k(zzadfVar);
        this.zzb.zza(str, str2, str3, str4, new zzade(zzadfVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzadf zzadfVar) {
        m.e(str);
        m.e(str2);
        m.e(str3);
        m.k(zzadfVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzade(zzadfVar, zza));
    }

    public final void zzb(zzagg zzaggVar, zzadf zzadfVar) {
        m.k(zzaggVar);
        m.e(zzaggVar.zzc());
        m.k(zzadfVar);
        this.zzb.zzb(zzaggVar, new zzade(zzadfVar, zza));
    }

    public final void zzb(String str, zzadf zzadfVar) {
        m.e(str);
        m.k(zzadfVar);
        this.zzb.zzb(str, new zzade(zzadfVar, zza));
    }

    public final void zzb(String str, String str2, zzadf zzadfVar) {
        m.e(str);
        m.e(str2);
        m.k(zzadfVar);
        this.zzb.zzb(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzadf zzadfVar) {
        m.e(str);
        m.e(str2);
        m.k(zzadfVar);
        m.k(zzadfVar);
        this.zzb.zzb(str, str2, str3, str4, new zzade(zzadfVar, zza));
    }

    public final void zzc(zzagg zzaggVar, zzadf zzadfVar) {
        m.k(zzaggVar);
        this.zzb.zzc(zzaggVar, new zzade(zzadfVar, zza));
    }

    public final void zzc(String str, zzadf zzadfVar) {
        m.e(str);
        m.k(zzadfVar);
        this.zzb.zzc(str, new zzade(zzadfVar, zza));
    }

    public final void zzc(String str, String str2, zzadf zzadfVar) {
        m.e(str);
        m.e(str2);
        m.k(zzadfVar);
        this.zzb.zzc(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zzd(String str, zzadf zzadfVar) {
        m.k(zzadfVar);
        this.zzb.zze(str, new zzade(zzadfVar, zza));
    }

    public final void zzd(String str, String str2, zzadf zzadfVar) {
        m.e(str);
        m.k(zzadfVar);
        this.zzb.zzd(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zze(String str, zzadf zzadfVar) {
        m.e(str);
        m.k(zzadfVar);
        this.zzb.zzf(str, new zzade(zzadfVar, zza));
    }

    public final void zze(String str, String str2, zzadf zzadfVar) {
        m.e(str);
        this.zzb.zze(str, str2, new zzade(zzadfVar, zza));
    }

    public final void zzf(String str, String str2, zzadf zzadfVar) {
        m.e(str);
        m.e(str2);
        m.k(zzadfVar);
        this.zzb.zzf(str, str2, new zzade(zzadfVar, zza));
    }
}
