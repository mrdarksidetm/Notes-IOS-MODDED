package okhttp3.internal.http2;

import ae.j;
import ae.r;
import com.google.android.gms.common.api.a;
import hf.c;
import hf.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* JADX INFO: loaded from: classes2.dex */
public final class Http2Writer implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Companion f17514g = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Logger f17515h = Logger.getLogger(Http2.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f17516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f17518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f17520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Hpack.Writer f17521f;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public Http2Writer(d dVar, boolean z10) {
        r.f(dVar, "sink");
        this.f17516a = dVar;
        this.f17517b = z10;
        c cVar = new c();
        this.f17518c = cVar;
        this.f17519d = 16384;
        this.f17521f = new Hpack.Writer(0, false, cVar, 3, null);
    }

    private final void M(int i10, long j10) {
        while (j10 > 0) {
            long jMin = Math.min(this.f17519d, j10);
            j10 -= jMin;
            w(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f17516a.v(this.f17518c, jMin);
        }
    }

    public final synchronized void A(boolean z10, int i10, List<Header> list) {
        r.f(list, "headerBlock");
        if (this.f17520e) {
            throw new IOException("closed");
        }
        this.f17521f.g(list);
        long size = this.f17518c.size();
        long jMin = Math.min(this.f17519d, size);
        int i11 = size == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        w(i10, (int) jMin, 1, i11);
        this.f17516a.v(this.f17518c, jMin);
        if (size > jMin) {
            M(i10, size - jMin);
        }
    }

    public final int C() {
        return this.f17519d;
    }

    public final synchronized void E(boolean z10, int i10, int i11) {
        if (this.f17520e) {
            throw new IOException("closed");
        }
        w(0, 8, 6, z10 ? 1 : 0);
        this.f17516a.writeInt(i10);
        this.f17516a.writeInt(i11);
        this.f17516a.flush();
    }

    public final synchronized void G(int i10, int i11, List<Header> list) {
        r.f(list, "requestHeaders");
        if (this.f17520e) {
            throw new IOException("closed");
        }
        this.f17521f.g(list);
        long size = this.f17518c.size();
        int iMin = (int) Math.min(((long) this.f17519d) - 4, size);
        long j10 = iMin;
        w(i10, iMin + 4, 5, size == j10 ? 4 : 0);
        this.f17516a.writeInt(i11 & a.e.API_PRIORITY_OTHER);
        this.f17516a.v(this.f17518c, j10);
        if (size > j10) {
            M(i10, size - j10);
        }
    }

    public final synchronized void H(int i10, ErrorCode errorCode) {
        r.f(errorCode, "errorCode");
        if (this.f17520e) {
            throw new IOException("closed");
        }
        if (!(errorCode.b() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        w(i10, 4, 3, 0);
        this.f17516a.writeInt(errorCode.b());
        this.f17516a.flush();
    }

    public final synchronized void I(Settings settings) {
        r.f(settings, "settings");
        if (this.f17520e) {
            throw new IOException("closed");
        }
        int i10 = 0;
        w(0, settings.i() * 6, 4, 0);
        while (i10 < 10) {
            int i11 = i10 + 1;
            if (settings.f(i10)) {
                this.f17516a.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                this.f17516a.writeInt(settings.a(i10));
            }
            i10 = i11;
        }
        this.f17516a.flush();
    }

    public final synchronized void L(int i10, long j10) {
        if (this.f17520e) {
            throw new IOException("closed");
        }
        if (!(j10 != 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(r.m("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j10)).toString());
        }
        w(i10, 4, 8, 0);
        this.f17516a.writeInt((int) j10);
        this.f17516a.flush();
    }

    public final synchronized void a(Settings settings) {
        r.f(settings, "peerSettings");
        if (this.f17520e) {
            throw new IOException("closed");
        }
        this.f17519d = settings.e(this.f17519d);
        if (settings.b() != -1) {
            this.f17521f.e(settings.b());
        }
        w(0, 0, 4, 1);
        this.f17516a.flush();
    }

    public final synchronized void b() {
        if (this.f17520e) {
            throw new IOException("closed");
        }
        if (this.f17517b) {
            Logger logger = f17515h;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Util.s(r.m(">> CONNECTION ", Http2.f17365b.p()), new Object[0]));
            }
            this.f17516a.g(Http2.f17365b);
            this.f17516a.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f17520e = true;
        this.f17516a.close();
    }

    public final synchronized void flush() {
        if (this.f17520e) {
            throw new IOException("closed");
        }
        this.f17516a.flush();
    }

    public final synchronized void l(boolean z10, int i10, c cVar, int i11) {
        if (this.f17520e) {
            throw new IOException("closed");
        }
        o(i10, z10 ? 1 : 0, cVar, i11);
    }

    public final void o(int i10, int i11, c cVar, int i12) {
        w(i10, i12, 0, i11);
        if (i12 > 0) {
            d dVar = this.f17516a;
            r.c(cVar);
            dVar.v(cVar, i12);
        }
    }

    public final void w(int i10, int i11, int i12, int i13) {
        Logger logger = f17515h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.f17364a.c(false, i10, i11, i12, i13));
        }
        if (!(i11 <= this.f17519d)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f17519d + ": " + i11).toString());
        }
        if (!((Integer.MIN_VALUE & i10) == 0)) {
            throw new IllegalArgumentException(r.m("reserved bit set: ", Integer.valueOf(i10)).toString());
        }
        Util.b0(this.f17516a, i11);
        this.f17516a.writeByte(i12 & 255);
        this.f17516a.writeByte(i13 & 255);
        this.f17516a.writeInt(i10 & a.e.API_PRIORITY_OTHER);
    }

    public final synchronized void y(int i10, ErrorCode errorCode, byte[] bArr) {
        r.f(errorCode, "errorCode");
        r.f(bArr, "debugData");
        if (this.f17520e) {
            throw new IOException("closed");
        }
        if (!(errorCode.b() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        w(0, bArr.length + 8, 7, 0);
        this.f17516a.writeInt(i10);
        this.f17516a.writeInt(errorCode.b());
        if (!(bArr.length == 0)) {
            this.f17516a.write(bArr);
        }
        this.f17516a.flush();
    }
}
