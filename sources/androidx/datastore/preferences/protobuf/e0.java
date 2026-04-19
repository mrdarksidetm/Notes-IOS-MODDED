package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y;
import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class e0 extends c<Long> implements y.h, RandomAccess, u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e0 f3551d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f3552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3553c;

    static {
        e0 e0Var = new e0(new long[0], 0);
        f3551d = e0Var;
        e0Var.e();
    }

    e0() {
        this(new long[10], 0);
    }

    private e0(long[] jArr, int i10) {
        this.f3552b = jArr;
        this.f3553c = i10;
    }

    private void f(int i10, long j10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f3553c)) {
            throw new IndexOutOfBoundsException(r(i10));
        }
        long[] jArr = this.f3552b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f3552b, i10, jArr2, i10 + 1, this.f3553c - i10);
            this.f3552b = jArr2;
        }
        this.f3552b[i10] = j10;
        this.f3553c++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f3553c) {
            throw new IndexOutOfBoundsException(r(i10));
        }
    }

    private String r(int i10) {
        return "Index:" + i10 + ", Size:" + this.f3553c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof e0)) {
            return super.addAll(collection);
        }
        e0 e0Var = (e0) collection;
        int i10 = e0Var.f3553c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f3553c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f3552b;
        if (i12 > jArr.length) {
            this.f3552b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(e0Var.f3552b, 0, this.f3552b, this.f3553c, e0Var.f3553c);
        this.f3553c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        f(i10, l10.longValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        k(l10.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return super.equals(obj);
        }
        e0 e0Var = (e0) obj;
        if (this.f3553c != e0Var.f3553c) {
            return false;
        }
        long[] jArr = e0Var.f3552b;
        for (int i10 = 0; i10 < this.f3553c; i10++) {
            if (this.f3552b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iF = 1;
        for (int i10 = 0; i10 < this.f3553c; i10++) {
            iF = (iF * 31) + y.f(this.f3552b[i10]);
        }
        return iF;
    }

    public void k(long j10) {
        a();
        int i10 = this.f3553c;
        long[] jArr = this.f3552b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f3552b = jArr2;
        }
        long[] jArr3 = this.f3552b;
        int i11 = this.f3553c;
        this.f3553c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(o(i10));
    }

    public long o(int i10) {
        l(i10);
        return this.f3552b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i10 = 0; i10 < this.f3553c; i10++) {
            if (obj.equals(Long.valueOf(this.f3552b[i10]))) {
                long[] jArr = this.f3552b;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f3553c - i10) - 1);
                this.f3553c--;
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
        long[] jArr = this.f3552b;
        System.arraycopy(jArr, i11, jArr, i10, this.f3553c - i11);
        this.f3553c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.y.i
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public y.h g(int i10) {
        if (i10 >= this.f3553c) {
            return new e0(Arrays.copyOf(this.f3552b, i10), this.f3553c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3553c;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        a();
        l(i10);
        long[] jArr = this.f3552b;
        long j10 = jArr[i10];
        if (i10 < this.f3553c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f3553c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(v(i10, l10.longValue()));
    }

    public long v(int i10, long j10) {
        a();
        l(i10);
        long[] jArr = this.f3552b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }
}
