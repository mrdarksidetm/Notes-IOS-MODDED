package m9;

import android.os.Parcel;
import android.os.Parcelable;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class a extends x8.a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f15507d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15508e = new a("unavailable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15509f = new a("unused");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0356a f15510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15512c;

    /* JADX INFO: renamed from: m9.a$a, reason: collision with other inner class name */
    public enum EnumC0356a implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);

        public static final Parcelable.Creator<EnumC0356a> CREATOR = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15517a;

        EnumC0356a(int i10) {
            this.f15517a = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f15517a);
        }
    }

    public static class b extends Exception {
        public b(int i10) {
            super(String.format("ChannelIdValueType %s not supported", Integer.valueOf(i10)));
        }
    }

    private a() {
        this.f15510a = EnumC0356a.ABSENT;
        this.f15512c = null;
        this.f15511b = null;
    }

    a(int i10, String str, String str2) {
        try {
            this.f15510a = A(i10);
            this.f15511b = str;
            this.f15512c = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private a(String str) {
        this.f15511b = (String) m.k(str);
        this.f15510a = EnumC0356a.STRING;
        this.f15512c = null;
    }

    public static EnumC0356a A(int i10) throws b {
        for (EnumC0356a enumC0356a : EnumC0356a.values()) {
            if (i10 == enumC0356a.f15517a) {
                return enumC0356a;
            }
        }
        throw new b(i10);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f15510a.equals(aVar.f15510a)) {
            return false;
        }
        int iOrdinal = this.f15510a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            str = this.f15511b;
            str2 = aVar.f15511b;
        } else {
            if (iOrdinal != 2) {
                return false;
            }
            str = this.f15512c;
            str2 = aVar.f15512c;
        }
        return str.equals(str2);
    }

    public int hashCode() {
        int i10;
        String str;
        int iHashCode = this.f15510a.hashCode() + 31;
        int iOrdinal = this.f15510a.ordinal();
        if (iOrdinal == 1) {
            i10 = iHashCode * 31;
            str = this.f15511b;
        } else {
            if (iOrdinal != 2) {
                return iHashCode;
            }
            i10 = iHashCode * 31;
            str = this.f15512c;
        }
        return i10 + str.hashCode();
    }

    public String u() {
        return this.f15512c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 2, z());
        x8.c.C(parcel, 3, x(), false);
        x8.c.C(parcel, 4, u(), false);
        x8.c.b(parcel, iA);
    }

    public String x() {
        return this.f15511b;
    }

    public int z() {
        return this.f15510a.f15517a;
    }
}
