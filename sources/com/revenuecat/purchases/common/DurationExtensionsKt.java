package com.revenuecat.purchases.common;

import ae.r;
import java.util.Date;
import ke.a;
import ke.c;
import ke.d;

/* JADX INFO: loaded from: classes2.dex */
public final class DurationExtensionsKt {
    public static final long between(a.C0337a c0337a, Date date, Date date2) {
        r.f(c0337a, "<this>");
        r.f(date, "startTime");
        r.f(date2, "endTime");
        return c.t(date2.getTime() - date.getTime(), d.f14468d);
    }

    /* JADX INFO: renamed from: min-QTBD994, reason: not valid java name */
    public static final long m17minQTBD994(long j10, long j11) {
        return a.m(j10, j11) < 0 ? j10 : j11;
    }
}
