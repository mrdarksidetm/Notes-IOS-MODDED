package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class t extends x8.a {
    public static final Parcelable.Creator<t> CREATOR = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f14921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f14922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f14923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f14924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f14925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f14926h;

    t(String str, String str2, byte[] bArr, h hVar, g gVar, i iVar, e eVar, String str3) {
        boolean z10 = true;
        if ((hVar == null || gVar != null || iVar != null) && ((hVar != null || gVar == null || iVar != null) && (hVar != null || gVar != null || iVar == null))) {
            z10 = false;
        }
        w8.m.a(z10);
        this.f14919a = str;
        this.f14920b = str2;
        this.f14921c = bArr;
        this.f14922d = hVar;
        this.f14923e = gVar;
        this.f14924f = iVar;
        this.f14925g = eVar;
        this.f14926h = str3;
    }

    public byte[] A() {
        return this.f14921c;
    }

    public String B() {
        return this.f14920b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return w8.k.b(this.f14919a, tVar.f14919a) && w8.k.b(this.f14920b, tVar.f14920b) && Arrays.equals(this.f14921c, tVar.f14921c) && w8.k.b(this.f14922d, tVar.f14922d) && w8.k.b(this.f14923e, tVar.f14923e) && w8.k.b(this.f14924f, tVar.f14924f) && w8.k.b(this.f14925g, tVar.f14925g) && w8.k.b(this.f14926h, tVar.f14926h);
    }

    public int hashCode() {
        return w8.k.c(this.f14919a, this.f14920b, this.f14921c, this.f14923e, this.f14922d, this.f14924f, this.f14925g, this.f14926h);
    }

    public String u() {
        return this.f14926h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, z(), false);
        x8.c.C(parcel, 2, B(), false);
        x8.c.k(parcel, 3, A(), false);
        x8.c.A(parcel, 4, this.f14922d, i10, false);
        x8.c.A(parcel, 5, this.f14923e, i10, false);
        x8.c.A(parcel, 6, this.f14924f, i10, false);
        x8.c.A(parcel, 7, x(), i10, false);
        x8.c.C(parcel, 8, u(), false);
        x8.c.b(parcel, iA);
    }

    public e x() {
        return this.f14925g;
    }

    public String z() {
        return this.f14919a;
    }
}
