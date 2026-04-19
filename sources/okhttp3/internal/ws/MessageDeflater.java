package okhttp3.internal.ws;

import ae.r;
import hf.c;
import hf.f;
import hf.g;
import hf.g0;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import xd.b;

/* JADX INFO: loaded from: classes2.dex */
public final class MessageDeflater implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f17614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deflater f17615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f17616d;

    public MessageDeflater(boolean z10) {
        this.f17613a = z10;
        c cVar = new c();
        this.f17614b = cVar;
        Deflater deflater = new Deflater(-1, true);
        this.f17615c = deflater;
        this.f17616d = new g((g0) cVar, deflater);
    }

    private final boolean b(c cVar, f fVar) {
        return cVar.Z(cVar.size() - ((long) fVar.F()), fVar);
    }

    public final void a(c cVar) throws IOException {
        r.f(cVar, "buffer");
        if (!(this.f17614b.size() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f17613a) {
            this.f17615c.reset();
        }
        this.f17616d.v(cVar, cVar.size());
        this.f17616d.flush();
        if (b(this.f17614b, MessageDeflaterKt.f17617a)) {
            long size = this.f17614b.size() - ((long) 4);
            c.a aVarI0 = c.i0(this.f17614b, null, 1, null);
            try {
                aVarI0.l(size);
                b.a(aVarI0, null);
            } finally {
            }
        } else {
            this.f17614b.writeByte(0);
        }
        c cVar2 = this.f17614b;
        cVar.v(cVar2, cVar2.size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f17616d.close();
    }
}
