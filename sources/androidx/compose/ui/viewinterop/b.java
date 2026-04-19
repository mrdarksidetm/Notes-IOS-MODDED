package androidx.compose.ui.viewinterop;

import a2.e1;
import a2.f1;
import a2.g1;
import ae.s;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.e;
import androidx.compose.ui.viewinterop.b;
import b2.c1;
import k1.g;
import le.k;
import le.n0;
import md.i0;
import md.u;
import o3.f0;
import o3.g0;
import o4.r;
import t0.j;
import w2.w;
import w2.x;
import x4.f;
import zd.l;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public class b extends ViewGroup implements f0, j, f1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0066b f3122w = new C0066b(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f3123x = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final l<b, i0> f3124y = a.f3147a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u1.b f3125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f3126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e1 f3127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zd.a<i0> f3128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zd.a<i0> f3130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zd.a<i0> f3131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f3132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l<? super e, i0> f3133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private w2.d f3134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l<? super w2.d, i0> f3135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private o4.e f3136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private f f3137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final zd.a<i0> f3138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final zd.a<i0> f3139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private l<? super Boolean, i0> f3140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int[] f3141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f3142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f3143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final g0 f3144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f3145u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final a2.f0 f3146v;

    static final class a extends s implements l<b, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3147a = new a();

        a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(zd.a aVar) {
            aVar.invoke();
        }

        public final void b(b bVar) {
            Handler handler = bVar.getHandler();
            final zd.a aVar = bVar.f3138n;
            handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.c(aVar);
                }
            });
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(b bVar) {
            b(bVar);
            return i0.f15558a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.b$b, reason: collision with other inner class name */
    public static final class C0066b {
        private C0066b() {
        }

        public /* synthetic */ C0066b(ae.j jVar) {
            this();
        }
    }

    @sd.d(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {560, 565}, m = "invokeSuspend")
    static final class c extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f3150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f3151d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, b bVar, long j10, qd.d<? super c> dVar) {
            super(2, dVar);
            this.f3149b = z10;
            this.f3150c = bVar;
            this.f3151d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return new c(this.f3149b, this.f3150c, this.f3151d, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((c) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f3148a;
            if (i10 == 0) {
                u.b(obj);
                if (this.f3149b) {
                    u1.b bVar = this.f3150c.f3125a;
                    long j10 = this.f3151d;
                    long jA = w.f22437b.a();
                    this.f3148a = 2;
                    if (bVar.a(j10, jA, this) == objE) {
                        return objE;
                    }
                } else {
                    u1.b bVar2 = this.f3150c.f3125a;
                    long jA2 = w.f22437b.a();
                    long j11 = this.f3151d;
                    this.f3148a = 1;
                    if (bVar2.a(jA2, j11, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    @sd.d(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {578}, m = "invokeSuspend")
    static final class d extends sd.j implements p<n0, qd.d<? super i0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3152a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f3154c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, qd.d<? super d> dVar) {
            super(2, dVar);
            this.f3154c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qd.d<i0> create(Object obj, qd.d<?> dVar) {
            return b.this.new d(this.f3154c, dVar);
        }

        @Override // zd.p
        public final Object invoke(n0 n0Var, qd.d<? super i0> dVar) {
            return ((d) create(n0Var, dVar)).invokeSuspend(i0.f15558a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = rd.d.e();
            int i10 = this.f3152a;
            if (i10 == 0) {
                u.b(obj);
                u1.b bVar = b.this.f3125a;
                long j10 = this.f3154c;
                this.f3152a = 1;
                if (bVar.c(j10, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f15558a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(zd.a aVar) {
        aVar.invoke();
    }

    private final g1 getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return this.f3127c.getSnapshotObserver();
        }
        throw new IllegalStateException("Expected AndroidViewHolder to be attached when observing reads.".toString());
    }

    @Override // a2.f1
    public boolean O() {
        return isAttachedToWindow();
    }

    public final void d() {
        if (!this.f3145u) {
            this.f3146v.A0();
            return;
        }
        View view = this.f3126b;
        final zd.a<i0> aVar = this.f3139o;
        view.postOnAnimation(new Runnable() { // from class: z2.a
            @Override // java.lang.Runnable
            public final void run() {
                b.e(aVar);
            }
        });
    }

    @Override // t0.j
    public void f() {
        this.f3131g.invoke();
    }

    public final void g() {
        int i10;
        int i11 = this.f3142r;
        if (i11 == Integer.MIN_VALUE || (i10 = this.f3143s) == Integer.MIN_VALUE) {
            return;
        }
        measure(i11, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.f3141q);
        int[] iArr = this.f3141q;
        int i10 = iArr[0];
        region.op(i10, iArr[1], i10 + getWidth(), this.f3141q[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final w2.d getDensity() {
        return this.f3134j;
    }

    public final View getInteropView() {
        return this.f3126b;
    }

    public final a2.f0 getLayoutNode() {
        return this.f3146v;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f3126b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final o4.e getLifecycleOwner() {
        return this.f3136l;
    }

    public final e getModifier() {
        return this.f3132h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3144t.a();
    }

    public final l<w2.d, i0> getOnDensityChanged$ui_release() {
        return this.f3135k;
    }

    public final l<e, i0> getOnModifierChanged$ui_release() {
        return this.f3133i;
    }

    public final l<Boolean, i0> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f3140p;
    }

    public final zd.a<i0> getRelease() {
        return this.f3131g;
    }

    public final zd.a<i0> getReset() {
        return this.f3130f;
    }

    public final f getSavedStateRegistryOwner() {
        return this.f3137m;
    }

    public final zd.a<i0> getUpdate() {
        return this.f3128d;
    }

    public final View getView() {
        return this.f3126b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        d();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3126b.isNestedScrollingEnabled();
    }

    @Override // t0.j
    public void k() {
        this.f3130f.invoke();
        removeAllViewsInLayout();
    }

    @Override // t0.j
    public void m() {
        if (this.f3126b.getParent() != this) {
            addView(this.f3126b);
        } else {
            this.f3130f.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3138n.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f3126b.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f3126b.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (this.f3126b.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.f3126b.measure(i10, i11);
        setMeasuredDimension(this.f3126b.getMeasuredWidth(), this.f3126b.getMeasuredHeight());
        this.f3142r = i10;
        this.f3143s = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        k.d(this.f3125a.e(), null, null, new c(z10, this, x.a(androidx.compose.ui.viewinterop.c.e(f10), androidx.compose.ui.viewinterop.c.e(f11)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        k.d(this.f3125a.e(), null, null, new d(x.a(androidx.compose.ui.viewinterop.c.e(f10), androidx.compose.ui.viewinterop.c.e(f11)), null), 3, null);
        return false;
    }

    @Override // o3.e0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (isNestedScrollingEnabled()) {
            long jD = this.f3125a.d(g.a(androidx.compose.ui.viewinterop.c.d(i10), androidx.compose.ui.viewinterop.c.d(i11)), androidx.compose.ui.viewinterop.c.f(i12));
            iArr[0] = c1.b(k1.f.o(jD));
            iArr[1] = c1.b(k1.f.p(jD));
        }
    }

    @Override // o3.e0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (isNestedScrollingEnabled()) {
            this.f3125a.b(g.a(androidx.compose.ui.viewinterop.c.d(i10), androidx.compose.ui.viewinterop.c.d(i11)), g.a(androidx.compose.ui.viewinterop.c.d(i12), androidx.compose.ui.viewinterop.c.d(i13)), androidx.compose.ui.viewinterop.c.f(i14));
        }
    }

    @Override // o3.f0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            long jB = this.f3125a.b(g.a(androidx.compose.ui.viewinterop.c.d(i10), androidx.compose.ui.viewinterop.c.d(i11)), g.a(androidx.compose.ui.viewinterop.c.d(i12), androidx.compose.ui.viewinterop.c.d(i13)), androidx.compose.ui.viewinterop.c.f(i14));
            iArr[0] = c1.b(k1.f.o(jB));
            iArr[1] = c1.b(k1.f.p(jB));
        }
    }

    @Override // o3.e0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.f3144t.c(view, view2, i10, i11);
    }

    @Override // o3.e0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // o3.e0
    public void onStopNestedScroll(View view, int i10) {
        this.f3144t.e(view, i10);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        l<? super Boolean, i0> lVar = this.f3140p;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(w2.d dVar) {
        if (dVar != this.f3134j) {
            this.f3134j = dVar;
            l<? super w2.d, i0> lVar = this.f3135k;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(o4.e eVar) {
        if (eVar != this.f3136l) {
            this.f3136l = eVar;
            r.b(this, eVar);
        }
    }

    public final void setModifier(e eVar) {
        if (eVar != this.f3132h) {
            this.f3132h = eVar;
            l<? super e, i0> lVar = this.f3133i;
            if (lVar != null) {
                lVar.invoke(eVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(l<? super w2.d, i0> lVar) {
        this.f3135k = lVar;
    }

    public final void setOnModifierChanged$ui_release(l<? super e, i0> lVar) {
        this.f3133i = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(l<? super Boolean, i0> lVar) {
        this.f3140p = lVar;
    }

    protected final void setRelease(zd.a<i0> aVar) {
        this.f3131g = aVar;
    }

    protected final void setReset(zd.a<i0> aVar) {
        this.f3130f = aVar;
    }

    public final void setSavedStateRegistryOwner(f fVar) {
        if (fVar != this.f3137m) {
            this.f3137m = fVar;
            x4.g.b(this, fVar);
        }
    }

    protected final void setUpdate(zd.a<i0> aVar) {
        this.f3128d = aVar;
        this.f3129e = true;
        this.f3138n.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }
}
