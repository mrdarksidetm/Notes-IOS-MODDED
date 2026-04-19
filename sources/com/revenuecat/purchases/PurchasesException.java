package com.revenuecat.purchases;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public class PurchasesException extends Exception {
    private final PurchasesError error;

    public PurchasesException(PurchasesError purchasesError) {
        r.f(purchasesError, "error");
        this.error = purchasesError;
    }

    public final PurchasesErrorCode getCode() {
        return this.error.getCode();
    }

    public final PurchasesError getError() {
        return this.error;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.error.getMessage();
    }

    public final String getUnderlyingErrorMessage() {
        return this.error.getUnderlyingErrorMessage();
    }
}
