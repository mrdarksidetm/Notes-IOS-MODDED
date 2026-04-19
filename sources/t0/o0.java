package t0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class o0 implements Iterator<e1.b>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s2 f20889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20892d;

    public o0(s2 s2Var, int i10, int i11) {
        this.f20889a = s2Var;
        this.f20890b = i11;
        this.f20891c = i10;
        this.f20892d = s2Var.w();
        if (s2Var.x()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.f20889a.w() != this.f20892d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e1.b next() {
        d();
        int i10 = this.f20891c;
        this.f20891c = u2.I(this.f20889a.r(), i10) + i10;
        return new t2(this.f20889a, i10, this.f20892d);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f20891c < this.f20890b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
