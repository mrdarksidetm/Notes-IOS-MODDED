package com.google.android.gms.internal.mlkit_vision_document_scanner;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzam extends zzaf {
    static final zzaf zza = new zzam(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    private zzam(Object obj, Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    static zzam zzg(int i10, Object[] objArr, zzae zzaeVar) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        zzw.zza(obj, obj2);
        return new zzam(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzaf, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L5
        L3:
            r5 = r0
            goto L1d
        L5:
            int r1 = r4.zzc
            java.lang.Object[] r2 = r4.zzb
            r3 = 1
            if (r1 != r3) goto L3
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L3
            r5 = r2[r3]
            java.util.Objects.requireNonNull(r5)
        L1d:
            if (r5 != 0) goto L20
            return r0
        L20:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_document_scanner.zzam.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzaf
    final zzz zza() {
        return new zzal(this.zzb, 1, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzaf
    final zzag zzd() {
        return new zzaj(this, this.zzb, 0, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzaf
    final zzag zze() {
        return new zzak(this, new zzal(this.zzb, 0, this.zzc));
    }
}
