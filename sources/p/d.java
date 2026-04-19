package p;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p.b;

/* JADX INFO: loaded from: classes.dex */
public class d extends b implements e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f17704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ActionBarContextView f17705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b.a f17706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference<View> f17707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f17710i;

    public d(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f17704c = context;
        this.f17705d = actionBarContextView;
        this.f17706e = aVar;
        androidx.appcompat.view.menu.e eVarS = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f17710i = eVarS;
        eVarS.R(this);
        this.f17709h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f17706e.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f17705d.l();
    }

    @Override // p.b
    public void c() {
        if (this.f17708g) {
            return;
        }
        this.f17708g = true;
        this.f17706e.d(this);
    }

    @Override // p.b
    public View d() {
        WeakReference<View> weakReference = this.f17707f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p.b
    public Menu e() {
        return this.f17710i;
    }

    @Override // p.b
    public MenuInflater f() {
        return new f(this.f17705d.getContext());
    }

    @Override // p.b
    public CharSequence g() {
        return this.f17705d.getSubtitle();
    }

    @Override // p.b
    public CharSequence i() {
        return this.f17705d.getTitle();
    }

    @Override // p.b
    public void k() {
        this.f17706e.c(this, this.f17710i);
    }

    @Override // p.b
    public boolean l() {
        return this.f17705d.j();
    }

    @Override // p.b
    public void m(View view) {
        this.f17705d.setCustomView(view);
        this.f17707f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p.b
    public void n(int i10) {
        o(this.f17704c.getString(i10));
    }

    @Override // p.b
    public void o(CharSequence charSequence) {
        this.f17705d.setSubtitle(charSequence);
    }

    @Override // p.b
    public void q(int i10) {
        r(this.f17704c.getString(i10));
    }

    @Override // p.b
    public void r(CharSequence charSequence) {
        this.f17705d.setTitle(charSequence);
    }

    @Override // p.b
    public void s(boolean z10) {
        super.s(z10);
        this.f17705d.setTitleOptional(z10);
    }
}
