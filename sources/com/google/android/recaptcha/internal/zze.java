package com.google.android.recaptcha.internal;

import md.i0;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zze {
    private boolean zza;

    protected zzdf zza(String str) {
        throw null;
    }

    protected zzdf zzb() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.String r19, long r20, qd.d r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, qd.d):java.lang.Object");
    }

    protected abstract Object zzd(String str, d dVar);

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[PHI: r9 r10 r12
  0x00a9: PHI (r9v11 com.google.android.recaptcha.internal.zzdf) = (r9v7 com.google.android.recaptcha.internal.zzdf), (r9v19 com.google.android.recaptcha.internal.zzdf) binds: [B:38:0x00a7, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r10v5 com.google.android.recaptcha.internal.zze) = (r10v2 com.google.android.recaptcha.internal.zze), (r10v10 com.google.android.recaptcha.internal.zze) binds: [B:38:0x00a7, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r12v8 java.lang.Object) = (r12v5 java.lang.Object), (r12v1 java.lang.Object) binds: [B:38:0x00a7, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(long r9, com.google.android.recaptcha.internal.zzpq r11, qd.d r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.zzb
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzd
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L53
            if (r2 == r6) goto L47
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zzbj r9 = (com.google.android.recaptcha.internal.zzbj) r9
            md.u.b(r12)
            goto Lbe
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            com.google.android.recaptcha.internal.zzdf r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            md.u.b(r12)
            goto La9
        L47:
            com.google.android.recaptcha.internal.zzdf r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            md.u.b(r12)     // Catch: java.lang.Exception -> L51
            goto L7f
        L51:
            r11 = move-exception
            goto L9a
        L53:
            md.u.b(r12)
            com.google.android.recaptcha.internal.zzdf r12 = r8.zzb()
            boolean r2 = r8.zza
            if (r2 == 0) goto L6a
            r12.zza()
            md.t$a r9 = md.t.f15576b
            md.i0 r9 = md.i0.f15558a
        L65:
            java.lang.Object r9 = md.t.b(r9)
            return r9
        L6a:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L96
            r2.<init>(r8, r11, r3)     // Catch: java.lang.Exception -> L96
            r0.zza = r8     // Catch: java.lang.Exception -> L96
            r0.zze = r12     // Catch: java.lang.Exception -> L96
            r0.zzd = r6     // Catch: java.lang.Exception -> L96
            java.lang.Object r9 = le.c3.c(r9, r2, r0)     // Catch: java.lang.Exception -> L96
            if (r9 == r1) goto Lc5
            r10 = r8
            r7 = r12
            r12 = r9
            r9 = r7
        L7f:
            md.t r12 = (md.t) r12     // Catch: java.lang.Exception -> L51
            java.lang.Object r11 = r12.j()     // Catch: java.lang.Exception -> L51
            md.u.b(r11)     // Catch: java.lang.Exception -> L51
            md.i0 r11 = md.i0.f15558a     // Catch: java.lang.Exception -> L51
            r10.zza = r6     // Catch: java.lang.Exception -> L51
            if (r9 == 0) goto L91
            r9.zza()     // Catch: java.lang.Exception -> L51
        L91:
            java.lang.Object r9 = md.t.b(r11)     // Catch: java.lang.Exception -> L51
            return r9
        L96:
            r9 = move-exception
            r11 = r9
            r10 = r8
            r9 = r12
        L9a:
            r12 = 0
            r10.zza = r12
            r0.zza = r10
            r0.zze = r9
            r0.zzd = r5
            java.lang.Object r12 = r10.zzj(r11, r0)
            if (r12 == r1) goto Lc5
        La9:
            r11 = r12
            com.google.android.recaptcha.internal.zzbj r11 = (com.google.android.recaptcha.internal.zzbj) r11
            if (r9 == 0) goto Lb1
            r9.zzb(r11)
        Lb1:
            r0.zza = r11
            r0.zze = r3
            r0.zzd = r4
            java.lang.Object r9 = r10.zzg(r11, r0)
            if (r9 == r1) goto Lc5
            r9 = r11
        Lbe:
            md.t$a r10 = md.t.f15576b
            java.lang.Object r9 = md.u.a(r9)
            goto L65
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzpq, qd.d):java.lang.Object");
    }

    protected abstract Object zzf(String str, d dVar);

    protected Object zzg(zzbj zzbjVar, d dVar) {
        return i0.f15558a;
    }

    protected abstract Object zzh(zzpq zzpqVar, d dVar);

    protected Object zzi(String str, long j10, Exception exc, d dVar) {
        return i0.f15558a;
    }

    protected Object zzj(Exception exc, d dVar) {
        return zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
    }

    protected void zzk(zzqf zzqfVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
