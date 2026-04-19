package okhttp3.internal.http;

import ae.r;
import hf.c;
import hf.f;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import je.v;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpHeaders {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f17266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f f17267b;

    static {
        f.a aVar = f.f11960d;
        f17266a = aVar.d("\"\\");
        f17267b = aVar.d("\t ,=");
    }

    public static final List<Challenge> a(Headers headers, String str) {
        r.f(headers, "<this>");
        r.f(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            if (v.t(str, headers.f(i10), true)) {
                try {
                    c(new c().z(headers.n(i10)), arrayList);
                } catch (EOFException e10) {
                    Platform.f17567a.g().k("Unable to parse challenge", 5, e10);
                }
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static final boolean b(Response response) {
        r.f(response, "<this>");
        if (r.b(response.Y().h(), "HEAD")) {
            return false;
        }
        int iW = response.w();
        return (((iW >= 100 && iW < 200) || iW == 204 || iW == 304) && Util.u(response) == -1 && !v.t("chunked", Response.E(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0079, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0079, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(hf.c r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.q()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = nd.o0.e()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = okhttp3.internal.Util.K(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L5c
            if (r6 != 0) goto L40
            boolean r2 = r7.q()
            if (r2 == 0) goto L5c
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.String r4 = "="
            java.lang.String r4 = je.m.y(r4, r5)
            java.lang.String r3 = ae.r.m(r3, r4)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            ae.r.e(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L5c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.K(r7, r4)
            int r5 = r5 + r6
        L66:
            if (r3 != 0) goto L77
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 == 0) goto L73
            goto L79
        L73:
            int r5 = okhttp3.internal.Util.K(r7, r4)
        L77:
            if (r5 != 0) goto L84
        L79:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L84:
            r6 = 1
            if (r5 <= r6) goto L88
            return
        L88:
            boolean r6 = g(r7)
            if (r6 == 0) goto L8f
            return
        L8f:
            r6 = 34
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto L9c
            java.lang.String r6 = d(r7)
            goto La0
        L9c:
            java.lang.String r6 = e(r7)
        La0:
            if (r6 != 0) goto La3
            return
        La3:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lac
            return
        Lac:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lb9
            boolean r3 = r7.q()
            if (r3 != 0) goto Lb9
            return
        Lb9:
            r3 = r0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.c(hf.c, java.util.List):void");
    }

    private static final String d(c cVar) throws EOFException {
        if (!(cVar.readByte() == 34)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        c cVar2 = new c();
        while (true) {
            long jU = cVar.U(f17266a);
            if (jU == -1) {
                return null;
            }
            if (cVar.L(jU) == 34) {
                cVar2.v(cVar, jU);
                cVar.readByte();
                return cVar2.m0();
            }
            if (cVar.size() == jU + 1) {
                return null;
            }
            cVar2.v(cVar, jU);
            cVar.readByte();
            cVar2.v(cVar, 1L);
        }
    }

    private static final String e(c cVar) {
        long jU = cVar.U(f17267b);
        if (jU == -1) {
            jU = cVar.size();
        }
        if (jU != 0) {
            return cVar.c(jU);
        }
        return null;
    }

    public static final void f(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        r.f(cookieJar, "<this>");
        r.f(httpUrl, "url");
        r.f(headers, "headers");
        if (cookieJar == CookieJar.f16800b) {
            return;
        }
        List<Cookie> listE = Cookie.f16783j.e(httpUrl, headers);
        if (listE.isEmpty()) {
            return;
        }
        cookieJar.a(httpUrl, listE);
    }

    private static final boolean g(c cVar) throws EOFException {
        boolean z10 = false;
        while (!cVar.q()) {
            byte bL = cVar.L(0L);
            if (bL != 44) {
                if (!(bL == 32 || bL == 9)) {
                    break;
                }
                cVar.readByte();
            } else {
                cVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean h(c cVar, byte b10) {
        return !cVar.q() && cVar.L(0L) == b10;
    }
}
