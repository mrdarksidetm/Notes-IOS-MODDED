package com.google.android.gms.internal.p002firebaseauthapi;

import ba.c1;
import ba.j;
import ba.x1;
import ca.t;
import com.google.android.gms.common.api.Status;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzzk {
    private final zzaej zza;

    public zzzk(zzaej zzaejVar) {
        this.zza = (zzaej) m.k(zzaejVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzafn zzafnVar, zzade zzadeVar) {
        m.k(zzafnVar);
        m.k(zzadeVar);
        this.zza.zza(zzafnVar, new zzzr(this, zzadeVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagl zzaglVar, String str, String str2, Boolean bool, x1 x1Var, zzade zzadeVar, zzaem zzaemVar) {
        m.k(zzaglVar);
        m.k(zzaemVar);
        m.k(zzadeVar);
        this.zza.zza(new zzagc(zzaglVar.zzc()), new zzzs(this, zzaemVar, str2, str, bool, x1Var, zzadeVar, zzaglVar));
    }

    static /* synthetic */ void zza(zzzk zzzkVar, zzade zzadeVar, zzagl zzaglVar, zzage zzageVar, zzahb zzahbVar, zzaem zzaemVar) {
        m.k(zzadeVar);
        m.k(zzaglVar);
        m.k(zzageVar);
        m.k(zzahbVar);
        m.k(zzaemVar);
        zzzkVar.zza.zza(zzahbVar, new zzzt(zzzkVar, zzahbVar, zzageVar, zzadeVar, zzaglVar, zzaemVar));
    }

    static /* synthetic */ void zza(zzzk zzzkVar, zzade zzadeVar, zzagl zzaglVar, zzahb zzahbVar, zzaem zzaemVar) {
        m.k(zzadeVar);
        m.k(zzaglVar);
        m.k(zzahbVar);
        m.k(zzaemVar);
        zzzkVar.zza.zza(new zzagc(zzaglVar.zzc()), new zzzq(zzzkVar, zzaemVar, zzadeVar, zzaglVar, zzahbVar));
    }

    static /* synthetic */ void zza(zzzk zzzkVar, zzade zzadeVar, zzahg zzahgVar, zzaem zzaemVar) {
        m.k(zzadeVar);
        m.k(zzahgVar);
        m.k(zzaemVar);
        zzzkVar.zza.zza(zzahgVar, new zzaad(zzzkVar, zzadeVar, zzaemVar));
    }

    static /* synthetic */ void zza(zzzk zzzkVar, zzaht zzahtVar, zzade zzadeVar, zzaem zzaemVar) {
        if (!zzahtVar.zzo()) {
            zzzkVar.zza(new zzagl(zzahtVar.zzi(), zzahtVar.zze(), Long.valueOf(zzahtVar.zza()), "Bearer"), zzahtVar.zzh(), zzahtVar.zzg(), Boolean.valueOf(zzahtVar.zzn()), zzahtVar.zzb(), zzadeVar, zzaemVar);
            return;
        }
        zzadeVar.zza(new zzzi(zzahtVar.zzm() ? new Status(17012) : t.a(zzahtVar.zzd()), zzahtVar.zzb(), zzahtVar.zzc(), zzahtVar.zzj()));
    }

    private final void zza(String str, zzael<zzagl> zzaelVar) {
        m.k(zzaelVar);
        m.e(str);
        zzagl zzaglVarZzb = zzagl.zzb(str);
        if (zzaglVarZzb.zzg()) {
            zzaelVar.zza(zzaglVarZzb);
        } else {
            this.zza.zza(new zzafz(zzaglVarZzb.zzd()), new zzabh(this, zzaelVar));
        }
    }

    private final void zzd(zzagg zzaggVar, zzade zzadeVar) {
        m.k(zzaggVar);
        m.k(zzadeVar);
        this.zza.zza(zzaggVar, new zzaay(this, zzadeVar));
    }

    public final void zza(j jVar, String str, zzade zzadeVar) {
        m.k(jVar);
        m.k(zzadeVar);
        if (jVar.zzg()) {
            zza(jVar.C(), new zzzo(this, jVar, str, zzadeVar));
        } else {
            zza(new zzafn(jVar, null, str), zzadeVar);
        }
    }

    public final void zza(zzafp zzafpVar, String str, zzade zzadeVar) {
        m.k(zzafpVar);
        m.k(zzadeVar);
        zza(str, new zzaap(this, zzafpVar, zzadeVar));
    }

    public final void zza(zzafr zzafrVar, zzade zzadeVar) {
        m.k(zzafrVar);
        m.k(zzadeVar);
        this.zza.zza(zzafrVar, new zzaar(this, zzadeVar));
    }

    public final void zza(zzagg zzaggVar, zzade zzadeVar) {
        m.e(zzaggVar.zzd());
        m.k(zzadeVar);
        zzd(zzaggVar, zzadeVar);
    }

    public final void zza(zzagi zzagiVar, zzade zzadeVar) {
        m.k(zzagiVar);
        m.k(zzadeVar);
        this.zza.zza(zzagiVar, new zzaas(this, zzadeVar));
    }

    public final void zza(zzagj zzagjVar, zzade zzadeVar) {
        m.k(zzagjVar);
        m.k(zzadeVar);
        this.zza.zza(zzagjVar, new zzaat(this, zzadeVar));
    }

    public final void zza(zzagw zzagwVar, zzade zzadeVar) {
        m.e(zzagwVar.zzb());
        m.k(zzadeVar);
        this.zza.zza(zzagwVar, new zzzz(this, zzadeVar));
    }

    public final void zza(zzagy zzagyVar, zzade zzadeVar) {
        this.zza.zza(zzagyVar, new zzaba(this, zzadeVar));
    }

    public final void zza(zzagz zzagzVar, zzade zzadeVar) {
        m.e(zzagzVar.zzd());
        m.k(zzadeVar);
        this.zza.zza(zzagzVar, new zzzy(this, zzadeVar));
    }

    public final void zza(zzahi zzahiVar, zzade zzadeVar) {
        m.k(zzahiVar);
        m.k(zzadeVar);
        this.zza.zza(zzahiVar, new zzaam(this, zzahiVar, zzadeVar));
    }

    public final void zza(zzahk zzahkVar, zzade zzadeVar) {
        m.k(zzahkVar);
        m.k(zzadeVar);
        this.zza.zza(zzahkVar, new zzaaq(this, zzadeVar));
    }

    public final void zza(zzahr zzahrVar, zzade zzadeVar) {
        m.k(zzahrVar);
        m.k(zzadeVar);
        zzahrVar.zzb(true);
        this.zza.zza(zzahrVar, new zzaan(this, zzadeVar));
    }

    public final void zza(zzahw zzahwVar, zzade zzadeVar) {
        m.k(zzahwVar);
        m.k(zzadeVar);
        this.zza.zza(zzahwVar, new zzzw(this, zzadeVar));
    }

    public final void zza(zzaia zzaiaVar, zzade zzadeVar) {
        m.k(zzaiaVar);
        m.k(zzadeVar);
        this.zza.zza(zzaiaVar, new zzaab(this, zzadeVar));
    }

    public final void zza(String str, c1 c1Var, zzade zzadeVar) {
        m.e(str);
        m.k(c1Var);
        m.k(zzadeVar);
        zza(str, new zzabd(this, c1Var, zzadeVar));
    }

    public final void zza(String str, zzade zzadeVar) {
        m.e(str);
        m.k(zzadeVar);
        zza(str, new zzaax(this, zzadeVar));
    }

    public final void zza(String str, zzahr zzahrVar, zzade zzadeVar) {
        m.e(str);
        m.k(zzahrVar);
        m.k(zzadeVar);
        zza(str, new zzaae(this, zzahrVar, zzadeVar));
    }

    public final void zza(String str, zzaia zzaiaVar, zzade zzadeVar) {
        m.e(str);
        m.k(zzaiaVar);
        m.k(zzadeVar);
        zza(str, new zzaac(this, zzaiaVar, zzadeVar));
    }

    public final void zza(String str, String str2, zzade zzadeVar) {
        m.e(str);
        m.k(zzadeVar);
        zzahb zzahbVar = new zzahb();
        zzahbVar.zze(str);
        zzahbVar.zzh(str2);
        this.zza.zza(zzahbVar, new zzabe(this, zzadeVar));
    }

    public final void zza(String str, String str2, String str3, zzade zzadeVar) {
        m.e(str);
        m.e(str2);
        m.k(zzadeVar);
        zza(str, new zzaal(this, str2, str3, zzadeVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzade zzadeVar) {
        m.e(str);
        m.e(str2);
        m.k(zzadeVar);
        this.zza.zza(new zzahg(str, str2, null, str3, str4, null), new zzzm(this, zzadeVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzade zzadeVar) {
        m.e(str);
        m.e(str2);
        m.e(str3);
        m.k(zzadeVar);
        zza(str3, new zzaaa(this, str, str2, str4, str5, zzadeVar));
    }

    public final void zzb(zzagg zzaggVar, zzade zzadeVar) {
        m.e(zzaggVar.zzc());
        m.k(zzadeVar);
        this.zza.zza(zzaggVar, new zzzu(this, zzadeVar));
    }

    public final void zzb(String str, zzade zzadeVar) {
        m.e(str);
        m.k(zzadeVar);
        this.zza.zza(new zzafz(str), new zzzn(this, zzadeVar));
    }

    public final void zzb(String str, String str2, zzade zzadeVar) {
        m.e(str);
        m.e(str2);
        m.k(zzadeVar);
        zza(str, new zzabc(this, str2, zzadeVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzade zzadeVar) {
        m.e(str);
        m.e(str2);
        m.k(zzadeVar);
        this.zza.zza(new zzahy(str, str2, str3, str4), new zzzp(this, zzadeVar));
    }

    public final void zzc(zzagg zzaggVar, zzade zzadeVar) {
        zzd(zzaggVar, zzadeVar);
    }

    public final void zzc(String str, zzade zzadeVar) {
        m.e(str);
        m.k(zzadeVar);
        zza(str, new zzaav(this, zzadeVar));
    }

    public final void zzc(String str, String str2, zzade zzadeVar) {
        m.e(str);
        m.e(str2);
        m.k(zzadeVar);
        zza(str, new zzabf(this, str2, zzadeVar));
    }

    public final void zzd(String str, zzade zzadeVar) {
        m.k(zzadeVar);
        this.zza.zza(str, new zzaaz(this, zzadeVar));
    }

    public final void zzd(String str, String str2, zzade zzadeVar) {
        m.e(str);
        m.k(zzadeVar);
        this.zza.zza(new zzagw(str, null, str2), new zzzx(this, zzadeVar));
    }

    public final void zze(String str, zzade zzadeVar) {
        m.k(zzadeVar);
        this.zza.zza(new zzahg(str), new zzabb(this, zzadeVar));
    }

    public final void zze(String str, String str2, zzade zzadeVar) {
        m.e(str);
        m.k(zzadeVar);
        this.zza.zza(new zzafm(str, str2), new zzzv(this, zzadeVar));
    }

    public final void zzf(String str, zzade zzadeVar) {
        m.e(str);
        m.k(zzadeVar);
        zza(str, new zzaag(this, zzadeVar));
    }

    public final void zzf(String str, String str2, zzade zzadeVar) {
        m.e(str);
        m.e(str2);
        m.k(zzadeVar);
        zza(str2, new zzaaj(this, str, zzadeVar));
    }
}
