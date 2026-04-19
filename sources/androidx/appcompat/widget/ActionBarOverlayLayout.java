package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.o;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements r.l, o3.e0, o3.f0 {
    static final int[] F = {j.a.f13332b, R.attr.windowContentOverlay};
    ViewPropertyAnimator A;
    final AnimatorListenerAdapter B;
    private final Runnable C;
    private final Runnable D;
    private final o3.g0 E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f1353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarContainer f1354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r.m f1355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f1361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f1364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f1365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f1366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f1367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f1368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f1369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f1370t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private androidx.core.view.o f1371u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private androidx.core.view.o f1372v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private androidx.core.view.o f1373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private androidx.core.view.o f1374x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f1375y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private OverScroller f1376z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f1361k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f1361k = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f1354d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f1354d.animate().translationY(-ActionBarOverlayLayout.this.f1354d.getHeight()).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1352b = 0;
        this.f1364n = new Rect();
        this.f1365o = new Rect();
        this.f1366p = new Rect();
        this.f1367q = new Rect();
        this.f1368r = new Rect();
        this.f1369s = new Rect();
        this.f1370t = new Rect();
        androidx.core.view.o oVar = androidx.core.view.o.f3407b;
        this.f1371u = oVar;
        this.f1372v = oVar;
        this.f1373w = oVar;
        this.f1374x = oVar;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        p(context);
        this.E = new o3.g0(this);
    }

    private void e() {
        o();
        this.D.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean k(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.k(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r.m n(View view) {
        if (view instanceof r.m) {
            return (r.m) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void p(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.f1351a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1356f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1357g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1376z = new OverScroller(context);
    }

    private void r() {
        o();
        postDelayed(this.D, 600L);
    }

    private void s() {
        o();
        postDelayed(this.C, 600L);
    }

    private void u() {
        o();
        this.C.run();
    }

    private boolean v(float f10) {
        this.f1376z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
        return this.f1376z.getFinalY() > this.f1354d.getHeight();
    }

    @Override // r.l
    public void a(Menu menu, j.a aVar) {
        t();
        this.f1355e.a(menu, aVar);
    }

    @Override // r.l
    public boolean b() {
        t();
        return this.f1355e.b();
    }

    @Override // r.l
    public void c() {
        t();
        this.f1355e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // r.l
    public boolean d() {
        t();
        return this.f1355e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1356f == null || this.f1357g) {
            return;
        }
        int bottom = this.f1354d.getVisibility() == 0 ? (int) (this.f1354d.getBottom() + this.f1354d.getTranslationY() + 0.5f) : 0;
        this.f1356f.setBounds(0, bottom, getWidth(), this.f1356f.getIntrinsicHeight() + bottom);
        this.f1356f.draw(canvas);
    }

    @Override // r.l
    public boolean f() {
        t();
        return this.f1355e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // r.l
    public boolean g() {
        t();
        return this.f1355e.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1354d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        t();
        return this.f1355e.getTitle();
    }

    @Override // r.l
    public boolean h() {
        t();
        return this.f1355e.h();
    }

    @Override // r.l
    public void i(int i10) {
        t();
        if (i10 == 2) {
            this.f1355e.v();
        } else if (i10 == 5) {
            this.f1355e.w();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // r.l
    public void j() {
        t();
        this.f1355e.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void o() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        t();
        androidx.core.view.o oVarX = androidx.core.view.o.x(windowInsets, this);
        boolean zK = k(this.f1354d, new Rect(oVarX.j(), oVarX.l(), oVarX.k(), oVarX.i()), true, true, false, true);
        androidx.core.view.h.d(this, oVarX, this.f1364n);
        Rect rect = this.f1364n;
        androidx.core.view.o oVarM = oVarX.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f1371u = oVarM;
        boolean z10 = true;
        if (!this.f1372v.equals(oVarM)) {
            this.f1372v = this.f1371u;
            zK = true;
        }
        if (this.f1365o.equals(this.f1364n)) {
            z10 = zK;
        } else {
            this.f1365o.set(this.f1364n);
        }
        if (z10) {
            requestLayout();
        }
        return oVarX.a().c().b().v();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p(getContext());
        androidx.core.view.h.T(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        androidx.core.view.o oVarA;
        t();
        measureChildWithMargins(this.f1354d, i10, 0, i11, 0);
        e eVar = (e) this.f1354d.getLayoutParams();
        int iMax = Math.max(0, this.f1354d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f1354d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1354d.getMeasuredState());
        boolean z10 = (androidx.core.view.h.B(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f1351a;
            if (this.f1359i && this.f1354d.getTabContainer() != null) {
                measuredHeight += this.f1351a;
            }
        } else {
            measuredHeight = this.f1354d.getVisibility() != 8 ? this.f1354d.getMeasuredHeight() : 0;
        }
        this.f1366p.set(this.f1364n);
        androidx.core.view.o oVar = this.f1371u;
        this.f1373w = oVar;
        if (this.f1358h || z10) {
            oVarA = new o.b(this.f1373w).d(androidx.core.graphics.a.b(oVar.j(), this.f1373w.l() + measuredHeight, this.f1373w.k(), this.f1373w.i() + 0)).a();
        } else {
            Rect rect = this.f1366p;
            rect.top += measuredHeight;
            rect.bottom += 0;
            oVarA = oVar.m(0, measuredHeight, 0, 0);
        }
        this.f1373w = oVarA;
        k(this.f1353c, this.f1366p, true, true, true, true);
        if (!this.f1374x.equals(this.f1373w)) {
            androidx.core.view.o oVar2 = this.f1373w;
            this.f1374x = oVar2;
            androidx.core.view.h.e(this.f1353c, oVar2);
        }
        measureChildWithMargins(this.f1353c, i10, 0, i11, 0);
        e eVar2 = (e) this.f1353c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1353c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1353c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1353c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f1360j || !z10) {
            return false;
        }
        if (v(f11)) {
            e();
        } else {
            u();
        }
        this.f1361k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // o3.e0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1362l + i11;
        this.f1362l = i14;
        setActionBarHideOffset(i14);
    }

    @Override // o3.e0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // o3.f0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        onNestedScroll(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.E.b(view, view2, i10);
        this.f1362l = getActionBarHideOffset();
        o();
        d dVar = this.f1375y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // o3.e0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1354d.getVisibility() != 0) {
            return false;
        }
        return this.f1360j;
    }

    @Override // o3.e0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f1360j && !this.f1361k) {
            if (this.f1362l <= this.f1354d.getHeight()) {
                s();
            } else {
                r();
            }
        }
        d dVar = this.f1375y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // o3.e0
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        t();
        int i11 = this.f1363m ^ i10;
        this.f1363m = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.f1375y;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.f1375y.a();
            } else {
                this.f1375y.d();
            }
        }
        if ((i11 & 256) == 0 || this.f1375y == null) {
            return;
        }
        androidx.core.view.h.T(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1352b = i10;
        d dVar = this.f1375y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    public boolean q() {
        return this.f1358h;
    }

    public void setActionBarHideOffset(int i10) {
        o();
        this.f1354d.setTranslationY(-Math.max(0, Math.min(i10, this.f1354d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1375y = dVar;
        if (getWindowToken() != null) {
            this.f1375y.onWindowVisibilityChanged(this.f1352b);
            int i10 = this.f1363m;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                androidx.core.view.h.T(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1359i = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1360j) {
            this.f1360j = z10;
            if (z10) {
                return;
            }
            o();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        t();
        this.f1355e.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        t();
        this.f1355e.setIcon(drawable);
    }

    public void setLogo(int i10) {
        t();
        this.f1355e.n(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f1358h = z10;
        this.f1357g = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // r.l
    public void setWindowCallback(Window.Callback callback) {
        t();
        this.f1355e.setWindowCallback(callback);
    }

    @Override // r.l
    public void setWindowTitle(CharSequence charSequence) {
        t();
        this.f1355e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void t() {
        if (this.f1353c == null) {
            this.f1353c = (ContentFrameLayout) findViewById(j.f.f13408b);
            this.f1354d = (ActionBarContainer) findViewById(j.f.f13409c);
            this.f1355e = n(findViewById(j.f.f13407a));
        }
    }
}
