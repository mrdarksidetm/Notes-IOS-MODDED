package qe;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import qe.o0;

/* JADX INFO: loaded from: classes2.dex */
public class n0<T extends o0 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f19078b = AtomicIntegerFieldUpdater.newUpdater(n0.class, "_size");
    private volatile int _size;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T[] f19079a;

    private final T[] f() {
        T[] tArr = this.f19079a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new o0[4];
            this.f19079a = tArr2;
            return tArr2;
        }
        if (c() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, c() * 2);
        ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((o0[]) objArrCopyOf);
        this.f19079a = tArr3;
        return tArr3;
    }

    private final void j(int i10) {
        f19078b.set(this, i10);
    }

    private final void k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= c()) {
                return;
            }
            T[] tArr = this.f19079a;
            ae.r.c(tArr);
            int i12 = i11 + 1;
            if (i12 < c()) {
                T t10 = tArr[i12];
                ae.r.c(t10);
                T t11 = tArr[i11];
                ae.r.c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            ae.r.c(t12);
            T t13 = tArr[i11];
            ae.r.c(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f19079a;
            ae.r.c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            ae.r.c(t10);
            T t11 = tArr[i10];
            ae.r.c(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void m(int i10, int i11) {
        T[] tArr = this.f19079a;
        ae.r.c(tArr);
        T t10 = tArr[i11];
        ae.r.c(t10);
        T t11 = tArr[i10];
        ae.r.c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }

    public final void a(T t10) {
        t10.c(this);
        o0[] o0VarArrF = f();
        int iC = c();
        j(iC + 1);
        o0VarArrF[iC] = t10;
        t10.setIndex(iC);
        l(iC);
    }

    public final T b() {
        T[] tArr = this.f19079a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f19078b.get(this);
    }

    public final boolean d() {
        return c() == 0;
    }

    public final T e() {
        T t10;
        synchronized (this) {
            t10 = (T) b();
        }
        return t10;
    }

    public final boolean g(T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.b() == null) {
                z10 = false;
            } else {
                h(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T h(int r6) {
        /*
            r5 = this;
            T extends qe.o0 & java.lang.Comparable<? super T>[] r0 = r5.f19079a
            ae.r.c(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.j(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.m(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            ae.r.c(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            ae.r.c(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.m(r6, r1)
            r5.l(r1)
            goto L3d
        L3a:
            r5.k(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            ae.r.c(r6)
            r1 = 0
            r6.c(r1)
            r6.setIndex(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.n0.h(int):qe.o0");
    }

    public final T i() {
        T t10;
        synchronized (this) {
            t10 = c() > 0 ? (T) h(0) : null;
        }
        return t10;
    }
}
