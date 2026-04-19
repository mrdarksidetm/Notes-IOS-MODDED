package y0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final int f(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] g(Object[] objArr, int i10, K k10, V v10) {
        Object[] objArr2 = new Object[objArr.length + 2];
        nd.o.l(objArr, objArr2, 0, 0, i10, 6, null);
        nd.o.h(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = k10;
        objArr2[i10 + 1] = v10;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] h(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 2];
        nd.o.l(objArr, objArr2, 0, 0, i10, 6, null);
        nd.o.h(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] i(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        nd.o.l(objArr, objArr2, 0, 0, i10, 6, null);
        nd.o.h(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] j(Object[] objArr, int i10, int i11, t<?, ?> tVar) {
        int i12 = i11 - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        nd.o.l(objArr, objArr2, 0, 0, i10, 6, null);
        nd.o.h(objArr, objArr2, i10, i10 + 2, i11);
        objArr2[i12] = tVar;
        nd.o.h(objArr, objArr2, i12 + 1, i11, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] k(Object[] objArr, int i10, int i11, K k10, V v10) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
        nd.o.h(objArrCopyOf, objArrCopyOf, i10 + 2, i10 + 1, objArr.length);
        nd.o.h(objArrCopyOf, objArrCopyOf, i11 + 2, i11, i10);
        objArrCopyOf[i11] = k10;
        objArrCopyOf[i11 + 1] = v10;
        return objArrCopyOf;
    }
}
