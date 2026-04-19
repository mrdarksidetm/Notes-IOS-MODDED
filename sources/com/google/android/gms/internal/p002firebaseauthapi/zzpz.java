package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzpz implements zzpd<zzqa, zzqa> {
    private static final zzpz zza = new zzpz();

    private zzpz() {
    }

    static void zzc() {
        zzoc.zza().zza(zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final Class<zzqa> zza() {
        return zzqa.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final /* synthetic */ zzqa zza(zzoz<zzqa> zzozVar) throws GeneralSecurityException {
        if (zzozVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (zzozVar.zzb() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<zzpb<zzqa>>> it = zzozVar.zzd().iterator();
        while (it.hasNext()) {
            Iterator<zzpb<zzqa>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().zzd();
            }
        }
        return new zzqc(zzozVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final Class<zzqa> zzb() {
        return zzqa.class;
    }
}
