package com.revenuecat.purchases.models;

import ae.r;
import ae.s;
import je.u;
import je.y;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PeriodKt$toPeriod$1$toInt$1 extends s implements l<String, Integer> {
    public static final PeriodKt$toPeriod$1$toInt$1 INSTANCE = new PeriodKt$toPeriod$1$toInt$1();

    PeriodKt$toPeriod$1$toInt$1() {
        super(1);
    }

    @Override // zd.l
    public final Integer invoke(String str) {
        r.f(str, "part");
        Integer numL = u.l(y.Y0(str, 1));
        return Integer.valueOf(numL != null ? numL.intValue() : 0);
    }
}
