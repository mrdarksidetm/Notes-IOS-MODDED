package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import ge.o;
import java.util.LinkedHashMap;
import java.util.List;
import je.j;
import le.k;
import md.s;
import md.x;
import nd.q0;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcx implements RecaptchaClient, RecaptchaTasksClient {
    private static final j zza = new j("^[a-zA-Z0-9/_]{0,100}$");
    private final Application zzb;
    private final zzl zzc;
    private final String zzd;
    private final zzbv zze;
    private final zzpq zzf;
    private final zzdc zzg;
    private final zzbl zzh;
    private final zzbo zzi;

    public zzcx(Application application, zzl zzlVar, String str, zzbo zzboVar, zzbv zzbvVar, zzpq zzpqVar, zzdc zzdcVar, zzbl zzblVar, zzds zzdsVar) {
        this.zzb = application;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zzi = zzboVar;
        this.zze = zzbvVar;
        this.zzf = zzpqVar;
        this.zzg = zzdcVar;
        this.zzh = zzblVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzf(long r5, java.lang.String r7, com.google.android.recaptcha.internal.zzdc r8, qd.d r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzcp
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzcp r0 = (com.google.android.recaptcha.internal.zzcp) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcp r0 = new com.google.android.recaptcha.internal.zzcp
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.zza
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.google.android.recaptcha.internal.zzdf r5 = r0.zzd
            md.u.b(r9)     // Catch: java.lang.Exception -> L2b
            goto L4b
        L2b:
            r6 = move-exception
            goto L55
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            md.u.b(r9)
            r9 = 27
            com.google.android.recaptcha.internal.zzdf r8 = r8.zzf(r9)
            com.google.android.recaptcha.internal.zzl r9 = r4.zzc     // Catch: java.lang.Exception -> L52
            r0.zzd = r8     // Catch: java.lang.Exception -> L52
            r0.zzc = r3     // Catch: java.lang.Exception -> L52
            java.lang.Object r9 = r9.zzb(r7, r5, r0)     // Catch: java.lang.Exception -> L52
            if (r9 == r1) goto L51
            r5 = r8
        L4b:
            com.google.android.recaptcha.internal.zzpw r9 = (com.google.android.recaptcha.internal.zzpw) r9     // Catch: java.lang.Exception -> L2b
            r5.zza()     // Catch: java.lang.Exception -> L2b
            return r9
        L51:
            return r1
        L52:
            r5 = move-exception
            r6 = r5
            r5 = r8
        L55:
            boolean r7 = r6 instanceof com.google.android.recaptcha.internal.zzbj
            if (r7 == 0) goto L5c
            com.google.android.recaptcha.internal.zzbj r6 = (com.google.android.recaptcha.internal.zzbj) r6
            goto L66
        L5c:
            com.google.android.recaptcha.internal.zzbj r6 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r7 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r8 = com.google.android.recaptcha.internal.zzbg.zzaa
            r9 = 0
            r6.<init>(r7, r8, r9)
        L66:
            r5.zzb(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.zzf(long, java.lang.String, com.google.android.recaptcha.internal.zzdc, qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzg(com.google.android.recaptcha.RecaptchaAction r25, long r26, qd.d r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.zzg(com.google.android.recaptcha.RecaptchaAction, long, qd.d):java.lang.Object");
    }

    private final void zzh(zzqf zzqfVar, zzdc zzdcVar) throws zzbj {
        zzdf zzdfVarZzf = zzdcVar.zzf(29);
        try {
            List<zzqh> listZzk = zzqfVar.zzk();
            LinkedHashMap linkedHashMap = new LinkedHashMap(o.d(q0.b(v.x(listZzk, 10)), 16));
            for (zzqh zzqhVar : listZzk) {
                s sVarA = x.a(zzqhVar.zzg(), zzqhVar.zzi());
                linkedHashMap.put(sVarA.c(), sVarA.d());
            }
            this.zzh.zzb(linkedHashMap);
            this.zzc.zzf(zzqfVar);
            zzdfVarZzf.zza();
        } catch (Exception e10) {
            zzbj zzbjVar = e10 instanceof zzbj ? (zzbj) e10 : new zzbj(zzbh.zzb, zzbg.zzaa, null);
            zzdfVarZzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }

    private final boolean zzi(Application application) {
        int i10 = zzbb.zza;
        return zzbk.zzb(application);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo6execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction r5, long r6, qd.d<? super md.t<java.lang.String>> r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzcq
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzcq r0 = (com.google.android.recaptcha.internal.zzcq) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcq r0 = new com.google.android.recaptcha.internal.zzcq
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.zza
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            md.u.b(r8)
            md.t r8 = (md.t) r8
            java.lang.Object r5 = r8.j()
            goto L43
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            md.u.b(r8)
            r0.zzc = r3
            java.lang.Object r5 = r4.zzg(r5, r6, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.mo6execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, qd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo7executegIAlus(com.google.android.recaptcha.RecaptchaAction r5, qd.d<? super md.t<java.lang.String>> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzcr
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzcr r0 = (com.google.android.recaptcha.internal.zzcr) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcr r0 = new com.google.android.recaptcha.internal.zzcr
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            md.u.b(r6)
            md.t r6 = (md.t) r6
            java.lang.Object r5 = r6.j()
            goto L45
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            md.u.b(r6)
            r0.zzc = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r5 = r4.mo6execute0E7RQCE(r5, r2, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.mo7executegIAlus(com.google.android.recaptcha.RecaptchaAction, qd.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzax.zza(k.b(this.zzi.zzb(), null, null, new zzct(this, recaptchaAction, 10000L, null), 3, null));
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j10) {
        return zzax.zza(k.b(this.zzi.zzb(), null, null, new zzct(this, recaptchaAction, j10, null), 3, null));
    }

    public final String zze() {
        return this.zzd;
    }
}
