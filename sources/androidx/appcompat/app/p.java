package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o3.f2;
import o3.g2;
import o3.h2;
import p.b;

/* JADX INFO: loaded from: classes.dex */
public class p extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f1098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f1099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f1100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f1101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarContainer f1102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    r.m f1103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ActionBarContextView f1104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    View f1105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    l0 f1106i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f1109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    d f1110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    p.b f1111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    b.a f1112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f1113p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1115r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f1118u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f1119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f1120w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    p.g f1122y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f1123z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<Object> f1107j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1108k = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList<a.b> f1114q = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1116s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f1117t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f1121x = true;
    final f2 B = new a();
    final f2 C = new b();
    final h2 D = new c();

    class a extends g2 {
        a() {
        }

        @Override // o3.f2
        public void b(View view) {
            View view2;
            p pVar = p.this;
            if (pVar.f1117t && (view2 = pVar.f1105h) != null) {
                view2.setTranslationY(0.0f);
                p.this.f1102e.setTranslationY(0.0f);
            }
            p.this.f1102e.setVisibility(8);
            p.this.f1102e.setTransitioning(false);
            p pVar2 = p.this;
            pVar2.f1122y = null;
            pVar2.C();
            ActionBarOverlayLayout actionBarOverlayLayout = p.this.f1101d;
            if (actionBarOverlayLayout != null) {
                androidx.core.view.h.T(actionBarOverlayLayout);
            }
        }
    }

    class b extends g2 {
        b() {
        }

        @Override // o3.f2
        public void b(View view) {
            p pVar = p.this;
            pVar.f1122y = null;
            pVar.f1102e.requestLayout();
        }
    }

    class c implements h2 {
        c() {
        }

        @Override // o3.h2
        public void a(View view) {
            ((View) p.this.f1102e.getParent()).invalidate();
        }
    }

    public class d extends p.b implements e.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f1127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f1128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private b.a f1129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private WeakReference<View> f1130f;

        public d(Context context, b.a aVar) {
            this.f1127c = context;
            this.f1129e = aVar;
            androidx.appcompat.view.menu.e eVarS = new androidx.appcompat.view.menu.e(context).S(1);
            this.f1128d = eVarS;
            eVarS.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f1129e;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f1129e == null) {
                return;
            }
            k();
            p.this.f1104g.l();
        }

        @Override // p.b
        public void c() {
            p pVar = p.this;
            if (pVar.f1110m != this) {
                return;
            }
            if (p.B(pVar.f1118u, pVar.f1119v, false)) {
                this.f1129e.d(this);
            } else {
                p pVar2 = p.this;
                pVar2.f1111n = this;
                pVar2.f1112o = this.f1129e;
            }
            this.f1129e = null;
            p.this.A(false);
            p.this.f1104g.g();
            p pVar3 = p.this;
            pVar3.f1101d.setHideOnContentScrollEnabled(pVar3.A);
            p.this.f1110m = null;
        }

        @Override // p.b
        public View d() {
            WeakReference<View> weakReference = this.f1130f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p.b
        public Menu e() {
            return this.f1128d;
        }

        @Override // p.b
        public MenuInflater f() {
            return new p.f(this.f1127c);
        }

        @Override // p.b
        public CharSequence g() {
            return p.this.f1104g.getSubtitle();
        }

        @Override // p.b
        public CharSequence i() {
            return p.this.f1104g.getTitle();
        }

        @Override // p.b
        public void k() {
            if (p.this.f1110m != this) {
                return;
            }
            this.f1128d.e0();
            try {
                this.f1129e.c(this, this.f1128d);
            } finally {
                this.f1128d.d0();
            }
        }

        @Override // p.b
        public boolean l() {
            return p.this.f1104g.j();
        }

        @Override // p.b
        public void m(View view) {
            p.this.f1104g.setCustomView(view);
            this.f1130f = new WeakReference<>(view);
        }

        @Override // p.b
        public void n(int i10) {
            o(p.this.f1098a.getResources().getString(i10));
        }

        @Override // p.b
        public void o(CharSequence charSequence) {
            p.this.f1104g.setSubtitle(charSequence);
        }

        @Override // p.b
        public void q(int i10) {
            r(p.this.f1098a.getResources().getString(i10));
        }

        @Override // p.b
        public void r(CharSequence charSequence) {
            p.this.f1104g.setTitle(charSequence);
        }

        @Override // p.b
        public void s(boolean z10) {
            super.s(z10);
            p.this.f1104g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f1128d.e0();
            try {
                return this.f1129e.a(this, this.f1128d);
            } finally {
                this.f1128d.d0();
            }
        }
    }

    public p(Activity activity, boolean z10) {
        this.f1100c = activity;
        View decorView = activity.getWindow().getDecorView();
        K(decorView);
        if (z10) {
            return;
        }
        this.f1105h = decorView.findViewById(R.id.content);
    }

    public p(Dialog dialog) {
        K(dialog.getWindow().getDecorView());
    }

    static boolean B(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r.m F(View view) {
        if (view instanceof r.m) {
            return (r.m) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void J() {
        if (this.f1120w) {
            this.f1120w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1101d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            T(false);
        }
    }

    private void K(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(j.f.f13422p);
        this.f1101d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1103f = F(view.findViewById(j.f.f13407a));
        this.f1104g = (ActionBarContextView) view.findViewById(j.f.f13412f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(j.f.f13409c);
        this.f1102e = actionBarContainer;
        r.m mVar = this.f1103f;
        if (mVar == null || this.f1104g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1098a = mVar.getContext();
        boolean z10 = (this.f1103f.u() & 4) != 0;
        if (z10) {
            this.f1109l = true;
        }
        p.a aVarB = p.a.b(this.f1098a);
        Q(aVarB.a() || z10);
        O(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f1098a.obtainStyledAttributes(null, j.j.f13472a, j.a.f13333c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(j.j.f13522k, false)) {
            P(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.j.f13512i, 0);
        if (dimensionPixelSize != 0) {
            N(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void O(boolean z10) {
        this.f1115r = z10;
        if (z10) {
            this.f1102e.setTabContainer(null);
            this.f1103f.j(this.f1106i);
        } else {
            this.f1103f.j(null);
            this.f1102e.setTabContainer(this.f1106i);
        }
        boolean z11 = I() == 2;
        l0 l0Var = this.f1106i;
        if (l0Var != null) {
            if (z11) {
                l0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1101d;
                if (actionBarOverlayLayout != null) {
                    androidx.core.view.h.T(actionBarOverlayLayout);
                }
            } else {
                l0Var.setVisibility(8);
            }
        }
        this.f1103f.x(!this.f1115r && z11);
        this.f1101d.setHasNonEmbeddedTabs(!this.f1115r && z11);
    }

    private boolean R() {
        return androidx.core.view.h.H(this.f1102e);
    }

    private void S() {
        if (this.f1120w) {
            return;
        }
        this.f1120w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1101d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        T(false);
    }

    private void T(boolean z10) {
        if (B(this.f1118u, this.f1119v, this.f1120w)) {
            if (this.f1121x) {
                return;
            }
            this.f1121x = true;
            E(z10);
            return;
        }
        if (this.f1121x) {
            this.f1121x = false;
            D(z10);
        }
    }

    public void A(boolean z10) {
        androidx.core.view.l lVarP;
        androidx.core.view.l lVarF;
        if (z10) {
            S();
        } else {
            J();
        }
        if (!R()) {
            if (z10) {
                this.f1103f.r(4);
                this.f1104g.setVisibility(0);
                return;
            } else {
                this.f1103f.r(0);
                this.f1104g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            lVarF = this.f1103f.p(4, 100L);
            lVarP = this.f1104g.f(0, 200L);
        } else {
            lVarP = this.f1103f.p(0, 200L);
            lVarF = this.f1104g.f(8, 100L);
        }
        p.g gVar = new p.g();
        gVar.d(lVarF, lVarP);
        gVar.h();
    }

    void C() {
        b.a aVar = this.f1112o;
        if (aVar != null) {
            aVar.d(this.f1111n);
            this.f1111n = null;
            this.f1112o = null;
        }
    }

    public void D(boolean z10) {
        View view;
        p.g gVar = this.f1122y;
        if (gVar != null) {
            gVar.a();
        }
        if (this.f1116s != 0 || (!this.f1123z && !z10)) {
            this.B.b(null);
            return;
        }
        this.f1102e.setAlpha(1.0f);
        this.f1102e.setTransitioning(true);
        p.g gVar2 = new p.g();
        float f10 = -this.f1102e.getHeight();
        if (z10) {
            this.f1102e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        androidx.core.view.l lVarM = androidx.core.view.h.c(this.f1102e).m(f10);
        lVarM.k(this.D);
        gVar2.c(lVarM);
        if (this.f1117t && (view = this.f1105h) != null) {
            gVar2.c(androidx.core.view.h.c(view).m(f10));
        }
        gVar2.f(E);
        gVar2.e(250L);
        gVar2.g(this.B);
        this.f1122y = gVar2;
        gVar2.h();
    }

    public void E(boolean z10) {
        View view;
        View view2;
        p.g gVar = this.f1122y;
        if (gVar != null) {
            gVar.a();
        }
        this.f1102e.setVisibility(0);
        if (this.f1116s == 0 && (this.f1123z || z10)) {
            this.f1102e.setTranslationY(0.0f);
            float f10 = -this.f1102e.getHeight();
            if (z10) {
                this.f1102e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f1102e.setTranslationY(f10);
            p.g gVar2 = new p.g();
            androidx.core.view.l lVarM = androidx.core.view.h.c(this.f1102e).m(0.0f);
            lVarM.k(this.D);
            gVar2.c(lVarM);
            if (this.f1117t && (view2 = this.f1105h) != null) {
                view2.setTranslationY(f10);
                gVar2.c(androidx.core.view.h.c(this.f1105h).m(0.0f));
            }
            gVar2.f(F);
            gVar2.e(250L);
            gVar2.g(this.C);
            this.f1122y = gVar2;
            gVar2.h();
        } else {
            this.f1102e.setAlpha(1.0f);
            this.f1102e.setTranslationY(0.0f);
            if (this.f1117t && (view = this.f1105h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1101d;
        if (actionBarOverlayLayout != null) {
            androidx.core.view.h.T(actionBarOverlayLayout);
        }
    }

    public int G() {
        return this.f1102e.getHeight();
    }

    public int H() {
        return this.f1101d.getActionBarHideOffset();
    }

    public int I() {
        return this.f1103f.o();
    }

    public void L(boolean z10) {
        M(z10 ? 4 : 0, 4);
    }

    public void M(int i10, int i11) {
        int iU = this.f1103f.u();
        if ((i11 & 4) != 0) {
            this.f1109l = true;
        }
        this.f1103f.l((i10 & i11) | ((~i11) & iU));
    }

    public void N(float f10) {
        androidx.core.view.h.d0(this.f1102e, f10);
    }

    public void P(boolean z10) {
        if (z10 && !this.f1101d.q()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z10;
        this.f1101d.setHideOnContentScrollEnabled(z10);
    }

    public void Q(boolean z10) {
        this.f1103f.t(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f1119v) {
            this.f1119v = false;
            T(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f1117t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f1119v) {
            return;
        }
        this.f1119v = true;
        T(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        p.g gVar = this.f1122y;
        if (gVar != null) {
            gVar.a();
            this.f1122y = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        r.m mVar = this.f1103f;
        if (mVar == null || !mVar.k()) {
            return false;
        }
        this.f1103f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f1113p) {
            return;
        }
        this.f1113p = z10;
        int size = this.f1114q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1114q.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f1103f.u();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f1099b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1098a.getTheme().resolveAttribute(j.a.f13337g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f1099b = new ContextThemeWrapper(this.f1098a, i10);
            } else {
                this.f1099b = this.f1098a;
            }
        }
        return this.f1099b;
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        if (this.f1118u) {
            return;
        }
        this.f1118u = true;
        T(false);
    }

    @Override // androidx.appcompat.app.a
    public boolean m() {
        int iG = G();
        return this.f1121x && (iG == 0 || H() < iG);
    }

    @Override // androidx.appcompat.app.a
    public void n(Configuration configuration) {
        O(p.a.b(this.f1098a).g());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f1116s = i10;
    }

    @Override // androidx.appcompat.app.a
    public boolean p(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f1110m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void s(Drawable drawable) {
        this.f1102e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        if (this.f1109l) {
            return;
        }
        L(z10);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        M(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
        p.g gVar;
        this.f1123z = z10;
        if (z10 || (gVar = this.f1122y) == null) {
            return;
        }
        gVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f1103f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f1103f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void y() {
        if (this.f1118u) {
            this.f1118u = false;
            T(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public p.b z(b.a aVar) {
        d dVar = this.f1110m;
        if (dVar != null) {
            dVar.c();
        }
        this.f1101d.setHideOnContentScrollEnabled(false);
        this.f1104g.k();
        d dVar2 = new d(this.f1104g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f1110m = dVar2;
        dVar2.k();
        this.f1104g.h(dVar2);
        A(true);
        return dVar2;
    }
}
