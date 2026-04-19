package com.google.android.recaptcha.internal;

import ae.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import le.o0;
import nd.u;
import nd.z;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzl {
    public zzdc zza;
    private final List zzb;

    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ zzl(List list, int i10, j jVar) {
        List listM = u.m();
        this.zzb = new ArrayList();
        zze[] zzeVarArr = (zze[]) listM.toArray(new zze[0]);
        zzg((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }

    private final void zzg(zze... zzeVarArr) {
        z.D(this.zzb, zzeVarArr);
    }

    public final zzdc zza() {
        zzdc zzdcVar = this.zza;
        if (zzdcVar != null) {
            return zzdcVar;
        }
        return null;
    }

    public final Object zzb(String str, long j10, d dVar) {
        return o0.e(new zzh(this, str, j10, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(long r11, com.google.android.recaptcha.internal.zzpq r13, qd.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzi
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzi r0 = (com.google.android.recaptcha.internal.zzi) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzi r0 = new com.google.android.recaptcha.internal.zzi
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            md.u.b(r14)
            goto L47
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            md.u.b(r14)
            com.google.android.recaptcha.internal.zzk r14 = new com.google.android.recaptcha.internal.zzk
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r8 = r13
            r4.<init>(r5, r6, r8, r9)
            r0.zzc = r3
            java.lang.Object r14 = le.o0.e(r14, r0)
            if (r14 != r1) goto L47
            return r1
        L47:
            md.t r14 = (md.t) r14
            java.lang.Object r11 = r14.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzl.zzc(long, com.google.android.recaptcha.internal.zzpq, qd.d):java.lang.Object");
    }

    public final List zzd() {
        return this.zzb;
    }

    public final void zze(zze... zzeVarArr) {
        zzg((zze[]) Arrays.copyOf(zzeVarArr, 2));
    }

    public final void zzf(zzqf zzqfVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzqfVar);
        }
    }
}
