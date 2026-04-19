package com.google.android.gms.internal.p002firebaseauthapi;

import e9.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzahq {
    private List<String> zza;

    public zzahq() {
        this(null);
    }

    public zzahq(int i10, List<String> list) {
        List<String> listEmptyList;
        if (list == null || list.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.set(i11, o.a(list.get(i11)));
            }
            listEmptyList = Collections.unmodifiableList(list);
        }
        this.zza = listEmptyList;
    }

    private zzahq(List<String> list) {
        this.zza = new ArrayList();
    }

    public static zzahq zza() {
        return new zzahq(null);
    }

    public final List<String> zzb() {
        return this.zza;
    }
}
