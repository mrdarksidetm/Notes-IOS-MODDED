package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f3407b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f3408a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Field f3409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Field f3410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Field f3411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f3412d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3409a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3410b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3411c = declaredField3;
                declaredField3.setAccessible(true);
                f3412d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static o a(View view) {
            if (f3412d && view.isAttachedToWindow()) {
                try {
                    Object obj = f3409a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f3410b.get(obj);
                        Rect rect2 = (Rect) f3411c.get(obj);
                        if (rect != null && rect2 != null) {
                            o oVarA = new b().c(androidx.core.graphics.a.c(rect)).d(androidx.core.graphics.a.c(rect2)).a();
                            oVarA.t(oVarA);
                            oVarA.d(view.getRootView());
                            return oVarA;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f3413a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f3413a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : new c();
        }

        public b(o oVar) {
            int i10 = Build.VERSION.SDK_INT;
            this.f3413a = i10 >= 30 ? new e(oVar) : i10 >= 29 ? new d(oVar) : new c(oVar);
        }

        public o a() {
            return this.f3413a.b();
        }

        public b b(int i10, androidx.core.graphics.a aVar) {
            this.f3413a.c(i10, aVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.a aVar) {
            this.f3413a.e(aVar);
            return this;
        }

        @Deprecated
        public b d(androidx.core.graphics.a aVar) {
            this.f3413a.g(aVar);
            return this;
        }
    }

    private static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Field f3414e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f3415f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f3416g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f3417h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsets f3418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.a f3419d;

        c() {
            this.f3418c = i();
        }

        c(o oVar) {
            super(oVar);
            this.f3418c = oVar.v();
        }

        private static WindowInsets i() {
            if (!f3415f) {
                try {
                    f3414e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f3415f = true;
            }
            Field field = f3414e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f3417h) {
                try {
                    f3416g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f3417h = true;
            }
            Constructor<WindowInsets> constructor = f3416g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.o.f
        o b() {
            a();
            o oVarW = o.w(this.f3418c);
            oVarW.r(this.f3422b);
            oVarW.u(this.f3419d);
            return oVarW;
        }

        @Override // androidx.core.view.o.f
        void e(androidx.core.graphics.a aVar) {
            this.f3419d = aVar;
        }

        @Override // androidx.core.view.o.f
        void g(androidx.core.graphics.a aVar) {
            WindowInsets windowInsets = this.f3418c;
            if (windowInsets != null) {
                this.f3418c = windowInsets.replaceSystemWindowInsets(aVar.f3308a, aVar.f3309b, aVar.f3310c, aVar.f3311d);
            }
        }
    }

    private static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets$Builder f3420c;

        d() {
            this.f3420c = new WindowInsets$Builder();
        }

        d(o oVar) {
            super(oVar);
            WindowInsets windowInsetsV = oVar.v();
            this.f3420c = windowInsetsV != null ? new WindowInsets$Builder(windowInsetsV) : new WindowInsets$Builder();
        }

        @Override // androidx.core.view.o.f
        o b() {
            a();
            o oVarW = o.w(this.f3420c.build());
            oVarW.r(this.f3422b);
            return oVarW;
        }

        @Override // androidx.core.view.o.f
        void d(androidx.core.graphics.a aVar) {
            this.f3420c.setMandatorySystemGestureInsets(aVar.e());
        }

        @Override // androidx.core.view.o.f
        void e(androidx.core.graphics.a aVar) {
            this.f3420c.setStableInsets(aVar.e());
        }

        @Override // androidx.core.view.o.f
        void f(androidx.core.graphics.a aVar) {
            this.f3420c.setSystemGestureInsets(aVar.e());
        }

        @Override // androidx.core.view.o.f
        void g(androidx.core.graphics.a aVar) {
            this.f3420c.setSystemWindowInsets(aVar.e());
        }

        @Override // androidx.core.view.o.f
        void h(androidx.core.graphics.a aVar) {
            this.f3420c.setTappableElementInsets(aVar.e());
        }
    }

    private static class e extends d {
        e() {
        }

        e(o oVar) {
            super(oVar);
        }

        @Override // androidx.core.view.o.f
        void c(int i10, androidx.core.graphics.a aVar) {
            this.f3420c.setInsets(n.a(i10), aVar.e());
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f3421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.core.graphics.a[] f3422b;

        f() {
            this(new o((o) null));
        }

        f(o oVar) {
            this.f3421a = oVar;
        }

        protected final void a() {
            androidx.core.graphics.a[] aVarArr = this.f3422b;
            if (aVarArr != null) {
                androidx.core.graphics.a aVarF = aVarArr[m.d(1)];
                androidx.core.graphics.a aVarF2 = this.f3422b[m.d(2)];
                if (aVarF2 == null) {
                    aVarF2 = this.f3421a.f(2);
                }
                if (aVarF == null) {
                    aVarF = this.f3421a.f(1);
                }
                g(androidx.core.graphics.a.a(aVarF, aVarF2));
                androidx.core.graphics.a aVar = this.f3422b[m.d(16)];
                if (aVar != null) {
                    f(aVar);
                }
                androidx.core.graphics.a aVar2 = this.f3422b[m.d(32)];
                if (aVar2 != null) {
                    d(aVar2);
                }
                androidx.core.graphics.a aVar3 = this.f3422b[m.d(64)];
                if (aVar3 != null) {
                    h(aVar3);
                }
            }
        }

        o b() {
            throw null;
        }

        void c(int i10, androidx.core.graphics.a aVar) {
            if (this.f3422b == null) {
                this.f3422b = new androidx.core.graphics.a[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f3422b[m.d(i11)] = aVar;
                }
            }
        }

        void d(androidx.core.graphics.a aVar) {
        }

        void e(androidx.core.graphics.a aVar) {
            throw null;
        }

        void f(androidx.core.graphics.a aVar) {
        }

        void g(androidx.core.graphics.a aVar) {
            throw null;
        }

        void h(androidx.core.graphics.a aVar) {
        }
    }

    private static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f3423h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static Method f3424i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Class<?> f3425j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Field f3426k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f3427l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets f3428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.graphics.a[] f3429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.core.graphics.a f3430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private o f3431f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.core.graphics.a f3432g;

        g(o oVar, WindowInsets windowInsets) {
            super(oVar);
            this.f3430e = null;
            this.f3428c = windowInsets;
        }

        g(o oVar, g gVar) {
            this(oVar, new WindowInsets(gVar.f3428c));
        }

        private static void A() {
            try {
                f3424i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3425j = cls;
                f3426k = cls.getDeclaredField("mVisibleInsets");
                f3427l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3426k.setAccessible(true);
                f3427l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f3423h = true;
        }

        private androidx.core.graphics.a v(int i10, boolean z10) {
            androidx.core.graphics.a aVarA = androidx.core.graphics.a.f3307e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    aVarA = androidx.core.graphics.a.a(aVarA, w(i11, z10));
                }
            }
            return aVarA;
        }

        private androidx.core.graphics.a x() {
            o oVar = this.f3431f;
            return oVar != null ? oVar.h() : androidx.core.graphics.a.f3307e;
        }

        private androidx.core.graphics.a y(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f3423h) {
                A();
            }
            Method method = f3424i;
            if (method != null && f3425j != null && f3426k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f3426k.get(f3427l.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.a.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        @Override // androidx.core.view.o.l
        void d(View view) {
            androidx.core.graphics.a aVarY = y(view);
            if (aVarY == null) {
                aVarY = androidx.core.graphics.a.f3307e;
            }
            s(aVarY);
        }

        @Override // androidx.core.view.o.l
        void e(o oVar) {
            oVar.t(this.f3431f);
            oVar.s(this.f3432g);
        }

        @Override // androidx.core.view.o.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f3432g, ((g) obj).f3432g);
            }
            return false;
        }

        @Override // androidx.core.view.o.l
        public androidx.core.graphics.a g(int i10) {
            return v(i10, false);
        }

        @Override // androidx.core.view.o.l
        public androidx.core.graphics.a h(int i10) {
            return v(i10, true);
        }

        @Override // androidx.core.view.o.l
        final androidx.core.graphics.a l() {
            if (this.f3430e == null) {
                this.f3430e = androidx.core.graphics.a.b(this.f3428c.getSystemWindowInsetLeft(), this.f3428c.getSystemWindowInsetTop(), this.f3428c.getSystemWindowInsetRight(), this.f3428c.getSystemWindowInsetBottom());
            }
            return this.f3430e;
        }

        @Override // androidx.core.view.o.l
        o n(int i10, int i11, int i12, int i13) {
            b bVar = new b(o.w(this.f3428c));
            bVar.d(o.n(l(), i10, i11, i12, i13));
            bVar.c(o.n(j(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // androidx.core.view.o.l
        boolean p() {
            return this.f3428c.isRound();
        }

        @Override // androidx.core.view.o.l
        boolean q(int i10) {
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0 && !z(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.o.l
        public void r(androidx.core.graphics.a[] aVarArr) {
            this.f3429d = aVarArr;
        }

        @Override // androidx.core.view.o.l
        void s(androidx.core.graphics.a aVar) {
            this.f3432g = aVar;
        }

        @Override // androidx.core.view.o.l
        void t(o oVar) {
            this.f3431f = oVar;
        }

        protected androidx.core.graphics.a w(int i10, boolean z10) {
            androidx.core.graphics.a aVarH;
            int i11;
            if (i10 == 1) {
                return z10 ? androidx.core.graphics.a.b(0, Math.max(x().f3309b, l().f3309b), 0, 0) : androidx.core.graphics.a.b(0, l().f3309b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    androidx.core.graphics.a aVarX = x();
                    androidx.core.graphics.a aVarJ = j();
                    return androidx.core.graphics.a.b(Math.max(aVarX.f3308a, aVarJ.f3308a), 0, Math.max(aVarX.f3310c, aVarJ.f3310c), Math.max(aVarX.f3311d, aVarJ.f3311d));
                }
                androidx.core.graphics.a aVarL = l();
                o oVar = this.f3431f;
                aVarH = oVar != null ? oVar.h() : null;
                int iMin = aVarL.f3311d;
                if (aVarH != null) {
                    iMin = Math.min(iMin, aVarH.f3311d);
                }
                return androidx.core.graphics.a.b(aVarL.f3308a, 0, aVarL.f3310c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return k();
                }
                if (i10 == 32) {
                    return i();
                }
                if (i10 == 64) {
                    return m();
                }
                if (i10 != 128) {
                    return androidx.core.graphics.a.f3307e;
                }
                o oVar2 = this.f3431f;
                androidx.core.view.b bVarE = oVar2 != null ? oVar2.e() : f();
                return bVarE != null ? androidx.core.graphics.a.b(bVarE.b(), bVarE.d(), bVarE.c(), bVarE.a()) : androidx.core.graphics.a.f3307e;
            }
            androidx.core.graphics.a[] aVarArr = this.f3429d;
            aVarH = aVarArr != null ? aVarArr[m.d(8)] : null;
            if (aVarH != null) {
                return aVarH;
            }
            androidx.core.graphics.a aVarL2 = l();
            androidx.core.graphics.a aVarX2 = x();
            int i12 = aVarL2.f3311d;
            if (i12 > aVarX2.f3311d) {
                return androidx.core.graphics.a.b(0, 0, 0, i12);
            }
            androidx.core.graphics.a aVar = this.f3432g;
            return (aVar == null || aVar.equals(androidx.core.graphics.a.f3307e) || (i11 = this.f3432g.f3311d) <= aVarX2.f3311d) ? androidx.core.graphics.a.f3307e : androidx.core.graphics.a.b(0, 0, 0, i11);
        }

        protected boolean z(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !w(i10, false).equals(androidx.core.graphics.a.f3307e);
        }
    }

    private static class h extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private androidx.core.graphics.a f3433m;

        h(o oVar, WindowInsets windowInsets) {
            super(oVar, windowInsets);
            this.f3433m = null;
        }

        h(o oVar, h hVar) {
            super(oVar, hVar);
            this.f3433m = null;
            this.f3433m = hVar.f3433m;
        }

        @Override // androidx.core.view.o.l
        o b() {
            return o.w(this.f3428c.consumeStableInsets());
        }

        @Override // androidx.core.view.o.l
        o c() {
            return o.w(this.f3428c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.o.l
        final androidx.core.graphics.a j() {
            if (this.f3433m == null) {
                this.f3433m = androidx.core.graphics.a.b(this.f3428c.getStableInsetLeft(), this.f3428c.getStableInsetTop(), this.f3428c.getStableInsetRight(), this.f3428c.getStableInsetBottom());
            }
            return this.f3433m;
        }

        @Override // androidx.core.view.o.l
        boolean o() {
            return this.f3428c.isConsumed();
        }

        @Override // androidx.core.view.o.l
        public void u(androidx.core.graphics.a aVar) {
            this.f3433m = aVar;
        }
    }

    private static class i extends h {
        i(o oVar, WindowInsets windowInsets) {
            super(oVar, windowInsets);
        }

        i(o oVar, i iVar) {
            super(oVar, iVar);
        }

        @Override // androidx.core.view.o.l
        o a() {
            return o.w(this.f3428c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.o.g, androidx.core.view.o.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f3428c, iVar.f3428c) && Objects.equals(this.f3432g, iVar.f3432g);
        }

        @Override // androidx.core.view.o.l
        androidx.core.view.b f() {
            return androidx.core.view.b.f(this.f3428c.getDisplayCutout());
        }

        @Override // androidx.core.view.o.l
        public int hashCode() {
            return this.f3428c.hashCode();
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private androidx.core.graphics.a f3434n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private androidx.core.graphics.a f3435o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private androidx.core.graphics.a f3436p;

        j(o oVar, WindowInsets windowInsets) {
            super(oVar, windowInsets);
            this.f3434n = null;
            this.f3435o = null;
            this.f3436p = null;
        }

        j(o oVar, j jVar) {
            super(oVar, jVar);
            this.f3434n = null;
            this.f3435o = null;
            this.f3436p = null;
        }

        @Override // androidx.core.view.o.l
        androidx.core.graphics.a i() {
            if (this.f3435o == null) {
                this.f3435o = androidx.core.graphics.a.d(this.f3428c.getMandatorySystemGestureInsets());
            }
            return this.f3435o;
        }

        @Override // androidx.core.view.o.l
        androidx.core.graphics.a k() {
            if (this.f3434n == null) {
                this.f3434n = androidx.core.graphics.a.d(this.f3428c.getSystemGestureInsets());
            }
            return this.f3434n;
        }

        @Override // androidx.core.view.o.l
        androidx.core.graphics.a m() {
            if (this.f3436p == null) {
                this.f3436p = androidx.core.graphics.a.d(this.f3428c.getTappableElementInsets());
            }
            return this.f3436p;
        }

        @Override // androidx.core.view.o.g, androidx.core.view.o.l
        o n(int i10, int i11, int i12, int i13) {
            return o.w(this.f3428c.inset(i10, i11, i12, i13));
        }

        @Override // androidx.core.view.o.h, androidx.core.view.o.l
        public void u(androidx.core.graphics.a aVar) {
        }
    }

    private static class k extends j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final o f3437q = o.w(WindowInsets.CONSUMED);

        k(o oVar, WindowInsets windowInsets) {
            super(oVar, windowInsets);
        }

        k(o oVar, k kVar) {
            super(oVar, kVar);
        }

        @Override // androidx.core.view.o.g, androidx.core.view.o.l
        final void d(View view) {
        }

        @Override // androidx.core.view.o.g, androidx.core.view.o.l
        public androidx.core.graphics.a g(int i10) {
            return androidx.core.graphics.a.d(this.f3428c.getInsets(n.a(i10)));
        }

        @Override // androidx.core.view.o.g, androidx.core.view.o.l
        public androidx.core.graphics.a h(int i10) {
            return androidx.core.graphics.a.d(this.f3428c.getInsetsIgnoringVisibility(n.a(i10)));
        }

        @Override // androidx.core.view.o.g, androidx.core.view.o.l
        public boolean q(int i10) {
            return this.f3428c.isVisible(n.a(i10));
        }
    }

    private static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final o f3438b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final o f3439a;

        l(o oVar) {
            this.f3439a = oVar;
        }

        o a() {
            return this.f3439a;
        }

        o b() {
            return this.f3439a;
        }

        o c() {
            return this.f3439a;
        }

        void d(View view) {
        }

        void e(o oVar) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && n3.c.a(l(), lVar.l()) && n3.c.a(j(), lVar.j()) && n3.c.a(f(), lVar.f());
        }

        androidx.core.view.b f() {
            return null;
        }

        androidx.core.graphics.a g(int i10) {
            return androidx.core.graphics.a.f3307e;
        }

        androidx.core.graphics.a h(int i10) {
            if ((i10 & 8) == 0) {
                return androidx.core.graphics.a.f3307e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return n3.c.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        androidx.core.graphics.a i() {
            return l();
        }

        androidx.core.graphics.a j() {
            return androidx.core.graphics.a.f3307e;
        }

        androidx.core.graphics.a k() {
            return l();
        }

        androidx.core.graphics.a l() {
            return androidx.core.graphics.a.f3307e;
        }

        androidx.core.graphics.a m() {
            return l();
        }

        o n(int i10, int i11, int i12, int i13) {
            return f3438b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i10) {
            return true;
        }

        public void r(androidx.core.graphics.a[] aVarArr) {
        }

        void s(androidx.core.graphics.a aVar) {
        }

        void t(o oVar) {
        }

        public void u(androidx.core.graphics.a aVar) {
        }
    }

    public static final class m {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        static int d(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    private static final class n {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets$Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets$Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets$Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets$Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets$Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets$Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets$Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        f3407b = Build.VERSION.SDK_INT >= 30 ? k.f3437q : l.f3438b;
    }

    private o(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f3408a = i10 >= 30 ? new k(this, windowInsets) : i10 >= 29 ? new j(this, windowInsets) : i10 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public o(o oVar) {
        if (oVar == null) {
            this.f3408a = new l(this);
            return;
        }
        l lVar = oVar.f3408a;
        int i10 = Build.VERSION.SDK_INT;
        this.f3408a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    static androidx.core.graphics.a n(androidx.core.graphics.a aVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, aVar.f3308a - i10);
        int iMax2 = Math.max(0, aVar.f3309b - i11);
        int iMax3 = Math.max(0, aVar.f3310c - i12);
        int iMax4 = Math.max(0, aVar.f3311d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? aVar : androidx.core.graphics.a.b(iMax, iMax2, iMax3, iMax4);
    }

    public static o w(WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    public static o x(WindowInsets windowInsets, View view) {
        o oVar = new o((WindowInsets) n3.g.h(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            oVar.t(androidx.core.view.h.y(view));
            oVar.d(view.getRootView());
        }
        return oVar;
    }

    @Deprecated
    public o a() {
        return this.f3408a.a();
    }

    @Deprecated
    public o b() {
        return this.f3408a.b();
    }

    @Deprecated
    public o c() {
        return this.f3408a.c();
    }

    void d(View view) {
        this.f3408a.d(view);
    }

    public androidx.core.view.b e() {
        return this.f3408a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return n3.c.a(this.f3408a, ((o) obj).f3408a);
        }
        return false;
    }

    public androidx.core.graphics.a f(int i10) {
        return this.f3408a.g(i10);
    }

    public androidx.core.graphics.a g(int i10) {
        return this.f3408a.h(i10);
    }

    @Deprecated
    public androidx.core.graphics.a h() {
        return this.f3408a.j();
    }

    public int hashCode() {
        l lVar = this.f3408a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f3408a.l().f3311d;
    }

    @Deprecated
    public int j() {
        return this.f3408a.l().f3308a;
    }

    @Deprecated
    public int k() {
        return this.f3408a.l().f3310c;
    }

    @Deprecated
    public int l() {
        return this.f3408a.l().f3309b;
    }

    public o m(int i10, int i11, int i12, int i13) {
        return this.f3408a.n(i10, i11, i12, i13);
    }

    public boolean o() {
        return this.f3408a.o();
    }

    public boolean p(int i10) {
        return this.f3408a.q(i10);
    }

    @Deprecated
    public o q(int i10, int i11, int i12, int i13) {
        return new b(this).d(androidx.core.graphics.a.b(i10, i11, i12, i13)).a();
    }

    void r(androidx.core.graphics.a[] aVarArr) {
        this.f3408a.r(aVarArr);
    }

    void s(androidx.core.graphics.a aVar) {
        this.f3408a.s(aVar);
    }

    void t(o oVar) {
        this.f3408a.t(oVar);
    }

    void u(androidx.core.graphics.a aVar) {
        this.f3408a.u(aVar);
    }

    public WindowInsets v() {
        l lVar = this.f3408a;
        if (lVar instanceof g) {
            return ((g) lVar).f3428c;
        }
        return null;
    }
}
