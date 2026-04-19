package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
class w0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static w0 f1913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static w0 f1914l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f1916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f1918d = new Runnable() { // from class: androidx.appcompat.widget.u0
        @Override // java.lang.Runnable
        public final void run() {
            this.f1886a.e();
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f1919e = new Runnable() { // from class: androidx.appcompat.widget.v0
        @Override // java.lang.Runnable
        public final void run() {
            this.f1887a.d();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x0 f1922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1924j;

    private w0(View view, CharSequence charSequence) {
        this.f1915a = view;
        this.f1916b = charSequence;
        this.f1917c = androidx.core.view.i.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f1915a.removeCallbacks(this.f1918d);
    }

    private void c() {
        this.f1924j = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f1915a.postDelayed(this.f1918d, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(w0 w0Var) {
        w0 w0Var2 = f1913k;
        if (w0Var2 != null) {
            w0Var2.b();
        }
        f1913k = w0Var;
        if (w0Var != null) {
            w0Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        w0 w0Var = f1913k;
        if (w0Var != null && w0Var.f1915a == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new w0(view, charSequence);
            return;
        }
        w0 w0Var2 = f1914l;
        if (w0Var2 != null && w0Var2.f1915a == view) {
            w0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean j(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f1924j && Math.abs(x10 - this.f1920f) <= this.f1917c && Math.abs(y10 - this.f1921g) <= this.f1917c) {
            return false;
        }
        this.f1920f = x10;
        this.f1921g = y10;
        this.f1924j = false;
        return true;
    }

    void d() {
        if (f1914l == this) {
            f1914l = null;
            x0 x0Var = this.f1922h;
            if (x0Var != null) {
                x0Var.c();
                this.f1922h = null;
                c();
                this.f1915a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1913k == this) {
            g(null);
        }
        this.f1915a.removeCallbacks(this.f1919e);
    }

    void i(boolean z10) {
        long longPressTimeout;
        if (androidx.core.view.h.G(this.f1915a)) {
            g(null);
            w0 w0Var = f1914l;
            if (w0Var != null) {
                w0Var.d();
            }
            f1914l = this;
            this.f1923i = z10;
            x0 x0Var = new x0(this.f1915a.getContext());
            this.f1922h = x0Var;
            x0Var.e(this.f1915a, this.f1920f, this.f1921g, this.f1923i, this.f1916b);
            this.f1915a.addOnAttachStateChangeListener(this);
            if (this.f1923i) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((androidx.core.view.h.B(this.f1915a) & 1) == 1 ? 3000L : 15000L) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1915a.removeCallbacks(this.f1919e);
            this.f1915a.postDelayed(this.f1919e, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1922h != null && this.f1923i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1915a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f1915a.isEnabled() && this.f1922h == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1920f = view.getWidth() / 2;
        this.f1921g = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
