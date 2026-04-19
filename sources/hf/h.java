package hf;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReentrantLock f11973d = n0.b();

    private static final class a implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f11974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f11975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f11976c;

        public a(h hVar, long j10) {
            ae.r.f(hVar, "fileHandle");
            this.f11974a = hVar;
            this.f11975b = j10;
        }

        @Override // hf.i0
        public long X(c cVar, long j10) {
            ae.r.f(cVar, "sink");
            if (!(!this.f11976c)) {
                throw new IllegalStateException("closed".toString());
            }
            long jE = this.f11974a.E(this.f11975b, cVar, j10);
            if (jE != -1) {
                this.f11975b += jE;
            }
            return jE;
        }

        @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f11976c) {
                return;
            }
            this.f11976c = true;
            ReentrantLock reentrantLockW = this.f11974a.w();
            reentrantLockW.lock();
            try {
                h hVar = this.f11974a;
                hVar.f11972c--;
                if (this.f11974a.f11972c == 0 && this.f11974a.f11971b) {
                    md.i0 i0Var = md.i0.f15558a;
                    reentrantLockW.unlock();
                    this.f11974a.y();
                }
            } finally {
                reentrantLockW.unlock();
            }
        }

        @Override // hf.i0
        public j0 e() {
            return j0.f11991e;
        }
    }

    public h(boolean z10) {
        this.f11970a = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long E(long j10, c cVar, long j11) {
        if (!(j11 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }
        long j12 = j10 + j11;
        long j13 = j10;
        while (true) {
            if (j13 >= j12) {
                break;
            }
            d0 d0VarQ0 = cVar.q0(1);
            int iA = A(j13, d0VarQ0.f11948a, d0VarQ0.f11950c, (int) Math.min(j12 - j13, 8192 - r9));
            if (iA == -1) {
                if (d0VarQ0.f11949b == d0VarQ0.f11950c) {
                    cVar.f11933a = d0VarQ0.b();
                    e0.b(d0VarQ0);
                }
                if (j10 == j13) {
                    return -1L;
                }
            } else {
                d0VarQ0.f11950c += iA;
                long j14 = iA;
                j13 += j14;
                cVar.n0(cVar.size() + j14);
            }
        }
        return j13 - j10;
    }

    protected abstract int A(long j10, byte[] bArr, int i10, int i11);

    protected abstract long C();

    public final i0 G(long j10) {
        ReentrantLock reentrantLock = this.f11973d;
        reentrantLock.lock();
        try {
            if (!(!this.f11971b)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f11972c++;
            reentrantLock.unlock();
            return new a(this, j10);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f11973d;
        reentrantLock.lock();
        try {
            if (this.f11971b) {
                return;
            }
            this.f11971b = true;
            if (this.f11972c != 0) {
                return;
            }
            md.i0 i0Var = md.i0.f15558a;
            reentrantLock.unlock();
            y();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.f11973d;
        reentrantLock.lock();
        try {
            if (!(!this.f11971b)) {
                throw new IllegalStateException("closed".toString());
            }
            md.i0 i0Var = md.i0.f15558a;
            reentrantLock.unlock();
            return C();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final ReentrantLock w() {
        return this.f11973d;
    }

    protected abstract void y();
}
