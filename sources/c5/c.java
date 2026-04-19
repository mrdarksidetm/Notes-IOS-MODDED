package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c extends l {
    private static final String[] Z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Property<Drawable, PointF> f6402a0 = new b(PointF.class, "boundsOrigin");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Property<k, PointF> f6403b0 = new C0152c(PointF.class, "topLeft");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Property<k, PointF> f6404c0 = new d(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Property<View, PointF> f6405d0 = new e(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Property<View, PointF> f6406e0 = new f(PointF.class, "topLeft");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Property<View, PointF> f6407f0 = new g(PointF.class, "position");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static c5.j f6408g0 = new c5.j();
    private int[] I = new int[2];
    private boolean X = false;
    private boolean Y = false;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f6409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f6410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f6411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f6412d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f6409a = viewGroup;
            this.f6410b = bitmapDrawable;
            this.f6411c = view;
            this.f6412d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a0.b(this.f6409a).b(this.f6410b);
            a0.g(this.f6411c, this.f6412d);
        }
    }

    class b extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f6414a;

        b(Class cls, String str) {
            super(cls, str);
            this.f6414a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f6414a);
            Rect rect = this.f6414a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f6414a);
            this.f6414a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f6414a);
        }
    }

    /* JADX INFO: renamed from: c5.c$c, reason: collision with other inner class name */
    class C0152c extends Property<k, PointF> {
        C0152c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            a0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            a0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            a0.f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f6415a;
        private k mViewBounds;

        h(k kVar) {
            this.f6415a = kVar;
            this.mViewBounds = kVar;
        }
    }

    class i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f6417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f6418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f6419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f6421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f6422f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6423g;

        i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f6418b = view;
            this.f6419c = rect;
            this.f6420d = i10;
            this.f6421e = i11;
            this.f6422f = i12;
            this.f6423g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6417a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6417a) {
                return;
            }
            androidx.core.view.h.c0(this.f6418b, this.f6419c);
            a0.f(this.f6418b, this.f6420d, this.f6421e, this.f6422f, this.f6423g);
        }
    }

    class j extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f6425a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f6426b;

        j(ViewGroup viewGroup) {
            this.f6426b = viewGroup;
        }

        @Override // c5.m, c5.l.f
        public void a(l lVar) {
            x.c(this.f6426b, true);
        }

        @Override // c5.m, c5.l.f
        public void b(l lVar) {
            x.c(this.f6426b, false);
            this.f6425a = true;
        }

        @Override // c5.m, c5.l.f
        public void c(l lVar) {
            x.c(this.f6426b, false);
        }

        @Override // c5.l.f
        public void d(l lVar) {
            if (!this.f6425a) {
                x.c(this.f6426b, false);
            }
            lVar.T(this);
        }
    }

    private static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f6429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f6431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f6432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f6433f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f6434g;

        k(View view) {
            this.f6432e = view;
        }

        private void b() {
            a0.f(this.f6432e, this.f6428a, this.f6429b, this.f6430c, this.f6431d);
            this.f6433f = 0;
            this.f6434g = 0;
        }

        void a(PointF pointF) {
            this.f6430c = Math.round(pointF.x);
            this.f6431d = Math.round(pointF.y);
            int i10 = this.f6434g + 1;
            this.f6434g = i10;
            if (this.f6433f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f6428a = Math.round(pointF.x);
            this.f6429b = Math.round(pointF.y);
            int i10 = this.f6433f + 1;
            this.f6433f = i10;
            if (i10 == this.f6434g) {
                b();
            }
        }
    }

    private void g0(s sVar) {
        View view = sVar.f6535b;
        if (!androidx.core.view.h.H(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f6534a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f6534a.put("android:changeBounds:parent", sVar.f6535b.getParent());
        if (this.Y) {
            sVar.f6535b.getLocationInWindow(this.I);
            sVar.f6534a.put("android:changeBounds:windowX", Integer.valueOf(this.I[0]));
            sVar.f6534a.put("android:changeBounds:windowY", Integer.valueOf(this.I[1]));
        }
        if (this.X) {
            sVar.f6534a.put("android:changeBounds:clip", androidx.core.view.h.o(view));
        }
    }

    private boolean h0(View view, View view2) {
        if (!this.Y) {
            return true;
        }
        s sVarV = v(view, true);
        if (sVarV == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == sVarV.f6535b) {
            return true;
        }
        return false;
    }

    @Override // c5.l
    public String[] H() {
        return Z;
    }

    @Override // c5.l
    public void g(s sVar) {
        g0(sVar);
    }

    @Override // c5.l
    public void j(s sVar) {
        g0(sVar);
    }

    @Override // c5.l
    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        int i10;
        View view;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        Path pathA;
        Property<View, PointF> property;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.f6534a;
        Map<String, Object> map2 = sVar2.f6534a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f6535b;
        if (!h0(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) sVar.f6534a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) sVar.f6534a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) sVar2.f6534a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) sVar2.f6534a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.I);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = a0.c(view2);
            a0.g(view2, 0.0f);
            a0.b(viewGroup).a(bitmapDrawable);
            c5.g gVarZ = z();
            int[] iArr = this.I;
            int i12 = iArr[0];
            int i13 = iArr[1];
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, c5.h.a(f6402a0, gVarZ.a(iIntValue - i12, iIntValue2 - i13, iIntValue3 - i12, iIntValue4 - i13)));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect2 = (Rect) sVar.f6534a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) sVar2.f6534a.get("android:changeBounds:bounds");
        int i14 = rect2.left;
        int i15 = rect3.left;
        int i16 = rect2.top;
        int i17 = rect3.top;
        int i18 = rect2.right;
        int i19 = rect3.right;
        int i20 = rect2.bottom;
        int i21 = rect3.bottom;
        int i22 = i18 - i14;
        int i23 = i20 - i16;
        int i24 = i19 - i15;
        int i25 = i21 - i17;
        Rect rect4 = (Rect) sVar.f6534a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) sVar2.f6534a.get("android:changeBounds:clip");
        if ((i22 == 0 || i23 == 0) && (i24 == 0 || i25 == 0)) {
            i10 = 0;
        } else {
            i10 = (i14 == i15 && i16 == i17) ? 0 : 1;
            if (i18 != i19 || i20 != i21) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        if (this.X) {
            view = view2;
            a0.f(view, i14, i16, Math.max(i22, i24) + i14, Math.max(i23, i25) + i16);
            ObjectAnimator objectAnimatorA = (i14 == i15 && i16 == i17) ? null : c5.f.a(view, f6407f0, z().a(i14, i16, i15, i17));
            if (rect4 == null) {
                i11 = 0;
                rect = new Rect(0, 0, i22, i23);
            } else {
                i11 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i11, i11, i24, i25) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                androidx.core.view.h.c0(view, rect);
                c5.j jVar = f6408g0;
                Object[] objArr = new Object[2];
                objArr[i11] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", jVar, objArr);
                objectAnimatorOfObject.addListener(new i(view, rect5, i15, i17, i19, i21));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorC = r.c(objectAnimatorA, objectAnimator);
        } else {
            view = view2;
            a0.f(view, i14, i16, i18, i20);
            if (i10 == 2) {
                if (i22 == i24 && i23 == i25) {
                    pathA = z().a(i14, i16, i15, i17);
                    property = f6407f0;
                } else {
                    k kVar = new k(view);
                    ObjectAnimator objectAnimatorA2 = c5.f.a(kVar, f6403b0, z().a(i14, i16, i15, i17));
                    ObjectAnimator objectAnimatorA3 = c5.f.a(kVar, f6404c0, z().a(i18, i20, i19, i21));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                    animatorSet.addListener(new h(kVar));
                    animatorC = animatorSet;
                }
            } else if (i14 == i15 && i16 == i17) {
                pathA = z().a(i18, i20, i19, i21);
                property = f6405d0;
            } else {
                pathA = z().a(i14, i16, i15, i17);
                property = f6406e0;
            }
            animatorC = c5.f.a(view, property, pathA);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.c(viewGroup4, true);
            b(new j(viewGroup4));
        }
        return animatorC;
    }
}
