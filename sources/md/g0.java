package md;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements Collection<f0>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short[] f15554a;

    private static final class a implements Iterator<f0>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short[] f15555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15556b;

        public a(short[] sArr) {
            ae.r.f(sArr, "array");
            this.f15555a = sArr;
        }

        public short c() {
            int i10 = this.f15556b;
            short[] sArr = this.f15555a;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f15556b));
            }
            this.f15556b = i10 + 1;
            return f0.b(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15556b < this.f15555a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ f0 next() {
            return f0.a(c());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ g0(short[] sArr) {
        this.f15554a = sArr;
    }

    public static final /* synthetic */ g0 a(short[] sArr) {
        return new g0(sArr);
    }

    public static short[] d(int i10) {
        return f(new short[i10]);
    }

    public static short[] f(short[] sArr) {
        ae.r.f(sArr, "storage");
        return sArr;
    }

    public static boolean n(short[] sArr, short s10) {
        return nd.p.G(sArr, s10);
    }

    public static boolean o(short[] sArr, Collection<f0> collection) {
        ae.r.f(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof f0) && nd.p.G(sArr, ((f0) obj).l()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean r(short[] sArr, Object obj) {
        return (obj instanceof g0) && ae.r.b(sArr, ((g0) obj).A());
    }

    public static final short s(short[] sArr, int i10) {
        return f0.b(sArr[i10]);
    }

    public static int u(short[] sArr) {
        return sArr.length;
    }

    public static int v(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean w(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator<f0> x(short[] sArr) {
        return new a(sArr);
    }

    public static final void y(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String z(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public final /* synthetic */ short[] A() {
        return this.f15554a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(f0 f0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends f0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof f0) {
            return l(((f0) obj).l());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        ae.r.f(collection, "elements");
        return o(this.f15554a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return r(this.f15554a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return v(this.f15554a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return w(this.f15554a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<f0> iterator() {
        return x(this.f15554a);
    }

    public boolean l(short s10) {
        return n(this.f15554a, s10);
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
        return u(this.f15554a);
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
        return z(this.f15554a);
    }
}
