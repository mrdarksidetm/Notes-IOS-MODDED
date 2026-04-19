package n8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l extends x8.a {
    public static final Parcelable.Creator<l> CREATOR = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f16008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f16009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f16010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f16011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final l9.t f16012i;

    l(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, l9.t tVar) {
        this.f16004a = (String) w8.m.k(str);
        this.f16005b = str2;
        this.f16006c = str3;
        this.f16007d = str4;
        this.f16008e = uri;
        this.f16009f = str5;
        this.f16010g = str6;
        this.f16011h = str7;
        this.f16012i = tVar;
    }

    public String A() {
        return this.f16004a;
    }

    public String B() {
        return this.f16009f;
    }

    public Uri C() {
        return this.f16008e;
    }

    public l9.t D() {
        return this.f16012i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return w8.k.b(this.f16004a, lVar.f16004a) && w8.k.b(this.f16005b, lVar.f16005b) && w8.k.b(this.f16006c, lVar.f16006c) && w8.k.b(this.f16007d, lVar.f16007d) && w8.k.b(this.f16008e, lVar.f16008e) && w8.k.b(this.f16009f, lVar.f16009f) && w8.k.b(this.f16010g, lVar.f16010g) && w8.k.b(this.f16011h, lVar.f16011h) && w8.k.b(this.f16012i, lVar.f16012i);
    }

    @Deprecated
    public String g() {
        return this.f16011h;
    }

    public int hashCode() {
        return w8.k.c(this.f16004a, this.f16005b, this.f16006c, this.f16007d, this.f16008e, this.f16009f, this.f16010g, this.f16011h, this.f16012i);
    }

    public String k() {
        return this.f16005b;
    }

    public String u() {
        return this.f16007d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, A(), false);
        x8.c.C(parcel, 2, k(), false);
        x8.c.C(parcel, 3, x(), false);
        x8.c.C(parcel, 4, u(), false);
        x8.c.A(parcel, 5, C(), i10, false);
        x8.c.C(parcel, 6, B(), false);
        x8.c.C(parcel, 7, z(), false);
        x8.c.C(parcel, 8, g(), false);
        x8.c.A(parcel, 9, D(), i10, false);
        x8.c.b(parcel, iA);
    }

    public String x() {
        return this.f16006c;
    }

    public String z() {
        return this.f16010g;
    }
}
