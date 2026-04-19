package okhttp3.internal.cache;

import ae.j;
import ae.r;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import je.v;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheStrategy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f17038c = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Request f17039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Response f17040b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(okhttp3.Response r5, okhttp3.Request r6) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                ae.r.f(r5, r0)
                java.lang.String r0 = "request"
                ae.r.f(r6, r0)
                int r0 = r5.w()
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 0
                if (r0 == r1) goto L65
                r1 = 410(0x19a, float:5.75E-43)
                if (r0 == r1) goto L65
                r1 = 414(0x19e, float:5.8E-43)
                if (r0 == r1) goto L65
                r1 = 501(0x1f5, float:7.02E-43)
                if (r0 == r1) goto L65
                r1 = 203(0xcb, float:2.84E-43)
                if (r0 == r1) goto L65
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 == r1) goto L65
                r1 = 307(0x133, float:4.3E-43)
                if (r0 == r1) goto L3b
                r1 = 308(0x134, float:4.32E-43)
                if (r0 == r1) goto L65
                r1 = 404(0x194, float:5.66E-43)
                if (r0 == r1) goto L65
                r1 = 405(0x195, float:5.68E-43)
                if (r0 == r1) goto L65
                switch(r0) {
                    case 300: goto L65;
                    case 301: goto L65;
                    case 302: goto L3b;
                    default: goto L3a;
                }
            L3a:
                return r2
            L3b:
                r0 = 2
                java.lang.String r1 = "Expires"
                r3 = 0
                java.lang.String r0 = okhttp3.Response.E(r5, r1, r3, r0, r3)
                if (r0 != 0) goto L65
                okhttp3.CacheControl r0 = r5.b()
                int r0 = r0.d()
                r1 = -1
                if (r0 != r1) goto L65
                okhttp3.CacheControl r0 = r5.b()
                boolean r0 = r0.c()
                if (r0 != 0) goto L65
                okhttp3.CacheControl r0 = r5.b()
                boolean r0 = r0.b()
                if (r0 != 0) goto L65
                return r2
            L65:
                okhttp3.CacheControl r5 = r5.b()
                boolean r5 = r5.i()
                if (r5 != 0) goto L7a
                okhttp3.CacheControl r5 = r6.b()
                boolean r5 = r5.i()
                if (r5 != 0) goto L7a
                r2 = 1
            L7a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheStrategy.Companion.a(okhttp3.Response, okhttp3.Request):boolean");
        }
    }

    public static final class Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f17041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Request f17042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Response f17043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Date f17044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f17045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Date f17046f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f17047g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Date f17048h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f17049i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f17050j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f17051k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f17052l;

        public Factory(long j10, Request request, Response response) {
            r.f(request, "request");
            this.f17041a = j10;
            this.f17042b = request;
            this.f17043c = response;
            this.f17052l = -1;
            if (response != null) {
                this.f17049i = response.Z();
                this.f17050j = response.U();
                Headers headersG = response.G();
                int i10 = 0;
                int size = headersG.size();
                while (i10 < size) {
                    int i11 = i10 + 1;
                    String strF = headersG.f(i10);
                    String strN = headersG.n(i10);
                    if (v.t(strF, "Date", true)) {
                        this.f17044d = DatesKt.a(strN);
                        this.f17045e = strN;
                    } else if (v.t(strF, "Expires", true)) {
                        this.f17048h = DatesKt.a(strN);
                    } else if (v.t(strF, "Last-Modified", true)) {
                        this.f17046f = DatesKt.a(strN);
                        this.f17047g = strN;
                    } else if (v.t(strF, "ETag", true)) {
                        this.f17051k = strN;
                    } else if (v.t(strF, "Age", true)) {
                        this.f17052l = Util.X(strN, -1);
                    }
                    i10 = i11;
                }
            }
        }

        private final long a() {
            Date date = this.f17044d;
            long jMax = date != null ? Math.max(0L, this.f17050j - date.getTime()) : 0L;
            int i10 = this.f17052l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f17050j;
            return jMax + (j10 - this.f17049i) + (this.f17041a - j10);
        }

        private final CacheStrategy c() {
            if (this.f17043c == null) {
                return new CacheStrategy(this.f17042b, null);
            }
            if ((!this.f17042b.g() || this.f17043c.A() != null) && CacheStrategy.f17038c.a(this.f17043c, this.f17042b)) {
                CacheControl cacheControlB = this.f17042b.b();
                if (cacheControlB.h() || e(this.f17042b)) {
                    return new CacheStrategy(this.f17042b, null);
                }
                CacheControl cacheControlB2 = this.f17043c.b();
                long jA = a();
                long jD = d();
                if (cacheControlB.d() != -1) {
                    jD = Math.min(jD, TimeUnit.SECONDS.toMillis(cacheControlB.d()));
                }
                long millis = 0;
                long millis2 = cacheControlB.f() != -1 ? TimeUnit.SECONDS.toMillis(cacheControlB.f()) : 0L;
                if (!cacheControlB2.g() && cacheControlB.e() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(cacheControlB.e());
                }
                if (!cacheControlB2.h()) {
                    long j10 = millis2 + jA;
                    if (j10 < millis + jD) {
                        Response.Builder builderM = this.f17043c.M();
                        if (j10 >= jD) {
                            builderM.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jA > 86400000 && f()) {
                            builderM.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new CacheStrategy(null, builderM.c());
                    }
                }
                String str = this.f17051k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f17046f != null) {
                    str = this.f17047g;
                } else {
                    if (this.f17044d == null) {
                        return new CacheStrategy(this.f17042b, null);
                    }
                    str = this.f17045e;
                }
                Headers.Builder builderL = this.f17042b.f().l();
                r.c(str);
                builderL.c(str2, str);
                return new CacheStrategy(this.f17042b.i().g(builderL.e()).b(), this.f17043c);
            }
            return new CacheStrategy(this.f17042b, null);
        }

        private final long d() {
            Long lValueOf;
            Response response = this.f17043c;
            r.c(response);
            if (response.b().d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.d());
            }
            Date date = this.f17048h;
            if (date != null) {
                Date date2 = this.f17044d;
                lValueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
                long time = date.getTime() - (lValueOf == null ? this.f17050j : lValueOf.longValue());
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f17046f == null || this.f17043c.Y().j().m() != null) {
                return 0L;
            }
            Date date3 = this.f17044d;
            lValueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
            long jLongValue = lValueOf == null ? this.f17049i : lValueOf.longValue();
            Date date4 = this.f17046f;
            r.c(date4);
            long time2 = jLongValue - date4.getTime();
            if (time2 > 0) {
                return time2 / ((long) 10);
            }
            return 0L;
        }

        private final boolean e(Request request) {
            return (request.d("If-Modified-Since") == null && request.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            Response response = this.f17043c;
            r.c(response);
            return response.b().d() == -1 && this.f17048h == null;
        }

        public final CacheStrategy b() {
            CacheStrategy cacheStrategyC = c();
            return (cacheStrategyC.b() == null || !this.f17042b.b().k()) ? cacheStrategyC : new CacheStrategy(null, null);
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.f17039a = request;
        this.f17040b = response;
    }

    public final Response a() {
        return this.f17040b;
    }

    public final Request b() {
        return this.f17039a;
    }
}
