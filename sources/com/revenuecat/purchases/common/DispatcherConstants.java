package com.revenuecat.purchases.common;

import ke.a;
import ke.c;
import ke.d;

/* JADX INFO: loaded from: classes2.dex */
public final class DispatcherConstants {
    public static final DispatcherConstants INSTANCE = new DispatcherConstants();
    private static final long jitterDelay;
    private static final long jitterLongDelay;

    static {
        a.C0337a c0337a = a.f14459b;
        d dVar = d.f14468d;
        jitterDelay = c.t(5000L, dVar);
        jitterLongDelay = c.t(10000L, dVar);
    }

    private DispatcherConstants() {
    }

    /* JADX INFO: renamed from: getJitterDelay-UwyO8pc, reason: not valid java name */
    public final long m15getJitterDelayUwyO8pc() {
        return jitterDelay;
    }

    /* JADX INFO: renamed from: getJitterLongDelay-UwyO8pc, reason: not valid java name */
    public final long m16getJitterLongDelayUwyO8pc() {
        return jitterLongDelay;
    }
}
