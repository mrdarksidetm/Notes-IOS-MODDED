package le;

import java.util.concurrent.locks.LockSupport;
import le.k1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l1 extends j1 {
    protected abstract Thread w0();

    protected void x0(long j10, k1.c cVar) {
        s0.f15110i.H0(j10, cVar);
    }

    protected final void y0() {
        Thread threadW0 = w0();
        if (Thread.currentThread() != threadW0) {
            c.a();
            LockSupport.unpark(threadW0);
        }
    }
}
