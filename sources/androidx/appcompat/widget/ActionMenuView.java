package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.f0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends f0 implements e.b, androidx.appcompat.view.menu.k {
    e A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f1380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Context f1381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private androidx.appcompat.widget.c f1384t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private j.a f1385u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    e.a f1386v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f1387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f1388x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1389y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1390z;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends f0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1393c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1394d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1395e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f1396f;

        public c(int i10, int i11) {
            super(i10, i11);
            this.f1391a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1391a = cVar.f1391a;
        }
    }

    private class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f1386v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1389y = (int) (56.0f * f10);
        this.f1390z = (int) (f10 * 4.0f);
        this.f1381q = context;
        this.f1382r = 0;
    }

    static int H(View view, int i10, int i11, int i12, int i13) {
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = actionMenuItemView != null && actionMenuItemView.r();
        int i14 = 2;
        if (i11 <= 0 || (z10 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z10 || i15 >= 2) {
                i14 = i15;
            }
        }
        cVar.f1394d = !cVar.f1391a && z10;
        cVar.f1392b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), iMakeMeasureSpec);
        return i14;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void I(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i17 = size - paddingLeft;
        int i18 = this.f1389y;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = i18 + (i20 / i19);
        int childCount = getChildCount();
        int iMax = 0;
        int i22 = 0;
        boolean z13 = false;
        int i23 = 0;
        int iMax2 = 0;
        int i24 = 0;
        long j10 = 0;
        while (i22 < childCount) {
            View childAt = getChildAt(i22);
            int i25 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i26 = i23 + 1;
                if (z14) {
                    int i27 = this.f1390z;
                    i16 = i26;
                    r14 = 0;
                    childAt.setPadding(i27, 0, i27, 0);
                } else {
                    i16 = i26;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1396f = r14;
                cVar.f1393c = r14;
                cVar.f1392b = r14;
                cVar.f1394d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f1395e = z14 && ((ActionMenuItemView) childAt).r();
                int iH = H(childAt, i21, cVar.f1391a ? 1 : i19, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iH);
                if (cVar.f1394d) {
                    i24++;
                }
                if (cVar.f1391a) {
                    z13 = true;
                }
                i19 -= iH;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iH == 1) {
                    j10 |= (long) (1 << i22);
                    iMax = iMax;
                }
                i23 = i16;
            }
            i22++;
            size2 = i25;
        }
        int i28 = size2;
        boolean z15 = z13 && i23 == 2;
        boolean z16 = false;
        while (i24 > 0 && i19 > 0) {
            int i29 = Integer.MAX_VALUE;
            int i30 = 0;
            int i31 = 0;
            long j11 = 0;
            while (i31 < childCount) {
                boolean z17 = z16;
                c cVar2 = (c) getChildAt(i31).getLayoutParams();
                int i32 = iMax;
                if (cVar2.f1394d) {
                    int i33 = cVar2.f1392b;
                    if (i33 < i29) {
                        j11 = 1 << i31;
                        i29 = i33;
                        i30 = 1;
                    } else if (i33 == i29) {
                        i30++;
                        j11 |= 1 << i31;
                    }
                }
                i31++;
                iMax = i32;
                z16 = z17;
            }
            z10 = z16;
            i14 = iMax;
            j10 |= j11;
            if (i30 > i19) {
                i12 = mode;
                i13 = i17;
                break;
            }
            int i34 = i29 + 1;
            int i35 = 0;
            while (i35 < childCount) {
                View childAt2 = getChildAt(i35);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i36 = i17;
                int i37 = mode;
                long j12 = 1 << i35;
                if ((j11 & j12) == 0) {
                    if (cVar3.f1392b == i34) {
                        j10 |= j12;
                    }
                    z12 = z15;
                } else {
                    if (z15 && cVar3.f1395e && i19 == 1) {
                        int i38 = this.f1390z;
                        z12 = z15;
                        childAt2.setPadding(i38 + i21, 0, i38, 0);
                    } else {
                        z12 = z15;
                    }
                    cVar3.f1392b++;
                    cVar3.f1396f = true;
                    i19--;
                }
                i35++;
                mode = i37;
                i17 = i36;
                z15 = z12;
            }
            iMax = i14;
            z16 = true;
        }
        i12 = mode;
        i13 = i17;
        z10 = z16;
        i14 = iMax;
        boolean z18 = !z13 && i23 == 1;
        if (i19 <= 0 || j10 == 0 || (i19 >= i23 - 1 && !z18 && iMax2 <= 1)) {
            i15 = 0;
            z11 = z10;
        } else {
            float fBitCount = Long.bitCount(j10);
            if (z18) {
                i15 = 0;
            } else {
                i15 = 0;
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1395e) {
                    fBitCount -= 0.5f;
                }
                int i39 = childCount - 1;
                if ((j10 & ((long) (1 << i39))) != 0 && !((c) getChildAt(i39).getLayoutParams()).f1395e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i19 * i21) / fBitCount) : i15;
            z11 = z10;
            for (int i41 = i15; i41 < childCount; i41++) {
                if ((j10 & ((long) (1 << i41))) != 0) {
                    View childAt3 = getChildAt(i41);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1393c = i40;
                        cVar4.f1396f = true;
                        if (i41 == 0 && !cVar4.f1395e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i40) / 2;
                        }
                        z11 = true;
                    } else if (cVar4.f1391a) {
                        cVar4.f1393c = i40;
                        cVar4.f1396f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i40) / 2;
                        z11 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i40 / 2;
                        }
                    }
                }
            }
        }
        if (z11) {
            for (int i42 = i15; i42 < childCount; i42++) {
                View childAt4 = getChildAt(i42);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1396f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1392b * i21) + cVar5.f1393c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i13, i12 != 1073741824 ? i14 : i28);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.f0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c B() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f1391a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean C(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zA = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).b();
    }

    public boolean D() {
        androidx.appcompat.widget.c cVar = this.f1384t;
        return cVar != null && cVar.B();
    }

    public boolean E() {
        androidx.appcompat.widget.c cVar = this.f1384t;
        return cVar != null && cVar.D();
    }

    public boolean F() {
        androidx.appcompat.widget.c cVar = this.f1384t;
        return cVar != null && cVar.E();
    }

    public boolean G() {
        return this.f1383s;
    }

    public androidx.appcompat.view.menu.e J() {
        return this.f1380p;
    }

    public void K(j.a aVar, e.a aVar2) {
        this.f1385u = aVar;
        this.f1386v = aVar2;
    }

    public boolean L() {
        androidx.appcompat.widget.c cVar = this.f1384t;
        return cVar != null && cVar.K();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.f1380p.L(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f1380p = eVar;
    }

    @Override // androidx.appcompat.widget.f0, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1380p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f1380p = eVar;
            eVar.R(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f1384t = cVar;
            cVar.J(true);
            androidx.appcompat.widget.c cVar2 = this.f1384t;
            j.a bVar = this.f1385u;
            if (bVar == null) {
                bVar = new b();
            }
            cVar2.h(bVar);
            this.f1380p.c(this.f1384t, this.f1381q);
            this.f1384t.H(this);
        }
        return this.f1380p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1384t.A();
    }

    public int getPopupTheme() {
        return this.f1382r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f1384t;
        if (cVar != null) {
            cVar.d(false);
            if (this.f1384t.E()) {
                this.f1384t.B();
                this.f1384t.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
    }

    @Override // androidx.appcompat.widget.f0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f1387w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zB = z0.b(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1391a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (C(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    C(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1391a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1391a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = i27 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.f0, android.view.View
    protected void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = this.f1387w;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f1387w = z11;
        if (z10 != z11) {
            this.f1388x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1387w && (eVar = this.f1380p) != null && size != this.f1388x) {
            this.f1388x = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (this.f1387w && childCount > 0) {
            I(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1384t.G(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1384t.I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f1383s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f1382r != i10) {
            this.f1382r = i10;
            if (i10 == 0) {
                this.f1381q = getContext();
            } else {
                this.f1381q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f1384t = cVar;
        cVar.H(this);
    }

    public void x() {
        androidx.appcompat.widget.c cVar = this.f1384t;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.f0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.f0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
