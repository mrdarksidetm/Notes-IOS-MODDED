package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.h;
import com.google.android.gms.common.api.a;
import o3.c0;
import o3.d0;
import o3.f;
import o3.f0;
import o3.g0;
import p3.g;
import p3.l;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements f0 {
    private static final float D = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a E = new a();
    private static final int[] F = {R.attr.fillViewport};
    private d A;
    final c B;
    o3.e C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f3448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f3449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f3450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OverScroller f3451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f3452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f3453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f3457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f3458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f3459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f3460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f3461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f3462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f3463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f3464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f3465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int[] f3466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f3467t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f3468u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f3469v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private e f3470w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final g0 f3471x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final d0 f3472y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f3473z;

    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, AccessibilityEvent accessibilityEvent) {
            super.g(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            l.a(accessibilityEvent, nestedScrollView.getScrollX());
            l.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void h(View view, g gVar) {
            int scrollRange;
            super.h(view, gVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            gVar.e0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            gVar.C0(true);
            if (nestedScrollView.getScrollY() > 0) {
                gVar.b(g.a.f18206r);
                gVar.b(g.a.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                gVar.b(g.a.f18205q);
                gVar.b(g.a.E);
            }
        }

        @Override // androidx.core.view.a
        public boolean k(View view, int i10, Bundle bundle) {
            if (super.k(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.Q(0, iMax, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.Q(0, iMin, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    class c implements f {
        c() {
        }

        @Override // o3.f
        public boolean a(float f10) {
            if (f10 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.p((int) f10);
            return true;
        }

        @Override // o3.f
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // o3.f
        public void c() {
            NestedScrollView.this.f3451d.abortAnimation();
        }
    }

    public interface d {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3475a;

        class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        e(Parcel parcel) {
            super(parcel);
            this.f3475a = parcel.readInt();
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3475a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f3475a);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c3.a.f6313c);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3450c = new Rect();
        this.f3455h = true;
        this.f3456i = false;
        this.f3457j = null;
        this.f3458k = false;
        this.f3461n = true;
        this.f3465r = -1;
        this.f3466s = new int[2];
        this.f3467t = new int[2];
        c cVar = new c();
        this.B = cVar;
        this.C = new o3.e(getContext(), cVar);
        this.f3452e = androidx.core.widget.b.a(context, attributeSet);
        this.f3453f = androidx.core.widget.b.a(context, attributeSet);
        this.f3448a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        v();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f3471x = new g0(this);
        this.f3472y = new d0(this);
        setNestedScrollingEnabled(true);
        h.W(this, E);
    }

    private boolean A(View view, int i10, int i11) {
        view.getDrawingRect(this.f3450c);
        offsetDescendantRectToMyCoords(view, this.f3450c);
        return this.f3450c.bottom + i10 >= getScrollY() && this.f3450c.top - i10 <= getScrollY() + i11;
    }

    private void B(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3472y.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3465r) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f3454g = (int) motionEvent.getY(i10);
            this.f3465r = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f3459l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void F() {
        VelocityTracker velocityTracker = this.f3459l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3459l = null;
        }
    }

    private int G(int i10, float f10) {
        float fD;
        EdgeEffect edgeEffect;
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        float f11 = 0.0f;
        if (androidx.core.widget.b.b(this.f3452e) != 0.0f) {
            fD = -androidx.core.widget.b.d(this.f3452e, -height, width);
            if (androidx.core.widget.b.b(this.f3452e) == 0.0f) {
                edgeEffect = this.f3452e;
                edgeEffect.onRelease();
            }
            f11 = fD;
        } else if (androidx.core.widget.b.b(this.f3453f) != 0.0f) {
            fD = androidx.core.widget.b.d(this.f3453f, height, 1.0f - width);
            if (androidx.core.widget.b.b(this.f3453f) == 0.0f) {
                edgeEffect = this.f3453f;
                edgeEffect.onRelease();
            }
            f11 = fD;
        }
        int iRound = Math.round(f11 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private void H(boolean z10) {
        if (z10) {
            R(2, 1);
        } else {
            T(1);
        }
        this.f3469v = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean I(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View viewO = o(z11, i11, i12);
        if (viewO == null) {
            viewO = this;
        }
        if (i11 < scrollY || i12 > i13) {
            J(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (viewO != findFocus()) {
            viewO.requestFocus(i10);
        }
        return z10;
    }

    private int J(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        EdgeEffect edgeEffect;
        VelocityTracker velocityTracker;
        if (i12 == 1) {
            R(2, i12);
        }
        boolean z11 = false;
        if (i(0, i10, this.f3467t, this.f3466s, i12)) {
            i13 = i10 - this.f3467t[1];
            i14 = this.f3466s[1] + 0;
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = d() && !z10;
        boolean z13 = D(0, i13, 0, scrollY, 0, scrollRange, 0, 0, true) && !s(i12);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f3467t;
        iArr[1] = 0;
        j(0, scrollY2, 0, i13 - scrollY2, this.f3466s, i12, iArr);
        int i15 = i14 + this.f3466s[1];
        int i16 = i13 - this.f3467t[1];
        int i17 = scrollY + i16;
        if (i17 < 0) {
            if (z12) {
                androidx.core.widget.b.d(this.f3452e, (-i16) / getHeight(), i11 / getWidth());
                if (!this.f3453f.isFinished()) {
                    edgeEffect = this.f3453f;
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z12) {
            androidx.core.widget.b.d(this.f3453f, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.f3452e.isFinished()) {
                edgeEffect = this.f3452e;
                edgeEffect.onRelease();
            }
        }
        if (this.f3452e.isFinished() && this.f3453f.isFinished()) {
            z11 = z13;
        } else {
            postInvalidateOnAnimation();
        }
        if (z11 && i12 == 0 && (velocityTracker = this.f3459l) != null) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
            T(i12);
            this.f3452e.onRelease();
            this.f3453f.onRelease();
        }
        return i15;
    }

    private void K(View view) {
        view.getDrawingRect(this.f3450c);
        offsetDescendantRectToMyCoords(view, this.f3450c);
        int iG = g(this.f3450c);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    private boolean L(Rect rect, boolean z10) {
        int iG = g(rect);
        boolean z11 = iG != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iG);
            } else {
                N(0, iG);
            }
        }
        return z11;
    }

    private boolean M(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return r(-i10) < androidx.core.widget.b.b(edgeEffect) * ((float) getHeight());
    }

    private void O(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3449b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3451d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            H(z10);
        } else {
            if (!this.f3451d.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f3449b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean S(MotionEvent motionEvent) {
        boolean z10;
        if (androidx.core.widget.b.b(this.f3452e) != 0.0f) {
            androidx.core.widget.b.d(this.f3452e, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (androidx.core.widget.b.b(this.f3453f) == 0.0f) {
            return z10;
        }
        androidx.core.widget.b.d(this.f3453f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f3451d.abortAnimation();
        T(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int f(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private void k(int i10) {
        if (i10 != 0) {
            if (this.f3461n) {
                N(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean l(int i10) {
        EdgeEffect edgeEffect;
        if (androidx.core.widget.b.b(this.f3452e) != 0.0f) {
            if (M(this.f3452e, i10)) {
                edgeEffect = this.f3452e;
                edgeEffect.onAbsorb(i10);
            } else {
                i10 = -i10;
                p(i10);
            }
        } else {
            if (androidx.core.widget.b.b(this.f3453f) == 0.0f) {
                return false;
            }
            i10 = -i10;
            if (M(this.f3453f, i10)) {
                edgeEffect = this.f3453f;
                edgeEffect.onAbsorb(i10);
            }
            p(i10);
        }
        return true;
    }

    private void m() {
        this.f3465r = -1;
        this.f3458k = false;
        F();
        T(0);
        this.f3452e.onRelease();
        this.f3453f.onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View o(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            r9 = 1
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r2
        L29:
            if (r3 != 0) goto L2e
            r3 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r3.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r3.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r2
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r3 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r3 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.o(boolean, int, int):android.view.View");
    }

    private float r(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f3448a * 0.015f));
        float f10 = D;
        return (float) (((double) (this.f3448a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    private boolean t(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
    }

    private void u() {
        VelocityTracker velocityTracker = this.f3459l;
        if (velocityTracker == null) {
            this.f3459l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void v() {
        this.f3451d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3462o = viewConfiguration.getScaledTouchSlop();
        this.f3463p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3464q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void w() {
        if (this.f3459l == null) {
            this.f3459l = VelocityTracker.obtain();
        }
    }

    private void x(int i10, int i11) {
        this.f3454g = i10;
        this.f3465r = i11;
        R(2, 0);
    }

    private boolean y(View view) {
        return !A(view, 0, getHeight());
    }

    private static boolean z(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && z((View) parent, view2);
    }

    boolean D(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i18 = i12 + i10;
        int i19 = !z15 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z11 = true;
        } else if (i18 < i22) {
            z11 = true;
            i18 = i22;
        } else {
            z11 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z12 = true;
        } else if (i20 < i24) {
            z12 = true;
            i20 = i24;
        } else {
            z12 = false;
        }
        if (z12 && !s(1)) {
            this.f3451d.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z11, z12);
        return z11 || z12;
    }

    public boolean E(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f3450c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3450c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3450c.top = getScrollY() - height;
            Rect rect2 = this.f3450c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3450c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return I(i10, i11, i12);
    }

    public final void N(int i10, int i11) {
        O(i10, i11, 250, false);
    }

    void P(int i10, int i11, int i12, boolean z10) {
        O(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    void Q(int i10, int i11, boolean z10) {
        P(i10, i11, 250, z10);
    }

    public boolean R(int i10, int i11) {
        return this.f3472y.q(i10, i11);
    }

    public void T(int i10) {
        this.f3472y.s(i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean c(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !A(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            J(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f3450c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f3450c);
            J(g(this.f3450c), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && y(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f3451d.isFinished()) {
            return;
        }
        this.f3451d.computeScrollOffset();
        int currY = this.f3451d.getCurrY();
        int iH = h(currY - this.f3469v);
        this.f3469v = currY;
        int[] iArr = this.f3467t;
        boolean z10 = false;
        iArr[1] = 0;
        i(0, iH, iArr, null, 1);
        int i10 = iH - this.f3467t[1];
        int scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY = getScrollY();
            D(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.f3467t;
            iArr2[1] = 0;
            j(0, scrollY2, 0, i11, this.f3466s, 1, iArr2);
            i10 = i11 - this.f3467t[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i10 < 0) {
                    if (this.f3452e.isFinished()) {
                        edgeEffect = this.f3452e;
                        edgeEffect.onAbsorb((int) this.f3451d.getCurrVelocity());
                    }
                } else if (this.f3453f.isFinished()) {
                    edgeEffect = this.f3453f;
                    edgeEffect.onAbsorb((int) this.f3451d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f3451d.isFinished()) {
            T(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f3472y.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f3472y.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return i(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f3472y.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f3452e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f3452e.setSize(width, height);
            if (this.f3452e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f3453f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = 0 + getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f3453f.setSize(width2, height2);
        if (this.f3453f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    protected int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3471x.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.f3473z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3473z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3473z;
    }

    int h(int i10) {
        int height = getHeight();
        if (i10 > 0 && androidx.core.widget.b.b(this.f3452e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * androidx.core.widget.b.d(this.f3452e, ((-i10) * 4.0f) / height, 0.5f));
            if (iRound != i10) {
                this.f3452e.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || androidx.core.widget.b.b(this.f3453f) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.b.d(this.f3453f, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            this.f3453f.finish();
        }
        return i10 - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return s(0);
    }

    public boolean i(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f3472y.d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3472y.m();
    }

    public void j(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f3472y.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean n(KeyEvent keyEvent) {
        this.f3450c.setEmpty();
        int i10 = 130;
        if (!e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19) {
            if (keyCode != 20) {
                if (keyCode != 62) {
                    if (keyCode != 92) {
                        if (keyCode != 93) {
                            if (keyCode == 122) {
                                E(33);
                                return false;
                            }
                            if (keyCode != 123) {
                                return false;
                            }
                        }
                    }
                } else if (keyEvent.isShiftPressed()) {
                    i10 = 33;
                }
                E(i10);
                return false;
            }
            if (!keyEvent.isAltPressed()) {
                return c(130);
            }
            return q(130);
        }
        if (!keyEvent.isAltPressed()) {
            return c(33);
        }
        return q(33);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3456i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f3458k) {
            int i10 = 26;
            if (c0.a(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
                i10 = 9;
            } else if (c0.a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                axisValue = axisValue2;
            } else {
                width = 0;
                i10 = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                J(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, c0.a(motionEvent, 8194));
                if (i10 != 0) {
                    this.C.g(motionEvent, i10);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredHeight = 0;
        this.f3455h = false;
        View view = this.f3457j;
        if (view != null && z(view, this)) {
            K(this.f3457j);
        }
        this.f3457j = null;
        if (!this.f3456i) {
            if (this.f3470w != null) {
                scrollTo(getScrollX(), this.f3470w.f3475a);
                this.f3470w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3456i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3460m && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        p((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // o3.e0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        i(i10, i11, iArr, null, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        B(i13, 0, null);
    }

    @Override // o3.e0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        B(i13, i14, null);
    }

    @Override // o3.f0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        B(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // o3.e0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.f3471x.c(view, view2, i10, i11);
        R(2, i11);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i10) : focusFinder.findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || y(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f3470w = eVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f3475a = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        d dVar = this.A;
        if (dVar != null) {
            dVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !A(viewFindFocus, 0, i13)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f3450c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f3450c);
        k(g(this.f3450c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // o3.e0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // o3.e0
    public void onStopNestedScroll(View view, int i10) {
        this.f3471x.e(view, i10);
        T(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(int i10) {
        if (getChildCount() > 0) {
            this.f3451d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER, 0, 0);
            H(true);
        }
    }

    public boolean q(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f3450c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3450c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3450c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3450c;
        return I(i10, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f3455h) {
            this.f3457j = view2;
        } else {
            K(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return L(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            F();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3455h = true;
        super.requestLayout();
    }

    public boolean s(int i10) {
        return this.f3472y.l(i10);
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i10, width, width2);
            int iF2 = f(i11, height, height2);
            if (iF == getScrollX() && iF2 == getScrollY()) {
                return;
            }
            super.scrollTo(iF, iF2);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f3460m) {
            this.f3460m = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f3472y.n(z10);
    }

    public void setOnScrollChangeListener(d dVar) {
        this.A = dVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f3461n = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return R(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        T(0);
    }
}
