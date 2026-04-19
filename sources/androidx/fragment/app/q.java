package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<View> f4222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<View> f4223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f4224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4225d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4226a = new a();

        private a() {
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            ae.r.f(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            ae.r.f(view, "v");
            ae.r.f(windowInsets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            ae.r.e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet, w wVar) {
        String str;
        super(context, attributeSet);
        ae.r.f(context, "context");
        ae.r.f(attributeSet, "attrs");
        ae.r.f(wVar, "fm");
        this.f4222a = new ArrayList();
        this.f4223b = new ArrayList();
        this.f4225d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = j4.c.f13916e;
        ae.r.e(iArr, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(j4.c.f13917f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(j4.c.f13918g);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        n nVarI0 = wVar.i0(id2);
        if (classAttribute != null && nVarI0 == null) {
            if (id2 == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            n nVarA = wVar.u0().a(context.getClassLoader(), classAttribute);
            ae.r.e(nVarA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            nVarA.mFragmentId = id2;
            nVarA.mContainerId = id2;
            nVarA.mTag = string;
            nVarA.mFragmentManager = wVar;
            nVarA.mHost = wVar.w0();
            nVarA.onInflate(context, attributeSet, (Bundle) null);
            wVar.o().m(true).c(this, nVarA, string).i();
        }
        wVar.b1(this);
    }

    private final void a(View view) {
        if (this.f4223b.contains(view)) {
            this.f4222a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        ae.r.f(view, "child");
        if (w.D0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        androidx.core.view.o oVarN;
        ae.r.f(windowInsets, "insets");
        androidx.core.view.o oVarW = androidx.core.view.o.w(windowInsets);
        ae.r.e(oVarW, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4224c;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f4226a;
            ae.r.c(onApplyWindowInsetsListener);
            oVarN = androidx.core.view.o.w(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            oVarN = androidx.core.view.h.N(this, oVarW);
        }
        ae.r.e(oVarN, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!oVarN.o()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                androidx.core.view.h.e(getChildAt(i10), oVarN);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        ae.r.f(canvas, "canvas");
        if (this.f4225d) {
            Iterator<T> it = this.f4222a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        ae.r.f(canvas, "canvas");
        ae.r.f(view, "child");
        if (this.f4225d && (!this.f4222a.isEmpty()) && this.f4222a.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ae.r.f(view, "view");
        this.f4223b.remove(view);
        if (this.f4222a.remove(view)) {
            this.f4225d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends n> F getFragment() {
        return (F) w.l0(this).i0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        ae.r.f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                ae.r.e(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        ae.r.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        ae.r.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        ae.r.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            ae.r.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            ae.r.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f4225d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        ae.r.f(onApplyWindowInsetsListener, "listener");
        this.f4224c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        ae.r.f(view, "view");
        if (view.getParent() == this) {
            this.f4223b.add(view);
        }
        super.startViewTransition(view);
    }
}
