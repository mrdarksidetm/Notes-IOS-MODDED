package com.google.android.recaptcha.internal;

import md.n;

/* JADX INFO: loaded from: classes2.dex */
public final class zzej {
    public static final Class zza(Object obj) throws zzby {
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            Class cls = iIntValue == 1 ? Integer.TYPE : iIntValue == 2 ? Short.TYPE : iIntValue == 3 ? Byte.TYPE : iIntValue == 4 ? Long.TYPE : iIntValue == 5 ? Character.TYPE : iIntValue == 6 ? Float.TYPE : iIntValue == 7 ? Double.TYPE : iIntValue == 8 ? Boolean.TYPE : null;
            if (cls != null) {
                return cls;
            }
            throw new zzby(4, 6, null);
        }
        if (!(obj instanceof String)) {
            throw new zzby(4, 5, null);
        }
        try {
            String str = (String) obj;
            Class<?> cls2 = Class.forName(str);
            int i10 = zzbb.zza;
            if (((zzeb) n.b(zzei.zza).getValue()).zzb(str)) {
                return cls2;
            }
            throw new zzby(6, 47, null);
        } catch (Exception e10) {
            throw new zzby(6, 8, e10);
        }
    }
}
