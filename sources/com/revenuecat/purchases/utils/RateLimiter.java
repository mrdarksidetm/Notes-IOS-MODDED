package com.revenuecat.purchases.utils;

import ae.j;
import ke.a;

/* JADX INFO: loaded from: classes2.dex */
public final class RateLimiter {
    private final long[] callTimestamps;
    private int index;
    private final int maxCallInclusive;
    private final int maxCallsInPeriod;
    private final long periodSeconds;

    private RateLimiter(int i10, long j10) {
        this.maxCallsInPeriod = i10;
        this.periodSeconds = j10;
        int i11 = i10 + 1;
        this.maxCallInclusive = i11;
        this.callTimestamps = new long[i11];
    }

    public /* synthetic */ RateLimiter(int i10, long j10, j jVar) {
        this(i10, j10);
    }

    public final int getMaxCallsInPeriod() {
        return this.maxCallsInPeriod;
    }

    /* JADX INFO: renamed from: getPeriodSeconds-UwyO8pc, reason: not valid java name */
    public final long m287getPeriodSecondsUwyO8pc() {
        return this.periodSeconds;
    }

    public final synchronized boolean shouldProceed() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = (this.index + 1) % this.maxCallInclusive;
        long j10 = this.callTimestamps[i10];
        if (j10 != 0 && jCurrentTimeMillis - j10 <= a.t(this.periodSeconds)) {
            return false;
        }
        this.callTimestamps[this.index] = jCurrentTimeMillis;
        this.index = i10;
        return true;
    }
}
