package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements o3.k {
    private ColorStateList A;
    private boolean B;
    private boolean C;
    private final ArrayList<View> D;
    private final ArrayList<View> E;
    private final int[] F;
    final o3.n G;
    private ArrayList<MenuItem> H;
    h I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ActionMenuView f1512a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final ActionMenuView.e f1513a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f1514b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private s0 f1515b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f1516c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private androidx.appcompat.widget.c f1517c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageButton f1518d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private f f1519d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f1520e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private j.a f1521e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1522f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    e.a f1523f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f1524g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f1525g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ImageButton f1526h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private OnBackInvokedCallback f1527h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    View f1528i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private OnBackInvokedDispatcher f1529i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f1530j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f1531j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1532k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final Runnable f1533k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f1536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1540r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1541s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private k0 f1542t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1543u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f1544v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1545w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f1546x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f1547y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ColorStateList f1548z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.G.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.I;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    class c implements e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e.a aVar = Toolbar.this.f1523f0;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f1512a.F()) {
                Toolbar.this.G.k(eVar);
            }
            e.a aVar = Toolbar.this.f1523f0;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: r.x
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.e f1553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f1554b;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void d(boolean z10) {
            if (this.f1554b != null) {
                androidx.appcompat.view.menu.e eVar = this.f1553a;
                boolean z11 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        if (this.f1553a.getItem(i10) == this.f1554b) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    return;
                }
                f(this.f1553a, this.f1554b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f1528i;
            if (callback instanceof p.c) {
                ((p.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1528i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1526h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1528i = null;
            toolbar3.a();
            this.f1554b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1526h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1526h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1526h);
            }
            Toolbar.this.f1528i = gVar.getActionView();
            this.f1554b = gVar;
            ViewParent parent2 = Toolbar.this.f1528i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1528i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f955a = 8388611 | (toolbar4.f1536n & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
                gVarGenerateDefaultLayoutParams.f1556b = 2;
                toolbar4.f1528i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1528i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f1528i;
            if (callback instanceof p.c) {
                ((p.c) callback).onActionViewExpanded();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1553a;
            if (eVar2 != null && (gVar = this.f1554b) != null) {
                eVar2.f(gVar);
            }
            this.f1553a = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.m mVar) {
            return false;
        }
    }

    public static class g extends a.C0025a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1556b;

        public g(int i10, int i11) {
            super(i10, i11);
            this.f1556b = 0;
            this.f955a = 8388627;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1556b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1556b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1556b = 0;
            a(marginLayoutParams);
        }

        public g(a.C0025a c0025a) {
            super(c0025a);
            this.f1556b = 0;
        }

        public g(g gVar) {
            super((a.C0025a) gVar);
            this.f1556b = 0;
            this.f1556b = gVar.f1556b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class i extends y3.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f1558d;

        class a implements Parcelable.ClassLoaderCreator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1557c = parcel.readInt();
            this.f1558d = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // y3.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1557c);
            parcel.writeInt(this.f1558d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j.a.N);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1545w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.G = new o3.n(new Runnable() { // from class: r.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f19129a.y();
            }
        });
        this.H = new ArrayList<>();
        this.f1513a0 = new a();
        this.f1533k0 = new b();
        Context context2 = getContext();
        int[] iArr = j.j.f13491d3;
        r0 r0VarU = r0.u(context2, attributeSet, iArr, i10, 0);
        androidx.core.view.h.U(this, context, iArr, attributeSet, r0VarU.q(), i10, 0);
        this.f1534l = r0VarU.m(j.j.F3, 0);
        this.f1535m = r0VarU.m(j.j.f13586w3, 0);
        this.f1545w = r0VarU.k(j.j.f13496e3, this.f1545w);
        this.f1536n = r0VarU.k(j.j.f13501f3, 48);
        int iD = r0VarU.d(j.j.f13601z3, 0);
        int i11 = j.j.E3;
        iD = r0VarU.r(i11) ? r0VarU.d(i11, iD) : iD;
        this.f1541s = iD;
        this.f1540r = iD;
        this.f1539q = iD;
        this.f1538p = iD;
        int iD2 = r0VarU.d(j.j.C3, -1);
        if (iD2 >= 0) {
            this.f1538p = iD2;
        }
        int iD3 = r0VarU.d(j.j.B3, -1);
        if (iD3 >= 0) {
            this.f1539q = iD3;
        }
        int iD4 = r0VarU.d(j.j.D3, -1);
        if (iD4 >= 0) {
            this.f1540r = iD4;
        }
        int iD5 = r0VarU.d(j.j.A3, -1);
        if (iD5 >= 0) {
            this.f1541s = iD5;
        }
        this.f1537o = r0VarU.e(j.j.f13556q3, -1);
        int iD6 = r0VarU.d(j.j.f13536m3, Integer.MIN_VALUE);
        int iD7 = r0VarU.d(j.j.f13516i3, Integer.MIN_VALUE);
        int iE = r0VarU.e(j.j.f13526k3, 0);
        int iE2 = r0VarU.e(j.j.f13531l3, 0);
        h();
        this.f1542t.e(iE, iE2);
        if (iD6 != Integer.MIN_VALUE || iD7 != Integer.MIN_VALUE) {
            this.f1542t.g(iD6, iD7);
        }
        this.f1543u = r0VarU.d(j.j.f13541n3, Integer.MIN_VALUE);
        this.f1544v = r0VarU.d(j.j.f13521j3, Integer.MIN_VALUE);
        this.f1522f = r0VarU.f(j.j.f13511h3);
        this.f1524g = r0VarU.o(j.j.f13506g3);
        CharSequence charSequenceO = r0VarU.o(j.j.f13596y3);
        if (!TextUtils.isEmpty(charSequenceO)) {
            setTitle(charSequenceO);
        }
        CharSequence charSequenceO2 = r0VarU.o(j.j.f13581v3);
        if (!TextUtils.isEmpty(charSequenceO2)) {
            setSubtitle(charSequenceO2);
        }
        this.f1530j = getContext();
        setPopupTheme(r0VarU.m(j.j.f13576u3, 0));
        Drawable drawableF = r0VarU.f(j.j.f13571t3);
        if (drawableF != null) {
            setNavigationIcon(drawableF);
        }
        CharSequence charSequenceO3 = r0VarU.o(j.j.f13566s3);
        if (!TextUtils.isEmpty(charSequenceO3)) {
            setNavigationContentDescription(charSequenceO3);
        }
        Drawable drawableF2 = r0VarU.f(j.j.f13546o3);
        if (drawableF2 != null) {
            setLogo(drawableF2);
        }
        CharSequence charSequenceO4 = r0VarU.o(j.j.f13551p3);
        if (!TextUtils.isEmpty(charSequenceO4)) {
            setLogoDescription(charSequenceO4);
        }
        int i12 = j.j.G3;
        if (r0VarU.r(i12)) {
            setTitleTextColor(r0VarU.c(i12));
        }
        int i13 = j.j.f13591x3;
        if (r0VarU.r(i13)) {
            setSubtitleTextColor(r0VarU.c(i13));
        }
        int i14 = j.j.f13561r3;
        if (r0VarU.r(i14)) {
            x(r0VarU.m(i14, 0));
        }
        r0VarU.v();
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.G.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f1533k0);
        post(this.f1533k0);
    }

    private boolean O() {
        if (!this.f1525g0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z10 = androidx.core.view.h.t(this) == 1;
        int childCount = getChildCount();
        int iA = o3.h.a(i10, androidx.core.view.h.t(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1556b == 0 && P(childAt) && p(gVar.f955a) == iA) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1556b == 0 && P(childAt2) && p(gVar2.f955a) == iA) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        gVarGenerateDefaultLayoutParams.f1556b = 1;
        if (!z10 || this.f1528i == null) {
            addView(view, gVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.E.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new p.f(getContext());
    }

    private void h() {
        if (this.f1542t == null) {
            this.f1542t = new k0();
        }
    }

    private void i() {
        if (this.f1520e == null) {
            this.f1520e = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1512a.J() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1512a.getMenu();
            if (this.f1519d0 == null) {
                this.f1519d0 = new f();
            }
            this.f1512a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f1519d0, this.f1530j);
            R();
        }
    }

    private void k() {
        if (this.f1512a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1512a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1532k);
            this.f1512a.setOnMenuItemClickListener(this.f1513a0);
            this.f1512a.K(this.f1521e0, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f955a = 8388613 | (this.f1536n & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            this.f1512a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f1512a, false);
        }
    }

    private void l() {
        if (this.f1518d == null) {
            this.f1518d = new p(getContext(), null, j.a.M);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f955a = 8388611 | (this.f1536n & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            this.f1518d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int iT = androidx.core.view.h.t(this);
        int iA = o3.h.a(i10, iT) & 7;
        return (iA == 1 || iA == 3 || iA == 5) ? iA : iT == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iR = r(gVar.f955a);
        if (iR == 48) {
            return getPaddingTop() - i11;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i10) {
        int i11 = i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1545w & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return o3.j.b(marginLayoutParams) + o3.j.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1512a;
        return actionMenuView != null && actionMenuView.E();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1512a;
        return actionMenuView != null && actionMenuView.F();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f1556b != 2 && childAt != this.f1512a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f1542t.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f1512a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e eVarJ = this.f1512a.J();
        if (eVarJ == eVar) {
            return;
        }
        if (eVarJ != null) {
            eVarJ.O(this.f1517c0);
            eVarJ.O(this.f1519d0);
        }
        if (this.f1519d0 == null) {
            this.f1519d0 = new f();
        }
        cVar.G(true);
        if (eVar != null) {
            eVar.c(cVar, this.f1530j);
            eVar.c(this.f1519d0, this.f1530j);
        } else {
            cVar.i(this.f1530j, null);
            this.f1519d0.i(this.f1530j, null);
            cVar.d(true);
            this.f1519d0.d(true);
        }
        this.f1512a.setPopupTheme(this.f1532k);
        this.f1512a.setPresenter(cVar);
        this.f1517c0 = cVar;
        R();
    }

    public void L(j.a aVar, e.a aVar2) {
        this.f1521e0 = aVar;
        this.f1523f0 = aVar2;
        ActionMenuView actionMenuView = this.f1512a;
        if (actionMenuView != null) {
            actionMenuView.K(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f1535m = i10;
        TextView textView = this.f1516c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f1534l = i10;
        TextView textView = this.f1514b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f1512a;
        return actionMenuView != null && actionMenuView.L();
    }

    void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = v() && onBackInvokedDispatcherA != null && androidx.core.view.h.G(this) && this.f1531j0;
            if (z10 && this.f1529i0 == null) {
                if (this.f1527h0 == null) {
                    this.f1527h0 = e.b(new Runnable() { // from class: r.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f19130a.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f1527h0);
            } else {
                if (z10 || (onBackInvokedDispatcher = this.f1529i0) == null) {
                    return;
                }
                e.d(onBackInvokedDispatcher, this.f1527h0);
                onBackInvokedDispatcherA = null;
            }
            this.f1529i0 = onBackInvokedDispatcherA;
        }
    }

    void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView(this.E.get(size));
        }
        this.E.clear();
    }

    @Override // o3.k
    public void addMenuProvider(o3.b0 b0Var) {
        this.G.c(b0Var);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1512a) != null && actionMenuView.G();
    }

    public void e() {
        f fVar = this.f1519d0;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f1554b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1512a;
        if (actionMenuView != null) {
            actionMenuView.x();
        }
    }

    void g() {
        if (this.f1526h == null) {
            p pVar = new p(getContext(), null, j.a.M);
            this.f1526h = pVar;
            pVar.setImageDrawable(this.f1522f);
            this.f1526h.setContentDescription(this.f1524g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f955a = 8388611 | (this.f1536n & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
            gVarGenerateDefaultLayoutParams.f1556b = 2;
            this.f1526h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f1526h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1526h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1526h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        k0 k0Var = this.f1542t;
        if (k0Var != null) {
            return k0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1544v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        k0 k0Var = this.f1542t;
        if (k0Var != null) {
            return k0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        k0 k0Var = this.f1542t;
        if (k0Var != null) {
            return k0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        k0 k0Var = this.f1542t;
        if (k0Var != null) {
            return k0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1543u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarJ;
        ActionMenuView actionMenuView = this.f1512a;
        return actionMenuView != null && (eVarJ = actionMenuView.J()) != null && eVarJ.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1544v, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.h.t(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.h.t(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1543u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1520e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1520e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1512a.getMenu();
    }

    View getNavButtonView() {
        return this.f1518d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1518d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1518d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.f1517c0;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1512a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1530j;
    }

    public int getPopupTheme() {
        return this.f1532k;
    }

    public CharSequence getSubtitle() {
        return this.f1547y;
    }

    final TextView getSubtitleTextView() {
        return this.f1516c;
    }

    public CharSequence getTitle() {
        return this.f1546x;
    }

    public int getTitleMarginBottom() {
        return this.f1541s;
    }

    public int getTitleMarginEnd() {
        return this.f1539q;
    }

    public int getTitleMarginStart() {
        return this.f1538p;
    }

    public int getTitleMarginTop() {
        return this.f1540r;
    }

    final TextView getTitleTextView() {
        return this.f1514b;
    }

    public r.m getWrapper() {
        if (this.f1515b0 == null) {
            this.f1515b0 = new s0(this, true);
        }
        return this.f1515b0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0025a ? new g((a.C0025a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1533k0);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.F;
        boolean zB = z0.b(this);
        int i12 = !zB ? 1 : 0;
        if (P(this.f1518d)) {
            F(this.f1518d, i10, 0, i11, 0, this.f1537o);
            measuredWidth = this.f1518d.getMeasuredWidth() + s(this.f1518d);
            iMax = Math.max(0, this.f1518d.getMeasuredHeight() + t(this.f1518d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1518d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (P(this.f1526h)) {
            F(this.f1526h, i10, 0, i11, 0, this.f1537o);
            measuredWidth = this.f1526h.getMeasuredWidth() + s(this.f1526h);
            iMax = Math.max(iMax, this.f1526h.getMeasuredHeight() + t(this.f1526h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1526h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (P(this.f1512a)) {
            F(this.f1512a, i10, iMax3, i11, 0, this.f1537o);
            measuredWidth2 = this.f1512a.getMeasuredWidth() + s(this.f1512a);
            iMax = Math.max(iMax, this.f1512a.getMeasuredHeight() + t(this.f1512a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1512a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (P(this.f1528i)) {
            iMax4 += E(this.f1528i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1528i.getMeasuredHeight() + t(this.f1528i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1528i.getMeasuredState());
        }
        if (P(this.f1520e)) {
            iMax4 += E(this.f1520e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f1520e.getMeasuredHeight() + t(this.f1520e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1520e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f1556b == 0 && P(childAt)) {
                iMax4 += E(childAt, i10, iMax4, i11, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i14 = this.f1540r + this.f1541s;
        int i15 = this.f1538p + this.f1539q;
        if (P(this.f1514b)) {
            E(this.f1514b, i10, iMax4 + i15, i11, i14, iArr);
            int measuredWidth3 = this.f1514b.getMeasuredWidth() + s(this.f1514b);
            measuredHeight = this.f1514b.getMeasuredHeight() + t(this.f1514b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1514b.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (P(this.f1516c)) {
            iMax2 = Math.max(iMax2, E(this.f1516c, i10, iMax4 + i15, i11, measuredHeight + i14, iArr));
            measuredHeight += this.f1516c.getMeasuredHeight() + t(this.f1516c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1516c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f1512a;
        androidx.appcompat.view.menu.e eVarJ = actionMenuView != null ? actionMenuView.J() : null;
        int i10 = iVar.f1557c;
        if (i10 != 0 && this.f1519d0 != null && eVarJ != null && (menuItemFindItem = eVarJ.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f1558d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        this.f1542t.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f1519d0;
        if (fVar != null && (gVar = fVar.f1554b) != null) {
            iVar.f1557c = gVar.getItemId();
        }
        iVar.f1558d = B();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    @Override // o3.k
    public void removeMenuProvider(o3.b0 b0Var) {
        this.G.l(b0Var);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f1531j0 != z10) {
            this.f1531j0 = z10;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1526h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(l.a.b(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1526h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f1526h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f1522f);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.f1525g0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1544v) {
            this.f1544v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1543u) {
            this.f1543u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(l.a.b(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f1520e)) {
                c(this.f1520e, true);
            }
        } else {
            ImageView imageView = this.f1520e;
            if (imageView != null && z(imageView)) {
                removeView(this.f1520e);
                this.E.remove(this.f1520e);
            }
        }
        ImageView imageView2 = this.f1520e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1520e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1518d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            t0.a(this.f1518d, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(l.a.b(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f1518d)) {
                c(this.f1518d, true);
            }
        } else {
            ImageButton imageButton = this.f1518d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f1518d);
                this.E.remove(this.f1518d);
            }
        }
        ImageButton imageButton2 = this.f1518d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1518d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.I = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1512a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1532k != i10) {
            this.f1532k = i10;
            if (i10 == 0) {
                this.f1530j = getContext();
            } else {
                this.f1530j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1516c;
            if (textView != null && z(textView)) {
                removeView(this.f1516c);
                this.E.remove(this.f1516c);
            }
        } else {
            if (this.f1516c == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f1516c = zVar;
                zVar.setSingleLine();
                this.f1516c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1535m;
                if (i10 != 0) {
                    this.f1516c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1516c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1516c)) {
                c(this.f1516c, true);
            }
        }
        TextView textView2 = this.f1516c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1547y = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1516c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1514b;
            if (textView != null && z(textView)) {
                removeView(this.f1514b);
                this.E.remove(this.f1514b);
            }
        } else {
            if (this.f1514b == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f1514b = zVar;
                zVar.setSingleLine();
                this.f1514b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1534l;
                if (i10 != 0) {
                    this.f1514b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1548z;
                if (colorStateList != null) {
                    this.f1514b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1514b)) {
                c(this.f1514b, true);
            }
        }
        TextView textView2 = this.f1514b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1546x = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.f1541s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1539q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1538p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1540r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1548z = colorStateList;
        TextView textView = this.f1514b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        f fVar = this.f1519d0;
        return (fVar == null || fVar.f1554b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1512a;
        return actionMenuView != null && actionMenuView.D();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator<MenuItem> it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        G();
    }
}
