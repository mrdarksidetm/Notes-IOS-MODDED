package okhttp3.internal.cache;

import ae.r;
import hf.c;
import hf.g0;
import hf.l;
import java.io.EOFException;
import java.io.IOException;
import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public class FaultHidingSink extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.l<IOException, i0> f17110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(g0 g0Var, zd.l<? super IOException, i0> lVar) {
        super(g0Var);
        r.f(g0Var, "delegate");
        r.f(lVar, "onException");
        this.f17110b = lVar;
    }

    @Override // hf.l, hf.g0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f17111c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f17111c = true;
            this.f17110b.invoke(e10);
        }
    }

    @Override // hf.l, hf.g0, java.io.Flushable
    public void flush() {
        if (this.f17111c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f17111c = true;
            this.f17110b.invoke(e10);
        }
    }

    @Override // hf.l, hf.g0
    public void v(c cVar, long j10) throws EOFException {
        r.f(cVar, "source");
        if (this.f17111c) {
            cVar.skip(j10);
            return;
        }
        try {
            super.v(cVar, j10);
        } catch (IOException e10) {
            this.f17111c = true;
            this.f17110b.invoke(e10);
        }
    }
}
