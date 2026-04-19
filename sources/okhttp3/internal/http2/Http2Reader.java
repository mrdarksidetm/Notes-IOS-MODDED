package okhttp3.internal.http2;

import ae.j;
import ae.r;
import com.google.android.gms.common.api.a;
import ge.g;
import ge.o;
import hf.c;
import hf.e;
import hf.f;
import hf.i0;
import hf.j0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;

/* JADX INFO: loaded from: classes2.dex */
public final class Http2Reader implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f17474e = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f17475f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f17476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContinuationSource f17478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Hpack.Reader f17479d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Logger a() {
            return Http2Reader.f17475f;
        }

        public final int b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }
    }

    public static final class ContinuationSource implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f17480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f17483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f17484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f17485f;

        public ContinuationSource(e eVar) {
            r.f(eVar, "source");
            this.f17480a = eVar;
        }

        private final void b() throws IOException {
            int i10 = this.f17483d;
            int iJ = Util.J(this.f17480a);
            this.f17484e = iJ;
            this.f17481b = iJ;
            int iD = Util.d(this.f17480a.readByte(), 255);
            this.f17482c = Util.d(this.f17480a.readByte(), 255);
            Companion companion = Http2Reader.f17474e;
            if (companion.a().isLoggable(Level.FINE)) {
                companion.a().fine(Http2.f17364a.c(true, this.f17483d, this.f17481b, iD, this.f17482c));
            }
            int i11 = this.f17480a.readInt() & a.e.API_PRIORITY_OTHER;
            this.f17483d = i11;
            if (iD == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iD + " != TYPE_CONTINUATION");
            }
        }

        public final void A(int i10) {
            this.f17483d = i10;
        }

        @Override // hf.i0
        public long X(c cVar, long j10) throws IOException {
            r.f(cVar, "sink");
            while (true) {
                int i10 = this.f17484e;
                if (i10 != 0) {
                    long jX = this.f17480a.X(cVar, Math.min(j10, i10));
                    if (jX == -1) {
                        return -1L;
                    }
                    this.f17484e -= (int) jX;
                    return jX;
                }
                this.f17480a.skip(this.f17485f);
                this.f17485f = 0;
                if ((this.f17482c & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        public final int a() {
            return this.f17484e;
        }

        @Override // hf.i0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // hf.i0
        public j0 e() {
            return this.f17480a.e();
        }

        public final void l(int i10) {
            this.f17482c = i10;
        }

        public final void o(int i10) {
            this.f17484e = i10;
        }

        public final void w(int i10) {
            this.f17481b = i10;
        }

        public final void y(int i10) {
            this.f17485f = i10;
        }
    }

    public interface Handler {
        void a();

        void b(int i10, ErrorCode errorCode, f fVar);

        void c(boolean z10, Settings settings);

        void d(boolean z10, int i10, int i11, List<Header> list);

        void e(int i10, long j10);

        void f(boolean z10, int i10, e eVar, int i11);

        void h(boolean z10, int i10, int i11);

        void i(int i10, int i11, int i12, boolean z10);

        void j(int i10, ErrorCode errorCode);

        void k(int i10, int i11, List<Header> list);
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        r.e(logger, "getLogger(Http2::class.java.name)");
        f17475f = logger;
    }

    public Http2Reader(e eVar, boolean z10) {
        r.f(eVar, "source");
        this.f17476a = eVar;
        this.f17477b = z10;
        ContinuationSource continuationSource = new ContinuationSource(eVar);
        this.f17478c = continuationSource;
        this.f17479d = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void A(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        int iD = (i11 & 8) != 0 ? Util.d(this.f17476a.readByte(), 255) : 0;
        if ((i11 & 32) != 0) {
            E(handler, i12);
            i10 -= 5;
        }
        handler.d(z10, i12, -1, y(f17474e.b(i10, i11, iD), iD, i11, i12));
    }

    private final void C(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException(r.m("TYPE_PING length != 8: ", Integer.valueOf(i10)));
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.h((i11 & 1) != 0, this.f17476a.readInt(), this.f17476a.readInt());
    }

    private final void E(Handler handler, int i10) {
        int i11 = this.f17476a.readInt();
        handler.i(i10, i11 & a.e.API_PRIORITY_OTHER, Util.d(this.f17476a.readByte(), 255) + 1, (Integer.MIN_VALUE & i11) != 0);
    }

    private final void G(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            E(handler, i12);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
        }
    }

    private final void H(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iD = (i11 & 8) != 0 ? Util.d(this.f17476a.readByte(), 255) : 0;
        handler.k(i12, this.f17476a.readInt() & a.e.API_PRIORITY_OTHER, y(f17474e.b(i10 - 4, i11, iD), iD, i11, i12));
    }

    private final void I(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        }
        if (i12 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i13 = this.f17476a.readInt();
        ErrorCode errorCodeA = ErrorCode.f17316b.a(i13);
        if (errorCodeA == null) {
            throw new IOException(r.m("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(i13)));
        }
        handler.j(i12, errorCodeA);
    }

    private final void L(Handler handler, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i11 & 1) != 0) {
            if (i10 != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.a();
            return;
        }
        if (i10 % 6 != 0) {
            throw new IOException(r.m("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i10)));
        }
        Settings settings = new Settings();
        g gVarS = o.s(o.t(0, i10), 6);
        int iL = gVarS.l();
        int iN = gVarS.n();
        int iO = gVarS.o();
        if ((iO > 0 && iL <= iN) || (iO < 0 && iN <= iL)) {
            while (true) {
                int i14 = iL + iO;
                int iE = Util.e(this.f17476a.readShort(), 65535);
                i13 = this.f17476a.readInt();
                if (iE != 2) {
                    if (iE == 3) {
                        iE = 4;
                    } else if (iE == 4) {
                        iE = 7;
                        if (i13 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                    } else if (iE == 5 && (i13 < 16384 || i13 > 16777215)) {
                        break;
                    }
                } else if (i13 != 0 && i13 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.h(iE, i13);
                if (iL == iN) {
                    break;
                } else {
                    iL = i14;
                }
            }
            throw new IOException(r.m("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(i13)));
        }
        handler.c(false, settings);
    }

    private final void M(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException(r.m("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i10)));
        }
        long jF = Util.f(this.f17476a.readInt(), 2147483647L);
        if (jF == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.e(i12, jF);
    }

    private final void o(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iD = (i11 & 8) != 0 ? Util.d(this.f17476a.readByte(), 255) : 0;
        handler.f(z10, i12, this.f17476a, f17474e.b(i10, i11, iD));
        this.f17476a.skip(iD);
    }

    private final void w(Handler handler, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException(r.m("TYPE_GOAWAY length < 8: ", Integer.valueOf(i10)));
        }
        if (i12 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i13 = this.f17476a.readInt();
        int i14 = this.f17476a.readInt();
        int i15 = i10 - 8;
        ErrorCode errorCodeA = ErrorCode.f17316b.a(i14);
        if (errorCodeA == null) {
            throw new IOException(r.m("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(i14)));
        }
        f fVarJ = f.f11961e;
        if (i15 > 0) {
            fVarJ = this.f17476a.j(i15);
        }
        handler.b(i13, errorCodeA, fVarJ);
    }

    private final List<Header> y(int i10, int i11, int i12, int i13) throws IOException {
        this.f17478c.o(i10);
        ContinuationSource continuationSource = this.f17478c;
        continuationSource.w(continuationSource.a());
        this.f17478c.y(i11);
        this.f17478c.l(i12);
        this.f17478c.A(i13);
        this.f17479d.k();
        return this.f17479d.e();
    }

    public final boolean b(boolean z10, Handler handler) throws IOException {
        r.f(handler, "handler");
        try {
            this.f17476a.b0(9L);
            int iJ = Util.J(this.f17476a);
            if (iJ > 16384) {
                throw new IOException(r.m("FRAME_SIZE_ERROR: ", Integer.valueOf(iJ)));
            }
            int iD = Util.d(this.f17476a.readByte(), 255);
            int iD2 = Util.d(this.f17476a.readByte(), 255);
            int i10 = this.f17476a.readInt() & a.e.API_PRIORITY_OTHER;
            Logger logger = f17475f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.f17364a.c(true, i10, iJ, iD, iD2));
            }
            if (z10 && iD != 4) {
                throw new IOException(r.m("Expected a SETTINGS frame but was ", Http2.f17364a.b(iD)));
            }
            switch (iD) {
                case 0:
                    o(handler, iJ, iD2, i10);
                    return true;
                case 1:
                    A(handler, iJ, iD2, i10);
                    return true;
                case 2:
                    G(handler, iJ, iD2, i10);
                    return true;
                case 3:
                    I(handler, iJ, iD2, i10);
                    return true;
                case 4:
                    L(handler, iJ, iD2, i10);
                    return true;
                case 5:
                    H(handler, iJ, iD2, i10);
                    return true;
                case 6:
                    C(handler, iJ, iD2, i10);
                    return true;
                case 7:
                    w(handler, iJ, iD2, i10);
                    return true;
                case 8:
                    M(handler, iJ, iD2, i10);
                    return true;
                default:
                    this.f17476a.skip(iJ);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17476a.close();
    }

    public final void l(Handler handler) throws IOException {
        r.f(handler, "handler");
        if (this.f17477b) {
            if (!b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        e eVar = this.f17476a;
        f fVar = Http2.f17365b;
        f fVarJ = eVar.j(fVar.F());
        Logger logger = f17475f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.s(r.m("<< CONNECTION ", fVarJ.p()), new Object[0]));
        }
        if (!r.b(fVar, fVarJ)) {
            throw new IOException(r.m("Expected a connection header but was ", fVarJ.K()));
        }
    }
}
