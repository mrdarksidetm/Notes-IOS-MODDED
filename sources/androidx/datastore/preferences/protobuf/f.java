package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y;
import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class f extends c<Boolean> implements y.a, RandomAccess, u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f f3555d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f3556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3557c;

    static {
        f fVar = new f(new boolean[0], 0);
        f3555d = fVar;
        fVar.e();
    }

    f() {
        this(new boolean[10], 0);
    }

    private f(boolean[] zArr, int i10) {
        this.f3556b = zArr;
        this.f3557c = i10;
    }

    private void f(int i10, boolean z10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f3557c)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        boolean[] zArr = this.f3556b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f3556b, i10, zArr2, i10 + 1, this.f3557c - i10);
            this.f3556b = zArr2;
        }
        this.f3556b[i10] = z10;
        this.f3557c++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f3557c) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    private String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f3557c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i10 = fVar.f3557c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f3557c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f3556b;
        if (i12 > zArr.length) {
            this.f3556b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(fVar.f3556b, 0, this.f3556b, this.f3557c, fVar.f3557c);
        this.f3557c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        f(i10, bool.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        k(bool.booleanValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f3557c != fVar.f3557c) {
            return false;
        }
        boolean[] zArr = fVar.f3556b;
        for (int i10 = 0; i10 < this.f3557c; i10++) {
            if (this.f3556b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iC = 1;
        for (int i10 = 0; i10 < this.f3557c; i10++) {
            iC = (iC * 31) + y.c(this.f3556b[i10]);
        }
        return iC;
    }

    public void k(boolean z10) {
        a();
        int i10 = this.f3557c;
        boolean[] zArr = this.f3556b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f3556b = zArr2;
        }
        boolean[] zArr3 = this.f3556b;
        int i11 = this.f3557c;
        this.f3557c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(o(i10));
    }

    public boolean o(int i10) {
        l(i10);
        return this.f3556b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f3557c; i10++) {
            if (obj.equals(Boolean.valueOf(this.f3556b[i10]))) {
                boolean[] zArr = this.f3556b;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f3557c - i10) - 1);
                this.f3557c--;
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
        boolean[] zArr = this.f3556b;
        System.arraycopy(zArr, i11, zArr, i10, this.f3557c - i11);
        this.f3557c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.y.i
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public y.a g(int i10) {
        if (i10 >= this.f3557c) {
            return new f(Arrays.copyOf(this.f3556b, i10), this.f3557c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3557c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        a();
        l(i10);
        boolean[] zArr = this.f3556b;
        boolean z10 = zArr[i10];
        if (i10 < this.f3557c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f3557c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(v(i10, bool.booleanValue()));
    }

    public boolean v(int i10, boolean z10) {
        a();
        l(i10);
        boolean[] zArr = this.f3556b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }
}
