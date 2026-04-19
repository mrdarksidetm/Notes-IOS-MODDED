package j0;

import j0.d;

/* JADX INFO: loaded from: classes.dex */
public final class j0<T> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0.d<d.a<T>> f13730a = new v0.d<>(new d.a[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d.a<? extends T> f13732c;

    private final void d(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < a()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i10 + ", size " + a());
    }

    private final boolean e(d.a<? extends T> aVar, int i10) {
        return i10 < aVar.b() + aVar.a() && aVar.b() <= i10;
    }

    private final d.a<T> f(int i10) {
        d.a<? extends T> aVar = this.f13732c;
        if (aVar != null && e(aVar, i10)) {
            return aVar;
        }
        v0.d<d.a<T>> dVar = this.f13730a;
        d.a aVar2 = (d.a<? extends T>) dVar.n()[e.b(dVar, i10)];
        this.f13732c = aVar2;
        return aVar2;
    }

    @Override // j0.d
    public int a() {
        return this.f13731b;
    }

    @Override // j0.d
    public void b(int i10, int i11, zd.l<? super d.a<? extends T>, md.i0> lVar) {
        d(i10);
        d(i11);
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')').toString());
        }
        int iB = e.b(this.f13730a, i10);
        int iB2 = this.f13730a.n()[iB].b();
        while (iB2 <= i11) {
            d.a<T> aVar = this.f13730a.n()[iB];
            lVar.invoke(aVar);
            iB2 += aVar.a();
            iB++;
        }
    }

    public final void c(int i10, T t10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("size should be >=0, but was " + i10).toString());
        }
        if (i10 == 0) {
            return;
        }
        d.a<T> aVar = new d.a<>(a(), i10, t10);
        this.f13731b = a() + i10;
        this.f13730a.b(aVar);
    }

    @Override // j0.d
    public d.a<T> get(int i10) {
        d(i10);
        return f(i10);
    }
}
