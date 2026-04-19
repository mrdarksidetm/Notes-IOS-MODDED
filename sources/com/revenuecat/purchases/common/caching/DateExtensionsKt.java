package com.revenuecat.purchases.common.caching;

import ae.r;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.ReceiptStrings;
import java.util.Arrays;
import java.util.Date;
import ke.a;
import ke.c;
import ke.d;

/* JADX INFO: loaded from: classes2.dex */
public final class DateExtensionsKt {
    private static final long CACHE_REFRESH_PERIOD_IN_BACKGROUND;
    private static final long CACHE_REFRESH_PERIOD_IN_FOREGROUND;

    static {
        a.C0337a c0337a = a.f14459b;
        CACHE_REFRESH_PERIOD_IN_FOREGROUND = c.s(5, d.f14470f);
        CACHE_REFRESH_PERIOD_IN_BACKGROUND = c.s(25, d.f14471g);
    }

    public static final boolean isCacheStale(Date date, boolean z10, DateProvider dateProvider) {
        r.f(dateProvider, "dateProvider");
        if (date == null) {
            return true;
        }
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(ReceiptStrings.CHECKING_IF_CACHE_STALE, Arrays.copyOf(new Object[]{Boolean.valueOf(z10)}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        return m18isCacheStale8Mi8wO0(date, z10 ? CACHE_REFRESH_PERIOD_IN_BACKGROUND : CACHE_REFRESH_PERIOD_IN_FOREGROUND, dateProvider);
    }

    public static /* synthetic */ boolean isCacheStale$default(Date date, boolean z10, DateProvider dateProvider, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dateProvider = new DefaultDateProvider();
        }
        return isCacheStale(date, z10, dateProvider);
    }

    /* JADX INFO: renamed from: isCacheStale-8Mi8wO0, reason: not valid java name */
    public static final boolean m18isCacheStale8Mi8wO0(Date date, long j10, DateProvider dateProvider) {
        r.f(dateProvider, "dateProvider");
        if (date == null) {
            return true;
        }
        a.C0337a c0337a = a.f14459b;
        return a.m(c.t(dateProvider.getNow().getTime() - date.getTime(), d.f14468d), j10) >= 0;
    }

    /* JADX INFO: renamed from: isCacheStale-8Mi8wO0$default, reason: not valid java name */
    public static /* synthetic */ boolean m19isCacheStale8Mi8wO0$default(Date date, long j10, DateProvider dateProvider, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dateProvider = new DefaultDateProvider();
        }
        return m18isCacheStale8Mi8wO0(date, j10, dateProvider);
    }
}
