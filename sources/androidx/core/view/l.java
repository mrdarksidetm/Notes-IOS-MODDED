package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import o3.f2;
import o3.h2;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f3370a;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f3371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3372b;

        a(f2 f2Var, View view) {
            this.f3371a = f2Var;
            this.f3372b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3371a.a(this.f3372b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3371a.b(this.f3372b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f3371a.c(this.f3372b);
        }
    }

    l(View view) {
        this.f3370a = new WeakReference<>(view);
    }

    private void i(View view, f2 f2Var) {
        if (f2Var != null) {
            view.animate().setListener(new a(f2Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public l b(float f10) {
        View view = this.f3370a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f3370a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f3370a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public l f(long j10) {
        View view = this.f3370a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public l g(Interpolator interpolator) {
        View view = this.f3370a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public l h(f2 f2Var) {
        View view = this.f3370a.get();
        if (view != null) {
            i(view, f2Var);
        }
        return this;
    }

    public l j(long j10) {
        View view = this.f3370a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public l k(final h2 h2Var) {
        final View view = this.f3370a.get();
        if (view != null) {
            view.animate().setUpdateListener(h2Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: o3.e2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    h2Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = this.f3370a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public l m(float f10) {
        View view = this.f3370a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
