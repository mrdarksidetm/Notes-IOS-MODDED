package z;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class m<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f24094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f24095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f24096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f24097d;

    public m() {
        this(0, 1, null);
    }

    public m(int i10) {
        if (i10 == 0) {
            this.f24095b = a0.a.f15b;
            this.f24096c = a0.a.f16c;
        } else {
            int iF = a0.a.f(i10);
            this.f24095b = new long[iF];
            this.f24096c = new Object[iF];
        }
    }

    public /* synthetic */ m(int i10, int i11, ae.j jVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    public void b() {
        int i10 = this.f24097d;
        Object[] objArr = this.f24096c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f24097d = 0;
        this.f24094a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        ae.r.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        m<E> mVar = (m) objClone;
        mVar.f24095b = (long[]) this.f24095b.clone();
        mVar.f24096c = (Object[]) this.f24096c.clone();
        return mVar;
    }

    public boolean d(long j10) {
        return f(j10) >= 0;
    }

    public E e(long j10) {
        int iB = a0.a.b(this.f24095b, this.f24097d, j10);
        if (iB < 0 || this.f24096c[iB] == n.f24098a) {
            return null;
        }
        return (E) this.f24096c[iB];
    }

    public int f(long j10) {
        if (this.f24094a) {
            int i10 = this.f24097d;
            long[] jArr = this.f24095b;
            Object[] objArr = this.f24096c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != n.f24098a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f24094a = false;
            this.f24097d = i11;
        }
        return a0.a.b(this.f24095b, this.f24097d, j10);
    }

    public boolean g() {
        return m() == 0;
    }

    public long h(int i10) {
        if (!(i10 >= 0 && i10 < this.f24097d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f24094a) {
            int i11 = this.f24097d;
            long[] jArr = this.f24095b;
            Object[] objArr = this.f24096c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != n.f24098a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f24094a = false;
            this.f24097d = i12;
        }
        return this.f24095b[i10];
    }

    public void i(long j10, E e10) {
        int iB = a0.a.b(this.f24095b, this.f24097d, j10);
        if (iB >= 0) {
            this.f24096c[iB] = e10;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.f24097d && this.f24096c[i10] == n.f24098a) {
            this.f24095b[i10] = j10;
            this.f24096c[i10] = e10;
            return;
        }
        if (this.f24094a) {
            int i11 = this.f24097d;
            long[] jArr = this.f24095b;
            if (i11 >= jArr.length) {
                Object[] objArr = this.f24096c;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != n.f24098a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f24094a = false;
                this.f24097d = i12;
                i10 = ~a0.a.b(this.f24095b, i12, j10);
            }
        }
        int i14 = this.f24097d;
        if (i14 >= this.f24095b.length) {
            int iF = a0.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f24095b, iF);
            ae.r.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f24095b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24096c, iF);
            ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f24096c = objArrCopyOf;
        }
        int i15 = this.f24097d;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.f24095b;
            int i16 = i10 + 1;
            nd.o.g(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.f24096c;
            nd.o.h(objArr2, objArr2, i16, i10, this.f24097d);
        }
        this.f24095b[i10] = j10;
        this.f24096c[i10] = e10;
        this.f24097d++;
    }

    public void j(long j10) {
        int iB = a0.a.b(this.f24095b, this.f24097d, j10);
        if (iB < 0 || this.f24096c[iB] == n.f24098a) {
            return;
        }
        this.f24096c[iB] = n.f24098a;
        this.f24094a = true;
    }

    public void k(int i10) {
        if (this.f24096c[i10] != n.f24098a) {
            this.f24096c[i10] = n.f24098a;
            this.f24094a = true;
        }
    }

    public int m() {
        if (this.f24094a) {
            int i10 = this.f24097d;
            long[] jArr = this.f24095b;
            Object[] objArr = this.f24096c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != n.f24098a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f24094a = false;
            this.f24097d = i11;
        }
        return this.f24097d;
    }

    public E n(int i10) {
        if (!(i10 >= 0 && i10 < this.f24097d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        if (this.f24094a) {
            int i11 = this.f24097d;
            long[] jArr = this.f24095b;
            Object[] objArr = this.f24096c;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != n.f24098a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f24094a = false;
            this.f24097d = i12;
        }
        return (E) this.f24096c[i10];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24097d * 28);
        sb2.append('{');
        int i10 = this.f24097d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i11));
            sb2.append('=');
            E eN = n(i11);
            if (eN != sb2) {
                sb2.append(eN);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        ae.r.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
