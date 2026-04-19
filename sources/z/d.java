package z;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final <E> void a(b<E> bVar, int i10) {
        ae.r.f(bVar, "<this>");
        bVar.t(new int[i10]);
        bVar.s(new Object[i10]);
    }

    public static final <E> int b(b<E> bVar, int i10) {
        ae.r.f(bVar, "<this>");
        try {
            return a0.a.a(bVar.f(), bVar.n(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int c(b<E> bVar, Object obj, int i10) {
        ae.r.f(bVar, "<this>");
        int iN = bVar.n();
        if (iN == 0) {
            return -1;
        }
        int iB = b(bVar, i10);
        if (iB < 0 || ae.r.b(obj, bVar.d()[iB])) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < iN && bVar.f()[i11] == i10) {
            if (ae.r.b(obj, bVar.d()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && bVar.f()[i12] == i10; i12--) {
            if (ae.r.b(obj, bVar.d()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final <E> int d(b<E> bVar) {
        ae.r.f(bVar, "<this>");
        return c(bVar, null, 0);
    }
}
