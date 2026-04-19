package com.revenuecat.purchases.google.usecase;

import ke.a;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingClientUseCaseKt {
    private static final int MAX_RETRIES_DEFAULT = 3;
    private static final long RETRY_TIMER_MAX_TIME;
    private static final long RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND;
    private static final long RETRY_TIMER_START;

    static {
        a.C0337a c0337a = ke.a.f14459b;
        RETRY_TIMER_START = ke.c.s(878, ke.d.f14468d);
        RETRY_TIMER_MAX_TIME = ke.c.s(15, ke.d.f14470f);
        RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND = ke.c.s(4, ke.d.f14469e);
    }

    public static final long getRETRY_TIMER_MAX_TIME() {
        return RETRY_TIMER_MAX_TIME;
    }

    public static final long getRETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND() {
        return RETRY_TIMER_SERVICE_UNAVAILABLE_MAX_TIME_FOREGROUND;
    }
}
