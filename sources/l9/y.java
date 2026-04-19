package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class y extends x8.a {
    public static final Parcelable.Creator<y> CREATOR = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14955c;

    public y(String str, String str2, String str3) {
        this.f14953a = (String) w8.m.k(str);
        this.f14954b = (String) w8.m.k(str2);
        this.f14955c = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return w8.k.b(this.f14953a, yVar.f14953a) && w8.k.b(this.f14954b, yVar.f14954b) && w8.k.b(this.f14955c, yVar.f14955c);
    }

    public String getName() {
        return this.f14954b;
    }

    public int hashCode() {
        return w8.k.c(this.f14953a, this.f14954b, this.f14955c);
    }

    public String u() {
        return this.f14955c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 2, x(), false);
        x8.c.C(parcel, 3, getName(), false);
        x8.c.C(parcel, 4, u(), false);
        x8.c.b(parcel, iA);
    }

    public String x() {
        return this.f14953a;
    }
}
