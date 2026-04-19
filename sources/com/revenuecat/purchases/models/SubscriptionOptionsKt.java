package com.revenuecat.purchases.models;

import com.revenuecat.purchases.models.Period;
import java.util.Map;
import md.x;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriptionOptionsKt {
    private static final int DAYS_IN_DAY = 1;
    private static final int DAYS_IN_MONTH = 30;
    private static final int DAYS_IN_WEEK = 7;
    private static final int DAYS_IN_YEAR = 365;
    private static final Map<Period.Unit, Integer> DAYS_IN_UNIT = r0.h(x.a(Period.Unit.DAY, 1), x.a(Period.Unit.WEEK, 7), x.a(Period.Unit.MONTH, 30), x.a(Period.Unit.YEAR, Integer.valueOf(DAYS_IN_YEAR)));
}
