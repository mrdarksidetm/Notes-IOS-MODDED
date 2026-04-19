package nd;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class k0<T> implements Iterator<i0<? extends T>>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator<T> f16131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16132b;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(Iterator<? extends T> it) {
        ae.r.f(it, "iterator");
        this.f16131a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final i0<T> next() {
        int i10 = this.f16132b;
        this.f16132b = i10 + 1;
        if (i10 < 0) {
            u.w();
        }
        return new i0<>(i10, this.f16131a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16131a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
