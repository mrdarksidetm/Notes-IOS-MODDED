package x0;

import ae.r;
import ge.o;
import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class e<E> extends b<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f22912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f22913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22915e;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f22912b = objArr;
        this.f22913c = objArr2;
        this.f22914d = i10;
        this.f22915e = i11;
        if (size() > 32) {
            a1.a.a(size() - l.d(size()) <= o.h(objArr2.length, 32));
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    private final Object[] d(int i10) {
        if (w() <= i10) {
            return this.f22913c;
        }
        Object[] objArr = this.f22912b;
        for (int i11 = this.f22915e; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            r.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] l(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        Object[] objArrCopyOf;
        int iA = l.a(i11, i10);
        if (i10 == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                r.e(objArrCopyOf, "copyOf(this, newSize)");
            }
            nd.o.h(objArr, objArrCopyOf, iA + 1, iA, 31);
            dVar.b(objArr[31]);
            objArrCopyOf[iA] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        r.e(objArrCopyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iA];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        r.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = l((Object[]) obj2, i12, i11, obj, dVar);
        int i13 = iA + 1;
        while (i13 < 32 && objArrCopyOf2[i13] != null) {
            Object obj3 = objArr[i13];
            r.d(obj3, str);
            Object[] objArr2 = objArrCopyOf2;
            objArr2[i13] = l((Object[]) obj3, i12, 0, dVar.a(), dVar);
            i13++;
            objArrCopyOf2 = objArr2;
            str = str;
        }
        return objArrCopyOf2;
    }

    private final e<E> n(Object[] objArr, int i10, Object obj) {
        int size = size() - w();
        Object[] objArrCopyOf = Arrays.copyOf(this.f22913c, 32);
        r.e(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            nd.o.h(this.f22913c, objArrCopyOf, i10 + 1, i10, size);
            objArrCopyOf[i10] = obj;
            return new e<>(objArr, objArrCopyOf, size() + 1, this.f22915e);
        }
        Object[] objArr2 = this.f22913c;
        Object obj2 = objArr2[31];
        nd.o.h(objArr2, objArrCopyOf, i10 + 1, i10, size - 1);
        objArrCopyOf[i10] = obj;
        return s(objArr, objArrCopyOf, l.c(obj2));
    }

    private final Object[] o(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArrO;
        int iA = l.a(i11, i10);
        if (i10 == 5) {
            dVar.b(objArr[iA]);
            objArrO = null;
        } else {
            Object obj = objArr[iA];
            r.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrO = o((Object[]) obj, i10 - 5, i11, dVar);
        }
        if (objArrO == null && iA == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        r.e(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[iA] = objArrO;
        return objArrCopyOf;
    }

    private final w0.e<E> r(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                r.e(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        d dVar = new d(null);
        Object[] objArrO = o(objArr, i11, i10 - 1, dVar);
        r.c(objArrO);
        Object objA = dVar.a();
        r.d(objA, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) objA;
        if (objArrO[1] != null) {
            return new e(objArrO, objArr2, i10, i11);
        }
        Object obj = objArrO[0];
        r.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj, objArr2, i10, i11 - 5);
    }

    private final e<E> s(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f22915e;
        if (size <= (1 << i10)) {
            return new e<>(t(objArr, i10, objArr2), objArr3, size() + 1, this.f22915e);
        }
        Object[] objArrC = l.c(objArr);
        int i11 = this.f22915e + 5;
        return new e<>(t(objArrC, i11, objArr2), objArr3, size() + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] t(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = x0.l.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            ae.r.e(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            goto L2c
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.t(r2, r5, r6)
            r4[r0] = r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.e.t(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] u(Object[] objArr, int i10, int i11, d dVar) {
        Object[] objArrCopyOf;
        int iA = l.a(i11, i10);
        if (i10 == 0) {
            if (iA == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                r.e(objArrCopyOf, "copyOf(this, newSize)");
            }
            nd.o.h(objArr, objArrCopyOf, iA, iA + 1, 32);
            objArrCopyOf[31] = dVar.a();
            dVar.b(objArr[iA]);
            return objArrCopyOf;
        }
        int iA2 = objArr[31] == null ? l.a(w() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        r.e(objArrCopyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        int i13 = iA + 1;
        if (i13 <= iA2) {
            while (true) {
                Object obj = objArrCopyOf2[iA2];
                r.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iA2] = u((Object[]) obj, i12, 0, dVar);
                if (iA2 == i13) {
                    break;
                }
                iA2--;
            }
        }
        Object obj2 = objArrCopyOf2[iA];
        r.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iA] = u((Object[]) obj2, i12, i11, dVar);
        return objArrCopyOf2;
    }

    private final w0.e<E> v(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        a1.a.a(i12 < size);
        if (size == 1) {
            return r(objArr, i10, i11);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f22913c, 32);
        r.e(objArrCopyOf, "copyOf(this, newSize)");
        int i13 = size - 1;
        if (i12 < i13) {
            nd.o.h(this.f22913c, objArrCopyOf, i12, i12 + 1, size);
        }
        objArrCopyOf[i13] = null;
        return new e(objArr, objArrCopyOf, (i10 + size) - 1, i11);
    }

    private final int w() {
        return l.d(size());
    }

    private final Object[] x(Object[] objArr, int i10, int i11, Object obj) {
        int iA = l.a(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        r.e(objArrCopyOf, "copyOf(this, newSize)");
        if (i10 == 0) {
            objArrCopyOf[iA] = obj;
        } else {
            Object obj2 = objArrCopyOf[iA];
            r.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[iA] = x((Object[]) obj2, i10 - 5, i11, obj);
        }
        return objArrCopyOf;
    }

    @Override // nd.a
    public int a() {
        return this.f22914d;
    }

    @Override // java.util.List, w0.e
    public w0.e<E> add(int i10, E e10) {
        a1.d.b(i10, size());
        if (i10 == size()) {
            return add((Object) e10);
        }
        int iW = w();
        if (i10 >= iW) {
            return n(this.f22912b, i10 - iW, e10);
        }
        d dVar = new d(null);
        return n(l(this.f22912b, this.f22915e, i10, e10, dVar), 0, dVar.a());
    }

    @Override // java.util.Collection, java.util.List, w0.e
    public w0.e<E> add(E e10) {
        int size = size() - w();
        if (size >= 32) {
            return s(this.f22912b, this.f22913c, l.c(e10));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f22913c, 32);
        r.e(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size] = e10;
        return new e(this.f22912b, objArrCopyOf, size() + 1, this.f22915e);
    }

    @Override // w0.e
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public f<E> builder() {
        return new f<>(this, this.f22912b, this.f22913c, this.f22915e);
    }

    @Override // nd.c, java.util.List
    public E get(int i10) {
        a1.d.a(i10, size());
        return (E) d(i10)[i10 & 31];
    }

    @Override // w0.e
    public w0.e<E> h(int i10) {
        a1.d.a(i10, size());
        int iW = w();
        Object[] objArr = this.f22912b;
        int i11 = this.f22915e;
        return i10 >= iW ? v(objArr, iW, i11, i10 - iW) : v(u(objArr, i11, i10, new d(this.f22913c[0])), iW, this.f22915e, 0);
    }

    @Override // nd.c, java.util.List
    public ListIterator<E> listIterator(int i10) {
        a1.d.b(i10, size());
        return new g(this.f22912b, this.f22913c, i10, size(), (this.f22915e / 5) + 1);
    }

    @Override // w0.e
    public w0.e<E> q(zd.l<? super E, Boolean> lVar) {
        f<E> fVarBuilder = builder();
        fVarBuilder.N(lVar);
        return fVarBuilder.build();
    }

    @Override // nd.c, java.util.List
    public w0.e<E> set(int i10, E e10) {
        a1.d.a(i10, size());
        if (w() > i10) {
            return new e(x(this.f22912b, this.f22915e, i10, e10), this.f22913c, size(), this.f22915e);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f22913c, 32);
        r.e(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i10 & 31] = e10;
        return new e(this.f22912b, objArrCopyOf, size(), this.f22915e);
    }
}
