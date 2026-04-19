package com.google.android.recaptcha.internal;

import le.n0;
import md.i0;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzdz extends j implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzek zzd;
    final /* synthetic */ zzea zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdz(zzek zzekVar, zzea zzeaVar, String str, d dVar) {
        super(2, dVar);
        this.zzd = zzekVar;
        this.zze = zzeaVar;
        this.zzf = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzdz(this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdz) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        if (r1.zzh(r7, r2, r6) != r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = rd.b.e()
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto L10
            md.u.b(r7)
            goto L84
        L10:
            java.lang.Object r1 = r6.zzb
            java.lang.Object r2 = r6.zza
            md.u.b(r7)     // Catch: java.lang.Exception -> L70
            goto L59
        L18:
            md.u.b(r7)
            com.google.android.recaptcha.internal.zzek r7 = r6.zzd
            com.google.android.recaptcha.internal.zzbt r1 = new com.google.android.recaptcha.internal.zzbt
            r1.<init>()
            r7.zza = r1
            java.lang.String r7 = r6.zzf     // Catch: java.lang.Exception -> L70
            com.google.android.recaptcha.internal.zzhz r1 = com.google.android.recaptcha.internal.zzhz.zzh()     // Catch: java.lang.Exception -> L70
            byte[] r7 = r1.zzj(r7)     // Catch: java.lang.Exception -> L70
            com.google.android.recaptcha.internal.zzro r7 = com.google.android.recaptcha.internal.zzro.zzi(r7)     // Catch: java.lang.Exception -> L70
            r7.zzf()     // Catch: java.lang.Exception -> L70
            com.google.android.recaptcha.internal.zzea r1 = r6.zze     // Catch: java.lang.Exception -> L70
            com.google.android.recaptcha.internal.zzge r1 = com.google.android.recaptcha.internal.zzea.zzb(r1)     // Catch: java.lang.Exception -> L70
            com.google.android.recaptcha.internal.zzrg r1 = r1.zza(r7)     // Catch: java.lang.Exception -> L70
            com.google.android.recaptcha.internal.zzgz r3 = com.google.android.recaptcha.internal.zzgz.zzb()     // Catch: java.lang.Exception -> L70
            com.google.android.recaptcha.internal.zzea r4 = r6.zze     // Catch: java.lang.Exception -> L70
            java.util.List r1 = r1.zzi()     // Catch: java.lang.Exception -> L70
            com.google.android.recaptcha.internal.zzek r5 = r6.zzd     // Catch: java.lang.Exception -> L70
            r6.zza = r7     // Catch: java.lang.Exception -> L70
            r6.zzb = r3     // Catch: java.lang.Exception -> L70
            r6.zzc = r2     // Catch: java.lang.Exception -> L70
            java.lang.Object r1 = com.google.android.recaptcha.internal.zzea.zzc(r4, r1, r5, r6)     // Catch: java.lang.Exception -> L70
            if (r1 == r0) goto L83
            r2 = r7
            r1 = r3
        L59:
            r7 = r1
            com.google.android.recaptcha.internal.zzgz r7 = (com.google.android.recaptcha.internal.zzgz) r7     // Catch: java.lang.Exception -> L70
            r7.zzf()     // Catch: java.lang.Exception -> L70
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.Exception -> L70
            com.google.android.recaptcha.internal.zzgz r1 = (com.google.android.recaptcha.internal.zzgz) r1     // Catch: java.lang.Exception -> L70
            long r3 = r1.zza(r7)     // Catch: java.lang.Exception -> L70
            sd.a.e(r3)     // Catch: java.lang.Exception -> L70
            com.google.android.recaptcha.internal.zzro r2 = (com.google.android.recaptcha.internal.zzro) r2     // Catch: java.lang.Exception -> L70
            r2.zzf()     // Catch: java.lang.Exception -> L70
            goto L84
        L70:
            r7 = move-exception
            com.google.android.recaptcha.internal.zzea r1 = r6.zze
            com.google.android.recaptcha.internal.zzek r2 = r6.zzd
            r3 = 0
            r6.zza = r3
            r6.zzb = r3
            r3 = 2
            r6.zzc = r3
            java.lang.Object r7 = com.google.android.recaptcha.internal.zzea.zzd(r1, r7, r2, r6)
            if (r7 != r0) goto L84
        L83:
            return r0
        L84:
            md.i0 r7 = md.i0.f15558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
