package com.google.android.recaptcha.internal;

import ae.r;
import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import md.x;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbj extends Exception {
    public static final /* synthetic */ int zza = 0;
    private static final Map zzb;
    private final zzbh zzc;
    private final zzbg zzd;
    private final String zze;
    private final Map zzf;

    static {
        zzrc zzrcVar = zzrc.JS_INTERNAL_ERROR;
        zzbh zzbhVar = zzbh.zzb;
        zzb = r0.h(x.a(zzrc.JS_NETWORK_ERROR, new zzbj(zzbh.zzc, zzbg.zzd, null)), x.a(zzrcVar, new zzbj(zzbhVar, zzbg.zzc, null)), x.a(zzrc.JS_INVALID_SITE_KEY, new zzbj(zzbh.zzd, zzbg.zze, null)), x.a(zzrc.JS_INVALID_SITE_KEY_TYPE, new zzbj(zzbh.zze, zzbg.zzf, null)), x.a(zzrc.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzbj(zzbh.zzf, zzbg.zzg, null)), x.a(zzrc.JS_INVALID_ACTION, new zzbj(zzbh.zzg, zzbg.zzh, null)), x.a(zzrc.JS_PROGRAM_ERROR, new zzbj(zzbhVar, zzbg.zzj, null)));
    }

    public zzbj(zzbh zzbhVar, zzbg zzbgVar, String str) {
        this.zzc = zzbhVar;
        this.zzd = zzbgVar;
        this.zze = str;
        zzbh zzbhVar2 = zzbh.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzf = r0.h(x.a(zzbhVar2, new RecaptchaException(recaptchaErrorCode, null, 2, null)), x.a(zzbh.zzh, new RecaptchaException(recaptchaErrorCode, null, 2, null)), x.a(zzbh.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), x.a(zzbh.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), x.a(zzbh.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), x.a(zzbh.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), x.a(zzbh.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), x.a(zzbh.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));
    }

    public final zzbg zza() {
        return this.zzd;
    }

    public final zzbh zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        if (r.b(this.zzd, zzbg.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (r.b(this.zzd, zzbg.zzap)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }
}
