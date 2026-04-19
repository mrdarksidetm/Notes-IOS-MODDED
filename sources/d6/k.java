package d6;

import a6.n;
import a6.o;
import ae.r;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import b6.a;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import d6.i;
import hf.u;
import java.io.IOException;
import java.util.Map;
import je.v;
import je.w;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public final class k implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f9511f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final CacheControl f9512g = new CacheControl.Builder().d().e().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final CacheControl f9513h = new CacheControl.Builder().d().f().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j6.m f9515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final md.l<Call.Factory> f9516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final md.l<b6.a> f9517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f9518e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    public static final class b implements i.a<Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final md.l<Call.Factory> f9519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final md.l<b6.a> f9520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f9521c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(md.l<? extends Call.Factory> lVar, md.l<? extends b6.a> lVar2, boolean z10) {
            this.f9519a = lVar;
            this.f9520b = lVar2;
            this.f9521c = z10;
        }

        private final boolean c(Uri uri) {
            return r.b(uri.getScheme(), "http") || r.b(uri.getScheme(), "https");
        }

        @Override // d6.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, j6.m mVar, x5.e eVar) {
            if (c(uri)) {
                return new k(uri.toString(), mVar, this.f9519a, this.f9520b, this.f9521c);
            }
            return null;
        }
    }

    @sd.d(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {224}, m = "executeNetworkRequest")
    static final class c extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9522a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f9524c;

        c(qd.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9522a = obj;
            this.f9524c |= Integer.MIN_VALUE;
            return k.this.c(null, this);
        }
    }

    @sd.d(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {R.styleable.AppCompatTheme_listMenuViewStyle, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader}, m = "fetch")
    static final class d extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f9526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f9527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f9528d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f9530f;

        d(qd.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9528d = obj;
            this.f9530f |= Integer.MIN_VALUE;
            return k.this.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(String str, j6.m mVar, md.l<? extends Call.Factory> lVar, md.l<? extends b6.a> lVar2, boolean z10) {
        this.f9514a = str;
        this.f9515b = mVar;
        this.f9516c = lVar;
        this.f9517d = lVar2;
        this.f9518e = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(okhttp3.Request r5, qd.d<? super okhttp3.Response> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d6.k.c
            if (r0 == 0) goto L13
            r0 = r6
            d6.k$c r0 = (d6.k.c) r0
            int r1 = r0.f9524c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9524c = r1
            goto L18
        L13:
            d6.k$c r0 = new d6.k$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9522a
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f9524c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            md.u.b(r6)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            md.u.b(r6)
            boolean r6 = o6.j.s()
            if (r6 == 0) goto L5d
            j6.m r6 = r4.f9515b
            j6.b r6 = r6.k()
            boolean r6 = r6.b()
            if (r6 != 0) goto L57
            md.l<okhttp3.Call$Factory> r6 = r4.f9516c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.b(r5)
            okhttp3.Response r5 = r5.a()
            goto L75
        L57:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5d:
            md.l<okhttp3.Call$Factory> r6 = r4.f9516c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.b(r5)
            r0.f9524c = r3
            java.lang.Object r6 = o6.b.a(r5, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L75:
            boolean r6 = r5.H()
            if (r6 != 0) goto L92
            int r6 = r5.w()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L92
            okhttp3.ResponseBody r6 = r5.a()
            if (r6 == 0) goto L8c
            o6.j.d(r6)
        L8c:
            i6.d r6 = new i6.d
            r6.<init>(r5)
            throw r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.k.c(okhttp3.Request, qd.d):java.lang.Object");
    }

    private final String d() {
        String strH = this.f9515b.h();
        return strH == null ? this.f9514a : strH;
    }

    private final hf.j e() {
        b6.a value = this.f9517d.getValue();
        r.c(value);
        return value.getFileSystem();
    }

    private final boolean g(Request request, Response response) {
        return this.f9515b.i().c() && (!this.f9518e || i6.b.f12569c.c(request, response));
    }

    private final Request h() {
        CacheControl cacheControl;
        Request.Builder builderG = new Request.Builder().p(this.f9514a).g(this.f9515b.j());
        for (Map.Entry<Class<?>, Object> entry : this.f9515b.o().a().entrySet()) {
            Class<?> key = entry.getKey();
            r.d(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            builderG.o(key, entry.getValue());
        }
        boolean zB = this.f9515b.i().b();
        boolean zB2 = this.f9515b.k().b();
        if (!zB2 && zB) {
            cacheControl = CacheControl.f16661p;
        } else {
            if (!zB2 || zB) {
                if (!zB2 && !zB) {
                    cacheControl = f9513h;
                }
                return builderG.b();
            }
            cacheControl = this.f9515b.i().c() ? CacheControl.f16660o : f9512g;
        }
        builderG.c(cacheControl);
        return builderG.b();
    }

    private final a.c i() {
        b6.a value;
        if (!this.f9515b.i().b() || (value = this.f9517d.getValue()) == null) {
            return null;
        }
        return value.b(d());
    }

    private final i6.a j(a.c cVar) throws Throwable {
        Throwable th;
        i6.a aVar;
        try {
            hf.e eVarD = u.d(e().q(cVar.f()));
            try {
                aVar = new i6.a(eVarD);
                if (eVarD != null) {
                    try {
                        eVarD.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (eVarD != null) {
                    try {
                        eVarD.close();
                    } catch (Throwable th4) {
                        md.f.a(th3, th4);
                    }
                }
                th = th3;
                aVar = null;
            }
            if (th != null) {
                throw th;
            }
            r.c(aVar);
            return aVar;
        } catch (IOException unused) {
            return null;
        }
    }

    private final a6.d k(Response response) {
        return response.L() != null ? a6.d.NETWORK : a6.d.DISK;
    }

    private final n l(a.c cVar) {
        return o.c(cVar.getData(), e(), d(), cVar);
    }

    private final n m(ResponseBody responseBody) {
        return o.a(responseBody.l(), this.f9515b.g());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb A[Catch: all -> 0x0106, Exception -> 0x0108, TRY_LEAVE, TryCatch #7 {Exception -> 0x0108, blocks: (B:15:0x002b, B:18:0x0036, B:33:0x0082, B:67:0x00fc, B:34:0x0087, B:30:0x007a, B:35:0x0088, B:51:0x00bb, B:66:0x00f9, B:70:0x0104, B:63:0x00f1, B:71:0x0105, B:48:0x00b4), top: B:92:0x002b, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105 A[Catch: all -> 0x0106, Exception -> 0x0108, TRY_LEAVE, TryCatch #7 {Exception -> 0x0108, blocks: (B:15:0x002b, B:18:0x0036, B:33:0x0082, B:67:0x00fc, B:34:0x0087, B:30:0x007a, B:35:0x0088, B:51:0x00bb, B:66:0x00f9, B:70:0x0104, B:63:0x00f1, B:71:0x0105, B:48:0x00b4), top: B:92:0x002b, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final b6.a.c n(b6.a.c r6, okhttp3.Request r7, okhttp3.Response r8, i6.a r9) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.k.n(b6.a$c, okhttp3.Request, okhttp3.Response, i6.a):b6.a$c");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0127 A[Catch: Exception -> 0x019a, TryCatch #2 {Exception -> 0x019a, blocks: (B:68:0x017e, B:52:0x0119, B:54:0x0127, B:56:0x0135, B:57:0x0139, B:59:0x0143, B:61:0x014b, B:63:0x0163), top: B:85:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143 A[Catch: Exception -> 0x019a, TryCatch #2 {Exception -> 0x019a, blocks: (B:68:0x017e, B:52:0x0119, B:54:0x0127, B:56:0x0135, B:57:0x0139, B:59:0x0143, B:61:0x014b, B:63:0x0163), top: B:85:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d6.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(qd.d<? super d6.h> r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.k.a(qd.d):java.lang.Object");
    }

    public final String f(String str, MediaType mediaType) {
        String strK;
        String string = mediaType != null ? mediaType.toString() : null;
        if ((string == null || v.G(string, "text/plain", false, 2, null)) && (strK = o6.j.k(MimeTypeMap.getSingleton(), str)) != null) {
            return strK;
        }
        if (string != null) {
            return w.S0(string, ';', null, 2, null);
        }
        return null;
    }
}
