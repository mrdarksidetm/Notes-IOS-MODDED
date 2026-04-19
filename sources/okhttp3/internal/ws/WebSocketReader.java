package okhttp3.internal.ws;

import ae.r;
import hf.c;
import hf.e;
import hf.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class WebSocketReader implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f17674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FrameCallback f17675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f17677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f17679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f17680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c f17684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c f17685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MessageInflater f17686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final byte[] f17687o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c.a f17688p;

    public interface FrameCallback {
        void a(f fVar);

        void b(f fVar);

        void c(String str);

        void d(f fVar);

        void e(int i10, String str);
    }

    public WebSocketReader(boolean z10, e eVar, FrameCallback frameCallback, boolean z11, boolean z12) {
        r.f(eVar, "source");
        r.f(frameCallback, "frameCallback");
        this.f17673a = z10;
        this.f17674b = eVar;
        this.f17675c = frameCallback;
        this.f17676d = z11;
        this.f17677e = z12;
        this.f17684l = new c();
        this.f17685m = new c();
        this.f17687o = z10 ? null : new byte[4];
        this.f17688p = z10 ? null : new c.a();
    }

    private final void b() throws ProtocolException, EOFException {
        String strM0;
        long j10 = this.f17680h;
        if (j10 > 0) {
            this.f17674b.B(this.f17684l, j10);
            if (!this.f17673a) {
                c cVar = this.f17684l;
                c.a aVar = this.f17688p;
                r.c(aVar);
                cVar.h0(aVar);
                this.f17688p.o(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.f17672a;
                c.a aVar2 = this.f17688p;
                byte[] bArr = this.f17687o;
                r.c(bArr);
                webSocketProtocol.b(aVar2, bArr);
                this.f17688p.close();
            }
        }
        switch (this.f17679g) {
            case 8:
                short s10 = 1005;
                long size = this.f17684l.size();
                if (size == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s10 = this.f17684l.readShort();
                    strM0 = this.f17684l.m0();
                    String strA = WebSocketProtocol.f17672a.a(s10);
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    strM0 = "";
                }
                this.f17675c.e(s10, strM0);
                this.f17678f = true;
                return;
            case 9:
                this.f17675c.a(this.f17684l.k0());
                return;
            case 10:
                this.f17675c.d(this.f17684l.k0());
                return;
            default:
                throw new ProtocolException(r.m("Unknown control opcode: ", Util.Q(this.f17679g)));
        }
    }

    private final void l() throws IOException {
        boolean z10;
        if (this.f17678f) {
            throw new IOException("closed");
        }
        long jH = this.f17674b.e().h();
        this.f17674b.e().b();
        try {
            int iD = Util.d(this.f17674b.readByte(), 255);
            this.f17674b.e().g(jH, TimeUnit.NANOSECONDS);
            int i10 = iD & 15;
            this.f17679g = i10;
            boolean z11 = (iD & 128) != 0;
            this.f17681i = z11;
            boolean z12 = (iD & 8) != 0;
            this.f17682j = z12;
            if (z12 && !z11) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z13 = (iD & 64) != 0;
            if (i10 == 1 || i10 == 2) {
                if (!z13) {
                    z10 = false;
                } else {
                    if (!this.f17676d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z10 = true;
                }
                this.f17683k = z10;
            } else if (z13) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iD & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iD & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iD2 = Util.d(this.f17674b.readByte(), 255);
            boolean z14 = (iD2 & 128) != 0;
            if (z14 == this.f17673a) {
                throw new ProtocolException(this.f17673a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j10 = iD2 & 127;
            this.f17680h = j10;
            if (j10 == 126) {
                this.f17680h = Util.e(this.f17674b.readShort(), 65535);
            } else if (j10 == 127) {
                long j11 = this.f17674b.readLong();
                this.f17680h = j11;
                if (j11 < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.R(this.f17680h) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f17682j && this.f17680h > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z14) {
                e eVar = this.f17674b;
                byte[] bArr = this.f17687o;
                r.c(bArr);
                eVar.readFully(bArr);
            }
        } catch (Throwable th) {
            this.f17674b.e().g(jH, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void o() throws IOException {
        while (!this.f17678f) {
            long j10 = this.f17680h;
            if (j10 > 0) {
                this.f17674b.B(this.f17685m, j10);
                if (!this.f17673a) {
                    c cVar = this.f17685m;
                    c.a aVar = this.f17688p;
                    r.c(aVar);
                    cVar.h0(aVar);
                    this.f17688p.o(this.f17685m.size() - this.f17680h);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.f17672a;
                    c.a aVar2 = this.f17688p;
                    byte[] bArr = this.f17687o;
                    r.c(bArr);
                    webSocketProtocol.b(aVar2, bArr);
                    this.f17688p.close();
                }
            }
            if (this.f17681i) {
                return;
            }
            y();
            if (this.f17679g != 0) {
                throw new ProtocolException(r.m("Expected continuation opcode. Got: ", Util.Q(this.f17679g)));
            }
        }
        throw new IOException("closed");
    }

    private final void w() throws IOException {
        int i10 = this.f17679g;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException(r.m("Unknown opcode: ", Util.Q(i10)));
        }
        o();
        if (this.f17683k) {
            MessageInflater messageInflater = this.f17686n;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.f17677e);
                this.f17686n = messageInflater;
            }
            messageInflater.a(this.f17685m);
        }
        if (i10 == 1) {
            this.f17675c.c(this.f17685m.m0());
        } else {
            this.f17675c.b(this.f17685m.k0());
        }
    }

    private final void y() throws IOException {
        while (!this.f17678f) {
            l();
            if (!this.f17682j) {
                return;
            } else {
                b();
            }
        }
    }

    public final void a() {
        l();
        if (this.f17682j) {
            b();
        } else {
            w();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageInflater messageInflater = this.f17686n;
        if (messageInflater == null) {
            return;
        }
        messageInflater.close();
    }
}
