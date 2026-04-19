package okhttp3.internal.ws;

import ae.r;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import hf.c;
import hf.d;
import hf.f;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class WebSocketWriter implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f17690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Random f17691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f17693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f17694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f17695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f17696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MessageDeflater f17698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final byte[] f17699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c.a f17700l;

    public WebSocketWriter(boolean z10, d dVar, Random random, boolean z11, boolean z12, long j10) {
        r.f(dVar, "sink");
        r.f(random, "random");
        this.f17689a = z10;
        this.f17690b = dVar;
        this.f17691c = random;
        this.f17692d = z11;
        this.f17693e = z12;
        this.f17694f = j10;
        this.f17695g = new c();
        this.f17696h = dVar.d();
        this.f17699k = z10 ? new byte[4] : null;
        this.f17700l = z10 ? new c.a() : null;
    }

    private final void b(int i10, f fVar) throws IOException {
        if (this.f17697i) {
            throw new IOException("closed");
        }
        int iF = fVar.F();
        if (!(((long) iF) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.f17696h.writeByte(i10 | 128);
        if (this.f17689a) {
            this.f17696h.writeByte(iF | 128);
            Random random = this.f17691c;
            byte[] bArr = this.f17699k;
            r.c(bArr);
            random.nextBytes(bArr);
            this.f17696h.write(this.f17699k);
            if (iF > 0) {
                long size = this.f17696h.size();
                this.f17696h.g(fVar);
                c cVar = this.f17696h;
                c.a aVar = this.f17700l;
                r.c(aVar);
                cVar.h0(aVar);
                this.f17700l.o(size);
                WebSocketProtocol.f17672a.b(this.f17700l, this.f17699k);
                this.f17700l.close();
            }
        } else {
            this.f17696h.writeByte(iF);
            this.f17696h.g(fVar);
        }
        this.f17690b.flush();
    }

    public final void a(int i10, f fVar) {
        f fVarK0 = f.f11961e;
        if (i10 != 0 || fVar != null) {
            if (i10 != 0) {
                WebSocketProtocol.f17672a.c(i10);
            }
            c cVar = new c();
            cVar.writeShort(i10);
            if (fVar != null) {
                cVar.g(fVar);
            }
            fVarK0 = cVar.k0();
        }
        try {
            b(8, fVarK0);
        } finally {
            this.f17697i = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.f17698j;
        if (messageDeflater == null) {
            return;
        }
        messageDeflater.close();
    }

    public final void l(int i10, f fVar) throws IOException {
        r.f(fVar, "data");
        if (this.f17697i) {
            throw new IOException("closed");
        }
        this.f17695g.g(fVar);
        int i11 = i10 | 128;
        if (this.f17692d && fVar.F() >= this.f17694f) {
            MessageDeflater messageDeflater = this.f17698j;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.f17693e);
                this.f17698j = messageDeflater;
            }
            messageDeflater.a(this.f17695g);
            i11 |= 64;
        }
        long size = this.f17695g.size();
        this.f17696h.writeByte(i11);
        int i12 = this.f17689a ? 128 : 0;
        if (size <= 125) {
            this.f17696h.writeByte(((int) size) | i12);
        } else if (size <= 65535) {
            this.f17696h.writeByte(i12 | R.styleable.AppCompatTheme_windowNoTitle);
            this.f17696h.writeShort((int) size);
        } else {
            this.f17696h.writeByte(i12 | 127);
            this.f17696h.y0(size);
        }
        if (this.f17689a) {
            Random random = this.f17691c;
            byte[] bArr = this.f17699k;
            r.c(bArr);
            random.nextBytes(bArr);
            this.f17696h.write(this.f17699k);
            if (size > 0) {
                c cVar = this.f17695g;
                c.a aVar = this.f17700l;
                r.c(aVar);
                cVar.h0(aVar);
                this.f17700l.o(0L);
                WebSocketProtocol.f17672a.b(this.f17700l, this.f17699k);
                this.f17700l.close();
            }
        }
        this.f17696h.v(this.f17695g, size);
        this.f17690b.n();
    }

    public final void o(f fVar) throws IOException {
        r.f(fVar, "payload");
        b(9, fVar);
    }

    public final void w(f fVar) throws IOException {
        r.f(fVar, "payload");
        b(10, fVar);
    }
}
