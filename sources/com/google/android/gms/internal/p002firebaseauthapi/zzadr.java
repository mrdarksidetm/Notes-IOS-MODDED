package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class zzadr {
    private zzadr() {
    }

    public static Object zza(String str, Type type) throws zzabg {
        if (type == String.class) {
            try {
                zzafj zzafjVar = (zzafj) new zzafj().zza(str);
                if (zzafjVar.zzb()) {
                    return zzafjVar.zza();
                }
                throw new zzabg("No error message: " + str);
            } catch (Exception e10) {
                throw new zzabg("Json conversion failed! " + e10.getMessage(), e10);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            try {
                return ((zzadt) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
            } catch (Exception e11) {
                throw new zzabg("Json conversion failed! " + e11.getMessage(), e11);
            }
        } catch (Exception e12) {
            throw new zzabg("Instantiation of JsonResponse failed! " + String.valueOf(type), e12);
        }
    }
}
