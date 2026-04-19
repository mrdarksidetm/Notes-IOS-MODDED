package hf;

import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f11967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deflater f11968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11969c;

    public g(d dVar, Deflater deflater) {
        ae.r.f(dVar, "sink");
        ae.r.f(deflater, "deflater");
        this.f11967a = dVar;
        this.f11968b = deflater;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(g0 g0Var, Deflater deflater) {
        this(u.c(g0Var), deflater);
        ae.r.f(g0Var, "sink");
        ae.r.f(deflater, "deflater");
    }

    @IgnoreJRERequirement
    private final void a(boolean z10) {
        d0 d0VarQ0;
        c cVarD = this.f11967a.d();
        while (true) {
            d0VarQ0 = cVarD.q0(1);
            Deflater deflater = this.f11968b;
            byte[] bArr = d0VarQ0.f11948a;
            int i10 = d0VarQ0.f11950c;
            int i11 = 8192 - i10;
            int iDeflate = z10 ? deflater.deflate(bArr, i10, i11, 2) : deflater.deflate(bArr, i10, i11);
            if (iDeflate > 0) {
                d0VarQ0.f11950c += iDeflate;
                cVarD.n0(cVarD.size() + ((long) iDeflate));
                this.f11967a.s();
            } else if (this.f11968b.needsInput()) {
                break;
            }
        }
        if (d0VarQ0.f11949b == d0VarQ0.f11950c) {
            cVarD.f11933a = d0VarQ0.b();
            e0.b(d0VarQ0);
        }
    }

    public final void b() {
        this.f11968b.finish();
        a(false);
    }

    @Override // hf.g0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f11969c) {
            return;
        }
        Throwable th = null;
        try {
            b();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f11968b.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f11967a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f11969c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // hf.g0
    public j0 e() {
        return this.f11967a.e();
    }

    @Override // hf.g0, java.io.Flushable
    public void flush() {
        a(true);
        this.f11967a.flush();
    }

    public String toString() {
        return "DeflaterSink(" + this.f11967a + ')';
    }

    @Override // hf.g0
    public void v(c cVar, long j10) {
        ae.r.f(cVar, "source");
        o0.b(cVar.size(), 0L, j10);
        while (j10 > 0) {
            d0 d0Var = cVar.f11933a;
            ae.r.c(d0Var);
            int iMin = (int) Math.min(j10, d0Var.f11950c - d0Var.f11949b);
            this.f11968b.setInput(d0Var.f11948a, d0Var.f11949b, iMin);
            a(false);
            long j11 = iMin;
            cVar.n0(cVar.size() - j11);
            int i10 = d0Var.f11949b + iMin;
            d0Var.f11949b = i10;
            if (i10 == d0Var.f11950c) {
                cVar.f11933a = d0Var.b();
                e0.b(d0Var);
            }
            j10 -= j11;
        }
    }
}
