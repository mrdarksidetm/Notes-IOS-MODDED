package b6;

import hf.g0;
import hf.l;
import java.io.EOFException;
import java.io.IOException;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.l<IOException, i0> f5508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5509c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(g0 g0Var, zd.l<? super IOException, i0> lVar) {
        super(g0Var);
        this.f5508b = lVar;
    }

    @Override // hf.l, hf.g0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f5509c = true;
            this.f5508b.invoke(e10);
        }
    }

    @Override // hf.l, hf.g0, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f5509c = true;
            this.f5508b.invoke(e10);
        }
    }

    @Override // hf.l, hf.g0
    public void v(hf.c cVar, long j10) throws EOFException {
        if (this.f5509c) {
            cVar.skip(j10);
            return;
        }
        try {
            super.v(cVar, j10);
        } catch (IOException e10) {
            this.f5509c = true;
            this.f5508b.invoke(e10);
        }
    }
}
