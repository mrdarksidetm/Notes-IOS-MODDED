package com.revenuecat.purchases.models;

import ce.c;
import com.revenuecat.purchases.models.Period;
import je.h;
import je.j;
import md.q;
import md.s;

/* JADX INFO: loaded from: classes2.dex */
public final class PeriodKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.Unit.values().length];
            try {
                iArr[Period.Unit.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.Unit.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.Unit.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Period.Unit.DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s<Integer, Period.Unit> toPeriod(String str) {
        double d10;
        double d11;
        double d12;
        h hVarD = new j("^P(?!$)(\\d+(?:\\.\\d+)?Y)?(\\d+(?:\\.\\d+)?M)?(\\d+(?:\\.\\d+)?W)?(\\d+(?:\\.\\d+)?D)?$").d(str);
        if (hVarD == null) {
            return new s<>(0, Period.Unit.UNKNOWN);
        }
        PeriodKt$toPeriod$1$toInt$1 periodKt$toPeriod$1$toInt$1 = PeriodKt$toPeriod$1$toInt$1.INSTANCE;
        h.b bVarA = hVarD.a();
        String str2 = bVarA.a().b().get(1);
        String str3 = bVarA.a().b().get(2);
        String str4 = bVarA.a().b().get(3);
        String str5 = bVarA.a().b().get(4);
        int iIntValue = periodKt$toPeriod$1$toInt$1.invoke(str2).intValue();
        int iIntValue2 = periodKt$toPeriod$1$toInt$1.invoke(str3).intValue();
        int iIntValue3 = periodKt$toPeriod$1$toInt$1.invoke(str4).intValue();
        int iIntValue4 = periodKt$toPeriod$1$toInt$1.invoke(str5).intValue();
        Period.Unit unit = iIntValue4 > 0 ? Period.Unit.DAY : iIntValue3 > 0 ? Period.Unit.WEEK : iIntValue2 > 0 ? Period.Unit.MONTH : iIntValue > 0 ? Period.Unit.YEAR : Period.Unit.UNKNOWN;
        int i10 = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                d11 = ((double) iIntValue) * 12.0d;
                d12 = iIntValue2;
            } else if (i10 == 3) {
                d11 = (((double) iIntValue) * 52.142857142857146d) + (((double) iIntValue2) * 4.345238095238096d);
                d12 = iIntValue3;
            } else if (i10 == 4) {
                d11 = (((double) iIntValue) * 365.0d) + (((double) iIntValue2) * 30.0d) + (((double) iIntValue3) * 7.0d);
                d12 = iIntValue4;
            } else {
                if (i10 != 5) {
                    throw new q();
                }
                d10 = 0.0d;
            }
            d10 = d11 + d12;
        } else {
            d10 = iIntValue;
        }
        return new s<>(Integer.valueOf(c.c(d10)), unit);
    }
}
