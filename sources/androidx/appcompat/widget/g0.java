package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.a;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class g0 implements q.e {
    private static Method G;
    private static Method H;
    private Runnable A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListAdapter f1691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d0 f1692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f1700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f1704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f1705p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1706q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DataSetObserver f1707r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f1708s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f1709t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AdapterView.OnItemClickListener f1710u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1711v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final i f1712w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final h f1713x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final g f1714y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final e f1715z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = g0.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            g0.this.b();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            d0 d0Var;
            if (i10 == -1 || (d0Var = g0.this.f1692c) == null) {
                return;
            }
            d0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (g0.this.a()) {
                g0.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            g0.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || g0.this.w() || g0.this.F.getContentView() == null) {
                return;
            }
            g0 g0Var = g0.this;
            g0Var.B.removeCallbacks(g0Var.f1712w);
            g0.this.f1712w.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = g0.this.F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < g0.this.F.getWidth() && y10 >= 0 && y10 < g0.this.F.getHeight()) {
                g0 g0Var = g0.this;
                g0Var.B.postDelayed(g0Var.f1712w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            g0 g0Var2 = g0.this;
            g0Var2.B.removeCallbacks(g0Var2.f1712w);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0 d0Var = g0.this.f1692c;
            if (d0Var == null || !androidx.core.view.h.G(d0Var) || g0.this.f1692c.getCount() <= g0.this.f1692c.getChildCount()) {
                return;
            }
            int childCount = g0.this.f1692c.getChildCount();
            g0 g0Var = g0.this;
            if (childCount <= g0Var.f1704o) {
                g0Var.F.setInputMethodMode(2);
                g0.this.b();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public g0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public g0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1693d = -2;
        this.f1694e = -2;
        this.f1697h = 1002;
        this.f1701l = 0;
        this.f1702m = false;
        this.f1703n = false;
        this.f1704o = a.e.API_PRIORITY_OTHER;
        this.f1706q = 0;
        this.f1712w = new i();
        this.f1713x = new h();
        this.f1714y = new g();
        this.f1715z = new e();
        this.C = new Rect();
        this.f1690a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.j.f13529l1, i10, i11);
        this.f1695f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.j.f13534m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.j.f13539n1, 0);
        this.f1696g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1698i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        t tVar = new t(context, attributeSet, i10, i11);
        this.F = tVar;
        tVar.setInputMethodMode(1);
    }

    private void J(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.F, z10);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012a A[PHI: r1
  0x012a: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x011f, B:47:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int q() {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.q():int");
    }

    private int u(View view, int i10, boolean z10) {
        return c.a(this.F, view, i10, z10);
    }

    private void y() {
        View view = this.f1705p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1705p);
            }
        }
    }

    public void A(int i10) {
        this.F.setAnimationStyle(i10);
    }

    public void B(int i10) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            M(i10);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.f1694e = rect.left + rect.right + i10;
    }

    public void C(int i10) {
        this.f1701l = i10;
    }

    public void D(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void E(int i10) {
        this.F.setInputMethodMode(i10);
    }

    public void F(boolean z10) {
        this.E = z10;
        this.F.setFocusable(z10);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1710u = onItemClickListener;
    }

    public void I(boolean z10) {
        this.f1700k = true;
        this.f1699j = z10;
    }

    public void K(int i10) {
        this.f1706q = i10;
    }

    public void L(int i10) {
        d0 d0Var = this.f1692c;
        if (!a() || d0Var == null) {
            return;
        }
        d0Var.setListSelectionHidden(false);
        d0Var.setSelection(i10);
        if (d0Var.getChoiceMode() != 0) {
            d0Var.setItemChecked(i10, true);
        }
    }

    public void M(int i10) {
        this.f1694e = i10;
    }

    @Override // q.e
    public boolean a() {
        return this.F.isShowing();
    }

    @Override // q.e
    public void b() {
        int iQ = q();
        boolean zW = w();
        androidx.core.widget.d.b(this.F, this.f1697h);
        if (this.F.isShowing()) {
            if (androidx.core.view.h.G(t())) {
                int width = this.f1694e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i10 = this.f1693d;
                if (i10 == -1) {
                    if (!zW) {
                        iQ = -1;
                    }
                    if (zW) {
                        this.F.setWidth(this.f1694e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.f1694e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iQ = i10;
                }
                this.F.setOutsideTouchable((this.f1703n || this.f1702m) ? false : true);
                this.F.update(t(), this.f1695f, this.f1696g, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f1694e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i11 = this.f1693d;
        if (i11 == -1) {
            iQ = -1;
        } else if (i11 != -2) {
            iQ = i11;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iQ);
        J(true);
        this.F.setOutsideTouchable((this.f1703n || this.f1702m) ? false : true);
        this.F.setTouchInterceptor(this.f1713x);
        if (this.f1700k) {
            androidx.core.widget.d.a(this.F, this.f1699j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.F, this.D);
        }
        androidx.core.widget.d.c(this.F, t(), this.f1695f, this.f1696g, this.f1701l);
        this.f1692c.setSelection(-1);
        if (!this.E || this.f1692c.isInTouchMode()) {
            r();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.f1715z);
    }

    @Override // q.e
    public void dismiss() {
        this.F.dismiss();
        y();
        this.F.setContentView(null);
        this.f1692c = null;
        this.B.removeCallbacks(this.f1712w);
    }

    public void e(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public int f() {
        return this.f1695f;
    }

    public void g(int i10) {
        this.f1695f = i10;
    }

    public Drawable i() {
        return this.F.getBackground();
    }

    @Override // q.e
    public ListView j() {
        return this.f1692c;
    }

    public void l(int i10) {
        this.f1696g = i10;
        this.f1698i = true;
    }

    public int o() {
        if (this.f1698i) {
            return this.f1696g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1707r;
        if (dataSetObserver == null) {
            this.f1707r = new f();
        } else {
            ListAdapter listAdapter2 = this.f1691b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1691b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1707r);
        }
        d0 d0Var = this.f1692c;
        if (d0Var != null) {
            d0Var.setAdapter(this.f1691b);
        }
    }

    public void r() {
        d0 d0Var = this.f1692c;
        if (d0Var != null) {
            d0Var.setListSelectionHidden(true);
            d0Var.requestLayout();
        }
    }

    d0 s(Context context, boolean z10) {
        return new d0(context, z10);
    }

    public View t() {
        return this.f1708s;
    }

    public int v() {
        return this.f1694e;
    }

    public boolean w() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.E;
    }

    public void z(View view) {
        this.f1708s = view;
    }
}
