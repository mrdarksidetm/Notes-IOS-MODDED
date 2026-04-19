package y0;

import ae.n0;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public class g<K, V, T> extends e<K, V, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f<K, V> f23170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private K f23171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23173g;

    public g(f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.i(), uVarArr);
        this.f23170d = fVar;
        this.f23173g = fVar.g();
    }

    private final void j() {
        if (this.f23170d.g() != this.f23173g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void l() {
        if (!this.f23172f) {
            throw new IllegalStateException();
        }
    }

    private final void m(int i10, t<?, ?> tVar, K k10, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            f()[i11].n(tVar.p(), tVar.p().length, 0);
            while (!ae.r.b(f()[i11].c(), k10)) {
                f()[i11].j();
            }
            i(i11);
            return;
        }
        int iF = 1 << x.f(i10, i12);
        if (tVar.q(iF)) {
            f()[i11].n(tVar.p(), tVar.m() * 2, tVar.n(iF));
            i(i11);
        } else {
            int iO = tVar.O(iF);
            t<?, ?> tVarN = tVar.N(iO);
            f()[i11].n(tVar.p(), tVar.m() * 2, iO);
            m(i10, tVarN, k10, i11 + 1);
        }
    }

    public final void n(K k10, V v10) {
        if (this.f23170d.containsKey(k10)) {
            if (hasNext()) {
                K kD = d();
                this.f23170d.put(k10, v10);
                m(kD != null ? kD.hashCode() : 0, this.f23170d.i(), kD, 0);
            } else {
                this.f23170d.put(k10, v10);
            }
            this.f23173g = this.f23170d.g();
        }
    }

    @Override // y0.e, java.util.Iterator
    public T next() {
        j();
        this.f23171e = d();
        this.f23172f = true;
        return (T) super.next();
    }

    @Override // y0.e, java.util.Iterator
    public void remove() {
        l();
        if (hasNext()) {
            K kD = d();
            n0.d(this.f23170d).remove(this.f23171e);
            m(kD != null ? kD.hashCode() : 0, this.f23170d.i(), kD, 0);
        } else {
            n0.d(this.f23170d).remove(this.f23171e);
        }
        this.f23171e = null;
        this.f23172f = false;
        this.f23173g = this.f23170d.g();
    }
}
