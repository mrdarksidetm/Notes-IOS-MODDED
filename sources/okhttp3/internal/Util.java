package okhttp3.internal;

import ae.m0;
import ae.r;
import com.google.android.gms.common.api.a;
import com.revenuecat.purchases.common.Constants;
import ge.i;
import ge.o;
import hf.c;
import hf.e;
import hf.f;
import hf.g0;
import hf.x;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import je.d;
import je.j;
import je.v;
import je.w;
import md.i0;
import nd.c0;
import nd.l0;
import nd.p;
import nd.r0;
import nd.u;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import xd.b;

/* JADX INFO: loaded from: classes2.dex */
public final class Util {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f17021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Headers f17022b = Headers.f16830b.g(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ResponseBody f17023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final RequestBody f17024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final x f17025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final TimeZone f17026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final j f17027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f17028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f17029i;

    static {
        byte[] bArr = new byte[0];
        f17021a = bArr;
        f17023c = ResponseBody.Companion.c(ResponseBody.f17002a, bArr, null, 1, null);
        f17024d = RequestBody.Companion.b(RequestBody.f16966a, bArr, null, 0, 0, 7, null);
        x.a aVar = x.f12022d;
        f.a aVar2 = f.f11960d;
        f17025e = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        r.c(timeZone);
        f17026f = timeZone;
        f17027g = new j("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f17028h = false;
        String name = OkHttpClient.class.getName();
        r.e(name, "OkHttpClient::class.java.name");
        f17029i = w.s0(w.r0(name, "okhttp3."), "Client");
    }

    public static final int A(String str, int i10, int i11) {
        r.f(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                int i13 = i12 - 1;
                char cCharAt = str.charAt(i12);
                if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12 = i13;
            }
        }
        return i10;
    }

    public static /* synthetic */ int B(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return A(str, i10, i11);
    }

    public static final int C(String str, int i10) {
        r.f(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10 = i11;
        }
        return str.length();
    }

    public static final String[] D(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        r.f(strArr, "<this>");
        r.f(strArr2, "other");
        r.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            i10++;
            int length2 = strArr2.length;
            int i11 = 0;
            while (true) {
                if (i11 < length2) {
                    String str2 = strArr2[i11];
                    i11++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean E(FileSystem fileSystem, File file) throws IOException {
        r.f(fileSystem, "<this>");
        r.f(file, "file");
        g0 g0VarB = fileSystem.b(file);
        try {
            try {
                fileSystem.f(file);
                b.a(g0VarB, null);
                return true;
            } finally {
            }
        } catch (IOException unused) {
            i0 i0Var = i0.f15558a;
            b.a(g0VarB, null);
            fileSystem.f(file);
            return false;
        }
    }

    public static final boolean F(Socket socket, e eVar) {
        r.f(socket, "<this>");
        r.f(eVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z10 = !eVar.q();
                socket.setSoTimeout(soTimeout);
                return z10;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean G(String str) {
        r.f(str, "name");
        return v.t(str, "Authorization", true) || v.t(str, "Cookie", true) || v.t(str, "Proxy-Authorization", true) || v.t(str, "Set-Cookie", true);
    }

    public static final int H(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (!('a' <= c10 && c10 < 'g')) {
            c11 = 'A';
            if (!('A' <= c10 && c10 < 'G')) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final Charset I(e eVar, Charset charset) {
        Charset charset2;
        String str;
        r.f(eVar, "<this>");
        r.f(charset, "default");
        int iM = eVar.m(f17025e);
        if (iM == -1) {
            return charset;
        }
        if (iM == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (iM == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else {
            if (iM != 2) {
                if (iM == 3) {
                    return d.f14190a.a();
                }
                if (iM == 4) {
                    return d.f14190a.b();
                }
                throw new AssertionError();
            }
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        r.e(charset2, str);
        return charset2;
    }

    public static final int J(e eVar) {
        r.f(eVar, "<this>");
        return d(eVar.readByte(), 255) | (d(eVar.readByte(), 255) << 16) | (d(eVar.readByte(), 255) << 8);
    }

    public static final int K(c cVar, byte b10) throws EOFException {
        r.f(cVar, "<this>");
        int i10 = 0;
        while (!cVar.q() && cVar.L(0L) == b10) {
            i10++;
            cVar.readByte();
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[PHI: r12
  0x005b: PHI (r12v6 boolean) = (r12v5 boolean), (r12v10 boolean) binds: [B:23:0x0079, B:13:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean L(hf.i0 r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            java.lang.String r0 = "<this>"
            ae.r.f(r11, r0)
            java.lang.String r0 = "timeUnit"
            ae.r.f(r13, r0)
            long r0 = java.lang.System.nanoTime()
            hf.j0 r2 = r11.e()
            boolean r2 = r2.e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            hf.j0 r2 = r11.e()
            long r5 = r2.c()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            hf.j0 r2 = r11.e()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.d(r12)
            hf.c r12 = new hf.c     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L76
            r12.<init>()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L76
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.X(r12, r7)     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L76
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L4e
            r12.b()     // Catch: java.lang.Throwable -> L64 java.io.InterruptedIOException -> L76
            goto L3e
        L4e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
        L53:
            hf.j0 r11 = r11.e()
            r11.a()
            goto L7c
        L5b:
            hf.j0 r11 = r11.e()
            long r0 = r0 + r5
            r11.d(r0)
            goto L7c
        L64:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            hf.j0 r11 = r11.e()
            if (r13 != 0) goto L71
            r11.a()
            goto L75
        L71:
            long r0 = r0 + r5
            r11.d(r0)
        L75:
            throw r12
        L76:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5b
            goto L53
        L7c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.L(hf.i0, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory M(final String str, final boolean z10) {
        r.f(str, "name");
        return new ThreadFactory() { // from class: ff.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.N(str, z10, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread N(String str, boolean z10, Runnable runnable) {
        r.f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List<Header> O(Headers headers) {
        r.f(headers, "<this>");
        i iVarT = o.t(0, headers.size());
        ArrayList arrayList = new ArrayList(nd.v.x(iVarT, 10));
        Iterator<Integer> it = iVarT.iterator();
        while (it.hasNext()) {
            int iNextInt = ((l0) it).nextInt();
            arrayList.add(new Header(headers.f(iNextInt), headers.n(iNextInt)));
        }
        return arrayList;
    }

    public static final Headers P(List<Header> list) {
        r.f(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.c(header.a().K(), header.b().K());
        }
        return builder.e();
    }

    public static final String Q(int i10) {
        String hexString = Integer.toHexString(i10);
        r.e(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String R(long j10) {
        String hexString = Long.toHexString(j10);
        r.e(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String S(HttpUrl httpUrl, boolean z10) {
        String strH;
        r.f(httpUrl, "<this>");
        if (w.L(httpUrl.h(), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, false, 2, null)) {
            strH = '[' + httpUrl.h() + ']';
        } else {
            strH = httpUrl.h();
        }
        if (!z10 && httpUrl.l() == HttpUrl.f16833k.c(httpUrl.p())) {
            return strH;
        }
        return strH + ':' + httpUrl.l();
    }

    public static /* synthetic */ String T(HttpUrl httpUrl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return S(httpUrl, z10);
    }

    public static final <T> List<T> U(List<? extends T> list) {
        r.f(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(c0.F0(list));
        r.e(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> V(Map<K, ? extends V> map) {
        r.f(map, "<this>");
        if (map.isEmpty()) {
            return r0.e();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        r.e(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long W(String str, long j10) {
        r.f(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int X(String str, int i10) {
        Long lValueOf;
        if (str == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        if (lValueOf == null) {
            return i10;
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (jLongValue < 0) {
            return 0;
        }
        return (int) jLongValue;
    }

    public static final String Y(String str, int i10, int i11) {
        r.f(str, "<this>");
        int iY = y(str, i10, i11);
        String strSubstring = str.substring(iY, A(str, iY, i11));
        r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String Z(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return Y(str, i10, i11);
    }

    public static final Throwable a0(Exception exc, List<? extends Exception> list) {
        r.f(exc, "<this>");
        r.f(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            md.f.a(exc, it.next());
        }
        return exc;
    }

    public static final void b0(hf.d dVar, int i10) {
        r.f(dVar, "<this>");
        dVar.writeByte((i10 >>> 16) & 255);
        dVar.writeByte((i10 >>> 8) & 255);
        dVar.writeByte(i10 & 255);
    }

    public static final <E> void c(List<E> list, E e10) {
        r.f(list, "<this>");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    public static final long f(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final EventListener.Factory g(final EventListener eventListener) {
        r.f(eventListener, "<this>");
        return new EventListener.Factory() { // from class: ff.b
            @Override // okhttp3.EventListener.Factory
            public final EventListener a(Call call) {
                return Util.h(eventListener, call);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener h(EventListener eventListener, Call call) {
        r.f(eventListener, "$this_asFactory");
        r.f(call, "it");
        return eventListener;
    }

    public static final boolean i(String str) {
        r.f(str, "<this>");
        return f17027g.e(str);
    }

    public static final boolean j(HttpUrl httpUrl, HttpUrl httpUrl2) {
        r.f(httpUrl, "<this>");
        r.f(httpUrl2, "other");
        return r.b(httpUrl.h(), httpUrl2.h()) && httpUrl.l() == httpUrl2.l() && r.b(httpUrl.p(), httpUrl2.p());
    }

    public static final void k(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void l(Closeable closeable) {
        r.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void m(Socket socket) {
        r.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!r.b(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] n(String[] strArr, String str) {
        r.f(strArr, "<this>");
        r.f(str, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        r.e(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[p.Q(strArr2)] = str;
        return strArr2;
    }

    public static final int o(String str, char c10, int i10, int i11) {
        r.f(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static final int p(String str, String str2, int i10, int i11) {
        r.f(str, "<this>");
        r.f(str2, "delimiters");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (w.K(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static /* synthetic */ int q(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return o(str, c10, i10, i11);
    }

    public static final boolean r(hf.i0 i0Var, int i10, TimeUnit timeUnit) {
        r.f(i0Var, "<this>");
        r.f(timeUnit, "timeUnit");
        try {
            return L(i0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String s(String str, Object... objArr) {
        r.f(str, "format");
        r.f(objArr, "args");
        m0 m0Var = m0.f720a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        r.e(str2, "format(locale, format, *args)");
        return str2;
    }

    public static final boolean t(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        r.f(strArr, "<this>");
        r.f(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    String str = strArr[i10];
                    i10++;
                    Iterator itA = ae.c.a(strArr2);
                    while (itA.hasNext()) {
                        if (comparator.compare(str, (String) itA.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long u(Response response) {
        r.f(response, "<this>");
        String strA = response.G().a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        return W(strA, -1L);
    }

    @SafeVarargs
    public static final <T> List<T> v(T... tArr) {
        r.f(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(u.p(Arrays.copyOf(objArr, objArr.length)));
        r.e(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int w(String[] strArr, String str, Comparator<String> comparator) {
        r.f(strArr, "<this>");
        r.f(str, "value");
        r.f(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int x(String str) {
        r.f(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (r.g(cCharAt, 31) <= 0 || r.g(cCharAt, 127) >= 0) {
                return i10;
            }
            i10 = i11;
        }
        return -1;
    }

    public static final int y(String str, int i10, int i11) {
        r.f(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (!((((cCharAt == '\t' || cCharAt == '\n') || cCharAt == '\f') || cCharAt == '\r') || cCharAt == ' ')) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static /* synthetic */ int z(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return y(str, i10, i11);
    }
}
