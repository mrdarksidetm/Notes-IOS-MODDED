package m9;

import android.os.Parcel;
import android.os.Parcelable;
import m9.c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public enum c implements Parcelable {
    UNKNOWN("UNKNOWN"),
    V1("U2F_V1"),
    V2("U2F_V2");

    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator() { // from class: m9.i
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return c.a(parcel.readString());
            } catch (c.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new c[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15526a;

    public static class a extends Exception {
        public a(String str) {
            super(String.format("Protocol version %s not supported", str));
        }
    }

    c(String str) {
        this.f15526a = str;
    }

    public static c a(String str) throws a {
        if (str == null) {
            return UNKNOWN;
        }
        for (c cVar : values()) {
            if (str.equals(cVar.f15526a)) {
                return cVar;
            }
        }
        throw new a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f15526a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15526a);
    }
}
