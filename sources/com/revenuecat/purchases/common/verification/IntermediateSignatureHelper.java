package com.revenuecat.purchases.common.verification;

import ae.q;
import ae.r;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.IntExtensionsKt;
import com.revenuecat.purchases.utils.Result;
import java.util.Date;
import ke.a;
import ke.c;
import ke.d;
import nd.o;

/* JADX INFO: loaded from: classes2.dex */
public final class IntermediateSignatureHelper {
    private final SignatureVerifier rootSignatureVerifier;

    public IntermediateSignatureHelper(SignatureVerifier signatureVerifier) {
        r.f(signatureVerifier, "rootSignatureVerifier");
        this.rootSignatureVerifier = signatureVerifier;
    }

    private final Date getIntermediateKeyExpirationDate(byte[] bArr) {
        a.C0337a c0337a = a.f14459b;
        return new Date(a.t(c.s(IntExtensionsKt.fromLittleEndianBytes(q.f721a, bArr), d.f14472h)));
    }

    public final Result<SignatureVerifier, PurchasesError> createIntermediateKeyVerifierIfVerified(Signature signature) {
        r.f(signature, "signature");
        if (!this.rootSignatureVerifier.verify(signature.getIntermediateKeySignature(), o.u(signature.getIntermediateKeyExpiration(), signature.getIntermediateKey()))) {
            return new Result.Error(new PurchasesError(PurchasesErrorCode.SignatureVerificationError, "Error verifying intermediate key."));
        }
        Date intermediateKeyExpirationDate = getIntermediateKeyExpirationDate(signature.getIntermediateKeyExpiration());
        if (!intermediateKeyExpirationDate.before(new Date())) {
            return new Result.Success(new DefaultSignatureVerifier(signature.getIntermediateKey()));
        }
        return new Result.Error(new PurchasesError(PurchasesErrorCode.SignatureVerificationError, "Intermediate key expired at " + intermediateKeyExpirationDate));
    }
}
