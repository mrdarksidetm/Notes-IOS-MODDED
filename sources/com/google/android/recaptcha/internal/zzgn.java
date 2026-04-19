package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
import md.x;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgn implements zzgm {
    private final Context zza;
    private final Map zzb = r0.h(x.a(2, "activity"), x.a(3, "phone"), x.a(4, "input_method"), x.a(5, "audio"));

    public zzgn(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzgl.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    public final Object zza(Object... objArr) throws zzby {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzby(4, 5, null);
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzby(4, 4, null);
    }
}
