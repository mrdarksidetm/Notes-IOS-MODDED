package p003if;

import ae.r;
import hf.c;
import hf.i0;
import hf.m;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f12717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f12719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i0 i0Var, long j10, boolean z10) {
        super(i0Var);
        r.f(i0Var, "delegate");
        this.f12717b = j10;
        this.f12718c = z10;
    }

    private final void b(c cVar, long j10) throws EOFException {
        c cVar2 = new c();
        cVar2.T(cVar);
        cVar.v(cVar2, j10);
        cVar2.b();
    }

    @Override // hf.m, hf.i0
    public long X(c cVar, long j10) throws IOException {
        r.f(cVar, "sink");
        long j11 = this.f12719d;
        long j12 = this.f12717b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f12718c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long jX = super.X(cVar, j10);
        if (jX != -1) {
            this.f12719d += jX;
        }
        long j14 = this.f12719d;
        long j15 = this.f12717b;
        if ((j14 >= j15 || jX != -1) && j14 <= j15) {
            return jX;
        }
        if (jX > 0 && j14 > j15) {
            b(cVar, cVar.size() - (this.f12719d - this.f12717b));
        }
        throw new IOException("expected " + this.f12717b + " bytes but got " + this.f12719d);
    }
}
