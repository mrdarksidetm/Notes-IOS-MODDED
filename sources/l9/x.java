package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class x extends c0 {
    public static final Parcelable.Creator<x> CREATOR = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f14944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f14945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f14947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f14948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e0 f14949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h1 f14950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f14951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Long f14952i;

    x(byte[] bArr, Double d10, String str, List list, Integer num, e0 e0Var, String str2, d dVar, Long l10) {
        this.f14944a = (byte[]) w8.m.k(bArr);
        this.f14945b = d10;
        this.f14946c = (String) w8.m.k(str);
        this.f14947d = list;
        this.f14948e = num;
        this.f14949f = e0Var;
        this.f14952i = l10;
        if (str2 != null) {
            try {
                this.f14950g = h1.a(str2);
            } catch (g1 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f14950g = null;
        }
        this.f14951h = dVar;
    }

    public Integer A() {
        return this.f14948e;
    }

    public String B() {
        return this.f14946c;
    }

    public Double C() {
        return this.f14945b;
    }

    public e0 D() {
        return this.f14949f;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Arrays.equals(this.f14944a, xVar.f14944a) && w8.k.b(this.f14945b, xVar.f14945b) && w8.k.b(this.f14946c, xVar.f14946c) && (((list = this.f14947d) == null && xVar.f14947d == null) || (list != null && (list2 = xVar.f14947d) != null && list.containsAll(list2) && xVar.f14947d.containsAll(this.f14947d))) && w8.k.b(this.f14948e, xVar.f14948e) && w8.k.b(this.f14949f, xVar.f14949f) && w8.k.b(this.f14950g, xVar.f14950g) && w8.k.b(this.f14951h, xVar.f14951h) && w8.k.b(this.f14952i, xVar.f14952i);
    }

    public int hashCode() {
        return w8.k.c(Integer.valueOf(Arrays.hashCode(this.f14944a)), this.f14945b, this.f14946c, this.f14947d, this.f14948e, this.f14949f, this.f14950g, this.f14951h, this.f14952i);
    }

    public List<v> u() {
        return this.f14947d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.k(parcel, 2, z(), false);
        x8.c.o(parcel, 3, C(), false);
        x8.c.C(parcel, 4, B(), false);
        x8.c.G(parcel, 5, u(), false);
        x8.c.u(parcel, 6, A(), false);
        x8.c.A(parcel, 7, D(), i10, false);
        h1 h1Var = this.f14950g;
        x8.c.C(parcel, 8, h1Var == null ? null : h1Var.toString(), false);
        x8.c.A(parcel, 9, x(), i10, false);
        x8.c.x(parcel, 10, this.f14952i, false);
        x8.c.b(parcel, iA);
    }

    public d x() {
        return this.f14951h;
    }

    public byte[] z() {
        return this.f14944a;
    }
}
