package l9;

import android.os.Parcel;
import android.os.Parcelable;
import l9.o;
import l9.z;

/* JADX INFO: loaded from: classes.dex */
public class w extends x8.a {
    public static final Parcelable.Creator<w> CREATOR = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f14942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f14943b;

    public w(String str, int i10) {
        w8.m.k(str);
        try {
            this.f14942a = z.a(str);
            w8.m.k(Integer.valueOf(i10));
            try {
                this.f14943b = o.a(i10);
            } catch (o.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (z.a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f14942a.equals(wVar.f14942a) && this.f14943b.equals(wVar.f14943b);
    }

    public int hashCode() {
        return w8.k.c(this.f14942a, this.f14943b);
    }

    public int u() {
        return this.f14943b.b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 2, x(), false);
        x8.c.u(parcel, 3, Integer.valueOf(u()), false);
        x8.c.b(parcel, iA);
    }

    public String x() {
        return this.f14942a.toString();
    }
}
