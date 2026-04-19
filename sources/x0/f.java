package x0;

import ae.r;
import ae.s;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import nd.o;
import w0.e;

/* JADX INFO: loaded from: classes.dex */
public final class f<E> extends nd.f<E> implements e.a<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w0.e<? extends E> f22916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f22917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f22918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a1.e f22920e = new a1.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object[] f22921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object[] f22922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22923h;

    static final class a extends s implements zd.l<E, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection<E> f22924a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f22924a = collection;
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E e10) {
            return Boolean.valueOf(this.f22924a.contains(e10));
        }
    }

    public f(w0.e<? extends E> eVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f22916a = eVar;
        this.f22917b = objArr;
        this.f22918c = objArr2;
        this.f22919d = i10;
        this.f22921f = this.f22917b;
        this.f22922g = this.f22918c;
        this.f22923h = this.f22916a.size();
    }

    private final Object[] A() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f22920e;
        return objArr;
    }

    private final Object[] B(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f22920e;
        return objArr;
    }

    private final Object[] C(Object[] objArr, int i10, int i11) {
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("shift should be positive".toString());
        }
        if (i11 == 0) {
            return objArr;
        }
        int iA = l.a(i10, i11);
        Object obj = objArr[iA];
        r.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objC = C((Object[]) obj, i10, i11 - 5);
        if (iA < 31) {
            int i12 = iA + 1;
            if (objArr[i12] != null) {
                if (w(objArr)) {
                    o.q(objArr, null, i12, 32);
                }
                objArr = o.h(objArr, A(), 0, 0, i12);
            }
        }
        if (objC == objArr[iA]) {
            return objArr;
        }
        Object[] objArrY = y(objArr);
        objArrY[iA] = objC;
        return objArrY;
    }

    private final Object[] D(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArrD;
        int iA = l.a(i11 - 1, i10);
        if (i10 == 5) {
            dVar.b(objArr[iA]);
            objArrD = null;
        } else {
            Object obj = objArr[iA];
            r.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrD = D((Object[]) obj, i10 - 5, i11, dVar);
        }
        if (objArrD == null && iA == 0) {
            return null;
        }
        Object[] objArrY = y(objArr);
        objArrY[iA] = objArrD;
        return objArrY;
    }

    private final void E(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f22921f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f22922g = objArr;
            this.f22923h = i10;
            this.f22919d = i11;
            return;
        }
        d dVar = new d(null);
        r.c(objArr);
        Object[] objArrD = D(objArr, i11, i10, dVar);
        r.c(objArrD);
        Object objA = dVar.a();
        r.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f22922g = (Object[]) objA;
        this.f22923h = i10;
        if (objArrD[1] == null) {
            this.f22921f = (Object[]) objArrD[0];
            i11 -= 5;
        } else {
            this.f22921f = objArrD;
        }
        this.f22919d = i11;
    }

    private final Object[] F(Object[] objArr, int i10, int i11, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            throw new IllegalArgumentException("invalid buffersIterator".toString());
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("negative shift".toString());
        }
        if (i11 == 0) {
            return it.next();
        }
        Object[] objArrY = y(objArr);
        int iA = l.a(i10, i11);
        int i12 = i11 - 5;
        objArrY[iA] = F((Object[]) objArrY[iA], i10, i12, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrY[iA] = F((Object[]) objArrY[iA], 0, i12, it);
        }
        return objArrY;
    }

    private final Object[] G(Object[] objArr, int i10, Object[][] objArr2) {
        Iterator<Object[]> itA = ae.c.a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f22919d;
        Object[] objArrF = i11 < (1 << i12) ? F(objArr, i10, i12, itA) : y(objArr);
        while (itA.hasNext()) {
            this.f22919d += 5;
            objArrF = B(objArrF);
            int i13 = this.f22919d;
            F(objArrF, 1 << i13, i13, itA);
        }
        return objArrF;
    }

    private final void H(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f22919d;
        if (size > (1 << i10)) {
            this.f22921f = I(B(objArr), objArr2, this.f22919d + 5);
            this.f22922g = objArr3;
            this.f22919d += 5;
        } else {
            if (objArr == null) {
                this.f22921f = objArr2;
            } else {
                this.f22921f = I(objArr, objArr2, i10);
            }
            this.f22922g = objArr3;
        }
        this.f22923h = size() + 1;
    }

    private final Object[] I(Object[] objArr, Object[] objArr2, int i10) {
        int iA = l.a(size() - 1, i10);
        Object[] objArrY = y(objArr);
        if (i10 == 5) {
            objArrY[iA] = objArr2;
        } else {
            objArrY[iA] = I((Object[]) objArrY[iA], objArr2, i10 - 5);
        }
        return objArrY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int J(zd.l<? super E, Boolean> lVar, Object[] objArr, int i10, int i11, d dVar, List<Object[]> list, List<Object[]> list2) {
        if (w(objArr)) {
            list.add(objArr);
        }
        Object objA = dVar.a();
        r.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objA;
        Object[] objArrRemove = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (!lVar.invoke(obj).booleanValue()) {
                if (i11 == 32) {
                    objArrRemove = list.isEmpty() ^ true ? list.remove(list.size() - 1) : A();
                    i11 = 0;
                }
                objArrRemove[i11] = obj;
                i11++;
            }
        }
        dVar.b(objArrRemove);
        if (objArr2 != dVar.a()) {
            list2.add(objArr2);
        }
        return i11;
    }

    private final int K(zd.l<? super E, Boolean> lVar, Object[] objArr, int i10, d dVar) {
        Object[] objArrY = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArrY = y(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrY[i11] = obj;
                i11++;
            }
        }
        dVar.b(objArrY);
        return i11;
    }

    private final boolean L(zd.l<? super E, Boolean> lVar) {
        Object[] objArrF;
        int iV = V();
        d dVar = new d(null);
        if (this.f22921f == null) {
            return M(lVar, iV, dVar) != iV;
        }
        ListIterator<Object[]> listIteratorX = x(0);
        int iK = 32;
        while (iK == 32 && listIteratorX.hasNext()) {
            iK = K(lVar, listIteratorX.next(), 32, dVar);
        }
        if (iK == 32) {
            a1.a.a(!listIteratorX.hasNext());
            int iM = M(lVar, iV, dVar);
            if (iM == 0) {
                E(this.f22921f, size(), this.f22919d);
            }
            return iM != iV;
        }
        int iPreviousIndex = listIteratorX.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iJ = iK;
        while (listIteratorX.hasNext()) {
            iJ = J(lVar, listIteratorX.next(), 32, iJ, dVar, arrayList2, arrayList);
            iPreviousIndex = iPreviousIndex;
        }
        int i10 = iPreviousIndex;
        int iJ2 = J(lVar, this.f22922g, iV, iJ, dVar, arrayList2, arrayList);
        Object objA = dVar.a();
        r.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        o.q(objArr, null, iJ2, 32);
        if (arrayList.isEmpty()) {
            objArrF = this.f22921f;
            r.c(objArrF);
        } else {
            objArrF = F(this.f22921f, i10, this.f22919d, arrayList.iterator());
        }
        int size = i10 + (arrayList.size() << 5);
        this.f22921f = Q(objArrF, size);
        this.f22922g = objArr;
        this.f22923h = size + iJ2;
        return true;
    }

    private final int M(zd.l<? super E, Boolean> lVar, int i10, d dVar) {
        int iK = K(lVar, this.f22922g, i10, dVar);
        if (iK == i10) {
            a1.a.a(dVar.a() == this.f22922g);
            return i10;
        }
        Object objA = dVar.a();
        r.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objA;
        o.q(objArr, null, iK, i10);
        this.f22922g = objArr;
        this.f22923h = size() - (i10 - iK);
        return iK;
    }

    private final Object[] O(Object[] objArr, int i10, int i11, d dVar) {
        int iA = l.a(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iA];
            Object[] objArrH = o.h(objArr, y(objArr), iA, iA + 1, 32);
            objArrH[31] = dVar.a();
            dVar.b(obj);
            return objArrH;
        }
        int iA2 = objArr[31] == null ? l.a(R() - 1, i10) : 31;
        Object[] objArrY = y(objArr);
        int i12 = i10 - 5;
        int i13 = iA + 1;
        if (i13 <= iA2) {
            while (true) {
                Object obj2 = objArrY[iA2];
                r.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrY[iA2] = O((Object[]) obj2, i12, 0, dVar);
                if (iA2 == i13) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrY[iA];
        r.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrY[iA] = O((Object[]) obj3, i12, i11, dVar);
        return objArrY;
    }

    private final Object P(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        a1.a.a(i12 < size);
        if (size == 1) {
            Object obj = this.f22922g[0];
            E(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f22922g;
        Object obj2 = objArr2[i12];
        Object[] objArrH = o.h(objArr2, y(objArr2), i12, i12 + 1, size);
        objArrH[size - 1] = null;
        this.f22921f = objArr;
        this.f22922g = objArrH;
        this.f22923h = (i10 + size) - 1;
        this.f22919d = i11;
        return obj2;
    }

    private final Object[] Q(Object[] objArr, int i10) {
        if (!((i10 & 31) == 0)) {
            throw new IllegalArgumentException("invalid size".toString());
        }
        if (i10 == 0) {
            this.f22919d = 0;
            return null;
        }
        int i11 = i10 - 1;
        while (true) {
            int i12 = this.f22919d;
            if ((i11 >> i12) != 0) {
                return C(objArr, i11, i12);
            }
            this.f22919d = i12 - 5;
            Object[] objArr2 = objArr[0];
            r.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int R() {
        if (size() <= 32) {
            return 0;
        }
        return l.d(size());
    }

    private final Object[] S(Object[] objArr, int i10, int i11, E e10, d dVar) {
        int iA = l.a(i11, i10);
        Object[] objArrY = y(objArr);
        if (i10 != 0) {
            Object obj = objArrY[iA];
            r.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrY[iA] = S((Object[]) obj, i10 - 5, i11, e10, dVar);
            return objArrY;
        }
        if (objArrY != objArr) {
            ((AbstractList) this).modCount++;
        }
        dVar.b(objArrY[iA]);
        objArrY[iA] = e10;
        return objArrY;
    }

    private final Object[] T(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f22921f == null) {
            throw new IllegalStateException("root is null".toString());
        }
        ListIterator<Object[]> listIteratorX = x(R() >> 5);
        while (listIteratorX.previousIndex() != i10) {
            Object[] objArrPrevious = listIteratorX.previous();
            o.h(objArrPrevious, objArr2, 0, 32 - i11, 32);
            objArr2 = z(objArrPrevious, i11);
            i12--;
            objArr[i12] = objArr2;
        }
        return listIteratorX.previous();
    }

    private final void U(Collection<? extends E> collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrA;
        if (!(i12 >= 1)) {
            throw new IllegalArgumentException("requires at least one nullBuffer".toString());
        }
        Object[] objArrY = y(objArr);
        objArr2[0] = objArrY;
        int i13 = i10 & 31;
        int size = ((i10 + collection.size()) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            o.h(objArrY, objArr3, size + 1, i13, i11);
        } else {
            int i15 = (i14 - 32) + 1;
            if (i12 == 1) {
                objArrA = objArrY;
            } else {
                objArrA = A();
                i12--;
                objArr2[i12] = objArrA;
            }
            int i16 = i11 - i15;
            o.h(objArrY, objArr3, 0, i16, i11);
            o.h(objArrY, objArrA, size + 1, i13, i16);
            objArr3 = objArrA;
        }
        Iterator<? extends E> it = collection.iterator();
        l(objArrY, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            objArr2[i17] = l(A(), 0, it);
        }
        l(objArr3, 0, it);
    }

    private final int V() {
        return W(size());
    }

    private final int W(int i10) {
        return i10 <= 32 ? i10 : i10 - l.d(i10);
    }

    private final Object[] f(int i10) {
        if (R() <= i10) {
            return this.f22922g;
        }
        Object[] objArr = this.f22921f;
        r.c(objArr);
        for (int i11 = this.f22919d; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            r.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] l(Object[] objArr, int i10, Iterator<? extends Object> it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    private final void t(Collection<? extends E> collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f22921f == null) {
            throw new IllegalStateException("root is null".toString());
        }
        int i13 = i10 >> 5;
        Object[] objArrT = T(i13, i11, objArr, i12, objArr2);
        int iR = i12 - (((R() >> 5) - 1) - i13);
        if (iR < i12) {
            objArr2 = objArr[iR];
            r.c(objArr2);
        }
        U(collection, i10, objArrT, 32, objArr, iR, objArr2);
    }

    private final Object[] u(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        Object obj2;
        int iA = l.a(i11, i10);
        if (i10 == 0) {
            dVar.b(objArr[31]);
            Object[] objArrH = o.h(objArr, y(objArr), iA + 1, iA, 31);
            objArrH[iA] = obj;
            return objArrH;
        }
        Object[] objArrY = y(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrY[iA];
        r.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrY[iA] = u((Object[]) obj3, i12, i11, obj, dVar);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrY[iA]) == null) {
                break;
            }
            r.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrY[iA] = u((Object[]) obj2, i12, 0, dVar.a(), dVar);
        }
        return objArrY;
    }

    private final void v(Object[] objArr, int i10, E e10) {
        int iV = V();
        Object[] objArrY = y(this.f22922g);
        if (iV < 32) {
            o.h(this.f22922g, objArrY, i10 + 1, i10, iV);
            objArrY[i10] = e10;
            this.f22921f = objArr;
            this.f22922g = objArrY;
            this.f22923h = size() + 1;
            return;
        }
        Object[] objArr2 = this.f22922g;
        Object obj = objArr2[31];
        o.h(objArr2, objArrY, i10 + 1, i10, 31);
        objArrY[i10] = e10;
        H(objArr, objArrY, B(obj));
    }

    private final boolean w(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f22920e;
    }

    private final ListIterator<Object[]> x(int i10) {
        Object[] objArr = this.f22921f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root".toString());
        }
        int iR = R() >> 5;
        a1.d.b(i10, iR);
        int i11 = this.f22919d;
        return i11 == 0 ? new i(objArr, i10) : new k(objArr, i10, iR, i11 / 5);
    }

    private final Object[] y(Object[] objArr) {
        return objArr == null ? A() : w(objArr) ? objArr : o.l(objArr, A(), 0, 0, ge.o.h(objArr.length, 32), 6, null);
    }

    private final Object[] z(Object[] objArr, int i10) {
        return w(objArr) ? o.h(objArr, objArr, i10, 0, 32 - i10) : o.h(objArr, A(), i10, 0, 32 - i10);
    }

    public final boolean N(zd.l<? super E, Boolean> lVar) {
        boolean zL = L(lVar);
        if (zL) {
            ((AbstractList) this).modCount++;
        }
        return zL;
    }

    @Override // nd.f
    public int a() {
        return this.f22923h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        a1.d.b(i10, size());
        if (i10 == size()) {
            add(e10);
            return;
        }
        ((AbstractList) this).modCount++;
        int iR = R();
        if (i10 >= iR) {
            v(this.f22921f, i10 - iR, e10);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.f22921f;
        r.c(objArr);
        v(u(objArr, this.f22919d, i10, e10, dVar), 0, dVar.a());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        ((AbstractList) this).modCount++;
        int iV = V();
        if (iV < 32) {
            Object[] objArrY = y(this.f22922g);
            objArrY[iV] = e10;
            this.f22922g = objArrY;
            this.f22923h = size() + 1;
        } else {
            H(this.f22921f, this.f22922g, B(e10));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        Object[] objArrH;
        a1.d.b(i10, size());
        if (i10 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = (((size() - i11) + collection.size()) - 1) / 32;
        if (size == 0) {
            a1.a.a(i10 >= R());
            int i12 = i10 & 31;
            int size2 = ((i10 + collection.size()) - 1) & 31;
            Object[] objArr = this.f22922g;
            Object[] objArrH2 = o.h(objArr, y(objArr), size2 + 1, i12, V());
            l(objArrH2, i12, collection.iterator());
            this.f22922g = objArrH2;
        } else {
            Object[][] objArr2 = new Object[size][];
            int iV = V();
            int iW = W(size() + collection.size());
            if (i10 >= R()) {
                objArrH = A();
                U(collection, i10, this.f22922g, iV, objArr2, size, objArrH);
            } else if (iW > iV) {
                int i13 = iW - iV;
                objArrH = z(this.f22922g, i13);
                t(collection, i10, i13, objArr2, size, objArrH);
            } else {
                int i14 = iV - iW;
                objArrH = o.h(this.f22922g, A(), 0, i14, iV);
                int i15 = 32 - i14;
                Object[] objArrZ = z(this.f22922g, i15);
                int i16 = size - 1;
                objArr2[i16] = objArrZ;
                t(collection, i10, i15, objArr2, i16, objArrZ);
            }
            this.f22921f = G(this.f22921f, i11, objArr2);
            this.f22922g = objArrH;
        }
        this.f22923h = size() + collection.size();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iV = V();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iV >= collection.size()) {
            this.f22922g = l(y(this.f22922g), iV, it);
        } else {
            int size = ((collection.size() + iV) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = l(y(this.f22922g), iV, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = l(A(), 0, it);
            }
            this.f22921f = G(this.f22921f, R(), objArr);
            this.f22922g = l(A(), 0, it);
        }
        this.f22923h = size() + collection.size();
        return true;
    }

    @Override // w0.e.a
    public w0.e<E> build() {
        e eVar;
        if (this.f22921f == this.f22917b && this.f22922g == this.f22918c) {
            eVar = this.f22916a;
        } else {
            this.f22920e = new a1.e();
            Object[] objArr = this.f22921f;
            this.f22917b = objArr;
            Object[] objArr2 = this.f22922g;
            this.f22918c = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    eVar = l.b();
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(this.f22922g, size());
                    r.e(objArrCopyOf, "copyOf(this, newSize)");
                    eVar = new j(objArrCopyOf);
                }
            } else {
                Object[] objArr3 = this.f22921f;
                r.c(objArr3);
                eVar = new e(objArr3, this.f22922g, size(), this.f22919d);
            }
        }
        this.f22916a = eVar;
        return (w0.e<E>) eVar;
    }

    @Override // nd.f
    public E d(int i10) {
        a1.d.a(i10, size());
        ((AbstractList) this).modCount++;
        int iR = R();
        if (i10 >= iR) {
            return (E) P(this.f22921f, iR, this.f22919d, i10 - iR);
        }
        d dVar = new d(this.f22922g[0]);
        Object[] objArr = this.f22921f;
        r.c(objArr);
        P(O(objArr, this.f22919d, i10, dVar), iR, this.f22919d, 0);
        return (E) dVar.a();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        a1.d.a(i10, size());
        return (E) f(i10)[i10 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        a1.d.b(i10, size());
        return new h(this, i10);
    }

    public final int n() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] o() {
        return this.f22921f;
    }

    public final int r() {
        return this.f22919d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        return N(new a(collection));
    }

    public final Object[] s() {
        return this.f22922g;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        a1.d.a(i10, size());
        if (R() > i10) {
            d dVar = new d(null);
            Object[] objArr = this.f22921f;
            r.c(objArr);
            this.f22921f = S(objArr, this.f22919d, i10, e10, dVar);
            return (E) dVar.a();
        }
        Object[] objArrY = y(this.f22922g);
        if (objArrY != this.f22922g) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        E e11 = (E) objArrY[i11];
        objArrY[i11] = e10;
        this.f22922g = objArrY;
        return e11;
    }
}
