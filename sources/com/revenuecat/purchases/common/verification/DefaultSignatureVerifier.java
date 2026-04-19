package com.revenuecat.purchases.common.verification;

import ae.j;
import ae.r;
import android.util.Base64;
import java.security.GeneralSecurityException;
import v9.c;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultSignatureVerifier implements SignatureVerifier {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_PUBLIC_KEY = "UC1upXWg5QVmyOSwozp755xLqquBKjjU+di6U8QhMlM=";
    private final c verifier;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultSignatureVerifier(String str) {
        r.f(str, "publicKey");
        byte[] bArrDecode = Base64.decode(str, 0);
        r.e(bArrDecode, "decode(publicKey, Base64.DEFAULT)");
        this(bArrDecode);
    }

    public /* synthetic */ DefaultSignatureVerifier(String str, int i10, j jVar) {
        this((i10 & 1) != 0 ? DEFAULT_PUBLIC_KEY : str);
    }

    public DefaultSignatureVerifier(byte[] bArr) {
        r.f(bArr, "publicKeyBytes");
        this.verifier = new c(bArr);
    }

    @Override // com.revenuecat.purchases.common.verification.SignatureVerifier
    public boolean verify(byte[] bArr, byte[] bArr2) {
        r.f(bArr, "signatureToVerify");
        r.f(bArr2, "messageToVerify");
        try {
            this.verifier.a(bArr, bArr2);
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
