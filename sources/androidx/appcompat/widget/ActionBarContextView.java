package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f1337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f1338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f1339k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f1340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f1341m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LinearLayout f1342n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f1343o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f1344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1348t;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p.b f1349a;

        a(p.b bVar) {
            this.f1349a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1349a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a.f13340j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0 r0VarU = r0.u(context, attributeSet, j.j.f13592y, i10, 0);
        androidx.core.view.h.Z(this, r0VarU.f(j.j.f13597z));
        this.f1345q = r0VarU.m(j.j.D, 0);
        this.f1346r = r0VarU.m(j.j.C, 0);
        this.f1568e = r0VarU.l(j.j.B, 0);
        this.f1348t = r0VarU.m(j.j.A, j.g.f13436d);
        r0VarU.v();
    }

    private void i() {
        if (this.f1342n == null) {
            LayoutInflater.from(getContext()).inflate(j.g.f13433a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1342n = linearLayout;
            this.f1343o = (TextView) linearLayout.findViewById(j.f.f13411e);
            this.f1344p = (TextView) this.f1342n.findViewById(j.f.f13410d);
            if (this.f1345q != 0) {
                this.f1343o.setTextAppearance(getContext(), this.f1345q);
            }
            if (this.f1346r != 0) {
                this.f1344p.setTextAppearance(getContext(), this.f1346r);
            }
        }
        this.f1343o.setText(this.f1337i);
        this.f1344p.setText(this.f1338j);
        boolean z10 = !TextUtils.isEmpty(this.f1337i);
        boolean z11 = !TextUtils.isEmpty(this.f1338j);
        int i10 = 0;
        this.f1344p.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1342n;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f1342n.getParent() == null) {
            addView(this.f1342n);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ androidx.core.view.l f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f1339k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1338j;
    }

    public CharSequence getTitle() {
        return this.f1337i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(p.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1339k
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1348t
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1339k = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f1339k
            goto L15
        L22:
            android.view.View r0 = r3.f1339k
            int r1 = j.f.f13415i
            android.view.View r0 = r0.findViewById(r1)
            r3.f1340l = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.e) r4
            androidx.appcompat.widget.c r0 = r3.f1567d
            if (r0 == 0) goto L41
            r0.y()
        L41:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1567d = r0
            r1 = 1
            r0.J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f1567d
            android.content.Context r2 = r3.f1565b
            r4.c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f1567d
            androidx.appcompat.view.menu.k r4 = r4.o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f1566c = r4
            r1 = 0
            androidx.core.view.h.Z(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1566c
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(p.b):void");
    }

    public boolean j() {
        return this.f1347s;
    }

    public void k() {
        removeAllViews();
        this.f1341m = null;
        this.f1566c = null;
        this.f1567d = null;
        View view = this.f1340l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f1567d;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1567d;
        if (cVar != null) {
            cVar.B();
            this.f1567d.C();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = z0.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1339k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1339k.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = androidx.appcompat.widget.a.d(paddingRight, i14, zB);
            paddingRight = androidx.appcompat.widget.a.d(iD + e(this.f1339k, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f1342n;
        if (linearLayout != null && this.f1341m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f1342n, iE, paddingTop, paddingTop2, zB);
        }
        int i16 = iE;
        View view2 = this.f1341m;
        if (view2 != null) {
            e(view2, i16, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1566c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f1568e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f1339k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1339k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1566c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f1566c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f1342n;
        if (linearLayout != null && this.f1341m == null) {
            if (this.f1347s) {
                this.f1342n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1342n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f1342n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f1341m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f1341m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f1568e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f1568e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1341m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1341m = view;
        if (view != null && (linearLayout = this.f1342n) != null) {
            removeView(linearLayout);
            this.f1342n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1338j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1337i = charSequence;
        i();
        androidx.core.view.h.Y(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1347s) {
            requestLayout();
        }
        this.f1347s = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
