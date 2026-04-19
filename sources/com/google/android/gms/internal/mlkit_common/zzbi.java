package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes.dex */
final class zzbi implements zzbn {
    private final int zza;
    private final zzbm zzb;

    zzbi(int i10, zzbm zzbmVar) {
        this.zza = i10;
        this.zzb = zzbmVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzbn.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbn)) {
            return false;
        }
        zzbn zzbnVar = (zzbn) obj;
        return this.zza == zzbnVar.zza() && this.zzb.equals(zzbnVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbn
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbn
    public final zzbm zzb() {
        return this.zzb;
    }
}
