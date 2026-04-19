package md;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements Collection<y>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f15589a;

    private static final class a implements Iterator<y>, be.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f15590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15591b;

        public a(byte[] bArr) {
            ae.r.f(bArr, "array");
            this.f15590a = bArr;
        }

        public byte c() {
            int i10 = this.f15591b;
            byte[] bArr = this.f15590a;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f15591b));
            }
            this.f15591b = i10 + 1;
            return y.b(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15591b < this.f15590a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ y next() {
            return y.a(c());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ z(byte[] bArr) {
        this.f15589a = bArr;
    }

    public static final /* synthetic */ z a(byte[] bArr) {
        return new z(bArr);
    }

    public static byte[] d(int i10) {
        return f(new byte[i10]);
    }

    public static byte[] f(byte[] bArr) {
        ae.r.f(bArr, "storage");
        return bArr;
    }

    public static boolean n(byte[] bArr, byte b10) {
        return nd.p.C(bArr, b10);
    }

    public static boolean o(byte[] bArr, Collection<y> collection) {
        ae.r.f(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (!((obj instanceof y) && nd.p.C(bArr, ((y) obj).l()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean r(byte[] bArr, Object obj) {
        return (obj instanceof z) && ae.r.b(bArr, ((z) obj).A());
    }

    public static final byte s(byte[] bArr, int i10) {
        return y.b(bArr[i10]);
    }

    public static int u(byte[] bArr) {
        return bArr.length;
    }

    public static int v(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean w(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator<y> x(byte[] bArr) {
        return new a(bArr);
    }

    public static final void y(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    public static String z(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    public final /* synthetic */ byte[] A() {
        return this.f15589a;
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(y yVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends y> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof y) {
            return l(((y) obj).l());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        ae.r.f(collection, "elements");
        return o(this.f15589a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return r(this.f15589a, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return v(this.f15589a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return w(this.f15589a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<y> iterator() {
        return x(this.f15589a);
    }

    public boolean l(byte b10) {
        return n(this.f15589a, b10);
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
        return u(this.f15589a);
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
        return z(this.f15589a);
    }
}
