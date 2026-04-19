package i6;

import ae.j;
import ae.r;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import je.v;
import o6.u;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12569c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Request f12570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i6.a f12571b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        private final boolean d(String str) {
            return v.t("Content-Length", str, true) || v.t("Content-Encoding", str, true) || v.t("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return (v.t("Connection", str, true) || v.t("Keep-Alive", str, true) || v.t("Proxy-Authenticate", str, true) || v.t("Proxy-Authorization", str, true) || v.t("TE", str, true) || v.t("Trailers", str, true) || v.t("Transfer-Encoding", str, true) || v.t("Upgrade", str, true)) ? false : true;
        }

        public final Headers a(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strF = headers.f(i10);
                String strN = headers.n(i10);
                if ((!v.t("Warning", strF, true) || !v.G(strN, "1", false, 2, null)) && (d(strF) || !e(strF) || headers2.a(strF) == null)) {
                    builder.a(strF, strN);
                }
            }
            int size2 = headers2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strF2 = headers2.f(i11);
                if (!d(strF2) && e(strF2)) {
                    builder.a(strF2, headers2.n(i11));
                }
            }
            return builder.e();
        }

        public final boolean b(Request request, i6.a aVar) {
            return (request.b().i() || aVar.a().i() || r.b(aVar.d().a("Vary"), "*")) ? false : true;
        }

        public final boolean c(Request request, Response response) {
            return (request.b().i() || response.b().i() || r.b(response.G().a("Vary"), "*")) ? false : true;
        }
    }

    /* JADX INFO: renamed from: i6.b$b, reason: collision with other inner class name */
    public static final class C0301b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Request f12572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i6.a f12573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Date f12574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f12575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Date f12576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f12577f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Date f12578g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f12579h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f12580i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f12581j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f12582k;

        public C0301b(Request request, i6.a aVar) {
            this.f12572a = request;
            this.f12573b = aVar;
            this.f12582k = -1;
            if (aVar != null) {
                this.f12579h = aVar.e();
                this.f12580i = aVar.c();
                Headers headersD = aVar.d();
                int size = headersD.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String strF = headersD.f(i10);
                    if (v.t(strF, "Date", true)) {
                        this.f12574c = headersD.d("Date");
                        this.f12575d = headersD.n(i10);
                    } else if (v.t(strF, "Expires", true)) {
                        this.f12578g = headersD.d("Expires");
                    } else if (v.t(strF, "Last-Modified", true)) {
                        this.f12576e = headersD.d("Last-Modified");
                        this.f12577f = headersD.n(i10);
                    } else if (v.t(strF, "ETag", true)) {
                        this.f12581j = headersD.n(i10);
                    } else if (v.t(strF, "Age", true)) {
                        this.f12582k = o6.j.A(headersD.n(i10), -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f12574c;
            long jMax = date != null ? Math.max(0L, this.f12580i - date.getTime()) : 0L;
            int i10 = this.f12582k;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            return jMax + (this.f12580i - this.f12579h) + (u.f16412a.a() - this.f12580i);
        }

        private final long c() {
            i6.a aVar = this.f12573b;
            r.c(aVar);
            if (aVar.a().d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.d());
            }
            Date date = this.f12578g;
            if (date != null) {
                Date date2 = this.f12574c;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f12580i);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f12576e == null || this.f12572a.j().m() != null) {
                return 0L;
            }
            Date date3 = this.f12574c;
            long time2 = date3 != null ? date3.getTime() : this.f12579h;
            Date date4 = this.f12576e;
            r.c(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / ((long) 10);
            }
            return 0L;
        }

        private final boolean d(Request request) {
            return (request.d("If-Modified-Since") == null && request.d("If-None-Match") == null) ? false : true;
        }

        public final b b() {
            i6.a aVar = null;
            byte b10 = 0;
            byte b11 = 0;
            byte b12 = 0;
            byte b13 = 0;
            byte b14 = 0;
            byte b15 = 0;
            byte b16 = 0;
            byte b17 = 0;
            byte b18 = 0;
            byte b19 = 0;
            byte b20 = 0;
            byte b21 = 0;
            if (this.f12573b == null) {
                return new b(this.f12572a, aVar, b21 == true ? 1 : 0);
            }
            if (this.f12572a.g() && !this.f12573b.f()) {
                return new b(this.f12572a, b20 == true ? 1 : 0, b19 == true ? 1 : 0);
            }
            CacheControl cacheControlA = this.f12573b.a();
            if (!b.f12569c.b(this.f12572a, this.f12573b)) {
                return new b(this.f12572a, b18 == true ? 1 : 0, b17 == true ? 1 : 0);
            }
            CacheControl cacheControlB = this.f12572a.b();
            if (cacheControlB.h() || d(this.f12572a)) {
                return new b(this.f12572a, b11 == true ? 1 : 0, b10 == true ? 1 : 0);
            }
            long jA = a();
            long jC = c();
            if (cacheControlB.d() != -1) {
                jC = Math.min(jC, TimeUnit.SECONDS.toMillis(cacheControlB.d()));
            }
            long millis = 0;
            long millis2 = cacheControlB.f() != -1 ? TimeUnit.SECONDS.toMillis(cacheControlB.f()) : 0L;
            if (!cacheControlA.g() && cacheControlB.e() != -1) {
                millis = TimeUnit.SECONDS.toMillis(cacheControlB.e());
            }
            if (!cacheControlA.h() && jA + millis2 < jC + millis) {
                return new b(b16 == true ? 1 : 0, this.f12573b, b15 == true ? 1 : 0);
            }
            String str = this.f12581j;
            String str2 = "If-Modified-Since";
            if (str != null) {
                r.c(str);
                str2 = "If-None-Match";
            } else {
                if (this.f12576e != null) {
                    str = this.f12577f;
                } else {
                    if (this.f12574c == null) {
                        return new b(this.f12572a, b13 == true ? 1 : 0, b12 == true ? 1 : 0);
                    }
                    str = this.f12575d;
                }
                r.c(str);
            }
            return new b(this.f12572a.i().a(str2, str).b(), this.f12573b, b14 == true ? 1 : 0);
        }
    }

    private b(Request request, i6.a aVar) {
        this.f12570a = request;
        this.f12571b = aVar;
    }

    public /* synthetic */ b(Request request, i6.a aVar, j jVar) {
        this(request, aVar);
    }

    public final i6.a a() {
        return this.f12571b;
    }

    public final Request b() {
        return this.f12570a;
    }
}
