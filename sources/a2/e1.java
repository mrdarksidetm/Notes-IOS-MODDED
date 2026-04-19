package a2;

import b2.d2;
import b2.x1;
import n2.s;
import n2.t;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public interface e1 {
    public static final a K = a.f65a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f65a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static boolean f66b;

        private a() {
        }

        public final boolean a() {
            return f66b;
        }
    }

    public interface b {
        void c();
    }

    static /* synthetic */ void c(e1 e1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        e1Var.a(z10);
    }

    static /* synthetic */ void i(e1 e1Var, f0 f0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        e1Var.u(f0Var, z10);
    }

    static /* synthetic */ void r(e1 e1Var, f0 f0Var, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        e1Var.h(f0Var, z10, z11);
    }

    static /* synthetic */ void t(e1 e1Var, f0 f0Var, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        e1Var.d(f0Var, z10, z11, z12);
    }

    void a(boolean z10);

    void b(zd.a<md.i0> aVar);

    void d(f0 f0Var, boolean z10, boolean z11, boolean z12);

    void e(f0 f0Var);

    long g(long j10);

    b2.b getAccessibilityManager();

    g1.e getAutofill();

    g1.n getAutofillTree();

    b2.i0 getClipboardManager();

    qd.g getCoroutineContext();

    w2.d getDensity();

    h1.c getDragAndDropManager();

    j1.i getFocusOwner();

    t.b getFontFamilyResolver();

    s.b getFontLoader();

    r1.a getHapticFeedBack();

    s1.b getInputModeManager();

    w2.r getLayoutDirection();

    z1.f getModifierLocalManager();

    default t0.a getPlacementScope() {
        return y1.u0.b(this);
    }

    v1.y getPointerIconService();

    f0 getRoot();

    h0 getSharedDrawScope();

    boolean getShowLayoutBounds();

    g1 getSnapshotObserver();

    b2.p1 getSoftwareKeyboardController();

    p2.g0 getTextInputService();

    b2.r1 getTextToolbar();

    x1 getViewConfiguration();

    d2 getWindowInfo();

    void h(f0 f0Var, boolean z10, boolean z11);

    void l(f0 f0Var, long j10);

    void m(b bVar);

    void n();

    void p();

    void q(f0 f0Var);

    boolean requestFocus();

    void setShowLayoutBounds(boolean z10);

    void u(f0 f0Var, boolean z10);

    void w(f0 f0Var);

    d1 x(zd.l<? super l1.b0, md.i0> lVar, zd.a<md.i0> aVar);

    void y(f0 f0Var);
}
