package n8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class f extends x8.a {
    public static final Parcelable.Creator<f> CREATOR = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f15989f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f15990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f15991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f15992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f15993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f15994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f15995f;

        public f a() {
            return new f(this.f15990a, this.f15991b, this.f15992c, this.f15993d, this.f15994e, this.f15995f);
        }

        public a b(String str) {
            this.f15991b = str;
            return this;
        }

        public a c(String str) {
            this.f15993d = str;
            return this;
        }

        @Deprecated
        public a d(boolean z10) {
            this.f15994e = z10;
            return this;
        }

        public a e(String str) {
            w8.m.k(str);
            this.f15990a = str;
            return this;
        }

        public final a f(String str) {
            this.f15992c = str;
            return this;
        }

        public final a g(int i10) {
            this.f15995f = i10;
            return this;
        }
    }

    f(String str, String str2, String str3, String str4, boolean z10, int i10) {
        w8.m.k(str);
        this.f15984a = str;
        this.f15985b = str2;
        this.f15986c = str3;
        this.f15987d = str4;
        this.f15988e = z10;
        this.f15989f = i10;
    }

    public static a C(f fVar) {
        w8.m.k(fVar);
        a aVarU = u();
        aVarU.e(fVar.A());
        aVarU.c(fVar.z());
        aVarU.b(fVar.x());
        aVarU.d(fVar.f15988e);
        aVarU.g(fVar.f15989f);
        String str = fVar.f15986c;
        if (str != null) {
            aVarU.f(str);
        }
        return aVarU;
    }

    public static a u() {
        return new a();
    }

    public String A() {
        return this.f15984a;
    }

    @Deprecated
    public boolean B() {
        return this.f15988e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return w8.k.b(this.f15984a, fVar.f15984a) && w8.k.b(this.f15987d, fVar.f15987d) && w8.k.b(this.f15985b, fVar.f15985b) && w8.k.b(Boolean.valueOf(this.f15988e), Boolean.valueOf(fVar.f15988e)) && this.f15989f == fVar.f15989f;
    }

    public int hashCode() {
        return w8.k.c(this.f15984a, this.f15985b, this.f15987d, Boolean.valueOf(this.f15988e), Integer.valueOf(this.f15989f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.C(parcel, 1, A(), false);
        x8.c.C(parcel, 2, x(), false);
        x8.c.C(parcel, 3, this.f15986c, false);
        x8.c.C(parcel, 4, z(), false);
        x8.c.g(parcel, 5, B());
        x8.c.s(parcel, 6, this.f15989f);
        x8.c.b(parcel, iA);
    }

    public String x() {
        return this.f15985b;
    }

    public String z() {
        return this.f15987d;
    }
}
