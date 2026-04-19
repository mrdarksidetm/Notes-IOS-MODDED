package hf;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f12007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f12008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f12009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f12010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CRC32 f12011e;

    public o(i0 i0Var) {
        ae.r.f(i0Var, "source");
        c0 c0Var = new c0(i0Var);
        this.f12008b = c0Var;
        Inflater inflater = new Inflater(true);
        this.f12009c = inflater;
        this.f12010d = new p((e) c0Var, inflater);
        this.f12011e = new CRC32();
    }

    private final void a(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        String str2 = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        ae.r.e(str2, "format(this, *args)");
        throw new IOException(str2);
    }

    private final void b() throws IOException {
        this.f12008b.b0(10L);
        byte bL = this.f12008b.f11944b.L(3L);
        boolean z10 = ((bL >> 1) & 1) == 1;
        if (z10) {
            o(this.f12008b.f11944b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f12008b.readShort());
        this.f12008b.skip(8L);
        if (((bL >> 2) & 1) == 1) {
            this.f12008b.b0(2L);
            if (z10) {
                o(this.f12008b.f11944b, 0L, 2L);
            }
            long jV = this.f12008b.f11944b.V();
            this.f12008b.b0(jV);
            if (z10) {
                o(this.f12008b.f11944b, 0L, jV);
            }
            this.f12008b.skip(jV);
        }
        if (((bL >> 3) & 1) == 1) {
            long jA = this.f12008b.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z10) {
                o(this.f12008b.f11944b, 0L, jA + 1);
            }
            this.f12008b.skip(jA + 1);
        }
        if (((bL >> 4) & 1) == 1) {
            long jA2 = this.f12008b.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                o(this.f12008b.f11944b, 0L, jA2 + 1);
            }
            this.f12008b.skip(jA2 + 1);
        }
        if (z10) {
            a("FHCRC", this.f12008b.V(), (short) this.f12011e.getValue());
            this.f12011e.reset();
        }
    }

    private final void l() throws IOException {
        a("CRC", this.f12008b.K(), (int) this.f12011e.getValue());
        a("ISIZE", this.f12008b.K(), (int) this.f12009c.getBytesWritten());
    }

    private final void o(c cVar, long j10, long j11) {
        d0 d0Var = cVar.f11933a;
        while (true) {
            ae.r.c(d0Var);
            int i10 = d0Var.f11950c;
            int i11 = d0Var.f11949b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            d0Var = d0Var.f11953f;
        }
        while (j11 > 0) {
            int i12 = (int) (((long) d0Var.f11949b) + j10);
            int iMin = (int) Math.min(d0Var.f11950c - i12, j11);
            this.f12011e.update(d0Var.f11948a, i12, iMin);
            j11 -= (long) iMin;
            d0Var = d0Var.f11953f;
            ae.r.c(d0Var);
            j10 = 0;
        }
    }

    @Override // hf.i0
    public long X(c cVar, long j10) throws IOException {
        ae.r.f(cVar, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f12007a == 0) {
            b();
            this.f12007a = (byte) 1;
        }
        if (this.f12007a == 1) {
            long size = cVar.size();
            long jX = this.f12010d.X(cVar, j10);
            if (jX != -1) {
                o(cVar, size, jX);
                return jX;
            }
            this.f12007a = (byte) 2;
        }
        if (this.f12007a == 2) {
            l();
            this.f12007a = (byte) 3;
            if (!this.f12008b.q()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12010d.close();
    }

    @Override // hf.i0
    public j0 e() {
        return this.f12008b.e();
    }
}
