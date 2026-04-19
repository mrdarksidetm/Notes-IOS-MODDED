package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import o3.k0;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f3374a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.core.graphics.a f3375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.graphics.a f3376b;

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f3375a = d.f(bounds);
            this.f3376b = d.e(bounds);
        }

        public a(androidx.core.graphics.a aVar, androidx.core.graphics.a aVar2) {
            this.f3375a = aVar;
            this.f3376b = aVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public androidx.core.graphics.a a() {
            return this.f3375a;
        }

        public androidx.core.graphics.a b() {
            return this.f3376b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.d(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f3375a + " upper=" + this.f3376b + "}";
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WindowInsets f3377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3378b;

        public b(int i10) {
            this.f3378b = i10;
        }

        public final int b() {
            return this.f3378b;
        }

        public void c(n nVar) {
        }

        public void d(n nVar) {
        }

        public abstract o e(o oVar, List<n> list);

        public a f(n nVar, a aVar) {
            return aVar;
        }
    }

    private static class c extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Interpolator f3379e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Interpolator f3380f = new n4.a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Interpolator f3381g = new DecelerateInterpolator();

        private static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final b f3382a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private o f3383b;

            /* JADX INFO: renamed from: androidx.core.view.n$c$a$a, reason: collision with other inner class name */
            class C0084a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ n f3384a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ o f3385b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ o f3386c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f3387d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f3388e;

                C0084a(n nVar, o oVar, o oVar2, int i10, View view) {
                    this.f3384a = nVar;
                    this.f3385b = oVar;
                    this.f3386c = oVar2;
                    this.f3387d = i10;
                    this.f3388e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f3384a.d(valueAnimator.getAnimatedFraction());
                    c.j(this.f3388e, c.n(this.f3385b, this.f3386c, this.f3384a.b(), this.f3387d), Collections.singletonList(this.f3384a));
                }
            }

            class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ n f3390a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f3391b;

                b(n nVar, View view) {
                    this.f3390a = nVar;
                    this.f3391b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f3390a.d(1.0f);
                    c.h(this.f3391b, this.f3390a);
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.n$c$a$c, reason: collision with other inner class name */
            class RunnableC0085c implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ View f3393a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ n f3394b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f3395c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f3396d;

                RunnableC0085c(View view, n nVar, a aVar, ValueAnimator valueAnimator) {
                    this.f3393a = view;
                    this.f3394b = nVar;
                    this.f3395c = aVar;
                    this.f3396d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.k(this.f3393a, this.f3394b, this.f3395c);
                    this.f3396d.start();
                }
            }

            a(View view, b bVar) {
                this.f3382a = bVar;
                o oVarY = h.y(view);
                this.f3383b = oVarY != null ? new o.b(oVarY).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int iD;
                if (view.isLaidOut()) {
                    o oVarX = o.x(windowInsets, view);
                    if (this.f3383b == null) {
                        this.f3383b = h.y(view);
                    }
                    if (this.f3383b != null) {
                        b bVarM = c.m(view);
                        if ((bVarM == null || !Objects.equals(bVarM.f3377a, windowInsets)) && (iD = c.d(oVarX, this.f3383b)) != 0) {
                            o oVar = this.f3383b;
                            n nVar = new n(iD, c.f(iD, oVarX, oVar), 160L);
                            nVar.d(0.0f);
                            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(nVar.a());
                            a aVarE = c.e(oVarX, oVar, iD);
                            c.i(view, nVar, windowInsets, false);
                            duration.addUpdateListener(new C0084a(nVar, oVarX, oVar, iD, view));
                            duration.addListener(new b(nVar, view));
                            k0.a(view, new RunnableC0085c(view, nVar, aVarE, duration));
                        }
                        return c.l(view, windowInsets);
                    }
                    this.f3383b = oVarX;
                } else {
                    this.f3383b = o.x(windowInsets, view);
                }
                return c.l(view, windowInsets);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        static int d(o oVar, o oVar2) {
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if (!oVar.f(i11).equals(oVar2.f(i11))) {
                    i10 |= i11;
                }
            }
            return i10;
        }

        static a e(o oVar, o oVar2, int i10) {
            androidx.core.graphics.a aVarF = oVar.f(i10);
            androidx.core.graphics.a aVarF2 = oVar2.f(i10);
            return new a(androidx.core.graphics.a.b(Math.min(aVarF.f3308a, aVarF2.f3308a), Math.min(aVarF.f3309b, aVarF2.f3309b), Math.min(aVarF.f3310c, aVarF2.f3310c), Math.min(aVarF.f3311d, aVarF2.f3311d)), androidx.core.graphics.a.b(Math.max(aVarF.f3308a, aVarF2.f3308a), Math.max(aVarF.f3309b, aVarF2.f3309b), Math.max(aVarF.f3310c, aVarF2.f3310c), Math.max(aVarF.f3311d, aVarF2.f3311d)));
        }

        static Interpolator f(int i10, o oVar, o oVar2) {
            return (i10 & 8) != 0 ? oVar.f(o.m.c()).f3311d > oVar2.f(o.m.c()).f3311d ? f3379e : f3380f : f3381g;
        }

        private static View.OnApplyWindowInsetsListener g(View view, b bVar) {
            return new a(view, bVar);
        }

        static void h(View view, n nVar) {
            b bVarM = m(view);
            if (bVarM != null) {
                bVarM.c(nVar);
                if (bVarM.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    h(viewGroup.getChildAt(i10), nVar);
                }
            }
        }

        static void i(View view, n nVar, WindowInsets windowInsets, boolean z10) {
            b bVarM = m(view);
            if (bVarM != null) {
                bVarM.f3377a = windowInsets;
                if (!z10) {
                    bVarM.d(nVar);
                    z10 = bVarM.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), nVar, windowInsets, z10);
                }
            }
        }

        static void j(View view, o oVar, List<n> list) {
            b bVarM = m(view);
            if (bVarM != null) {
                oVar = bVarM.e(oVar, list);
                if (bVarM.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), oVar, list);
                }
            }
        }

        static void k(View view, n nVar, a aVar) {
            b bVarM = m(view);
            if (bVarM != null) {
                bVarM.f(nVar, aVar);
                if (bVarM.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), nVar, aVar);
                }
            }
        }

        static WindowInsets l(View view, WindowInsets windowInsets) {
            return view.getTag(c3.d.L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b m(View view) {
            Object tag = view.getTag(c3.d.S);
            if (tag instanceof a) {
                return ((a) tag).f3382a;
            }
            return null;
        }

        static o n(o oVar, o oVar2, float f10, int i10) {
            androidx.core.graphics.a aVarN;
            o.b bVar = new o.b(oVar);
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    aVarN = oVar.f(i11);
                } else {
                    androidx.core.graphics.a aVarF = oVar.f(i11);
                    androidx.core.graphics.a aVarF2 = oVar2.f(i11);
                    float f11 = 1.0f - f10;
                    aVarN = o.n(aVarF, (int) (((double) ((aVarF.f3308a - aVarF2.f3308a) * f11)) + 0.5d), (int) (((double) ((aVarF.f3309b - aVarF2.f3309b) * f11)) + 0.5d), (int) (((double) ((aVarF.f3310c - aVarF2.f3310c) * f11)) + 0.5d), (int) (((double) ((aVarF.f3311d - aVarF2.f3311d) * f11)) + 0.5d));
                }
                bVar.b(i11, aVarN);
            }
            return bVar.a();
        }

        static void o(View view, b bVar) {
            Object tag = view.getTag(c3.d.L);
            if (bVar == null) {
                view.setTag(c3.d.S, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerG = g(view, bVar);
            view.setTag(c3.d.S, onApplyWindowInsetsListenerG);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerG);
            }
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final WindowInsetsAnimation f3398e;

        private static class a extends WindowInsetsAnimation.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f3399a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List<n> f3400b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ArrayList<n> f3401c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, n> f3402d;

            a(b bVar) {
                super(bVar.b());
                this.f3402d = new HashMap<>();
                this.f3399a = bVar;
            }

            private n a(WindowInsetsAnimation windowInsetsAnimation) {
                n nVar = this.f3402d.get(windowInsetsAnimation);
                if (nVar != null) {
                    return nVar;
                }
                n nVarE = n.e(windowInsetsAnimation);
                this.f3402d.put(windowInsetsAnimation, nVarE);
                return nVarE;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f3399a.c(a(windowInsetsAnimation));
                this.f3402d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f3399a.d(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<n> arrayList = this.f3401c;
                if (arrayList == null) {
                    ArrayList<n> arrayList2 = new ArrayList<>(list.size());
                    this.f3401c = arrayList2;
                    this.f3400b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    n nVarA = a(windowInsetsAnimation);
                    nVarA.d(windowInsetsAnimation.getFraction());
                    this.f3401c.add(nVarA);
                }
                return this.f3399a.e(o.w(windowInsets), this.f3400b).v();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f3399a.f(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(new WindowInsetsAnimation(i10, interpolator, j10));
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f3398e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds d(a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.a().e(), aVar.b().e());
        }

        public static androidx.core.graphics.a e(WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.a.d(bounds.getUpperBound());
        }

        public static androidx.core.graphics.a f(WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.a.d(bounds.getLowerBound());
        }

        public static void g(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.n.e
        public long a() {
            return this.f3398e.getDurationMillis();
        }

        @Override // androidx.core.view.n.e
        public float b() {
            return this.f3398e.getInterpolatedFraction();
        }

        @Override // androidx.core.view.n.e
        public void c(float f10) {
            this.f3398e.setFraction(f10);
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f3404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Interpolator f3405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f3406d;

        e(int i10, Interpolator interpolator, long j10) {
            this.f3403a = i10;
            this.f3405c = interpolator;
            this.f3406d = j10;
        }

        public long a() {
            return this.f3406d;
        }

        public float b() {
            Interpolator interpolator = this.f3405c;
            return interpolator != null ? interpolator.getInterpolation(this.f3404b) : this.f3404b;
        }

        public void c(float f10) {
            this.f3404b = f10;
        }
    }

    public n(int i10, Interpolator interpolator, long j10) {
        this.f3374a = Build.VERSION.SDK_INT >= 30 ? new d(i10, interpolator, j10) : new c(i10, interpolator, j10);
    }

    private n(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3374a = new d(windowInsetsAnimation);
        }
    }

    static void c(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.g(view, bVar);
        } else {
            c.o(view, bVar);
        }
    }

    static n e(WindowInsetsAnimation windowInsetsAnimation) {
        return new n(windowInsetsAnimation);
    }

    public long a() {
        return this.f3374a.a();
    }

    public float b() {
        return this.f3374a.b();
    }

    public void d(float f10) {
        this.f3374a.c(f10);
    }
}
