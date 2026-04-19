package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class zzair implements Comparator<zzaip> {
    zzair() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzaip zzaipVar, zzaip zzaipVar2) {
        zzaip zzaipVar3 = zzaipVar;
        zzaip zzaipVar4 = zzaipVar2;
        zzaiv zzaivVar = (zzaiv) zzaipVar3.iterator();
        zzaiv zzaivVar2 = (zzaiv) zzaipVar4.iterator();
        while (zzaivVar.hasNext() && zzaivVar2.hasNext()) {
            int iCompare = Integer.compare(zzaip.zza(zzaivVar.zza()), zzaip.zza(zzaivVar2.zza()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(zzaipVar3.zzb(), zzaipVar4.zzb());
    }
}
