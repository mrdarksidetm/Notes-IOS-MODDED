package l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzao;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends x8.a {
    public static final Parcelable.Creator<e0> CREATOR = new d1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f14842c = new e0(a.SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f14843d = new e0(a.NOT_SUPPORTED.toString(), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f14844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14845b;

    public enum a implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<a> CREATOR = new c1();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f14850a;

        a(String str) {
            this.f14850a = str;
        }

        public static a a(String str) throws b {
            for (a aVar : values()) {
                if (str.equals(aVar.f14850a)) {
                    return aVar;
                }
            }
            throw new b(str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f14850a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f14850a);
        }
    }

    public static class b extends Exception {
        public b(String str) {
            super(String.format("TokenBindingStatus %s not supported", str));
        }
    }

    e0(String str, String str2) {
        w8.m.k(str);
        try {
            this.f14844a = a.a(str);
            this.f14845b = str2;
        } catch (b e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return zzao.zza(this.f14844a, e0Var.f14844a) && zzao.zza(this.f14845b, e0Var.f14845b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14844a, this.f14845b});
    }

    public String u() {
        return this.f14845b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 2, x(), false);
        x8.c.C(parcel, 3, u(), false);
        x8.c.b(parcel, iA);
    }

    public String x() {
        return this.f14844a.toString();
    }
}
