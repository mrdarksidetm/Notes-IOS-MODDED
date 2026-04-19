package md;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements Collection<c0>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f15548a;

    private static final class a implements Iterator<c0>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f15549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15550b;

        public a(long[] jArr) {
            ae.r.f(jArr, "array");
            this.f15549a = jArr;
        }

        public long c() {
            int i10 = this.f15550b;
            long[] jArr = this.f15549a;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f15550b));
            }
            this.f15550b = i10 + 1;
            return c0.b(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15550b < this.f15549a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ c0 next() {
            return c0.a(c());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ d0(long[] jArr) {
        this.f15548a = jArr;
    }

    public static final /* synthetic */ d0 a(long[] jArr) {
        return new d0(jArr);
    }

    public static long[] d(int i10) {
        return f(new long[i10]);
    }

    public static long[] f(long[] jArr) {
        ae.r.f(jArr, "storage");
        return jArr;
    }

    public static boolean n(long[] jArr, long j10) {
        return nd.p.E(jArr, j10);
    }

    public static boolean o(long[] jArr, Collection<c0> collection) {
        ae.r.f(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof c0) && nd.p.E(jArr, ((c0) obj).m()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean r(long[] jArr, Object obj) {
        return (obj instanceof d0) && ae.r.b(jArr, ((d0) obj).A());
    }

    public static final long s(long[] jArr, int i10) {
        return c0.b(jArr[i10]);
    }

    public static int u(long[] jArr) {
        return jArr.length;
    }

    public static int v(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean w(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator<c0> x(long[] jArr) {
        return new a(jArr);
    }

    public static final void y(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String z(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    public final /* synthetic */ long[] A() {
        return this.f15548a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(c0 c0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends c0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof c0) {
            return l(((c0) obj).m());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        ae.r.f(collection, "elements");
        return o(this.f15548a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return r(this.f15548a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return v(this.f15548a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return w(this.f15548a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<c0> iterator() {
        return x(this.f15548a);
    }

    public boolean l(long j10) {
        return n(this.f15548a, j10);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int size() {
        return u(this.f15548a);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return ae.i.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        ae.r.f(tArr, "array");
        return (T[]) ae.i.b(this, tArr);
    }

    public String toString() {
        return z(this.f15548a);
    }
}
