package com.google.android.recaptcha.internal;

import le.n0;
import md.i0;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzao extends j implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzap zzc;
    final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzao(zzap zzapVar, zzdf zzdfVar, d dVar) {
        super(2, dVar);
        this.zzc = zzapVar;
        this.zzd = zzdfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzao(this.zzc, this.zzd, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = rd.b.e()
            int r1 = r6.zzb
            if (r1 == 0) goto L10
            java.lang.Object r0 = r6.zza
            md.u.b(r7)     // Catch: java.lang.Exception -> Le
            goto L60
        Le:
            r7 = move-exception
            goto L35
        L10:
            md.u.b(r7)
            ae.h0 r7 = new ae.h0
            r7.<init>()
            com.google.android.recaptcha.internal.zzan r1 = new com.google.android.recaptcha.internal.zzan     // Catch: java.lang.Exception -> L31
            com.google.android.recaptcha.internal.zzap r2 = r6.zzc     // Catch: java.lang.Exception -> L31
            com.google.android.recaptcha.internal.zzdf r3 = r6.zzd     // Catch: java.lang.Exception -> L31
            r4 = 0
            r1.<init>(r2, r3, r7, r4)     // Catch: java.lang.Exception -> L31
            r6.zza = r7     // Catch: java.lang.Exception -> L31
            r2 = 1
            r6.zzb = r2     // Catch: java.lang.Exception -> L31
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r7 = le.c3.c(r2, r1, r6)     // Catch: java.lang.Exception -> L31
            if (r7 != r0) goto L60
            return r0
        L31:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L35:
            com.google.android.recaptcha.internal.zzap r1 = r6.zzc
            le.x r1 = r1.zzf()
            ae.h0 r0 = (ae.h0) r0
            T r0 = r0.f712a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 != 0) goto L44
            r0 = r7
        L44:
            r1.a(r0)
            com.google.android.recaptcha.internal.zzap r0 = r6.zzc
            com.google.android.recaptcha.internal.zzat r1 = com.google.android.recaptcha.internal.zzat.zza
            com.google.android.recaptcha.internal.zzap.zzh(r0, r1)
            com.google.android.recaptcha.internal.zzdf r0 = r6.zzd
            com.google.android.recaptcha.internal.zzbj r1 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zza
            java.lang.String r7 = r7.getMessage()
            r1.<init>(r2, r3, r7)
            r0.zzb(r1)
        L60:
            md.i0 r7 = md.i0.f15558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzao.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
