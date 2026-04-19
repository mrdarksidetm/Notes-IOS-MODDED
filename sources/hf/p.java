package hf;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f12014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f12015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12017d;

    public p(e eVar, Inflater inflater) {
        ae.r.f(eVar, "source");
        ae.r.f(inflater, "inflater");
        this.f12014a = eVar;
        this.f12015b = inflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(i0 i0Var, Inflater inflater) {
        this(u.d(i0Var), inflater);
        ae.r.f(i0Var, "source");
        ae.r.f(inflater, "inflater");
    }

    private final void l() {
        int i10 = this.f12016c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f12015b.getRemaining();
        this.f12016c -= remaining;
        this.f12014a.skip(remaining);
    }

    @Override // hf.i0
    public long X(c cVar, long j10) throws IOException {
        ae.r.f(cVar, "sink");
        do {
            long jA = a(cVar, j10);
            if (jA > 0) {
                return jA;
            }
            if (this.f12015b.finished() || this.f12015b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f12014a.q());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(c cVar, long j10) throws IOException {
        ae.r.f(cVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.f12017d)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            d0 d0VarQ0 = cVar.q0(1);
            int iMin = (int) Math.min(j10, 8192 - d0VarQ0.f11950c);
            b();
            int iInflate = this.f12015b.inflate(d0VarQ0.f11948a, d0VarQ0.f11950c, iMin);
            l();
            if (iInflate > 0) {
                d0VarQ0.f11950c += iInflate;
                long j11 = iInflate;
                cVar.n0(cVar.size() + j11);
                return j11;
            }
            if (d0VarQ0.f11949b == d0VarQ0.f11950c) {
                cVar.f11933a = d0VarQ0.b();
                e0.b(d0VarQ0);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean b() {
        if (!this.f12015b.needsInput()) {
            return false;
        }
        if (this.f12014a.q()) {
            return true;
        }
        d0 d0Var = this.f12014a.d().f11933a;
        ae.r.c(d0Var);
        int i10 = d0Var.f11950c;
        int i11 = d0Var.f11949b;
        int i12 = i10 - i11;
        this.f12016c = i12;
        this.f12015b.setInput(d0Var.f11948a, i11, i12);
        return false;
    }

    @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f12017d) {
            return;
        }
        this.f12015b.end();
        this.f12017d = true;
        this.f12014a.close();
    }

    @Override // hf.i0
    public j0 e() {
        return this.f12014a.e();
    }
}
