package com.google.android.recaptcha.internal;

import ae.r;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import le.i;
import le.k;
import md.n;
import qd.d;
import ue.a;
import ue.c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzco {
    private static zzcx zzb;
    public static final zzco zza = new zzco();
    private static final String zzc = UUID.randomUUID().toString();
    private static final a zzd = c.b(false, 1, null);
    private static final zzbo zzf = new zzbo();
    private static final zzl zze = new zzl(null, 1, 0 == true ? 1 : 0);

    static {
        int i10 = zzbb.zza;
        zzba.zzb(new zzbc(zzbf.class.getName().hashCode(), new zzbf(null, 1, null)), new zzbc(zzeb.class.getName().hashCode(), new zzeb()), new zzbc(zzbk.class.getName().hashCode(), new zzbk()));
    }

    private zzco() {
    }

    public static final /* synthetic */ zzcx zza(zzco zzcoVar, String str) throws zzbj {
        zzcx zzcxVar = zzb;
        if (zzcxVar == null) {
            return null;
        }
        if (r.b(zzcxVar.zze(), str)) {
            return zzcxVar;
        }
        throw new zzbj(zzbh.zzd, zzbg.zzan, null);
    }

    public static final Object zzg(Application application, String str, long j10, zzdq zzdqVar, d dVar) {
        return i.g(zzf.zzb().getCoroutineContext(), new zzcc(application, str, j10, null, null), dVar);
    }

    public static final Task zzh(Application application, String str, long j10) {
        return zzax.zza(k.b(zzf.zza(), null, null, new zzch(application, str, j10, null), 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzi(java.lang.String r15, android.app.Application r16, zd.p r17, qd.d r18) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzcn
            if (r1 == 0) goto L16
            r1 = r0
            com.google.android.recaptcha.internal.zzcn r1 = (com.google.android.recaptcha.internal.zzcn) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.zzc = r2
            r2 = r14
            goto L1c
        L16:
            com.google.android.recaptcha.internal.zzcn r1 = new com.google.android.recaptcha.internal.zzcn
            r2 = r14
            r1.<init>(r14, r0)
        L1c:
            java.lang.Object r0 = r1.zza
            java.lang.Object r3 = rd.b.e()
            int r4 = r1.zzc
            r5 = 1
            if (r4 == 0) goto L3c
            if (r4 != r5) goto L34
            com.google.android.recaptcha.internal.zzdf r1 = r1.zzd
            md.u.b(r0)     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.internal.zzbj -> L31
            goto L86
        L2f:
            r0 = move-exception
            goto L8d
        L31:
            r0 = move-exception
            goto La4
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            md.u.b(r0)
            com.google.android.recaptcha.internal.zzbv r0 = new com.google.android.recaptcha.internal.zzbv
            java.lang.String r4 = "https://www.recaptcha.net/recaptcha/api3"
            r0.<init>(r4)
            com.google.android.recaptcha.internal.zzbo r4 = com.google.android.recaptcha.internal.zzco.zzf
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            com.google.android.recaptcha.internal.zzdk r12 = new com.google.android.recaptcha.internal.zzdk
            com.google.android.recaptcha.internal.zzdm r7 = new com.google.android.recaptcha.internal.zzdm
            java.lang.String r0 = r0.zzc()
            r7.<init>(r0)
            le.n0 r0 = r4.zza()
            r4 = r16
            r12.<init>(r4, r7, r0)
            java.lang.String r9 = com.google.android.recaptcha.internal.zzco.zzc
            com.google.android.recaptcha.internal.zzdc r0 = new com.google.android.recaptcha.internal.zzdc
            r13 = 0
            r7 = r0
            r8 = r15
            r10 = r6
            r11 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.zzc(r6)
            r4 = 6
            com.google.android.recaptcha.internal.zzdf r4 = r0.zzf(r4)
            r1.zzd = r4     // Catch: java.lang.Exception -> L8b com.google.android.recaptcha.internal.zzbj -> La2
            r1.zzc = r5     // Catch: java.lang.Exception -> L8b com.google.android.recaptcha.internal.zzbj -> La2
            r5 = r17
            java.lang.Object r0 = r5.invoke(r0, r1)     // Catch: java.lang.Exception -> L8b com.google.android.recaptcha.internal.zzbj -> La2
            if (r0 == r3) goto L8a
            r1 = r4
        L86:
            r1.zza()     // Catch: java.lang.Exception -> L2f com.google.android.recaptcha.internal.zzbj -> L31
            return r0
        L8a:
            return r3
        L8b:
            r0 = move-exception
            r1 = r4
        L8d:
            com.google.android.recaptcha.internal.zzbj r3 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r4 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r5 = com.google.android.recaptcha.internal.zzbg.zza
            java.lang.String r0 = r0.getMessage()
            r3.<init>(r4, r5, r0)
            r1.zzb(r3)
            com.google.android.recaptcha.RecaptchaException r0 = r3.zzc()
            throw r0
        La2:
            r0 = move-exception
            r1 = r4
        La4:
            r1.zzb(r0)
            com.google.android.recaptcha.RecaptchaException r0 = r0.zzc()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzco.zzi(java.lang.String, android.app.Application, zd.p, qd.d):java.lang.Object");
    }

    private final void zzj(String str) throws zzbj {
        try {
            zzpj zzpjVarZzj = zzpj.zzj(zzhz.zzh().zzj(str));
            int i10 = zzbb.zza;
            ((zzeb) n.b(zzci.zza).getValue()).zza(zzpjVarZzj);
        } catch (Exception e10) {
            throw new zzbj(zzbh.zzl, zzbg.zzao, e10.getMessage());
        }
    }

    private final boolean zzk(Application application) {
        int i10 = zzbb.zza;
        return zzbk.zzb(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzl(android.app.Application r32, java.lang.String r33, long r34, com.google.android.recaptcha.internal.zzdc r36, com.google.android.recaptcha.internal.zzbv r37, android.webkit.WebView r38, com.google.android.recaptcha.internal.zzdq r39, com.google.android.recaptcha.internal.zzbo r40, qd.d r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzco.zzl(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzdc, com.google.android.recaptcha.internal.zzbv, android.webkit.WebView, com.google.android.recaptcha.internal.zzdq, com.google.android.recaptcha.internal.zzbo, qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzm(android.app.Application r16, java.lang.String r17, long r18, com.google.android.recaptcha.internal.zzbv r20, android.webkit.WebView r21, com.google.android.recaptcha.internal.zzdq r22, com.google.android.recaptcha.internal.zzbo r23, com.google.android.recaptcha.internal.zzdc r24, qd.d r25) throws java.lang.Throwable {
        /*
            r15 = this;
            r12 = r15
            r13 = r16
            r0 = r25
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzcm
            if (r1 == 0) goto L18
            r1 = r0
            com.google.android.recaptcha.internal.zzcm r1 = (com.google.android.recaptcha.internal.zzcm) r1
            int r2 = r1.zzd
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.zzd = r2
            goto L1d
        L18:
            com.google.android.recaptcha.internal.zzcm r1 = new com.google.android.recaptcha.internal.zzcm
            r1.<init>(r15, r0)
        L1d:
            r11 = r1
            java.lang.Object r0 = r11.zzb
            java.lang.Object r14 = rd.b.e()
            int r1 = r11.zzd
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L37
            java.lang.Object r1 = r11.zza
            com.google.android.recaptcha.internal.zzco r2 = r11.zze
            md.u.b(r0)     // Catch: com.google.android.recaptcha.internal.zzbj -> L34 java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83
            r13 = r1
            goto L6d
        L34:
            r0 = move-exception
            r13 = r1
            goto L87
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            md.u.b(r0)
            com.google.android.recaptcha.internal.zzbs r0 = new com.google.android.recaptcha.internal.zzbs     // Catch: java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83 com.google.android.recaptcha.internal.zzbj -> L85
            r0.<init>(r13)     // Catch: java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83 com.google.android.recaptcha.internal.zzbj -> L85
            com.google.android.recaptcha.internal.zzdo r1 = new com.google.android.recaptcha.internal.zzdo     // Catch: java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83 com.google.android.recaptcha.internal.zzbj -> L85
            r1.<init>()     // Catch: java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83 com.google.android.recaptcha.internal.zzbj -> L85
            com.google.android.recaptcha.internal.zzdq r9 = new com.google.android.recaptcha.internal.zzdq     // Catch: java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83 com.google.android.recaptcha.internal.zzbj -> L85
            r9.<init>(r0, r1)     // Catch: java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83 com.google.android.recaptcha.internal.zzbj -> L85
            r11.zze = r12     // Catch: java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83 com.google.android.recaptcha.internal.zzbj -> L85
            r11.zza = r13     // Catch: java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83 com.google.android.recaptcha.internal.zzbj -> L85
            r11.zzd = r2     // Catch: java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83 com.google.android.recaptcha.internal.zzbj -> L85
            r8 = 0
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r24
            r7 = r20
            r10 = r23
            java.lang.Object r0 = r1.zzl(r2, r3, r4, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83 com.google.android.recaptcha.internal.zzbj -> L85
            if (r0 != r14) goto L6c
            return r14
        L6c:
            r2 = r12
        L6d:
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0     // Catch: com.google.android.recaptcha.internal.zzbj -> L72 java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83
            com.google.android.recaptcha.internal.zzco.zzb = r0     // Catch: com.google.android.recaptcha.internal.zzbj -> L72 java.lang.Exception -> L74 com.google.android.recaptcha.RecaptchaException -> L83
            return r0
        L72:
            r0 = move-exception
            goto L87
        L74:
            r0 = move-exception
            com.google.android.recaptcha.internal.zzbj r1 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zza
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r2, r3, r0)
            throw r1
        L83:
            r0 = move-exception
            throw r0
        L85:
            r0 = move-exception
            r2 = r12
        L87:
            com.google.android.recaptcha.internal.zzbh r1 = r0.zzb()
            com.google.android.recaptcha.internal.zzbh r3 = com.google.android.recaptcha.internal.zzbh.zzc
            boolean r1 = ae.r.b(r1, r3)
            if (r1 == 0) goto La4
            android.app.Application r13 = (android.app.Application) r13
            boolean r1 = r2.zzk(r13)
            if (r1 != 0) goto La4
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbg r1 = com.google.android.recaptcha.internal.zzbg.zzap
            r2 = 0
            r0.<init>(r3, r1, r2)
            throw r0
        La4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzco.zzm(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzbv, android.webkit.WebView, com.google.android.recaptcha.internal.zzdq, com.google.android.recaptcha.internal.zzbo, com.google.android.recaptcha.internal.zzdc, qd.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v10, types: [ue.a] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [ue.a] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [ue.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(android.app.Application r23, java.lang.String r24, long r25, com.google.android.recaptcha.internal.zzbv r27, android.webkit.WebView r28, com.google.android.recaptcha.internal.zzdq r29, com.google.android.recaptcha.internal.zzbo r30, qd.d r31) throws java.lang.Throwable {
        /*
            r22 = this;
            r0 = r31
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzcd
            if (r1 == 0) goto L17
            r1 = r0
            com.google.android.recaptcha.internal.zzcd r1 = (com.google.android.recaptcha.internal.zzcd) r1
            int r2 = r1.zzf
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.zzf = r2
            r2 = r22
            goto L1e
        L17:
            com.google.android.recaptcha.internal.zzcd r1 = new com.google.android.recaptcha.internal.zzcd
            r2 = r22
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.zzd
            java.lang.Object r3 = rd.b.e()
            int r4 = r1.zzf
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L5c
            if (r4 == r6) goto L43
            if (r4 != r5) goto L3b
            java.lang.Object r1 = r1.zza
            ue.a r1 = (ue.a) r1
            md.u.b(r0)     // Catch: java.lang.Throwable -> L38
            goto Lb5
        L38:
            r0 = move-exception
            goto Lbd
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            long r8 = r1.zzc
            java.lang.Object r4 = r1.zzb
            com.google.android.recaptcha.internal.zzbo r6 = r1.zzi
            com.google.android.recaptcha.internal.zzbv r10 = r1.zzh
            java.lang.String r11 = r1.zzg
            java.lang.Object r12 = r1.zza
            android.app.Application r12 = (android.app.Application) r12
            md.u.b(r0)
            r16 = r6
            r13 = r10
            r0 = r11
            r6 = r4
            r4 = r12
            r11 = r8
            goto L84
        L5c:
            md.u.b(r0)
            ue.a r0 = com.google.android.recaptcha.internal.zzco.zzd
            r4 = r23
            r1.zza = r4
            r8 = r24
            r1.zzg = r8
            r9 = r27
            r1.zzh = r9
            r10 = r30
            r1.zzi = r10
            r1.zzb = r0
            r11 = r25
            r1.zzc = r11
            r1.zzf = r6
            java.lang.Object r6 = r0.a(r7, r1)
            if (r6 == r3) goto Lc1
            r6 = r0
            r0 = r8
            r13 = r9
            r16 = r10
        L84:
            com.google.android.recaptcha.internal.zzco r15 = com.google.android.recaptcha.internal.zzco.zza     // Catch: java.lang.Throwable -> Lbb
            com.google.android.recaptcha.internal.zzce r14 = new com.google.android.recaptcha.internal.zzce     // Catch: java.lang.Throwable -> Lbb
            r17 = 0
            r18 = 0
            r19 = 0
            r8 = r14
            r9 = r0
            r10 = r4
            r20 = r14
            r14 = r17
            r21 = r15
            r15 = r18
            r17 = r19
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lbb
            r1.zza = r6     // Catch: java.lang.Throwable -> Lbb
            r1.zzg = r7     // Catch: java.lang.Throwable -> Lbb
            r1.zzh = r7     // Catch: java.lang.Throwable -> Lbb
            r1.zzi = r7     // Catch: java.lang.Throwable -> Lbb
            r1.zzb = r7     // Catch: java.lang.Throwable -> Lbb
            r1.zzf = r5     // Catch: java.lang.Throwable -> Lbb
            r8 = r20
            r5 = r21
            java.lang.Object r0 = r5.zzi(r0, r4, r8, r1)     // Catch: java.lang.Throwable -> Lbb
            if (r0 == r3) goto Lc1
            r1 = r6
        Lb5:
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0     // Catch: java.lang.Throwable -> L38
            r1.b(r7)
            return r0
        Lbb:
            r0 = move-exception
            r1 = r6
        Lbd:
            r1.b(r7)
            throw r0
        Lc1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzco.zze(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzbv, android.webkit.WebView, com.google.android.recaptcha.internal.zzdq, com.google.android.recaptcha.internal.zzbo, qd.d):java.lang.Object");
    }
}
