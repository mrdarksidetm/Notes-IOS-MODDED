package z;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class d0<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f24063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f24064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f24065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f24066d;

    public d0() {
        this(0, 1, null);
    }

    public d0(int i10) {
        if (i10 == 0) {
            this.f24064b = a0.a.f14a;
            this.f24065c = a0.a.f16c;
        } else {
            int iE = a0.a.e(i10);
            this.f24064b = new int[iE];
            this.f24065c = new Object[iE];
        }
    }

    public /* synthetic */ d0(int i10, int i11, ae.j jVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    public void b(int i10, E e10) {
        int i11 = this.f24066d;
        if (i11 != 0 && i10 <= this.f24064b[i11 - 1]) {
            i(i10, e10);
            return;
        }
        if (this.f24063a && i11 >= this.f24064b.length) {
            e0.d(this);
        }
        int i12 = this.f24066d;
        if (i12 >= this.f24064b.length) {
            int iE = a0.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f24064b, iE);
            ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f24064b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24065c, iE);
            ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f24065c = objArrCopyOf;
        }
        this.f24064b[i12] = i10;
        this.f24065c[i12] = e10;
        this.f24066d = i12 + 1;
    }

    public void c() {
        int i10 = this.f24066d;
        Object[] objArr = this.f24065c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f24066d = 0;
        this.f24063a = false;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public d0<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        ae.r.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        d0<E> d0Var = (d0) objClone;
        d0Var.f24064b = (int[]) this.f24064b.clone();
        d0Var.f24065c = (Object[]) this.f24065c.clone();
        return d0Var;
    }

    public boolean e(int i10) {
        return g(i10) >= 0;
    }

    public E f(int i10) {
        return (E) e0.c(this, i10);
    }

    public int g(int i10) {
        if (this.f24063a) {
            e0.d(this);
        }
        return a0.a.a(this.f24064b, this.f24066d, i10);
    }

    public int h(int i10) {
        if (this.f24063a) {
            e0.d(this);
        }
        return this.f24064b[i10];
    }

    public void i(int i10, E e10) {
        int iA = a0.a.a(this.f24064b, this.f24066d, i10);
        if (iA >= 0) {
            this.f24065c[iA] = e10;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f24066d && this.f24065c[i11] == e0.f24070a) {
            this.f24064b[i11] = i10;
            this.f24065c[i11] = e10;
            return;
        }
        if (this.f24063a && this.f24066d >= this.f24064b.length) {
            e0.d(this);
            i11 = ~a0.a.a(this.f24064b, this.f24066d, i10);
        }
        int i12 = this.f24066d;
        if (i12 >= this.f24064b.length) {
            int iE = a0.a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f24064b, iE);
            ae.r.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f24064b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24065c, iE);
            ae.r.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f24065c = objArrCopyOf;
        }
        int i13 = this.f24066d;
        if (i13 - i11 != 0) {
            int[] iArr = this.f24064b;
            int i14 = i11 + 1;
            nd.o.f(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f24065c;
            nd.o.h(objArr, objArr, i14, i11, this.f24066d);
        }
        this.f24064b[i11] = i10;
        this.f24065c[i11] = e10;
        this.f24066d++;
    }

    public int j() {
        if (this.f24063a) {
            e0.d(this);
        }
        return this.f24066d;
    }

    public E k(int i10) {
        if (this.f24063a) {
            e0.d(this);
        }
        return (E) this.f24065c[i10];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24066d * 28);
        sb2.append('{');
        int i10 = this.f24066d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i11));
            sb2.append('=');
            E eK = k(i11);
            if (eK != this) {
                sb2.append(eK);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        ae.r.e(string, "buffer.toString()");
        return string;
    }
}
