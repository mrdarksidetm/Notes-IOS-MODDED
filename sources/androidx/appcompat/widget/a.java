package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import o3.f2;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0030a f1564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f1565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ActionMenuView f1566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected c f1567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f1568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected androidx.core.view.l f1569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1571h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0030a implements f2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1572a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1573b;

        protected C0030a() {
        }

        @Override // o3.f2
        public void a(View view) {
            this.f1572a = true;
        }

        @Override // o3.f2
        public void b(View view) {
            if (this.f1572a) {
                return;
            }
            a aVar = a.this;
            aVar.f1569f = null;
            a.super.setVisibility(this.f1573b);
        }

        @Override // o3.f2
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1572a = false;
        }

        public C0030a d(androidx.core.view.l lVar, int i10) {
            a.this.f1569f = lVar;
            this.f1573b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1564a = new C0030a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(j.a.f13331a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1565b = context;
        } else {
            this.f1565b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.l f(int i10, long j10) {
        androidx.core.view.l lVarB;
        androidx.core.view.l lVar = this.f1569f;
        if (lVar != null) {
            lVar.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            lVarB = androidx.core.view.h.c(this).b(1.0f);
        } else {
            lVarB = androidx.core.view.h.c(this).b(0.0f);
        }
        lVarB.f(j10);
        lVarB.h(this.f1564a.d(lVarB, i10));
        return lVarB;
    }

    public int getAnimatedVisibility() {
        return this.f1569f != null ? this.f1564a.f1573b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1568e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, j.j.f13472a, j.a.f13333c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(j.j.f13517j, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f1567d;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1571h = false;
        }
        if (!this.f1571h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1571h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1571h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1570g = false;
        }
        if (!this.f1570g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1570g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1570g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1568e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.l lVar = this.f1569f;
            if (lVar != null) {
                lVar.c();
            }
            super.setVisibility(i10);
        }
    }
}
