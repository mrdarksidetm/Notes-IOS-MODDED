package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
class p {

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f4215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnimatorSet f4216b;

        a(Animator animator) {
            this.f4215a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f4216b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        a(Animation animation) {
            this.f4215a = animation;
            this.f4216b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f4217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f4218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f4220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4221e;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4221e = true;
            this.f4217a = viewGroup;
            this.f4218b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f4221e = true;
            if (this.f4219c) {
                return !this.f4220d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f4219c = true;
                o3.k0.a(this.f4217a, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f4221e = true;
            if (this.f4219c) {
                return !this.f4220d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f4219c = true;
                o3.k0.a(this.f4217a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4219c || !this.f4221e) {
                this.f4217a.endViewTransition(this.f4218b);
                this.f4220d = true;
            } else {
                this.f4221e = false;
                this.f4217a.post(this);
            }
        }
    }

    private static int a(n nVar, boolean z10, boolean z11) {
        return z11 ? z10 ? nVar.getPopEnterAnim() : nVar.getPopExitAnim() : z10 ? nVar.getEnterAnim() : nVar.getExitAnim();
    }

    static a b(Context context, n nVar, boolean z10, boolean z11) {
        int nextTransition = nVar.getNextTransition();
        int iA = a(nVar, z10, z11);
        boolean z12 = false;
        nVar.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = nVar.mContainer;
        if (viewGroup != null) {
            int i10 = j4.b.f13911c;
            if (viewGroup.getTag(i10) != null) {
                nVar.mContainer.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = nVar.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = nVar.onCreateAnimation(nextTransition, z10, iA);
        if (animationOnCreateAnimation != null) {
            return new a(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = nVar.onCreateAnimator(nextTransition, z10, iA);
        if (animatorOnCreateAnimator != null) {
            return new a(animatorOnCreateAnimator);
        }
        if (iA == 0 && nextTransition != 0) {
            iA = d(context, nextTransition, z10);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                    z12 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z12) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                    if (animatorLoadAnimator != null) {
                        return new a(animatorLoadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (zEquals) {
                        throw e11;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation2 != null) {
                        return new a(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i10, boolean z10) {
        int i11;
        if (i10 == 4097) {
            return z10 ? j4.a.f13907e : j4.a.f13908f;
        }
        if (i10 == 8194) {
            return z10 ? j4.a.f13903a : j4.a.f13904b;
        }
        if (i10 == 8197) {
            i11 = z10 ? R.attr.activityCloseEnterAnimation : R.attr.activityCloseExitAnimation;
        } else {
            if (i10 == 4099) {
                return z10 ? j4.a.f13905c : j4.a.f13906d;
            }
            if (i10 != 4100) {
                return -1;
            }
            i11 = z10 ? R.attr.activityOpenEnterAnimation : R.attr.activityOpenExitAnimation;
        }
        return c(context, i11);
    }
}
