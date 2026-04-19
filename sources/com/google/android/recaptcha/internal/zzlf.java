package com.google.android.recaptcha.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzlf implements Map.Entry {
    private final Map.Entry zza;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzlh) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzlx) {
            return ((zzlh) this.zza.getValue()).zzc((zzlx) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzlh zza() {
        return (zzlh) this.zza.getValue();
    }
}
