package l9;

import android.os.Parcel;
import android.os.Parcelable;
import l9.b;
import l9.d0;

/* JADX INFO: loaded from: classes.dex */
public class k extends x8.a {
    public static final Parcelable.Creator<k> CREATOR = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f14875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f14876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h1 f14877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f14878d;

    k(String str, Boolean bool, String str2, String str3) {
        b bVarA;
        d0 d0VarA = null;
        if (str == null) {
            bVarA = null;
        } else {
            try {
                bVarA = b.a(str);
            } catch (b.a | d0.a | g1 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f14875a = bVarA;
        this.f14876b = bool;
        this.f14877c = str2 == null ? null : h1.a(str2);
        if (str3 != null) {
            d0VarA = d0.a(str3);
        }
        this.f14878d = d0VarA;
    }

    public String A() {
        if (z() == null) {
            return null;
        }
        return z().toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return w8.k.b(this.f14875a, kVar.f14875a) && w8.k.b(this.f14876b, kVar.f14876b) && w8.k.b(this.f14877c, kVar.f14877c) && w8.k.b(z(), kVar.z());
    }

    public int hashCode() {
        return w8.k.c(this.f14875a, this.f14876b, this.f14877c, z());
    }

    public String u() {
        b bVar = this.f14875a;
        if (bVar == null) {
            return null;
        }
        return bVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 2, u(), false);
        x8.c.i(parcel, 3, x(), false);
        h1 h1Var = this.f14877c;
        x8.c.C(parcel, 4, h1Var == null ? null : h1Var.toString(), false);
        x8.c.C(parcel, 5, A(), false);
        x8.c.b(parcel, iA);
    }

    public Boolean x() {
        return this.f14876b;
    }

    public d0 z() {
        d0 d0Var = this.f14878d;
        if (d0Var != null) {
            return d0Var;
        }
        Boolean bool = this.f14876b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return d0.RESIDENT_KEY_REQUIRED;
    }
}
