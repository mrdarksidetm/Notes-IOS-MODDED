package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzamb extends zzamc {
    private final /* synthetic */ zzalw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzamb(zzalw zzalwVar) {
        super(zzalwVar);
        this.zza = zzalwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzaly(this.zza);
    }
}
