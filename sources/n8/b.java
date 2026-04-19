package n8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x8.a {
    public static final Parcelable.Creator<b> CREATOR = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f15942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0362b f15943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f15946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f15947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f15948g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f15949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C0362b f15950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f15951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f15952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f15953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f15954f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f15955g;

        public a() {
            e.a aVarU = e.u();
            aVarU.b(false);
            this.f15949a = aVarU.a();
            C0362b.a aVarU2 = C0362b.u();
            aVarU2.b(false);
            this.f15950b = aVarU2.a();
            d.a aVarU3 = d.u();
            aVarU3.b(false);
            this.f15951c = aVarU3.a();
            c.a aVarU4 = c.u();
            aVarU4.b(false);
            this.f15952d = aVarU4.a();
        }

        public b a() {
            return new b(this.f15949a, this.f15950b, this.f15953e, this.f15954f, this.f15955g, this.f15951c, this.f15952d);
        }

        public a b(boolean z10) {
            this.f15954f = z10;
            return this;
        }

        public a c(C0362b c0362b) {
            this.f15950b = (C0362b) w8.m.k(c0362b);
            return this;
        }

        public a d(c cVar) {
            this.f15952d = (c) w8.m.k(cVar);
            return this;
        }

        @Deprecated
        public a e(d dVar) {
            this.f15951c = (d) w8.m.k(dVar);
            return this;
        }

        public a f(e eVar) {
            this.f15949a = (e) w8.m.k(eVar);
            return this;
        }

        public final a g(String str) {
            this.f15953e = str;
            return this;
        }

        public final a h(int i10) {
            this.f15955g = i10;
            return this;
        }
    }

    /* JADX INFO: renamed from: n8.b$b, reason: collision with other inner class name */
    public static final class C0362b extends x8.a {
        public static final Parcelable.Creator<C0362b> CREATOR = new v();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f15956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f15957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f15958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f15959d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f15960e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f15961f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f15962g;

        /* JADX INFO: renamed from: n8.b$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f15963a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f15964b = null;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f15965c = null;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f15966d = true;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f15967e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private List f15968f = null;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private boolean f15969g = false;

            public C0362b a() {
                return new C0362b(this.f15963a, this.f15964b, this.f15965c, this.f15966d, this.f15967e, this.f15968f, this.f15969g);
            }

            public a b(boolean z10) {
                this.f15963a = z10;
                return this;
            }
        }

        C0362b(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            w8.m.b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f15956a = z10;
            if (z10) {
                w8.m.l(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f15957b = str;
            this.f15958c = str2;
            this.f15959d = z11;
            Parcelable.Creator<b> creator = b.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f15961f = arrayList;
            this.f15960e = str3;
            this.f15962g = z12;
        }

        public static a u() {
            return new a();
        }

        public String A() {
            return this.f15960e;
        }

        public String B() {
            return this.f15958c;
        }

        public String C() {
            return this.f15957b;
        }

        public boolean D() {
            return this.f15956a;
        }

        @Deprecated
        public boolean E() {
            return this.f15962g;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0362b)) {
                return false;
            }
            C0362b c0362b = (C0362b) obj;
            return this.f15956a == c0362b.f15956a && w8.k.b(this.f15957b, c0362b.f15957b) && w8.k.b(this.f15958c, c0362b.f15958c) && this.f15959d == c0362b.f15959d && w8.k.b(this.f15960e, c0362b.f15960e) && w8.k.b(this.f15961f, c0362b.f15961f) && this.f15962g == c0362b.f15962g;
        }

        public int hashCode() {
            return w8.k.c(Boolean.valueOf(this.f15956a), this.f15957b, this.f15958c, Boolean.valueOf(this.f15959d), this.f15960e, this.f15961f, Boolean.valueOf(this.f15962g));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int iA = x8.c.a(parcel);
            x8.c.g(parcel, 1, D());
            x8.c.C(parcel, 2, C(), false);
            x8.c.C(parcel, 3, B(), false);
            x8.c.g(parcel, 4, x());
            x8.c.C(parcel, 5, A(), false);
            x8.c.E(parcel, 6, z(), false);
            x8.c.g(parcel, 7, E());
            x8.c.b(parcel, iA);
        }

        public boolean x() {
            return this.f15959d;
        }

        public List<String> z() {
            return this.f15961f;
        }
    }

    public static final class c extends x8.a {
        public static final Parcelable.Creator<c> CREATOR = new w();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f15970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f15971b;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f15972a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f15973b;

            public c a() {
                return new c(this.f15972a, this.f15973b);
            }

            public a b(boolean z10) {
                this.f15972a = z10;
                return this;
            }
        }

        c(boolean z10, String str) {
            if (z10) {
                w8.m.k(str);
            }
            this.f15970a = z10;
            this.f15971b = str;
        }

        public static a u() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f15970a == cVar.f15970a && w8.k.b(this.f15971b, cVar.f15971b);
        }

        public int hashCode() {
            return w8.k.c(Boolean.valueOf(this.f15970a), this.f15971b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int iA = x8.c.a(parcel);
            x8.c.g(parcel, 1, z());
            x8.c.C(parcel, 2, x(), false);
            x8.c.b(parcel, iA);
        }

        public String x() {
            return this.f15971b;
        }

        public boolean z() {
            return this.f15970a;
        }
    }

    @Deprecated
    public static final class d extends x8.a {
        public static final Parcelable.Creator<d> CREATOR = new x();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f15974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f15975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f15976c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f15977a = false;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private byte[] f15978b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f15979c;

            public d a() {
                return new d(this.f15977a, this.f15978b, this.f15979c);
            }

            public a b(boolean z10) {
                this.f15977a = z10;
                return this;
            }
        }

        d(boolean z10, byte[] bArr, String str) {
            if (z10) {
                w8.m.k(bArr);
                w8.m.k(str);
            }
            this.f15974a = z10;
            this.f15975b = bArr;
            this.f15976c = str;
        }

        public static a u() {
            return new a();
        }

        public boolean A() {
            return this.f15974a;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f15974a == dVar.f15974a && Arrays.equals(this.f15975b, dVar.f15975b) && ((str = this.f15976c) == (str2 = dVar.f15976c) || (str != null && str.equals(str2)));
        }

        public int hashCode() {
            return (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f15974a), this.f15976c}) * 31) + Arrays.hashCode(this.f15975b);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int iA = x8.c.a(parcel);
            x8.c.g(parcel, 1, A());
            x8.c.k(parcel, 2, x(), false);
            x8.c.C(parcel, 3, z(), false);
            x8.c.b(parcel, iA);
        }

        public byte[] x() {
            return this.f15975b;
        }

        public String z() {
            return this.f15976c;
        }
    }

    public static final class e extends x8.a {
        public static final Parcelable.Creator<e> CREATOR = new y();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f15980a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f15981a = false;

            public e a() {
                return new e(this.f15981a);
            }

            public a b(boolean z10) {
                this.f15981a = z10;
                return this;
            }
        }

        e(boolean z10) {
            this.f15980a = z10;
        }

        public static a u() {
            return new a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof e) && this.f15980a == ((e) obj).f15980a;
        }

        public int hashCode() {
            return w8.k.c(Boolean.valueOf(this.f15980a));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int iA = x8.c.a(parcel);
            x8.c.g(parcel, 1, x());
            x8.c.b(parcel, iA);
        }

        public boolean x() {
            return this.f15980a;
        }
    }

    b(e eVar, C0362b c0362b, String str, boolean z10, int i10, d dVar, c cVar) {
        this.f15942a = (e) w8.m.k(eVar);
        this.f15943b = (C0362b) w8.m.k(c0362b);
        this.f15944c = str;
        this.f15945d = z10;
        this.f15946e = i10;
        if (dVar == null) {
            d.a aVarU = d.u();
            aVarU.b(false);
            dVar = aVarU.a();
        }
        this.f15947f = dVar;
        if (cVar == null) {
            c.a aVarU2 = c.u();
            aVarU2.b(false);
            cVar = aVarU2.a();
        }
        this.f15948g = cVar;
    }

    public static a D(b bVar) {
        w8.m.k(bVar);
        a aVarU = u();
        aVarU.c(bVar.x());
        aVarU.f(bVar.B());
        aVarU.e(bVar.A());
        aVarU.d(bVar.z());
        aVarU.b(bVar.f15945d);
        aVarU.h(bVar.f15946e);
        String str = bVar.f15944c;
        if (str != null) {
            aVarU.g(str);
        }
        return aVarU;
    }

    public static a u() {
        return new a();
    }

    public d A() {
        return this.f15947f;
    }

    public e B() {
        return this.f15942a;
    }

    public boolean C() {
        return this.f15945d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return w8.k.b(this.f15942a, bVar.f15942a) && w8.k.b(this.f15943b, bVar.f15943b) && w8.k.b(this.f15947f, bVar.f15947f) && w8.k.b(this.f15948g, bVar.f15948g) && w8.k.b(this.f15944c, bVar.f15944c) && this.f15945d == bVar.f15945d && this.f15946e == bVar.f15946e;
    }

    public int hashCode() {
        return w8.k.c(this.f15942a, this.f15943b, this.f15947f, this.f15948g, this.f15944c, Boolean.valueOf(this.f15945d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.c.a(parcel);
        x8.c.A(parcel, 1, B(), i10, false);
        x8.c.A(parcel, 2, x(), i10, false);
        x8.c.C(parcel, 3, this.f15944c, false);
        x8.c.g(parcel, 4, C());
        x8.c.s(parcel, 5, this.f15946e);
        x8.c.A(parcel, 6, A(), i10, false);
        x8.c.A(parcel, 7, z(), i10, false);
        x8.c.b(parcel, iA);
    }

    public C0362b x() {
        return this.f15943b;
    }

    public c z() {
        return this.f15948g;
    }
}
