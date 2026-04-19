package n8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class m extends x8.a {
    public static final Parcelable.Creator<m> CREATOR = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16014b;

    public m(String str, String str2) {
        this.f16013a = w8.m.f(((String) w8.m.l(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f16014b = w8.m.e(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return w8.k.b(this.f16013a, mVar.f16013a) && w8.k.b(this.f16014b, mVar.f16014b);
    }

    public int hashCode() {
        return w8.k.c(this.f16013a, this.f16014b);
    }

    public String u() {
        return this.f16013a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, u(), false);
        x8.c.C(parcel, 2, x(), false);
        x8.c.b(parcel, iA);
    }

    public String x() {
        return this.f16014b;
    }
}
