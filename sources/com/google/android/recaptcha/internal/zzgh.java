package com.google.android.recaptcha.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgh implements zzgm {
    private final Context zza;

    public zzgh(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzgl.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    public final Object zza(Object... objArr) {
        return zzau.zza(this.zza.getContentResolver());
    }
}
