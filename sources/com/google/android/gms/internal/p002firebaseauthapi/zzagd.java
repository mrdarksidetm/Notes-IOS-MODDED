package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzagd {
    private List<zzage> zza;

    public zzagd() {
        this.zza = new ArrayList();
    }

    public zzagd(List<zzage> list) {
        this.zza = Collections.unmodifiableList(list);
    }

    public final List<zzage> zza() {
        return this.zza;
    }
}
