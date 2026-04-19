package y0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e<K, V, T> implements Iterator<T>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u<K, V, T>[] f23161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23163c = true;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        this.f23161a = uVarArr;
        uVarArr[0].m(tVar.p(), tVar.m() * 2);
        this.f23162b = 0;
        e();
    }

    private final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void e() {
        if (this.f23161a[this.f23162b].g()) {
            return;
        }
        for (int i10 = this.f23162b; -1 < i10; i10--) {
            int iG = g(i10);
            if (iG == -1 && this.f23161a[i10].i()) {
                this.f23161a[i10].l();
                iG = g(i10);
            }
            if (iG != -1) {
                this.f23162b = iG;
                return;
            }
            if (i10 > 0) {
                this.f23161a[i10 - 1].l();
            }
            this.f23161a[i10].m(t.f23181e.a().p(), 0);
        }
        this.f23163c = false;
    }

    private final int g(int i10) {
        if (this.f23161a[i10].g()) {
            return i10;
        }
        if (!this.f23161a[i10].i()) {
            return -1;
        }
        t<? extends K, ? extends V> tVarD = this.f23161a[i10].d();
        if (i10 == 6) {
            this.f23161a[i10 + 1].m(tVarD.p(), tVarD.p().length);
        } else {
            this.f23161a[i10 + 1].m(tVarD.p(), tVarD.m() * 2);
        }
        return g(i10 + 1);
    }

    protected final K d() {
        c();
        return this.f23161a[this.f23162b].c();
    }

    protected final u<K, V, T>[] f() {
        return this.f23161a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23163c;
    }

    protected final void i(int i10) {
        this.f23162b = i10;
    }

    @Override // java.util.Iterator
    public T next() {
        c();
        T next = this.f23161a[this.f23162b].next();
        e();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
