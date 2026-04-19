package com.revenuecat.purchases.common.networking;

/* JADX INFO: loaded from: classes2.dex */
public final class RCHTTPStatusCodes {
    public static final int BAD_REQUEST = 400;
    public static final int CREATED = 201;
    public static final int ERROR = 500;
    public static final int FORBIDDEN = 403;
    public static final RCHTTPStatusCodes INSTANCE = new RCHTTPStatusCodes();
    public static final int NOT_FOUND = 404;
    public static final int NOT_MODIFIED = 304;
    public static final int SUCCESS = 200;
    public static final int UNAUTHORIZED = 401;
    public static final int UNSUCCESSFUL = 300;

    private RCHTTPStatusCodes() {
    }

    public final boolean isServerError(int i10) {
        return i10 >= 500;
    }

    public final boolean isSuccessful(int i10) {
        return i10 < 400;
    }

    public final boolean isSynced(int i10) {
        return isSuccessful(i10) || !(isServerError(i10) || i10 == 404);
    }
}
