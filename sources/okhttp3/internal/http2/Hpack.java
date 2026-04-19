package okhttp3.internal.http2;

import ae.j;
import ae.r;
import com.google.android.gms.common.api.a;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import hf.c;
import hf.e;
import hf.f;
import hf.i0;
import hf.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nd.c0;
import nd.o;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class Hpack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hpack f17343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Header[] f17344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<f, Integer> f17345c;

    public static final class Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<Header> f17348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e f17349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Header[] f17350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f17351f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17352g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f17353h;

        public Reader(i0 i0Var, int i10, int i11) {
            r.f(i0Var, "source");
            this.f17346a = i10;
            this.f17347b = i11;
            this.f17348c = new ArrayList();
            this.f17349d = u.d(i0Var);
            this.f17350e = new Header[8];
            this.f17351f = r2.length - 1;
        }

        public /* synthetic */ Reader(i0 i0Var, int i10, int i11, int i12, j jVar) {
            this(i0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }

        private final void a() {
            int i10 = this.f17347b;
            int i11 = this.f17353h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            o.t(this.f17350e, null, 0, 0, 6, null);
            this.f17351f = this.f17350e.length - 1;
            this.f17352g = 0;
            this.f17353h = 0;
        }

        private final int c(int i10) {
            return this.f17351f + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f17350e.length;
                while (true) {
                    length--;
                    i11 = this.f17351f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    Header header = this.f17350e[length];
                    r.c(header);
                    int i13 = header.f17342c;
                    i10 -= i13;
                    this.f17353h -= i13;
                    this.f17352g--;
                    i12++;
                }
                Header[] headerArr = this.f17350e;
                System.arraycopy(headerArr, i11 + 1, headerArr, i11 + 1 + i12, this.f17352g);
                this.f17351f += i12;
            }
            return i12;
        }

        private final f f(int i10) throws IOException {
            Header header;
            if (!h(i10)) {
                int iC = c(i10 - Hpack.f17343a.c().length);
                if (iC >= 0) {
                    Header[] headerArr = this.f17350e;
                    if (iC < headerArr.length) {
                        header = headerArr[iC];
                        r.c(header);
                    }
                }
                throw new IOException(r.m("Header index too large ", Integer.valueOf(i10 + 1)));
            }
            header = Hpack.f17343a.c()[i10];
            return header.f17340a;
        }

        private final void g(int i10, Header header) {
            this.f17348c.add(header);
            int i11 = header.f17342c;
            if (i10 != -1) {
                Header header2 = this.f17350e[c(i10)];
                r.c(header2);
                i11 -= header2.f17342c;
            }
            int i12 = this.f17347b;
            if (i11 > i12) {
                b();
                return;
            }
            int iD = d((this.f17353h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f17352g + 1;
                Header[] headerArr = this.f17350e;
                if (i13 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.f17351f = this.f17350e.length - 1;
                    this.f17350e = headerArr2;
                }
                int i14 = this.f17351f;
                this.f17351f = i14 - 1;
                this.f17350e[i14] = header;
                this.f17352g++;
            } else {
                this.f17350e[i10 + c(i10) + iD] = header;
            }
            this.f17353h += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= Hpack.f17343a.c().length - 1;
        }

        private final int i() {
            return Util.d(this.f17349d.readByte(), 255);
        }

        private final void l(int i10) throws IOException {
            if (h(i10)) {
                this.f17348c.add(Hpack.f17343a.c()[i10]);
                return;
            }
            int iC = c(i10 - Hpack.f17343a.c().length);
            if (iC >= 0) {
                Header[] headerArr = this.f17350e;
                if (iC < headerArr.length) {
                    List<Header> list = this.f17348c;
                    Header header = headerArr[iC];
                    r.c(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException(r.m("Header index too large ", Integer.valueOf(i10 + 1)));
        }

        private final void n(int i10) {
            g(-1, new Header(f(i10), j()));
        }

        private final void o() {
            g(-1, new Header(Hpack.f17343a.a(j()), j()));
        }

        private final void p(int i10) throws IOException {
            this.f17348c.add(new Header(f(i10), j()));
        }

        private final void q() throws IOException {
            this.f17348c.add(new Header(Hpack.f17343a.a(j()), j()));
        }

        public final List<Header> e() {
            List<Header> listC0 = c0.C0(this.f17348c);
            this.f17348c.clear();
            return listC0;
        }

        public final f j() {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long jM = m(i10, 127);
            if (!z10) {
                return this.f17349d.j(jM);
            }
            c cVar = new c();
            Huffman.f17522a.b(this.f17349d, jM, cVar);
            return cVar.k0();
        }

        public final void k() throws IOException {
            while (!this.f17349d.q()) {
                int iD = Util.d(this.f17349d.readByte(), 255);
                if (iD == 128) {
                    throw new IOException("index == 0");
                }
                if ((iD & 128) == 128) {
                    l(m(iD, 127) - 1);
                } else if (iD == 64) {
                    o();
                } else if ((iD & 64) == 64) {
                    n(m(iD, 63) - 1);
                } else if ((iD & 32) == 32) {
                    int iM = m(iD, 31);
                    this.f17347b = iM;
                    if (iM < 0 || iM > this.f17346a) {
                        throw new IOException(r.m("Invalid dynamic table size update ", Integer.valueOf(this.f17347b)));
                    }
                    a();
                } else if (iD == 16 || iD == 0) {
                    q();
                } else {
                    p(m(iD, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }
    }

    public static final class Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f17355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f17356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f17357d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f17358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17359f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Header[] f17360g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f17361h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f17362i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17363j;

        public Writer(int i10, boolean z10, c cVar) {
            r.f(cVar, "out");
            this.f17354a = i10;
            this.f17355b = z10;
            this.f17356c = cVar;
            this.f17357d = a.e.API_PRIORITY_OTHER;
            this.f17359f = i10;
            this.f17360g = new Header[8];
            this.f17361h = r2.length - 1;
        }

        public /* synthetic */ Writer(int i10, boolean z10, c cVar, int i11, j jVar) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, cVar);
        }

        private final void a() {
            int i10 = this.f17359f;
            int i11 = this.f17363j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            o.t(this.f17360g, null, 0, 0, 6, null);
            this.f17361h = this.f17360g.length - 1;
            this.f17362i = 0;
            this.f17363j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f17360g.length;
                while (true) {
                    length--;
                    i11 = this.f17361h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    Header header = this.f17360g[length];
                    r.c(header);
                    i10 -= header.f17342c;
                    int i13 = this.f17363j;
                    Header header2 = this.f17360g[length];
                    r.c(header2);
                    this.f17363j = i13 - header2.f17342c;
                    this.f17362i--;
                    i12++;
                }
                Header[] headerArr = this.f17360g;
                System.arraycopy(headerArr, i11 + 1, headerArr, i11 + 1 + i12, this.f17362i);
                Header[] headerArr2 = this.f17360g;
                int i14 = this.f17361h;
                Arrays.fill(headerArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f17361h += i12;
            }
            return i12;
        }

        private final void d(Header header) {
            int i10 = header.f17342c;
            int i11 = this.f17359f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f17363j + i10) - i11);
            int i12 = this.f17362i + 1;
            Header[] headerArr = this.f17360g;
            if (i12 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f17361h = this.f17360g.length - 1;
                this.f17360g = headerArr2;
            }
            int i13 = this.f17361h;
            this.f17361h = i13 - 1;
            this.f17360g[i13] = header;
            this.f17362i++;
            this.f17363j += i10;
        }

        public final void e(int i10) {
            this.f17354a = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f17359f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f17357d = Math.min(this.f17357d, iMin);
            }
            this.f17358e = true;
            this.f17359f = iMin;
            a();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void f(hf.f r5) {
            /*
                r4 = this;
                java.lang.String r0 = "data"
                ae.r.f(r5, r0)
                boolean r0 = r4.f17355b
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == 0) goto L2a
                okhttp3.internal.http2.Huffman r0 = okhttp3.internal.http2.Huffman.f17522a
                int r2 = r0.d(r5)
                int r3 = r5.F()
                if (r2 >= r3) goto L2a
                hf.c r2 = new hf.c
                r2.<init>()
                r0.c(r5, r2)
                hf.f r5 = r2.k0()
                int r0 = r5.F()
                r2 = 128(0x80, float:1.8E-43)
                goto L2f
            L2a:
                int r0 = r5.F()
                r2 = 0
            L2f:
                r4.h(r0, r1, r2)
                hf.c r0 = r4.f17356c
                r0.g(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.f(hf.f):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(java.util.List<okhttp3.internal.http2.Header> r15) {
            /*
                Method dump skipped, instruction units count: 267
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.g(java.util.List):void");
        }

        public final void h(int i10, int i11, int i12) {
            int i13;
            c cVar;
            if (i10 < i11) {
                cVar = this.f17356c;
                i13 = i10 | i12;
            } else {
                this.f17356c.writeByte(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f17356c.writeByte(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                cVar = this.f17356c;
            }
            cVar.writeByte(i13);
        }
    }

    static {
        Hpack hpack = new Hpack();
        f17343a = hpack;
        f fVar = Header.f17336g;
        f fVar2 = Header.f17337h;
        f fVar3 = Header.f17338i;
        f fVar4 = Header.f17335f;
        f17344b = new Header[]{new Header(Header.f17339j, ""), new Header(fVar, "GET"), new Header(fVar, "POST"), new Header(fVar2, "/"), new Header(fVar2, "/index.html"), new Header(fVar3, "http"), new Header(fVar3, "https"), new Header(fVar4, "200"), new Header(fVar4, "204"), new Header(fVar4, "206"), new Header(fVar4, "304"), new Header(fVar4, "400"), new Header(fVar4, "404"), new Header(fVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f17345c = hpack.d();
    }

    private Hpack() {
    }

    private final Map<f, Integer> d() {
        Header[] headerArr = f17344b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            Header[] headerArr2 = f17344b;
            if (!linkedHashMap.containsKey(headerArr2[i10].f17340a)) {
                linkedHashMap.put(headerArr2[i10].f17340a, Integer.valueOf(i10));
            }
            i10 = i11;
        }
        Map<f, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        r.e(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final f a(f fVar) throws IOException {
        r.f(fVar, "name");
        int iF = fVar.F();
        int i10 = 0;
        while (i10 < iF) {
            int i11 = i10 + 1;
            byte bJ = fVar.j(i10);
            if (65 <= bJ && bJ <= 90) {
                throw new IOException(r.m("PROTOCOL_ERROR response malformed: mixed case name: ", fVar.K()));
            }
            i10 = i11;
        }
        return fVar;
    }

    public final Map<f, Integer> b() {
        return f17345c;
    }

    public final Header[] c() {
        return f17344b;
    }
}
