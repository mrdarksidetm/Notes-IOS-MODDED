package com.revenuecat.purchases.models;

import ae.j;
import ae.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.LogUtilsKt;
import md.q;
import md.s;

/* JADX INFO: loaded from: classes2.dex */
public final class Period implements Parcelable {
    private final String iso8601;
    private final Unit unit;
    private final int value;
    public static final Factory Factory = new Factory(null);
    public static final Parcelable.Creator<Period> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Period> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period createFromParcel(Parcel parcel) {
            r.f(parcel, "parcel");
            return new Period(parcel.readInt(), Unit.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period[] newArray(int i10) {
            return new Period[i10];
        }
    }

    public static final class Factory {
        private Factory() {
        }

        public /* synthetic */ Factory(j jVar) {
            this();
        }

        public final Period create(String str) {
            r.f(str, "iso8601");
            s period = PeriodKt.toPeriod(str);
            return new Period(((Number) period.c()).intValue(), (Unit) period.d(), str);
        }
    }

    public enum Unit {
        DAY,
        WEEK,
        MONTH,
        YEAR,
        UNKNOWN
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Unit.values().length];
            try {
                iArr[Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Period(int i10, Unit unit, String str) {
        r.f(unit, "unit");
        r.f(str, "iso8601");
        this.value = i10;
        this.unit = unit;
        this.iso8601 = str;
    }

    public static /* synthetic */ Period copy$default(Period period, int i10, Unit unit, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = period.value;
        }
        if ((i11 & 2) != 0) {
            unit = period.unit;
        }
        if ((i11 & 4) != 0) {
            str = period.iso8601;
        }
        return period.copy(i10, unit, str);
    }

    public final int component1() {
        return this.value;
    }

    public final Unit component2() {
        return this.unit;
    }

    public final String component3() {
        return this.iso8601;
    }

    public final Period copy(int i10, Unit unit, String str) {
        r.f(unit, "unit");
        r.f(str, "iso8601");
        return new Period(i10, unit, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.value == period.value && this.unit == period.unit && r.b(this.iso8601, period.iso8601);
    }

    public final String getIso8601() {
        return this.iso8601;
    }

    public final Unit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public final double getValueInMonths() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            d10 = this.value;
            d11 = 30.0d;
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    return this.value;
                }
                if (i10 == 4) {
                    return ((double) this.value) * 12.0d;
                }
                if (i10 != 5) {
                    throw new q();
                }
                LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
                return 0.0d;
            }
            d10 = this.value;
            d11 = 4.345238095238096d;
        }
        return d10 / d11;
    }

    public final double getValueInWeeks$purchases_defaultsRelease() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            return ((double) this.value) / 7.0d;
        }
        if (i10 == 2) {
            return this.value;
        }
        if (i10 == 3) {
            d10 = this.value;
            d11 = 4.345238095238096d;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new q();
                }
                LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
                return 0.0d;
            }
            d10 = this.value;
            d11 = 52.142857142857146d;
        }
        return d10 * d11;
    }

    public final double getValueInYears$purchases_defaultsRelease() {
        double d10;
        double d11;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i10 == 1) {
            d10 = this.value;
            d11 = 365.0d;
        } else if (i10 == 2) {
            d10 = this.value;
            d11 = 52.142857142857146d;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return this.value;
                }
                if (i10 != 5) {
                    throw new q();
                }
                LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
                return 0.0d;
            }
            d10 = this.value;
            d11 = 12.0d;
        }
        return d10 / d11;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.value) * 31) + this.unit.hashCode()) * 31) + this.iso8601.hashCode();
    }

    public String toString() {
        return "Period(value=" + this.value + ", unit=" + this.unit + ", iso8601=" + this.iso8601 + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "out");
        parcel.writeInt(this.value);
        parcel.writeString(this.unit.name());
        parcel.writeString(this.iso8601);
    }
}
