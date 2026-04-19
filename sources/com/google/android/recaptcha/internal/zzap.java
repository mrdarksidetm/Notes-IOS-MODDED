package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import le.n0;
import le.x;
import md.i0;
import qd.d;
import ue.a;
import ue.c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzap {
    public x zza;
    private final n0 zzb;
    private final zzdc zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzat zze = zzat.zza;
    private final a zzg = c.b(false, 1, null);

    public zzap(Context context, n0 n0Var, zzdc zzdcVar, StandardIntegrityManager standardIntegrityManager, long j10) {
        this.zzb = n0Var;
        this.zzc = zzdcVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzi(qd.d r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzai
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzai r0 = (com.google.android.recaptcha.internal.zzai) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzai r0 = new com.google.android.recaptcha.internal.zzai
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            md.u.b(r7)
            goto L55
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            md.u.b(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r4 = r6.zzf
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = r7.setCloudProjectNumber(r4)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r7 = r7.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r2 = r6.zzd
            com.google.android.gms.tasks.Task r7 = r2.prepareIntegrityToken(r7)
            le.u0 r7 = com.google.android.recaptcha.internal.zzas.zza(r7)
            r0.zzc = r3
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzap.zzi(qd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(java.lang.String r6, qd.d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzaj
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzaj r0 = (com.google.android.recaptcha.internal.zzaj) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaj r0 = new com.google.android.recaptcha.internal.zzaj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            md.u.b(r7)
            goto L6d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.String r6 = r0.zzd
            md.u.b(r7)
            goto L4b
        L3a:
            md.u.b(r7)
            le.x r7 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 == r1) goto L74
        L4b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r2 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r2.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r7.request(r6)
            le.u0 r6 = com.google.android.recaptcha.internal.zzas.zza(r6)
            r7 = 0
            r0.zzd = r7
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L6d
            goto L74
        L6d:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r6 = r7.token()
            return r6
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzap.zzj(java.lang.String, qd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[PHI: r2 r7
  0x0066: PHI (r2v3 com.google.android.recaptcha.internal.zzap) = (r2v2 com.google.android.recaptcha.internal.zzap), (r2v5 com.google.android.recaptcha.internal.zzap) binds: [B:27:0x0063, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v7 java.lang.String) binds: [B:27:0x0063, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.String r7, qd.d r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            md.u.b(r8)
            goto L74
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzap r2 = r0.zzd
            md.u.b(r8)
            goto L66
        L3f:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzap r2 = r0.zzd
            md.u.b(r8)     // Catch: java.lang.Exception -> L59
            goto L74
        L47:
            md.u.b(r8)
            r0.zzd = r6     // Catch: java.lang.Exception -> L58
            r0.zze = r7     // Catch: java.lang.Exception -> L58
            r0.zzc = r5     // Catch: java.lang.Exception -> L58
            java.lang.Object r7 = r6.zzj(r7, r0)     // Catch: java.lang.Exception -> L58
            if (r7 != r1) goto L57
            goto L73
        L57:
            return r7
        L58:
            r2 = r6
        L59:
            r0.zzd = r2
            r0.zze = r7
            r0.zzc = r4
            java.lang.Object r8 = r2.zze(r0)
            if (r8 != r1) goto L66
            goto L73
        L66:
            r8 = 0
            r0.zzd = r8
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r7 = r2.zzj(r7, r0)
            if (r7 != r1) goto L75
        L73:
            r8 = r1
        L74:
            return r8
        L75:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzap.zzc(java.lang.String, qd.d):java.lang.Object");
    }

    public final Object zzd(long j10, d dVar) {
        this.zzf = j10;
        return i0.f15558a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        if (md.i0.f15558a == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [ue.a] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(qd.d r14) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzam
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzam r0 = (com.google.android.recaptcha.internal.zzam) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzam r0 = new com.google.android.recaptcha.internal.zzam
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            md.u.b(r14)
            goto Lb1
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L36:
            java.lang.Object r2 = r0.zza
            com.google.android.recaptcha.internal.zzap r6 = r0.zze
            md.u.b(r14)
            goto L50
        L3e:
            md.u.b(r14)
            ue.a r2 = r13.zzg
            r0.zze = r13
            r0.zza = r2
            r0.zzd = r4
            java.lang.Object r14 = r2.a(r5, r0)
            if (r14 == r1) goto Lb9
            r6 = r13
        L50:
            com.google.android.recaptcha.internal.zzat r14 = r6.zze     // Catch: java.lang.Throwable -> Lb4
            com.google.android.recaptcha.internal.zzat r7 = com.google.android.recaptcha.internal.zzat.zza     // Catch: java.lang.Throwable -> Lb4
            boolean r14 = ae.r.b(r14, r7)     // Catch: java.lang.Throwable -> Lb4
            if (r14 != 0) goto L60
            md.i0 r14 = md.i0.f15558a     // Catch: java.lang.Throwable -> Lb4
            r2.b(r5)
            return r14
        L60:
            com.google.android.recaptcha.internal.zzat r14 = com.google.android.recaptcha.internal.zzat.zzb     // Catch: java.lang.Throwable -> Lb4
            r6.zze = r14     // Catch: java.lang.Throwable -> Lb4
            md.i0 r14 = md.i0.f15558a     // Catch: java.lang.Throwable -> Lb4
            r2.b(r5)
            com.google.android.recaptcha.internal.zzdc r14 = r6.zzc
            java.lang.String r2 = r14.zzd()
            r14.zzc(r2)
            r14.zzb(r3)
            r2 = 38
            com.google.android.recaptcha.internal.zzdf r14 = r14.zzf(r2)
            le.x r2 = le.z.b(r5, r4, r5)
            r6.zza = r2
            le.n0 r7 = r6.zzb
            r8 = 0
            r9 = 0
            com.google.android.recaptcha.internal.zzao r10 = new com.google.android.recaptcha.internal.zzao
            r10.<init>(r6, r14, r5)
            r11 = 3
            r12 = 0
            le.i.d(r7, r8, r9, r10, r11, r12)
            r0.zze = r5
            r0.zza = r5
            r0.zzd = r3
            boolean r14 = r6.zzh
            if (r14 != 0) goto Lac
            java.util.Timer r7 = new java.util.Timer
            r7.<init>()
            com.google.android.recaptcha.internal.zzak r8 = new com.google.android.recaptcha.internal.zzak
            r8.<init>(r6)
            r11 = 28800000(0x1b77400, double:1.42290906E-316)
            r9 = r11
            r7.schedule(r8, r9, r11)
            r6.zzh = r4
        Lac:
            md.i0 r14 = md.i0.f15558a
            if (r14 != r1) goto Lb1
            goto Lb9
        Lb1:
            md.i0 r14 = md.i0.f15558a
            return r14
        Lb4:
            r14 = move-exception
            r2.b(r5)
            throw r14
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzap.zze(qd.d):java.lang.Object");
    }

    public final x zzf() {
        x xVar = this.zza;
        if (xVar != null) {
            return xVar;
        }
        return null;
    }
}
