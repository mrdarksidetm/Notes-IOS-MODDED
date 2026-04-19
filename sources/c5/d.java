package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class d extends m0 {

    class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f6435a;

        a(View view) {
            this.f6435a = view;
        }

        @Override // c5.l.f
        public void d(l lVar) {
            a0.g(this.f6435a, 1.0f);
            a0.a(this.f6435a);
            lVar.T(this);
        }
    }

    private static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f6437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f6438b = false;

        b(View view) {
            this.f6437a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a0.g(this.f6437a, 1.0f);
            if (this.f6438b) {
                this.f6437a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (androidx.core.view.h.D(this.f6437a) && this.f6437a.getLayerType() == 0) {
                this.f6438b = true;
                this.f6437a.setLayerType(2, null);
            }
        }
    }

    public d(int i10) {
        m0(i10);
    }

    private Animator n0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        a0.g(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, a0.f6400b, f11);
        objectAnimatorOfFloat.addListener(new b(view));
        b(new a(view));
        return objectAnimatorOfFloat;
    }

    private static float o0(s sVar, float f10) {
        Float f11;
        return (sVar == null || (f11 = (Float) sVar.f6534a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // c5.m0
    public Animator i0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float fO0 = o0(sVar, 0.0f);
        return n0(view, fO0 != 1.0f ? fO0 : 0.0f, 1.0f);
    }

    @Override // c5.m0, c5.l
    public void j(s sVar) {
        super.j(sVar);
        sVar.f6534a.put("android:fade:transitionAlpha", Float.valueOf(a0.c(sVar.f6535b)));
    }

    @Override // c5.m0
    public Animator k0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        a0.e(view);
        return n0(view, o0(sVar, 1.0f), 0.0f);
    }
}
