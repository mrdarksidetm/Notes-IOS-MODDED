package com.revenuecat.purchases.ui.revenuecatui.errors;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageConfigurationError extends Throwable {
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageConfigurationError(String str) {
        super(str);
        r.f(str, "message");
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
