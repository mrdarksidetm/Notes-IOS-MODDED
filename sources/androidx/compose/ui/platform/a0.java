package androidx.compose.ui.platform;

import a2.d1;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.b;
import b2.a1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import l1.f1;
import l1.l0;
import l1.m1;
import l1.z0;
import md.i0;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends View implements d1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f2851p = new c(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f2852q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final zd.p<View, Matrix, i0> f2853r = b.f2874a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final ViewOutlineProvider f2854s = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Method f2855t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Field f2856u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static boolean f2857v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static boolean f2858w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f2859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f2860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zd.l<? super l1.b0, i0> f2861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zd.a<i0> f2862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b2.d1 f2863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f2865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l1.c0 f2868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a1<View> f2869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f2870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f2871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f2872n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2873o;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            ae.r.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineD = ((a0) view).f2863e.d();
            ae.r.c(outlineD);
            outline.set(outlineD);
        }
    }

    static final class b extends ae.s implements zd.p<View, Matrix, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2874a = new b();

        b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(View view, Matrix matrix) {
            a(view, matrix);
            return i0.f15558a;
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(ae.j jVar) {
            this();
        }

        public final boolean a() {
            return a0.f2857v;
        }

        public final boolean b() {
            return a0.f2858w;
        }

        public final void c(boolean z10) {
            a0.f2858w = z10;
        }

        public final void d(View view) {
            Field declaredField;
            try {
                if (!a()) {
                    a0.f2857v = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        a0.f2855t = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        a0.f2855t = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        declaredField = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    a0.f2856u = declaredField;
                    Method method = a0.f2855t;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = a0.f2856u;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = a0.f2856u;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = a0.f2855t;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f2875a = new d();

        private d() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public a0(i iVar, w wVar, zd.l<? super l1.b0, i0> lVar, zd.a<i0> aVar) {
        super(iVar.getContext());
        this.f2859a = iVar;
        this.f2860b = wVar;
        this.f2861c = lVar;
        this.f2862d = aVar;
        this.f2863e = new b2.d1(iVar.getDensity());
        this.f2868j = new l1.c0();
        this.f2869k = new a1<>(f2853r);
        this.f2870l = androidx.compose.ui.graphics.g.f2806b.a();
        this.f2871m = true;
        setWillNotDraw(false);
        wVar.addView(this);
        this.f2872n = View.generateViewId();
    }

    private final f1 getManualClipPath() {
        if (!getClipToOutline() || this.f2863e.e()) {
            return null;
        }
        return this.f2863e.c();
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f2866h) {
            this.f2866h = z10;
            this.f2859a.i0(this, z10);
        }
    }

    private final void t() {
        Rect rect;
        if (this.f2864f) {
            Rect rect2 = this.f2865g;
            if (rect2 == null) {
                this.f2865g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                ae.r.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f2865g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void u() {
        setOutlineProvider(this.f2863e.d() != null ? f2854s : null);
    }

    @Override // a2.d1
    public void a(k1.d dVar, boolean z10) {
        if (!z10) {
            z0.g(this.f2869k.b(this), dVar);
            return;
        }
        float[] fArrA = this.f2869k.a(this);
        if (fArrA != null) {
            z0.g(fArrA, dVar);
        } else {
            dVar.g(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // a2.d1
    public void b(zd.l<? super l1.b0, i0> lVar, zd.a<i0> aVar) {
        this.f2860b.addView(this);
        this.f2864f = false;
        this.f2867i = false;
        this.f2870l = androidx.compose.ui.graphics.g.f2806b.a();
        this.f2861c = lVar;
        this.f2862d = aVar;
    }

    @Override // a2.d1
    public boolean c(long j10) {
        float fO = k1.f.o(j10);
        float fP = k1.f.p(j10);
        if (this.f2864f) {
            return 0.0f <= fO && fO < ((float) getWidth()) && 0.0f <= fP && fP < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f2863e.f(j10);
        }
        return true;
    }

    @Override // a2.d1
    public void d(l1.b0 b0Var) {
        boolean z10 = getElevation() > 0.0f;
        this.f2867i = z10;
        if (z10) {
            b0Var.t();
        }
        this.f2860b.a(b0Var, this, getDrawingTime());
        if (this.f2867i) {
            b0Var.i();
        }
    }

    @Override // a2.d1
    public void destroy() {
        setInvalidated(false);
        this.f2859a.o0();
        this.f2861c = null;
        this.f2862d = null;
        this.f2859a.n0(this);
        this.f2860b.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        boolean z10;
        l1.c0 c0Var = this.f2868j;
        Canvas canvasW = c0Var.a().w();
        c0Var.a().x(canvas);
        l1.b bVarA = c0Var.a();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            z10 = true;
            bVarA.h();
            this.f2863e.a(bVarA);
        }
        zd.l<? super l1.b0, i0> lVar = this.f2861c;
        if (lVar != null) {
            lVar.invoke(bVarA);
        }
        if (z10) {
            bVarA.p();
        }
        c0Var.a().x(canvasW);
        setInvalidated(false);
    }

    @Override // a2.d1
    public long e(long j10, boolean z10) {
        if (!z10) {
            return z0.f(this.f2869k.b(this), j10);
        }
        float[] fArrA = this.f2869k.a(this);
        return fArrA != null ? z0.f(fArrA, j10) : k1.f.f14338b.a();
    }

    @Override // a2.d1
    public void f(long j10) {
        int iG = w2.p.g(j10);
        int iF = w2.p.f(j10);
        if (iG == getWidth() && iF == getHeight()) {
            return;
        }
        float f10 = iG;
        setPivotX(androidx.compose.ui.graphics.g.f(this.f2870l) * f10);
        float f11 = iF;
        setPivotY(androidx.compose.ui.graphics.g.g(this.f2870l) * f11);
        this.f2863e.i(k1.m.a(f10, f11));
        u();
        layout(getLeft(), getTop(), getLeft() + iG, getTop() + iF);
        t();
        this.f2869k.c();
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // a2.d1
    public void g(long j10) {
        int iJ = w2.n.j(j10);
        if (iJ != getLeft()) {
            offsetLeftAndRight(iJ - getLeft());
            this.f2869k.c();
        }
        int iK = w2.n.k(j10);
        if (iK != getTop()) {
            offsetTopAndBottom(iK - getTop());
            this.f2869k.c();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final w getContainer() {
        return this.f2860b;
    }

    public long getLayerId() {
        return this.f2872n;
    }

    public final i getOwnerView() {
        return this.f2859a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.f2859a);
        }
        return -1L;
    }

    @Override // a2.d1
    public void h() {
        if (!this.f2866h || f2858w) {
            return;
        }
        f2851p.d(this);
        setInvalidated(false);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f2871m;
    }

    @Override // a2.d1
    public void i(androidx.compose.ui.graphics.e eVar, w2.r rVar, w2.d dVar) {
        zd.a<i0> aVar;
        int iL = eVar.l() | this.f2873o;
        if ((iL & 4096) != 0) {
            long jV0 = eVar.V0();
            this.f2870l = jV0;
            setPivotX(androidx.compose.ui.graphics.g.f(jV0) * getWidth());
            setPivotY(androidx.compose.ui.graphics.g.g(this.f2870l) * getHeight());
        }
        if ((iL & 1) != 0) {
            setScaleX(eVar.F());
        }
        if ((iL & 2) != 0) {
            setScaleY(eVar.r1());
        }
        if ((iL & 4) != 0) {
            setAlpha(eVar.d());
        }
        if ((iL & 8) != 0) {
            setTranslationX(eVar.S0());
        }
        if ((iL & 16) != 0) {
            setTranslationY(eVar.D0());
        }
        if ((iL & 32) != 0) {
            setElevation(eVar.r());
        }
        if ((iL & 1024) != 0) {
            setRotation(eVar.j0());
        }
        if ((iL & 256) != 0) {
            setRotationX(eVar.X0());
        }
        if ((iL & 512) != 0) {
            setRotationY(eVar.a0());
        }
        if ((iL & 2048) != 0) {
            setCameraDistancePx(eVar.Q0());
        }
        boolean z10 = false;
        boolean z11 = getManualClipPath() != null;
        boolean z12 = eVar.j() && eVar.s() != m1.a();
        if ((iL & 24576) != 0) {
            this.f2864f = eVar.j() && eVar.s() == m1.a();
            t();
            setClipToOutline(z12);
        }
        boolean zH = this.f2863e.h(eVar.s(), eVar.d(), z12, eVar.r(), rVar, dVar);
        if (this.f2863e.b()) {
            u();
        }
        boolean z13 = getManualClipPath() != null;
        if (z11 != z13 || (z13 && zH)) {
            invalidate();
        }
        if (!this.f2867i && getElevation() > 0.0f && (aVar = this.f2862d) != null) {
            aVar.invoke();
        }
        if ((iL & 7963) != 0) {
            this.f2869k.c();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if ((iL & 64) != 0) {
                c0.f2882a.a(this, l0.i(eVar.f()));
            }
            if ((iL & 128) != 0) {
                c0.f2882a.b(this, l0.i(eVar.v()));
            }
        }
        if (i10 >= 31 && (131072 & iL) != 0) {
            d0.f2892a.a(this, eVar.p());
        }
        if ((iL & 32768) != 0) {
            int iK = eVar.k();
            b.a aVar2 = androidx.compose.ui.graphics.b.f2766a;
            if (androidx.compose.ui.graphics.b.e(iK, aVar2.c())) {
                setLayerType(2, null);
            } else {
                boolean zE = androidx.compose.ui.graphics.b.e(iK, aVar2.b());
                setLayerType(0, null);
                if (!zE) {
                }
                this.f2871m = z10;
            }
            z10 = true;
            this.f2871m = z10;
        }
        this.f2873o = eVar.l();
    }

    @Override // android.view.View, a2.d1
    public void invalidate() {
        if (this.f2866h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f2859a.invalidate();
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final boolean s() {
        return this.f2866h;
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }
}
