package com.google.android.recaptcha.internal;

import ae.j;
import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import le.n0;
import nd.u;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzx extends zze {
    private final zzdc zza;
    private final List zzb;
    private zziv zzc;
    private final Map zzd;

    public /* synthetic */ zzx(zzbl zzblVar, Context context, zzdc zzdcVar, zzbo zzboVar, List list, int i10, j jVar) {
        zzdc zzdcVarZza = zzdcVar.zza();
        n0 n0VarZzc = zzboVar.zzc();
        List listP = u.p(new zzad(zzdcVar.zza()), new zzp(zzdcVar.zza(), zzblVar), new zzm(zzdcVar.zza(), context.getContentResolver()), new zzn(zzdcVar.zza()), new zzag(zzdcVarZza, context, n0VarZzc, new zzap(context, n0VarZzc, zzdcVarZza, IntegrityManagerFactory.createStandard(context), 28800000L), zzbz.zza(context)));
        this.zza = zzdcVar;
        this.zzb = listP;
        this.zzd = new LinkedHashMap();
    }

    public static final /* synthetic */ String zzo(zzx zzxVar, zzri zzriVar) {
        zziv zzivVar = zzxVar.zzc;
        if (zzivVar == null) {
            zzivVar = null;
        }
        byte[] bArrZzd = zzriVar.zzd();
        return zzca.zza(zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzivVar);
    }

    public static final /* synthetic */ String zzp(zzx zzxVar, zzrm zzrmVar) {
        zziv zzivVar = zzxVar.zzc;
        if (zzivVar == null) {
            zzivVar = null;
        }
        byte[] bArrZzd = zzrmVar.zzd();
        return zzca.zza(zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzivVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzpw zzt(String str) {
        zzqm zzqmVar = (zzqm) this.zzd.remove(str);
        zzpv zzpvVarZzf = zzpw.zzf();
        zzpvVarZzf.zzd(str);
        if (zzqmVar != null) {
            byte[] bArrZzd = ((zzqn) zzqmVar.zzj()).zzd();
            String strZzi = zzhz.zzh().zzi(bArrZzd, 0, bArrZzd.length);
            zzpt zzptVarZzf = zzpu.zzf();
            zzptVarZzf.zzd(strZzi);
            zzpvVarZzf.zze(zzptVarZzf);
        }
        return (zzpw) zzpvVarZzf.zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzu(java.lang.String r5, com.google.android.recaptcha.internal.zzaa r6, qd.d r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzq
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzq r0 = (com.google.android.recaptcha.internal.zzq) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzq r0 = new com.google.android.recaptcha.internal.zzq
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.zza
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            md.u.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            md.u.b(r7)
            com.google.android.recaptcha.internal.zzr r7 = new com.google.android.recaptcha.internal.zzr
            r2 = 0
            r7.<init>(r6, r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r7 = le.o0.e(r7, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzx.zzu(java.lang.String, com.google.android.recaptcha.internal.zzaa, qd.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzdf zza(String str) {
        zzdc zzdcVar = this.zza;
        zzdcVar.zzc(str);
        return zzdcVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzdf zzb() {
        zzdc zzdcVar = this.zza;
        zzdcVar.zzc(zzdcVar.zzd());
        return zzdcVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzd(String str, d dVar) {
        return zzt(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object zzf(java.lang.String r5, qd.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzs
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzs r0 = (com.google.android.recaptcha.internal.zzs) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzs r0 = new com.google.android.recaptcha.internal.zzs
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            md.u.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            md.u.b(r6)
            com.google.android.recaptcha.internal.zzu r6 = new com.google.android.recaptcha.internal.zzu
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r6 = le.o0.e(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            md.t r6 = (md.t) r6
            java.lang.Object r5 = r6.j()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzx.zzf(java.lang.String, qd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object zzh(com.google.android.recaptcha.internal.zzpq r5, qd.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzv
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzv r0 = (com.google.android.recaptcha.internal.zzv) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzv r0 = new com.google.android.recaptcha.internal.zzv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            md.u.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            md.u.b(r6)
            com.google.android.recaptcha.internal.zzw r6 = new com.google.android.recaptcha.internal.zzw
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r6 = le.o0.e(r6, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            md.t r6 = (md.t) r6
            java.lang.Object r5 = r6.j()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzx.zzh(com.google.android.recaptcha.internal.zzpq, qd.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final void zzk(zzqf zzqfVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzaa) it.next()).zze(zzqfVar);
        }
    }

    public final Map zzr() {
        return this.zzd;
    }
}
