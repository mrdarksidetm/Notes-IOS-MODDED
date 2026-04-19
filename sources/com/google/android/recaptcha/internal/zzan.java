package com.google.android.recaptcha.internal;

import ae.h0;
import le.n0;
import md.i0;
import qd.d;
import sd.j;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class zzan extends j implements p {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzap zzd;
    final /* synthetic */ zzdf zze;
    final /* synthetic */ h0 zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzan(zzap zzapVar, zzdf zzdfVar, h0 h0Var, d dVar) {
        super(2, dVar);
        this.zzd = zzapVar;
        this.zze = zzdfVar;
        this.zzf = h0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new zzan(this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // zd.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((n0) obj, (d) obj2)).invokeSuspend(i0.f15558a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:22:0x005a, B:34:0x0076], limit reached: 46 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:12:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:39:0x0087). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = rd.b.e()
            int r1 = r8.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L17
            boolean r1 = r8.zzb
            long r4 = r8.zza
            md.u.b(r9)
            r9 = r1
            r1 = r8
            goto L87
        L17:
            long r4 = r8.zza
            md.u.b(r9)     // Catch: java.lang.Exception -> L1e
            r1 = r8
            goto L36
        L1e:
            r9 = move-exception
            r1 = r8
            goto L52
        L21:
            md.u.b(r9)
            r4 = 1000(0x3e8, double:4.94E-321)
            r1 = r8
            r9 = r3
        L28:
            if (r9 == 0) goto L8b
            com.google.android.recaptcha.internal.zzap r9 = r1.zzd     // Catch: java.lang.Exception -> L4f
            r1.zza = r4     // Catch: java.lang.Exception -> L4f
            r1.zzc = r3     // Catch: java.lang.Exception -> L4f
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzap.zza(r9, r1)     // Catch: java.lang.Exception -> L4f
            if (r9 == r0) goto L51
        L36:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r9 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r9     // Catch: java.lang.Exception -> L4f
            com.google.android.recaptcha.internal.zzap r6 = r1.zzd     // Catch: java.lang.Exception -> L4f
            le.x r6 = r6.zzf()     // Catch: java.lang.Exception -> L4f
            r6.L(r9)     // Catch: java.lang.Exception -> L4f
            com.google.android.recaptcha.internal.zzap r9 = r1.zzd     // Catch: java.lang.Exception -> L4f
            com.google.android.recaptcha.internal.zzat r6 = com.google.android.recaptcha.internal.zzat.zzc     // Catch: java.lang.Exception -> L4f
            com.google.android.recaptcha.internal.zzap.zzh(r9, r6)     // Catch: java.lang.Exception -> L4f
            com.google.android.recaptcha.internal.zzdf r9 = r1.zze     // Catch: java.lang.Exception -> L4f
            r9.zza()     // Catch: java.lang.Exception -> L4f
            r9 = r2
            goto L28
        L4f:
            r9 = move-exception
            goto L52
        L51:
            return r0
        L52:
            ae.h0 r6 = r1.zzf
            r6.f712a = r9
            boolean r6 = r9 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r6 == 0) goto L76
            r6 = r9
            com.google.android.play.core.integrity.StandardIntegrityException r6 = (com.google.android.play.core.integrity.StandardIntegrityException) r6
            int r6 = r6.getErrorCode()
            r7 = -100
            if (r6 == r7) goto L74
            r7 = -18
            if (r6 == r7) goto L74
            r7 = -12
            if (r6 == r7) goto L74
            r7 = -8
            if (r6 == r7) goto L74
            r7 = -3
            if (r6 == r7) goto L74
            goto L76
        L74:
            r6 = r3
            goto L77
        L76:
            r6 = r2
        L77:
            if (r6 == 0) goto L8a
            r1.zza = r4
            r1.zzb = r3
            r9 = 2
            r1.zzc = r9
            java.lang.Object r9 = le.x0.a(r4, r1)
            if (r9 == r0) goto L89
            r9 = r6
        L87:
            long r4 = r4 + r4
            goto L28
        L89:
            return r0
        L8a:
            throw r9
        L8b:
            md.i0 r9 = md.i0.f15558a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
