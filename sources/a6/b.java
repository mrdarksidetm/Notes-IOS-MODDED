package a6;

import a6.g;
import a6.n;
import ae.r;
import ae.s;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import com.google.android.gms.common.api.a;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import hf.i0;
import hf.u;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f584e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j6.m f586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ue.d f587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f588d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: a6.b$b, reason: collision with other inner class name */
    private static final class C0020b extends hf.m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Exception f589b;

        public C0020b(i0 i0Var) {
            super(i0Var);
        }

        @Override // hf.m, hf.i0
        public long X(hf.c cVar, long j10) throws Exception {
            try {
                return super.X(cVar, j10);
            } catch (Exception e10) {
                this.f589b = e10;
                throw e10;
            }
        }

        public final Exception b() {
            return this.f589b;
        }
    }

    public static final class c implements g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ue.d f591b;

        public c(int i10, j jVar) {
            this.f590a = jVar;
            this.f591b = ue.f.b(i10, 0, 2, null);
        }

        @Override // a6.g.a
        public g a(d6.m mVar, j6.m mVar2, x5.e eVar) {
            return new b(mVar.b(), mVar2, this.f591b, this.f590a);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }
    }

    @sd.d(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {232, R.styleable.AppCompatTheme_buttonStyle}, m = "decode")
    static final class d extends kotlin.coroutines.jvm.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f594c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f596e;

        d(qd.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f594c = obj;
            this.f596e |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    static final class e extends s implements zd.a<a6.e> {
        e() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a6.e invoke() {
            return b.this.e(new BitmapFactory.Options());
        }
    }

    public b(n nVar, j6.m mVar, ue.d dVar, j jVar) {
        this.f585a = nVar;
        this.f586b = mVar;
        this.f587c = dVar;
        this.f588d = jVar;
    }

    private final void c(BitmapFactory.Options options, h hVar) {
        Bitmap.Config configF = this.f586b.f();
        if (hVar.b() || l.a(hVar)) {
            configF = o6.a.e(configF);
        }
        if (this.f586b.d() && configF == Bitmap.Config.ARGB_8888 && r.b(options.outMimeType, "image/jpeg")) {
            configF = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && configF != Bitmap.Config.HARDWARE) {
            configF = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = configF;
    }

    private final void d(BitmapFactory.Options options, h hVar) {
        n.a aVarA = this.f585a.a();
        if ((aVarA instanceof p) && k6.b.a(this.f586b.n())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((p) aVarA).a();
            options.inTargetDensity = this.f586b.g().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i10 = l.b(hVar) ? options.outHeight : options.outWidth;
        int i11 = l.b(hVar) ? options.outWidth : options.outHeight;
        k6.i iVarN = this.f586b.n();
        int iB = k6.b.a(iVarN) ? i10 : o6.j.B(iVarN.b(), this.f586b.m());
        k6.i iVarN2 = this.f586b.n();
        int iB2 = k6.b.a(iVarN2) ? i11 : o6.j.B(iVarN2.a(), this.f586b.m());
        int iA = f.a(i10, i11, iB, iB2, this.f586b.m());
        options.inSampleSize = iA;
        double dB = f.b(((double) i10) / ((double) iA), ((double) i11) / ((double) iA), iB, iB2, this.f586b.m());
        if (this.f586b.c()) {
            dB = ge.o.f(dB, 1.0d);
        }
        boolean z10 = !(dB == 1.0d);
        options.inScaled = z10;
        if (z10) {
            if (dB > 1.0d) {
                options.inDensity = ce.c.c(((double) a.e.API_PRIORITY_OTHER) / dB);
                options.inTargetDensity = a.e.API_PRIORITY_OTHER;
            } else {
                options.inDensity = a.e.API_PRIORITY_OTHER;
                options.inTargetDensity = ce.c.c(((double) a.e.API_PRIORITY_OTHER) * dB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a6.e e(BitmapFactory.Options options) throws Exception {
        C0020b c0020b = new C0020b(this.f585a.b());
        hf.e eVarD = u.d(c0020b);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(eVarD.peek().f0(), null, options);
        Exception excB = c0020b.b();
        if (excB != null) {
            throw excB;
        }
        options.inJustDecodeBounds = false;
        k kVar = k.f618a;
        h hVarA = kVar.a(options.outMimeType, eVarD, this.f588d);
        Exception excB2 = c0020b.b();
        if (excB2 != null) {
            throw excB2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && this.f586b.e() != null) {
            options.inPreferredColorSpace = this.f586b.e();
        }
        options.inPremultiplied = this.f586b.l();
        c(options, hVarA);
        d(options, hVarA);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(eVarD.f0(), null, options);
            xd.b.a(eVarD, null);
            Exception excB3 = c0020b.b();
            if (excB3 != null) {
                throw excB3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
            }
            bitmapDecodeStream.setDensity(this.f586b.g().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f586b.g().getResources(), kVar.b(bitmapDecodeStream, hVarA));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = false;
            }
            return new a6.e(bitmapDrawable, z10);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // a6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(qd.d<? super a6.e> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a6.b.d
            if (r0 == 0) goto L13
            r0 = r8
            a6.b$d r0 = (a6.b.d) r0
            int r1 = r0.f596e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f596e = r1
            goto L18
        L13:
            a6.b$d r0 = new a6.b$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f594c
            java.lang.Object r1 = rd.b.e()
            int r2 = r0.f596e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f592a
            ue.d r0 = (ue.d) r0
            md.u.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r8 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.f593b
            ue.d r2 = (ue.d) r2
            java.lang.Object r5 = r0.f592a
            a6.b r5 = (a6.b) r5
            md.u.b(r8)
            r8 = r2
            goto L5a
        L47:
            md.u.b(r8)
            ue.d r8 = r7.f587c
            r0.f592a = r7
            r0.f593b = r8
            r0.f596e = r4
            java.lang.Object r2 = r8.c(r0)
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r7
        L5a:
            a6.b$e r2 = new a6.b$e     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            r0.f592a = r8     // Catch: java.lang.Throwable -> L76
            r5 = 0
            r0.f593b = r5     // Catch: java.lang.Throwable -> L76
            r0.f596e = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = le.w1.c(r5, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            a6.e r8 = (a6.e) r8     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r8
        L76:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.b.a(qd.d):java.lang.Object");
    }
}
