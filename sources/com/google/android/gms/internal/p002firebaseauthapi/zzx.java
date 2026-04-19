package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzx {
    private final zzh zza;
    private final zzad zzb;
    private final int zzc;

    private zzx(zzad zzadVar) {
        this(zzadVar, false, zzl.zza, a.e.API_PRIORITY_OTHER);
    }

    private zzx(zzad zzadVar, boolean z10, zzh zzhVar, int i10) {
        this.zzb = zzadVar;
        this.zza = zzhVar;
        this.zzc = a.e.API_PRIORITY_OTHER;
    }

    public static zzx zza(char c10) {
        zzj zzjVar = new zzj(c10);
        zzy.zza(zzjVar);
        return new zzx(new zzaa(zzjVar));
    }

    public static zzx zza(String str) {
        zzn zznVarZza = zzt.zza(str);
        if (!zznVarZza.zza("").zzc()) {
            return new zzx(new zzac(zznVarZza));
        }
        throw new IllegalArgumentException(zzag.zza("The pattern may not match the empty string: %s", zznVarZza));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzy.zza(charSequence);
        Iterator<String> itZza = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZza.hasNext()) {
            arrayList.add(itZza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
