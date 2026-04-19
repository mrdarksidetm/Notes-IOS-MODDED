package okhttp3;

import ae.j;
import ae.m0;
import ae.r;
import hf.c;
import hf.d;
import hf.e;
import hf.f;
import hf.g0;
import hf.i0;
import hf.l;
import hf.m;
import hf.u;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import je.v;
import je.w;
import nd.y0;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import xd.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Cache implements Closeable, Flushable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Companion f16623g = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DiskLruCache f16624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16629f;

    private static final class CacheResponseBody extends ResponseBody {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DiskLruCache.Snapshot f16630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f16631c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f16632d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e f16633e;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            r.f(snapshot, "snapshot");
            this.f16630b = snapshot;
            this.f16631c = str;
            this.f16632d = str2;
            this.f16633e = u.d(new m(this) { // from class: okhttp3.Cache.CacheResponseBody.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ CacheResponseBody f16635c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this.f16634b);
                    this.f16635c = this;
                }

                @Override // hf.m, hf.i0, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    this.f16635c.o().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long a() {
            String str = this.f16632d;
            if (str == null) {
                return -1L;
            }
            return Util.W(str, -1L);
        }

        @Override // okhttp3.ResponseBody
        public MediaType b() {
            String str = this.f16631c;
            if (str == null) {
                return null;
            }
            return MediaType.f16856e.b(str);
        }

        @Override // okhttp3.ResponseBody
        public e l() {
            return this.f16633e;
        }

        public final DiskLruCache.Snapshot o() {
            return this.f16630b;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final Set<String> d(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                if (v.t("Vary", headers.f(i10), true)) {
                    String strN = headers.n(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(v.u(m0.f720a));
                    }
                    Iterator it = w.B0(strN, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(w.W0((String) it.next()).toString());
                    }
                }
                i10 = i11;
            }
            return treeSet == null ? y0.b() : treeSet;
        }

        private final Headers e(Headers headers, Headers headers2) {
            Set<String> setD = d(headers2);
            if (setD.isEmpty()) {
                return Util.f17022b;
            }
            Headers.Builder builder = new Headers.Builder();
            int i10 = 0;
            int size = headers.size();
            while (i10 < size) {
                int i11 = i10 + 1;
                String strF = headers.f(i10);
                if (setD.contains(strF)) {
                    builder.a(strF, headers.n(i10));
                }
                i10 = i11;
            }
            return builder.e();
        }

        public final boolean a(Response response) {
            r.f(response, "<this>");
            return d(response.G()).contains("*");
        }

        public final String b(HttpUrl httpUrl) {
            r.f(httpUrl, "url");
            return f.f11960d.d(httpUrl.toString()).y().p();
        }

        public final int c(e eVar) throws IOException {
            r.f(eVar, "source");
            try {
                long jT = eVar.t();
                String strJ = eVar.J();
                if (jT >= 0 && jT <= 2147483647L) {
                    if (!(strJ.length() > 0)) {
                        return (int) jT;
                    }
                }
                throw new IOException("expected an int but was \"" + jT + strJ + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final Headers f(Response response) {
            r.f(response, "<this>");
            Response responseL = response.L();
            r.c(responseL);
            return e(responseL.Y().f(), response.G());
        }

        public final boolean g(Response response, Headers headers, Request request) {
            r.f(response, "cachedResponse");
            r.f(headers, "cachedRequest");
            r.f(request, "newRequest");
            Set<String> setD = d(response.G());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!r.b(headers.o(str), request.e(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    private static final class Entry {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final Companion f16636k = new Companion(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f16637l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f16638m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HttpUrl f16639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Headers f16640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f16641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Protocol f16642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f16643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f16644f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Headers f16645g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Handshake f16646h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f16647i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f16648j;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(j jVar) {
                this();
            }
        }

        static {
            Platform.Companion companion = Platform.f17567a;
            f16637l = r.m(companion.g().g(), "-Sent-Millis");
            f16638m = r.m(companion.g().g(), "-Received-Millis");
        }

        public Entry(i0 i0Var) throws IOException {
            r.f(i0Var, "rawSource");
            try {
                e eVarD = u.d(i0Var);
                String strJ = eVarD.J();
                HttpUrl httpUrlF = HttpUrl.f16833k.f(strJ);
                if (httpUrlF == null) {
                    IOException iOException = new IOException(r.m("Cache corruption for ", strJ));
                    Platform.f17567a.g().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.f16639a = httpUrlF;
                this.f16641c = eVarD.J();
                Headers.Builder builder = new Headers.Builder();
                int iC = Cache.f16623g.c(eVarD);
                int i10 = 0;
                while (i10 < iC) {
                    i10++;
                    builder.b(eVarD.J());
                }
                this.f16640b = builder.e();
                StatusLine statusLineA = StatusLine.f17284d.a(eVarD.J());
                this.f16642d = statusLineA.f17285a;
                this.f16643e = statusLineA.f17286b;
                this.f16644f = statusLineA.f17287c;
                Headers.Builder builder2 = new Headers.Builder();
                int iC2 = Cache.f16623g.c(eVarD);
                int i11 = 0;
                while (i11 < iC2) {
                    i11++;
                    builder2.b(eVarD.J());
                }
                String str = f16637l;
                String strF = builder2.f(str);
                String str2 = f16638m;
                String strF2 = builder2.f(str2);
                builder2.h(str);
                builder2.h(str2);
                long j10 = 0;
                this.f16647i = strF == null ? 0L : Long.parseLong(strF);
                if (strF2 != null) {
                    j10 = Long.parseLong(strF2);
                }
                this.f16648j = j10;
                this.f16645g = builder2.e();
                if (a()) {
                    String strJ2 = eVarD.J();
                    if (strJ2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strJ2 + '\"');
                    }
                    this.f16646h = Handshake.f16822e.b(!eVarD.q() ? TlsVersion.f17013b.a(eVarD.J()) : TlsVersion.SSL_3_0, CipherSuite.f16698b.b(eVarD.J()), c(eVarD), c(eVarD));
                } else {
                    this.f16646h = null;
                }
                md.i0 i0Var2 = md.i0.f15558a;
                b.a(i0Var, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.a(i0Var, th);
                    throw th2;
                }
            }
        }

        public Entry(Response response) {
            r.f(response, "response");
            this.f16639a = response.Y().j();
            this.f16640b = Cache.f16623g.f(response);
            this.f16641c = response.Y().h();
            this.f16642d = response.Q();
            this.f16643e = response.w();
            this.f16644f = response.I();
            this.f16645g = response.G();
            this.f16646h = response.A();
            this.f16647i = response.Z();
            this.f16648j = response.U();
        }

        private final boolean a() {
            return r.b(this.f16639a.p(), "https");
        }

        private final List<Certificate> c(e eVar) throws IOException {
            int iC = Cache.f16623g.c(eVar);
            if (iC == -1) {
                return nd.u.m();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                int i10 = 0;
                while (i10 < iC) {
                    i10++;
                    String strJ = eVar.J();
                    c cVar = new c();
                    f fVarA = f.f11960d.a(strJ);
                    r.c(fVarA);
                    cVar.g(fVarA);
                    arrayList.add(certificateFactory.generateCertificate(cVar.f0()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(d dVar, List<? extends Certificate> list) throws IOException {
            try {
                dVar.c0(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    f.a aVar = f.f11960d;
                    r.e(encoded, "bytes");
                    dVar.z(f.a.f(aVar, encoded, 0, 0, 3, null).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(Request request, Response response) {
            r.f(request, "request");
            r.f(response, "response");
            return r.b(this.f16639a, request.j()) && r.b(this.f16641c, request.h()) && Cache.f16623g.g(response, this.f16640b, request);
        }

        public final Response d(DiskLruCache.Snapshot snapshot) {
            r.f(snapshot, "snapshot");
            String strA = this.f16645g.a("Content-Type");
            String strA2 = this.f16645g.a("Content-Length");
            return new Response.Builder().s(new Request.Builder().q(this.f16639a).h(this.f16641c, null).g(this.f16640b).b()).q(this.f16642d).g(this.f16643e).n(this.f16644f).l(this.f16645g).b(new CacheResponseBody(snapshot, strA, strA2)).j(this.f16646h).t(this.f16647i).r(this.f16648j).c();
        }

        public final void f(DiskLruCache.Editor editor) throws IOException {
            r.f(editor, "editor");
            d dVarC = u.c(editor.f(0));
            try {
                dVarC.z(this.f16639a.toString()).writeByte(10);
                dVarC.z(this.f16641c).writeByte(10);
                dVarC.c0(this.f16640b.size()).writeByte(10);
                int size = this.f16640b.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    dVarC.z(this.f16640b.f(i10)).z(": ").z(this.f16640b.n(i10)).writeByte(10);
                    i10 = i11;
                }
                dVarC.z(new StatusLine(this.f16642d, this.f16643e, this.f16644f).toString()).writeByte(10);
                dVarC.c0(this.f16645g.size() + 2).writeByte(10);
                int size2 = this.f16645g.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    dVarC.z(this.f16645g.f(i12)).z(": ").z(this.f16645g.n(i12)).writeByte(10);
                }
                dVarC.z(f16637l).z(": ").c0(this.f16647i).writeByte(10);
                dVarC.z(f16638m).z(": ").c0(this.f16648j).writeByte(10);
                if (a()) {
                    dVarC.writeByte(10);
                    Handshake handshake = this.f16646h;
                    r.c(handshake);
                    dVarC.z(handshake.a().c()).writeByte(10);
                    e(dVarC, this.f16646h.d());
                    e(dVarC, this.f16646h.c());
                    dVarC.z(this.f16646h.e().b()).writeByte(10);
                }
                md.i0 i0Var = md.i0.f15558a;
                b.a(dVarC, null);
            } finally {
            }
        }
    }

    private final class RealCacheRequest implements CacheRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DiskLruCache.Editor f16649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g0 f16650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g0 f16651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f16652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Cache f16653e;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            r.f(cache, "this$0");
            r.f(editor, "editor");
            this.f16653e = cache;
            this.f16649a = editor;
            g0 g0VarF = editor.f(1);
            this.f16650b = g0VarF;
            this.f16651c = new l(g0VarF) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // hf.l, hf.g0, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    Cache cache2 = cache;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.d()) {
                            return;
                        }
                        realCacheRequest.e(true);
                        cache2.C(cache2.o() + 1);
                        super.close();
                        this.f16649a.b();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void a() {
            Cache cache = this.f16653e;
            synchronized (cache) {
                if (d()) {
                    return;
                }
                e(true);
                cache.A(cache.l() + 1);
                Util.l(this.f16650b);
                try {
                    this.f16649a.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public g0 b() {
            return this.f16651c;
        }

        public final boolean d() {
            return this.f16652d;
        }

        public final void e(boolean z10) {
            this.f16652d = z10;
        }
    }

    private final void a(DiskLruCache.Editor editor) {
        if (editor == null) {
            return;
        }
        try {
            editor.a();
        } catch (IOException unused) {
        }
    }

    public final void A(int i10) {
        this.f16626c = i10;
    }

    public final void C(int i10) {
        this.f16625b = i10;
    }

    public final synchronized void E() {
        this.f16628e++;
    }

    public final synchronized void G(CacheStrategy cacheStrategy) {
        r.f(cacheStrategy, "cacheStrategy");
        this.f16629f++;
        if (cacheStrategy.b() != null) {
            this.f16627d++;
        } else if (cacheStrategy.a() != null) {
            this.f16628e++;
        }
    }

    public final void H(Response response, Response response2) {
        r.f(response, "cached");
        r.f(response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody responseBodyA = response.a();
        if (responseBodyA == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        DiskLruCache.Editor editorA = null;
        try {
            editorA = ((CacheResponseBody) responseBodyA).o().a();
            if (editorA == null) {
                return;
            }
            entry.f(editorA);
            editorA.b();
        } catch (IOException unused) {
            a(editorA);
        }
    }

    public final Response b(Request request) {
        r.f(request, "request");
        try {
            DiskLruCache.Snapshot snapshotM = this.f16624a.M(f16623g.b(request.j()));
            if (snapshotM == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshotM.b(0));
                Response responseD = entry.d(snapshotM);
                if (entry.b(request, responseD)) {
                    return responseD;
                }
                ResponseBody responseBodyA = responseD.a();
                if (responseBodyA != null) {
                    Util.l(responseBodyA);
                }
                return null;
            } catch (IOException unused) {
                Util.l(snapshotM);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16624a.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f16624a.flush();
    }

    public final int l() {
        return this.f16626c;
    }

    public final int o() {
        return this.f16625b;
    }

    public final CacheRequest w(Response response) {
        DiskLruCache.Editor editorL;
        r.f(response, "response");
        String strH = response.Y().h();
        if (HttpMethod.f17268a.a(response.Y().h())) {
            try {
                y(response.Y());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!r.b(strH, "GET")) {
            return null;
        }
        Companion companion = f16623g;
        if (companion.a(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editorL = DiskLruCache.L(this.f16624a, companion.b(response.Y().j()), 0L, 2, null);
            if (editorL == null) {
                return null;
            }
            try {
                entry.f(editorL);
                return new RealCacheRequest(this, editorL);
            } catch (IOException unused2) {
                a(editorL);
                return null;
            }
        } catch (IOException unused3) {
            editorL = null;
        }
    }

    public final void y(Request request) {
        r.f(request, "request");
        this.f16624a.n0(f16623g.b(request.j()));
    }
}
