package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzyg<JcePrimitiveT> implements zzyj<JcePrimitiveT> {
    private final zzyl<JcePrimitiveT> zza;

    private zzyg(zzyl<JcePrimitiveT> zzylVar) {
        this.zza = zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyj
    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        Iterator<Provider> it = zzyf.zza("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
