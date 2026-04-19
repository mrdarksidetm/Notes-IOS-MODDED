package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f1677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f1679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f1680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f1681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f1684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1685o;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public f0(Context context) {
        this(context, null);
    }

    public f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1671a = true;
        this.f1672b = -1;
        this.f1673c = 0;
        this.f1675e = 8388659;
        int[] iArr = j.j.f13474a1;
        r0 r0VarU = r0.u(context, attributeSet, iArr, i10, 0);
        androidx.core.view.h.U(this, context, iArr, attributeSet, r0VarU.q(), i10, 0);
        int iJ = r0VarU.j(j.j.f13484c1, -1);
        if (iJ >= 0) {
            setOrientation(iJ);
        }
        int iJ2 = r0VarU.j(j.j.f13479b1, -1);
        if (iJ2 >= 0) {
            setGravity(iJ2);
        }
        boolean zA = r0VarU.a(j.j.f13489d1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f1677g = r0VarU.h(j.j.f13499f1, -1.0f);
        this.f1672b = r0VarU.j(j.j.f13494e1, -1);
        this.f1678h = r0VarU.a(j.j.f13514i1, false);
        setDividerDrawable(r0VarU.f(j.j.f13504g1));
        this.f1684n = r0VarU.j(j.j.f13519j1, 0);
        this.f1685o = r0VarU.e(j.j.f13509h1, 0);
        r0VarU.v();
    }

    private void g(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View viewO = o(i12);
            if (viewO.getVisibility() != 8) {
                a aVar = (a) viewO.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewO.getMeasuredWidth();
                    measureChildWithMargins(viewO, i11, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i13;
                }
            }
        }
    }

    private void h(int i10, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View viewO = o(i12);
            if (viewO.getVisibility() != 8) {
                a aVar = (a) viewO.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewO.getMeasuredHeight();
                    measureChildWithMargins(viewO, iMakeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    private void w(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    void c(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = z0.b(this);
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewO = o(i10);
            if (viewO != null && viewO.getVisibility() != 8 && p(i10)) {
                a aVar = (a) viewO.getLayoutParams();
                f(canvas, zB ? viewO.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewO.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1682l);
            }
        }
        if (p(virtualChildCount)) {
            View viewO2 = o(virtualChildCount - 1);
            if (viewO2 != null) {
                a aVar2 = (a) viewO2.getLayoutParams();
                if (zB) {
                    left = viewO2.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.f1682l;
                } else {
                    right = viewO2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.f1682l;
            }
            f(canvas, right);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void d(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewO = o(i10);
            if (viewO != null && viewO.getVisibility() != 8 && p(i10)) {
                e(canvas, (viewO.getTop() - ((LinearLayout.LayoutParams) ((a) viewO.getLayoutParams())).topMargin) - this.f1683m);
            }
        }
        if (p(virtualChildCount)) {
            View viewO2 = o(virtualChildCount - 1);
            e(canvas, viewO2 == null ? (getHeight() - getPaddingBottom()) - this.f1683m : viewO2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewO2.getLayoutParams())).bottomMargin);
        }
    }

    void e(Canvas canvas, int i10) {
        this.f1681k.setBounds(getPaddingLeft() + this.f1685o, i10, (getWidth() - getPaddingRight()) - this.f1685o, this.f1683m + i10);
        this.f1681k.draw(canvas);
    }

    void f(Canvas canvas, int i10) {
        this.f1681k.setBounds(i10, getPaddingTop() + this.f1685o, this.f1682l + i10, (getHeight() - getPaddingBottom()) - this.f1685o);
        this.f1681k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1672b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1672b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1672b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1673c;
        if (this.f1674d == 1 && (i10 = this.f1675e & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1676f) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1676f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1672b;
    }

    public Drawable getDividerDrawable() {
        return this.f1681k;
    }

    public int getDividerPadding() {
        return this.f1685o;
    }

    public int getDividerWidth() {
        return this.f1682l;
    }

    public int getGravity() {
        return this.f1675e;
    }

    public int getOrientation() {
        return this.f1674d;
    }

    public int getShowDividers() {
        return this.f1684n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1677g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1674d;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    int l(View view, int i10) {
        return 0;
    }

    int m(View view) {
        return 0;
    }

    int n(View view) {
        return 0;
    }

    View o(int i10) {
        return getChildAt(i10);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f1681k == null) {
            return;
        }
        if (this.f1674d == 1) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f1674d == 1) {
            r(i10, i11, i12, i13);
        } else {
            q(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f1674d == 1) {
            v(i10, i11);
        } else {
            t(i10, i11);
        }
    }

    protected boolean p(int i10) {
        if (i10 == 0) {
            return (this.f1684n & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f1684n & 4) != 0;
        }
        if ((this.f1684n & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void q(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.q(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void r(int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.r(int, int, int, int):void");
    }

    void s(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    public void setBaselineAligned(boolean z10) {
        this.f1671a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1672b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1681k) {
            return;
        }
        this.f1681k = drawable;
        if (drawable != null) {
            this.f1682l = drawable.getIntrinsicWidth();
            this.f1683m = drawable.getIntrinsicHeight();
        } else {
            this.f1682l = 0;
            this.f1683m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1685o = i10;
    }

    public void setGravity(int i10) {
        if (this.f1675e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i10 |= 48;
            }
            this.f1675e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1675e;
        if ((8388615 & i12) != i11) {
            this.f1675e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1678h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1674d != i10) {
            this.f1674d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1684n) {
            requestLayout();
        }
        this.f1684n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i12 = this.f1675e;
        if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != i11) {
            this.f1675e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1677g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03b1 A[PHI: r3
  0x03b1: PHI (r3v32 int) = (r3v28 int), (r3v33 int) binds: [B:168:0x03af, B:164:0x03a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void t(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 1272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.t(int, int):void");
    }

    int u(int i10) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02dc A[PHI: r10
  0x02dc: PHI (r10v21 int) = (r10v19 int), (r10v22 int) binds: [B:135:0x02da, B:131:0x02cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0329  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void v(int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f0.v(int, int):void");
    }
}
