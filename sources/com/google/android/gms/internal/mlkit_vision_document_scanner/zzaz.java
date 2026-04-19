package com.google.android.gms.internal.mlkit_vision_document_scanner;

import ga.d;
import ga.f;
import ha.b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzaz implements b {
    public static final /* synthetic */ int zza = 0;
    private static final d zzb = new d() { // from class: com.google.android.gms.internal.mlkit_vision_document_scanner.zzay
        @Override // ga.d
        public final void encode(Object obj, Object obj2) {
            int i10 = zzaz.zza;
            throw new ga.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final d zze = zzb;

    @Override // ha.b
    public final /* bridge */ /* synthetic */ b registerEncoder(Class cls, d dVar) {
        this.zzc.put(cls, dVar);
        this.zzd.remove(cls);
        return this;
    }

    public final /* bridge */ /* synthetic */ b registerEncoder(Class cls, f fVar) {
        this.zzd.put(cls, fVar);
        this.zzc.remove(cls);
        return this;
    }

    public final zzba zza() {
        return new zzba(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }
}
