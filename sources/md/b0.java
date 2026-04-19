package md;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements Collection<a0>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f15539a;

    private static final class a implements Iterator<a0>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f15540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15541b;

        public a(int[] iArr) {
            ae.r.f(iArr, "array");
            this.f15540a = iArr;
        }

        public int c() {
            int i10 = this.f15541b;
            int[] iArr = this.f15540a;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f15541b));
            }
            this.f15541b = i10 + 1;
            return a0.b(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15541b < this.f15540a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ a0 next() {
            return a0.a(c());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ b0(int[] iArr) {
        this.f15539a = iArr;
    }

    public static final /* synthetic */ b0 a(int[] iArr) {
        return new b0(iArr);
    }

    public static int[] d(int i10) {
        return f(new int[i10]);
    }

    public static int[] f(int[] iArr) {
        ae.r.f(iArr, "storage");
        return iArr;
    }

    public static boolean n(int[] iArr, int i10) {
        return nd.p.D(iArr, i10);
    }

    public static boolean o(int[] iArr, Collection<a0> collection) {
        ae.r.f(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof a0) && nd.p.D(iArr, ((a0) obj).l()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean r(int[] iArr, Object obj) {
        return (obj instanceof b0) && ae.r.b(iArr, ((b0) obj).A());
    }

    public static final int s(int[] iArr, int i10) {
        return a0.b(iArr[i10]);
    }

    public static int u(int[] iArr) {
        return iArr.length;
    }

    public static int v(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean w(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator<a0> x(int[] iArr) {
        return new a(iArr);
    }

    public static final void y(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String z(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public final /* synthetic */ int[] A() {
        return this.f15539a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(a0 a0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends a0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof a0) {
            return l(((a0) obj).l());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        ae.r.f(collection, "elements");
        return o(this.f15539a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return r(this.f15539a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return v(this.f15539a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return w(this.f15539a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<a0> iterator() {
        return x(this.f15539a);
    }

    public boolean l(int i10) {
        return n(this.f15539a, i10);
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
        return u(this.f15539a);
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
        return z(this.f15539a);
    }
}
