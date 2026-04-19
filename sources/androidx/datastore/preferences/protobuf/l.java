package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y;
import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class l extends c<Double> implements y.b, RandomAccess, u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final l f3695d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f3696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3697c;

    static {
        l lVar = new l(new double[0], 0);
        f3695d = lVar;
        lVar.e();
    }

    l() {
        this(new double[10], 0);
    }

    private l(double[] dArr, int i10) {
        this.f3696b = dArr;
        this.f3697c = i10;
    }

    private void k(int i10, double d10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f3697c)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        double[] dArr = this.f3696b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f3696b, i10, dArr2, i10 + 1, this.f3697c - i10);
            this.f3696b = dArr2;
        }
        this.f3696b[i10] = d10;
        this.f3697c++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f3697c) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    private String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f3697c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof l)) {
            return super.addAll(collection);
        }
        l lVar = (l) collection;
        int i10 = lVar.f3697c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f3697c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f3696b;
        if (i12 > dArr.length) {
            this.f3696b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(lVar.f3696b, 0, this.f3696b, this.f3697c, lVar.f3697c);
        this.f3697c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        k(i10, d10.doubleValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        f(d10.doubleValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return super.equals(obj);
        }
        l lVar = (l) obj;
        if (this.f3697c != lVar.f3697c) {
            return false;
        }
        double[] dArr = lVar.f3696b;
        for (int i10 = 0; i10 < this.f3697c; i10++) {
            if (Double.doubleToLongBits(this.f3696b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public void f(double d10) {
        a();
        int i10 = this.f3697c;
        double[] dArr = this.f3696b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f3696b = dArr2;
        }
        double[] dArr3 = this.f3696b;
        int i11 = this.f3697c;
        this.f3697c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f3697c; i10++) {
            iF = (iF * 31) + y.f(Double.doubleToLongBits(this.f3696b[i10]));
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(o(i10));
    }

    public double o(int i10) {
        l(i10);
        return this.f3696b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f3697c; i10++) {
            if (obj.equals(Double.valueOf(this.f3696b[i10]))) {
                double[] dArr = this.f3696b;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f3697c - i10) - 1);
                this.f3697c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f3696b;
        System.arraycopy(dArr, i11, dArr, i10, this.f3697c - i11);
        this.f3697c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.y.i
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public y.b g(int i10) {
        if (i10 >= this.f3697c) {
            return new l(Arrays.copyOf(this.f3696b, i10), this.f3697c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3697c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        a();
        l(i10);
        double[] dArr = this.f3696b;
        double d10 = dArr[i10];
        if (i10 < this.f3697c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f3697c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(v(i10, d10.doubleValue()));
    }

    public double v(int i10, double d10) {
        a();
        l(i10);
        double[] dArr = this.f3696b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }
}
