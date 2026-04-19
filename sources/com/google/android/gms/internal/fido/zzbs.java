package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes.dex */
final class zzbs extends zzaz {
    static final zzaz zza = new zzbs(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzbs(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzap.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzaz, com.google.android.gms.internal.fido.zzav
    final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzav
    final Object[] zze() {
        return this.zzb;
    }
}
