package nd;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class v0<T> extends c<T> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f16138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16141e;

    public static final class a extends b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ v0<T> f16144e;

        a(v0<T> v0Var) {
            this.f16144e = v0Var;
            this.f16142c = v0Var.size();
            this.f16143d = ((v0) v0Var).f16140d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nd.b
        protected void c() {
            if (this.f16142c == 0) {
                d();
                return;
            }
            e(((v0) this.f16144e).f16138b[this.f16143d]);
            this.f16143d = (this.f16143d + 1) % ((v0) this.f16144e).f16139c;
            this.f16142c--;
        }
    }

    public v0(int i10) {
        this(new Object[i10], 0);
    }

    public v0(Object[] objArr, int i10) {
        ae.r.f(objArr, "buffer");
        this.f16138b = objArr;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= objArr.length) {
            this.f16139c = objArr.length;
            this.f16141e = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + objArr.length).toString());
    }

    @Override // nd.a
    public int a() {
        return this.f16141e;
    }

    @Override // nd.c, java.util.List
    public T get(int i10) {
        c.f16106a.b(i10, size());
        return (T) this.f16138b[(this.f16140d + i10) % this.f16139c];
    }

    @Override // nd.c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final void n(T t10) {
        if (r()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f16138b[(this.f16140d + size()) % this.f16139c] = t10;
        this.f16141e = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v0<T> o(int i10) {
        Object[] array;
        int i11 = this.f16139c;
        int iH = ge.o.h(i11 + (i11 >> 1) + 1, i10);
        if (this.f16140d == 0) {
            array = Arrays.copyOf(this.f16138b, iH);
            ae.r.e(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iH]);
        }
        return new v0<>(array, size());
    }

    public final boolean r() {
        return size() == this.f16139c;
    }

    public final void s(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (!(i10 <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        if (i10 > 0) {
            int i11 = this.f16140d;
            int i12 = (i11 + i10) % this.f16139c;
            if (i11 > i12) {
                o.q(this.f16138b, null, i11, this.f16139c);
                o.q(this.f16138b, null, 0, i12);
            } else {
                o.q(this.f16138b, null, i11, i12);
            }
            this.f16140d = i12;
            this.f16141e = size() - i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nd.a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // nd.a, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        ae.r.f(tArr, "array");
        int length = tArr.length;
        Object[] objArr = tArr;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(tArr, size());
            ae.r.e(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f16140d; i11 < size && i12 < this.f16139c; i12++) {
            objArr[i11] = this.f16138b[i12];
            i11++;
        }
        while (i11 < size) {
            objArr[i11] = this.f16138b[i10];
            i11++;
            i10++;
        }
        return (T[]) t.f(size, objArr);
    }
}
