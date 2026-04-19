package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class d0 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f1631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f1637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.core.view.l f1641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private t3.c f1642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    f f1643m;

    static class a {
        static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Method f1644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f1645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f1646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f1647d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1644a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1645b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1646c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1647d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        static boolean a() {
            return f1647d;
        }

        static void b(d0 d0Var, int i10, View view) {
            try {
                f1644a.invoke(d0Var, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f1645b.invoke(d0Var, Integer.valueOf(i10));
                f1646c.invoke(d0Var, Integer.valueOf(i10));
            } catch (IllegalAccessException | InvocationTargetException e10) {
                e10.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    private static class d extends m.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1648b;

        d(Drawable drawable) {
            super(drawable);
            this.f1648b = true;
        }

        void b(boolean z10) {
            this.f1648b = z10;
        }

        @Override // m.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1648b) {
                super.draw(canvas);
            }
        }

        @Override // m.a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f1648b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // m.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1648b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // m.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1648b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // m.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f1648b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Field f1649a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f1649a = declaredField;
        }

        static boolean a(AbsListView absListView) {
            Field field = f1649a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z10) {
            Field field = f1649a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            d0 d0Var = d0.this;
            d0Var.f1643m = null;
            d0Var.removeCallbacks(this);
        }

        public void b() {
            d0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            d0 d0Var = d0.this;
            d0Var.f1643m = null;
            d0Var.drawableStateChanged();
        }
    }

    d0(Context context, boolean z10) {
        super(context, null, j.a.A);
        this.f1631a = new Rect();
        this.f1632b = 0;
        this.f1633c = 0;
        this.f1634d = 0;
        this.f1635e = 0;
        this.f1639i = z10;
        setCacheColorHint(0);
    }

    private void a() {
        this.f1640j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1636f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.l lVar = this.f1641k;
        if (lVar != null) {
            lVar.c();
            this.f1641k = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f1631a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1631a);
        selector.draw(canvas);
    }

    private void f(int i10, View view) {
        Rect rect = this.f1631a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1632b;
        rect.top -= this.f1633c;
        rect.right += this.f1634d;
        rect.bottom += this.f1635e;
        boolean zJ = j();
        if (view.isEnabled() != zJ) {
            k(!zJ);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z10) {
            Rect rect = this.f1631a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.c(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.c(selector, f10, f11);
    }

    private void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f1640j = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f1636f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1636f = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return k3.a.b() ? c.a(this) : e.a(this);
    }

    private void k(boolean z10) {
        if (k3.a.b()) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    private boolean l() {
        return this.f1640j;
    }

    private void m() {
        Drawable selector = getSelector();
        if (selector != null && l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f1637g;
        if (dVar != null) {
            dVar.b(z10);
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1643m != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = r1
            r3 = r2
            goto L46
        L11:
            r9 = r1
            r3 = r9
            goto L46
        L14:
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r2
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            t3.c r9 = r7.f1642l
            if (r9 != 0) goto L5a
            t3.c r9 = new t3.c
            r9.<init>(r7)
            r7.f1642l = r9
        L5a:
            t3.c r9 = r7.f1642l
            r9.m(r2)
            t3.c r9 = r7.f1642l
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            t3.c r8 = r7.f1642l
            if (r8 == 0) goto L6c
            r8.m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d0.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1639i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1639i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1639i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1639i && this.f1638h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1643m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1643m == null) {
            f fVar = new f();
            this.f1643m = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.a()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, iPointToPosition, childAt);
                    }
                }
                m();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1636f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f1643m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z10) {
        this.f1638h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f1637g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1632b = rect.left;
        this.f1633c = rect.top;
        this.f1634d = rect.right;
        this.f1635e = rect.bottom;
    }
}
