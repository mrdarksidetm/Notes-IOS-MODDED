package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzali<T> implements zzalv<T> {
    private final zzalc zza;
    private final zzamo<?, ?> zzb;
    private final boolean zzc;
    private final zzajm<?> zzd;

    private zzali(zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzalc zzalcVar) {
        this.zzb = zzamoVar;
        this.zzc = zzajmVar.zza(zzalcVar);
        this.zzd = zzajmVar;
        this.zza = zzalcVar;
    }

    static <T> zzali<T> zza(zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzalc zzalcVar) {
        return new zzali<>(zzamoVar, zzajmVar, zzalcVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zza(T t10) {
        zzamo<?, ?> zzamoVar = this.zzb;
        int iZzb = zzamoVar.zzb(zzamoVar.zzd(t10)) + 0;
        return this.zzc ? iZzb + this.zzd.zza(t10).zza() : iZzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final T zza() {
        zzalc zzalcVar = this.zza;
        return zzalcVar instanceof zzajy ? (T) ((zzajy) zzalcVar).zzo() : (T) zzalcVar.zzq().zzf();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[LOOP:0: B:45:0x000c->B:53:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r11, com.google.android.gms.internal.p002firebaseauthapi.zzals r12, com.google.android.gms.internal.p002firebaseauthapi.zzajk r13) {
        /*
            r10 = this;
            com.google.android.gms.internal.firebase-auth-api.zzamo<?, ?> r0 = r10.zzb
            com.google.android.gms.internal.firebase-auth-api.zzajm<?> r1 = r10.zzd
            java.lang.Object r2 = r0.zzc(r11)
            com.google.android.gms.internal.firebase-auth-api.zzajr r3 = r1.zzb(r11)
        Lc:
            int r4 = r12.zzc()     // Catch: java.lang.Throwable -> L8e
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L19
            r0.zzb(r11, r2)
            return
        L19:
            int r4 = r12.zzd()     // Catch: java.lang.Throwable -> L8e
            r6 = 11
            r7 = 0
            if (r4 == r6) goto L3f
            r5 = r4 & 7
            r6 = 2
            if (r5 != r6) goto L3a
            com.google.android.gms.internal.firebase-auth-api.zzalc r5 = r10.zza     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 >>> 3
            java.lang.Object r4 = r1.zza(r13, r5, r4)     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L35
            r1.zza(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L82
        L35:
            boolean r4 = r0.zza(r2, r12, r7)     // Catch: java.lang.Throwable -> L8e
            goto L83
        L3a:
            boolean r4 = r12.zzt()     // Catch: java.lang.Throwable -> L8e
            goto L83
        L3f:
            r4 = 0
            r6 = r4
        L41:
            int r8 = r12.zzc()     // Catch: java.lang.Throwable -> L8e
            if (r8 == r5) goto L6f
            int r8 = r12.zzd()     // Catch: java.lang.Throwable -> L8e
            r9 = 16
            if (r8 != r9) goto L5a
            int r7 = r12.zzj()     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.firebase-auth-api.zzalc r4 = r10.zza     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r4 = r1.zza(r13, r4, r7)     // Catch: java.lang.Throwable -> L8e
            goto L41
        L5a:
            r9 = 26
            if (r8 != r9) goto L69
            if (r4 == 0) goto L64
            r1.zza(r12, r4, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L41
        L64:
            com.google.android.gms.internal.firebase-auth-api.zzaip r6 = r12.zzp()     // Catch: java.lang.Throwable -> L8e
            goto L41
        L69:
            boolean r8 = r12.zzt()     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L41
        L6f:
            int r5 = r12.zzd()     // Catch: java.lang.Throwable -> L8e
            r8 = 12
            if (r5 != r8) goto L89
            if (r6 == 0) goto L82
            if (r4 == 0) goto L7f
            r1.zza(r6, r4, r13, r3)     // Catch: java.lang.Throwable -> L8e
            goto L82
        L7f:
            r0.zza(r2, r7, r6)     // Catch: java.lang.Throwable -> L8e
        L82:
            r4 = 1
        L83:
            if (r4 != 0) goto Lc
            r0.zzb(r11, r2)
            return
        L89:
            com.google.android.gms.internal.firebase-auth-api.zzakf r12 = com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzb()     // Catch: java.lang.Throwable -> L8e
            throw r12     // Catch: java.lang.Throwable -> L8e
        L8e:
            r12 = move-exception
            r0.zzb(r11, r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzali.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzals, com.google.android.gms.internal.firebase-auth-api.zzajk):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t10, zzanf zzanfVar) {
        Iterator itZzd = this.zzd.zza(t10).zzd();
        while (itZzd.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzd.next();
            zzajt zzajtVar = (zzajt) entry.getKey();
            if (zzajtVar.zzc() != zzand.MESSAGE || zzajtVar.zze() || zzajtVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzanfVar.zza(zzajtVar.zza(), entry instanceof zzakj ? ((zzakj) entry).zza().zzb() : entry.getValue());
        }
        zzamo<?, ?> zzamoVar = this.zzb;
        zzamoVar.zza(zzamoVar.zzd(t10), zzanfVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t10, T t11) {
        zzalx.zza(this.zzb, t10, t11);
        if (this.zzc) {
            zzalx.zza(this.zzd, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099 A[EDGE_INSN: B:56:0x0099->B:34:0x0099 BREAK  A[LOOP:1: B:18:0x0053->B:61:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.p002firebaseauthapi.zzaik r14) throws com.google.android.gms.internal.p002firebaseauthapi.zzakf {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.firebase-auth-api.zzajy r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzajy) r0
            com.google.android.gms.internal.firebase-auth-api.zzamn r1 = r0.zzb
            com.google.android.gms.internal.firebase-auth-api.zzamn r2 = com.google.android.gms.internal.p002firebaseauthapi.zzamn.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.firebase-auth-api.zzamn r1 = com.google.android.gms.internal.p002firebaseauthapi.zzamn.zzd()
            r0.zzb = r1
        L11:
            com.google.android.gms.internal.firebase-auth-api.zzajy$zzb r10 = (com.google.android.gms.internal.firebase-auth-api.zzajy.zzb) r10
            r10.zza()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zzc(r11, r12, r14)
            int r2 = r14.zza
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.firebase-auth-api.zzajm<?> r12 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzajk r0 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzalc r3 = r9.zza
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.zzajy$zzd r0 = (com.google.android.gms.internal.firebase-auth-api.zzajy.zzd) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.p002firebaseauthapi.zzalr.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zzc(r11, r4, r14)
            int r5 = r14.zza
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zza(r11, r4, r14)
            java.lang.Object r2 = r14.zzc
            com.google.android.gms.internal.firebase-auth-api.zzaip r2 = (com.google.android.gms.internal.p002firebaseauthapi.zzaip) r2
            goto L53
        L72:
            com.google.android.gms.internal.p002firebaseauthapi.zzalr.zza()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zzc(r11, r4, r14)
            int r12 = r14.zza
            com.google.android.gms.internal.firebase-auth-api.zzajm<?> r0 = r9.zzd
            com.google.android.gms.internal.firebase-auth-api.zzajk r5 = r14.zzd
            com.google.android.gms.internal.firebase-auth-api.zzalc r6 = r9.zza
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.firebase-auth-api.zzajy$zzd r0 = (com.google.android.gms.internal.firebase-auth-api.zzajy.zzd) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zza(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.firebase-auth-api.zzakf r10 = com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzg()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzali.zza(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzaik):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zzb(T t10) {
        int iHashCode = this.zzb.zzd(t10).hashCode();
        return this.zzc ? (iHashCode * 53) + this.zzd.zza(t10).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final boolean zzb(T t10, T t11) {
        if (!this.zzb.zzd(t10).equals(this.zzb.zzd(t11))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t10).equals(this.zzd.zza(t11));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zzd(T t10) {
        this.zzb.zzf(t10);
        this.zzd.zzc(t10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final boolean zze(T t10) {
        return this.zzd.zza(t10).zzg();
    }
}
