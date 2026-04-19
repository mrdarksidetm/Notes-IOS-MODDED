package h0;

import f1.b;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11594a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f11595b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f11596c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final m f11597d = new l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final m f11598e = new C0280b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f11599f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f11600g = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final f f11601h = new h();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final f f11602i = new g();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11603a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final e f11604b = new C0279b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final e f11605c = new C0278a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final e f11606d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final e f11607e = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final e f11608f = new f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final e f11609g = new d();

        /* JADX INFO: renamed from: h0.b$a$a, reason: collision with other inner class name */
        public static final class C0278a implements e {
            C0278a() {
            }

            @Override // h0.b.e
            public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
                b.f11594a.i(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        /* JADX INFO: renamed from: h0.b$a$b, reason: collision with other inner class name */
        public static final class C0279b implements e {
            C0279b() {
            }

            @Override // h0.b.e
            public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
                b.f11594a.j(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        public static final class c implements e {
            c() {
            }

            @Override // h0.b.e
            public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
                b.f11594a.k(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        public static final class d implements e {
            d() {
            }

            @Override // h0.b.e
            public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
                b.f11594a.l(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        public static final class e implements e {
            e() {
            }

            @Override // h0.b.e
            public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
                b.f11594a.m(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        public static final class f implements e {
            f() {
            }

            @Override // h0.b.e
            public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
                b.f11594a.n(i10, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        private a() {
        }

        public final e a() {
            return f11608f;
        }
    }

    /* JADX INFO: renamed from: h0.b$b, reason: collision with other inner class name */
    public static final class C0280b implements m {
        C0280b() {
        }

        @Override // h0.b.m
        public void b(w2.d dVar, int i10, int[] iArr, int[] iArr2) {
            b.f11594a.k(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    public static final class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f11610a = w2.h.m(0);

        c() {
        }

        @Override // h0.b.e, h0.b.m
        public float a() {
            return this.f11610a;
        }

        @Override // h0.b.m
        public void b(w2.d dVar, int i10, int[] iArr, int[] iArr2) {
            b.f11594a.i(i10, iArr, iArr2, false);
        }

        @Override // h0.b.e
        public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
            b bVar;
            boolean z10;
            if (rVar == w2.r.Ltr) {
                bVar = b.f11594a;
                z10 = false;
            } else {
                bVar = b.f11594a;
                z10 = true;
            }
            bVar.i(i10, iArr, iArr2, z10);
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    public static final class d implements e {
        d() {
        }

        @Override // h0.b.e
        public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
            if (rVar == w2.r.Ltr) {
                b.f11594a.k(i10, iArr, iArr2, false);
            } else {
                b.f11594a.j(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    public interface e {
        default float a() {
            return w2.h.m(0);
        }

        void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2);
    }

    public interface f extends e, m {
    }

    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f11611a = w2.h.m(0);

        g() {
        }

        @Override // h0.b.e, h0.b.m
        public float a() {
            return this.f11611a;
        }

        @Override // h0.b.m
        public void b(w2.d dVar, int i10, int[] iArr, int[] iArr2) {
            b.f11594a.l(i10, iArr, iArr2, false);
        }

        @Override // h0.b.e
        public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
            b bVar;
            boolean z10;
            if (rVar == w2.r.Ltr) {
                bVar = b.f11594a;
                z10 = false;
            } else {
                bVar = b.f11594a;
                z10 = true;
            }
            bVar.l(i10, iArr, iArr2, z10);
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    public static final class h implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f11612a = w2.h.m(0);

        h() {
        }

        @Override // h0.b.e, h0.b.m
        public float a() {
            return this.f11612a;
        }

        @Override // h0.b.m
        public void b(w2.d dVar, int i10, int[] iArr, int[] iArr2) {
            b.f11594a.m(i10, iArr, iArr2, false);
        }

        @Override // h0.b.e
        public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
            b bVar;
            boolean z10;
            if (rVar == w2.r.Ltr) {
                bVar = b.f11594a;
                z10 = false;
            } else {
                bVar = b.f11594a;
                z10 = true;
            }
            bVar.m(i10, iArr, iArr2, z10);
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    public static final class i implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f11613a = w2.h.m(0);

        i() {
        }

        @Override // h0.b.e, h0.b.m
        public float a() {
            return this.f11613a;
        }

        @Override // h0.b.m
        public void b(w2.d dVar, int i10, int[] iArr, int[] iArr2) {
            b.f11594a.n(i10, iArr, iArr2, false);
        }

        @Override // h0.b.e
        public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
            b bVar;
            boolean z10;
            if (rVar == w2.r.Ltr) {
                bVar = b.f11594a;
                z10 = false;
            } else {
                bVar = b.f11594a;
                z10 = true;
            }
            bVar.n(i10, iArr, iArr2, z10);
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    public static final class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f11614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f11615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final zd.p<Integer, w2.r, Integer> f11616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f11617d;

        /* JADX WARN: Multi-variable type inference failed */
        private j(float f10, boolean z10, zd.p<? super Integer, ? super w2.r, Integer> pVar) {
            this.f11614a = f10;
            this.f11615b = z10;
            this.f11616c = pVar;
            this.f11617d = f10;
        }

        public /* synthetic */ j(float f10, boolean z10, zd.p pVar, ae.j jVar) {
            this(f10, z10, pVar);
        }

        @Override // h0.b.e, h0.b.m
        public float a() {
            return this.f11617d;
        }

        @Override // h0.b.m
        public void b(w2.d dVar, int i10, int[] iArr, int[] iArr2) {
            c(dVar, i10, iArr, w2.r.Ltr, iArr2);
        }

        @Override // h0.b.e
        public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
            int i11;
            int iMin;
            if (iArr.length == 0) {
                return;
            }
            int iA1 = dVar.a1(this.f11614a);
            boolean z10 = this.f11615b && rVar == w2.r.Rtl;
            b bVar = b.f11594a;
            if (z10) {
                i11 = 0;
                iMin = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i12 = iArr[length];
                    int iMin2 = Math.min(i11, i10 - i12);
                    iArr2[length] = iMin2;
                    iMin = Math.min(iA1, (i10 - iMin2) - i12);
                    i11 = iArr2[length] + i12 + iMin;
                }
            } else {
                int length2 = iArr.length;
                int i13 = 0;
                i11 = 0;
                iMin = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = iArr[i13];
                    int iMin3 = Math.min(i11, i10 - i15);
                    iArr2[i14] = iMin3;
                    int iMin4 = Math.min(iA1, (i10 - iMin3) - i15);
                    int i16 = iArr2[i14] + i15 + iMin4;
                    i13++;
                    i14++;
                    iMin = iMin4;
                    i11 = i16;
                }
            }
            int i17 = i11 - iMin;
            zd.p<Integer, w2.r, Integer> pVar = this.f11616c;
            if (pVar == null || i17 >= i10) {
                return;
            }
            int iIntValue = pVar.invoke(Integer.valueOf(i10 - i17), rVar).intValue();
            int length3 = iArr2.length;
            for (int i18 = 0; i18 < length3; i18++) {
                iArr2[i18] = iArr2[i18] + iIntValue;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return w2.h.o(this.f11614a, jVar.f11614a) && this.f11615b == jVar.f11615b && ae.r.b(this.f11616c, jVar.f11616c);
        }

        public int hashCode() {
            int iP = ((w2.h.p(this.f11614a) * 31) + Boolean.hashCode(this.f11615b)) * 31;
            zd.p<Integer, w2.r, Integer> pVar = this.f11616c;
            return iP + (pVar == null ? 0 : pVar.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f11615b ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) w2.h.q(this.f11614a));
            sb2.append(", ");
            sb2.append(this.f11616c);
            sb2.append(')');
            return sb2.toString();
        }
    }

    public static final class k implements e {
        k() {
        }

        @Override // h0.b.e
        public void c(w2.d dVar, int i10, int[] iArr, w2.r rVar, int[] iArr2) {
            if (rVar == w2.r.Ltr) {
                b.f11594a.j(iArr, iArr2, false);
            } else {
                b.f11594a.k(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    public static final class l implements m {
        l() {
        }

        @Override // h0.b.m
        public void b(w2.d dVar, int i10, int[] iArr, int[] iArr2) {
            b.f11594a.j(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    public interface m {
        default float a() {
            return w2.h.m(0);
        }

        void b(w2.d dVar, int i10, int[] iArr, int[] iArr2);
    }

    static final class n extends ae.s implements zd.p<Integer, w2.r, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f11618a = new n();

        n() {
            super(2);
        }

        public final Integer a(int i10, w2.r rVar) {
            return Integer.valueOf(f1.b.f11020a.k().a(0, i10, rVar));
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, w2.r rVar) {
            return a(num.intValue(), rVar);
        }
    }

    static final class o extends ae.s implements zd.p<Integer, w2.r, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.InterfaceC0266b f11619a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(b.InterfaceC0266b interfaceC0266b) {
            super(2);
            this.f11619a = interfaceC0266b;
        }

        public final Integer a(int i10, w2.r rVar) {
            return Integer.valueOf(this.f11619a.a(0, i10, rVar));
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, w2.r rVar) {
            return a(num.intValue(), rVar);
        }
    }

    static final class p extends ae.s implements zd.p<Integer, w2.r, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.c f11620a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(b.c cVar) {
            super(2);
            this.f11620a = cVar;
        }

        public final Integer a(int i10, w2.r rVar) {
            return Integer.valueOf(this.f11620a.a(0, i10));
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, w2.r rVar) {
            return a(num.intValue(), rVar);
        }
    }

    private b() {
    }

    public final m a() {
        return f11598e;
    }

    public final f b() {
        return f11599f;
    }

    public final e c() {
        return f11596c;
    }

    public final f d() {
        return f11602i;
    }

    public final f e() {
        return f11601h;
    }

    public final f f() {
        return f11600g;
    }

    public final e g() {
        return f11595b;
    }

    public final m h() {
        return f11597d;
    }

    public final void i(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = ce.c.d(f10);
                f10 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = ce.c.d(f10);
            f10 += i16;
        }
    }

    public final void j(int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = i10;
            i10 += i14;
        }
    }

    public final void k(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i14;
            i14 += i17;
        }
    }

    public final void l(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (iArr.length == 0) ^ true ? (i10 - i12) / iArr.length : 0.0f;
        float f10 = length / 2;
        if (z10) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = ce.c.d(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = ce.c.d(f10);
            f10 += i16 + length;
            i11++;
            i15++;
        }
    }

    public final void m(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        if (iArr.length == 0) {
            return;
        }
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float fMax = (i10 - i12) / Math.max(nd.p.O(iArr), 1);
        float f10 = 0.0f;
        if (z10 && iArr.length == 1) {
            f10 = fMax;
        }
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = ce.c.d(f10);
                f10 += i14 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i15 = 0;
        while (i11 < length2) {
            int i16 = iArr[i11];
            iArr2[i15] = ce.c.d(f10);
            f10 += i16 + fMax;
            i11++;
            i15++;
        }
    }

    public final void n(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (z10) {
            float f10 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = ce.c.d(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f11 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = ce.c.d(f11);
            f11 += i16 + length;
            i11++;
            i15++;
        }
    }

    public final f o(float f10) {
        return new j(f10, true, n.f11618a, null);
    }

    public final e p(float f10, b.InterfaceC0266b interfaceC0266b) {
        return new j(f10, true, new o(interfaceC0266b), null);
    }

    public final m q(float f10, b.c cVar) {
        return new j(f10, false, new p(cVar), null);
    }
}
