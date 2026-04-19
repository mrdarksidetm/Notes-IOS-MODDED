package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.core.view.a;
import androidx.core.view.n;
import androidx.core.view.o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import o3.h0;
import o3.i0;
import o3.j0;
import z.c0;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap<View, androidx.core.view.l> f3350a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f3351b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f3352c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f3353d = {c3.d.f6320b, c3.d.f6321c, c3.d.f6332n, c3.d.f6343y, c3.d.B, c3.d.C, c3.d.D, c3.d.E, c3.d.F, c3.d.G, c3.d.f6322d, c3.d.f6323e, c3.d.f6324f, c3.d.f6325g, c3.d.f6326h, c3.d.f6327i, c3.d.f6328j, c3.d.f6329k, c3.d.f6330l, c3.d.f6331m, c3.d.f6333o, c3.d.f6334p, c3.d.f6335q, c3.d.f6336r, c3.d.f6337s, c3.d.f6338t, c3.d.f6339u, c3.d.f6340v, c3.d.f6341w, c3.d.f6342x, c3.d.f6344z, c3.d.A};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j0 f3354e = new j0() { // from class: o3.l0
        @Override // o3.j0
        public final b a(b bVar) {
            return androidx.core.view.h.K(bVar);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f3355f = new e();

    class a extends f<Boolean> {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.j(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f<CharSequence> {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return k.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            k.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f<CharSequence> {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return m.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            m.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f<Boolean> {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.h.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakHashMap<View, Boolean> f3356a = new WeakHashMap<>();

        e() {
        }

        private void b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                h.L(key, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f3356a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f3356a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f3356a.entrySet().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<T> f3358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f3360d;

        f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        f(int i10, Class<T> cls, int i11, int i12) {
            this.f3357a = i10;
            this.f3358b = cls;
            this.f3360d = i11;
            this.f3359c = i12;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f3359c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T c(View view);

        abstract void d(View view, T t10);

        T e(View view) {
            if (b()) {
                return c(view);
            }
            T t10 = (T) view.getTag(this.f3357a);
            if (this.f3358b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        void f(View view, T t10) {
            if (b()) {
                d(view, t10);
            } else if (g(e(view), t10)) {
                h.h(view);
                view.setTag(this.f3357a, t10);
                h.L(view, this.f3360d);
            }
        }

        abstract boolean g(T t10, T t11);
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.h$h, reason: collision with other inner class name */
    private static class C0083h {

        /* JADX INFO: renamed from: androidx.core.view.h$h$a */
        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            androidx.core.view.o f3361a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f3362b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h0 f3363c;

            a(View view, h0 h0Var) {
                this.f3362b = view;
                this.f3363c = h0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                androidx.core.view.o oVarX = androidx.core.view.o.x(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    C0083h.a(windowInsets, this.f3362b);
                    if (oVarX.equals(this.f3361a)) {
                        return this.f3363c.a(view, oVarX).v();
                    }
                }
                this.f3361a = oVarX;
                androidx.core.view.o oVarA = this.f3363c.a(view, oVarX);
                if (i10 >= 30) {
                    return oVarA.v();
                }
                h.T(view);
                return oVarA.v();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(c3.d.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static androidx.core.view.o b(View view, androidx.core.view.o oVar, Rect rect) {
            WindowInsets windowInsetsV = oVar.v();
            if (windowInsetsV != null) {
                return androidx.core.view.o.x(view.computeSystemWindowInsets(windowInsetsV, rect), view);
            }
            rect.setEmpty();
            return oVar;
        }

        static boolean c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        static boolean d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static androidx.core.view.o j(View view) {
            return o.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f10) {
            view.setElevation(f10);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, h0 h0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(c3.d.L, h0Var);
            }
            if (h0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(c3.d.S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, h0Var));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void x(View view, float f10) {
            view.setZ(f10);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static androidx.core.view.o a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            androidx.core.view.o oVarW = androidx.core.view.o.w(rootWindowInsets);
            oVarW.t(oVarW);
            oVarW.d(view.getRootView());
            return oVarW;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    static class j {
        static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void n(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    static class k {
        static void a(View view, final p pVar) {
            int i10 = c3.d.R;
            c0 c0Var = (c0) view.getTag(i10);
            if (c0Var == null) {
                c0Var = new c0();
                view.setTag(i10, c0Var);
            }
            Objects.requireNonNull(pVar);
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener = new View$OnUnhandledKeyEventListener() { // from class: o3.j1
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return pVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            c0Var.put(pVar, view$OnUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, p pVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            c0 c0Var = (c0) view.getTag(c3.d.R);
            if (c0Var == null || (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) c0Var.get(pVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, q3.a aVar) {
            view.setAutofillId(null);
        }

        static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    private static class l {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void e(View view, r3.a aVar) {
            view.setContentCaptureSession(null);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class m {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        static void d(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class n {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static o3.b b(View view, o3.b bVar) {
            ContentInfo contentInfoF = bVar.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? bVar : o3.b.g(contentInfoPerformReceiveContent);
        }

        public static void c(View view, String[] strArr, i0 i0Var) {
            if (i0Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new o(i0Var));
            }
        }
    }

    private static final class o implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i0 f3364a;

        o(i0 i0Var) {
            this.f3364a = i0Var;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            o3.b bVarG = o3.b.g(contentInfo);
            o3.b bVarA = this.f3364a.a(view, bVarG);
            if (bVarA == null) {
                return null;
            }
            return bVarA == bVarG ? contentInfo : bVarA.f();
        }
    }

    public interface p {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f3365d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap<View, Boolean> f3366a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f3367b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<KeyEvent> f3368c = null;

        q() {
        }

        static q a(View view) {
            int i10 = c3.d.Q;
            q qVar = (q) view.getTag(i10);
            if (qVar != null) {
                return qVar;
            }
            q qVar2 = new q();
            view.setTag(i10, qVar2);
            return qVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3366a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f3367b == null) {
                this.f3367b = new SparseArray<>();
            }
            return this.f3367b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(c3.d.R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((p) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f3366a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f3365d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f3366a == null) {
                    this.f3366a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f3365d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f3366a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f3366a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f3368c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f3368c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReferenceValueAt = null;
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static String A(View view) {
        return C0083h.k(view);
    }

    @Deprecated
    public static int B(View view) {
        return view.getWindowSystemUiVisibility();
    }

    @Deprecated
    public static boolean C(View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean D(View view) {
        return view.hasOverlappingRendering();
    }

    @Deprecated
    public static boolean E(View view) {
        return view.hasTransientState();
    }

    public static boolean F(View view) {
        Boolean boolE = b().e(view);
        return boolE != null && boolE.booleanValue();
    }

    @Deprecated
    public static boolean G(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean H(View view) {
        return view.isLaidOut();
    }

    public static boolean I(View view) {
        return C0083h.p(view);
    }

    public static boolean J(View view) {
        Boolean boolE = V().e(view);
        return boolE != null && boolE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o3.b K(o3.b bVar) {
        return bVar;
    }

    static void L(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = l(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(l(view));
                    g0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(l(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void M(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static androidx.core.view.o N(View view, androidx.core.view.o oVar) {
        WindowInsets windowInsetsV = oVar.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsV);
            if (!windowInsetsB.equals(windowInsetsV)) {
                return androidx.core.view.o.x(windowInsetsB, view);
            }
        }
        return oVar;
    }

    private static f<CharSequence> O() {
        return new b(c3.d.K, CharSequence.class, 8, 28);
    }

    public static o3.b P(View view, o3.b bVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + bVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.b(view, bVar);
        }
        i0 i0Var = (i0) view.getTag(c3.d.M);
        if (i0Var == null) {
            return q(view).a(bVar);
        }
        o3.b bVarA = i0Var.a(view, bVar);
        if (bVarA == null) {
            return null;
        }
        return q(view).a(bVarA);
    }

    @Deprecated
    public static void Q(View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    public static void R(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Deprecated
    public static void S(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static void T(View view) {
        g.c(view);
    }

    public static void U(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.d(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static f<Boolean> V() {
        return new a(c3.d.O, Boolean.class, 28);
    }

    public static void W(View view, androidx.core.view.a aVar) {
        if (aVar == null && (j(view) instanceof a.C0081a)) {
            aVar = new androidx.core.view.a();
        }
        g0(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void X(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    public static void Y(View view, CharSequence charSequence) {
        O().f(view, charSequence);
        if (charSequence != null) {
            f3355f.a(view);
        } else {
            f3355f.d(view);
        }
    }

    @Deprecated
    public static void Z(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void a0(View view, ColorStateList colorStateList) {
        C0083h.q(view, colorStateList);
    }

    private static f<Boolean> b() {
        return new d(c3.d.J, Boolean.class, 28);
    }

    public static void b0(View view, PorterDuff.Mode mode) {
        C0083h.r(view, mode);
    }

    @Deprecated
    public static androidx.core.view.l c(View view) {
        if (f3350a == null) {
            f3350a = new WeakHashMap<>();
        }
        androidx.core.view.l lVar = f3350a.get(view);
        if (lVar != null) {
            return lVar;
        }
        androidx.core.view.l lVar2 = new androidx.core.view.l(view);
        f3350a.put(view, lVar2);
        return lVar2;
    }

    @Deprecated
    public static void c0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static androidx.core.view.o d(View view, androidx.core.view.o oVar, Rect rect) {
        return C0083h.b(view, oVar, rect);
    }

    public static void d0(View view, float f10) {
        C0083h.s(view, f10);
    }

    public static androidx.core.view.o e(View view, androidx.core.view.o oVar) {
        WindowInsets windowInsetsV = oVar.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsV);
            if (!windowInsetsA.equals(windowInsetsV)) {
                return androidx.core.view.o.x(windowInsetsA, view);
            }
        }
        return oVar;
    }

    @Deprecated
    public static void e0(View view, boolean z10) {
        view.setHasTransientState(z10);
    }

    static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).b(view, keyEvent);
    }

    @Deprecated
    public static void f0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    static boolean g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return q.a(view).f(keyEvent);
    }

    private static void g0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    static void h(View view) {
        androidx.core.view.a aVarI = i(view);
        if (aVarI == null) {
            aVarI = new androidx.core.view.a();
        }
        W(view, aVarI);
    }

    public static void h0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            j.m(view, i10);
        }
    }

    public static androidx.core.view.a i(View view) {
        View.AccessibilityDelegate accessibilityDelegateJ = j(view);
        if (accessibilityDelegateJ == null) {
            return null;
        }
        return accessibilityDelegateJ instanceof a.C0081a ? ((a.C0081a) accessibilityDelegateJ).f3335a : new androidx.core.view.a(accessibilityDelegateJ);
    }

    public static void i0(View view, h0 h0Var) {
        C0083h.u(view, h0Var);
    }

    private static View.AccessibilityDelegate j(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : k(view);
    }

    public static void j0(View view, boolean z10) {
        V().f(view, Boolean.valueOf(z10));
    }

    private static View.AccessibilityDelegate k(View view) {
        if (f3352c) {
            return null;
        }
        if (f3351b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3351b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3352c = true;
                return null;
            }
        }
        try {
            Object obj = f3351b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3352c = true;
            return null;
        }
    }

    public static void k0(View view, int i10, int i11) {
        i.d(view, i10, i11);
    }

    public static CharSequence l(View view) {
        return O().e(view);
    }

    public static void l0(View view, CharSequence charSequence) {
        o0().f(view, charSequence);
    }

    public static ColorStateList m(View view) {
        return C0083h.g(view);
    }

    public static void m0(View view, String str) {
        C0083h.v(view, str);
    }

    public static PorterDuff.Mode n(View view) {
        return C0083h.h(view);
    }

    public static void n0(View view, n.b bVar) {
        androidx.core.view.n.c(view, bVar);
    }

    @Deprecated
    public static Rect o(View view) {
        return view.getClipBounds();
    }

    private static f<CharSequence> o0() {
        return new c(c3.d.P, CharSequence.class, 64, 30);
    }

    @Deprecated
    public static Display p(View view) {
        return view.getDisplay();
    }

    public static void p0(View view) {
        C0083h.z(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static j0 q(View view) {
        return view instanceof j0 ? (j0) view : f3354e;
    }

    @Deprecated
    public static int r(View view) {
        return view.getImportantForAccessibility();
    }

    public static int s(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j.c(view);
        }
        return 0;
    }

    @Deprecated
    public static int t(View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    public static int u(View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static int v(View view) {
        return view.getMinimumWidth();
    }

    public static String[] w(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.a(view) : (String[]) view.getTag(c3.d.N);
    }

    @Deprecated
    public static ViewParent x(View view) {
        return view.getParentForAccessibility();
    }

    public static androidx.core.view.o y(View view) {
        return i.a(view);
    }

    public static CharSequence z(View view) {
        return o0().e(view);
    }
}
