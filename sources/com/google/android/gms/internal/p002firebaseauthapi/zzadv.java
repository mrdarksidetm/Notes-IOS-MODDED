package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import w8.m;
import x9.f;

/* JADX INFO: loaded from: classes.dex */
final class zzadv extends zzaej implements zzafd {
    private zzadp zza;
    private zzado zzb;
    private zzaes zzc;
    private final zzads zzd;
    private final f zze;
    private String zzf;
    private zzadu zzg;

    zzadv(f fVar, zzads zzadsVar) {
        this(fVar, zzadsVar, null, null, null);
    }

    private zzadv(f fVar, zzads zzadsVar, zzaes zzaesVar, zzadp zzadpVar, zzado zzadoVar) {
        this.zze = fVar;
        this.zzf = fVar.q().b();
        this.zzd = (zzads) m.k(zzadsVar);
        zza(null, null, null);
        zzafb.zza(this.zzf, this);
    }

    private final void zza(zzaes zzaesVar, zzadp zzadpVar, zzado zzadoVar) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String strZza = zzafc.zza("firebear.secureToken");
        if (TextUtils.isEmpty(strZza)) {
            strZza = zzafb.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + strZza);
        }
        if (this.zzc == null) {
            this.zzc = new zzaes(strZza, zzb());
        }
        String strZza2 = zzafc.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza2)) {
            strZza2 = zzafb.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + strZza2);
        }
        if (this.zza == null) {
            this.zza = new zzadp(strZza2, zzb());
        }
        String strZza3 = zzafc.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strZza3)) {
            strZza3 = zzafb.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + strZza3);
        }
        if (this.zzb == null) {
            this.zzb = new zzado(strZza3, zzb());
        }
    }

    private final zzadu zzb() {
        if (this.zzg == null) {
            this.zzg = new zzadu(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza() {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafm zzafmVar, zzael<zzafl> zzaelVar) {
        m.k(zzafmVar);
        m.k(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/createAuthUri", this.zzf), zzafmVar, zzaelVar, zzafl.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafn zzafnVar, zzael<zzafq> zzaelVar) {
        m.k(zzafnVar);
        m.k(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/emailLinkSignin", this.zzf), zzafnVar, zzaelVar, zzafq.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafo zzafoVar, zzael<Void> zzaelVar) {
        m.k(zzafoVar);
        m.k(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/deleteAccount", this.zzf), zzafoVar, zzaelVar, Void.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafp zzafpVar, zzael<zzafs> zzaelVar) {
        m.k(zzafpVar);
        m.k(zzaelVar);
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzafpVar, zzaelVar, zzafs.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafr zzafrVar, zzael<zzafu> zzaelVar) {
        m.k(zzafrVar);
        m.k(zzaelVar);
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzafrVar, zzaelVar, zzafu.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafz zzafzVar, zzael<zzagl> zzaelVar) {
        m.k(zzafzVar);
        m.k(zzaelVar);
        zzaes zzaesVar = this.zzc;
        zzaeo.zza(zzaesVar.zza("/token", this.zzf), zzafzVar, zzaelVar, zzagl.class, zzaesVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagc zzagcVar, zzael<zzagb> zzaelVar) {
        m.k(zzagcVar);
        m.k(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/getAccountInfo", this.zzf), zzagcVar, zzaelVar, zzagb.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagg zzaggVar, zzael<zzagf> zzaelVar) {
        m.k(zzaggVar);
        m.k(zzaelVar);
        if (zzaggVar.zzb() != null) {
            zzb().zzb(zzaggVar.zzb().zzf());
        }
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/getOobConfirmationCode", this.zzf), zzaggVar, zzaelVar, zzagf.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagi zzagiVar, zzael<zzagh> zzaelVar) {
        m.k(zzagiVar);
        m.k(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/getRecaptchaParam", this.zzf), zzaelVar, zzagh.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagj zzagjVar, zzael<zzagm> zzaelVar) {
        m.k(zzagjVar);
        m.k(zzaelVar);
        zzado zzadoVar = this.zzb;
        String str = zzadoVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzagjVar.zzb() + "&version=" + zzagjVar.zzc();
        if (!zzag.zzc(zzagjVar.zzd())) {
            str = str + "&tenantId=" + zzagjVar.zzd();
        }
        zzaeo.zza(str, zzaelVar, zzagm.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagw zzagwVar, zzael<zzagv> zzaelVar) {
        m.k(zzagwVar);
        m.k(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/resetPassword", this.zzf), zzagwVar, zzaelVar, zzagv.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagy zzagyVar, zzael<zzaha> zzaelVar) {
        m.k(zzagyVar);
        m.k(zzaelVar);
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts:revokeToken", this.zzf), zzagyVar, zzaelVar, zzaha.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagz zzagzVar, zzael<zzahc> zzaelVar) {
        m.k(zzagzVar);
        m.k(zzaelVar);
        if (!TextUtils.isEmpty(zzagzVar.zzc())) {
            zzb().zzb(zzagzVar.zzc());
        }
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/sendVerificationCode", this.zzf), zzagzVar, zzaelVar, zzahc.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahb zzahbVar, zzael<zzahe> zzaelVar) {
        m.k(zzahbVar);
        m.k(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/setAccountInfo", this.zzf), zzahbVar, zzaelVar, zzahe.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahg zzahgVar, zzael<zzahf> zzaelVar) {
        m.k(zzahgVar);
        m.k(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/signupNewUser", this.zzf), zzahgVar, zzaelVar, zzahf.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahi zzahiVar, zzael<zzahh> zzaelVar) {
        m.k(zzahiVar);
        m.k(zzaelVar);
        if (zzahiVar instanceof zzahm) {
            zzahm zzahmVar = (zzahm) zzahiVar;
            if (!TextUtils.isEmpty(zzahmVar.zzb())) {
                zzb().zzb(zzahmVar.zzb());
            }
        }
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzahiVar, zzaelVar, zzahh.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahk zzahkVar, zzael<zzahj> zzaelVar) {
        m.k(zzahkVar);
        m.k(zzaelVar);
        if (!TextUtils.isEmpty(zzahkVar.zzb())) {
            zzb().zzb(zzahkVar.zzb());
        }
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaSignIn:start", this.zzf), zzahkVar, zzaelVar, zzahj.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahr zzahrVar, zzael<zzaht> zzaelVar) {
        m.k(zzahrVar);
        m.k(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/verifyAssertion", this.zzf), zzahrVar, zzaelVar, zzaht.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahw zzahwVar, zzael<zzahv> zzaelVar) {
        m.k(zzahwVar);
        m.k(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/verifyCustomToken", this.zzf), zzahwVar, zzaelVar, zzahv.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahy zzahyVar, zzael<zzahx> zzaelVar) {
        m.k(zzahyVar);
        m.k(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/verifyPassword", this.zzf), zzahyVar, zzaelVar, zzahx.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzaia zzaiaVar, zzael<zzahz> zzaelVar) {
        m.k(zzaiaVar);
        m.k(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/verifyPhoneNumber", this.zzf), zzaiaVar, zzaelVar, zzahz.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzaic zzaicVar, zzael<zzaib> zzaelVar) {
        m.k(zzaicVar);
        m.k(zzaelVar);
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzaicVar, zzaelVar, zzaib.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(String str, zzael<Void> zzaelVar) {
        m.k(zzaelVar);
        zzb().zza(str);
        zzaelVar.zza((Void) null);
    }
}
