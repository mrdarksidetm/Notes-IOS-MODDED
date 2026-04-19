package ne;

import java.util.concurrent.CancellationException;
import le.b2;
import le.i2;
import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public class e<E> extends le.a<i0> implements d<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d<E> f16192d;

    public e(qd.g gVar, d<E> dVar, boolean z10, boolean z11) {
        super(gVar, z10, z11);
        this.f16192d = dVar;
    }

    @Override // le.i2
    public void I(Throwable th) {
        CancellationException cancellationExceptionH0 = i2.H0(this, th, null, 1, null);
        this.f16192d.cancel(cancellationExceptionH0);
        D(cancellationExceptionH0);
    }

    protected final d<E> S0() {
        return this.f16192d;
    }

    @Override // ne.u
    public Object b(E e10, qd.d<? super i0> dVar) {
        return this.f16192d.b(e10, dVar);
    }

    @Override // ne.t
    public Object c(qd.d<? super E> dVar) {
        return this.f16192d.c(dVar);
    }

    @Override // le.i2, le.a2
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new b2(N(), null, this);
        }
        I(cancellationException);
    }

    @Override // ne.u
    public void e(zd.l<? super Throwable, i0> lVar) {
        this.f16192d.e(lVar);
    }

    @Override // ne.t
    public Object g() {
        return this.f16192d.g();
    }

    @Override // ne.u
    public boolean h(Throwable th) {
        return this.f16192d.h(th);
    }

    @Override // ne.u
    public Object i(E e10) {
        return this.f16192d.i(e10);
    }

    @Override // ne.t
    public f<E> iterator() {
        return this.f16192d.iterator();
    }

    @Override // ne.u
    public boolean k() {
        return this.f16192d.k();
    }
}
