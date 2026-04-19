package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.app.e;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.s0;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class m extends androidx.appcompat.app.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final r.m f1073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Window.Callback f1074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final e.g f1075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f1076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<a.b> f1079g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f1080h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Toolbar.h f1081i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.B();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return m.this.f1074b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1084a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f1084a) {
                return;
            }
            this.f1084a = true;
            m.this.f1073a.i();
            m.this.f1074b.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, eVar);
            this.f1084a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            m.this.f1074b.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, eVar);
            return true;
        }
    }

    private final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (m.this.f1073a.b()) {
                m.this.f1074b.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, eVar);
            } else if (m.this.f1074b.onPreparePanel(0, null, eVar)) {
                m.this.f1074b.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, eVar);
            }
        }
    }

    private class e implements e.g {
        e() {
        }

        @Override // androidx.appcompat.app.e.g
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            m mVar = m.this;
            if (mVar.f1076d) {
                return false;
            }
            mVar.f1073a.c();
            m.this.f1076d = true;
            return false;
        }

        @Override // androidx.appcompat.app.e.g
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(m.this.f1073a.getContext());
            }
            return null;
        }
    }

    m(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f1081i = bVar;
        n3.g.h(toolbar);
        s0 s0Var = new s0(toolbar, false);
        this.f1073a = s0Var;
        this.f1074b = (Window.Callback) n3.g.h(callback);
        s0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        s0Var.setWindowTitle(charSequence);
        this.f1075c = new e();
    }

    private Menu A() {
        if (!this.f1077e) {
            this.f1073a.q(new c(), new d());
            this.f1077e = true;
        }
        return this.f1073a.m();
    }

    void B() {
        Menu menuA = A();
        androidx.appcompat.view.menu.e eVar = menuA instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuA : null;
        if (eVar != null) {
            eVar.e0();
        }
        try {
            menuA.clear();
            if (!this.f1074b.onCreatePanelMenu(0, menuA) || !this.f1074b.onPreparePanel(0, null, menuA)) {
                menuA.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.d0();
            }
        }
    }

    public void C(int i10, int i11) {
        this.f1073a.l((i10 & i11) | ((~i11) & this.f1073a.u()));
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        return this.f1073a.g();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        if (!this.f1073a.k()) {
            return false;
        }
        this.f1073a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f1078f) {
            return;
        }
        this.f1078f = z10;
        int size = this.f1079g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1079g.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f1073a.u();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        return this.f1073a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        this.f1073a.r(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.f1073a.s().removeCallbacks(this.f1080h);
        androidx.core.view.h.R(this.f1073a.s(), this.f1080h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean m() {
        return this.f1073a.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.a
    public void n(Configuration configuration) {
        super.n(configuration);
    }

    @Override // androidx.appcompat.app.a
    void o() {
        this.f1073a.s().removeCallbacks(this.f1080h);
    }

    @Override // androidx.appcompat.app.a
    public boolean p(int i10, KeyEvent keyEvent) {
        Menu menuA = A();
        if (menuA == null) {
            return false;
        }
        menuA.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuA.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            r();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean r() {
        return this.f1073a.h();
    }

    @Override // androidx.appcompat.app.a
    public void s(Drawable drawable) {
        this.f1073a.e(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        C(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f1073a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f1073a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void y() {
        this.f1073a.r(0);
    }
}
