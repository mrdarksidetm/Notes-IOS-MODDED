package com.google.android.recaptcha.internal;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import le.n0;
import le.o0;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzag implements zzaa {
    private final zzdc zza;
    private final zzap zzb;
    private boolean zzc = true;
    private String zzd = "";
    private final int zze;

    public zzag(zzdc zzdcVar, Context context, n0 n0Var, zzap zzapVar, int i10) {
        this.zza = zzdcVar;
        this.zzb = zzapVar;
        this.zze = i10;
    }

    private static final String zzi(zziv zzivVar) {
        zzhz zzhzVarZzg = zzhz.zzg();
        byte[] bArrZzl = zzivVar.zzl();
        byte[] bArrZzd = zzhr.zza().zza(zzhzVarZzg.zzi(bArrZzl, 0, bArrZzl.length), StandardCharsets.UTF_8).zzd();
        zziv zzivVarZzk = zziv.zzk(bArrZzd, 0, bArrZzd.length);
        zzhz zzhzVarZzh = zzhz.zzh();
        byte[] bArrZzl2 = zzivVarZzk.zzl();
        return zzhzVarZzh.zzi(bArrZzl2, 0, bArrZzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, d dVar) {
        return o0.e(new zzae(this, str, null), dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r12.zze(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zzaa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzd(com.google.android.recaptcha.internal.zzps r11, qd.d r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.zzb
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzd
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zzdf r11 = (com.google.android.recaptcha.internal.zzdf) r11
            md.u.b(r12)
            goto L87
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            com.google.android.recaptcha.internal.zzdf r11 = r0.zze
            java.lang.Object r2 = r0.zza
            com.google.android.recaptcha.internal.zzag r2 = (com.google.android.recaptcha.internal.zzag) r2
            md.u.b(r12)
            goto L78
        L43:
            md.u.b(r12)
            com.google.android.recaptcha.internal.zzdf r12 = com.google.android.recaptcha.internal.zzab.zzc(r10)
            int r2 = r10.zze
            r6 = 3
            if (r2 != r6) goto L8e
            long r6 = r11.zzf()
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L5a
            goto L8e
        L5a:
            com.google.android.recaptcha.internal.zziv r2 = r11.zzg()
            java.lang.String r2 = zzi(r2)
            r10.zzd = r2
            com.google.android.recaptcha.internal.zzap r2 = r10.zzb
            long r6 = r11.zzf()
            r0.zza = r10
            r0.zze = r12
            r0.zzd = r5
            java.lang.Object r11 = r2.zzd(r6, r0)
            if (r11 == r1) goto L8d
            r2 = r10
            r11 = r12
        L78:
            com.google.android.recaptcha.internal.zzap r12 = r2.zzb
            r0.zza = r11
            r0.zze = r3
            r0.zzd = r4
            java.lang.Object r12 = r12.zze(r0)
            if (r12 != r1) goto L87
            goto L8d
        L87:
            r11.zza()
        L8a:
            md.i0 r11 = md.i0.f15558a
            return r11
        L8d:
            return r1
        L8e:
            r11 = 0
            r10.zzc = r11
            com.google.android.recaptcha.internal.zzbj r11 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r0 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r1 = com.google.android.recaptcha.internal.zzbg.zzac
            r11.<init>(r0, r1, r3)
            r12.zzb(r11)
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzag.zzd(com.google.android.recaptcha.internal.zzps, qd.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zzqf zzqfVar) {
        this.zzd = zzi(zzqfVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return this.zzc;
    }
}
