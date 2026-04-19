package o3;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f16330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewTreeObserver f16331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f16332c;

    private k0(View view, Runnable runnable) {
        this.f16330a = view;
        this.f16331b = view.getViewTreeObserver();
        this.f16332c = runnable;
    }

    public static k0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        k0 k0Var = new k0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(k0Var);
        view.addOnAttachStateChangeListener(k0Var);
        return k0Var;
    }

    public void b() {
        (this.f16331b.isAlive() ? this.f16331b : this.f16330a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f16330a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f16332c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f16331b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
