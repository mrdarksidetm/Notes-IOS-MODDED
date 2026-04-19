package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzakp implements zzakm {
    zzakp() {
    }

    private static <E> zzakc<E> zzc(Object obj, long j10) {
        return (zzakc) zzamp.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final <L> List<L> zza(Object obj, long j10) {
        zzakc zzakcVarZzc = zzc(obj, j10);
        if (zzakcVarZzc.zzc()) {
            return zzakcVarZzc;
        }
        int size = zzakcVarZzc.size();
        zzakc zzakcVarZza = zzakcVarZzc.zza(size == 0 ? 10 : size << 1);
        zzamp.zza(obj, j10, zzakcVarZza);
        return zzakcVarZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.gms.internal.firebase-auth-api.zzakc, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final <E> void zza(Object obj, Object obj2, long j10) {
        zzakc zzakcVarZzc = zzc(obj, j10);
        ?? Zzc = zzc(obj2, j10);
        int size = zzakcVarZzc.size();
        int size2 = Zzc.size();
        ?? r02 = zzakcVarZzc;
        r02 = zzakcVarZzc;
        if (size > 0 && size2 > 0) {
            boolean zZzc = zzakcVarZzc.zzc();
            ?? Zza = zzakcVarZzc;
            if (!zZzc) {
                Zza = zzakcVarZzc.zza(size2 + size);
            }
            Zza.addAll(Zzc);
            r02 = Zza;
        }
        if (size > 0) {
            Zzc = r02;
        }
        zzamp.zza(obj, j10, (Object) Zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final void zzb(Object obj, long j10) {
        zzc(obj, j10).zzb();
    }
}
