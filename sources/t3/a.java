package t3;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f21217r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final View f21220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f21221d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21225h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f21230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f21231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f21232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f21233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f21234q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0430a f21218a = new C0430a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Interpolator f21219b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f21222e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f21223f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f21226i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float[] f21227j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float[] f21228k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: t3.a$a, reason: collision with other inner class name */
    private static class C0430a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f21237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f21238d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f21244j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f21245k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f21239e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f21243i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f21240f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f21241g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f21242h = 0;

        C0430a() {
        }

        private float e(long j10) {
            if (j10 < this.f21239e) {
                return 0.0f;
            }
            long j11 = this.f21243i;
            if (j11 < 0 || j10 < j11) {
                return a.e((j10 - r0) / this.f21235a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f21244j;
            return (1.0f - f10) + (f10 * a.e((j10 - j11) / this.f21245k, 0.0f, 1.0f));
        }

        private float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public void a() {
            if (this.f21240f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f21240f;
            this.f21240f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f21241g = (int) (this.f21237c * f10);
            this.f21242h = (int) (f10 * this.f21238d);
        }

        public int b() {
            return this.f21241g;
        }

        public int c() {
            return this.f21242h;
        }

        public int d() {
            float f10 = this.f21237c;
            return (int) (f10 / Math.abs(f10));
        }

        public int f() {
            float f10 = this.f21238d;
            return (int) (f10 / Math.abs(f10));
        }

        public boolean h() {
            return this.f21243i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f21243i + ((long) this.f21245k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f21245k = a.f((int) (jCurrentAnimationTimeMillis - this.f21239e), 0, this.f21236b);
            this.f21244j = e(jCurrentAnimationTimeMillis);
            this.f21243i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.f21236b = i10;
        }

        public void k(int i10) {
            this.f21235a = i10;
        }

        public void l(float f10, float f11) {
            this.f21237c = f10;
            this.f21238d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f21239e = jCurrentAnimationTimeMillis;
            this.f21243i = -1L;
            this.f21240f = jCurrentAnimationTimeMillis;
            this.f21244j = 0.5f;
            this.f21241g = 0;
            this.f21242h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f21232o) {
                if (aVar.f21230m) {
                    aVar.f21230m = false;
                    aVar.f21218a.m();
                }
                C0430a c0430a = a.this.f21218a;
                if (c0430a.h() || !a.this.u()) {
                    a.this.f21232o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f21231n) {
                    aVar2.f21231n = false;
                    aVar2.c();
                }
                c0430a.a();
                a.this.j(c0430a.b(), c0430a.c());
                androidx.core.view.h.R(a.this.f21220c, this);
            }
        }
    }

    public a(View view) {
        this.f21220c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f21217r);
        r(500);
        q(500);
    }

    private float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f21222e[i10], f11, this.f21223f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f21226i[i10];
        float f14 = this.f21227j[i10];
        float f15 = this.f21228k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    static float e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    static int f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    private float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f21224g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f21232o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    private float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.f21219b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f21219b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f21230m) {
            this.f21232o = false;
        } else {
            this.f21218a.i();
        }
    }

    private void v() {
        int i10;
        if (this.f21221d == null) {
            this.f21221d = new b();
        }
        this.f21232o = true;
        this.f21230m = true;
        if (this.f21229l || (i10 = this.f21225h) <= 0) {
            this.f21221d.run();
        } else {
            androidx.core.view.h.S(this.f21220c, this.f21221d, i10);
        }
        this.f21229l = true;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f21220c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f21225h = i10;
        return this;
    }

    public a l(int i10) {
        this.f21224g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f21233p && !z10) {
            i();
        }
        this.f21233p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f21223f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f21228k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f21233p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f21231n = r2
            r5.f21229l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f21220c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f21220c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            t3.a$a r7 = r5.f21218a
            r7.l(r0, r6)
            boolean r6 = r5.f21232o
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f21234q
            if (r6 == 0) goto L61
            boolean r6 = r5.f21232o
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f21227j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f21218a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f21218a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f21222e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f21226i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    boolean u() {
        C0430a c0430a = this.f21218a;
        int iF = c0430a.f();
        int iD = c0430a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }
}
