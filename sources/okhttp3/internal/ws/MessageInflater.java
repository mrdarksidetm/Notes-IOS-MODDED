package okhttp3.internal.ws;

import ae.r;
import hf.c;
import hf.i0;
import hf.p;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class MessageInflater implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f17619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f17620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f17621d;

    public MessageInflater(boolean z10) {
        this.f17618a = z10;
        c cVar = new c();
        this.f17619b = cVar;
        Inflater inflater = new Inflater(true);
        this.f17620c = inflater;
        this.f17621d = new p((i0) cVar, inflater);
    }

    public final void a(c cVar) throws IOException {
        r.f(cVar, "buffer");
        if (!(this.f17619b.size() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f17618a) {
            this.f17620c.reset();
        }
        this.f17619b.T(cVar);
        this.f17619b.writeInt(65535);
        long bytesRead = this.f17620c.getBytesRead() + this.f17619b.size();
        do {
            this.f17621d.a(cVar, Long.MAX_VALUE);
        } while (this.f17620c.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17621d.close();
    }
}
