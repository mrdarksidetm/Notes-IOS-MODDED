package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.f0;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Interpolator f1778j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Runnable f1779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f1780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    f0 f1781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Spinner f1782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f1784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1787i;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1788a;

        a(View view) {
            this.f1788a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            l0.this.smoothScrollTo(this.f1788a.getLeft() - ((l0.this.getWidth() - this.f1788a.getWidth()) / 2), 0);
            l0.this.f1779a = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return l0.this.f1781c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) l0.this.f1781c.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return l0.this.c((a.c) getItem(i10), true);
            }
            ((d) view).a((a.c) getItem(i10));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = l0.this.f1781c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = l0.this.f1781c.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f1792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a.c f1793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f1794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f1795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f1796e;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, a.c cVar, boolean z10) {
            int i10 = j.a.f13334d;
            super(context, null, i10);
            int[] iArr = {R.attr.background};
            this.f1792a = iArr;
            this.f1793b = cVar;
            r0 r0VarU = r0.u(context, null, iArr, i10, 0);
            if (r0VarU.r(0)) {
                setBackgroundDrawable(r0VarU.f(0));
            }
            r0VarU.v();
            if (z10) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f1793b = cVar;
            c();
        }

        public a.c b() {
            return this.f1793b;
        }

        public void c() {
            a.c cVar = this.f1793b;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f1796e = viewB;
                TextView textView = this.f1794c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1795d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1795d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1796e;
            if (view != null) {
                removeView(view);
                this.f1796e = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f1795d == null) {
                    r rVar = new r(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    rVar.setLayoutParams(layoutParams);
                    addView(rVar, 0);
                    this.f1795d = rVar;
                }
                this.f1795d.setImageDrawable(drawableC);
                this.f1795d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1795d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1795d.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(charSequenceD);
            if (z10) {
                if (this.f1794c == null) {
                    z zVar = new z(getContext(), null, j.a.f13335e);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.f1794c = zVar;
                }
                this.f1794c.setText(charSequenceD);
                this.f1794c.setVisibility(0);
            } else {
                TextView textView2 = this.f1794c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1794c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1795d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            t0.a(this, z10 ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (l0.this.f1784f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = l0.this.f1784f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        w wVar = new w(getContext(), null, j.a.f13338h);
        wVar.setLayoutParams(new f0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean d() {
        Spinner spinner = this.f1782d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f1782d == null) {
            this.f1782d = b();
        }
        removeView(this.f1781c);
        addView(this.f1782d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1782d.getAdapter() == null) {
            this.f1782d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1779a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1779a = null;
        }
        this.f1782d.setSelection(this.f1787i);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f1782d);
        addView(this.f1781c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1782d.getSelectedItemPosition());
        return false;
    }

    public void a(int i10) {
        View childAt = this.f1781c.getChildAt(i10);
        Runnable runnable = this.f1779a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1779a = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z10) {
        d dVar = new d(getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1786h));
        } else {
            dVar.setFocusable(true);
            if (this.f1780b == null) {
                this.f1780b = new c();
            }
            dVar.setOnClickListener(this.f1780b);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1779a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p.a aVarB = p.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f1785g = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1779a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r8 = android.view.View.MeasureSpec.getMode(r7)
            r0 = 1
            r1 = 0
            r2 = 1073741824(0x40000000, float:2.0)
            if (r8 != r2) goto Lc
            r3 = r0
            goto Ld
        Lc:
            r3 = r1
        Ld:
            r6.setFillViewport(r3)
            androidx.appcompat.widget.f0 r4 = r6.f1781c
            int r4 = r4.getChildCount()
            if (r4 <= r0) goto L3e
            if (r8 == r2) goto L1e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r5) goto L3e
        L1e:
            r8 = 2
            if (r4 <= r8) goto L2e
            int r8 = android.view.View.MeasureSpec.getSize(r7)
            float r8 = (float) r8
            r4 = 1053609165(0x3ecccccd, float:0.4)
            float r8 = r8 * r4
            int r8 = (int) r8
            r6.f1784f = r8
            goto L35
        L2e:
            int r4 = android.view.View.MeasureSpec.getSize(r7)
            int r4 = r4 / r8
            r6.f1784f = r4
        L35:
            int r8 = r6.f1784f
            int r4 = r6.f1785g
            int r8 = java.lang.Math.min(r8, r4)
            goto L3f
        L3e:
            r8 = -1
        L3f:
            r6.f1784f = r8
            int r8 = r6.f1786h
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            if (r3 != 0) goto L4e
            boolean r2 = r6.f1783e
            if (r2 == 0) goto L4e
            goto L4f
        L4e:
            r0 = r1
        L4f:
            if (r0 == 0) goto L66
            androidx.appcompat.widget.f0 r0 = r6.f1781c
            r0.measure(r1, r8)
            androidx.appcompat.widget.f0 r0 = r6.f1781c
            int r0 = r0.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 <= r1) goto L66
            r6.e()
            goto L69
        L66:
            r6.f()
        L69:
            int r0 = r6.getMeasuredWidth()
            super.onMeasure(r7, r8)
            int r7 = r6.getMeasuredWidth()
            if (r3 == 0) goto L7d
            if (r0 == r7) goto L7d
            int r7 = r6.f1787i
            r6.setTabSelected(r7)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l0.onMeasure(int, int):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f1783e = z10;
    }

    public void setContentHeight(int i10) {
        this.f1786h = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1787i = i10;
        int childCount = this.f1781c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1781c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1782d;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
