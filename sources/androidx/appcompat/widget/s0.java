package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import o3.g2;

/* JADX INFO: loaded from: classes.dex */
public class s0 implements r.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f1858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f1860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f1861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f1864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    CharSequence f1866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f1867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f1868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window.Callback f1869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f1870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c f1871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1872o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1873p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f1874q;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q.a f1875a;

        a() {
            this.f1875a = new q.a(s0.this.f1858a.getContext(), 0, R.id.home, 0, 0, s0.this.f1866i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s0 s0Var = s0.this;
            Window.Callback callback = s0Var.f1869l;
            if (callback == null || !s0Var.f1870m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1875a);
        }
    }

    class b extends g2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1877a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1878b;

        b(int i10) {
            this.f1878b = i10;
        }

        @Override // o3.g2, o3.f2
        public void a(View view) {
            this.f1877a = true;
        }

        @Override // o3.f2
        public void b(View view) {
            if (this.f1877a) {
                return;
            }
            s0.this.f1858a.setVisibility(this.f1878b);
        }

        @Override // o3.g2, o3.f2
        public void c(View view) {
            s0.this.f1858a.setVisibility(0);
        }
    }

    public s0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, j.h.f13453a, j.e.f13394n);
    }

    public s0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1872o = 0;
        this.f1873p = 0;
        this.f1858a = toolbar;
        this.f1866i = toolbar.getTitle();
        this.f1867j = toolbar.getSubtitle();
        this.f1865h = this.f1866i != null;
        this.f1864g = toolbar.getNavigationIcon();
        r0 r0VarU = r0.u(toolbar.getContext(), null, j.j.f13472a, j.a.f13333c, 0);
        this.f1874q = r0VarU.f(j.j.f13527l);
        if (z10) {
            CharSequence charSequenceO = r0VarU.o(j.j.f13557r);
            if (!TextUtils.isEmpty(charSequenceO)) {
                setTitle(charSequenceO);
            }
            CharSequence charSequenceO2 = r0VarU.o(j.j.f13547p);
            if (!TextUtils.isEmpty(charSequenceO2)) {
                F(charSequenceO2);
            }
            Drawable drawableF = r0VarU.f(j.j.f13537n);
            if (drawableF != null) {
                B(drawableF);
            }
            Drawable drawableF2 = r0VarU.f(j.j.f13532m);
            if (drawableF2 != null) {
                setIcon(drawableF2);
            }
            if (this.f1864g == null && (drawable = this.f1874q) != null) {
                E(drawable);
            }
            l(r0VarU.j(j.j.f13507h, 0));
            int iM = r0VarU.m(j.j.f13502g, 0);
            if (iM != 0) {
                z(LayoutInflater.from(this.f1858a.getContext()).inflate(iM, (ViewGroup) this.f1858a, false));
                l(this.f1859b | 16);
            }
            int iL = r0VarU.l(j.j.f13517j, 0);
            if (iL > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1858a.getLayoutParams();
                layoutParams.height = iL;
                this.f1858a.setLayoutParams(layoutParams);
            }
            int iD = r0VarU.d(j.j.f13497f, -1);
            int iD2 = r0VarU.d(j.j.f13492e, -1);
            if (iD >= 0 || iD2 >= 0) {
                this.f1858a.J(Math.max(iD, 0), Math.max(iD2, 0));
            }
            int iM2 = r0VarU.m(j.j.f13562s, 0);
            if (iM2 != 0) {
                Toolbar toolbar2 = this.f1858a;
                toolbar2.N(toolbar2.getContext(), iM2);
            }
            int iM3 = r0VarU.m(j.j.f13552q, 0);
            if (iM3 != 0) {
                Toolbar toolbar3 = this.f1858a;
                toolbar3.M(toolbar3.getContext(), iM3);
            }
            int iM4 = r0VarU.m(j.j.f13542o, 0);
            if (iM4 != 0) {
                this.f1858a.setPopupTheme(iM4);
            }
        } else {
            this.f1859b = y();
        }
        r0VarU.v();
        A(i10);
        this.f1868k = this.f1858a.getNavigationContentDescription();
        this.f1858a.setNavigationOnClickListener(new a());
    }

    private void G(CharSequence charSequence) {
        this.f1866i = charSequence;
        if ((this.f1859b & 8) != 0) {
            this.f1858a.setTitle(charSequence);
            if (this.f1865h) {
                androidx.core.view.h.Y(this.f1858a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f1859b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1868k)) {
                this.f1858a.setNavigationContentDescription(this.f1873p);
            } else {
                this.f1858a.setNavigationContentDescription(this.f1868k);
            }
        }
    }

    private void I() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1859b & 4) != 0) {
            toolbar = this.f1858a;
            drawable = this.f1864g;
            if (drawable == null) {
                drawable = this.f1874q;
            }
        } else {
            toolbar = this.f1858a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void J() {
        Drawable drawable;
        int i10 = this.f1859b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1863f) == null) {
            drawable = this.f1862e;
        }
        this.f1858a.setLogo(drawable);
    }

    private int y() {
        if (this.f1858a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1874q = this.f1858a.getNavigationIcon();
        return 15;
    }

    public void A(int i10) {
        if (i10 == this.f1873p) {
            return;
        }
        this.f1873p = i10;
        if (TextUtils.isEmpty(this.f1858a.getNavigationContentDescription())) {
            C(this.f1873p);
        }
    }

    public void B(Drawable drawable) {
        this.f1863f = drawable;
        J();
    }

    public void C(int i10) {
        D(i10 == 0 ? null : getContext().getString(i10));
    }

    public void D(CharSequence charSequence) {
        this.f1868k = charSequence;
        H();
    }

    public void E(Drawable drawable) {
        this.f1864g = drawable;
        I();
    }

    public void F(CharSequence charSequence) {
        this.f1867j = charSequence;
        if ((this.f1859b & 8) != 0) {
            this.f1858a.setSubtitle(charSequence);
        }
    }

    @Override // r.m
    public void a(Menu menu, j.a aVar) {
        if (this.f1871n == null) {
            c cVar = new c(this.f1858a.getContext());
            this.f1871n = cVar;
            cVar.p(j.f.f13413g);
        }
        this.f1871n.h(aVar);
        this.f1858a.K((androidx.appcompat.view.menu.e) menu, this.f1871n);
    }

    @Override // r.m
    public boolean b() {
        return this.f1858a.B();
    }

    @Override // r.m
    public void c() {
        this.f1870m = true;
    }

    @Override // r.m
    public void collapseActionView() {
        this.f1858a.e();
    }

    @Override // r.m
    public boolean d() {
        return this.f1858a.d();
    }

    @Override // r.m
    public void e(Drawable drawable) {
        androidx.core.view.h.Z(this.f1858a, drawable);
    }

    @Override // r.m
    public boolean f() {
        return this.f1858a.A();
    }

    @Override // r.m
    public boolean g() {
        return this.f1858a.w();
    }

    @Override // r.m
    public Context getContext() {
        return this.f1858a.getContext();
    }

    @Override // r.m
    public CharSequence getTitle() {
        return this.f1858a.getTitle();
    }

    @Override // r.m
    public int getVisibility() {
        return this.f1858a.getVisibility();
    }

    @Override // r.m
    public boolean h() {
        return this.f1858a.Q();
    }

    @Override // r.m
    public void i() {
        this.f1858a.f();
    }

    @Override // r.m
    public void j(l0 l0Var) {
        View view = this.f1860c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1858a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1860c);
            }
        }
        this.f1860c = l0Var;
        if (l0Var == null || this.f1872o != 2) {
            return;
        }
        this.f1858a.addView(l0Var, 0);
        Toolbar.g gVar = (Toolbar.g) this.f1860c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f955a = 8388691;
        l0Var.setAllowCollapse(true);
    }

    @Override // r.m
    public boolean k() {
        return this.f1858a.v();
    }

    @Override // r.m
    public void l(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f1859b ^ i10;
        this.f1859b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i11 & 3) != 0) {
                J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1858a.setTitle(this.f1866i);
                    toolbar = this.f1858a;
                    charSequence = this.f1867j;
                } else {
                    charSequence = null;
                    this.f1858a.setTitle((CharSequence) null);
                    toolbar = this.f1858a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f1861d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1858a.addView(view);
            } else {
                this.f1858a.removeView(view);
            }
        }
    }

    @Override // r.m
    public Menu m() {
        return this.f1858a.getMenu();
    }

    @Override // r.m
    public void n(int i10) {
        B(i10 != 0 ? l.a.b(getContext(), i10) : null);
    }

    @Override // r.m
    public int o() {
        return this.f1872o;
    }

    @Override // r.m
    public androidx.core.view.l p(int i10, long j10) {
        return androidx.core.view.h.c(this.f1858a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    @Override // r.m
    public void q(j.a aVar, e.a aVar2) {
        this.f1858a.L(aVar, aVar2);
    }

    @Override // r.m
    public void r(int i10) {
        this.f1858a.setVisibility(i10);
    }

    @Override // r.m
    public ViewGroup s() {
        return this.f1858a;
    }

    @Override // r.m
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? l.a.b(getContext(), i10) : null);
    }

    @Override // r.m
    public void setIcon(Drawable drawable) {
        this.f1862e = drawable;
        J();
    }

    @Override // r.m
    public void setTitle(CharSequence charSequence) {
        this.f1865h = true;
        G(charSequence);
    }

    @Override // r.m
    public void setWindowCallback(Window.Callback callback) {
        this.f1869l = callback;
    }

    @Override // r.m
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1865h) {
            return;
        }
        G(charSequence);
    }

    @Override // r.m
    public void t(boolean z10) {
    }

    @Override // r.m
    public int u() {
        return this.f1859b;
    }

    @Override // r.m
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // r.m
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // r.m
    public void x(boolean z10) {
        this.f1858a.setCollapsible(z10);
    }

    public void z(View view) {
        View view2 = this.f1861d;
        if (view2 != null && (this.f1859b & 16) != 0) {
            this.f1858a.removeView(view2);
        }
        this.f1861d = view;
        if (view == null || (this.f1859b & 16) == 0) {
            return;
        }
        this.f1858a.addView(view);
    }
}
