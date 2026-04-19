package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y;
import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class x extends c<Integer> implements y.g, RandomAccess, u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final x f3772d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f3773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3774c;

    static {
        x xVar = new x(new int[0], 0);
        f3772d = xVar;
        xVar.e();
    }

    x() {
        this(new int[10], 0);
    }

    private x(int[] iArr, int i10) {
        this.f3773b = iArr;
        this.f3774c = i10;
    }

    private void k(int i10, int i11) {
        int i12;
        a();
        if (i10 < 0 || i10 > (i12 = this.f3774c)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        int[] iArr = this.f3773b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f3773b, i10, iArr2, i10 + 1, this.f3774c - i10);
            this.f3773b = iArr2;
        }
        this.f3773b[i10] = i11;
        this.f3774c++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f3774c) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    private String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f3774c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i10 = xVar.f3774c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f3774c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f3773b;
        if (i12 > iArr.length) {
            this.f3773b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(xVar.f3773b, 0, this.f3773b, this.f3774c, xVar.f3774c);
        this.f3774c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        k(i10, num.intValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        f(num.intValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.f3774c != xVar.f3774c) {
            return false;
        }
        int[] iArr = xVar.f3773b;
        for (int i10 = 0; i10 < this.f3774c; i10++) {
            if (this.f3773b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public void f(int i10) {
        a();
        int i11 = this.f3774c;
        int[] iArr = this.f3773b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f3773b = iArr2;
        }
        int[] iArr3 = this.f3773b;
        int i12 = this.f3774c;
        this.f3774c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f3774c; i11++) {
            i10 = (i10 * 31) + this.f3773b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(o(i10));
    }

    public int o(int i10) {
        l(i10);
        return this.f3773b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f3774c; i10++) {
            if (obj.equals(Integer.valueOf(this.f3773b[i10]))) {
                int[] iArr = this.f3773b;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f3774c - i10) - 1);
                this.f3774c--;
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
        int[] iArr = this.f3773b;
        System.arraycopy(iArr, i11, iArr, i10, this.f3774c - i11);
        this.f3774c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.y.i
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public y.g g(int i10) {
        if (i10 >= this.f3774c) {
            return new x(Arrays.copyOf(this.f3773b, i10), this.f3774c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3774c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        a();
        l(i10);
        int[] iArr = this.f3773b;
        int i11 = iArr[i10];
        if (i10 < this.f3774c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f3774c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(v(i10, num.intValue()));
    }

    public int v(int i10, int i11) {
        a();
        l(i10);
        int[] iArr = this.f3773b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }
}
