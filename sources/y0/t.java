package y0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23181e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f23182f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final t f23183g = new t(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a1.e f23186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f23187d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public final t a() {
            return t.f23183g;
        }
    }

    public static final class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private t<K, V> f23188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23189b;

        public b(t<K, V> tVar, int i10) {
            this.f23188a = tVar;
            this.f23189b = i10;
        }

        public final t<K, V> a() {
            return this.f23188a;
        }

        public final int b() {
            return this.f23189b;
        }

        public final void c(t<K, V> tVar) {
            this.f23188a = tVar;
        }
    }

    public t(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, null);
    }

    public t(int i10, int i11, Object[] objArr, a1.e eVar) {
        this.f23184a = i10;
        this.f23185b = i11;
        this.f23186c = eVar;
        this.f23187d = objArr;
    }

    private final t<K, V> A(int i10, f<K, V> fVar) {
        fVar.o(fVar.size() - 1);
        fVar.m(W(i10));
        if (this.f23187d.length == 2) {
            return null;
        }
        if (this.f23186c != fVar.j()) {
            return new t<>(0, 0, x.h(this.f23187d, i10), fVar.j());
        }
        this.f23187d = x.h(this.f23187d, i10);
        return this;
    }

    private final t<K, V> B(int i10, K k10, V v10, a1.e eVar) {
        int iN = n(i10);
        if (this.f23186c != eVar) {
            return new t<>(i10 | this.f23184a, this.f23185b, x.g(this.f23187d, iN, k10, v10), eVar);
        }
        this.f23187d = x.g(this.f23187d, iN, k10, v10);
        this.f23184a = i10 | this.f23184a;
        return this;
    }

    private final t<K, V> C(int i10, int i11, int i12, K k10, V v10, int i13, a1.e eVar) {
        a1.e eVar2 = this.f23186c;
        Object[] objArrD = d(i10, i11, i12, k10, v10, i13, eVar);
        if (eVar2 != eVar) {
            return new t<>(this.f23184a ^ i11, i11 | this.f23185b, objArrD, eVar);
        }
        this.f23187d = objArrD;
        this.f23184a ^= i11;
        this.f23185b |= i11;
        return this;
    }

    private final t<K, V> F(t<K, V> tVar, int i10, int i11, a1.b bVar, f<K, V> fVar) {
        if (r(i10)) {
            t<K, V> tVarN = N(O(i10));
            if (tVar.r(i10)) {
                return tVarN.E(tVar.N(tVar.O(i10)), i11 + 5, bVar, fVar);
            }
            if (!tVar.q(i10)) {
                return tVarN;
            }
            int iN = tVar.n(i10);
            K kT = tVar.t(iN);
            V vW = tVar.W(iN);
            int size = fVar.size();
            t<K, V> tVarD = tVarN.D(kT != null ? kT.hashCode() : 0, kT, vW, i11 + 5, fVar);
            if (fVar.size() != size) {
                return tVarD;
            }
            bVar.c(bVar.a() + 1);
            return tVarD;
        }
        if (!tVar.r(i10)) {
            int iN2 = n(i10);
            K kT2 = t(iN2);
            V vW2 = W(iN2);
            int iN3 = tVar.n(i10);
            K kT3 = tVar.t(iN3);
            return u(kT2 != null ? kT2.hashCode() : 0, kT2, vW2, kT3 != null ? kT3.hashCode() : 0, kT3, tVar.W(iN3), i11 + 5, fVar.j());
        }
        t<K, V> tVarN2 = tVar.N(tVar.O(i10));
        if (q(i10)) {
            int iN4 = n(i10);
            K kT4 = t(iN4);
            int i12 = i11 + 5;
            if (!tVarN2.k(kT4 != null ? kT4.hashCode() : 0, kT4, i12)) {
                return tVarN2.D(kT4 != null ? kT4.hashCode() : 0, kT4, W(iN4), i12, fVar);
            }
            bVar.c(bVar.a() + 1);
        }
        return tVarN2;
    }

    private final t<K, V> I(int i10, int i11, f<K, V> fVar) {
        fVar.o(fVar.size() - 1);
        fVar.m(W(i10));
        if (this.f23187d.length == 2) {
            return null;
        }
        if (this.f23186c != fVar.j()) {
            return new t<>(i11 ^ this.f23184a, this.f23185b, x.h(this.f23187d, i10), fVar.j());
        }
        this.f23187d = x.h(this.f23187d, i10);
        this.f23184a ^= i11;
        return this;
    }

    private final t<K, V> J(int i10, int i11, a1.e eVar) {
        Object[] objArr = this.f23187d;
        if (objArr.length == 1) {
            return null;
        }
        a1.e eVar2 = this.f23186c;
        Object[] objArrI = x.i(objArr, i10);
        if (eVar2 != eVar) {
            return new t<>(this.f23184a, i11 ^ this.f23185b, objArrI, eVar);
        }
        this.f23187d = objArrI;
        this.f23185b ^= i11;
        return this;
    }

    private final t<K, V> K(t<K, V> tVar, t<K, V> tVar2, int i10, int i11, a1.e eVar) {
        return tVar2 == null ? J(i10, i11, eVar) : (this.f23186c == eVar || tVar != tVar2) ? L(i10, tVar2, eVar) : this;
    }

    private final t<K, V> L(int i10, t<K, V> tVar, a1.e eVar) {
        Object[] objArr = this.f23187d;
        if (objArr.length == 1 && tVar.f23187d.length == 2 && tVar.f23185b == 0) {
            tVar.f23184a = this.f23185b;
            return tVar;
        }
        if (this.f23186c == eVar) {
            objArr[i10] = tVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ae.r.e(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = tVar;
        return new t<>(this.f23184a, this.f23185b, objArrCopyOf, eVar);
    }

    private final t<K, V> M(int i10, V v10, f<K, V> fVar) {
        if (this.f23186c == fVar.j()) {
            this.f23187d[i10 + 1] = v10;
            return this;
        }
        fVar.l(fVar.g() + 1);
        Object[] objArr = this.f23187d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ae.r.e(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10 + 1] = v10;
        return new t<>(this.f23184a, this.f23185b, objArrCopyOf, fVar.j());
    }

    private final t<K, V> R(int i10, int i11) {
        Object[] objArr = this.f23187d;
        if (objArr.length == 2) {
            return null;
        }
        return new t<>(i11 ^ this.f23184a, this.f23185b, x.h(objArr, i10));
    }

    private final t<K, V> S(int i10, int i11) {
        Object[] objArr = this.f23187d;
        if (objArr.length == 1) {
            return null;
        }
        return new t<>(this.f23184a, i11 ^ this.f23185b, x.i(objArr, i10));
    }

    private final t<K, V> T(t<K, V> tVar, t<K, V> tVar2, int i10, int i11) {
        return tVar2 == null ? S(i10, i11) : tVar != tVar2 ? U(i10, i11, tVar2) : this;
    }

    private final t<K, V> U(int i10, int i11, t<K, V> tVar) {
        Object[] objArr = tVar.f23187d;
        if (objArr.length != 2 || tVar.f23185b != 0) {
            Object[] objArr2 = this.f23187d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i10] = tVar;
            return new t<>(this.f23184a, this.f23185b, objArrCopyOf);
        }
        if (this.f23187d.length == 1) {
            tVar.f23184a = this.f23185b;
            return tVar;
        }
        return new t<>(this.f23184a ^ i11, i11 ^ this.f23185b, x.k(this.f23187d, i10, n(i11), objArr[0], objArr[1]));
    }

    private final t<K, V> V(int i10, V v10) {
        Object[] objArr = this.f23187d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ae.r.e(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10 + 1] = v10;
        return new t<>(this.f23184a, this.f23185b, objArrCopyOf);
    }

    private final V W(int i10) {
        return (V) this.f23187d[i10 + 1];
    }

    private final b<K, V> b() {
        return new b<>(this, 1);
    }

    private final b<K, V> c() {
        return new b<>(this, 0);
    }

    private final Object[] d(int i10, int i11, int i12, K k10, V v10, int i13, a1.e eVar) {
        K kT = t(i10);
        return x.j(this.f23187d, i10, O(i11) + 1, u(kT != null ? kT.hashCode() : 0, kT, W(i10), i12, k10, v10, i13 + 5, eVar));
    }

    private final int e() {
        if (this.f23185b == 0) {
            return this.f23187d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f23184a);
        int length = this.f23187d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += N(i10).e();
        }
        return iBitCount;
    }

    private final boolean f(K k10) {
        ge.g gVarS = ge.o.s(ge.o.t(0, this.f23187d.length), 2);
        int iL = gVarS.l();
        int iN = gVarS.n();
        int iO = gVarS.o();
        if ((iO > 0 && iL <= iN) || (iO < 0 && iN <= iL)) {
            while (!ae.r.b(k10, this.f23187d[iL])) {
                if (iL != iN) {
                    iL += iO;
                }
            }
            return true;
        }
        return false;
    }

    private final V g(K k10) {
        ge.g gVarS = ge.o.s(ge.o.t(0, this.f23187d.length), 2);
        int iL = gVarS.l();
        int iN = gVarS.n();
        int iO = gVarS.o();
        if ((iO <= 0 || iL > iN) && (iO >= 0 || iN > iL)) {
            return null;
        }
        while (!ae.r.b(k10, t(iL))) {
            if (iL == iN) {
                return null;
            }
            iL += iO;
        }
        return W(iL);
    }

    private final b<K, V> h(K k10, V v10) {
        ge.g gVarS = ge.o.s(ge.o.t(0, this.f23187d.length), 2);
        int iL = gVarS.l();
        int iN = gVarS.n();
        int iO = gVarS.o();
        if ((iO > 0 && iL <= iN) || (iO < 0 && iN <= iL)) {
            while (!ae.r.b(k10, t(iL))) {
                if (iL != iN) {
                    iL += iO;
                }
            }
            if (v10 == W(iL)) {
                return null;
            }
            Object[] objArr = this.f23187d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            ae.r.e(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iL + 1] = v10;
            return new t(0, 0, objArrCopyOf).c();
        }
        return new t(0, 0, x.g(this.f23187d, 0, k10, v10)).b();
    }

    private final t<K, V> i(K k10) {
        ge.g gVarS = ge.o.s(ge.o.t(0, this.f23187d.length), 2);
        int iL = gVarS.l();
        int iN = gVarS.n();
        int iO = gVarS.o();
        if ((iO > 0 && iL <= iN) || (iO < 0 && iN <= iL)) {
            while (!ae.r.b(k10, t(iL))) {
                if (iL != iN) {
                    iL += iO;
                }
            }
            return j(iL);
        }
        return this;
    }

    private final t<K, V> j(int i10) {
        Object[] objArr = this.f23187d;
        if (objArr.length == 2) {
            return null;
        }
        return new t<>(0, 0, x.h(objArr, i10));
    }

    private final boolean l(t<K, V> tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f23185b != tVar.f23185b || this.f23184a != tVar.f23184a) {
            return false;
        }
        int length = this.f23187d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f23187d[i10] != tVar.f23187d[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(int i10) {
        return (i10 & this.f23185b) != 0;
    }

    private final t<K, V> s(int i10, K k10, V v10) {
        return new t<>(i10 | this.f23184a, this.f23185b, x.g(this.f23187d, n(i10), k10, v10));
    }

    private final K t(int i10) {
        return (K) this.f23187d[i10];
    }

    private final t<K, V> u(int i10, K k10, V v10, int i11, K k11, V v11, int i12, a1.e eVar) {
        if (i12 > 30) {
            return new t<>(0, 0, new Object[]{k10, v10, k11, v11}, eVar);
        }
        int iF = x.f(i10, i12);
        int iF2 = x.f(i11, i12);
        if (iF == iF2) {
            return new t<>(0, 1 << iF, new Object[]{u(i10, k10, v10, i11, k11, v11, i12 + 5, eVar)}, eVar);
        }
        Object[] objArr = new Object[4];
        if (iF < iF2) {
            objArr[0] = k10;
            objArr[1] = v10;
            objArr[2] = k11;
            objArr[3] = v11;
        } else {
            objArr[0] = k11;
            objArr[1] = v11;
            objArr[2] = k10;
            objArr[3] = v10;
        }
        return new t<>((1 << iF) | (1 << iF2), 0, objArr, eVar);
    }

    private final t<K, V> v(int i10, int i11, int i12, K k10, V v10, int i13) {
        return new t<>(this.f23184a ^ i11, i11 | this.f23185b, d(i10, i11, i12, k10, v10, i13, null));
    }

    private final t<K, V> w(K k10, V v10, f<K, V> fVar) {
        ge.g gVarS = ge.o.s(ge.o.t(0, this.f23187d.length), 2);
        int iL = gVarS.l();
        int iN = gVarS.n();
        int iO = gVarS.o();
        if ((iO > 0 && iL <= iN) || (iO < 0 && iN <= iL)) {
            while (!ae.r.b(k10, t(iL))) {
                if (iL != iN) {
                    iL += iO;
                }
            }
            fVar.m(W(iL));
            if (this.f23186c == fVar.j()) {
                this.f23187d[iL + 1] = v10;
                return this;
            }
            fVar.l(fVar.g() + 1);
            Object[] objArr = this.f23187d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            ae.r.e(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iL + 1] = v10;
            return new t<>(0, 0, objArrCopyOf, fVar.j());
        }
        fVar.o(fVar.size() + 1);
        return new t<>(0, 0, x.g(this.f23187d, 0, k10, v10), fVar.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final t<K, V> x(t<K, V> tVar, a1.b bVar, a1.e eVar) {
        a1.a.a(this.f23185b == 0);
        a1.a.a(this.f23184a == 0);
        a1.a.a(tVar.f23185b == 0);
        a1.a.a(tVar.f23184a == 0);
        Object[] objArr = this.f23187d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + tVar.f23187d.length);
        ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
        int length = this.f23187d.length;
        ge.g gVarS = ge.o.s(ge.o.t(0, tVar.f23187d.length), 2);
        int iL = gVarS.l();
        int iN = gVarS.n();
        int iO = gVarS.o();
        if ((iO > 0 && iL <= iN) || (iO < 0 && iN <= iL)) {
            while (true) {
                if (f(tVar.f23187d[iL])) {
                    bVar.c(bVar.a() + 1);
                } else {
                    Object[] objArr2 = tVar.f23187d;
                    objArrCopyOf[length] = objArr2[iL];
                    objArrCopyOf[length + 1] = objArr2[iL + 1];
                    length += 2;
                }
                if (iL == iN) {
                    break;
                }
                iL += iO;
            }
        }
        if (length == this.f23187d.length) {
            return this;
        }
        if (length == tVar.f23187d.length) {
            return tVar;
        }
        if (length == objArrCopyOf.length) {
            return new t<>(0, 0, objArrCopyOf, eVar);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        ae.r.e(objArrCopyOf2, "copyOf(this, newSize)");
        return new t<>(0, 0, objArrCopyOf2, eVar);
    }

    private final t<K, V> y(K k10, V v10, f<K, V> fVar) {
        ge.g gVarS = ge.o.s(ge.o.t(0, this.f23187d.length), 2);
        int iL = gVarS.l();
        int iN = gVarS.n();
        int iO = gVarS.o();
        if ((iO > 0 && iL <= iN) || (iO < 0 && iN <= iL)) {
            while (true) {
                if (!ae.r.b(k10, t(iL)) || !ae.r.b(v10, W(iL))) {
                    if (iL == iN) {
                        break;
                    }
                    iL += iO;
                } else {
                    return A(iL, fVar);
                }
            }
        }
        return this;
    }

    private final t<K, V> z(K k10, f<K, V> fVar) {
        ge.g gVarS = ge.o.s(ge.o.t(0, this.f23187d.length), 2);
        int iL = gVarS.l();
        int iN = gVarS.n();
        int iO = gVarS.o();
        if ((iO > 0 && iL <= iN) || (iO < 0 && iN <= iL)) {
            while (!ae.r.b(k10, t(iL))) {
                if (iL != iN) {
                    iL += iO;
                }
            }
            return A(iL, fVar);
        }
        return this;
    }

    public final t<K, V> D(int i10, K k10, V v10, int i11, f<K, V> fVar) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (ae.r.b(k10, t(iN))) {
                fVar.m(W(iN));
                return W(iN) == v10 ? this : M(iN, v10, fVar);
            }
            fVar.o(fVar.size() + 1);
            return C(iN, iF, i10, k10, v10, i11, fVar.j());
        }
        if (!r(iF)) {
            fVar.o(fVar.size() + 1);
            return B(iF, k10, v10, fVar.j());
        }
        int iO = O(iF);
        t<K, V> tVarN = N(iO);
        t<K, V> tVarW = i11 == 30 ? tVarN.w(k10, v10, fVar) : tVarN.D(i10, k10, v10, i11 + 5, fVar);
        return tVarN == tVarW ? this : L(iO, tVarW, fVar.j());
    }

    public final t<K, V> E(t<K, V> tVar, int i10, a1.b bVar, f<K, V> fVar) {
        if (this == tVar) {
            bVar.b(e());
            return this;
        }
        if (i10 > 30) {
            return x(tVar, bVar, fVar.j());
        }
        int i11 = this.f23185b | tVar.f23185b;
        int i12 = this.f23184a;
        int i13 = tVar.f23184a;
        int i14 = (i12 ^ i13) & (~i11);
        int i15 = i12 & i13;
        int i16 = i14;
        while (i15 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i15);
            if (ae.r.b(t(n(iLowestOneBit)), tVar.t(tVar.n(iLowestOneBit)))) {
                i16 |= iLowestOneBit;
            } else {
                i11 |= iLowestOneBit;
            }
            i15 ^= iLowestOneBit;
        }
        int i17 = 0;
        if (!((i11 & i16) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        t<K, V> tVar2 = (ae.r.b(this.f23186c, fVar.j()) && this.f23184a == i16 && this.f23185b == i11) ? this : new t<>(i16, i11, new Object[(Integer.bitCount(i16) * 2) + Integer.bitCount(i11)]);
        int i18 = i11;
        int i19 = 0;
        while (i18 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i18);
            Object[] objArr = tVar2.f23187d;
            objArr[(objArr.length - 1) - i19] = F(tVar, iLowestOneBit2, i10, bVar, fVar);
            i19++;
            i18 ^= iLowestOneBit2;
        }
        while (i16 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i16);
            int i20 = i17 * 2;
            if (tVar.q(iLowestOneBit3)) {
                int iN = tVar.n(iLowestOneBit3);
                tVar2.f23187d[i20] = tVar.t(iN);
                tVar2.f23187d[i20 + 1] = tVar.W(iN);
                if (q(iLowestOneBit3)) {
                    bVar.c(bVar.a() + 1);
                }
            } else {
                int iN2 = n(iLowestOneBit3);
                tVar2.f23187d[i20] = t(iN2);
                tVar2.f23187d[i20 + 1] = W(iN2);
            }
            i17++;
            i16 ^= iLowestOneBit3;
        }
        return l(tVar2) ? this : tVar.l(tVar2) ? tVar : tVar2;
    }

    public final t<K, V> G(int i10, K k10, int i11, f<K, V> fVar) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            return ae.r.b(k10, t(iN)) ? I(iN, iF, fVar) : this;
        }
        if (!r(iF)) {
            return this;
        }
        int iO = O(iF);
        t<K, V> tVarN = N(iO);
        return K(tVarN, i11 == 30 ? tVarN.z(k10, fVar) : tVarN.G(i10, k10, i11 + 5, fVar), iO, iF, fVar.j());
    }

    public final t<K, V> H(int i10, K k10, V v10, int i11, f<K, V> fVar) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            return (ae.r.b(k10, t(iN)) && ae.r.b(v10, W(iN))) ? I(iN, iF, fVar) : this;
        }
        if (!r(iF)) {
            return this;
        }
        int iO = O(iF);
        t<K, V> tVarN = N(iO);
        return K(tVarN, i11 == 30 ? tVarN.y(k10, v10, fVar) : tVarN.H(i10, k10, v10, i11 + 5, fVar), iO, iF, fVar.j());
    }

    public final t<K, V> N(int i10) {
        Object obj = this.f23187d[i10];
        ae.r.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int O(int i10) {
        return (this.f23187d.length - 1) - Integer.bitCount((i10 - 1) & this.f23185b);
    }

    public final b<K, V> P(int i10, K k10, V v10, int i11) {
        b<K, V> bVarP;
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (!ae.r.b(k10, t(iN))) {
                return v(iN, iF, i10, k10, v10, i11).b();
            }
            if (W(iN) == v10) {
                return null;
            }
            return V(iN, v10).c();
        }
        if (!r(iF)) {
            return s(iF, k10, v10).b();
        }
        int iO = O(iF);
        t<K, V> tVarN = N(iO);
        if (i11 == 30) {
            bVarP = tVarN.h(k10, v10);
            if (bVarP == null) {
                return null;
            }
        } else {
            bVarP = tVarN.P(i10, k10, v10, i11 + 5);
            if (bVarP == null) {
                return null;
            }
        }
        bVarP.c(U(iO, iF, bVarP.a()));
        return bVarP;
    }

    public final t<K, V> Q(int i10, K k10, int i11) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            return ae.r.b(k10, t(iN)) ? R(iN, iF) : this;
        }
        if (!r(iF)) {
            return this;
        }
        int iO = O(iF);
        t<K, V> tVarN = N(iO);
        return T(tVarN, i11 == 30 ? tVarN.i(k10) : tVarN.Q(i10, k10, i11 + 5), iO, iF);
    }

    public final boolean k(int i10, K k10, int i11) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            return ae.r.b(k10, t(n(iF)));
        }
        if (!r(iF)) {
            return false;
        }
        t<K, V> tVarN = N(O(iF));
        return i11 == 30 ? tVarN.f(k10) : tVarN.k(i10, k10, i11 + 5);
    }

    public final int m() {
        return Integer.bitCount(this.f23184a);
    }

    public final int n(int i10) {
        return Integer.bitCount((i10 - 1) & this.f23184a) * 2;
    }

    public final V o(int i10, K k10, int i11) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (ae.r.b(k10, t(iN))) {
                return W(iN);
            }
            return null;
        }
        if (!r(iF)) {
            return null;
        }
        t<K, V> tVarN = N(O(iF));
        return i11 == 30 ? tVarN.g(k10) : tVarN.o(i10, k10, i11 + 5);
    }

    public final Object[] p() {
        return this.f23187d;
    }

    public final boolean q(int i10) {
        return (i10 & this.f23184a) != 0;
    }
}
