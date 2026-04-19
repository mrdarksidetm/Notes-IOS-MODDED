package com.revenuecat.purchases.ui.revenuecatui.extensions;

import ae.r;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import com.revenuecat.purchases.models.Period;
import java.util.Locale;
import je.v;
import je.w;
import md.q;

/* JADX INFO: loaded from: classes2.dex */
public final class PeriodExtensionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Period.Unit.values().length];
            try {
                iArr[Period.Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Period.Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Period.Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Period.Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final MeasureUnit getMeasureUnit(Period.Unit unit) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[unit.ordinal()];
        if (i10 == 1) {
            return MeasureUnit.DAY;
        }
        if (i10 == 2) {
            return MeasureUnit.WEEK;
        }
        if (i10 == 3) {
            return MeasureUnit.MONTH;
        }
        if (i10 == 4) {
            return MeasureUnit.YEAR;
        }
        if (i10 == 5) {
            return null;
        }
        throw new q();
    }

    private static final String localized(Period period, Locale locale, MeasureFormat.FormatWidth formatWidth) {
        String strLocalizedPeriod = localizedPeriod(period, locale, formatWidth);
        if (period.getValue() != 1 || !v.G(strLocalizedPeriod, "1", false, 2, null)) {
            return strLocalizedPeriod;
        }
        String strSubstring = strLocalizedPeriod.substring(1);
        r.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return w.W0(strSubstring).toString();
    }

    public static final String localizedAbbreviatedPeriod(Period period, Locale locale) {
        r.f(period, "<this>");
        r.f(locale, "locale");
        return localized(period, locale, MeasureFormat.FormatWidth.SHORT);
    }

    public static final String localizedPeriod(Period period, Locale locale, MeasureFormat.FormatWidth formatWidth) {
        r.f(period, "<this>");
        r.f(locale, "locale");
        r.f(formatWidth, "formatWidth");
        String str = MeasureFormat.getInstance(locale, formatWidth).format(new Measure(Integer.valueOf(period.getValue()), getMeasureUnit(period.getUnit())));
        r.e(str, "getInstance(locale, form… unit.measureUnit),\n    )");
        return str;
    }

    public static /* synthetic */ String localizedPeriod$default(Period period, Locale locale, MeasureFormat.FormatWidth formatWidth, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            formatWidth = MeasureFormat.FormatWidth.WIDE;
        }
        return localizedPeriod(period, locale, formatWidth);
    }

    public static final String localizedUnitPeriod(Period period, Locale locale) {
        r.f(period, "<this>");
        r.f(locale, "locale");
        return localized(period, locale, MeasureFormat.FormatWidth.WIDE);
    }
}
