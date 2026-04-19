package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends x8.a {
    public static final Parcelable.Creator<a0> CREATOR = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f14798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f14801d;

    public a0(byte[] bArr, String str, String str2, String str3) {
        this.f14798a = (byte[]) w8.m.k(bArr);
        this.f14799b = (String) w8.m.k(str);
        this.f14800c = str2;
        this.f14801d = (String) w8.m.k(str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Arrays.equals(this.f14798a, a0Var.f14798a) && w8.k.b(this.f14799b, a0Var.f14799b) && w8.k.b(this.f14800c, a0Var.f14800c) && w8.k.b(this.f14801d, a0Var.f14801d);
    }

    public String getName() {
        return this.f14799b;
    }

    public int hashCode() {
        return w8.k.c(this.f14798a, this.f14799b, this.f14800c, this.f14801d);
    }

    public String k() {
        return this.f14801d;
    }

    public String u() {
        return this.f14800c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.k(parcel, 2, x(), false);
        x8.c.C(parcel, 3, getName(), false);
        x8.c.C(parcel, 4, u(), false);
        x8.c.C(parcel, 5, k(), false);
        x8.c.b(parcel, iA);
    }

    public byte[] x() {
        return this.f14798a;
    }
}
